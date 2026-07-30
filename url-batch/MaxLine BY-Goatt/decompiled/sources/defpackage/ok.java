package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ok implements Function2 {
    public final /* synthetic */ int m = 1;
    public final /* synthetic */ Function0 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ ok(int i, vl1 vl1Var, String str, Function0 function0, boolean z) {
        this.p = str;
        this.n = function0;
        this.q = vl1Var;
        this.o = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        Object obj3 = this.q;
        Object obj4 = this.p;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int R = s03.R(1);
                s93.c((ik) obj4, this.o, (nh) obj3, this.n, (a00) obj, R);
                break;
            default:
                ((Integer) obj2).getClass();
                int R2 = s03.R(385);
                yi1.e((String) obj4, this.n, (vl1) obj3, this.o, (a00) obj, R2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ok(ik ikVar, boolean z, nh nhVar, Function0 function0, int i) {
        this.p = ikVar;
        this.o = z;
        this.q = nhVar;
        this.n = function0;
    }
}
