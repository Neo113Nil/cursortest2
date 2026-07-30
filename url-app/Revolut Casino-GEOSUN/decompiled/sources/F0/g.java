package F0;

import u0.InterfaceC0241a;

/* loaded from: classes.dex */
public abstract class g extends c implements f, J0.a, InterfaceC0241a {

    /* renamed from: k, reason: collision with root package name */
    public final int f316k;

    /* renamed from: l, reason: collision with root package name */
    public final int f317l;

    public g(int i2, Class cls, String str, String str2, int i3) {
        this(i2, b.f305e, cls, str, str2, i3);
    }

    @Override // F0.c
    public final J0.a a() {
        q.f325a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f309h.equals(gVar.f309h) && this.f310i.equals(gVar.f310i) && this.f317l == gVar.f317l && this.f316k == gVar.f316k && this.f307f.equals(gVar.f307f) && b().equals(gVar.b());
        }
        if (!(obj instanceof g)) {
            return false;
        }
        J0.a aVar = this.f306e;
        if (aVar == null) {
            a();
            this.f306e = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    @Override // F0.f
    public final int h() {
        return this.f316k;
    }

    public final int hashCode() {
        b();
        return this.f310i.hashCode() + ((this.f309h.hashCode() + (b().hashCode() * 31)) * 31);
    }

    public final String toString() {
        J0.a aVar = this.f306e;
        if (aVar == null) {
            a();
            this.f306e = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f309h;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }

    public g(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f316k = i2;
        this.f317l = 0;
    }
}
