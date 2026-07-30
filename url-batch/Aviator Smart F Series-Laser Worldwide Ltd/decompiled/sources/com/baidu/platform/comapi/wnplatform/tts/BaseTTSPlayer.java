package com.baidu.platform.comapi.wnplatform.tts;

import android.content.Context;
import android.media.AudioManager;
import com.baidu.mapapi.tts.WNTTSManager;
import com.baidu.mapapi.tts.WNTTsInitConfig;
import com.baidu.navisdk.tts.BNTTS;
import com.baidu.navisdk.tts.BNTTSPlayer;
import com.baidu.navisdk.tts.ITTSInitListener;
import com.baidu.navisdk.tts.OnTTSStateChangedListener;
import com.baidu.platform.comjni.jninative.tts.WNaviTTSPlayer;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class BaseTTSPlayer extends com.baidu.platform.comapi.walknavi.a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f10534a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Context f10535b = null;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f10536c = false;

    /* renamed from: d, reason: collision with root package name */
    public static AudioManager.OnAudioFocusChangeListener f10537d = new AudioManager.OnAudioFocusChangeListener() { // from class: com.baidu.platform.comapi.wnplatform.tts.BaseTTSPlayer.3
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i8) {
            if (i8 == -2 || i8 == -1) {
                BaseTTSPlayer.b();
            }
        }
    };

    public static void a(WNTTsInitConfig wNTTsInitConfig, WNTTSManager.IWNOuterTTSPlayerCallback iWNOuterTTSPlayerCallback) {
        if (iWNOuterTTSPlayerCallback != null) {
            f10534a = true;
            WNaviTTSPlayer.addOutTTSPlayerListener(iWNOuterTTSPlayerCallback);
        } else {
            if (wNTTsInitConfig == null) {
                return;
            }
            try {
                f10534a = false;
                BNTTS.init(wNTTsInitConfig.context, wNTTsInitConfig.appKey, wNTTsInitConfig.secretKey, wNTTsInitConfig.authsn, new ITTSInitListener() { // from class: com.baidu.platform.comapi.wnplatform.tts.BaseTTSPlayer.1
                    public void onFail(int i8) {
                    }

                    public void onSuccess() {
                    }
                });
            } catch (Exception e8) {
                e8.getMessage();
            }
        }
    }

    public static boolean b() {
        Context context = f10535b;
        if (context == null || !f10536c) {
            return false;
        }
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return true;
            }
            audioManager.abandonAudioFocus(f10537d);
            f10536c = false;
            return true;
        } catch (Exception e8) {
            e8.getMessage();
            return true;
        }
    }

    public static boolean c() {
        Context context = f10535b;
        if (context == null) {
            return false;
        }
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null && audioManager.requestAudioFocus(f10537d, 3, 3) == 1) {
                f10536c = true;
                return true;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return false;
    }

    public abstract void a(b bVar);

    public static void a(final WNTTSManager.IOnTTSPlayStateChangedListener iOnTTSPlayStateChangedListener) {
        if (iOnTTSPlayStateChangedListener == null) {
            return;
        }
        try {
            if (f10534a) {
                return;
            }
            BNTTS.setOnTTSStateChangedListener(new OnTTSStateChangedListener() { // from class: com.baidu.platform.comapi.wnplatform.tts.BaseTTSPlayer.2
                public void onPlayEnd(String str) {
                    WNTTSManager.IOnTTSPlayStateChangedListener.this.onPlayEnd(str);
                    BaseTTSPlayer.b();
                }

                public void onPlayError(int i8, String str) {
                    WNTTSManager.IOnTTSPlayStateChangedListener.this.onPlayError(i8, str);
                }

                public void onPlayStart() {
                    WNTTSManager.IOnTTSPlayStateChangedListener.this.onPlayStart();
                }
            });
        } catch (Exception e8) {
            e8.getMessage();
        }
    }

    public static void a(WNTTSManager.IWNOuterTTSPlayerCallback iWNOuterTTSPlayerCallback) {
        WNaviTTSPlayer.removeOutTTSPlayerListener(iWNOuterTTSPlayerCallback);
    }

    public static int a(String str, boolean z7) {
        try {
        } catch (Throwable th) {
            th.getMessage();
        }
        if (com.baidu.platform.comapi.h.c.b().g()) {
            return 0;
        }
        c();
        Class<?> cls = Class.forName("com.baidu.navisdk.tts.BNTTSPlayer");
        BNTTSPlayer bNTTSPlayer = BNTTSPlayer.getInstance();
        if (bNTTSPlayer != null) {
            Method declaredMethod = cls.getDeclaredMethod("playTTSText", String.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(bNTTSPlayer, str, Boolean.valueOf(z7))).intValue();
        }
        return 0;
    }
}
