package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bls implements bbh {
    private final Object b;

    public bls(Object obj) {
        a.v(obj, "Argument must not be null");
        this.b = obj;
    }

    @Override // defpackage.bbh
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(a));
    }

    @Override // defpackage.bbh
    public final boolean equals(Object obj) {
        if (obj instanceof bls) {
            return this.b.equals(((bls) obj).b);
        }
        return false;
    }

    @Override // defpackage.bbh
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.b.toString() + "}";
    }
}
