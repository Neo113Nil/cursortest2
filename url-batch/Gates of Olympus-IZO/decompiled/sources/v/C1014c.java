package v;

import F.D0;
import I2.l;
import L1.z;
import M1.B;
import R1.i;
import Z1.j;
import e2.C0380d;
import java.util.concurrent.CancellationException;
import k2.C0536h;
import k2.InterfaceC0550w;
import o.C0732h;
import o.C0735k;
import t0.a0;

/* renamed from: v.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1014c extends i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f8557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1017f f8558f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0 f8559g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j f8560h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1014c(C1017f c1017f, a0 a0Var, Y1.a aVar, P1.d dVar) {
        super(2, dVar);
        this.f8558f = c1017f;
        this.f8559g = a0Var;
        this.f8560h = (j) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y1.a, Z1.j] */
    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C1014c(this.f8558f, this.f8559g, this.f8560h, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C1014c) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(z.f2729a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ff, code lost:
    
        if (r2 == Q1.a.f3113d) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARN: Type inference failed for: r8v0, types: [Y1.a, Z1.j] */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i3;
        boolean z3;
        Q1.a aVar = Q1.a.f3113d;
        int i4 = this.f8557e;
        z zVar = z.f2729a;
        boolean z4 = true;
        if (i4 == 0) {
            l.Q(obj);
            C1017f c1017f = this.f8558f;
            C0735k c0735k = c1017f.f8570q;
            C1013b c1013b = new C1013b(c1017f, this.f8559g, this.f8560h);
            this.f8557e = 1;
            c0735k.getClass();
            a0.d dVar = (a0.d) c1013b.b();
            if (dVar != null && !c0735k.x0(dVar, c0735k.f6557y)) {
                C0536h c0536h = new C0536h(1, B.G(this));
                c0536h.q();
                C0732h c0732h = new C0732h(c1013b, c0536h);
                n0.f fVar = c0735k.f6553u;
                fVar.getClass();
                a0.d dVar2 = (a0.d) c1013b.b();
                if (dVar2 == null) {
                    c0536h.resumeWith(zVar);
                } else {
                    c0536h.s(new D0(fVar, 21, c0732h));
                    K.d dVar3 = fVar.f6213a;
                    int i5 = new C0380d(0, dVar3.f2642f - 1, 1).f4769e;
                    if (i5 >= 0) {
                        while (true) {
                            a0.d dVar4 = (a0.d) ((C0732h) dVar3.f2640d[i5]).f6530a.b();
                            if (dVar4 == null) {
                                z3 = z4;
                            } else {
                                dVar2.getClass();
                                a0.d dVar5 = new a0.d(Math.max(dVar2.f3491a, dVar4.f3491a), Math.max(dVar2.f3492b, dVar4.f3492b), Math.min(dVar2.f3493c, dVar4.f3493c), Math.min(dVar2.f3494d, dVar4.f3494d));
                                if (dVar5.equals(dVar2)) {
                                    dVar3.a(i5 + 1, c0732h);
                                    break;
                                }
                                if (dVar5.equals(dVar4)) {
                                    z3 = true;
                                } else {
                                    CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                    z3 = true;
                                    int i6 = dVar3.f2642f - 1;
                                    if (i6 <= i5) {
                                        while (true) {
                                            ((C0732h) dVar3.f2640d[i5]).f6531b.v(cancellationException);
                                            if (i6 == i5) {
                                                break;
                                            }
                                            i6++;
                                        }
                                    }
                                }
                            }
                            if (i5 == 0) {
                                i3 = 0;
                                break;
                            }
                            i5--;
                            z4 = z3;
                        }
                        if (!c0735k.f6558z) {
                            c0735k.y0();
                        }
                    } else {
                        i3 = 0;
                    }
                    dVar3.a(i3, c0732h);
                    if (!c0735k.f6558z) {
                    }
                }
                obj2 = c0536h.p();
            }
            obj2 = zVar;
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.Q(obj);
        }
        return zVar;
    }
}
