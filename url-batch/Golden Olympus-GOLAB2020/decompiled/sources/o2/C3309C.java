package o2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o2.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3309C {

    /* renamed from: a, reason: collision with root package name */
    public final Object f41963a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f41964b;

    public C3309C(Object obj, Function1 function1) {
        this.f41963a = obj;
        this.f41964b = function1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3309C)) {
            return false;
        }
        C3309C c3309c = (C3309C) obj;
        return Intrinsics.areEqual(this.f41963a, c3309c.f41963a) && Intrinsics.areEqual(this.f41964b, c3309c.f41964b);
    }

    public int hashCode() {
        Object obj = this.f41963a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f41964b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f41963a + ", onCancellation=" + this.f41964b + ')';
    }
}
