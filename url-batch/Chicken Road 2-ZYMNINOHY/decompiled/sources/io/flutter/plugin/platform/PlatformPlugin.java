package io.flutter.plugin.platform;

import E.f0;
import E.g0;
import E.h0;
import E.i0;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.Window;
import b.InterfaceC0239B;
import i2.AbstractC0457a;
import io.appmetrica.analytics.impl.Yo;
import io.flutter.Log;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import io.flutter.plugin.platform.PlatformPlugin;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public class PlatformPlugin {
    public static final int DEFAULT_SYSTEM_UI = 1280;
    private static final String TAG = "PlatformPlugin";
    private final Activity activity;
    private PlatformChannel.SystemChromeStyle currentTheme;
    private boolean isEdgeToEdge;
    private int mEnabledOverlays;
    final PlatformChannel.PlatformMessageHandler mPlatformMessageHandler;
    private final PlatformChannel platformChannel;
    private final PlatformPluginDelegate platformPluginDelegate;

    /* renamed from: io.flutter.plugin.platform.PlatformPlugin$2, reason: invalid class name */
    public class AnonymousClass2 implements View.OnSystemUiVisibilityChangeListener {
        final /* synthetic */ View val$decorView;

        public AnonymousClass2(View view) {
            this.val$decorView = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSystemUiVisibilityChange$0(int i4) {
            if ((i4 & 4) == 0) {
                PlatformPlugin.this.platformChannel.systemChromeChanged(true);
            } else {
                PlatformPlugin.this.platformChannel.systemChromeChanged(false);
            }
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(final int i4) {
            this.val$decorView.post(new Runnable() { // from class: io.flutter.plugin.platform.a
                @Override // java.lang.Runnable
                public final void run() {
                    PlatformPlugin.AnonymousClass2.this.lambda$onSystemUiVisibilityChange$0(i4);
                }
            });
        }
    }

    /* renamed from: io.flutter.plugin.platform.PlatformPlugin$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness;
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType;
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay;

        static {
            int[] iArr = new int[PlatformChannel.Brightness.values().length];
            $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness = iArr;
            try {
                iArr[PlatformChannel.Brightness.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness[PlatformChannel.Brightness.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[PlatformChannel.SystemUiOverlay.values().length];
            $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay = iArr2;
            try {
                iArr2[PlatformChannel.SystemUiOverlay.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay[PlatformChannel.SystemUiOverlay.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[PlatformChannel.HapticFeedbackType.values().length];
            $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType = iArr3;
            try {
                iArr3[PlatformChannel.HapticFeedbackType.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType[PlatformChannel.HapticFeedbackType.LIGHT_IMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType[PlatformChannel.HapticFeedbackType.MEDIUM_IMPACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType[PlatformChannel.HapticFeedbackType.HEAVY_IMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType[PlatformChannel.HapticFeedbackType.SELECTION_CLICK.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType[PlatformChannel.HapticFeedbackType.SUCCESS_NOTIFICATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType[PlatformChannel.HapticFeedbackType.WARNING_NOTIFICATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType[PlatformChannel.HapticFeedbackType.ERROR_NOTIFICATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public interface PlatformPluginDelegate {
        boolean popSystemNavigator();

        default void setFrameworkHandlesBack(boolean z) {
        }
    }

    public PlatformPlugin(Activity activity, PlatformChannel platformChannel) {
        this(activity, platformChannel, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean clipboardHasStrings() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.activity.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    private void disableEdgeToEdge() {
        if (this.isEdgeToEdge) {
            this.isEdgeToEdge = false;
            AbstractC0457a.A(this.activity.getWindow(), true);
        }
    }

    private void enableEdgeToEdge() {
        AbstractC0457a.A(this.activity.getWindow(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CharSequence getClipboardData(PlatformChannel.ClipboardContentFormat clipboardContentFormat) {
        ClipboardManager clipboardManager = (ClipboardManager) this.activity.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (clipboardContentFormat != null && clipboardContentFormat != PlatformChannel.ClipboardContentFormat.PLAIN_TEXT) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt.getText();
                if (text != null) {
                    return text;
                }
                try {
                    Uri uri = itemAt.getUri();
                    if (uri == null) {
                        Log.w(TAG, "Clipboard item contained no textual content nor a URI to retrieve it from.");
                        return null;
                    }
                    String scheme = uri.getScheme();
                    if (!scheme.equals("content")) {
                        Log.w(TAG, "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                        return null;
                    }
                    AssetFileDescriptor openTypedAssetFileDescriptor = this.activity.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                    CharSequence coerceToText = itemAt.coerceToText(this.activity);
                    if (openTypedAssetFileDescriptor == null) {
                        return coerceToText;
                    }
                    try {
                        openTypedAssetFileDescriptor.close();
                        return coerceToText;
                    } catch (IOException e4) {
                        charSequence = coerceToText;
                        e = e4;
                        Log.w(TAG, "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                        return charSequence;
                    }
                } catch (IOException e5) {
                    e = e5;
                    charSequence = text;
                }
            } catch (IOException e6) {
                e = e6;
            }
        } catch (FileNotFoundException unused) {
            Log.w(TAG, "Clipboard text was unable to be received from content URI.");
            return null;
        } catch (SecurityException e7) {
            Log.w(TAG, "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e7);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playSystemSound(PlatformChannel.SoundType soundType) {
        if (soundType == PlatformChannel.SoundType.CLICK) {
            this.activity.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void popSystemNavigator() {
        PlatformPluginDelegate platformPluginDelegate = this.platformPluginDelegate;
        if (platformPluginDelegate == null || !platformPluginDelegate.popSystemNavigator()) {
            Activity activity = this.activity;
            if (activity instanceof InterfaceC0239B) {
                ((InterfaceC0239B) activity).getOnBackPressedDispatcher().c();
            } else {
                activity.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restoreSystemChromeSystemUIOverlays() {
        updateSystemUiOverlays();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClipboardData(String str) {
        ((ClipboardManager) this.activity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrameworkHandlesBack(boolean z) {
        PlatformPluginDelegate platformPluginDelegate = this.platformPluginDelegate;
        if (platformPluginDelegate != null) {
            platformPluginDelegate.setFrameworkHandlesBack(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemChromeApplicationSwitcherDescription(PlatformChannel.AppSwitcherDescription appSwitcherDescription) {
        if (Build.VERSION.SDK_INT < 28) {
            this.activity.setTaskDescription(new ActivityManager.TaskDescription(appSwitcherDescription.label, (Bitmap) null, appSwitcherDescription.color));
            return;
        }
        this.activity.setTaskDescription(Yo.d(appSwitcherDescription.color, appSwitcherDescription.label));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemChromeChangeListener() {
        View decorView = this.activity.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new AnonymousClass2(decorView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemChromeEnabledSystemUIMode(PlatformChannel.SystemUiMode systemUiMode) {
        int i4;
        PlatformChannel.SystemUiMode systemUiMode2 = PlatformChannel.SystemUiMode.EDGE_TO_EDGE;
        if (systemUiMode != systemUiMode2) {
            disableEdgeToEdge();
        }
        if (systemUiMode == PlatformChannel.SystemUiMode.LEAN_BACK) {
            i4 = 1798;
        } else if (systemUiMode == PlatformChannel.SystemUiMode.IMMERSIVE) {
            i4 = 3846;
        } else {
            if (systemUiMode != PlatformChannel.SystemUiMode.IMMERSIVE_STICKY) {
                if (systemUiMode != systemUiMode2 || Build.VERSION.SDK_INT < 29) {
                    return;
                }
                this.isEdgeToEdge = true;
                enableEdgeToEdge();
                PlatformChannel.SystemChromeStyle systemChromeStyle = this.currentTheme;
                if (systemChromeStyle != null) {
                    setSystemChromeSystemUIOverlayStyle(systemChromeStyle);
                    return;
                }
                return;
            }
            i4 = 5894;
        }
        this.mEnabledOverlays = i4;
        updateSystemUiOverlays();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemChromeEnabledSystemUIOverlays(List<PlatformChannel.SystemUiOverlay> list) {
        disableEdgeToEdge();
        int i4 = list.isEmpty() ? 5894 : 1798;
        for (int i5 = 0; i5 < list.size(); i5++) {
            int i6 = AnonymousClass3.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay[list.get(i5).ordinal()];
            if (i6 == 1) {
                i4 &= -5;
            } else if (i6 == 2) {
                i4 &= -515;
            }
        }
        this.mEnabledOverlays = i4;
        updateSystemUiOverlays();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemChromePreferredOrientations(int i4) {
        this.activity.setRequestedOrientation(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public void setSystemChromeSystemUIOverlayStyle(PlatformChannel.SystemChromeStyle systemChromeStyle) {
        Window window = this.activity.getWindow();
        window.getDecorView();
        int i4 = Build.VERSION.SDK_INT;
        O3.d i0Var = i4 >= 35 ? new i0(window) : i4 >= 30 ? new h0(window) : i4 >= 26 ? new g0(window) : new f0(window);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        PlatformChannel.Brightness brightness = systemChromeStyle.statusBarIconBrightness;
        if (brightness != null) {
            int i6 = AnonymousClass3.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness[brightness.ordinal()];
            if (i6 == 1) {
                i0Var.B(true);
            } else if (i6 == 2) {
                i0Var.B(false);
            }
        }
        Integer num = systemChromeStyle.statusBarColor;
        if (num != null && i5 < 35) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = systemChromeStyle.systemStatusBarContrastEnforced;
        if (bool != null && i5 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i5 >= 26) {
            PlatformChannel.Brightness brightness2 = systemChromeStyle.systemNavigationBarIconBrightness;
            if (brightness2 != null) {
                int i7 = AnonymousClass3.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness[brightness2.ordinal()];
                if (i7 == 1) {
                    i0Var.A(true);
                } else if (i7 == 2) {
                    i0Var.A(false);
                }
            }
            Integer num2 = systemChromeStyle.systemNavigationBarColor;
            if (num2 != null && i5 < 35) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = systemChromeStyle.systemNavigationBarDividerColor;
        if (num3 != null && i5 >= 28 && i5 < 35) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = systemChromeStyle.systemNavigationBarContrastEnforced;
        if (bool2 != null && i5 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.currentTheme = systemChromeStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void share(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        this.activity.startActivity(Intent.createChooser(intent, null));
    }

    public void destroy() {
        this.platformChannel.setPlatformMessageHandler(null);
    }

    public void updateSystemUiOverlays() {
        if (this.isEdgeToEdge) {
            enableEdgeToEdge();
        } else {
            this.activity.getWindow().getDecorView().setSystemUiVisibility(this.mEnabledOverlays);
        }
        PlatformChannel.SystemChromeStyle systemChromeStyle = this.currentTheme;
        if (systemChromeStyle != null) {
            setSystemChromeSystemUIOverlayStyle(systemChromeStyle);
        }
    }

    public void vibrateHapticFeedback(PlatformChannel.HapticFeedbackType hapticFeedbackType) {
        View decorView = this.activity.getWindow().getDecorView();
        switch (AnonymousClass3.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType[hapticFeedbackType.ordinal()]) {
            case 1:
                decorView.performHapticFeedback(0);
                break;
            case 2:
                decorView.performHapticFeedback(1);
                break;
            case 3:
                decorView.performHapticFeedback(3);
                break;
            case 4:
                decorView.performHapticFeedback(6);
                break;
            case 5:
                decorView.performHapticFeedback(4);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(16);
                    break;
                }
                break;
            case 7:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(3);
                    break;
                }
                break;
            case 8:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(17);
                    break;
                }
                break;
        }
    }

    public PlatformPlugin(Activity activity, PlatformChannel platformChannel, PlatformPluginDelegate platformPluginDelegate) {
        this.isEdgeToEdge = false;
        PlatformChannel.PlatformMessageHandler platformMessageHandler = new PlatformChannel.PlatformMessageHandler() { // from class: io.flutter.plugin.platform.PlatformPlugin.1
            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public boolean clipboardHasStrings() {
                return PlatformPlugin.this.clipboardHasStrings();
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public CharSequence getClipboardData(PlatformChannel.ClipboardContentFormat clipboardContentFormat) {
                return PlatformPlugin.this.getClipboardData(clipboardContentFormat);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void playSystemSound(PlatformChannel.SoundType soundType) {
                PlatformPlugin.this.playSystemSound(soundType);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void popSystemNavigator() {
                PlatformPlugin.this.popSystemNavigator();
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void restoreSystemUiOverlays() {
                PlatformPlugin.this.restoreSystemChromeSystemUIOverlays();
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void setApplicationSwitcherDescription(PlatformChannel.AppSwitcherDescription appSwitcherDescription) {
                PlatformPlugin.this.setSystemChromeApplicationSwitcherDescription(appSwitcherDescription);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void setClipboardData(String str) {
                PlatformPlugin.this.setClipboardData(str);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void setFrameworkHandlesBack(boolean z) {
                PlatformPlugin.this.setFrameworkHandlesBack(z);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void setPreferredOrientations(int i4) {
                PlatformPlugin.this.setSystemChromePreferredOrientations(i4);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void setSystemUiChangeListener() {
                PlatformPlugin.this.setSystemChromeChangeListener();
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void setSystemUiOverlayStyle(PlatformChannel.SystemChromeStyle systemChromeStyle) {
                PlatformPlugin.this.setSystemChromeSystemUIOverlayStyle(systemChromeStyle);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void share(String str) {
                PlatformPlugin.this.share(str);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void showSystemOverlays(List<PlatformChannel.SystemUiOverlay> list) {
                PlatformPlugin.this.setSystemChromeEnabledSystemUIOverlays(list);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void showSystemUiMode(PlatformChannel.SystemUiMode systemUiMode) {
                PlatformPlugin.this.setSystemChromeEnabledSystemUIMode(systemUiMode);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void vibrateHapticFeedback(PlatformChannel.HapticFeedbackType hapticFeedbackType) {
                PlatformPlugin.this.vibrateHapticFeedback(hapticFeedbackType);
            }
        };
        this.mPlatformMessageHandler = platformMessageHandler;
        this.activity = activity;
        this.platformChannel = platformChannel;
        platformChannel.setPlatformMessageHandler(platformMessageHandler);
        this.platformPluginDelegate = platformPluginDelegate;
        this.mEnabledOverlays = DEFAULT_SYSTEM_UI;
    }
}
