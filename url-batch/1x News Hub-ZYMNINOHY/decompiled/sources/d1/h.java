package d1;

import N0.r;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4938a;

    /* renamed from: b, reason: collision with root package name */
    public final j f4939b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4940c;

    /* renamed from: d, reason: collision with root package name */
    public final g f4941d;

    public h(j jVar, g gVar, int i3) {
        this.f4938a = i3;
        switch (i3) {
            case 1:
                this.f4940c = new Object();
                this.f4939b = jVar;
                this.f4941d = gVar;
                break;
            default:
                this.f4940c = new Object();
                this.f4939b = jVar;
                this.f4941d = gVar;
                break;
        }
    }

    @Override // d1.i
    public final void a(Task task) {
        switch (this.f4938a) {
            case 0:
                if (((k) task).f4945d) {
                    synchronized (this.f4940c) {
                        try {
                            if (this.f4941d != null) {
                                j jVar = this.f4939b;
                                B.b bVar = new B.b(11, this);
                                jVar.getClass();
                                bVar.run();
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                if (task.c() || ((k) task).f4945d) {
                    return;
                }
                synchronized (this.f4940c) {
                    try {
                        if (this.f4941d != null) {
                            this.f4939b.getClass();
                            synchronized (this.f4940c) {
                                try {
                                    g gVar = this.f4941d;
                                    if (gVar != null) {
                                        Exception a3 = task.a();
                                        r.c(a3);
                                        ((k) gVar.f4937d).d(a3);
                                    }
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}
