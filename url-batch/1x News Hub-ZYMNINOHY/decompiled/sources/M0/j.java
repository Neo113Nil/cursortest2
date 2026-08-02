package M0;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f925a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f926b;

    public /* synthetic */ j(int i3, Object obj) {
        this.f925a = i3;
        this.f926b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f925a) {
            case 0:
                ((W0.e) this.f926b).post(runnable);
                break;
            case 1:
                ((W0.e) this.f926b).post(runnable);
                break;
            default:
                ((ExecutorService) this.f926b).execute(new B.b(19, runnable));
                break;
        }
    }

    public j() {
        this.f925a = 1;
        W0.e eVar = new W0.e(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f926b = eVar;
    }
}
