package d1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f implements l {

    /* renamed from: a, reason: collision with root package name */
    public final l f3299a;

    /* renamed from: b, reason: collision with root package name */
    public final l f3300b;

    public f(l lVar, l lVar2) {
        this.f3299a = lVar;
        this.f3300b = lVar2;
    }

    @Override // d1.l
    public final boolean a(Function1 function1) {
        return this.f3299a.a(function1) && this.f3300b.a(function1);
    }

    @Override // d1.l
    public final Object b(Object obj, Function2 function2) {
        return this.f3300b.b(this.f3299a.b(obj, function2), function2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f3299a.equals(fVar.f3299a) && Intrinsics.a(this.f3300b, fVar.f3300b);
    }

    public final int hashCode() {
        return (this.f3300b.hashCode() * 31) + this.f3299a.hashCode();
    }

    public final String toString() {
        return n0.l.h(new StringBuilder("["), (String) b("", e.f3298d), ']');
    }
}
