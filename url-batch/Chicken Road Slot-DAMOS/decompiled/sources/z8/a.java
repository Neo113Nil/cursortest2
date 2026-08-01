package z8;

import a4.i;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10950a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10951b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10952c;

    /* renamed from: d, reason: collision with root package name */
    public final b f10953d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10954e;

    public a(String str, String str2, String str3, b bVar, int i3) {
        this.f10950a = str;
        this.f10951b = str2;
        this.f10952c = str3;
        this.f10953d = bVar;
        this.f10954e = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = aVar.f10950a;
        String str2 = this.f10950a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = aVar.f10951b;
        String str4 = this.f10951b;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = aVar.f10952c;
        String str6 = this.f10952c;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        b bVar = aVar.f10953d;
        b bVar2 = this.f10953d;
        if (bVar2 == null) {
            if (bVar != null) {
                return false;
            }
        } else if (!bVar2.equals(bVar)) {
            return false;
        }
        int i3 = aVar.f10954e;
        int i10 = this.f10954e;
        return i10 == 0 ? i3 == 0 : i.a(i10, i3);
    }

    public final int hashCode() {
        String str = this.f10950a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f10951b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f10952c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.f10953d;
        int hashCode4 = (hashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        int i3 = this.f10954e;
        return (i3 != 0 ? i.b(i3) : 0) ^ hashCode4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationResponse{uri=");
        sb2.append(this.f10950a);
        sb2.append(", fid=");
        sb2.append(this.f10951b);
        sb2.append(", refreshToken=");
        sb2.append(this.f10952c);
        sb2.append(", authToken=");
        sb2.append(this.f10953d);
        sb2.append(", responseCode=");
        int i3 = this.f10954e;
        sb2.append(i3 != 1 ? i3 != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb2.append("}");
        return sb2.toString();
    }
}
