package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
@br1("navigation")
/* loaded from: classes.dex */
public class tp1 extends cr1 {
    public final dr1 c;

    public tp1(dr1 dr1Var) {
        dr1Var.getClass();
        this.c = dr1Var;
    }

    @Override // defpackage.cr1
    public final void d(List list, dq1 dq1Var) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cp1 cp1Var = (cp1) it.next();
            op1 op1Var = cp1Var.n;
            op1Var.getClass();
            rp1 rp1Var = (rp1) op1Var;
            c82 c82Var = new c82();
            c82Var.m = cp1Var.a();
            int i = rp1Var.w;
            String str = rp1Var.y;
            if (i == 0 && str == null) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i2 = rp1Var.r;
                sb.append(i2 != 0 ? String.valueOf(i2) : "the root navigation");
                throw new IllegalStateException(sb.toString().toString());
            }
            op1 d = str != null ? rp1Var.d(str, false) : (op1) rp1Var.v.c(i);
            if (d == null) {
                if (rp1Var.x == null) {
                    String str2 = rp1Var.y;
                    if (str2 == null) {
                        str2 = String.valueOf(rp1Var.w);
                    }
                    rp1Var.x = str2;
                }
                String str3 = rp1Var.x;
                str3.getClass();
                lh.e(q40.m("navigation destination ", str3, " is not a direct child of this NavGraph"));
                return;
            }
            LinkedHashMap linkedHashMap = d.q;
            if (str != null) {
                if (!str.equals(d.s)) {
                    mp1 c = d.c(str);
                    Bundle bundle = c != null ? c.n : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putAll(bundle);
                        Bundle bundle3 = (Bundle) c82Var.m;
                        if (bundle3 != null) {
                            bundle2.putAll(bundle3);
                        }
                        c82Var.m = bundle2;
                    }
                }
                if (mi1.i(linkedHashMap).isEmpty()) {
                    continue;
                } else {
                    ArrayList F = bd3.F(mi1.i(linkedHashMap), new m7(4, c82Var));
                    if (!F.isEmpty()) {
                        b71.l("Cannot navigate to startDestination ", d, ". Missing required arguments [", F, 93);
                        return;
                    }
                }
            }
            cr1 b = this.c.b(d.m);
            fp1 b2 = b();
            Bundle a = d.a((Bundle) c82Var.m);
            up1 up1Var = b2.h;
            b.d(pv.c(nm1.n(up1Var.a, d, a, up1Var.g(), up1Var.p)), dq1Var);
        }
    }

    @Override // defpackage.cr1
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public rp1 a() {
        return new rp1(this);
    }
}
