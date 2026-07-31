package z0;

import H2.AbstractC0080b;
import e2.C0377a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final e f8949d = new e(0.0f, new C0377a(0.0f, 0.0f));

    /* renamed from: a, reason: collision with root package name */
    public final float f8950a;

    /* renamed from: b, reason: collision with root package name */
    public final C0377a f8951b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8952c = 0;

    public e(float f3, C0377a c0377a) {
        this.f8950a = f3;
        this.f8951b = c0377a;
        if (Float.isNaN(f3)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final C0377a a() {
        return this.f8951b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f8950a == eVar.f8950a && Z1.i.a(this.f8951b, eVar.f8951b) && this.f8952c == eVar.f8952c;
    }

    public final int hashCode() {
        return ((this.f8951b.hashCode() + (Float.hashCode(this.f8950a) * 31)) * 31) + this.f8952c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.f8950a);
        sb.append(", range=");
        sb.append(this.f8951b);
        sb.append(", steps=");
        return AbstractC0080b.k(sb, this.f8952c, ')');
    }
}
