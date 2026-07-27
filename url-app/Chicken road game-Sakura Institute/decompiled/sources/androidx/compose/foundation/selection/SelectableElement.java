package androidx.compose.foundation.selection;

import A.AbstractC0017m;
import S.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.W;
import p.C0935k;
import r0.AbstractC1065f;
import r0.T;
import u.C1214b;
import y0.f;

@Metadata
/* loaded from: classes.dex */
final class SelectableElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5108a;

    /* renamed from: b, reason: collision with root package name */
    public final C0935k f5109b;

    /* renamed from: c, reason: collision with root package name */
    public final W f5110c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5111d;

    /* renamed from: e, reason: collision with root package name */
    public final f f5112e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f5113f;

    public SelectableElement(boolean z4, C0935k c0935k, W w4, boolean z5, f fVar, Function0 function0) {
        this.f5108a = z4;
        this.f5109b = c0935k;
        this.f5110c = w4;
        this.f5111d = z5;
        this.f5112e = fVar;
        this.f5113f = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.f5108a == selectableElement.f5108a && Intrinsics.a(this.f5109b, selectableElement.f5109b) && Intrinsics.a(this.f5110c, selectableElement.f5110c) && this.f5111d == selectableElement.f5111d && Intrinsics.a(this.f5112e, selectableElement.f5112e) && this.f5113f == selectableElement.f5113f;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f5108a) * 31;
        C0935k c0935k = this.f5109b;
        int hashCode2 = (hashCode + (c0935k != null ? c0935k.hashCode() : 0)) * 31;
        W w4 = this.f5110c;
        int d4 = AbstractC0017m.d((hashCode2 + (w4 != null ? w4.hashCode() : 0)) * 31, 31, this.f5111d);
        f fVar = this.f5112e;
        return this.f5113f.hashCode() + ((d4 + (fVar != null ? Integer.hashCode(fVar.f11545a) : 0)) * 31);
    }

    @Override // r0.T
    public final n l() {
        C1214b c1214b = new C1214b(this.f5109b, this.f5110c, this.f5111d, null, this.f5112e, this.f5113f);
        c1214b.f10887N = this.f5108a;
        return c1214b;
    }

    @Override // r0.T
    public final void m(n nVar) {
        C1214b c1214b = (C1214b) nVar;
        boolean z4 = c1214b.f10887N;
        boolean z5 = this.f5108a;
        if (z4 != z5) {
            c1214b.f10887N = z5;
            AbstractC1065f.p(c1214b);
        }
        c1214b.H0(this.f5109b, this.f5110c, this.f5111d, null, this.f5112e, this.f5113f);
    }
}
