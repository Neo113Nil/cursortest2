package w7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j implements l, d, c, b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10121d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f10122e;

    /* renamed from: i, reason: collision with root package name */
    public final a f10123i;

    /* renamed from: r, reason: collision with root package name */
    public final n f10124r;

    public /* synthetic */ j(Executor executor, a aVar, n nVar, int i3) {
        this.f10121d = i3;
        this.f10122e = executor;
        this.f10123i = aVar;
        this.f10124r = nVar;
    }

    @Override // w7.b
    public void a() {
        this.f10124r.n();
    }

    @Override // w7.d
    public void b(Object obj) {
        this.f10124r.l(obj);
    }

    @Override // w7.l
    public final void c(Task task) {
        switch (this.f10121d) {
            case 0:
                this.f10122e.execute(new u5.n(3, this, task));
                break;
            default:
                this.f10122e.execute(new u5.n(4, this, task));
                break;
        }
    }

    @Override // w7.c
    public void d(Exception exc) {
        this.f10124r.m(exc);
    }
}
