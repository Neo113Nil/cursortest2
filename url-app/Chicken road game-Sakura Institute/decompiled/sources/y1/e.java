package y1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f9800c = new e(0.0f, new w6.a(0.0f, 0.0f));

    /* renamed from: a, reason: collision with root package name */
    public final float f9801a;

    /* renamed from: b, reason: collision with root package name */
    public final w6.a f9802b;

    public e(float f9, w6.a aVar) {
        this.f9801a = f9;
        this.f9802b = aVar;
        if (Float.isNaN(f9)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final w6.a a() {
        return this.f9802b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f9801a == eVar.f9801a && this.f9802b.equals(eVar.f9802b);
    }

    public final int hashCode() {
        return (this.f9802b.hashCode() + (Float.hashCode(this.f9801a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.f9801a + ", range=" + this.f9802b + ", steps=0)";
    }
}
