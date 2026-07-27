package D;

import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import q.InterfaceC1021Z;
import y2.InterfaceC1332g;

/* renamed from: D.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176v extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f2053e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2054i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1332g f2055j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0176v(long j4, Object obj, InterfaceC1332g interfaceC1332g, int i2) {
        super(2);
        this.f2052d = i2;
        this.f2053e = j4;
        this.f2054i = obj;
        this.f2055j = interfaceC1332g;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f2052d) {
            case 0:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    E.a.a(this.f2053e, ((T1) c0216p.k(U1.f1662a)).f1653m, O.f.b(1327513942, new C0120c((InterfaceC1021Z) this.f2054i, 2, (L2.c) this.f2055j), c0216p), c0216p, 384);
                }
                break;
            default:
                C0216p c0216p2 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    E.v.b(this.f2053e, (A0.L) this.f2054i, (Function2) this.f2055j, c0216p2, 0);
                }
                break;
        }
        return Unit.f7487a;
    }
}
