package w6;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f9519a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9520b;

    public a(float f9, float f10) {
        this.f9519a = f9;
        this.f9520b = f10;
    }

    public static boolean a(Float f9, Float f10) {
        return f9.floatValue() <= f10.floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        float f9 = this.f9519a;
        float f10 = this.f9520b;
        if (f9 > f10) {
            a aVar = (a) obj;
            if (aVar.f9519a > aVar.f9520b) {
                return true;
            }
        }
        a aVar2 = (a) obj;
        return f9 == aVar2.f9519a && f10 == aVar2.f9520b;
    }

    public final int hashCode() {
        float f9 = this.f9519a;
        float f10 = this.f9520b;
        if (f9 > f10) {
            return -1;
        }
        return Float.hashCode(f10) + (Float.hashCode(f9) * 31);
    }

    public final String toString() {
        return this.f9519a + ".." + this.f9520b;
    }
}
