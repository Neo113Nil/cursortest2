package androidx.compose.ui.semantics;

import S.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r0.T;
import y0.C1319c;
import y0.i;
import y0.j;

@Metadata
/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends T implements j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5219a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f5220b;

    public AppendedSemanticsElement(Function1 function1, boolean z4) {
        this.f5219a = z4;
        this.f5220b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f5219a == appendedSemanticsElement.f5219a && Intrinsics.a(this.f5220b, appendedSemanticsElement.f5220b);
    }

    public final int hashCode() {
        return this.f5220b.hashCode() + (Boolean.hashCode(this.f5219a) * 31);
    }

    @Override // y0.j
    public final i j() {
        i iVar = new i();
        iVar.f11577e = this.f5219a;
        this.f5220b.invoke(iVar);
        return iVar;
    }

    @Override // r0.T
    public final n l() {
        return new C1319c(this.f5219a, false, this.f5220b);
    }

    @Override // r0.T
    public final void m(n nVar) {
        C1319c c1319c = (C1319c) nVar;
        c1319c.f11539t = this.f5219a;
        c1319c.f11541v = this.f5220b;
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f5219a + ", properties=" + this.f5220b + ')';
    }
}
