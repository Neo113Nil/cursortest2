package defpackage;

import android.content.Context;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class t4 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ t4(Object obj, Object obj2, Object obj3, int i) {
        this.m = i;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        int i2 = 3;
        Object obj2 = this.p;
        Object obj3 = this.o;
        Object obj4 = this.n;
        switch (i) {
            case 0:
                a50 a50Var = (a50) obj4;
                ij1 ij1Var = (ij1) obj3;
                zn1 zn1Var = (zn1) obj2;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    z71.H(a50Var, null, new j5(ij1Var, uri, zn1Var, null), 3);
                }
                return Unit.a;
            case 1:
                id1 id1Var = (id1) obj4;
                c82 c82Var = new c82();
                dd1 dd1Var = new dd1((ld1) obj3, c82Var, (Function1) obj2, 0);
                id1Var.getLifecycle().a(dd1Var);
                return new nc(id1Var, dd1Var, c82Var, 2);
            case 2:
                kd2 kd2Var = (kd2) obj4;
                od2 od2Var = (od2) obj2;
                tn1 tn1Var = kd2Var.n;
                if (tn1Var.b(obj3)) {
                    b71.p(obj3, " was used multiple times ", "Key ");
                    return null;
                }
                kd2Var.m.remove(obj3);
                tn1Var.m(obj3, od2Var);
                return new nc(kd2Var, obj3, od2Var, i2);
            default:
                a50 a50Var2 = (a50) obj4;
                ij1 ij1Var2 = (ij1) obj3;
                Context context = (Context) obj2;
                Uri uri2 = (Uri) obj;
                if (uri2 != null) {
                    z71.H(a50Var2, null, new ed(ij1Var2, context, uri2, null, 20), 3);
                }
                return Unit.a;
        }
    }
}
