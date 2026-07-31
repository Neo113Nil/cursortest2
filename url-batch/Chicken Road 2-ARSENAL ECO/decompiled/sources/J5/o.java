package J5;

import H5.C0147g;
import T5.C0205v;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.concurrent.CancellationException;
import k5.v;
import l1.InterfaceFutureC0490a;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.j implements InterfaceC0743l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1336f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1337g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i7, Object obj) {
        super(1);
        this.f1336f = i7;
        this.f1337g = obj;
    }

    @Override // x5.InterfaceC0743l
    public final Object invoke(Object obj) {
        switch (this.f1336f) {
            case 0:
                C0147g c0147g = (C0147g) this.f1337g;
                v vVar = v.f5219a;
                c0147g.resumeWith(vVar);
                return vVar;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((P5.h) this.f1337g).b();
                return v.f5219a;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                int intValue = ((Number) obj).intValue();
                StringBuilder sb = new StringBuilder();
                R5.f fVar = (R5.f) this.f1337g;
                sb.append(fVar.f2160d[intValue]);
                sb.append(": ");
                sb.append(fVar.f2161e[intValue].b());
                return sb.toString();
            case 3:
                int intValue2 = ((Number) obj).intValue();
                StringBuilder sb2 = new StringBuilder();
                C0205v c0205v = (C0205v) this.f1337g;
                sb2.append(c0205v.f2467c[intValue2]);
                sb2.append(": ");
                sb2.append(c0205v.h(intValue2).b());
                return sb2.toString();
            case 4:
                Throwable th = (Throwable) obj;
                l0.k kVar = (l0.k) this.f1337g;
                if (th == null) {
                    if (!kVar.f5278f.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (th instanceof CancellationException) {
                    kVar.f5278f.cancel(true);
                } else {
                    w0.j jVar = kVar.f5278f;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    jVar.j(th);
                }
                return v.f5219a;
            default:
                ((InterfaceFutureC0490a) this.f1337g).cancel(false);
                return v.f5219a;
        }
    }
}
