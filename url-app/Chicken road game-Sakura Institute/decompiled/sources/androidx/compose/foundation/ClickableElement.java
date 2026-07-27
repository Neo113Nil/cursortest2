package androidx.compose.foundation;

import A.AbstractC0017m;
import S.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.C0850x;
import m.W;
import p.C0935k;
import r0.T;
import y0.f;

@Metadata
/* loaded from: classes.dex */
final class ClickableElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final C0935k f5011a;

    /* renamed from: b, reason: collision with root package name */
    public final W f5012b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5013c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5014d;

    /* renamed from: e, reason: collision with root package name */
    public final f f5015e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f5016f;

    public ClickableElement(C0935k c0935k, W w4, boolean z4, String str, f fVar, Function0 function0) {
        this.f5011a = c0935k;
        this.f5012b = w4;
        this.f5013c = z4;
        this.f5014d = str;
        this.f5015e = fVar;
        this.f5016f = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return Intrinsics.a(this.f5011a, clickableElement.f5011a) && Intrinsics.a(this.f5012b, clickableElement.f5012b) && this.f5013c == clickableElement.f5013c && Intrinsics.a(this.f5014d, clickableElement.f5014d) && Intrinsics.a(this.f5015e, clickableElement.f5015e) && this.f5016f == clickableElement.f5016f;
    }

    public final int hashCode() {
        C0935k c0935k = this.f5011a;
        int hashCode = (c0935k != null ? c0935k.hashCode() : 0) * 31;
        W w4 = this.f5012b;
        int d4 = AbstractC0017m.d((hashCode + (w4 != null ? w4.hashCode() : 0)) * 31, 31, this.f5013c);
        String str = this.f5014d;
        int hashCode2 = (d4 + (str != null ? str.hashCode() : 0)) * 31;
        f fVar = this.f5015e;
        return this.f5016f.hashCode() + ((hashCode2 + (fVar != null ? Integer.hashCode(fVar.f11545a) : 0)) * 31);
    }

    @Override // r0.T
    public final n l() {
        return new C0850x(this.f5011a, this.f5012b, this.f5013c, this.f5014d, this.f5015e, this.f5016f);
    }

    @Override // r0.T
    public final void m(n nVar) {
        ((C0850x) nVar).H0(this.f5011a, this.f5012b, this.f5013c, this.f5014d, this.f5015e, this.f5016f);
    }
}
