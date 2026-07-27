package C0;

import androidx.work.impl.WorkDatabase;
import io.appmetrica.analytics.impl.C1069w0;
import io.appmetrica.analytics.impl.U;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f338b;

    public /* synthetic */ g(int i2, Object obj) {
        this.f337a = i2;
        this.f338b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f337a) {
            case 0:
                WorkDatabase workDatabase = (WorkDatabase) ((B1.g) this.f338b).f215b;
                Long l2 = workDatabase.l().l("next_alarm_manager_id");
                int longValue = l2 != null ? (int) l2.longValue() : 0;
                workDatabase.l().m(new B0.d("next_alarm_manager_id", Long.valueOf(longValue != Integer.MAX_VALUE ? longValue + 1 : 0)));
                return Integer.valueOf(longValue);
            case 1:
                return U.e((U) this.f338b);
            default:
                return ((C1069w0) this.f338b).p();
        }
    }
}
