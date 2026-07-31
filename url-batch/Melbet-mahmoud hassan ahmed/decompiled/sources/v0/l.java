package v0;

import android.net.Uri;
import java.util.Map;
import m4.s0;
import n2.l;
import n2.u;
import r0.a2;
import v0.h;

/* loaded from: classes.dex */
public final class l implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f22672a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private a2.f f22673b;

    /* renamed from: c, reason: collision with root package name */
    private y f22674c;

    /* renamed from: d, reason: collision with root package name */
    private l.a f22675d;

    /* renamed from: e, reason: collision with root package name */
    private String f22676e;

    private y b(a2.f fVar) {
        l.a aVar = this.f22675d;
        if (aVar == null) {
            aVar = new u.b().e(this.f22676e);
        }
        Uri uri = fVar.f20428c;
        l0 l0Var = new l0(uri == null ? null : uri.toString(), fVar.f20433h, aVar);
        s0<Map.Entry<String, String>> it = fVar.f20430e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            l0Var.e(next.getKey(), next.getValue());
        }
        h a7 = new h.b().e(fVar.f20426a, k0.f22668d).b(fVar.f20431f).c(fVar.f20432g).d(o4.d.k(fVar.f20435j)).a(l0Var);
        a7.F(0, fVar.c());
        return a7;
    }

    @Override // v0.b0
    public y a(a2 a2Var) {
        y yVar;
        o2.a.e(a2Var.f20393g);
        a2.f fVar = a2Var.f20393g.f20459c;
        if (fVar == null || o2.m0.f19752a < 18) {
            return y.f22715a;
        }
        synchronized (this.f22672a) {
            if (!o2.m0.c(fVar, this.f22673b)) {
                this.f22673b = fVar;
                this.f22674c = b(fVar);
            }
            yVar = (y) o2.a.e(this.f22674c);
        }
        return yVar;
    }
}
