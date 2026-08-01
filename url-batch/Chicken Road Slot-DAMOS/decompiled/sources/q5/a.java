package q5;

import android.graphics.Rect;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f8023a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8024b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8025c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8026d;

    static {
        new a(0, 0, 0, 0);
    }

    public a(int i3, int i10, int i11, int i12) {
        this.f8023a = i3;
        this.f8024b = i10;
        this.f8025c = i11;
        this.f8026d = i12;
        if (i3 > i11) {
            i0.d(i3, i11, ", right: ", "Left must be less than or equal to right, left: ");
            throw null;
        }
        if (i10 <= i12) {
            return;
        }
        i0.d(i10, i12, ", bottom: ", "top must be less than or equal to bottom, top: ");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        a aVar = (a) obj;
        return this.f8023a == aVar.f8023a && this.f8024b == aVar.f8024b && this.f8025c == aVar.f8025c && this.f8026d == aVar.f8026d;
    }

    public final int hashCode() {
        return (((((this.f8023a * 31) + this.f8024b) * 31) + this.f8025c) * 31) + this.f8026d;
    }

    public final String toString() {
        return a.class.getSimpleName() + " { [" + this.f8023a + ',' + this.f8024b + ',' + this.f8025c + ',' + this.f8026d + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
