package R;

import I.InterfaceC0088c0;
import L1.z;
import Z.q;
import Z1.t;
import android.view.DragEvent;
import androidx.lifecycle.InterfaceC0236v;
import b.F;
import b0.C0261L;
import b0.C0266Q;
import f.AbstractC0382a;
import h1.C0438i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import k2.X;
import l.C0568m;
import l.G;
import l.O;
import l.x;
import m.k0;
import o.C0735k;
import o.l0;
import o.o0;
import q1.C0784h;
import r.C0795G;
import r.C0798J;
import r.InterfaceC0796H;
import r0.H;
import r1.p;
import s.C0872o;
import t0.AbstractC0898f;
import t0.p0;
import t0.q0;
import u0.C0997t;
import u0.ViewOnDragListenerC0971f0;

/* loaded from: classes.dex */
public final class h extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3149e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3150f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3151g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3152h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(q qVar, androidx.compose.ui.focus.a aVar, Y1.c cVar) {
        super(1);
        this.f3149e = 2;
        this.f3150f = qVar;
        this.f3151g = aVar;
        this.f3152h = (Z1.j) cVar;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [Y1.c, Z1.j] */
    @Override // Y1.c
    public final Object j(Object obj) {
        boolean booleanValue;
        switch (this.f3149e) {
            case 0:
                i iVar = (i) this.f3150f;
                LinkedHashMap linkedHashMap = iVar.f3155b;
                Object obj2 = this.f3151g;
                if (linkedHashMap.containsKey(obj2)) {
                    throw new IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
                }
                iVar.f3154a.remove(obj2);
                LinkedHashMap linkedHashMap2 = iVar.f3155b;
                f fVar = (f) this.f3152h;
                linkedHashMap2.put(obj2, fVar);
                return new g(fVar, iVar, obj2, 0);
            case 1:
                q0 q0Var = (q0) obj;
                X.d dVar = (X.d) q0Var;
                if (((ViewOnDragListenerC0971f0) ((C0997t) AbstractC0898f.u((X.d) this.f3151g)).getDragAndDropManager()).f8326b.contains(dVar)) {
                    DragEvent dragEvent = (DragEvent) ((A2.g) this.f3152h).f83b;
                    if (I2.l.g(dVar, I2.l.f(dragEvent.getX(), dragEvent.getY()))) {
                        ((t) this.f3150f).f3480d = q0Var;
                        return p0.f7944f;
                    }
                }
                return p0.f7942d;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                q qVar = (q) obj;
                if (Z1.i.a(qVar, (q) this.f3150f)) {
                    booleanValue = false;
                } else {
                    if (Z1.i.a(qVar, ((androidx.compose.ui.focus.a) this.f3151g).f3708d)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    booleanValue = ((Boolean) ((Z1.j) this.f3152h).j(qVar)).booleanValue();
                }
                return Boolean.valueOf(booleanValue);
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                F f3 = (F) this.f3150f;
                InterfaceC0236v interfaceC0236v = (InterfaceC0236v) this.f3151g;
                c.f fVar2 = (c.f) this.f3152h;
                f3.a(interfaceC0236v, fVar2);
                return new P0.a(1, fVar2);
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                return new g((S.t) this.f3150f, this.f3151g, (C0568m) this.f3152h);
            case 5:
                C0261L c0261l = (C0261L) obj;
                k0 k0Var = (k0) this.f3150f;
                c0261l.b(k0Var != null ? ((Number) k0Var.getValue()).floatValue() : 1.0f);
                k0 k0Var2 = (k0) this.f3151g;
                c0261l.d(k0Var2 != null ? ((Number) k0Var2.getValue()).floatValue() : 1.0f);
                c0261l.e(k0Var2 != null ? ((Number) k0Var2.getValue()).floatValue() : 1.0f);
                k0 k0Var3 = (k0) this.f3152h;
                c0261l.h(k0Var3 != null ? ((C0266Q) k0Var3.getValue()).f4260a : C0266Q.f4258b);
                return z.f2729a;
            case 6:
                int ordinal = ((x) obj).ordinal();
                C0266Q c0266q = null;
                G g3 = (G) this.f3152h;
                if (ordinal == 0) {
                    O o3 = g3.f5435a;
                } else if (ordinal == 1) {
                    c0266q = (C0266Q) this.f3150f;
                } else {
                    if (ordinal != 2) {
                        throw new L1.f();
                    }
                    O o4 = g3.f5435a;
                }
                return new C0266Q(c0266q != null ? c0266q.f4260a : C0266Q.f4258b);
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                float floatValue = ((Number) obj).floatValue();
                C0735k c0735k = (C0735k) this.f3150f;
                float f4 = c0735k.f6551s ? 1.0f : -1.0f;
                o0 o0Var = c0735k.f6550r;
                long d3 = o0Var.d(o0Var.g(f4 * floatValue));
                o0 o0Var2 = ((l0) this.f3152h).f6573a;
                float f5 = o0Var.f(o0Var.d(o0.a(o0Var2, o0Var2.f6599h, d3, 1))) * f4;
                if (Math.abs(f5) < Math.abs(floatValue)) {
                    String str = "Scroll animation cancelled because scroll was not consumed (" + f5 + " < " + floatValue + ')';
                    X x3 = (X) this.f3151g;
                    CancellationException cancellationException = new CancellationException(str);
                    cancellationException.initCause(null);
                    x3.a(cancellationException);
                }
                return z.f2729a;
            case 8:
                r0.G g4 = (r0.G) obj;
                C0795G c0795g = (C0795G) this.f3150f;
                boolean z3 = c0795g.f7005u;
                t0.O o5 = (t0.O) this.f3152h;
                H h3 = (H) this.f3151g;
                if (z3) {
                    r0.G.f(g4, h3, o5.k(c0795g.f7001q), o5.k(c0795g.f7002r));
                } else {
                    r0.G.d(g4, h3, o5.k(c0795g.f7001q), o5.k(c0795g.f7002r));
                }
                return z.f2729a;
            case AbstractC0382a.f4777a /* 9 */:
                C0798J c0798j = (C0798J) this.f3152h;
                InterfaceC0796H interfaceC0796H = c0798j.f7010q;
                t0.O o6 = (t0.O) this.f3151g;
                r0.G.d((r0.G) obj, (H) this.f3150f, o6.k(interfaceC0796H.b(o6.getLayoutDirection())), o6.k(c0798j.f7010q.d()));
                return z.f2729a;
            case AbstractC0382a.f4779c /* 10 */:
                C0784h c0784h = (C0784h) this.f3151g;
                S.t tVar = (S.t) this.f3150f;
                tVar.add(c0784h);
                return new g((p) this.f3152h, c0784h, tVar, 2);
            default:
                r0.G g5 = (r0.G) obj;
                ArrayList arrayList = (ArrayList) this.f3150f;
                int size = arrayList.size();
                int i3 = 0;
                while (true) {
                    C0872o c0872o = (C0872o) this.f3151g;
                    if (i3 >= size) {
                        if (c0872o != null) {
                            c0872o.g(g5);
                        }
                        ((InterfaceC0088c0) this.f3152h).getValue();
                        return z.f2729a;
                    }
                    C0872o c0872o2 = (C0872o) arrayList.get(i3);
                    if (c0872o2 != c0872o) {
                        c0872o2.g(g5);
                    }
                    i3++;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i3) {
        super(1);
        this.f3149e = i3;
        this.f3150f = obj;
        this.f3151g = obj2;
        this.f3152h = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ArrayList arrayList, C0872o c0872o, boolean z3, InterfaceC0088c0 interfaceC0088c0) {
        super(1);
        this.f3149e = 11;
        this.f3150f = arrayList;
        this.f3151g = c0872o;
        this.f3152h = interfaceC0088c0;
    }
}
