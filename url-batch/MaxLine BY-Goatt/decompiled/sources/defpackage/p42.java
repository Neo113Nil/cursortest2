package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class p42 extends sw1 {
    private static final long serialVersionUID = 0;
    public final Object m;

    public p42(Object obj) {
        this.m = obj;
    }

    @Override // defpackage.sw1
    public final Object a() {
        return this.m;
    }

    @Override // defpackage.sw1
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p42) {
            return this.m.equals(((p42) obj).m);
        }
        return false;
    }

    public final int hashCode() {
        return this.m.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.m);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
