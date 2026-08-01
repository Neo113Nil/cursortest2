package e1;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1371a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1372b;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        switch (this.f1371a) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new h((Context) this.f1372b, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            default:
                ((Runnable) this.f1372b).run();
                break;
        }
    }

    public /* synthetic */ g(Runnable runnable) {
        this.f1372b = runnable;
    }
}
