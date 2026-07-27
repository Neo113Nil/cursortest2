package Z;

import A.C0028y;
import kotlin.jvm.functions.Function1;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import r0.InterfaceC1081w;
import z2.C1412P;

/* renamed from: Z.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0318o extends S.n implements InterfaceC1081w {

    /* renamed from: t, reason: collision with root package name */
    public Function1 f4538t;

    public C0318o(Function1 function1) {
        this.f4538t = function1;
    }

    @Override // r0.InterfaceC1081w
    public final InterfaceC0946G i(InterfaceC0947H interfaceC0947H, InterfaceC0944E interfaceC0944E, long j4) {
        InterfaceC0946G t4;
        AbstractC0954O a4 = interfaceC0944E.a(j4);
        t4 = interfaceC0947H.t(a4.f9005d, a4.f9006e, C1412P.c(), new C0028y(a4, 14, this));
        return t4;
    }

    @Override // S.n
    public final boolean q0() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f4538t + ')';
    }
}
