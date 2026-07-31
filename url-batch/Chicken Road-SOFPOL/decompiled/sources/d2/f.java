package d2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f2119c = new f(0.0f, new v6.a(0.0f));

    /* renamed from: a, reason: collision with root package name */
    public final float f2120a;

    /* renamed from: b, reason: collision with root package name */
    public final v6.a f2121b;

    public f(float f6, v6.a aVar) {
        this.f2120a = f6;
        this.f2121b = aVar;
        if (Float.isNaN(f6)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f2120a == fVar.f2120a && this.f2121b.equals(fVar.f2121b);
    }

    public final int hashCode() {
        return (this.f2121b.hashCode() + (Float.hashCode(this.f2120a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.f2120a + ", range=" + this.f2121b + ", steps=0)";
    }
}
