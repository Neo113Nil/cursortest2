package d1;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class g implements c, i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4934a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f4935b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4936c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4937d;

    public g(M0.j jVar, C0.e eVar, k kVar) {
        this.f4934a = 0;
        this.f4935b = jVar;
        this.f4936c = eVar;
        this.f4937d = kVar;
    }

    @Override // d1.i
    public final void a(Task task) {
        switch (this.f4934a) {
            case 0:
                ((M0.j) this.f4935b).execute(new B.a(this, task, 5, false));
                return;
            case 1:
                synchronized (this.f4936c) {
                }
                this.f4935b.execute(new B.a(this, task, 6, false));
                return;
            default:
                if (task.c()) {
                    synchronized (this.f4936c) {
                        try {
                            if (((c) this.f4937d) != null) {
                                this.f4935b.execute(new B.a(this, task, 7, false));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // d1.c
    public void onSuccess(Object obj) {
        ((k) this.f4937d).e(obj);
    }

    public g(Executor executor, b bVar) {
        this.f4934a = 1;
        this.f4936c = new Object();
        this.f4935b = executor;
        this.f4937d = bVar;
    }

    public g(Executor executor, c cVar) {
        this.f4934a = 2;
        this.f4936c = new Object();
        this.f4935b = executor;
        this.f4937d = cVar;
    }
}
