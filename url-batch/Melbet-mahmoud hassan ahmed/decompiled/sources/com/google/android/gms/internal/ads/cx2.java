package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class cx2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3978a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3979b;

    public cx2(String str, String str2) {
        this.f3978a = str;
        this.f3979b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx2)) {
            return false;
        }
        cx2 cx2Var = (cx2) obj;
        return this.f3978a.equals(cx2Var.f3978a) && this.f3979b.equals(cx2Var.f3979b);
    }

    public final int hashCode() {
        String valueOf = String.valueOf(this.f3978a);
        String valueOf2 = String.valueOf(this.f3979b);
        return (valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).hashCode();
    }
}
