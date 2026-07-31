package R;

import B.Y;
import C0.C0031g;
import C0.D;
import C0.G;
import C0.J;
import I.InterfaceC0142c0;
import I0.F;
import I0.z;
import R0.C0212a;
import R1.y;
import Z.t;
import a.AbstractC0235a;
import a0.C0239d;
import android.view.DragEvent;
import androidx.lifecycle.InterfaceC0292v;
import b.C0301E;
import b0.AbstractC0347p;
import b0.C0339h;
import b0.C0352v;
import b0.O;
import b0.U;
import b0.r;
import d0.AbstractC0404e;
import d0.C0406g;
import d0.InterfaceC0403d;
import e2.InterfaceC0424c;
import f2.u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import l.C0586l;
import l.H;
import l.P;
import l.x;
import m.e0;
import p.C0771k;
import p.C0787s0;
import p.C0793v0;
import q2.X;
import r.AbstractC0856c;
import r.C0848J;
import r.C0851M;
import r.InterfaceC0849K;
import r0.AbstractC0892N;
import r0.AbstractC0893O;
import r0.InterfaceC0887I;
import s.C0944m;
import t0.AbstractC0993f;
import t0.q0;
import t0.r0;
import t1.C1028h;
import u0.C1123s;
import u0.ViewOnDragListenerC1111l0;
import u1.p;
import x.C1204q;
import x.Q;
import x.p0;
import z.C1256t;

/* loaded from: classes.dex */
public final class h extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4023f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4024g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4025h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(t tVar, androidx.compose.ui.focus.b bVar, InterfaceC0424c interfaceC0424c) {
        super(1);
        this.f4022e = 2;
        this.f4023f = tVar;
        this.f4024g = bVar;
        this.f4025h = (f2.k) interfaceC0424c;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [e2.c, f2.k] */
    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        boolean booleanValue;
        switch (this.f4022e) {
            case 0:
                i iVar = (i) this.f4023f;
                LinkedHashMap linkedHashMap = iVar.f4028b;
                Object obj2 = this.f4024g;
                if (linkedHashMap.containsKey(obj2)) {
                    throw new IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
                }
                iVar.f4027a.remove(obj2);
                LinkedHashMap linkedHashMap2 = iVar.f4028b;
                f fVar = (f) this.f4025h;
                linkedHashMap2.put(obj2, fVar);
                return new g(fVar, iVar, obj2, 0);
            case 1:
                r0 r0Var = (r0) obj;
                X.e eVar = (X.e) r0Var;
                if (((ViewOnDragListenerC1111l0) ((C1123s) AbstractC0993f.u((X.e) this.f4024g)).getDragAndDropManager()).f9396b.contains(eVar)) {
                    DragEvent dragEvent = (DragEvent) ((Y) this.f4025h).f334d;
                    if (O2.d.k(eVar, l0.c.e(dragEvent.getX(), dragEvent.getY()))) {
                        ((u) this.f4023f).f5832d = r0Var;
                        return q0.f8781f;
                    }
                }
                return q0.f8779d;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                t tVar = (t) obj;
                if (f2.j.a(tVar, (t) this.f4023f)) {
                    booleanValue = false;
                } else {
                    if (f2.j.a(tVar, ((androidx.compose.ui.focus.b) this.f4024g).f4904f)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    booleanValue = ((Boolean) ((f2.k) this.f4025h).n(tVar)).booleanValue();
                }
                return Boolean.valueOf(booleanValue);
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                C0301E c0301e = (C0301E) this.f4023f;
                InterfaceC0292v interfaceC0292v = (InterfaceC0292v) this.f4024g;
                c.f fVar2 = (c.f) this.f4025h;
                c0301e.a(interfaceC0292v, fVar2);
                return new C0212a(2, fVar2);
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                return new g((S.t) this.f4023f, this.f4024g, (C0586l) this.f4025h);
            case 5:
                O o3 = (O) obj;
                e0 e0Var = (e0) this.f4023f;
                o3.b(e0Var != null ? ((Number) e0Var.getValue()).floatValue() : 1.0f);
                e0 e0Var2 = (e0) this.f4024g;
                o3.f(e0Var2 != null ? ((Number) e0Var2.getValue()).floatValue() : 1.0f);
                o3.g(e0Var2 != null ? ((Number) e0Var2.getValue()).floatValue() : 1.0f);
                e0 e0Var3 = (e0) this.f4025h;
                o3.m(e0Var3 != null ? ((U) e0Var3.getValue()).f5402a : U.f5400b);
                return y.f4171a;
            case 6:
                int ordinal = ((x) obj).ordinal();
                U u3 = null;
                H h3 = (H) this.f4025h;
                if (ordinal == 0) {
                    P p3 = h3.f6456a;
                } else if (ordinal == 1) {
                    u3 = (U) this.f4023f;
                } else {
                    if (ordinal != 2) {
                        throw new C1.c();
                    }
                    P p4 = h3.f6456a;
                }
                return new U(u3 != null ? u3.f5402a : U.f5400b);
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                float floatValue = ((Number) obj).floatValue();
                C0771k c0771k = (C0771k) this.f4023f;
                float f3 = c0771k.f7694s ? 1.0f : -1.0f;
                C0793v0 c0793v0 = c0771k.f7693r;
                long d3 = c0793v0.d(c0793v0.g(f3 * floatValue));
                C0793v0 c0793v02 = ((C0787s0) this.f4025h).f7767a;
                float f4 = c0793v0.f(c0793v0.d(C0793v0.a(c0793v02, c0793v02.f7785h, d3, 1))) * f3;
                if (Math.abs(f4) < Math.abs(floatValue)) {
                    String str = "Scroll animation cancelled because scroll was not consumed (" + f4 + " < " + floatValue + ')';
                    X x3 = (X) this.f4024g;
                    CancellationException cancellationException = new CancellationException(str);
                    cancellationException.initCause(null);
                    x3.a(cancellationException);
                }
                return y.f4171a;
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                AbstractC0892N abstractC0892N = (AbstractC0892N) obj;
                C0848J c0848j = (C0848J) this.f4023f;
                boolean z3 = c0848j.f7978u;
                InterfaceC0887I interfaceC0887I = (InterfaceC0887I) this.f4025h;
                AbstractC0893O abstractC0893O = (AbstractC0893O) this.f4024g;
                if (z3) {
                    AbstractC0892N.f(abstractC0892N, abstractC0893O, interfaceC0887I.l(c0848j.f7974q), interfaceC0887I.l(c0848j.f7975r));
                } else {
                    AbstractC0892N.d(abstractC0892N, abstractC0893O, interfaceC0887I.l(c0848j.f7974q), interfaceC0887I.l(c0848j.f7975r));
                }
                return y.f4171a;
            case AbstractC0856c.f8037c /* 9 */:
                C0851M c0851m = (C0851M) this.f4025h;
                InterfaceC0849K interfaceC0849K = c0851m.f7983q;
                InterfaceC0887I interfaceC0887I2 = (InterfaceC0887I) this.f4024g;
                AbstractC0892N.d((AbstractC0892N) obj, (AbstractC0893O) this.f4023f, interfaceC0887I2.l(interfaceC0849K.b(interfaceC0887I2.getLayoutDirection())), interfaceC0887I2.l(c0851m.f7983q.d()));
                return y.f4171a;
            case AbstractC0856c.f8039e /* 10 */:
                AbstractC0892N abstractC0892N2 = (AbstractC0892N) obj;
                ArrayList arrayList = (ArrayList) this.f4023f;
                int size = arrayList.size();
                int i3 = 0;
                while (true) {
                    C0944m c0944m = (C0944m) this.f4024g;
                    if (i3 >= size) {
                        if (c0944m != null) {
                            c0944m.b(abstractC0892N2);
                        }
                        ((InterfaceC0142c0) this.f4025h).getValue();
                        return y.f4171a;
                    }
                    C0944m c0944m2 = (C0944m) arrayList.get(i3);
                    if (c0944m2 != c0944m) {
                        c0944m2.b(abstractC0892N2);
                    }
                    i3++;
                }
            case 11:
                C1028h c1028h = (C1028h) this.f4024g;
                S.t tVar2 = (S.t) this.f4023f;
                tVar2.add(c1028h);
                return new g((p) this.f4025h, c1028h, tVar2, 2);
            case 12:
                z zVar = (z) obj;
                ((InterfaceC0142c0) this.f4024g).setValue(zVar);
                InterfaceC0142c0 interfaceC0142c0 = (InterfaceC0142c0) this.f4025h;
                boolean a3 = f2.j.a((String) interfaceC0142c0.getValue(), zVar.f3097a.f596a);
                C0031g c0031g = zVar.f3097a;
                interfaceC0142c0.setValue(c0031g.f596a);
                if (!a3) {
                    ((InterfaceC0424c) this.f4023f).n(c0031g.f596a);
                }
                return y.f4171a;
            case 13:
                InterfaceC0403d interfaceC0403d = (InterfaceC0403d) obj;
                Q q3 = (Q) this.f4023f;
                p0 d4 = q3.d();
                if (d4 != null) {
                    r h4 = interfaceC0403d.S().h();
                    long j3 = ((J) q3.f9998x.getValue()).f569a;
                    long j4 = ((J) q3.f9999y.getValue()).f569a;
                    long j5 = q3.f9997w;
                    boolean b3 = J.b(j3);
                    I0.t tVar3 = (I0.t) this.f4025h;
                    C0.H h5 = d4.f10230a;
                    G g3 = h5.f557a;
                    C0339h c0339h = q3.f9996v;
                    if (!b3) {
                        c0339h.e(j5);
                        int b4 = tVar3.b(J.e(j3));
                        int b5 = tVar3.b(J.d(j3));
                        if (b4 != b5) {
                            h4.k(h5.j(b4, b5), c0339h);
                        }
                    } else if (J.b(j4)) {
                        long j6 = ((z) this.f4024g).f3098b;
                        if (!J.b(j6)) {
                            c0339h.e(j5);
                            int b6 = tVar3.b(J.e(j6));
                            int b7 = tVar3.b(J.d(j6));
                            if (b6 != b7) {
                                h4.k(h5.j(b6, b7), c0339h);
                            }
                        }
                    } else {
                        long b8 = g3.f548b.b();
                        C0352v c0352v = new C0352v(b8);
                        if (b8 == 16) {
                            c0352v = null;
                        }
                        long j7 = c0352v != null ? c0352v.f5441a : C0352v.f5434b;
                        c0339h.e(C0352v.b(j7, C0352v.d(j7) * 0.2f));
                        int b9 = tVar3.b(J.e(j4));
                        int b10 = tVar3.b(J.d(j4));
                        if (b9 != b10) {
                            h4.k(h5.j(b9, b10), c0339h);
                        }
                    }
                    long j8 = h5.f559c;
                    float f5 = (int) (j8 >> 32);
                    C0.o oVar = h5.f558b;
                    boolean z4 = ((f5 > oVar.f621d ? 1 : (f5 == oVar.f621d ? 0 : -1)) < 0 || oVar.f620c || (((float) ((int) (j8 & 4294967295L))) > oVar.f622e ? 1 : (((float) ((int) (j8 & 4294967295L))) == oVar.f622e ? 0 : -1)) < 0) && !AbstractC0235a.v(g3.f552f, 3);
                    if (z4) {
                        C0239d g4 = O2.d.g(0L, AbstractC0235a.e((int) (j8 >> 32), (int) (j8 & 4294967295L)));
                        h4.f();
                        r.d(h4, g4);
                    }
                    D d5 = g3.f548b.f571a;
                    N0.j jVar = d5.f537m;
                    N0.m mVar = d5.f525a;
                    if (jVar == null) {
                        jVar = N0.j.f3548b;
                    }
                    N0.j jVar2 = jVar;
                    b0.P p5 = d5.f538n;
                    if (p5 == null) {
                        p5 = b0.P.f5380d;
                    }
                    b0.P p6 = p5;
                    AbstractC0404e abstractC0404e = d5.f540p;
                    if (abstractC0404e == null) {
                        abstractC0404e = C0406g.f5653a;
                    }
                    AbstractC0404e abstractC0404e2 = abstractC0404e;
                    try {
                        AbstractC0347p c2 = mVar.c();
                        N0.l lVar = N0.l.f3553a;
                        if (c2 != null) {
                            C0.o.h(oVar, h4, c2, mVar != lVar ? mVar.a() : 1.0f, p6, jVar2, abstractC0404e2);
                        } else {
                            C0.o.g(oVar, h4, mVar != lVar ? mVar.b() : C0352v.f5434b, p6, jVar2, abstractC0404e2);
                        }
                        if (z4) {
                            h4.a();
                        }
                    } catch (Throwable th) {
                        if (z4) {
                            h4.a();
                        }
                        throw th;
                    }
                }
                return y.f4171a;
            default:
                F f6 = (F) ((u) this.f4025h).f5832d;
                z i4 = ((C1256t) this.f4023f).i((List) obj);
                if (f6 != null) {
                    f6.a(null, i4);
                }
                ((C1204q) this.f4024g).n(i4);
                return y.f4171a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i3) {
        super(1);
        this.f4022e = i3;
        this.f4023f = obj;
        this.f4024g = obj2;
        this.f4025h = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ArrayList arrayList, C0944m c0944m, boolean z3, InterfaceC0142c0 interfaceC0142c0) {
        super(1);
        this.f4022e = 10;
        this.f4023f = arrayList;
        this.f4024g = c0944m;
        this.f4025h = interfaceC0142c0;
    }
}
