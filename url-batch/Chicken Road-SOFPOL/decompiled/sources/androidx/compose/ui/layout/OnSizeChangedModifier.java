package androidx.compose.ui.layout;

import p6.c;
import u1.i0;
import w1.x0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
final class OnSizeChangedModifier extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f559a;

    public OnSizeChangedModifier(c cVar) {
        this.f559a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.f559a == ((OnSizeChangedModifier) obj).f559a;
        }
        return false;
    }

    @Override // w1.x0
    public final l f() {
        i0 i0Var = new i0();
        i0Var.f7223r = this.f559a;
        long j7 = Integer.MIN_VALUE;
        i0Var.f7224s = (j7 & 4294967295L) | (j7 << 32);
        return i0Var;
    }

    @Override // w1.x0
    public final void g(l lVar) {
        i0 i0Var = (i0) lVar;
        i0Var.f7223r = this.f559a;
        long j7 = Integer.MIN_VALUE;
        i0Var.f7224s = (j7 & 4294967295L) | (j7 << 32);
    }

    public final int hashCode() {
        return this.f559a.hashCode();
    }
}
