package j2;

import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f4936b = new f(new be.a());

    /* renamed from: a, reason: collision with root package name */
    public final be.a f4937a;

    public f(be.a aVar) {
        this.f4937a = aVar;
        if (Float.isNaN(0.0f)) {
            a1.e("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f4937a.equals(((f) obj).f4937a);
    }

    public final int hashCode() {
        return (this.f4937a.hashCode() + (Float.hashCode(0.0f) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=0.0, range=" + this.f4937a + ", steps=0)";
    }
}
