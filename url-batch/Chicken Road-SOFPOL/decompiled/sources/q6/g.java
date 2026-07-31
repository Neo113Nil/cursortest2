package q6;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class g extends c implements f, w6.a, c6.c {

    /* renamed from: j, reason: collision with root package name */
    public final int f6195j;

    /* renamed from: k, reason: collision with root package name */
    public final int f6196k;

    public g(int i, Class cls, String str, String str2, int i8) {
        this(i, b.f6187d, cls, str, str2, i8, 0);
    }

    @Override // q6.c
    public final w6.a a() {
        t.f6206a.getClass();
        return this;
    }

    @Override // q6.f
    public final int c() {
        return this.f6195j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f6191g.equals(gVar.f6191g) && this.f6192h.equals(gVar.f6192h) && this.f6196k == gVar.f6196k && this.f6195j == gVar.f6195j && i.a(this.f6189e, gVar.f6189e) && e().equals(gVar.e());
        }
        if (!(obj instanceof g)) {
            return false;
        }
        w6.a aVar = this.f6188d;
        if (aVar == null) {
            a();
            this.f6188d = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    public final int hashCode() {
        e();
        return this.f6192h.hashCode() + ((this.f6191g.hashCode() + (e().hashCode() * 31)) * 31);
    }

    public final String toString() {
        w6.a aVar = this.f6188d;
        if (aVar == null) {
            a();
            this.f6188d = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f6191g;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }

    public g(int i, Object obj, Class cls, String str, String str2, int i8, int i9) {
        super(obj, cls, str, str2, (i8 & 1) == 1);
        this.f6195j = i;
        this.f6196k = 0;
    }
}
