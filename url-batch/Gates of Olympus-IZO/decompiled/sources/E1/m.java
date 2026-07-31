package E1;

import H2.AbstractC0080b;
import h0.C0425f;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f769a;

    /* renamed from: b, reason: collision with root package name */
    public final String f770b;

    /* renamed from: c, reason: collision with root package name */
    public final C0425f f771c;

    public m(String str, String str2, C0425f c0425f) {
        this.f769a = str;
        this.f770b = str2;
        this.f771c = c0425f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Z1.i.a(this.f769a, mVar.f769a) && Z1.i.a(this.f770b, mVar.f770b) && Z1.i.a(this.f771c, mVar.f771c);
    }

    public final int hashCode() {
        return this.f771c.hashCode() + AbstractC0080b.e(this.f769a.hashCode() * 31, 31, this.f770b);
    }

    public final String toString() {
        return "Tab(route=" + this.f769a + ", label=" + this.f770b + ", icon=" + this.f771c + ")";
    }
}
