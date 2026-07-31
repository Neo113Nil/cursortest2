package z2;

import C2.B;
import C2.C;
import C2.C0298a0;
import C2.C0307f;
import C2.C0308f0;
import C2.C0310g0;
import C2.C0311h;
import C2.C0312h0;
import C2.C0313i;
import C2.C0317k;
import C2.C0319l;
import C2.C0326o0;
import C2.C0328p0;
import C2.C0329q;
import C2.C0331r0;
import C2.D;
import C2.F0;
import C2.K;
import C2.K0;
import C2.L0;
import C2.M0;
import C2.O0;
import C2.R0;
import C2.S0;
import C2.U;
import C2.U0;
import C2.V;
import C2.V0;
import C2.X0;
import C2.Y0;
import C2.a1;
import C2.b1;
import C2.c1;
import C2.r;
import W1.r;
import W1.t;
import W1.v;
import W1.y;
import kotlin.Unit;
import kotlin.jvm.internal.C3238d;
import kotlin.jvm.internal.C3239e;
import kotlin.jvm.internal.C3241g;
import kotlin.jvm.internal.C3245k;
import kotlin.jvm.internal.C3246l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.t;
import kotlin.time.a;
import m2.c;
import y2.InterfaceC3527b;

/* renamed from: z2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3551a {
    public static final InterfaceC3527b A(C3239e c3239e) {
        Intrinsics.checkNotNullParameter(c3239e, "<this>");
        return C0319l.f304a;
    }

    public static final InterfaceC3527b B(C3241g c3241g) {
        Intrinsics.checkNotNullParameter(c3241g, "<this>");
        return r.f326a;
    }

    public static final InterfaceC3527b C(C3245k c3245k) {
        Intrinsics.checkNotNullParameter(c3245k, "<this>");
        return C.f185a;
    }

    public static final InterfaceC3527b D(C3246l c3246l) {
        Intrinsics.checkNotNullParameter(c3246l, "<this>");
        return K.f219a;
    }

    public static final InterfaceC3527b E(kotlin.jvm.internal.r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return V.f255a;
    }

    public static final InterfaceC3527b F(t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        return C0310g0.f284a;
    }

    public static final InterfaceC3527b G(J j4) {
        Intrinsics.checkNotNullParameter(j4, "<this>");
        return L0.f222a;
    }

    public static final InterfaceC3527b H(L l4) {
        Intrinsics.checkNotNullParameter(l4, "<this>");
        return M0.f224a;
    }

    public static final InterfaceC3527b I(a.C0233a c0233a) {
        Intrinsics.checkNotNullParameter(c0233a, "<this>");
        return D.f188a;
    }

    public static final InterfaceC3527b a(c kClass, InterfaceC3527b elementSerializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new F0(kClass, elementSerializer);
    }

    public static final InterfaceC3527b b() {
        return C0311h.f286c;
    }

    public static final InterfaceC3527b c() {
        return C0317k.f302c;
    }

    public static final InterfaceC3527b d() {
        return C0329q.f319c;
    }

    public static final InterfaceC3527b e() {
        return B.f183c;
    }

    public static final InterfaceC3527b f() {
        return C2.J.f216c;
    }

    public static final InterfaceC3527b g() {
        return U.f253c;
    }

    public static final InterfaceC3527b h(InterfaceC3527b elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new C0307f(elementSerializer);
    }

    public static final InterfaceC3527b i() {
        return C0308f0.f281c;
    }

    public static final InterfaceC3527b j(InterfaceC3527b keySerializer, InterfaceC3527b valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new C0312h0(keySerializer, valueSerializer);
    }

    public static final InterfaceC3527b k(InterfaceC3527b keySerializer, InterfaceC3527b valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new C0298a0(keySerializer, valueSerializer);
    }

    public static final InterfaceC3527b l() {
        return C0326o0.f313a;
    }

    public static final InterfaceC3527b m(InterfaceC3527b keySerializer, InterfaceC3527b valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new C0331r0(keySerializer, valueSerializer);
    }

    public static final InterfaceC3527b n() {
        return K0.f221c;
    }

    public static final InterfaceC3527b o(InterfaceC3527b aSerializer, InterfaceC3527b bSerializer, InterfaceC3527b cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        return new O0(aSerializer, bSerializer, cSerializer);
    }

    public static final InterfaceC3527b p() {
        return R0.f245c;
    }

    public static final InterfaceC3527b q() {
        return U0.f254c;
    }

    public static final InterfaceC3527b r() {
        return X0.f262c;
    }

    public static final InterfaceC3527b s() {
        return a1.f270c;
    }

    public static final InterfaceC3527b t(InterfaceC3527b interfaceC3527b) {
        Intrinsics.checkNotNullParameter(interfaceC3527b, "<this>");
        return interfaceC3527b.getDescriptor().c() ? interfaceC3527b : new C0328p0(interfaceC3527b);
    }

    public static final InterfaceC3527b u(r.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return S0.f247a;
    }

    public static final InterfaceC3527b v(t.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return V0.f257a;
    }

    public static final InterfaceC3527b w(v.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return Y0.f265a;
    }

    public static final InterfaceC3527b x(y.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return b1.f271a;
    }

    public static final InterfaceC3527b y(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "<this>");
        return c1.f274b;
    }

    public static final InterfaceC3527b z(C3238d c3238d) {
        Intrinsics.checkNotNullParameter(c3238d, "<this>");
        return C0313i.f292a;
    }
}
