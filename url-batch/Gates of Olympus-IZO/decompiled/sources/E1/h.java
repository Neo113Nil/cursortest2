package E1;

import G1.r;
import H1.y;
import I.C0105l;
import I.C0113p;
import L1.z;
import a.AbstractC0157a;
import android.os.Bundle;
import androidx.lifecycle.V;
import l.C0564i;
import q1.C0775D;
import q1.C0784h;
import r.InterfaceC0796H;

/* loaded from: classes.dex */
public final class h implements Y1.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f758e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ V f759f;

    public /* synthetic */ h(V v3, Object obj, int i3) {
        this.f757d = i3;
        this.f759f = v3;
        this.f758e = obj;
    }

    @Override // Y1.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f757d) {
            case 0:
                ((Number) obj4).intValue();
                Z1.i.f((C0564i) obj, "$this$composable");
                Z1.i.f((C0784h) obj2, "it");
                I2.l.d((r) this.f759f, (InterfaceC0796H) this.f758e, (C0113p) obj3, 0);
                break;
            case 1:
                ((Number) obj4).intValue();
                Z1.i.f((C0564i) obj, "$this$composable");
                Z1.i.f((C0784h) obj2, "it");
                I2.d.e((I1.m) this.f759f, (InterfaceC0796H) this.f758e, (C0113p) obj3, 0);
                break;
            default:
                C0784h c0784h = (C0784h) obj2;
                C0113p c0113p = (C0113p) obj3;
                ((Number) obj4).intValue();
                Z1.i.f((C0564i) obj, "$this$composable");
                Z1.i.f(c0784h, "entry");
                Bundle g3 = c0784h.g();
                String string = g3 != null ? g3.getString("jointId") : null;
                if (string == null) {
                    string = "";
                }
                c0113p.Q(-953468185);
                C0775D c0775d = (C0775D) this.f758e;
                boolean h3 = c0113p.h(c0775d);
                Object G3 = c0113p.G();
                if (h3 || G3 == C0105l.f2272a) {
                    G3 = new D1.g(1, c0775d);
                    c0113p.a0(G3);
                }
                c0113p.p(false);
                AbstractC0157a.d(string, (y) this.f759f, (Y1.a) G3, c0113p, 0);
                break;
        }
        return z.f2729a;
    }
}
