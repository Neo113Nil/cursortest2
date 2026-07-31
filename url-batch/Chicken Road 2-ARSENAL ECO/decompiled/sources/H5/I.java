package H5;

import com.onesignal.inAppMessages.internal.display.impl.a;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class I extends b0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1031j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f1032k;

    public /* synthetic */ I(int i7, Object obj) {
        this.f1031j = i7;
        this.f1032k = obj;
    }

    @Override // x5.InterfaceC0743l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f1031j) {
            case 0:
                k((Throwable) obj);
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                k((Throwable) obj);
                break;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                k((Throwable) obj);
                break;
            default:
                k((Throwable) obj);
                break;
        }
        return k5.v.f5219a;
    }

    @Override // H5.b0
    public final void k(Throwable th) {
        switch (this.f1031j) {
            case 0:
                ((H) this.f1032k).b();
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((InterfaceC0743l) this.f1032k).invoke(th);
                break;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                c0 c0Var = (c0) this.f1032k;
                Object C6 = j().C();
                if (!(C6 instanceof C0156p)) {
                    c0Var.resumeWith(AbstractC0165z.r(C6));
                    break;
                } else {
                    c0Var.resumeWith(AbstractC0676f.f(((C0156p) C6).f1093a));
                    break;
                }
            default:
                ((C0147g) this.f1032k).resumeWith(k5.v.f5219a);
                break;
        }
    }
}
