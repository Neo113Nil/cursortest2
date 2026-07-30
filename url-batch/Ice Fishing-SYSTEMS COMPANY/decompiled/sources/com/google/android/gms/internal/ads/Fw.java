package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Fw {

    /* renamed from: a, reason: collision with root package name */
    public final String f25050a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25051b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25052c;

    /* renamed from: d, reason: collision with root package name */
    public final long f25053d;

    /* renamed from: e, reason: collision with root package name */
    public final long f25054e;

    public Fw(String str, boolean z8, boolean z9, long j9, long j10) {
        this.f25050a = str;
        this.f25051b = z8;
        this.f25052c = z9;
        this.f25053d = j9;
        this.f25054e = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Fw)) {
            return false;
        }
        Fw fw = (Fw) obj;
        return this.f25050a.equals(fw.f25050a) && this.f25051b == fw.f25051b && this.f25052c == fw.f25052c && this.f25053d == fw.f25053d && this.f25054e == fw.f25054e;
    }

    public final int hashCode() {
        return ((((((((((((this.f25050a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f25051b ? 1237 : 1231)) * 1000003) ^ (true != this.f25052c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f25053d)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f25054e);
    }

    public final String toString() {
        boolean z8 = this.f25051b;
        int length = String.valueOf(z8).length();
        boolean z9 = this.f25052c;
        int length2 = String.valueOf(z9).length();
        long j9 = this.f25053d;
        int length3 = String.valueOf(j9).length();
        long j10 = this.f25054e;
        int length4 = String.valueOf(j10).length();
        String str = this.f25050a;
        StringBuilder sb = new StringBuilder(str.length() + 56 + length + 32 + length2 + 57 + length3 + 61 + length4 + 1);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z8);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z9);
        sb.append(", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=");
        sb.append(j9);
        sb.append(", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=");
        sb.append(j10);
        sb.append("}");
        return sb.toString();
    }
}
