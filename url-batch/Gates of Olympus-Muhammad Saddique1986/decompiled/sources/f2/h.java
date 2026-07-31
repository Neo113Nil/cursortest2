package f2;

import l2.InterfaceC0600a;

/* loaded from: classes.dex */
public abstract class h extends b implements g, InterfaceC0600a, R1.e {

    /* renamed from: j, reason: collision with root package name */
    public final int f5822j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5823k;

    public h(int i3, Class cls, String str, String str2, int i4) {
        this(i3, i4, cls, C0434a.f5811d, str, str2);
    }

    @Override // f2.b
    public final InterfaceC0600a a() {
        v.f5833a.getClass();
        return this;
    }

    @Override // f2.g
    public final int d() {
        return this.f5822j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f5815g.equals(hVar.f5815g) && this.f5816h.equals(hVar.f5816h) && this.f5823k == hVar.f5823k && this.f5822j == hVar.f5822j && j.a(this.f5813e, hVar.f5813e) && c().equals(hVar.c());
        }
        if (!(obj instanceof h)) {
            return false;
        }
        InterfaceC0600a interfaceC0600a = this.f5812d;
        if (interfaceC0600a == null) {
            a();
            this.f5812d = this;
            interfaceC0600a = this;
        }
        return obj.equals(interfaceC0600a);
    }

    public final int hashCode() {
        c();
        return this.f5816h.hashCode() + A.k.d(c().hashCode() * 31, 31, this.f5815g);
    }

    public final String toString() {
        InterfaceC0600a interfaceC0600a = this.f5812d;
        if (interfaceC0600a == null) {
            a();
            this.f5812d = this;
            interfaceC0600a = this;
        }
        if (interfaceC0600a != this) {
            return interfaceC0600a.toString();
        }
        String str = this.f5815g;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }

    public h(int i3, int i4, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i4 & 1) == 1);
        this.f5822j = i3;
        this.f5823k = 0;
    }
}
