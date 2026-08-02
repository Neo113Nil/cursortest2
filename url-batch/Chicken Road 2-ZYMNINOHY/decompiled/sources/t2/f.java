package t2;

import com.google.android.gms.tasks.Task;
import e0.t;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f implements b, h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15410a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f15411b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15412c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15413d;

    public f(Executor executor, t tVar, j jVar) {
        this.f15410a = 0;
        this.f15411b = executor;
        this.f15412c = tVar;
        this.f15413d = jVar;
    }

    @Override // t2.h
    public final void a(Task task) {
        switch (this.f15410a) {
            case 0:
                this.f15411b.execute(new B.a(this, task, 18, false));
                return;
            case 1:
                synchronized (this.f15412c) {
                }
                this.f15411b.execute(new B.a(this, task, 19, false));
                return;
            default:
                if (task.c()) {
                    synchronized (this.f15412c) {
                    }
                    this.f15411b.execute(new B.a(this, task, 21, false));
                    return;
                }
                return;
        }
    }

    @Override // t2.b
    public void onSuccess(Object obj) {
        ((j) this.f15413d).e(obj);
    }

    public f(Executor executor, InterfaceC1440a interfaceC1440a) {
        this.f15410a = 1;
        this.f15412c = new Object();
        this.f15411b = executor;
        this.f15413d = interfaceC1440a;
    }

    public f(Executor executor, b bVar) {
        this.f15410a = 2;
        this.f15412c = new Object();
        this.f15411b = executor;
        this.f15413d = bVar;
    }
}
