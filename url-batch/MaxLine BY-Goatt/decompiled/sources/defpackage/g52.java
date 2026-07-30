package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class g52 implements Choreographer.FrameCallback {
    public final /* synthetic */ int m = 0;
    public final /* synthetic */ Object n;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? km.c(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new ze((Context) obj, 2), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
