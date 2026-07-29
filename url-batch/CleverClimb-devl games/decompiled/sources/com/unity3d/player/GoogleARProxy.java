package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.util.Log;
import com.youappi.sdk.net.model.VideoEvent;

/* loaded from: classes2.dex */
class GoogleARProxy extends b {
    private boolean f;

    GoogleARProxy(d dVar) {
        super("Google AR", dVar);
        this.f = false;
    }

    public static boolean a() {
        try {
            Class<?> loadClass = UnityPlayer.class.getClassLoader().loadClass("com.unity3d.unitygar.GoogleAR");
            m mVar = new m(loadClass, loadClass.getConstructor(new Class[0]).newInstance(new Object[0]));
            mVar.a("getClassVersion", new Class[0]);
            if (((Number) mVar.a("getClassVersion", new Object[0])).intValue() > 0) {
                Log.d("Unity", "Loading ARCore V1+ path.");
                return false;
            }
            Log.d("Unity", "Loading ARCore Preview path (Version <= 1).");
            return true;
        } catch (Exception unused) {
            Log.d("Unity", "Loading ARCore Preview path.");
            return true;
        }
    }

    private boolean a(ClassLoader classLoader) {
        if (this.f) {
            return true;
        }
        try {
            Class<?> loadClass = classLoader.loadClass("com.unity3d.unitygar.GoogleAR");
            m mVar = new m(loadClass, loadClass.getConstructor(new Class[0]).newInstance(new Object[0]));
            mVar.a("initialize", new Class[]{Activity.class});
            mVar.a("create", new Class[0]);
            mVar.a(VideoEvent.EVENT_PAUSE, new Class[0]);
            mVar.a(VideoEvent.EVENT_RESUME, new Class[0]);
            this.f9351a = mVar;
            this.f = true;
            return true;
        } catch (Exception e) {
            this.f9352b.reportError("Google AR Error", e.toString() + e.getLocalizedMessage());
            return false;
        }
    }

    private final native void tangoOnCreate(Activity activity);

    private final native void tangoOnServiceConnected(IBinder iBinder);

    private final native void tangoOnStop();

    final void a(final Activity activity, Context context) {
        if (a(UnityPlayer.class.getClassLoader())) {
            this.f9353c = context;
            runOnUiThread(new Runnable() { // from class: com.unity3d.player.GoogleARProxy.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (GoogleARProxy.this.f9351a != null) {
                            GoogleARProxy.this.f9351a.a("initialize", activity);
                        }
                    } catch (Exception e) {
                        GoogleARProxy.this.reportError("Exception creating " + GoogleARProxy.this.e + " VR on UI Thread. " + e.getLocalizedMessage());
                    }
                }
            });
        }
    }

    final void b() {
        runOnUiThread(new Runnable() { // from class: com.unity3d.player.GoogleARProxy.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (GoogleARProxy.this.f9351a != null) {
                        GoogleARProxy.this.f9351a.a("create", new Object[0]);
                    }
                } catch (Exception e) {
                    GoogleARProxy.this.reportError("Exception creating " + GoogleARProxy.this.e + " VR on UI Thread. " + e.getLocalizedMessage());
                }
            }
        });
    }

    final void c() {
        runOnUiThread(new Runnable() { // from class: com.unity3d.player.GoogleARProxy.3
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (GoogleARProxy.this.f9351a != null) {
                        GoogleARProxy.this.f9351a.a(VideoEvent.EVENT_PAUSE, new Object[0]);
                    }
                } catch (Exception e) {
                    GoogleARProxy.this.reportError("Exception pausing " + GoogleARProxy.this.e + " VR on UI Thread. " + e.getLocalizedMessage());
                }
            }
        });
    }

    final void d() {
        runOnUiThread(new Runnable() { // from class: com.unity3d.player.GoogleARProxy.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (GoogleARProxy.this.f9351a != null) {
                        GoogleARProxy.this.f9351a.a(VideoEvent.EVENT_RESUME, new Object[0]);
                    }
                } catch (Exception e) {
                    GoogleARProxy.this.reportError("Exception resuming " + GoogleARProxy.this.e + " VR on UI Thread. " + e.getLocalizedMessage());
                }
            }
        });
    }

    public final boolean e() {
        return this.f;
    }
}
