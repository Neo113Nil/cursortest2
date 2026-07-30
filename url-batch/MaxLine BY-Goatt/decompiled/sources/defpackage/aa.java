package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class aa extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(q50 q50Var, cu1 cu1Var, nv2 nv2Var, sc1 sc1Var, nn2 nn2Var) {
        super(1);
        this.m = 3;
        this.o = q50Var;
        this.p = cu1Var;
        this.n = nv2Var;
        this.q = sc1Var;
        this.r = nn2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        int i = this.m;
        Object obj2 = this.r;
        Object obj3 = this.q;
        Object obj4 = this.n;
        Object obj5 = this.p;
        Object obj6 = this.o;
        switch (i) {
            case 0:
                tc1 tc1Var = (tc1) obj;
                nc1 nc1Var = ((ea) obj6).a;
                tc1Var.h = (nv2) obj4;
                tc1Var.i = (c11) obj5;
                tc1Var.c = (oc) obj3;
                tc1Var.d = (Function1) obj2;
                tc1Var.e = nc1Var != null ? nc1Var.B : null;
                tc1Var.f = nc1Var != null ? nc1Var.C : null;
                tc1Var.g = nc1Var != null ? (g53) tk3.J(nc1Var, p00.s) : null;
                break;
            case 1:
                m32 m32Var = (m32) obj4;
                m32Var.z.addView(m32Var, m32Var.A);
                m32Var.j((Function0) obj6, (p32) obj5, (String) obj3, (u81) obj2);
                break;
            case 2:
                cp1 cp1Var = (cp1) obj;
                a82 a82Var = (a82) obj5;
                cp1Var.getClass();
                ((y72) obj4).m = true;
                ArrayList arrayList = (ArrayList) obj6;
                int indexOf = arrayList.indexOf(cp1Var);
                if (indexOf != -1) {
                    int i2 = indexOf + 1;
                    list = arrayList.subList(a82Var.m, i2);
                    a82Var.m = i2;
                } else {
                    list = ah0.m;
                }
                ((up1) obj3).a(cp1Var.n, (Bundle) obj2, cp1Var, list);
                break;
            default:
                k91 k91Var = (k91) obj;
                k91Var.a();
                float h = ((q50) obj6).b.h();
                if (h != 0.0f) {
                    long j = ((nv2) obj4).b;
                    int i3 = jw2.c;
                    int g = ((cu1) obj5).g((int) (j >> 32));
                    cw2 d = ((sc1) obj3).d();
                    w72 c = d != null ? d.a.c(g) : new w72(0.0f, 0.0f, 0.0f, 0.0f);
                    float D = k91Var.D(eu2.a);
                    float f = D / 2.0f;
                    float f2 = c.a + f;
                    float d2 = ql2.d(k91Var.m.f()) - f;
                    if (f2 > d2) {
                        f2 = d2;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    yd0.U(k91Var, (nn2) obj2, ap.i(f, c.b), ap.i(f, c.d), D, h, 432);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aa(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(1);
        this.m = i;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
        this.q = obj4;
        this.r = obj5;
    }
}
