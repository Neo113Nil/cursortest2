package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wd1 implements cq0 {
    public final float a;

    public wd1(float f) {
        this.a = f;
    }

    @Override // defpackage.cq0
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.cq0
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wd1) && Float.compare(this.a, ((wd1) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return q40.n(new StringBuilder("LinearFontScaleConverter(fontScale="), this.a, ')');
    }
}
