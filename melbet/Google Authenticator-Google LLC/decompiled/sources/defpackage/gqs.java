package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gqs {
    public final gsc a;
    public final gpt b;
    public final frv c;

    public gqs(gsc gscVar) {
        this.a = gscVar;
        gsb gsbVar = gscVar.c;
        this.b = new gpt(gsbVar == null ? gsb.a : gsbVar);
        this.c = (gscVar.b & 2) != 0 ? frv.a(gscVar.d) : null;
    }

    public final boolean a() {
        return this.c != null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gqs) {
            gqs gqsVar = (gqs) obj;
            if (this.b.equals(gqsVar.b)) {
                frv frvVar = this.c;
                if (frvVar == null) {
                    if (gqsVar.c == null) {
                        return true;
                    }
                } else if (frvVar.equals(gqsVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c);
    }
}
