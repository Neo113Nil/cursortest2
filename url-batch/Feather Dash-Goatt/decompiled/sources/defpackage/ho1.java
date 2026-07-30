package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ho1 extends sf1 implements Function2 {
    public final /* synthetic */ String i;
    public final /* synthetic */ Function0 j;
    public final /* synthetic */ String k;
    public final /* synthetic */ ao0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho1(String str, Function0 function0, String str2, ao0 ao0Var, dn dnVar) {
        super(2, dnVar);
        this.i = str;
        this.j = function0;
        this.k = str2;
        this.l = ao0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        return ((ho1) h((dn) obj2, (sn) obj)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        return new ho1(this.i, this.j, this.k, this.l, dnVar);
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        tn tnVar = tn.d;
        ca0.v(obj);
        ao0 ao0Var = this.l;
        String str = this.i;
        if (str == null || StringsKt.n(str)) {
            String str2 = this.k;
            if (!StringsKt.n(str2) && StringsKt.n((String) ao0Var.getValue())) {
                ao0Var.setValue(str2);
            }
        } else {
            ao0Var.setValue(str);
            this.j.invoke();
        }
        return Unit.a;
    }
}
