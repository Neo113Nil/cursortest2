package androidx.compose.ui.layout;

import S.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import p0.C0951L;
import r0.T;
import u3.d;

@Metadata
/* loaded from: classes.dex */
final class OnSizeChangedModifier extends T {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f5211a;

    public OnSizeChangedModifier(Function1 function1) {
        this.f5211a = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.f5211a == ((OnSizeChangedModifier) obj).f5211a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5211a.hashCode();
    }

    @Override // r0.T
    public final n l() {
        C0951L c0951l = new C0951L();
        c0951l.f9001t = this.f5211a;
        c0951l.f9002u = d.c(Integer.MIN_VALUE, Integer.MIN_VALUE);
        return c0951l;
    }

    @Override // r0.T
    public final void m(n nVar) {
        C0951L c0951l = (C0951L) nVar;
        c0951l.f9001t = this.f5211a;
        c0951l.f9002u = d.c(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
