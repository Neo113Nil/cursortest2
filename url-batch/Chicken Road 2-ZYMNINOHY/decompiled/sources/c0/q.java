package c0;

import T.e0;
import a0.C0137c;
import a0.SurfaceHolderCallbackC0125A;
import android.os.Handler;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f5600a;

    /* renamed from: b, reason: collision with root package name */
    public final SurfaceHolderCallbackC0125A f5601b;

    public q(Handler handler, SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A, int i4) {
        switch (i4) {
            case 1:
                if (surfaceHolderCallbackC0125A != null) {
                    handler.getClass();
                } else {
                    handler = null;
                }
                this.f5600a = handler;
                this.f5601b = surfaceHolderCallbackC0125A;
                break;
            default:
                this.f5600a = handler;
                this.f5601b = surfaceHolderCallbackC0125A;
                break;
        }
    }

    public void a(C0137c c0137c) {
        synchronized (c0137c) {
        }
        Handler handler = this.f5600a;
        if (handler != null) {
            handler.post(new R1.e(this, 18, c0137c));
        }
    }

    public void b(e0 e0Var) {
        Handler handler = this.f5600a;
        if (handler != null) {
            handler.post(new g0.p(this, 16, e0Var));
        }
    }
}
