package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class nd4 {

    /* renamed from: a, reason: collision with root package name */
    public final qd4 f9056a;

    /* renamed from: b, reason: collision with root package name */
    public final qd4 f9057b;

    public nd4(qd4 qd4Var, qd4 qd4Var2) {
        this.f9056a = qd4Var;
        this.f9057b = qd4Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nd4.class == obj.getClass()) {
            nd4 nd4Var = (nd4) obj;
            if (this.f9056a.equals(nd4Var.f9056a) && this.f9057b.equals(nd4Var.f9057b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f9056a.hashCode() * 31) + this.f9057b.hashCode();
    }

    public final String toString() {
        String obj = this.f9056a.toString();
        String concat = this.f9056a.equals(this.f9057b) ? "" : ", ".concat(this.f9057b.toString());
        StringBuilder sb = new StringBuilder(obj.length() + 2 + concat.length());
        sb.append("[");
        sb.append(obj);
        sb.append(concat);
        sb.append("]");
        return sb.toString();
    }
}
