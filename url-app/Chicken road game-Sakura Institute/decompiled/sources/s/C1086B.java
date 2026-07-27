package s;

import G.C0199g0;
import kotlin.jvm.functions.Function0;
import o.N;
import p0.InterfaceC0946G;

/* renamed from: s.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1086B extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1089E f9877e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1086B(C1089E c1089e, int i2) {
        super(0);
        this.f9876d = i2;
        this.f9877e = c1089e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long c4;
        switch (this.f9876d) {
            case 0:
                C1089E c1089e = this.f9877e;
                r.v vVar = c1089e.f9885u.f9450a;
                if (vVar.g().f9515n == N.f8665d) {
                    InterfaceC0946G interfaceC0946G = vVar.g().f9518q;
                    c4 = u3.d.c(interfaceC0946G.g(), interfaceC0946G.j()) & 4294967295L;
                } else {
                    InterfaceC0946G interfaceC0946G2 = vVar.g().f9518q;
                    c4 = u3.d.c(interfaceC0946G2.g(), interfaceC0946G2.j()) >> 32;
                }
                int i2 = (int) c4;
                r.v vVar2 = c1089e.f9885u.f9450a;
                return Float.valueOf(i2 - ((-vVar2.g().f9512k) + vVar2.g().f9516o));
            case 1:
                r.v vVar3 = this.f9877e.f9885u.f9450a;
                return Float.valueOf((((C0199g0) vVar3.f9554d.f1052b).d() * 500) + ((C0199g0) vVar3.f9554d.f1053c).d());
            default:
                r.v vVar4 = this.f9877e.f9885u.f9450a;
                int d4 = ((C0199g0) vVar4.f9554d.f1052b).d();
                int d5 = ((C0199g0) vVar4.f9554d.f1053c).d();
                return Float.valueOf(vVar4.a() ? (d4 * 500) + d5 + 100 : (d4 * 500) + d5);
        }
    }
}
