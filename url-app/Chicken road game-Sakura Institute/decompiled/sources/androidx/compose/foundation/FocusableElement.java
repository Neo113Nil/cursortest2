package androidx.compose.foundation;

import S.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m.J;
import p.C0935k;
import r0.T;

@Metadata
/* loaded from: classes.dex */
final class FocusableElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final C0935k f5017a;

    public FocusableElement(C0935k c0935k) {
        this.f5017a = c0935k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return Intrinsics.a(this.f5017a, ((FocusableElement) obj).f5017a);
        }
        return false;
    }

    public final int hashCode() {
        C0935k c0935k = this.f5017a;
        if (c0935k != null) {
            return c0935k.hashCode();
        }
        return 0;
    }

    @Override // r0.T
    public final n l() {
        return new J(this.f5017a);
    }

    @Override // r0.T
    public final void m(n nVar) {
        ((J) nVar).E0(this.f5017a);
    }
}
