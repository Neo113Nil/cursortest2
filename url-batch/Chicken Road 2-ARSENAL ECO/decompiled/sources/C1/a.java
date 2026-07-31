package C1;

import N.p;
import W4.m;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f189a;

    /* renamed from: b, reason: collision with root package name */
    public final int f190b;

    /* renamed from: c, reason: collision with root package name */
    public final String f191c;

    /* renamed from: d, reason: collision with root package name */
    public final String f192d;

    /* renamed from: e, reason: collision with root package name */
    public final long f193e;

    /* renamed from: f, reason: collision with root package name */
    public final long f194f;

    /* renamed from: g, reason: collision with root package name */
    public final String f195g;

    public a(String str, int i7, String str2, String str3, long j4, long j7, String str4) {
        this.f189a = str;
        this.f190b = i7;
        this.f191c = str2;
        this.f192d = str3;
        this.f193e = j4;
        this.f194f = j7;
        this.f195g = str4;
    }

    public final m a() {
        m mVar = new m();
        mVar.f2807b = this.f189a;
        mVar.f2808c = this.f190b;
        mVar.f2809d = this.f191c;
        mVar.f2810e = this.f192d;
        mVar.f2811f = Long.valueOf(this.f193e);
        mVar.f2812g = Long.valueOf(this.f194f);
        mVar.f2813h = this.f195g;
        return mVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f189a;
        if (str == null) {
            if (aVar.f189a != null) {
                return false;
            }
        } else if (!str.equals(aVar.f189a)) {
            return false;
        }
        int i7 = aVar.f190b;
        String str2 = aVar.f195g;
        String str3 = aVar.f192d;
        String str4 = aVar.f191c;
        if (!p.a(this.f190b, i7)) {
            return false;
        }
        String str5 = this.f191c;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        String str6 = this.f192d;
        if (str6 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str6.equals(str3)) {
            return false;
        }
        if (this.f193e != aVar.f193e || this.f194f != aVar.f194f) {
            return false;
        }
        String str7 = this.f195g;
        return str7 == null ? str2 == null : str7.equals(str2);
    }

    public final int hashCode() {
        String str = this.f189a;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ p.c(this.f190b)) * 1000003;
        String str2 = this.f191c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f192d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j4 = this.f193e;
        int i7 = (hashCode3 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j7 = this.f194f;
        int i8 = (i7 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        String str4 = this.f195g;
        return (str4 != null ? str4.hashCode() : 0) ^ i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f189a);
        sb.append(", registrationStatus=");
        int i7 = this.f190b;
        sb.append(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb.append(", authToken=");
        sb.append(this.f191c);
        sb.append(", refreshToken=");
        sb.append(this.f192d);
        sb.append(", expiresInSecs=");
        sb.append(this.f193e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f194f);
        sb.append(", fisError=");
        return p.b(sb, this.f195g, "}");
    }
}
