package t;

import A.C0028y;
import M2.p;
import W2.C0286h;
import W2.InterfaceC0302y;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import l0.C0810h;
import o.C0888h;
import o.C0894k;
import r0.a0;
import y2.AbstractC1341p;
import y2.AbstractC1343r;

/* renamed from: t.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1202f extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f10621k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f10622l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0 f10623m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p f10624n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1202f(i iVar, a0 a0Var, Function0 function0, C2.a aVar) {
        super(2, aVar);
        this.f10622l = iVar;
        this.f10623m = a0Var;
        this.f10624n = (p) function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C1202f) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [M2.p, kotlin.jvm.functions.Function0] */
    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C1202f(this.f10622l, this.f10623m, this.f10624n, aVar);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [M2.p, kotlin.jvm.functions.Function0] */
    @Override // E2.a
    public final Object l(Object obj) {
        Object obj2;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f10621k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            i iVar = this.f10622l;
            C0894k c0894k = iVar.f10634t;
            C1201e c1201e = new C1201e(iVar, this.f10623m, this.f10624n);
            this.f10621k = 1;
            c0894k.getClass();
            Y.d dVar = (Y.d) c1201e.invoke();
            if (dVar == null || c0894k.D0(dVar, c0894k.B)) {
                obj2 = Unit.f7487a;
            } else {
                C0286h c0286h = new C0286h(1, D2.f.b(this));
                c0286h.s();
                C0888h c0888h = new C0888h(c1201e, c0286h);
                C0810h c0810h = c0894k.f8813x;
                c0810h.getClass();
                Y.d dVar2 = (Y.d) c1201e.invoke();
                if (dVar2 == null) {
                    AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                    c0286h.u(Unit.f7487a);
                } else {
                    c0286h.v(new C0028y(c0810h, 26, c0888h));
                    I.d dVar3 = c0810h.f7906a;
                    int i4 = new IntRange(0, dVar3.f3332i - 1, 1).f7506e;
                    if (i4 >= 0) {
                        while (true) {
                            Y.d dVar4 = (Y.d) ((C0888h) dVar3.f3330d[i4]).f8773a.invoke();
                            if (dVar4 != null) {
                                Y.d d4 = dVar2.d(dVar4);
                                if (d4.equals(dVar2)) {
                                    dVar3.a(i4 + 1, c0888h);
                                    break;
                                }
                                if (!d4.equals(dVar4)) {
                                    CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                    int i5 = dVar3.f3332i - 1;
                                    if (i5 <= i4) {
                                        while (true) {
                                            ((C0888h) dVar3.f3330d[i4]).f8774b.H(cancellationException);
                                            if (i5 == i4) {
                                                break;
                                            }
                                            i5++;
                                        }
                                    }
                                }
                            }
                            if (i4 == 0) {
                                break;
                            }
                            i4--;
                        }
                    }
                    dVar3.a(0, c0888h);
                    if (!c0894k.f8808C) {
                        c0894k.E0();
                    }
                }
                obj2 = c0286h.r();
                D2.a aVar3 = D2.a.f2163d;
                if (obj2 == aVar3) {
                    Intrinsics.checkNotNullParameter(this, "frame");
                }
                if (obj2 != aVar3) {
                    obj2 = Unit.f7487a;
                }
            }
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        return Unit.f7487a;
    }
}
