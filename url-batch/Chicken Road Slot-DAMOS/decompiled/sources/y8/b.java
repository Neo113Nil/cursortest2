package y8;

import a2.r;
import a4.i;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f10674h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f10675a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10676b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10677c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10678d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10679e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10680f;
    public final String g;

    static {
        byte b10 = (byte) (((byte) (0 | 2)) | 1);
        if (b10 == 3) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((b10 & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        r.s(sb2, "Missing required properties:");
    }

    public b(String str, int i3, String str2, String str3, long j, long j3, String str4) {
        this.f10675a = str;
        this.f10676b = i3;
        this.f10677c = str2;
        this.f10678d = str3;
        this.f10679e = j;
        this.f10680f = j3;
        this.g = str4;
    }

    public final a a() {
        a aVar = new a();
        aVar.f10667a = this.f10675a;
        aVar.f10668b = this.f10676b;
        aVar.f10669c = this.f10677c;
        aVar.f10670d = this.f10678d;
        aVar.f10671e = this.f10679e;
        aVar.f10672f = this.f10680f;
        aVar.g = this.g;
        aVar.f10673h = (byte) 3;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = bVar.f10675a;
        String str2 = this.f10675a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!i.a(this.f10676b, bVar.f10676b)) {
            return false;
        }
        String str3 = bVar.f10677c;
        String str4 = this.f10677c;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = bVar.f10678d;
        String str6 = this.f10678d;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        if (this.f10679e != bVar.f10679e || this.f10680f != bVar.f10680f) {
            return false;
        }
        String str7 = bVar.g;
        String str8 = this.g;
        return str8 == null ? str7 == null : str8.equals(str7);
    }

    public final int hashCode() {
        String str = this.f10675a;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ i.b(this.f10676b)) * 1000003;
        String str2 = this.f10677c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f10678d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f10679e;
        int i3 = (hashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j3 = this.f10680f;
        int i10 = (i3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str4 = this.g;
        return (str4 != null ? str4.hashCode() : 0) ^ i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f10675a);
        sb2.append(", registrationStatus=");
        int i3 = this.f10676b;
        sb2.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb2.append(", authToken=");
        sb2.append(this.f10677c);
        sb2.append(", refreshToken=");
        sb2.append(this.f10678d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f10679e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f10680f);
        sb2.append(", fisError=");
        return v4.a.o(sb2, this.g, "}");
    }
}
