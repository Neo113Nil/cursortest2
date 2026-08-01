package w7;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k implements l, d, c, b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10125d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f10126e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f10127i;

    /* renamed from: r, reason: collision with root package name */
    public final Object f10128r;

    public k(Executor executor, OnCompleteListener onCompleteListener) {
        this.f10125d = 1;
        this.f10127i = new Object();
        this.f10126e = executor;
        this.f10128r = onCompleteListener;
    }

    @Override // w7.b
    public void a() {
        ((n) this.f10128r).n();
    }

    @Override // w7.d
    public void b(Object obj) {
        ((n) this.f10128r).l(obj);
    }

    @Override // w7.l
    public final void c(Task task) {
        switch (this.f10125d) {
            case 0:
                if (task.i()) {
                    synchronized (this.f10127i) {
                        try {
                            if (((b) this.f10128r) != null) {
                                this.f10126e.execute(new b7.k(24, this));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 1:
                synchronized (this.f10127i) {
                    try {
                        if (((OnCompleteListener) this.f10128r) == null) {
                            return;
                        }
                        this.f10126e.execute(new u5.n(5, this, task));
                        return;
                    } finally {
                    }
                }
            case 2:
                if (task.isSuccessful() || task.i()) {
                    return;
                }
                synchronized (this.f10127i) {
                    try {
                        if (((c) this.f10128r) != null) {
                            this.f10126e.execute(new u5.n(6, this, task));
                        }
                    } finally {
                    }
                }
                return;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                if (task.isSuccessful()) {
                    synchronized (this.f10127i) {
                        try {
                            if (((d) this.f10128r) != null) {
                                this.f10126e.execute(new u5.n(7, this, task));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                this.f10126e.execute(new u5.n(8, this, task));
                return;
        }
    }

    @Override // w7.c
    public void d(Exception exc) {
        ((n) this.f10128r).m(exc);
    }

    public k(Executor executor, b bVar) {
        this.f10125d = 0;
        this.f10127i = new Object();
        this.f10126e = executor;
        this.f10128r = bVar;
    }

    public k(Executor executor, c cVar) {
        this.f10125d = 2;
        this.f10127i = new Object();
        this.f10126e = executor;
        this.f10128r = cVar;
    }

    public k(Executor executor, d dVar) {
        this.f10125d = 3;
        this.f10127i = new Object();
        this.f10126e = executor;
        this.f10128r = dVar;
    }

    public k(Executor executor, f fVar, n nVar) {
        this.f10125d = 4;
        this.f10126e = executor;
        this.f10127i = fVar;
        this.f10128r = nVar;
    }
}
