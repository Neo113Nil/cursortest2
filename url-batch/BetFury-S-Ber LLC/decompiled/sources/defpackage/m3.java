package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class m3 implements Choreographer.FrameCallback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Runnable) obj).run();
                break;
            default:
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new b4((Context) obj, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
        }
    }

    public /* synthetic */ m3(Runnable runnable) {
        this.b = runnable;
    }
}
