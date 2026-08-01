package c1;

import a2.r;
import android.content.Context;
import c7.c0;
import ie.o;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s7.o1;
import s7.q1;
import s7.v0;
import s7.y1;
import v.z0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b implements y1 {

    /* renamed from: d, reason: collision with root package name */
    public final Object f1478d;

    public b(int i3) {
        switch (i3) {
            case 1:
                this.f1478d = new Object();
                break;
            case 2:
            default:
                this.f1478d = new ArrayList();
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                this.f1478d = n0.h.r(Boolean.FALSE);
                break;
        }
    }

    @Override // s7.y1
    public k5.c a() {
        throw null;
    }

    @Override // s7.y1
    public v0 b() {
        throw null;
    }

    @Override // s7.y1
    public o1 d() {
        throw null;
    }

    @Override // s7.y1
    public Context e() {
        throw null;
    }

    @Override // s7.y1
    public g7.a f() {
        throw null;
    }

    public boolean g(int i3, q0.c cVar, Object obj) {
        ArrayList arrayList = cVar.f7723a;
        if (arrayList == null) {
            h(i3, cVar, null);
            return true;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof q0.b) {
                if (obj2.equals(obj)) {
                    h(0, cVar, obj2);
                    return true;
                }
            } else {
                if (!(obj2 instanceof q0.c)) {
                    r.n(obj2, "Unexpected child source info ");
                    return false;
                }
                if (g(i3, (q0.c) obj2, obj)) {
                    h(0, cVar, obj2);
                    return true;
                }
            }
        }
        return false;
    }

    public void h(int i3, q0.c cVar, Object obj) {
        ((ArrayList) this.f1478d).add(new c(i3, null, null));
    }

    public abstract void i(o oVar);

    public abstract void j();

    public abstract void k();

    public abstract Object l();

    public void m(int i3, Object obj, q0.c cVar, Object obj2) {
        if (Intrinsics.a(obj, n0.k.f6729a)) {
            h(i3, cVar, null);
        }
    }

    public abstract Function1 n(o oVar);

    public abstract void o(ie.g gVar);

    public abstract void p(Object obj);

    public abstract void q(z0 z0Var);

    public abstract void r();

    public void s() {
        o1 o1Var = ((q1) this.f1478d).f8938u;
        q1.l(o1Var);
        o1Var.s();
    }

    public b(q1 q1Var) {
        c0.g(q1Var);
        this.f1478d = q1Var;
    }
}
