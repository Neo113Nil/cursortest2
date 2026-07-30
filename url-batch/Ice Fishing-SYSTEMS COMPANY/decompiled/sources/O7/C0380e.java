package O7;

import java.util.concurrent.ScheduledFuture;

/* renamed from: O7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0380e implements m0, E7.l {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2586n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f2587u;

    public /* synthetic */ C0380e(int i, Object obj) {
        this.f2586n = i;
        this.f2587u = obj;
    }

    public final void a(Throwable th) {
        switch (this.f2586n) {
            case 0:
                if (th != null) {
                    ((ScheduledFuture) this.f2587u).cancel(false);
                    break;
                }
                break;
            case 1:
                ((H) this.f2587u).b();
                break;
            default:
                ((E7.l) this.f2587u).invoke(th);
                break;
        }
    }

    @Override // E7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f2586n) {
            case 0:
                a((Throwable) obj);
                break;
            case 1:
                a((Throwable) obj);
                break;
            default:
                a((Throwable) obj);
                break;
        }
        return q7.v.f40183a;
    }

    public final String toString() {
        switch (this.f2586n) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f2587u) + ']';
            case 1:
                return "DisposeOnCancel[" + ((H) this.f2587u) + ']';
            default:
                return "InvokeOnCancel[" + ((E7.l) this.f2587u).getClass().getSimpleName() + '@' + AbstractC0399y.j(this) + ']';
        }
    }
}
