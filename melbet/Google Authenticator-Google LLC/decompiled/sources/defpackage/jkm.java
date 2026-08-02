package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class jkm extends jkp implements jkn {
    public jkf l = jkf.a;

    @Override // defpackage.jkn
    public final boolean an(iwq iwqVar) {
        throw null;
    }

    public final jkf b() {
        jkf jkfVar = this.l;
        if (jkfVar.c) {
            this.l = jkfVar.clone();
        }
        return this.l;
    }

    public final void g(iwq iwqVar) {
        if (iwqVar.d != s()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }
}
