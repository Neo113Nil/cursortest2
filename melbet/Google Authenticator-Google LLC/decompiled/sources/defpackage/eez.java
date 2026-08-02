package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eez implements bbh {
    public final eet b;

    public eez(eet eetVar) {
        this.b = eetVar;
    }

    public static eez b(Object obj, dov dovVar) {
        return new eez(eet.a(obj, dovVar));
    }

    @Override // defpackage.bbh
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(a));
    }

    @Override // defpackage.bbh
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eez) {
            return this.b.equals(((eez) obj).b);
        }
        return false;
    }

    @Override // defpackage.bbh
    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "eez:" + super.toString();
    }

    public eez() {
        throw null;
    }
}
