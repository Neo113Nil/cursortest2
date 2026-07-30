package A0;

import kotlin.jvm.internal.Intrinsics;
import x0.C0995b;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final C0995b f58a;

    /* renamed from: b, reason: collision with root package name */
    public final b f59b;

    /* renamed from: c, reason: collision with root package name */
    public final b f60c;

    public c(C0995b bounds, b type, b state) {
        int i2 = bounds.f8293b;
        Intrinsics.checkNotNullParameter(bounds, "featureBounds");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f58a = bounds;
        this.f59b = type;
        this.f60c = state;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        int i5 = bounds.f8294c;
        int i7 = bounds.f8292a;
        if (i5 - i7 == 0 && bounds.f8295d - i2 == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (i7 != 0 && i2 != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        c cVar = (c) obj;
        return Intrinsics.a(this.f58a, cVar.f58a) && Intrinsics.a(this.f59b, cVar.f59b) && Intrinsics.a(this.f60c, cVar.f60c);
    }

    public final int hashCode() {
        return this.f60c.hashCode() + ((this.f59b.hashCode() + (this.f58a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return c.class.getSimpleName() + " { " + this.f58a + ", type=" + this.f59b + ", state=" + this.f60c + " }";
    }
}
