package z1;

import f0.C0585f;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z1.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1367K {

    /* renamed from: a, reason: collision with root package name */
    public final String f11827a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11828b;

    /* renamed from: c, reason: collision with root package name */
    public final C0585f f11829c;

    public C1367K(String route, String label, C0585f icon) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f11827a = route;
        this.f11828b = label;
        this.f11829c = icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1367K)) {
            return false;
        }
        C1367K c1367k = (C1367K) obj;
        return Intrinsics.a(this.f11827a, c1367k.f11827a) && Intrinsics.a(this.f11828b, c1367k.f11828b) && Intrinsics.a(this.f11829c, c1367k.f11829c);
    }

    public final int hashCode() {
        return this.f11829c.hashCode() + r0.B.a(this.f11828b, this.f11827a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Tab(route=" + this.f11827a + ", label=" + this.f11828b + ", icon=" + this.f11829c + ")";
    }
}
