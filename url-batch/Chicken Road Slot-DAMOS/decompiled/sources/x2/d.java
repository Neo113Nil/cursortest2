package x2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: d, reason: collision with root package name */
    public final float f10317d;

    /* renamed from: e, reason: collision with root package name */
    public final float f10318e;

    public d(float f3, float f10) {
        this.f10317d = f3;
        this.f10318e = f10;
    }

    @Override // x2.c
    public final float d() {
        return this.f10318e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f10317d, dVar.f10317d) == 0 && Float.compare(this.f10318e, dVar.f10318e) == 0;
    }

    @Override // x2.c
    public final float g() {
        return this.f10317d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10318e) + (Float.hashCode(this.f10317d) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DensityImpl(density=");
        sb2.append(this.f10317d);
        sb2.append(", fontScale=");
        return v4.a.l(sb2, this.f10318e, ')');
    }
}
