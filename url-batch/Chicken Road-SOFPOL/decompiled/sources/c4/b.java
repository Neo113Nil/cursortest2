package c4;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1613d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1614e;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        switch (this.f1613d) {
            case 0:
                ((Runnable) this.f1614e).run();
                break;
            default:
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new u4.f((Context) this.f1614e, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
        }
    }
}
