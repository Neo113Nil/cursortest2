package r5;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final q5.a f8175a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8176b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Rect rect, float f3) {
        this(new q5.a(rect), f3);
        rect.getClass();
    }

    public final Rect a() {
        q5.a aVar = this.f8175a;
        aVar.getClass();
        return new Rect(aVar.f8023a, aVar.f8024b, aVar.f8025c, aVar.f8026d);
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
        return Intrinsics.a(this.f8175a, aVar.f8175a) && this.f8176b == aVar.f8176b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8176b) + (this.f8175a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WindowMetrics(_bounds=");
        sb2.append(this.f8175a);
        sb2.append(", density=");
        return v4.a.l(sb2, this.f8176b, ')');
    }

    public a(q5.a aVar, float f3) {
        this.f8175a = aVar;
        this.f8176b = f3;
    }
}
