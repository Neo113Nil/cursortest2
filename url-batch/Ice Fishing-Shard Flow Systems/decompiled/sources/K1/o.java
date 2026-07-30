package K1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1445d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1446e;

    public /* synthetic */ o(int i2, Object obj) {
        this.f1445d = i2;
        this.f1446e = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1445d) {
            case 0:
                ((C1.e) this.f1446e).post(runnable);
                break;
            case 1:
                ((Handler) ((D0.j) this.f1446e).f331i).post(runnable);
                break;
            default:
                ((Executor) this.f1446e).execute(new T1.i(runnable, 1));
                break;
        }
    }

    public o() {
        this.f1445d = 0;
        C1.e eVar = new C1.e(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f1446e = eVar;
    }
}
