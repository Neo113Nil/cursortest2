package com.unity3d.player.a;

import android.app.Activity;
import android.content.Context;
import com.unity3d.player.C0133a0;
import com.unity3d.player.P0;
import com.unity3d.player.UnityPlayer;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class Z {
    public final UnityPlayer a;
    public C0133a0 c;
    public Context b = null;
    public final Semaphore d = new Semaphore(0);
    public final ReentrantLock e = new ReentrantLock();
    public P0 f = null;
    public int g = 2;
    public boolean h = false;
    public boolean i = false;

    public Z(UnityPlayer unityPlayer) {
        this.a = null;
        this.a = unityPlayer;
    }

    public void runOnUiThread(Runnable runnable) {
        Context context = this.b;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            AbstractC0126t.Log(5, "Not running from an Activity; Ignoring execution request...");
        }
    }
}
