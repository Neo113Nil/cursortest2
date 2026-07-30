package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class or implements nr {
    public final float d;
    public final float e;

    public or(float f, float f2) {
        this.d = f;
        this.e = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or)) {
            return false;
        }
        or orVar = (or) obj;
        return Float.compare(this.d, orVar.d) == 0 && Float.compare(this.e, orVar.e) == 0;
    }

    @Override // defpackage.nr
    public final float f() {
        return this.e;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + (Float.hashCode(this.d) * 31);
    }

    @Override // defpackage.nr
    public final float k() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.d);
        sb.append(", fontScale=");
        return qy0.l(sb, this.e, ')');
    }
}
