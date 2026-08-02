package defpackage;

import com.google.android.apps.authenticator2.R;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gfe extends gff implements aec {
    public final aer a;
    public gfo b;
    private final hbt c = new hdt();
    private boolean d = true;
    private final Executor e;
    private final gbf f;
    private final gbf g;
    private final kce h;
    private final cka i;

    public gfe(aer aerVar, cka ckaVar, Executor executor) {
        this.a = aerVar;
        this.i = ckaVar;
        try {
            this.h = (kce) ((gmx) ckaVar.a).g(R.id.first_lifecycle_owner_instance, aerVar, new gfi(1), new gfj(2));
            this.e = executor;
            gbf gbfVar = new gbf(executor, true);
            this.f = gbfVar;
            gbfVar.b();
            this.g = new gbf(executor, false);
            aerVar.L().a(this);
        } catch (IllegalStateException e) {
            throw new IllegalStateException("Both an unqualified and a `@ViewLifecycle LocalSubscriptionMixin` have been injectedin this Fragment scope. Only one of the two LocalSubscriptionMixins may be used in a given Fragment - either the unqualified or `@ViewLifecycle`LocalSubscriptionMixin exclusively.", e);
        }
    }

    @Override // defpackage.aec
    public final void b(aer aerVar) {
        fao.c();
        gfo gfoVar = this.b;
        if (gfoVar != null) {
            fao.c();
            gfoVar.d.execute(gvx.h(new gfm(gfoVar, 2)));
        }
        this.h.a = false;
    }

    @Override // defpackage.aec
    public final void e(aer aerVar) {
        fao.c();
        if (this.d) {
            int i = 0;
            hoq.H(this.b == null);
            hbt hbtVar = this.c;
            Set entrySet = hbtVar.entrySet();
            hdw hdwVar = new hdw(entrySet instanceof Collection ? entrySet.size() : 4);
            hdwVar.c(entrySet);
            this.b = new gfo(hdwVar.b(), this.e, this.f, this.g);
            if (this.h.a && this.d) {
                gfo gfoVar = this.b;
                fao.c();
                gfoVar.d.execute(gvx.h(new gfm(gfoVar, i)));
            } else {
                gfo gfoVar2 = this.b;
                fao.c();
                gfoVar2.d.execute(gvx.h(new fnh(gfoVar2, 19)));
            }
            hbtVar.clear();
            this.d = false;
        }
        gfo gfoVar3 = this.b;
        fao.c();
        gfoVar3.e.b();
    }

    @Override // defpackage.aec
    public final void f(aer aerVar) {
        fao.c();
        gfo gfoVar = this.b;
        fao.c();
        gfoVar.e.c();
    }

    @Override // defpackage.gff
    public final hnu h(int i, gex gexVar, final gzp gzpVar) {
        fao.c();
        int i2 = 1;
        hoq.H(this.b == null);
        hoq.H(((hdt) this.c).g(gexVar, (hrz) this.i.n(i, this.a, new gmw() { // from class: gfa
            @Override // defpackage.gmw
            public final Object a() {
                gzp h = gzp.h(((gzs) gzp.this).a);
                gyf gyfVar = gyf.a;
                return new hrz(new gfp(h, gyfVar, gyfVar, gyfVar));
            }
        }, new gfj(i2))) == null);
        return new gfb(this, gexVar);
    }

    @Override // defpackage.aec
    public final /* synthetic */ void a(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void bJ(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void d(aer aerVar) {
    }
}
