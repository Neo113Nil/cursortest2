package defpackage;

import android.os.Bundle;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class m7 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ c82 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m7(int i, c82 c82Var) {
        super(1);
        this.m = i;
        this.n = c82Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        boolean z = true;
        c82 c82Var = this.n;
        switch (i) {
            case 0:
                c82Var.m = (yo0) obj;
                return Boolean.TRUE;
            case 1:
                c82Var.m = (n12) obj;
                return Unit.a;
            case 2:
                c82Var.m = (n12) obj;
                return Unit.a;
            case 3:
                p22 p22Var = (p22) obj;
                Object obj2 = c82Var.m;
                if (obj2 == null && p22Var.B) {
                    c82Var.m = p22Var;
                } else if (obj2 != null) {
                    p22Var.getClass();
                }
                return Boolean.TRUE;
            case 4:
                String str = (String) obj;
                str.getClass();
                Object obj3 = c82Var.m;
                if (obj3 != null && ((Bundle) obj3).containsKey(str)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                o90 o90Var = (rz2) obj;
                if (((ul1) o90Var).m.z) {
                    c82Var.m = o90Var;
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                rz2 rz2Var = (rz2) obj;
                rz2Var.getClass();
                xb1 xb1Var = ((sz2) rz2Var).A;
                List list = (List) c82Var.m;
                if (list != null) {
                    list.add(xb1Var);
                } else {
                    list = qv.h(xb1Var);
                }
                c82Var.m = list;
                return qz2.n;
        }
    }
}
