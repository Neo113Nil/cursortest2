package defpackage;

import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jkj extends jiz implements jlm, cve {
    public final jkp a;
    public jkp b;

    public jkj(jkp jkpVar) {
        this.a = jkpVar;
        if (jkpVar.M()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = p();
    }

    private static void am(jkp jkpVar, jkp jkpVar2) {
        jlt.a.a(jkpVar).h(jkpVar, jkpVar2);
    }

    public final void A(String str, euj eujVar) {
        str.getClass();
        eujVar.getClass();
        if (!this.b.M()) {
            t();
        }
        euk eukVar = (euk) this.b;
        euk eukVar2 = euk.a;
        jli jliVar = eukVar.b;
        if (!jliVar.b) {
            eukVar.b = jliVar.a();
        }
        eukVar.b.put(str, eujVar);
    }

    public final void B(int i, fxf fxfVar) {
        fxfVar.getClass();
        if (!this.b.M()) {
            t();
        }
        fxd fxdVar = (fxd) this.b;
        fxd fxdVar2 = fxd.a;
        fxdVar.b().put(Integer.valueOf(i), fxfVar);
    }

    public final void C(String str, int i) {
        str.getClass();
        if (!this.b.M()) {
            t();
        }
        fyg fygVar = (fyg) this.b;
        fyg fygVar2 = fyg.a;
        fygVar.b().put(str, Integer.valueOf(i));
    }

    public final void D(grz grzVar) {
        if (!this.b.M()) {
            t();
        }
        gsa gsaVar = (gsa) this.b;
        gsa gsaVar2 = gsa.a;
        grzVar.getClass();
        jkx jkxVar = gsaVar.d;
        if (!jkxVar.c()) {
            gsaVar.d = jkp.A(jkxVar);
        }
        gsaVar.d.add(grzVar);
    }

    public final void E(gtx gtxVar) {
        if (!this.b.M()) {
            t();
        }
        gvy gvyVar = (gvy) this.b;
        gvy gvyVar2 = gvy.a;
        gtxVar.getClass();
        jkx jkxVar = gvyVar.e;
        if (!jkxVar.c()) {
            gvyVar.e = jkp.A(jkxVar);
        }
        gvyVar.e.add(gtxVar);
    }

    public final void F(int i) {
        if (!this.b.M()) {
            t();
        }
        iil iilVar = (iil) this.b;
        iil iilVar2 = iil.a;
        jkt jktVar = iilVar.b;
        if (!jktVar.c()) {
            iilVar.b = jkp.y(jktVar);
        }
        iilVar.b.g(i);
    }

    public final void G(Map map) {
        if (!this.b.M()) {
            t();
        }
        iiw iiwVar = (iiw) this.b;
        iiw iiwVar2 = iiw.a;
        iiwVar.b().putAll(map);
    }

    public final void H(Iterable iterable) {
        if (!this.b.M()) {
            t();
        }
        len lenVar = (len) this.b;
        len lenVar2 = len.a;
        jkx jkxVar = lenVar.c;
        if (!jkxVar.c()) {
            lenVar.c = jkp.A(jkxVar);
        }
        jiz.f(iterable, lenVar.c);
    }

    public final void I(Iterable iterable) {
        if (!this.b.M()) {
            t();
        }
        len lenVar = (len) this.b;
        len lenVar2 = len.a;
        jkx jkxVar = lenVar.d;
        if (!jkxVar.c()) {
            lenVar.d = jkp.A(jkxVar);
        }
        jiz.f(iterable, lenVar.d);
    }

    public final ler J(int i) {
        return (ler) ((les) this.b).m.get(i);
    }

    public final ler K(int i) {
        return (ler) ((les) this.b).o.get(i);
    }

    public final ler L(int i) {
        return (ler) ((les) this.b).l.get(i);
    }

    public final ler M(int i) {
        return (ler) ((les) this.b).k.get(i);
    }

    public final ler N(int i) {
        return (ler) ((les) this.b).h.get(i);
    }

    public final ler O(int i) {
        return (ler) ((les) this.b).i.get(i);
    }

    public final ler P(int i) {
        return (ler) ((les) this.b).j.get(i);
    }

    public final void Q(Iterable iterable) {
        if (!this.b.M()) {
            t();
        }
        les lesVar = (les) this.b;
        les lesVar2 = les.a;
        lesVar.b();
        jiz.f(iterable, lesVar.m);
    }

    public final void R(Iterable iterable) {
        if (!this.b.M()) {
            t();
        }
        les lesVar = (les) this.b;
        les lesVar2 = les.a;
        lesVar.g();
        jiz.f(iterable, lesVar.o);
    }

    public final void S(Iterable iterable) {
        if (!this.b.M()) {
            t();
        }
        les lesVar = (les) this.b;
        les lesVar2 = les.a;
        jkx jkxVar = lesVar.u;
        if (!jkxVar.c()) {
            lesVar.u = jkp.A(jkxVar);
        }
        jiz.f(iterable, lesVar.u);
    }

    public final void T(Iterable iterable) {
        if (!this.b.M()) {
            t();
        }
        les lesVar = (les) this.b;
        les lesVar2 = les.a;
        jkx jkxVar = lesVar.q;
        if (!jkxVar.c()) {
            lesVar.q = jkp.A(jkxVar);
        }
        jiz.f(iterable, lesVar.q);
    }

    public final void U(Iterable iterable) {
        if (!this.b.M()) {
            t();
        }
        les lesVar = (les) this.b;
        les lesVar2 = les.a;
        lesVar.P();
        jiz.f(iterable, lesVar.l);
    }

    public final void V(Iterable iterable) {
        if (!this.b.M()) {
            t();
        }
        les lesVar = (les) this.b;
        les lesVar2 = les.a;
        lesVar.Q();
        jiz.f(iterable, lesVar.k);
    }

    public final void W(Iterable iterable) {
        if (!this.b.M()) {
            t();
        }
        les lesVar = (les) this.b;
        les lesVar2 = les.a;
        lesVar.R();
        jiz.f(iterable, lesVar.h);
    }

    public final void X(Iterable iterable) {
        if (!this.b.M()) {
            t();
        }
        les lesVar = (les) this.b;
        les lesVar2 = les.a;
        lesVar.S();
        jiz.f(iterable, lesVar.i);
    }

    public final void Y(Iterable iterable) {
        if (!this.b.M()) {
            t();
        }
        les lesVar = (les) this.b;
        les lesVar2 = les.a;
        lesVar.T();
        jiz.f(iterable, lesVar.j);
    }

    public final void Z(int i, ler lerVar) {
        if (!this.b.M()) {
            t();
        }
        les lesVar = (les) this.b;
        les lesVar2 = les.a;
        lerVar.getClass();
        lesVar.b();
        lesVar.m.set(i, lerVar);
    }

    public final void aa(int i, ler lerVar) {
        if (!this.b.M()) {
            t();
        }
        les lesVar = (les) this.b;
        les lesVar2 = les.a;
        lerVar.getClass();
        lesVar.g();
        lesVar.o.set(i, lerVar);
    }

    public final void ab(int i, ler lerVar) {
        if (!this.b.M()) {
            t();
        }
        les lesVar = (les) this.b;
        les lesVar2 = les.a;
        lerVar.getClass();
        lesVar.P();
        lesVar.l.set(i, lerVar);
    }

    public final void ac(int i, ler lerVar) {
        if (!this.b.M()) {
            t();
        }
        les lesVar = (les) this.b;
        les lesVar2 = les.a;
        lerVar.getClass();
        lesVar.Q();
        lesVar.k.set(i, lerVar);
    }

    public final void ad(int i, ler lerVar) {
        if (!this.b.M()) {
            t();
        }
        les lesVar = (les) this.b;
        les lesVar2 = les.a;
        lerVar.getClass();
        lesVar.R();
        lesVar.h.set(i, lerVar);
    }

    public final void ae(int i, ler lerVar) {
        if (!this.b.M()) {
            t();
        }
        les lesVar = (les) this.b;
        les lesVar2 = les.a;
        lerVar.getClass();
        lesVar.S();
        lesVar.i.set(i, lerVar);
    }

    public final void af(int i, ler lerVar) {
        if (!this.b.M()) {
            t();
        }
        les lesVar = (les) this.b;
        les lesVar2 = les.a;
        lerVar.getClass();
        lesVar.T();
        lesVar.j.set(i, lerVar);
    }

    public final void ag(int i) {
        if (!this.b.M()) {
            t();
        }
        lgs lgsVar = (lgs) this.b;
        lgs lgsVar2 = lgs.a;
        jkt jktVar = lgsVar.c;
        if (!jktVar.c()) {
            lgsVar.c = jkp.y(jktVar);
        }
        lgsVar.c.g(i);
    }

    public final void ah(int i) {
        if (!this.b.M()) {
            t();
        }
        lgs lgsVar = (lgs) this.b;
        lgs lgsVar2 = lgs.a;
        jkt jktVar = lgsVar.b;
        if (!jktVar.c()) {
            lgsVar.b = jkp.y(jktVar);
        }
        lgsVar.b.g(i);
    }

    public final void ai(Iterable iterable) {
        if (!this.b.M()) {
            t();
        }
        lgv lgvVar = (lgv) this.b;
        lgv lgvVar2 = lgv.a;
        jkx jkxVar = lgvVar.u;
        if (!jkxVar.c()) {
            lgvVar.u = jkp.A(jkxVar);
        }
        jiz.f(iterable, lgvVar.u);
    }

    public final void aj(jkj jkjVar) {
        if (!this.b.M()) {
            t();
        }
        ejf ejfVar = (ejf) this.b;
        ejb ejbVar = (ejb) jkjVar.q();
        ejf ejfVar2 = ejf.a;
        ejbVar.getClass();
        ejfVar.b();
        ejfVar.e.add(ejbVar);
    }

    public final void ak(jkj jkjVar) {
        if (!this.b.M()) {
            t();
        }
        ejd ejdVar = (ejd) this.b;
        lgx lgxVar = (lgx) jkjVar.q();
        ejd ejdVar2 = ejd.a;
        lgxVar.getClass();
        jkx jkxVar = ejdVar.c;
        if (!jkxVar.c()) {
            ejdVar.c = jkp.A(jkxVar);
        }
        ejdVar.c.add(lgxVar);
    }

    public final void al(jkj jkjVar) {
        if (!this.b.M()) {
            t();
        }
        lfs lfsVar = (lfs) this.b;
        lfx lfxVar = (lfx) jkjVar.q();
        lfs lfsVar2 = lfs.a;
        lfxVar.getClass();
        jkx jkxVar = lfsVar.k;
        if (!jkxVar.c()) {
            lfsVar.k = jkp.A(jkxVar);
        }
        lfsVar.k.add(lfxVar);
    }

    @Override // defpackage.jiz
    /* renamed from: b */
    protected final /* synthetic */ jiz d(jja jjaVar) {
        w((jkp) jjaVar);
        return this;
    }

    @Override // defpackage.jiz
    public final /* bridge */ /* synthetic */ jiz j(byte[] bArr, int i, jkd jkdVar) {
        x(bArr, i, jkdVar);
        return this;
    }

    @Override // defpackage.jiz
    public final /* bridge */ /* synthetic */ void l(byte[] bArr, int i) {
        x(bArr, i, jkd.a);
    }

    @Override // defpackage.jiz
    /* renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final jkj clone() {
        jkj B = this.a.B();
        B.b = r();
        return B;
    }

    @Override // defpackage.jlk
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final jkp q() {
        jkp r = r();
        if (jkp.L(r, true)) {
            return r;
        }
        throw new jmi();
    }

    @Override // defpackage.jlk
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public jkp r() {
        boolean M = this.b.M();
        jkp jkpVar = this.b;
        if (!M) {
            return jkpVar;
        }
        jkpVar.G();
        return this.b;
    }

    public final jkp p() {
        return this.a.p();
    }

    @Override // defpackage.jlm
    public final /* bridge */ /* synthetic */ jll s() {
        throw null;
    }

    public void t() {
        jkp p = p();
        am(p, this.b);
        this.b = p;
    }

    @Override // defpackage.jlm
    public final boolean u() {
        return jkp.L(this.b, false);
    }

    @Override // defpackage.jiz, defpackage.jlk
    /* renamed from: v, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void h(jju jjuVar, jkd jkdVar) {
        if (!this.b.M()) {
            t();
        }
        try {
            jlt.a.a(this.b).i(this.b, jjv.p(jjuVar), jkdVar);
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof IOException)) {
                throw e;
            }
            throw ((IOException) e.getCause());
        }
    }

    public final void w(jkp jkpVar) {
        if (jkpVar != null && !this.a.getClass().isInstance(jkpVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        if (this.a.equals(jkpVar)) {
            return;
        }
        if (!this.b.M()) {
            t();
        }
        am(this.b, jkpVar);
    }

    public final void x(byte[] bArr, int i, jkd jkdVar) {
        if (!this.b.M()) {
            t();
        }
        try {
            jlt.a.a(this.b).j(this.b, bArr, 0, i, new jje(jkdVar));
        } catch (IOException e) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e);
        } catch (IndexOutOfBoundsException unused) {
            throw new jld("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (jld e2) {
            throw e2;
        }
    }

    public final void y(String str) {
        if (!this.b.M()) {
            t();
        }
        esj esjVar = (esj) this.b;
        esj esjVar2 = esj.a;
        jkx jkxVar = esjVar.i;
        if (!jkxVar.c()) {
            esjVar.i = jkp.A(jkxVar);
        }
        esjVar.i.add(str);
    }

    public final void z(String str) {
        if (!this.b.M()) {
            t();
        }
        euj eujVar = (euj) this.b;
        euj eujVar2 = euj.a;
        str.getClass();
        jkx jkxVar = eujVar.c;
        if (!jkxVar.c()) {
            eujVar.c = jkp.A(jkxVar);
        }
        eujVar.c.add(str);
    }

    public jkj() {
        throw null;
    }
}
