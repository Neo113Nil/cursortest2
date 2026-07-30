package K1;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j implements l, e, d, c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1431d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f1432e;

    /* renamed from: i, reason: collision with root package name */
    public final a f1433i;

    /* renamed from: l, reason: collision with root package name */
    public final p f1434l;

    public /* synthetic */ j(Executor executor, a aVar, p pVar, int i2) {
        this.f1431d = i2;
        this.f1432e = executor;
        this.f1433i = aVar;
        this.f1434l = pVar;
    }

    @Override // K1.l
    public final void a(Task task) {
        switch (this.f1431d) {
            case 0:
                this.f1432e.execute(new F.a(7, this, task, false));
                break;
            default:
                this.f1432e.execute(new F.a(8, this, task, false));
                break;
        }
    }

    @Override // K1.c
    public void i() {
        this.f1434l.n();
    }

    @Override // K1.e
    public void k(Object obj) {
        this.f1434l.l(obj);
    }

    @Override // K1.d
    public void s(Exception exc) {
        this.f1434l.m(exc);
    }
}
