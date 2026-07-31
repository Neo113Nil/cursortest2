package g2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final a f2983a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2984b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2985c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2986d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2987e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2988f;

    /* renamed from: g, reason: collision with root package name */
    public final float f2989g;

    public o(a aVar, int i, int i8, int i9, int i10, float f6, float f8) {
        this.f2983a = aVar;
        this.f2984b = i;
        this.f2985c = i8;
        this.f2986d = i9;
        this.f2987e = i10;
        this.f2988f = f6;
        this.f2989g = f8;
    }

    public final int a(int i) {
        int i8 = this.f2985c;
        int i9 = this.f2984b;
        return r2.o.t(i, i9, i8) - i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f2983a.equals(oVar.f2983a) && this.f2984b == oVar.f2984b && this.f2985c == oVar.f2985c && this.f2986d == oVar.f2986d && this.f2987e == oVar.f2987e && Float.compare(this.f2988f, oVar.f2988f) == 0 && Float.compare(this.f2989g, oVar.f2989g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2989g) + a0.q.a(this.f2988f, a0.q.b(this.f2987e, a0.q.b(this.f2986d, a0.q.b(this.f2985c, a0.q.b(this.f2984b, this.f2983a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f2983a);
        sb.append(", startIndex=");
        sb.append(this.f2984b);
        sb.append(", endIndex=");
        sb.append(this.f2985c);
        sb.append(", startLineIndex=");
        sb.append(this.f2986d);
        sb.append(", endLineIndex=");
        sb.append(this.f2987e);
        sb.append(", top=");
        sb.append(this.f2988f);
        sb.append(", bottom=");
        return a0.q.j(sb, this.f2989g, ')');
    }
}
