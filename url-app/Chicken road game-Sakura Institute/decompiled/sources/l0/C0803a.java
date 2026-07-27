package l0;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0803a implements InterfaceC0817o {

    /* renamed from: b, reason: collision with root package name */
    public final int f7884b;

    public C0803a(int i2) {
        this.f7884b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0803a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f7884b == ((C0803a) obj).f7884b;
    }

    public final int hashCode() {
        return this.f7884b;
    }

    public final String toString() {
        return AbstractC0017m.l(new StringBuilder("AndroidPointerIcon(type="), this.f7884b, ')');
    }
}
