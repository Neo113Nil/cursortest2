package f4;

import java.io.Serializable;

/* renamed from: f4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0435l implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final String f5677a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5678b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5679c;

    public C0435l(String str, String str2, String str3) {
        this.f5677a = str;
        this.f5678b = str2;
        this.f5679c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0435l)) {
            return false;
        }
        C0435l c0435l = (C0435l) obj;
        return this.f5677a.equals(c0435l.f5677a) && kotlin.jvm.internal.i.a(this.f5678b, c0435l.f5678b) && kotlin.jvm.internal.i.a(this.f5679c, c0435l.f5679c);
    }

    public final int hashCode() {
        int hashCode = this.f5677a.hashCode() * 31;
        String str = this.f5678b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5679c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + ((Object) this.f5677a) + ", " + ((Object) this.f5678b) + ", " + ((Object) this.f5679c) + ')';
    }
}
