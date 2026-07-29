package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
class b {

    /* renamed from: b, reason: collision with root package name */
    protected d f9352b;
    protected String e;

    /* renamed from: a, reason: collision with root package name */
    protected m f9351a = null;

    /* renamed from: c, reason: collision with root package name */
    protected Context f9353c = null;

    /* renamed from: d, reason: collision with root package name */
    protected String f9354d = null;

    b(String str, d dVar) {
        this.f9352b = null;
        this.e = "";
        this.e = str;
        this.f9352b = dVar;
    }

    protected void reportError(String str) {
        if (this.f9352b != null) {
            this.f9352b.reportError(this.e + " Error [" + this.f9354d + "]", str);
            return;
        }
        e.Log(6, this.e + " Error [" + this.f9354d + "]: " + str);
    }

    protected void runOnUiThread(Runnable runnable) {
        if (this.f9353c instanceof Activity) {
            ((Activity) this.f9353c).runOnUiThread(runnable);
            return;
        }
        e.Log(5, "Not running " + this.e + " from an Activity; Ignoring execution request...");
    }

    protected boolean runOnUiThreadWithSync(final Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
            return true;
        }
        final Semaphore semaphore = new Semaphore(0);
        runOnUiThread(new Runnable() { // from class: com.unity3d.player.b.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    try {
                        runnable.run();
                    } catch (Exception e) {
                        b.this.reportError("Exception unloading Google VR on UI Thread. " + e.getLocalizedMessage());
                    }
                } finally {
                    semaphore.release();
                }
            }
        });
        try {
            if (semaphore.tryAcquire(4L, TimeUnit.SECONDS)) {
                return true;
            }
            reportError("Timeout waiting for vr state change!");
            return false;
        } catch (InterruptedException e) {
            reportError("Interrupted while trying to acquire sync lock. " + e.getLocalizedMessage());
            return false;
        }
    }
}
