package P;

import A0.C0036g;
import A0.H;
import A0.I;
import A0.K;
import G.InterfaceC0191c0;
import G0.s;
import G0.y;
import M2.E;
import M2.p;
import P0.C0259a;
import Q.v;
import W2.InterfaceC0280c0;
import X.t;
import Z.AbstractC0319p;
import Z.C0311h;
import Z.C0323u;
import Z.M;
import Z.U;
import Z.r;
import a.AbstractC0345a;
import android.view.DragEvent;
import androidx.lifecycle.InterfaceC0481v;
import b.D;
import b0.AbstractC0497e;
import b0.C0499g;
import b0.InterfaceC0496d;
import c.C0529i;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import k.C0731G;
import k.C0746l;
import k.O;
import k.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.f0;
import o.C0894k;
import o.C0903o0;
import o.C0908r0;
import p0.AbstractC0953N;
import p0.AbstractC0954O;
import p0.InterfaceC0947H;
import q.AbstractC1024c;
import q.C1019X;
import q.C1020Y;
import q.InterfaceC1021Z;
import q.b0;
import r0.AbstractC1065f;
import r0.p0;
import r0.q0;
import s0.C1166s;
import s0.ViewOnDragListenerC1154l0;
import s1.C1193i;
import w.C1277q;
import w.P;
import w.o0;
import w2.C1294c;
import y2.C1338m;

/* loaded from: classes.dex */
public final class h extends p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3661e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3662i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3663j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(t tVar, androidx.compose.ui.focus.b bVar, Function1 function1) {
        super(1);
        this.f3660d = 2;
        this.f3661e = tVar;
        this.f3662i = bVar;
        this.f3663j = (p) function1;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [M2.p, kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean booleanValue;
        switch (this.f3660d) {
            case 0:
                i iVar = (i) this.f3661e;
                LinkedHashMap linkedHashMap = iVar.f3666b;
                Object obj2 = this.f3662i;
                if (linkedHashMap.containsKey(obj2)) {
                    throw new IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
                }
                iVar.f3665a.remove(obj2);
                LinkedHashMap linkedHashMap2 = iVar.f3666b;
                f fVar = (f) this.f3663j;
                linkedHashMap2.put(obj2, fVar);
                return new g(fVar, iVar, obj2, 0);
            case 1:
                q0 q0Var = (q0) obj;
                V.e eVar = (V.e) q0Var;
                if (((ViewOnDragListenerC1154l0) ((C1166s) AbstractC1065f.w((V.e) this.f3662i)).getDragAndDropManager()).f10256b.contains(eVar)) {
                    DragEvent dragEvent = (DragEvent) ((C1294c) this.f3663j).f11388d;
                    if (M1.a.l(eVar, AbstractC0345a.c(dragEvent.getX(), dragEvent.getY()))) {
                        ((E) this.f3661e).f3580d = q0Var;
                        return p0.f9830i;
                    }
                }
                return p0.f9828d;
            case 2:
                t tVar = (t) obj;
                if (Intrinsics.a(tVar, (t) this.f3661e)) {
                    booleanValue = false;
                } else {
                    if (Intrinsics.a(tVar, ((androidx.compose.ui.focus.b) this.f3662i).f5179f)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    booleanValue = ((Boolean) ((p) this.f3663j).invoke(tVar)).booleanValue();
                }
                return Boolean.valueOf(booleanValue);
            case 3:
                D d4 = (D) this.f3661e;
                InterfaceC0481v interfaceC0481v = (InterfaceC0481v) this.f3662i;
                C0529i c0529i = (C0529i) this.f3663j;
                d4.a(interfaceC0481v, c0529i);
                return new C0259a(2, c0529i);
            case 4:
                return new g((v) this.f3661e, this.f3662i, (C0746l) this.f3663j);
            case 5:
                M m4 = (M) obj;
                f0 f0Var = (f0) this.f3661e;
                m4.a(f0Var != null ? ((Number) f0Var.getValue()).floatValue() : 1.0f);
                f0 f0Var2 = (f0) this.f3662i;
                m4.d(f0Var2 != null ? ((Number) f0Var2.getValue()).floatValue() : 1.0f);
                m4.f(f0Var2 != null ? ((Number) f0Var2.getValue()).floatValue() : 1.0f);
                f0 f0Var3 = (f0) this.f3663j;
                m4.k(f0Var3 != null ? ((U) f0Var3.getValue()).f4512a : U.f4510b);
                return Unit.f7487a;
            case 6:
                int ordinal = ((w) obj).ordinal();
                U u4 = null;
                C0731G c0731g = (C0731G) this.f3663j;
                if (ordinal == 0) {
                    O o4 = c0731g.f7256a;
                } else if (ordinal == 1) {
                    u4 = (U) this.f3661e;
                } else {
                    if (ordinal != 2) {
                        throw new C1338m();
                    }
                    O o5 = c0731g.f7256a;
                }
                return new U(u4 != null ? u4.f4512a : U.f4510b);
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                float floatValue = ((Number) obj).floatValue();
                C0894k c0894k = (C0894k) this.f3661e;
                float f4 = c0894k.f8811v ? 1.0f : -1.0f;
                C0908r0 c0908r0 = c0894k.f8810u;
                long d5 = c0908r0.d(c0908r0.g(f4 * floatValue));
                C0908r0 c0908r02 = ((C0903o0) this.f3663j).f8848a;
                float f5 = c0908r0.f(c0908r0.d(C0908r0.a(c0908r02, c0908r02.f8872h, d5, 1))) * f4;
                if (Math.abs(f5) < Math.abs(floatValue)) {
                    String str = "Scroll animation cancelled because scroll was not consumed (" + f5 + " < " + floatValue + ')';
                    InterfaceC0280c0 interfaceC0280c0 = (InterfaceC0280c0) this.f3662i;
                    CancellationException cancellationException = new CancellationException(str);
                    cancellationException.initCause(null);
                    interfaceC0280c0.a(cancellationException);
                }
                return Unit.f7487a;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                AbstractC0953N abstractC0953N = (AbstractC0953N) obj;
                C1019X c1019x = (C1019X) this.f3661e;
                long j4 = ((M0.h) c1019x.f9223t.invoke((InterfaceC0947H) this.f3662i)).f3548a;
                boolean z4 = c1019x.f9224u;
                AbstractC0954O abstractC0954O = (AbstractC0954O) this.f3663j;
                if (z4) {
                    AbstractC0953N.g(abstractC0953N, abstractC0954O, (int) (j4 >> 32), (int) (j4 & 4294967295L));
                } else {
                    AbstractC0953N.h(abstractC0953N, abstractC0954O, (int) (j4 >> 32), (int) (j4 & 4294967295L), null, 12);
                }
                return Unit.f7487a;
            case AbstractC1024c.f9242c /* 9 */:
                AbstractC0953N abstractC0953N2 = (AbstractC0953N) obj;
                C1020Y c1020y = (C1020Y) this.f3661e;
                boolean z5 = c1020y.f9229x;
                InterfaceC0947H interfaceC0947H = (InterfaceC0947H) this.f3663j;
                AbstractC0954O abstractC0954O2 = (AbstractC0954O) this.f3662i;
                if (z5) {
                    AbstractC0953N.f(abstractC0953N2, abstractC0954O2, interfaceC0947H.l(c1020y.f9225t), interfaceC0947H.l(c1020y.f9226u));
                } else {
                    AbstractC0953N.d(abstractC0953N2, abstractC0954O2, interfaceC0947H.l(c1020y.f9225t), interfaceC0947H.l(c1020y.f9226u));
                }
                return Unit.f7487a;
            case 10:
                b0 b0Var = (b0) this.f3663j;
                InterfaceC1021Z interfaceC1021Z = b0Var.f9239t;
                InterfaceC0947H interfaceC0947H2 = (InterfaceC0947H) this.f3662i;
                AbstractC0953N.d((AbstractC0953N) obj, (AbstractC0954O) this.f3661e, interfaceC0947H2.l(interfaceC1021Z.b(interfaceC0947H2.getLayoutDirection())), interfaceC0947H2.l(b0Var.f9239t.d()));
                return Unit.f7487a;
            case RequestError.STOP_TRACKING /* 11 */:
                AbstractC0953N abstractC0953N3 = (AbstractC0953N) obj;
                ArrayList arrayList = (ArrayList) this.f3661e;
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    r.o oVar = (r.o) this.f3662i;
                    if (i2 >= size) {
                        if (oVar != null) {
                            oVar.b(abstractC0953N3);
                        }
                        ((InterfaceC0191c0) this.f3663j).getValue();
                        return Unit.f7487a;
                    }
                    r.o oVar2 = (r.o) arrayList.get(i2);
                    if (oVar2 != oVar) {
                        oVar2.b(abstractC0953N3);
                    }
                    i2++;
                }
            case 12:
                C1193i c1193i = (C1193i) this.f3662i;
                v vVar = (v) this.f3661e;
                vVar.add(c1193i);
                return new g((t1.p) this.f3663j, c1193i, vVar, 2);
            case 13:
                y yVar = (y) obj;
                ((InterfaceC0191c0) this.f3662i).setValue(yVar);
                InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) this.f3663j;
                boolean a4 = Intrinsics.a((String) interfaceC0191c0.getValue(), yVar.f3093a.f328a);
                C0036g c0036g = yVar.f3093a;
                interfaceC0191c0.setValue(c0036g.f328a);
                if (!a4) {
                    ((Function1) this.f3661e).invoke(c0036g.f328a);
                }
                return Unit.f7487a;
            case 14:
                InterfaceC0496d interfaceC0496d = (InterfaceC0496d) obj;
                P p4 = (P) this.f3661e;
                o0 d6 = p4.d();
                if (d6 != null) {
                    r k4 = interfaceC0496d.Y().k();
                    long j5 = ((K) p4.f11077x.getValue()).f301a;
                    long j6 = ((K) p4.f11078y.getValue()).f301a;
                    long j7 = p4.f11076w;
                    boolean b4 = K.b(j5);
                    s sVar = (s) this.f3663j;
                    I i4 = d6.f11290a;
                    H h4 = i4.f289a;
                    C0311h c0311h = p4.f11075v;
                    if (!b4) {
                        c0311h.e(j7);
                        int b5 = sVar.b(K.e(j5));
                        int b6 = sVar.b(K.d(j5));
                        if (b5 != b6) {
                            k4.c(i4.j(b5, b6), c0311h);
                        }
                    } else if (K.b(j6)) {
                        long j8 = ((y) this.f3662i).f3094b;
                        if (!K.b(j8)) {
                            c0311h.e(j7);
                            int b7 = sVar.b(K.e(j8));
                            int b8 = sVar.b(K.d(j8));
                            if (b7 != b8) {
                                k4.c(i4.j(b7, b8), c0311h);
                            }
                        }
                    } else {
                        long b9 = h4.f280b.b();
                        C0323u c0323u = new C0323u(b9);
                        if (b9 == 16) {
                            c0323u = null;
                        }
                        long j9 = c0323u != null ? c0323u.f4549a : C0323u.f4542b;
                        c0311h.e(C0323u.b(C0323u.d(j9) * 0.2f, j9));
                        int b10 = sVar.b(K.e(j6));
                        int b11 = sVar.b(K.d(j6));
                        if (b10 != b11) {
                            k4.c(i4.j(b10, b11), c0311h);
                        }
                    }
                    long j10 = i4.f291c;
                    float f6 = (int) (j10 >> 32);
                    A0.o oVar3 = i4.f290b;
                    boolean z6 = ((f6 > oVar3.f353d ? 1 : (f6 == oVar3.f353d ? 0 : -1)) < 0 || oVar3.f352c || (((float) ((int) (j10 & 4294967295L))) > oVar3.f354e ? 1 : (((float) ((int) (j10 & 4294967295L))) == oVar3.f354e ? 0 : -1)) < 0) && !u3.l.b0(h4.f284f, 3);
                    if (z6) {
                        Y.d h5 = j0.c.h(0L, u3.l.N((int) (j10 >> 32), (int) (j10 & 4294967295L)));
                        k4.g();
                        r.l(k4, h5);
                    }
                    A0.D d7 = h4.f280b.f303a;
                    L0.j jVar = d7.f268m;
                    L0.n nVar = d7.f256a;
                    if (jVar == null) {
                        jVar = L0.j.f3510b;
                    }
                    L0.j jVar2 = jVar;
                    Z.O o6 = d7.f269n;
                    if (o6 == null) {
                        o6 = Z.O.f4488d;
                    }
                    Z.O o7 = o6;
                    AbstractC0497e abstractC0497e = d7.f271p;
                    if (abstractC0497e == null) {
                        abstractC0497e = C0499g.f5607a;
                    }
                    AbstractC0497e abstractC0497e2 = abstractC0497e;
                    try {
                        AbstractC0319p c4 = nVar.c();
                        L0.l lVar = L0.l.f3515a;
                        if (c4 != null) {
                            A0.o.h(oVar3, k4, c4, nVar != lVar ? nVar.a() : 1.0f, o7, jVar2, abstractC0497e2);
                        } else {
                            A0.o.g(oVar3, k4, nVar != lVar ? nVar.b() : C0323u.f4542b, o7, jVar2, abstractC0497e2);
                        }
                        if (z6) {
                            k4.b();
                        }
                    } catch (Throwable th) {
                        if (z6) {
                            k4.b();
                        }
                        throw th;
                    }
                }
                return Unit.f7487a;
            default:
                G0.E e4 = (G0.E) ((E) this.f3663j).f3580d;
                y i5 = ((y.t) this.f3661e).i((List) obj);
                if (e4 != null) {
                    e4.a(null, i5);
                }
                ((C1277q) this.f3662i).invoke(i5);
                return Unit.f7487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i2) {
        super(1);
        this.f3660d = i2;
        this.f3661e = obj;
        this.f3662i = obj2;
        this.f3663j = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ArrayList arrayList, r.o oVar, boolean z4, InterfaceC0191c0 interfaceC0191c0) {
        super(1);
        this.f3660d = 11;
        this.f3661e = arrayList;
        this.f3662i = oVar;
        this.f3663j = interfaceC0191c0;
    }
}
