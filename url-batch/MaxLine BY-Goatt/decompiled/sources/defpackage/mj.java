package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mj {
    public final Object a;
    public final u30 b;
    public final b72 c;

    public mj(Object obj, u30 u30Var, b72 b72Var) {
        this.a = obj;
        this.b = u30Var;
        this.c = b72Var;
    }

    public final boolean equals(Object obj) {
        boolean b;
        if (this != obj) {
            if (obj instanceof mj) {
                mj mjVar = (mj) obj;
                Object obj2 = mjVar.a;
                this.b.getClass();
                Object obj3 = this.a;
                if (obj3 != obj2) {
                    if ((obj3 instanceof r01) && (obj2 instanceof r01)) {
                        r01 r01Var = (r01) obj3;
                        r01 r01Var2 = (r01) obj2;
                        if (!Intrinsics.b(r01Var.a, r01Var2.a) || !r01Var.b.equals(r01Var2.b) || r01Var.d != r01Var2.d || !Intrinsics.b(r01Var.f, r01Var2.f) || !Intrinsics.b(r01Var.h, r01Var2.h) || r01Var.j != r01Var2.j || r01Var.k != r01Var2.k || r01Var.l != r01Var2.l || r01Var.m != r01Var2.m || r01Var.n != r01Var2.n || r01Var.o != r01Var2.o || r01Var.p != r01Var2.p || !r01Var.v.equals(r01Var2.v) || r01Var.w != r01Var2.w || r01Var.e != r01Var2.e || !Intrinsics.b(r01Var.x, r01Var2.x)) {
                            b = false;
                        }
                    } else {
                        b = Intrinsics.b(obj3, obj2);
                    }
                    if (b || !this.c.equals(mjVar.c)) {
                    }
                }
                b = true;
                if (b) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        this.b.getClass();
        Object obj = this.a;
        if (obj instanceof r01) {
            r01 r01Var = (r01) obj;
            hashCode = r01Var.x.m.hashCode() + ((r01Var.e.hashCode() + ((r01Var.w.hashCode() + ((r01Var.v.hashCode() + ((r01Var.p.hashCode() + ((r01Var.o.hashCode() + ((r01Var.n.hashCode() + in1.i(in1.i(in1.i(in1.i((((r01Var.f.hashCode() + ((r01Var.d.hashCode() + ((r01Var.b.hashCode() + (r01Var.a.hashCode() * 31)) * 923521)) * 961)) * 31) + Arrays.hashCode(r01Var.h.m)) * 31, 31, r01Var.j), 31, r01Var.k), 31, r01Var.l), 31, r01Var.m)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        } else {
            hashCode = obj != null ? obj.hashCode() : 0;
        }
        return this.c.hashCode() + (hashCode * 31);
    }
}
