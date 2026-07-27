package androidx.compose.ui.focus;

import S.n;
import X.p;
import X.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import r0.T;

@Metadata
/* loaded from: classes.dex */
final class FocusRequesterElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final p f5173a;

    public FocusRequesterElement(p pVar) {
        this.f5173a = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && Intrinsics.a(this.f5173a, ((FocusRequesterElement) obj).f5173a);
    }

    public final int hashCode() {
        return this.f5173a.hashCode();
    }

    @Override // r0.T
    public final n l() {
        r rVar = new r();
        rVar.f4347t = this.f5173a;
        return rVar;
    }

    @Override // r0.T
    public final void m(n nVar) {
        r rVar = (r) nVar;
        rVar.f4347t.f4346a.m(rVar);
        p pVar = this.f5173a;
        rVar.f4347t = pVar;
        pVar.f4346a.b(rVar);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f5173a + ')';
    }
}
