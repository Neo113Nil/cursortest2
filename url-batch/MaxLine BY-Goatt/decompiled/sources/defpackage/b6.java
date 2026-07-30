package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class b6 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b6(String str, int i) {
        super(1);
        this.m = i;
        this.n = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        String str = this.n;
        switch (i) {
            case 0:
                t71[] t71VarArr = ii2.a;
                ji2 ji2Var = gi2.d;
                t71 t71Var = ii2.a[2];
                ((sh2) obj).d(ji2Var, str);
                return Unit.a;
            case 1:
                sh2 sh2Var = (sh2) obj;
                t71[] t71VarArr2 = ii2.a;
                sh2Var.d(gi2.a, pv.c(str));
                ii2.b(sh2Var, 5);
                return Unit.a;
            case 2:
                return Boolean.valueOf(Intrinsics.b((String) obj, str));
            default:
                t71[] t71VarArr3 = ii2.a;
                ((sh2) obj).d(gi2.a, pv.c(str));
                return Unit.a;
        }
    }
}
