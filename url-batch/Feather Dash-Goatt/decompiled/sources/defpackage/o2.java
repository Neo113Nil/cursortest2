package defpackage;

import android.os.Bundle;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class o2 extends pc0 implements Function1 {
    public final /* synthetic */ j2 d;
    public final /* synthetic */ rj e;
    public final /* synthetic */ String g;
    public final /* synthetic */ uq1 h;
    public final /* synthetic */ ao0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(j2 j2Var, rj rjVar, String str, uq1 uq1Var, ao0 ao0Var) {
        super(1);
        this.d = j2Var;
        this.e = rjVar;
        this.g = str;
        this.h = uq1Var;
        this.i = ao0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        m2 m2Var = new m2(0, this.i);
        ao0 ao0Var = (ao0) m2Var.e;
        rj rjVar = this.e;
        Bundle bundle = rjVar.g;
        HashMap hashMap = rjVar.a;
        HashMap hashMap2 = rjVar.f;
        HashMap hashMap3 = rjVar.b;
        String str = this.g;
        if (((Integer) hashMap3.get(str)) == null) {
            y01.d.getClass();
            int e = y01.e.e(2147418112);
            while (true) {
                i = e + 65536;
                if (!hashMap.containsKey(Integer.valueOf(i))) {
                    break;
                }
                y01.d.getClass();
                e = y01.e.e(2147418112);
            }
            hashMap.put(Integer.valueOf(i), str);
            hashMap3.put(str, Integer.valueOf(i));
        }
        HashMap hashMap4 = rjVar.e;
        uq1 uq1Var = this.h;
        hashMap4.put(str, new l2(m2Var, uq1Var));
        if (hashMap2.containsKey(str)) {
            Object obj2 = hashMap2.get(str);
            hashMap2.remove(str);
            ((Function1) ao0Var.getValue()).invoke(obj2);
        }
        h2 h2Var = (h2) bundle.getParcelable(str);
        if (h2Var != null) {
            bundle.remove(str);
            ((Function1) ao0Var.getValue()).invoke(uq1Var.O(h2Var.d, h2Var.e));
        }
        k2 k2Var = new k2(rjVar, str, uq1Var);
        j2 j2Var = this.d;
        j2Var.a = k2Var;
        return new n2(0, j2Var);
    }
}
