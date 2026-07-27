package F4;

import D4.C0007g;
import M.P;
import M.Y;
import M.b0;
import P4.C0142v;
import P4.C0143w;
import android.content.Intent;
import android.content.pm.PackageManager;
import f4.C0442s;
import f4.v;
import java.util.concurrent.CancellationException;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.j implements InterfaceC1441l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f737e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f738f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i2, Object obj) {
        super(1);
        this.f737e = i2;
        this.f738f = obj;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(Object obj) {
        switch (this.f737e) {
            case 0:
                v vVar = v.f5689a;
                ((C0007g) this.f738f).resumeWith(vVar);
                return vVar;
            case 1:
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService").setPackage((String) obj);
                kotlin.jvm.internal.i.d(intent, "Intent(CustomTabsService…          .setPackage(it)");
                return Boolean.valueOf(((PackageManager) this.f738f).resolveService(intent, 0) != null);
            case 2:
                ((L4.h) this.f738f).b();
                return v.f5689a;
            case 3:
                Throwable th = (Throwable) obj;
                P p5 = (P) this.f738f;
                if (th != null) {
                    p5.f1620h.h(new b0(th));
                }
                if (p5.f1622j.f5675b != C0442s.f5686a) {
                    ((Y) p5.f1622j.getValue()).close();
                }
                return v.f5689a;
            case 4:
                int intValue = ((Number) obj).intValue();
                StringBuilder sb = new StringBuilder();
                N4.f fVar = (N4.f) this.f738f;
                sb.append(fVar.f2177d[intValue]);
                sb.append(": ");
                sb.append(fVar.f2178e[intValue].b());
                return sb.toString();
            case 5:
                N4.a buildSerialDescriptor = (N4.a) obj;
                kotlin.jvm.internal.i.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                ((C0143w) this.f738f).getClass();
                return v.f5689a;
            case 6:
                int intValue2 = ((Number) obj).intValue();
                StringBuilder sb2 = new StringBuilder();
                C0142v c0142v = (C0142v) this.f738f;
                sb2.append(c0142v.f2404c[intValue2]);
                sb2.append(": ");
                sb2.append(c0142v.h(intValue2).b());
                return sb2.toString();
            case 7:
                Throwable th2 = (Throwable) obj;
                s0.l lVar = (s0.l) this.f738f;
                if (th2 == null) {
                    if (!lVar.f11785a.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (th2 instanceof CancellationException) {
                    lVar.f11785a.cancel(true);
                } else {
                    D0.k kVar = lVar.f11785a;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    kVar.l(th2);
                }
                return v.f5689a;
            default:
                ((J1.a) this.f738f).cancel(false);
                return v.f5689a;
        }
    }
}
