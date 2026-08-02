package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jkl extends jkj implements jkn, dky {
    public jkl(jkm jkmVar) {
        super(jkmVar);
    }

    @Override // defpackage.jkj, defpackage.jlk
    /* renamed from: am, reason: merged with bridge method [inline-methods] */
    public final jkm r() {
        if (!((jkm) this.b).M()) {
            return (jkm) this.b;
        }
        ((jkm) this.b).l.e();
        return (jkm) super.r();
    }

    @Override // defpackage.jkn
    public final boolean an(iwq iwqVar) {
        jkm jkmVar = (jkm) this.b;
        jkmVar.g(iwqVar);
        return jkmVar.l.l((jko) iwqVar.c);
    }

    public final void ao(iwq iwqVar, Object obj) {
        int i = jkp.t;
        if (iwqVar.d != this.a) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        if (!this.b.M()) {
            t();
        }
        jkf jkfVar = ((jkm) this.b).l;
        if (jkfVar.c) {
            jkfVar = jkfVar.clone();
            ((jkm) this.b).l = jkfVar;
        }
        jko jkoVar = (jko) iwqVar.c;
        if (jkoVar.a() == jms.h) {
            obj = Integer.valueOf(((jkr) obj).a());
        }
        jkfVar.k(jkoVar, obj);
    }

    @Override // defpackage.jkj
    public final void t() {
        super.t();
        if (((jkm) this.b).l != jkf.a) {
            jkm jkmVar = (jkm) this.b;
            jkmVar.l = jkmVar.l.clone();
        }
    }

    public jkl() {
        throw null;
    }
}
