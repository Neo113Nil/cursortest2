package x1;

import o2.m0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f23118a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23119b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23120c;

    public e(String str, String str2, String str3) {
        this.f23118a = str;
        this.f23119b = str2;
        this.f23120c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return m0.c(this.f23118a, eVar.f23118a) && m0.c(this.f23119b, eVar.f23119b) && m0.c(this.f23120c, eVar.f23120c);
    }

    public int hashCode() {
        int hashCode = this.f23118a.hashCode() * 31;
        String str = this.f23119b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23120c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
