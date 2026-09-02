package k1;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k implements l, e, d, b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5164f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f5165g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f5166h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f5167i;

    public k(Executor executor, b bVar) {
        this.f5164f = 0;
        this.f5166h = new Object();
        this.f5165g = executor;
        this.f5167i = bVar;
    }

    @Override // k1.b
    public void a() {
        ((n) this.f5167i).l();
    }

    @Override // k1.e
    public void b(Object obj) {
        ((n) this.f5167i).k(obj);
    }

    @Override // k1.l
    public final void c(n nVar) {
        switch (this.f5164f) {
            case 0:
                if (nVar.f5172d) {
                    synchronized (this.f5166h) {
                    }
                    this.f5165g.execute(new A.b(16, this));
                    return;
                }
                return;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                synchronized (this.f5166h) {
                }
                this.f5165g.execute(new A.a(this, nVar, 12, false));
                return;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                if (nVar.h() || nVar.f5172d) {
                    return;
                }
                synchronized (this.f5166h) {
                }
                this.f5165g.execute(new A.a(this, nVar, 13, false));
                return;
            case 3:
                if (nVar.h()) {
                    synchronized (this.f5166h) {
                    }
                    this.f5165g.execute(new A.a(this, nVar, 14, false));
                    return;
                }
                return;
            default:
                this.f5165g.execute(new A.a(this, nVar, 15, false));
                return;
        }
    }

    @Override // k1.d
    public void d(Exception exc) {
        ((n) this.f5167i).j(exc);
    }

    public k(Executor executor, c cVar) {
        this.f5164f = 1;
        this.f5166h = new Object();
        this.f5165g = executor;
        this.f5167i = cVar;
    }

    public k(Executor executor, d dVar) {
        this.f5164f = 2;
        this.f5166h = new Object();
        this.f5165g = executor;
        this.f5167i = dVar;
    }

    public k(Executor executor, e eVar) {
        this.f5164f = 3;
        this.f5166h = new Object();
        this.f5165g = executor;
        this.f5167i = eVar;
    }

    public k(Executor executor, g gVar, n nVar) {
        this.f5164f = 4;
        this.f5165g = executor;
        this.f5166h = gVar;
        this.f5167i = nVar;
    }
}
