package K1;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k implements l, e, d, c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1435d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f1436e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f1437i;

    /* renamed from: l, reason: collision with root package name */
    public final Object f1438l;

    public k(Executor executor, c cVar) {
        this.f1435d = 0;
        this.f1437i = new Object();
        this.f1436e = executor;
        this.f1438l = cVar;
    }

    @Override // K1.l
    public final void a(Task task) {
        switch (this.f1435d) {
            case 0:
                if (task.i()) {
                    synchronized (this.f1437i) {
                        try {
                            if (((c) this.f1438l) != null) {
                                this.f1436e.execute(new F.b(4, this));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 1:
                synchronized (this.f1437i) {
                    try {
                        if (((OnCompleteListener) this.f1438l) == null) {
                            return;
                        }
                        this.f1436e.execute(new F.a(9, this, task, false));
                        return;
                    } finally {
                    }
                }
            case 2:
                if (task.isSuccessful() || task.i()) {
                    return;
                }
                synchronized (this.f1437i) {
                    try {
                        if (((d) this.f1438l) != null) {
                            this.f1436e.execute(new F.a(10, this, task, false));
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                if (task.isSuccessful()) {
                    synchronized (this.f1437i) {
                        try {
                            if (((e) this.f1438l) != null) {
                                this.f1436e.execute(new F.a(11, this, task, false));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                this.f1436e.execute(new F.a(12, this, task, false));
                return;
        }
    }

    @Override // K1.c
    public void i() {
        ((p) this.f1438l).n();
    }

    @Override // K1.e
    public void k(Object obj) {
        ((p) this.f1438l).l(obj);
    }

    @Override // K1.d
    public void s(Exception exc) {
        ((p) this.f1438l).m(exc);
    }

    public k(Executor executor, d dVar) {
        this.f1435d = 2;
        this.f1437i = new Object();
        this.f1436e = executor;
        this.f1438l = dVar;
    }

    public k(Executor executor, e eVar) {
        this.f1435d = 3;
        this.f1437i = new Object();
        this.f1436e = executor;
        this.f1438l = eVar;
    }

    public k(Executor executor, g gVar, p pVar) {
        this.f1435d = 4;
        this.f1436e = executor;
        this.f1437i = gVar;
        this.f1438l = pVar;
    }

    public k(Executor executor, OnCompleteListener onCompleteListener) {
        this.f1435d = 1;
        this.f1437i = new Object();
        this.f1436e = executor;
        this.f1438l = onCompleteListener;
    }
}
