package G0;

import A0.C0036g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final C0036g f3027a;

    /* renamed from: b, reason: collision with root package name */
    public final s f3028b;

    public F(C0036g c0036g, s sVar) {
        this.f3027a = c0036g;
        this.f3028b = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f4 = (F) obj;
        return Intrinsics.a(this.f3027a, f4.f3027a) && Intrinsics.a(this.f3028b, f4.f3028b);
    }

    public final int hashCode() {
        return this.f3028b.hashCode() + (this.f3027a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f3027a) + ", offsetMapping=" + this.f3028b + ')';
    }
}
