package x1;

import o2.m0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f23131a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23132b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23133c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23134d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23135e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f23131a = str;
        this.f23132b = str2;
        this.f23133c = str3;
        this.f23134d = str4;
        this.f23135e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return m0.c(this.f23131a, hVar.f23131a) && m0.c(this.f23132b, hVar.f23132b) && m0.c(this.f23133c, hVar.f23133c) && m0.c(this.f23134d, hVar.f23134d) && m0.c(this.f23135e, hVar.f23135e);
    }

    public int hashCode() {
        String str = this.f23131a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23132b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23133c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f23134d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f23135e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
