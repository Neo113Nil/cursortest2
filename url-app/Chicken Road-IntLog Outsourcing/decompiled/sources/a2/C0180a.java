package a2;

import O.j;
import R3.m;
import b2.AbstractC0279e;

/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0180a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3848a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3849b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3850c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3851d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3852e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3853f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3854g;

    public C0180a(String str, int i2, String str2, String str3, long j2, long j6, String str4) {
        this.f3848a = str;
        this.f3849b = i2;
        this.f3850c = str2;
        this.f3851d = str3;
        this.f3852e = j2;
        this.f3853f = j6;
        this.f3854g = str4;
    }

    public final m a() {
        m mVar = new m();
        mVar.f2627b = this.f3848a;
        mVar.f2628c = this.f3849b;
        mVar.f2629d = this.f3850c;
        mVar.f2630e = this.f3851d;
        mVar.f2631f = Long.valueOf(this.f3852e);
        mVar.f2632g = Long.valueOf(this.f3853f);
        mVar.f2633h = this.f3854g;
        return mVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0180a)) {
            return false;
        }
        C0180a c0180a = (C0180a) obj;
        String str = this.f3848a;
        if (str != null ? str.equals(c0180a.f3848a) : c0180a.f3848a == null) {
            if (j.a(this.f3849b, c0180a.f3849b)) {
                String str2 = c0180a.f3850c;
                String str3 = this.f3850c;
                if (str3 != null ? str3.equals(str2) : str2 == null) {
                    String str4 = c0180a.f3851d;
                    String str5 = this.f3851d;
                    if (str5 != null ? str5.equals(str4) : str4 == null) {
                        if (this.f3852e == c0180a.f3852e && this.f3853f == c0180a.f3853f) {
                            String str6 = c0180a.f3854g;
                            String str7 = this.f3854g;
                            if (str7 == null) {
                                if (str6 == null) {
                                    return true;
                                }
                            } else if (str7.equals(str6)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f3848a;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ j.b(this.f3849b)) * 1000003;
        String str2 = this.f3850c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f3851d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j2 = this.f3852e;
        int i2 = (hashCode3 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j6 = this.f3853f;
        int i3 = (i2 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        String str4 = this.f3854g;
        return (str4 != null ? str4.hashCode() : 0) ^ i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f3848a);
        sb.append(", registrationStatus=");
        int i2 = this.f3849b;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb.append(", authToken=");
        sb.append(this.f3850c);
        sb.append(", refreshToken=");
        sb.append(this.f3851d);
        sb.append(", expiresInSecs=");
        sb.append(this.f3852e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f3853f);
        sb.append(", fisError=");
        return AbstractC0279e.h(sb, this.f3854g, "}");
    }
}
