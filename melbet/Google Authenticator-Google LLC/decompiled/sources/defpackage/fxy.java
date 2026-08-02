package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fxy implements bbh {
    public final ful b;

    public fxy(ful fulVar) {
        if (fulVar == null) {
            throw new NullPointerException("Null accountInfo");
        }
        this.b = fulVar;
    }

    @Override // defpackage.bbh
    public final void a(MessageDigest messageDigest) {
        ful fulVar = this.b;
        if ((fulVar.b & 32) != 0) {
            messageDigest.update(fulVar.h.getBytes(a));
        } else {
            messageDigest.update(fulVar.c.getBytes(a));
        }
    }

    @Override // defpackage.bbh
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fxy) {
            return this.b.equals(((fxy) obj).b);
        }
        return false;
    }

    @Override // defpackage.bbh
    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public fxy() {
        throw null;
    }
}
