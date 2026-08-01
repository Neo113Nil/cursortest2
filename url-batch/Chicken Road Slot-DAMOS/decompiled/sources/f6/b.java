package f6;

import a1.n;
import a4.j;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.z5;
import f8.v0;
import java.util.concurrent.Executor;
import s7.o1;
import s7.q1;
import s7.q2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4109d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4110e;

    public b() {
        this.f4109d = 4;
        z5 z5Var = new z5(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f4110e = z5Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f4109d) {
            case 0:
                ((Handler) ((n) this.f4110e).f40e).post(runnable);
                break;
            case 1:
                ((z5) this.f4110e).post(runnable);
                break;
            case 2:
                ((Executor) this.f4110e).execute(new v0(runnable, 2));
                break;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                o1 o1Var = ((q1) ((q2) this.f4110e).f1478d).f8938u;
                q1.l(o1Var);
                o1Var.B(runnable);
                break;
            default:
                ((z5) this.f4110e).post(runnable);
                break;
        }
    }

    public /* synthetic */ b(int i3, Object obj) {
        this.f4109d = i3;
        this.f4110e = obj;
    }

    public b(Looper looper) {
        this.f4109d = 1;
        this.f4110e = new z5(looper, 3);
    }
}
