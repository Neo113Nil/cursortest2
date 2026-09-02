package H5;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.concurrent.ScheduledFuture;
import x5.InterfaceC0743l;

/* renamed from: H5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0145e implements k0, InterfaceC0743l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1065f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1066g;

    public /* synthetic */ C0145e(int i7, Object obj) {
        this.f1065f = i7;
        this.f1066g = obj;
    }

    public final void a(Throwable th) {
        switch (this.f1065f) {
            case 0:
                if (th != null) {
                    ((ScheduledFuture) this.f1066g).cancel(false);
                    break;
                }
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((H) this.f1066g).b();
                break;
            default:
                ((InterfaceC0743l) this.f1066g).invoke(th);
                break;
        }
    }

    @Override // x5.InterfaceC0743l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f1065f) {
            case 0:
                a((Throwable) obj);
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                a((Throwable) obj);
                break;
            default:
                a((Throwable) obj);
                break;
        }
        return k5.v.f5219a;
    }

    public final String toString() {
        switch (this.f1065f) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f1066g) + ']';
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return "DisposeOnCancel[" + ((H) this.f1066g) + ']';
            default:
                return "InvokeOnCancel[" + ((InterfaceC0743l) this.f1066g).getClass().getSimpleName() + '@' + AbstractC0165z.g(this) + ']';
        }
    }
}
