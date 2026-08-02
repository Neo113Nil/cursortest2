package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cde extends cct {
    private final Integer a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;

    public cde(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
    }

    @Override // defpackage.cct
    public final Integer a() {
        return this.a;
    }

    @Override // defpackage.cct
    public final String b() {
        return this.l;
    }

    @Override // defpackage.cct
    public final String c() {
        return this.j;
    }

    @Override // defpackage.cct
    public final String d() {
        return this.d;
    }

    @Override // defpackage.cct
    public final String e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cct) {
            cct cctVar = (cct) obj;
            if (this.a.equals(cctVar.a()) && this.b.equals(cctVar.j()) && this.c.equals(cctVar.f()) && this.d.equals(cctVar.d()) && this.e.equals(cctVar.l()) && this.f.equals(cctVar.k()) && this.g.equals(cctVar.h()) && this.h.equals(cctVar.e()) && this.i.equals(cctVar.g()) && this.j.equals(cctVar.c()) && this.k.equals(cctVar.i()) && this.l.equals(cctVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cct
    public final String f() {
        return this.c;
    }

    @Override // defpackage.cct
    public final String g() {
        return this.i;
    }

    @Override // defpackage.cct
    public final String h() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = ((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
        return this.l.hashCode() ^ (hashCode * 1000003);
    }

    @Override // defpackage.cct
    public final String i() {
        return this.k;
    }

    @Override // defpackage.cct
    public final String j() {
        return this.b;
    }

    @Override // defpackage.cct
    public final String k() {
        return this.f;
    }

    @Override // defpackage.cct
    public final String l() {
        return this.e;
    }

    public final String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.a + ", model=" + this.b + ", hardware=" + this.c + ", device=" + this.d + ", product=" + this.e + ", osBuild=" + this.f + ", manufacturer=" + this.g + ", fingerprint=" + this.h + ", locale=" + this.i + ", country=" + this.j + ", mccMnc=" + this.k + ", applicationBuild=" + this.l + "}";
    }
}
