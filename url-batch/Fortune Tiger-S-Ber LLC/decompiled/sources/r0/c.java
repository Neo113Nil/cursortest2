package r0;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import f.k;
import java.util.Random;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3141a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3142b;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j4) {
        switch (this.f3141a) {
            case 0:
                ((Runnable) this.f3142b).run();
                break;
            default:
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new k((Context) this.f3142b, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
        }
    }
}
