package defpackage;

import defpackage.aa2;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bn extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bn(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.m = i;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
    
        if (r9.H == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a1, code lost:
    
        r0 = r9.H0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
    
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ad, code lost:
    
        if (r9.I0(r0, r9.I) != true) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
    
        r9.H = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
    
        ((defpackage.z23) r3).e = defpackage.h20.G0(r9, (defpackage.wp) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        return kotlin.Unit.a;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        List p;
        int i = this.m;
        Object obj = this.p;
        Object obj2 = this.o;
        Object obj3 = this.n;
        switch (i) {
            case 0:
                k91 k91Var = (k91) obj;
                ((c82) obj3).m = ((cn) obj2).D.a(k91Var.m.f(), k91Var.getLayoutDirection(), k91Var);
                return Unit.a;
            case 1:
                sp spVar = (sp) obj3;
                w72 G0 = sp.G0(spVar, (ks1) obj2, (Function0) obj);
                if (G0 == null) {
                    return null;
                }
                h20 h20Var = spVar.A;
                if (!x31.a(h20Var.I, 0L)) {
                    return G0.g(h20Var.K0(G0, h20Var.I) ^ (-9223372034707292160L));
                }
                lh.g("Expected BringIntoViewRequester to not be used before parents are placed.");
                return null;
            case 2:
                List<Certificate> list = (List) obj2;
                yj1 yj1Var = ((dt) obj3).b;
                if (yj1Var != null && (p = yj1Var.p((String) obj, list)) != null) {
                    list = p;
                }
                ArrayList arrayList = new ArrayList(rv.l(list, 10));
                for (Certificate certificate : list) {
                    certificate.getClass();
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            case 3:
                h20 h20Var2 = (h20) obj3;
                mp mpVar = h20Var2.E;
                while (true) {
                    eo1 eo1Var = mpVar.a;
                    int i2 = eo1Var.o;
                    if (i2 == 0) {
                        break;
                    } else {
                        if (i2 == 0) {
                            ch2.k("MutableVector is empty.");
                            return null;
                        }
                        w72 w72Var = (w72) ((g20) eo1Var.m[i2 - 1]).a.invoke();
                        if (!(w72Var == null ? true : h20Var2.I0(w72Var, h20Var2.I))) {
                            break;
                        } else {
                            fs fsVar = ((g20) eo1Var.l(eo1Var.o - 1)).b;
                            Unit unit = Unit.a;
                            aa2.a aVar = aa2.m;
                            fsVar.resumeWith(unit);
                        }
                    }
                }
            case 4:
                return new hy1((yt0) ((zn1) obj3).getValue(), (Function1) ((zn1) obj2).getValue(), ((Number) ((Function0) obj).invoke()).intValue());
            case 5:
                yj1 yj1Var2 = ((dt) obj3).b;
                yj1Var2.getClass();
                return yj1Var2.p(((k5) obj).h.d, ((dx0) obj2).a());
            default:
                d0 d0Var = (d0) obj3;
                d0Var.removeOnAttachStateChangeListener((w7) obj2);
                bd3.x(d0Var).a.remove((ch2) obj);
                return Unit.a;
        }
    }
}
