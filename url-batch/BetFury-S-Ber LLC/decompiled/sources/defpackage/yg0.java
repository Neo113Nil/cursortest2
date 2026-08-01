package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class yg0 extends co0 {
    public final HashMap b = new HashMap();
    public final /* synthetic */ zg0 c;

    public yg0(zg0 zg0Var) {
        this.c = zg0Var;
    }

    @Override // defpackage.co0
    public final void a(jo0 jo0Var) {
        ArrayList arrayList = this.c.b;
        if ((jo0Var.a.d() & 519) != 0) {
            this.b.remove(jo0Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                s60 s60Var = (s60) arrayList.get(size);
                int i = s60Var.e;
                boolean z = i > 0;
                int i2 = i - 1;
                s60Var.e = i2;
                if (z && i2 == 0) {
                    s60Var.c();
                }
            }
        }
    }

    @Override // defpackage.co0
    public final void b(jo0 jo0Var) {
        ArrayList arrayList = this.c.b;
        if ((jo0Var.a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((s60) arrayList.get(size)).e++;
            }
        }
    }

    @Override // defpackage.co0
    public final dp0 c(dp0 dp0Var, List list) {
        ArrayList arrayList = this.c.b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            jo0 jo0Var = (jo0) list.get(size);
            Integer num = (Integer) this.b.get(jo0Var);
            if (num != null) {
                int intValue = num.intValue();
                float a = jo0Var.a.a();
                if ((intValue & 1) != 0) {
                    rectF.left = a;
                }
                if ((intValue & 2) != 0) {
                    rectF.top = a;
                }
                if ((intValue & 4) != 0) {
                    rectF.right = a;
                }
                if ((intValue & 8) != 0) {
                    rectF.bottom = a;
                }
                i |= intValue;
            }
        }
        fv.b(dp0Var.a.h(519), dp0Var.a.h(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            s60 s60Var = (s60) arrayList.get(size2);
            fv fvVar = s60Var.d;
            ArrayList arrayList2 = s60Var.a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                ((dd) arrayList2.get(size3)).getClass();
                if ((0 & i) != 0) {
                    throw null;
                }
            }
        }
        return dp0Var;
    }

    @Override // defpackage.co0
    public final tl0 d(jo0 jo0Var, tl0 tl0Var) {
        if ((jo0Var.a.d() & 519) != 0) {
            fv fvVar = (fv) tl0Var.h;
            fv fvVar2 = (fv) tl0Var.g;
            int i = fvVar.a != fvVar2.a ? 1 : 0;
            if (fvVar.b != fvVar2.b) {
                i |= 2;
            }
            if (fvVar.c != fvVar2.c) {
                i |= 4;
            }
            if (fvVar.d != fvVar2.d) {
                i |= 8;
            }
            this.b.put(jo0Var, Integer.valueOf(i));
        }
        return tl0Var;
    }
}
