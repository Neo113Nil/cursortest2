package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bcu implements bbh {
    private final bbh b;
    private final bbh c;

    public bcu(bbh bbhVar, bbh bbhVar2) {
        this.b = bbhVar;
        this.c = bbhVar2;
    }

    @Override // defpackage.bbh
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // defpackage.bbh
    public final boolean equals(Object obj) {
        if (obj instanceof bcu) {
            bcu bcuVar = (bcu) obj;
            if (this.b.equals(bcuVar.b) && this.c.equals(bcuVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bbh
    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        bbh bbhVar = this.c;
        return "DataCacheKey{sourceKey=" + String.valueOf(this.b) + ", signature=" + String.valueOf(bbhVar) + "}";
    }
}
