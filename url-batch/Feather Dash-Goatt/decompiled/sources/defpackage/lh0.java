package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class lh0 implements q20 {
    public final float a;

    public lh0(float f) {
        this.a = f;
    }

    @Override // defpackage.q20
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.q20
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lh0) && Float.compare(this.a, ((lh0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return qy0.l(new StringBuilder("LinearFontScaleConverter(fontScale="), this.a, ')');
    }
}
