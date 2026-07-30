package com.unity3d.player.a;

import android.app.Activity;
import android.content.Context;
import android.view.PixelCopy;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class A implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ Semaphore a;
    public final /* synthetic */ B b;

    public A(B b, Semaphore semaphore) {
        this.b = b;
        this.a = semaphore;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        this.a.release();
        if (i == 0) {
            Context context = this.b.b.a;
            if (context instanceof Activity) {
                ((Activity) context).runOnUiThread(new z(this));
            }
        }
    }
}
