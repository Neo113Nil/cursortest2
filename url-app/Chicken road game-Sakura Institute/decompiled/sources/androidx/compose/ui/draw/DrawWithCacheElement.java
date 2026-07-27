package androidx.compose.ui.draw;

import S.n;
import W.b;
import W.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r0.T;

@Metadata
/* loaded from: classes.dex */
final class DrawWithCacheElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f5158a;

    public DrawWithCacheElement(Function1 function1) {
        this.f5158a = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && Intrinsics.a(this.f5158a, ((DrawWithCacheElement) obj).f5158a);
    }

    public final int hashCode() {
        return this.f5158a.hashCode();
    }

    @Override // r0.T
    public final n l() {
        return new b(new c(), this.f5158a);
    }

    @Override // r0.T
    public final void m(n nVar) {
        b bVar = (b) nVar;
        bVar.f4192w = this.f5158a;
        bVar.B0();
    }

    public final String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.f5158a + ')';
    }
}
