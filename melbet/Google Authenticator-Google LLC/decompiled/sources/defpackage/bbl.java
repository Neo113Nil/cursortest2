package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bbl implements bbh {
    private final qi b = new blw();

    @Override // defpackage.bbh
    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            qi qiVar = this.b;
            if (i >= qiVar.d) {
                return;
            }
            bbk bbkVar = (bbk) qiVar.c(i);
            Object f = qiVar.f(i);
            bbj bbjVar = bbkVar.c;
            if (bbkVar.e == null) {
                bbkVar.e = bbkVar.d.getBytes(bbh.a);
            }
            bbjVar.a(bbkVar.e, f, messageDigest);
            i++;
        }
    }

    public final Object b(bbk bbkVar) {
        qi qiVar = this.b;
        return qiVar.containsKey(bbkVar) ? qiVar.get(bbkVar) : bbkVar.b;
    }

    public final void c(bbl bblVar) {
        this.b.h(bblVar.b);
    }

    public final void d(bbk bbkVar, Object obj) {
        this.b.put(bbkVar, obj);
    }

    @Override // defpackage.bbh
    public final boolean equals(Object obj) {
        if (obj instanceof bbl) {
            return this.b.equals(((bbl) obj).b);
        }
        return false;
    }

    @Override // defpackage.bbh
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b.toString() + "}";
    }
}
