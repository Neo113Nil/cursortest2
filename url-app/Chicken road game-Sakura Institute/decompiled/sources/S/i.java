package S;

import A.AbstractC0017m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i implements o {

    /* renamed from: a, reason: collision with root package name */
    public final o f3973a;

    /* renamed from: b, reason: collision with root package name */
    public final o f3974b;

    public i(o oVar, o oVar2) {
        this.f3973a = oVar;
        this.f3974b = oVar2;
    }

    @Override // S.o
    public final Object e(Object obj, Function2 function2) {
        return this.f3974b.e(this.f3973a.e(obj, function2), function2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (Intrinsics.a(this.f3973a, iVar.f3973a) && Intrinsics.a(this.f3974b, iVar.f3974b)) {
                return true;
            }
        }
        return false;
    }

    @Override // S.o
    public final boolean g(Function1 function1) {
        return this.f3973a.g(function1) && this.f3974b.g(function1);
    }

    public final int hashCode() {
        return (this.f3974b.hashCode() * 31) + this.f3973a.hashCode();
    }

    public final String toString() {
        return AbstractC0017m.m(new StringBuilder("["), (String) e("", h.f3972d), ']');
    }
}
