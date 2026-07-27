package D4;

import java.util.concurrent.ScheduledFuture;
import t4.InterfaceC1441l;

/* renamed from: D4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0005e implements k0, InterfaceC1441l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f498a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f499b;

    public /* synthetic */ C0005e(int i2, Object obj) {
        this.f498a = i2;
        this.f499b = obj;
    }

    public final void a(Throwable th) {
        switch (this.f498a) {
            case 0:
                if (th != null) {
                    ((ScheduledFuture) this.f499b).cancel(false);
                    break;
                }
                break;
            case 1:
                ((G) this.f499b).b();
                break;
            default:
                ((InterfaceC1441l) this.f499b).invoke(th);
                break;
        }
    }

    @Override // t4.InterfaceC1441l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f498a) {
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
        return f4.v.f5689a;
    }

    public final String toString() {
        switch (this.f498a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f499b) + ']';
            case 1:
                return "DisposeOnCancel[" + ((G) this.f499b) + ']';
            default:
                return "InvokeOnCancel[" + ((InterfaceC1441l) this.f499b).getClass().getSimpleName() + '@' + AbstractC0024y.h(this) + ']';
        }
    }
}
