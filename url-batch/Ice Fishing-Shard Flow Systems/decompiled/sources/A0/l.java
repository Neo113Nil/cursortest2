package A0;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final List f80a;

    public l(List displayFeatures) {
        Intrinsics.checkNotNullParameter(displayFeatures, "displayFeatures");
        this.f80a = displayFeatures;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !l.class.equals(obj.getClass())) {
            return false;
        }
        return Intrinsics.a(this.f80a, ((l) obj).f80a);
    }

    public final int hashCode() {
        return this.f80a.hashCode();
    }

    public final String toString() {
        return CollectionsKt.s(this.f80a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
