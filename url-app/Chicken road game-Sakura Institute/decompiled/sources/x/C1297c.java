package x;

import D.C0174u0;
import X.s;
import kotlin.jvm.functions.Function0;
import l0.C0802C;
import l0.C0811i;
import l0.EnumC0812j;
import l0.w;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import r0.AbstractC1073n;
import r0.InterfaceC1081w;
import r0.l0;
import z2.C1412P;

/* renamed from: x.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1297c extends AbstractC1073n implements InterfaceC1081w, l0, X.c {

    /* renamed from: v, reason: collision with root package name */
    public Function0 f11398v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f11399w;

    /* renamed from: x, reason: collision with root package name */
    public final C0802C f11400x;

    public C1297c(Function0 function0) {
        this.f11398v = function0;
        C1296b c1296b = new C1296b(this, null);
        C0811i c0811i = w.f7951a;
        C0802C c0802c = new C0802C(null, null, null, c1296b);
        B0(c0802c);
        this.f11400x = c0802c;
    }

    @Override // X.c
    public final void Q(s sVar) {
        this.f11399w = sVar.a();
    }

    @Override // r0.l0
    public final void S() {
        this.f11400x.S();
    }

    @Override // r0.l0
    public final void Z(C0811i c0811i, EnumC0812j enumC0812j, long j4) {
        this.f11400x.Z(c0811i, enumC0812j, j4);
    }

    @Override // r0.InterfaceC1081w
    public final InterfaceC0946G i(InterfaceC0947H interfaceC0947H, InterfaceC0944E interfaceC0944E, long j4) {
        InterfaceC0946G t4;
        int l4 = interfaceC0947H.l(androidx.compose.foundation.text.handwriting.a.f5125a);
        int l5 = interfaceC0947H.l(androidx.compose.foundation.text.handwriting.a.f5126b);
        int i2 = l5 * 2;
        int i4 = l4 * 2;
        AbstractC0954O a4 = interfaceC0944E.a(u3.d.Q(i2, i4, j4));
        t4 = interfaceC0947H.t(a4.f9005d - i2, a4.f9006e - i4, C1412P.c(), new C0174u0(a4, l5, l4, 3));
        return t4;
    }
}
