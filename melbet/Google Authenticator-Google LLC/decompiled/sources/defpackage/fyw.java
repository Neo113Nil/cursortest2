package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fyw implements gel, aec {
    private final fyx a;
    private gzp b = gyf.a;

    public fyw(fyx fyxVar) {
        this.a = fyxVar;
    }

    @Override // defpackage.gel
    public final void g(Throwable th) {
        this.b = gyf.a;
        fyx fyxVar = this.a;
        fyxVar.f = null;
        fyxVar.d.h(fyxVar.g(null));
    }

    @Override // defpackage.gel
    public final /* synthetic */ void h(Object obj) {
        List<fuf> list = (List) obj;
        hfm n = hfm.n(list);
        if (this.b.f() && ((hfm) this.b.b()).equals(n)) {
            return;
        }
        this.b = gzp.h(n);
        ArrayList arrayList = new ArrayList();
        for (fuf fufVar : list) {
            String str = fufVar.b.k;
            if ("pseudonymous".equals(str)) {
                fyx fyxVar = this.a;
                hoq.H("pseudonymous".equals(str));
                fyxVar.g = fufVar;
            } else if (!"incognito".equals(str)) {
                arrayList.add(fufVar);
            }
        }
        fyx fyxVar2 = this.a;
        dsg dsgVar = fyxVar2.d;
        dsgVar.a.h(hel.o(arrayList));
        dsgVar.h(fyxVar2.g(fyxVar2.f));
        Boolean bool = false;
        bool.getClass();
    }

    @Override // defpackage.gel
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void a(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void b(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void bJ(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void d(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void e(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void f(aer aerVar) {
    }
}
