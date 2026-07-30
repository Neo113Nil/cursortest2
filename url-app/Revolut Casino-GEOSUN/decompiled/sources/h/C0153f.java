package h;

import android.content.Context;
import android.view.View;
import com.aurifaber.valuta.rotatus.signum.modulus.R;

/* renamed from: h.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0153f extends g.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2172l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0156i f2173m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0153f(C0156i c0156i, Context context, g.j jVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, jVar, true);
        this.f2173m = c0156i;
        this.f2029f = 8388613;
        A.j jVar2 = c0156i.f2219z;
        this.f2031h = jVar2;
        g.l lVar = this.f2032i;
        if (lVar != null) {
            lVar.f(jVar2);
        }
    }

    @Override // g.n
    public final void c() {
        switch (this.f2172l) {
            case 0:
                C0156i c0156i = this.f2173m;
                c0156i.f2216w = null;
                c0156i.getClass();
                super.c();
                break;
            default:
                C0156i c0156i2 = this.f2173m;
                g.j jVar = c0156i2.f2201g;
                if (jVar != null) {
                    jVar.c(true);
                }
                c0156i2.f2215v = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0153f(C0156i c0156i, Context context, g.t tVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, tVar, false);
        this.f2173m = c0156i;
        if (!tVar.f2054w.d()) {
            View view2 = c0156i.f2206l;
            this.f2028e = view2 == null ? c0156i.f2205k : view2;
        }
        A.j jVar = c0156i.f2219z;
        this.f2031h = jVar;
        g.l lVar = this.f2032i;
        if (lVar != null) {
            lVar.f(jVar);
        }
    }
}
