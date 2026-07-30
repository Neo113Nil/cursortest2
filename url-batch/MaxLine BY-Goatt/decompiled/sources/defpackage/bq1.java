package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bq1 extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ so2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bq1(so2 so2Var, int i) {
        super(0);
        this.m = i;
        this.n = so2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        so2 so2Var = this.n;
        switch (i) {
            case 0:
                List list = (List) so2Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Intrinsics.b(((cp1) obj).n.m, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 1:
                return (Float) so2Var.getValue();
            case 2:
                return new au1(((au1) so2Var.getValue()).a);
            case 3:
                pd pdVar = oh2.a;
                return new au1(((au1) so2Var.getValue()).a);
            case 4:
                return Boolean.valueOf(((Number) so2Var.getValue()).floatValue() > 0.0f);
            default:
                return Boolean.valueOf(((Number) so2Var.getValue()).floatValue() > 0.0f);
        }
    }
}
