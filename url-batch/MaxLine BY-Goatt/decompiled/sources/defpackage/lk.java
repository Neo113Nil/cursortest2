package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class lk implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ so2 n;
    public final /* synthetic */ Function1 o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ lk(Object obj, zn1 zn1Var, Object obj2, Function1 function1, int i) {
        this.m = i;
        this.p = obj;
        this.n = zn1Var;
        this.q = obj2;
        this.o = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        Function1 function1 = this.o;
        Object obj2 = this.q;
        so2 so2Var = this.n;
        Object obj3 = this.p;
        switch (i) {
            case 0:
                nh nhVar = (nh) obj2;
                da1 da1Var = (da1) obj;
                da1Var.getClass();
                da1.V(da1Var, new zd(9), new my(575201921, new qk(0, (zk) obj3, so2Var), true));
                if (((vk) so2Var.getValue()).c.isEmpty()) {
                    da1.V(da1Var, new zd(10), j8.b);
                }
                List list = ((vk) so2Var.getValue()).c;
                zd zdVar = new zd(11);
                da1Var.q.b(list.size(), new ba1(new p8(9, zdVar, list), sc.D, new tk(0, list), new my(699646206, new uk(list, nhVar, function1, so2Var), true)));
                break;
            default:
                da1 da1Var2 = (da1) obj;
                da1Var2.getClass();
                da1.V(da1Var2, new zd(21), new my(1945200653, new b5((Function0) obj3, so2Var, (f61) obj2), true));
                if (((d61) so2Var.getValue()).d.isEmpty()) {
                    da1.V(da1Var2, new zd(22), iv1.b);
                }
                List list2 = ((d61) so2Var.getValue()).d;
                zd zdVar2 = new zd(23);
                da1Var2.q.b(list2.size(), new ba1(new p8(22, zdVar2, list2), sc.D, new tk(1, list2), new my(699646206, new uo1(list2, function1), true)));
                break;
        }
        return Unit.a;
    }
}
