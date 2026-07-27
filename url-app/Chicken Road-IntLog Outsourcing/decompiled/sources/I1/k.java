package I1;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k implements m, e, d, b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1252a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f1253b;

    /* renamed from: c, reason: collision with root package name */
    public final a f1254c;

    /* renamed from: d, reason: collision with root package name */
    public final o f1255d;

    public /* synthetic */ k(Executor executor, a aVar, o oVar, int i2) {
        this.f1252a = i2;
        this.f1253b = executor;
        this.f1254c = aVar;
        this.f1255d = oVar;
    }

    @Override // I1.b
    public void a() {
        this.f1255d.l();
    }

    @Override // I1.m
    public final void b(Task task) {
        switch (this.f1252a) {
            case 0:
                this.f1253b.execute(new A0.a(this, 18, task));
                break;
            default:
                this.f1253b.execute(new A0.a(this, 19, task));
                break;
        }
    }

    @Override // I1.d
    public void c(Exception exc) {
        this.f1255d.j(exc);
    }

    @Override // I1.e
    public void onSuccess(Object obj) {
        this.f1255d.k(obj);
    }
}
