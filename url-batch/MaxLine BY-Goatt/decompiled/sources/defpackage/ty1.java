package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ty1 extends pr2 implements Function2 {
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ c0 o;
    public final /* synthetic */ int p;
    public final /* synthetic */ at0 q;
    public final /* synthetic */ float r;
    public final /* synthetic */ md s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty1(c0 c0Var, int i, at0 at0Var, float f, md mdVar, o30 o30Var) {
        super(2, o30Var);
        this.o = c0Var;
        this.p = i;
        this.q = at0Var;
        this.r = f;
        this.s = mdVar;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        ty1 ty1Var = new ty1(this.o, this.p, this.q, this.r, this.s, o30Var);
        ty1Var.n = obj;
        return ty1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ty1) create((ff2) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        i91 i91Var;
        b50 b50Var = b50.m;
        int i2 = this.m;
        Object obj2 = null;
        if (i2 == 0) {
            ca2.b(obj);
            ff2 ff2Var = (ff2) this.n;
            int i3 = this.p;
            this.o.invoke(ff2Var, new Integer(i3));
            at0 at0Var = this.q;
            ry1 ry1Var = (ry1) at0Var.m;
            int i4 = 0;
            boolean z = i3 > ry1Var.d;
            int i5 = ((rj1) zv.B(ry1Var.l().a)).a;
            ry1 ry1Var2 = (ry1) at0Var.m;
            int i6 = (i5 - ry1Var2.d) + 1;
            if (((z && i3 > ((rj1) zv.B(ry1Var2.l().a)).a) || (!z && i3 < ((ry1) at0Var.m).d)) && Math.abs(i3 - ((ry1) at0Var.m).d) >= 3) {
                if (z) {
                    ry1 ry1Var3 = (ry1) at0Var.m;
                    my1 my1Var = ry1Var3.c;
                    ((iz1) my1Var.o).i(i);
                    ((pb1) my1Var.r).a(i);
                    ((hz1) my1Var.p).i(0.0f / ry1Var3.o());
                    my1Var.q = null;
                    i91Var = (i91) ry1Var3.w.getValue();
                    if (i91Var != null) {
                        i91Var.k();
                    }
                } else {
                    ry1 ry1Var32 = (ry1) at0Var.m;
                    my1 my1Var2 = ry1Var32.c;
                    ((iz1) my1Var2.o).i(i);
                    ((pb1) my1Var2.r).a(i);
                    ((hz1) my1Var2.p).i(0.0f / ry1Var32.o());
                    my1Var2.q = null;
                    i91Var = (i91) ry1Var32.w.getValue();
                    if (i91Var != null) {
                    }
                }
            }
            ry1 ry1Var4 = (ry1) at0Var.m;
            List list = ry1Var4.l().a;
            int size = list.size();
            while (true) {
                if (i4 >= size) {
                    break;
                }
                Object obj3 = list.get(i4);
                if (((rj1) obj3).a == i3) {
                    obj2 = obj3;
                    break;
                }
                i4++;
            }
            float j = (((rj1) obj2) == null ? ((i3 - ry1Var4.j()) * (((ky1) ry1Var4.o.getValue()).c + ry1Var4.n())) - (ry1Var4.k() * ry1Var4.o()) : r2.l) + this.r;
            n8 n8Var = new n8(21, new z72(), ff2Var);
            this.m = 1;
            if (nk2.d(0.0f, j, this.s, n8Var, this, 4) == b50Var) {
                return b50Var;
            }
        } else {
            if (i2 != 1) {
                lh.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ca2.b(obj);
        }
        return Unit.a;
    }
}
