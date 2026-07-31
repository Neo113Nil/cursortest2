package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class a13 extends w03 {

    /* renamed from: a, reason: collision with root package name */
    private final String f2550a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2551b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2552c;

    /* synthetic */ a13(String str, boolean z6, boolean z7, z03 z03Var) {
        this.f2550a = str;
        this.f2551b = z6;
        this.f2552c = z7;
    }

    @Override // com.google.android.gms.internal.ads.w03
    public final String b() {
        return this.f2550a;
    }

    @Override // com.google.android.gms.internal.ads.w03
    public final boolean c() {
        return this.f2552c;
    }

    @Override // com.google.android.gms.internal.ads.w03
    public final boolean d() {
        return this.f2551b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w03) {
            w03 w03Var = (w03) obj;
            if (this.f2550a.equals(w03Var.b()) && this.f2551b == w03Var.d() && this.f2552c == w03Var.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f2550a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f2551b ? 1237 : 1231)) * 1000003) ^ (true == this.f2552c ? 1231 : 1237);
    }

    public final String toString() {
        String str = this.f2550a;
        boolean z6 = this.f2551b;
        boolean z7 = this.f2552c;
        StringBuilder sb = new StringBuilder(str.length() + 99);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z6);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z7);
        sb.append("}");
        return sb.toString();
    }
}
