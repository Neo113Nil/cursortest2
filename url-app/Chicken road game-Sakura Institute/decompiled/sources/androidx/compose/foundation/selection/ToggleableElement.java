package androidx.compose.foundation.selection;

import A.AbstractC0017m;
import S.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;
import p.C0935k;
import r0.AbstractC1065f;
import r0.T;
import u.C1215c;
import y0.f;

@Metadata
/* loaded from: classes.dex */
final class ToggleableElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5114a;

    /* renamed from: b, reason: collision with root package name */
    public final C0935k f5115b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5116c;

    /* renamed from: d, reason: collision with root package name */
    public final f f5117d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f5118e;

    public ToggleableElement(boolean z4, C0935k c0935k, boolean z5, f fVar, Function1 function1) {
        this.f5114a = z4;
        this.f5115b = c0935k;
        this.f5116c = z5;
        this.f5117d = fVar;
        this.f5118e = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.f5114a == toggleableElement.f5114a && Intrinsics.a(this.f5115b, toggleableElement.f5115b) && Intrinsics.a(null, null) && this.f5116c == toggleableElement.f5116c && this.f5117d.equals(toggleableElement.f5117d) && this.f5118e == toggleableElement.f5118e;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f5114a) * 31;
        C0935k c0935k = this.f5115b;
        return this.f5118e.hashCode() + AbstractC0784j.c(this.f5117d.f11545a, AbstractC0017m.d((hashCode + (c0935k != null ? c0935k.hashCode() : 0)) * 961, 31, this.f5116c), 31);
    }

    @Override // r0.T
    public final n l() {
        f fVar = this.f5117d;
        return new C1215c(this.f5114a, this.f5115b, this.f5116c, fVar, this.f5118e);
    }

    @Override // r0.T
    public final void m(n nVar) {
        C1215c c1215c = (C1215c) nVar;
        boolean z4 = c1215c.f10888N;
        boolean z5 = this.f5114a;
        if (z4 != z5) {
            c1215c.f10888N = z5;
            AbstractC1065f.p(c1215c);
        }
        c1215c.f10889O = this.f5118e;
        c1215c.H0(this.f5115b, null, this.f5116c, null, this.f5117d, c1215c.f10890P);
    }
}
