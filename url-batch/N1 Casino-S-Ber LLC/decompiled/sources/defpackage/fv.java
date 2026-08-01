package defpackage;

import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class fv {
    public static final List h = cb.F0("#FECDD3", "#FED7AA", "#FEF08A", "#BBF7D0", "#BAE6FD", "#DDD6FE", "#FBCFE8", "#A7F3D0");
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final long f;
    public final long g;

    public fv(String str, String str2, String str3, String str4, boolean z, long j, long j2) {
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = j;
        this.g = j2;
    }

    public static fv a(fv fvVar, String str, String str2, String str3, boolean z, long j, int i) {
        String str4 = fvVar.a;
        if ((i & 2) != 0) {
            str = fvVar.b;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = fvVar.c;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = fvVar.d;
        }
        String str7 = str3;
        long j2 = fvVar.f;
        long j3 = (i & 64) != 0 ? fvVar.g : j;
        fvVar.getClass();
        str7.getClass();
        return new fv(str4, str5, str6, str7, z, j2, j3);
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.a);
        jSONObject.put("title", this.b);
        jSONObject.put("content", this.c);
        jSONObject.put("color", this.d);
        jSONObject.put("pinned", this.e);
        jSONObject.put("createdAt", this.f);
        jSONObject.put("updatedAt", this.g);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv)) {
            return false;
        }
        fv fvVar = (fv) obj;
        return this.a.equals(fvVar.a) && this.b.equals(fvVar.b) && this.c.equals(fvVar.c) && zo.b(this.d, fvVar.d) && this.e == fvVar.e && this.f == fvVar.f && this.g == fvVar.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + ((Long.hashCode(this.f) + ((Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Note(id=" + this.a + ", title=" + this.b + ", content=" + this.c + ", colorHex=" + this.d + ", isPinned=" + this.e + ", createdAt=" + this.f + ", updatedAt=" + this.g + ")";
    }
}
