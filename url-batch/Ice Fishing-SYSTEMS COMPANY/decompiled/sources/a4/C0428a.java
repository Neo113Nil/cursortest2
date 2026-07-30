package a4;

import c7.m;
import t0.AbstractC5051n;
import u.AbstractC5088e;

/* renamed from: a4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0428a {

    /* renamed from: a, reason: collision with root package name */
    public final String f4376a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4377b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4378c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4379d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4380e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4381f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4382g;

    public C0428a(String str, int i, String str2, String str3, long j9, long j10, String str4) {
        this.f4376a = str;
        this.f4377b = i;
        this.f4378c = str2;
        this.f4379d = str3;
        this.f4380e = j9;
        this.f4381f = j10;
        this.f4382g = str4;
    }

    public final m a() {
        m mVar = new m();
        mVar.f5719b = this.f4376a;
        mVar.f5720c = this.f4377b;
        mVar.f5721d = this.f4378c;
        mVar.f5722e = this.f4379d;
        mVar.f5723f = Long.valueOf(this.f4380e);
        mVar.f5724g = Long.valueOf(this.f4381f);
        mVar.f5725h = this.f4382g;
        return mVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0428a)) {
            return false;
        }
        C0428a c0428a = (C0428a) obj;
        String str = this.f4376a;
        if (str == null) {
            if (c0428a.f4376a != null) {
                return false;
            }
        } else if (!str.equals(c0428a.f4376a)) {
            return false;
        }
        if (!AbstractC5088e.a(this.f4377b, c0428a.f4377b)) {
            return false;
        }
        String str2 = c0428a.f4378c;
        String str3 = this.f4378c;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        String str4 = c0428a.f4379d;
        String str5 = this.f4379d;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        if (this.f4380e != c0428a.f4380e || this.f4381f != c0428a.f4381f) {
            return false;
        }
        String str6 = c0428a.f4382g;
        String str7 = this.f4382g;
        return str7 == null ? str6 == null : str7.equals(str6);
    }

    public final int hashCode() {
        String str = this.f4376a;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ AbstractC5088e.d(this.f4377b)) * 1000003;
        String str2 = this.f4378c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f4379d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j9 = this.f4380e;
        int i = (hashCode3 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f4381f;
        int i4 = (i ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str4 = this.f4382g;
        return (str4 != null ? str4.hashCode() : 0) ^ i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f4376a);
        sb.append(", registrationStatus=");
        int i = this.f4377b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb.append(", authToken=");
        sb.append(this.f4378c);
        sb.append(", refreshToken=");
        sb.append(this.f4379d);
        sb.append(", expiresInSecs=");
        sb.append(this.f4380e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f4381f);
        sb.append(", fisError=");
        return AbstractC5051n.g(sb, this.f4382g, "}");
    }
}
