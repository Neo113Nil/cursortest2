package com.swmansion.rnscreens;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.rnscreens.Screen;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenWindowTraits.kt */
@Metadata(d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ\r\u0010\u000e\u001a\u00020\fH\u0000¢\u0006\u0002\b\u000fJ\r\u0010\u0010\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0011J\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0002\b\u0017J)\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0000¢\u0006\u0002\b\u001bJ\u001f\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0002\b\u001dJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0002\b\u001fJ)\u0010 \u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0000¢\u0006\u0002\b!J\u001a\u0010\"\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$H\u0002J\u001a\u0010%\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$H\u0002J\u001c\u0010&\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010'\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006("}, d2 = {"Lcom/swmansion/rnscreens/ScreenWindowTraits;", "", "<init>", "()V", "didSetOrientation", "", "didSetStatusBarAppearance", "didSetNavigationBarAppearance", "windowInsetsListener", "com/swmansion/rnscreens/ScreenWindowTraits$windowInsetsListener$1", "Lcom/swmansion/rnscreens/ScreenWindowTraits$windowInsetsListener$1;", "applyDidSetOrientation", "", "applyDidSetOrientation$react_native_screens_release", "applyDidSetStatusBarAppearance", "applyDidSetStatusBarAppearance$react_native_screens_release", "applyDidSetNavigationBarAppearance", "applyDidSetNavigationBarAppearance$react_native_screens_release", "setOrientation", "screen", "Lcom/swmansion/rnscreens/Screen;", "activity", "Landroid/app/Activity;", "setOrientation$react_native_screens_release", "setStyle", "context", "Lcom/facebook/react/bridge/ReactContext;", "setStyle$react_native_screens_release", "setHidden", "setHidden$react_native_screens_release", "setNavigationBarHidden", "setNavigationBarHidden$react_native_screens_release", "trySetWindowTraits", "trySetWindowTraits$react_native_screens_release", "findScreenForTrait", "trait", "Lcom/swmansion/rnscreens/Screen$WindowTraits;", "findParentWithTraitSet", "childScreenWithTraitSet", "checkTraitForScreen", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScreenWindowTraits {
    private static boolean didSetNavigationBarAppearance;
    private static boolean didSetOrientation;
    private static boolean didSetStatusBarAppearance;
    public static final ScreenWindowTraits INSTANCE = new ScreenWindowTraits();
    private static ScreenWindowTraits$windowInsetsListener$1 windowInsetsListener = new OnApplyWindowInsetsListener() { // from class: com.swmansion.rnscreens.ScreenWindowTraits$windowInsetsListener$1
        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat insets) {
            Intrinsics.checkNotNullParameter(v, "v");
            Intrinsics.checkNotNullParameter(insets, "insets");
            WindowInsetsCompat onApplyWindowInsets = ViewCompat.onApplyWindowInsets(v, insets);
            Intrinsics.checkNotNullExpressionValue(onApplyWindowInsets, "onApplyWindowInsets(...)");
            if (Build.VERSION.SDK_INT >= 30) {
                Insets insets2 = onApplyWindowInsets.getInsets(WindowInsetsCompat.Type.statusBars());
                Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
                WindowInsetsCompat build = new WindowInsetsCompat.Builder().setInsets(WindowInsetsCompat.Type.statusBars(), Insets.of(insets2.left, 0, insets2.right, insets2.bottom)).build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                return build;
            }
            WindowInsetsCompat replaceSystemWindowInsets = onApplyWindowInsets.replaceSystemWindowInsets(onApplyWindowInsets.getSystemWindowInsetLeft(), 0, onApplyWindowInsets.getSystemWindowInsetRight(), onApplyWindowInsets.getSystemWindowInsetBottom());
            Intrinsics.checkNotNullExpressionValue(replaceSystemWindowInsets, "replaceSystemWindowInsets(...)");
            return replaceSystemWindowInsets;
        }
    };

    /* compiled from: ScreenWindowTraits.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Screen.WindowTraits.values().length];
            try {
                iArr[Screen.WindowTraits.ORIENTATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Screen.WindowTraits.STYLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Screen.WindowTraits.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Screen.WindowTraits.ANIMATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Screen.WindowTraits.NAVIGATION_BAR_HIDDEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ScreenWindowTraits() {
    }

    public final void applyDidSetOrientation$react_native_screens_release() {
        didSetOrientation = true;
    }

    public final void applyDidSetStatusBarAppearance$react_native_screens_release() {
        didSetStatusBarAppearance = true;
    }

    public final void applyDidSetNavigationBarAppearance$react_native_screens_release() {
        didSetNavigationBarAppearance = true;
    }

    public final void setOrientation$react_native_screens_release(Screen screen, Activity activity) {
        Integer screenOrientation;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null) {
            return;
        }
        Screen findScreenForTrait = findScreenForTrait(screen, Screen.WindowTraits.ORIENTATION);
        activity.setRequestedOrientation((findScreenForTrait == null || (screenOrientation = findScreenForTrait.getScreenOrientation()) == null) ? -1 : screenOrientation.intValue());
    }

    public final void setStyle$react_native_screens_release(Screen screen, final Activity activity, ReactContext context) {
        final String str;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null || context == null) {
            return;
        }
        Screen findScreenForTrait = findScreenForTrait(screen, Screen.WindowTraits.STYLE);
        if (findScreenForTrait == null || (str = findScreenForTrait.getStatusBarStyle()) == null) {
            str = "light";
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.ScreenWindowTraits$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ScreenWindowTraits.setStyle$lambda$0(activity, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setStyle$lambda$0(Activity activity, String str) {
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        new WindowInsetsControllerCompat(activity.getWindow(), decorView).setAppearanceLightStatusBars(Intrinsics.areEqual(str, "dark"));
    }

    public final void setHidden$react_native_screens_release(Screen screen, Activity activity) {
        Boolean isStatusBarHidden;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null) {
            return;
        }
        Screen findScreenForTrait = findScreenForTrait(screen, Screen.WindowTraits.HIDDEN);
        final boolean booleanValue = (findScreenForTrait == null || (isStatusBarHidden = findScreenForTrait.getIsStatusBarHidden()) == null) ? false : isStatusBarHidden.booleanValue();
        Window window = activity.getWindow();
        final WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.ScreenWindowTraits$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ScreenWindowTraits.setHidden$lambda$1(booleanValue, windowInsetsControllerCompat);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setHidden$lambda$1(boolean z, WindowInsetsControllerCompat windowInsetsControllerCompat) {
        if (z) {
            windowInsetsControllerCompat.hide(WindowInsetsCompat.Type.statusBars());
        } else {
            windowInsetsControllerCompat.show(WindowInsetsCompat.Type.statusBars());
        }
    }

    public final void setNavigationBarHidden$react_native_screens_release(Screen screen, Activity activity) {
        Boolean isNavigationBarHidden;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        Screen findScreenForTrait = findScreenForTrait(screen, Screen.WindowTraits.NAVIGATION_BAR_HIDDEN);
        if ((findScreenForTrait == null || (isNavigationBarHidden = findScreenForTrait.getIsNavigationBarHidden()) == null) ? false : isNavigationBarHidden.booleanValue()) {
            WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
            windowInsetsControllerCompat.hide(WindowInsetsCompat.Type.navigationBars());
            windowInsetsControllerCompat.setSystemBarsBehavior(2);
            return;
        }
        new WindowInsetsControllerCompat(window, window.getDecorView()).show(WindowInsetsCompat.Type.navigationBars());
    }

    public final void trySetWindowTraits$react_native_screens_release(Screen screen, Activity activity, ReactContext context) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (didSetOrientation) {
            setOrientation$react_native_screens_release(screen, activity);
        }
        if (didSetStatusBarAppearance) {
            setStyle$react_native_screens_release(screen, activity, context);
            setHidden$react_native_screens_release(screen, activity);
        }
        if (didSetNavigationBarAppearance) {
            setNavigationBarHidden$react_native_screens_release(screen, activity);
        }
    }

    private final Screen findScreenForTrait(Screen screen, Screen.WindowTraits trait) {
        Screen childScreenWithTraitSet = childScreenWithTraitSet(screen, trait);
        return childScreenWithTraitSet != null ? childScreenWithTraitSet : checkTraitForScreen(screen, trait) ? screen : findParentWithTraitSet(screen, trait);
    }

    private final Screen findParentWithTraitSet(Screen screen, Screen.WindowTraits trait) {
        for (ViewParent container = screen.getContainer(); container != null; container = container.getParent()) {
            if (container instanceof Screen) {
                Screen screen2 = (Screen) container;
                if (checkTraitForScreen(screen2, trait)) {
                    return screen2;
                }
            }
        }
        return null;
    }

    private final Screen childScreenWithTraitSet(Screen screen, Screen.WindowTraits trait) {
        ScreenFragmentWrapper fragmentWrapper;
        if (screen == null || (fragmentWrapper = screen.getFragmentWrapper()) == null) {
            return null;
        }
        Iterator<ScreenContainer> it = fragmentWrapper.getChildScreenContainers().iterator();
        while (it.hasNext()) {
            Screen topScreen = it.next().getTopScreen();
            ScreenWindowTraits screenWindowTraits = INSTANCE;
            Screen childScreenWithTraitSet = screenWindowTraits.childScreenWithTraitSet(topScreen, trait);
            if (childScreenWithTraitSet != null) {
                return childScreenWithTraitSet;
            }
            if (topScreen != null && screenWindowTraits.checkTraitForScreen(topScreen, trait)) {
                return topScreen;
            }
        }
        return null;
    }

    private final boolean checkTraitForScreen(Screen screen, Screen.WindowTraits trait) {
        int i = WhenMappings.$EnumSwitchMapping$0[trait.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (screen.getIsNavigationBarHidden() == null) {
                            return false;
                        }
                    } else if (screen.getIsStatusBarAnimated() == null) {
                        return false;
                    }
                } else if (screen.getIsStatusBarHidden() == null) {
                    return false;
                }
            } else if (screen.getStatusBarStyle() == null) {
                return false;
            }
        } else if (screen.getScreenOrientation() == null) {
            return false;
        }
        return true;
    }
}
