package g2;

import S.i;
import r4.f;

/* renamed from: g2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0448b {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f5019h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f5020a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5021b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5022c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5023d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5024e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5025f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5026g;

    static {
        byte b7 = (byte) (((byte) (0 | 2)) | 1);
        if (b7 == 3) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((b7 & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b7 & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb));
    }

    public C0448b(String str, int i2, String str2, String str3, long j, long j7, String str4) {
        this.f5020a = str;
        this.f5021b = i2;
        this.f5022c = str2;
        this.f5023d = str3;
        this.f5024e = j;
        this.f5025f = j7;
        this.f5026g = str4;
    }

    public final C0447a a() {
        C0447a c0447a = new C0447a();
        c0447a.f5011a = this.f5020a;
        c0447a.f5012b = this.f5021b;
        c0447a.f5013c = this.f5022c;
        c0447a.f5014d = this.f5023d;
        c0447a.f5015e = this.f5024e;
        c0447a.f5016f = this.f5025f;
        c0447a.f5017g = this.f5026g;
        c0447a.f5018h = (byte) 3;
        return c0447a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0448b)) {
            return false;
        }
        C0448b c0448b = (C0448b) obj;
        String str = this.f5020a;
        if (str == null) {
            if (c0448b.f5020a != null) {
                return false;
            }
        } else if (!str.equals(c0448b.f5020a)) {
            return false;
        }
        int i2 = c0448b.f5021b;
        String str2 = c0448b.f5026g;
        String str3 = c0448b.f5023d;
        String str4 = c0448b.f5022c;
        if (!i.a(this.f5021b, i2)) {
            return false;
        }
        String str5 = this.f5022c;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        String str6 = this.f5023d;
        if (str6 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str6.equals(str3)) {
            return false;
        }
        if (this.f5024e != c0448b.f5024e || this.f5025f != c0448b.f5025f) {
            return false;
        }
        String str7 = this.f5026g;
        return str7 == null ? str2 == null : str7.equals(str2);
    }

    public final int hashCode() {
        String str = this.f5020a;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ i.b(this.f5021b)) * 1000003;
        String str2 = this.f5022c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f5023d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f5024e;
        int i2 = (hashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j7 = this.f5025f;
        int i5 = (i2 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        String str4 = this.f5026g;
        return (str4 != null ? str4.hashCode() : 0) ^ i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f5020a);
        sb.append(", registrationStatus=");
        int i2 = this.f5021b;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb.append(", authToken=");
        sb.append(this.f5022c);
        sb.append(", refreshToken=");
        sb.append(this.f5023d);
        sb.append(", expiresInSecs=");
        sb.append(this.f5024e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f5025f);
        sb.append(", fisError=");
        return f.f(sb, this.f5026g, "}");
    }
}
