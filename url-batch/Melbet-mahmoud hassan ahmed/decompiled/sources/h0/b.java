package h0;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f16727a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16728b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16729c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16730d;

    public b(boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f16727a = z6;
        this.f16728b = z7;
        this.f16729c = z8;
        this.f16730d = z9;
    }

    public boolean a() {
        return this.f16727a;
    }

    public boolean b() {
        return this.f16729c;
    }

    public boolean c() {
        return this.f16730d;
    }

    public boolean d() {
        return this.f16728b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f16727a == bVar.f16727a && this.f16728b == bVar.f16728b && this.f16729c == bVar.f16729c && this.f16730d == bVar.f16730d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r02 = this.f16727a;
        int i7 = r02;
        if (this.f16728b) {
            i7 = r02 + 16;
        }
        int i8 = i7;
        if (this.f16729c) {
            i8 = i7 + 256;
        }
        return this.f16730d ? i8 + 4096 : i8;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f16727a), Boolean.valueOf(this.f16728b), Boolean.valueOf(this.f16729c), Boolean.valueOf(this.f16730d));
    }
}
