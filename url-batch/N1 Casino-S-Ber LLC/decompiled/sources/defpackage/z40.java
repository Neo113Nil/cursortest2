package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class z40 extends vd {
    public final HashMap b = new HashMap();
    public final /* synthetic */ a50 c;

    public z40(a50 a50Var) {
        this.c = a50Var;
    }

    @Override // defpackage.vd
    public final void a(xa0 xa0Var) {
        ArrayList arrayList = this.c.b;
        if ((xa0Var.a.d() & 519) != 0) {
            this.b.remove(xa0Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                mx mxVar = (mx) arrayList.get(size);
                int i = mxVar.e;
                boolean z = i > 0;
                int i2 = i - 1;
                mxVar.e = i2;
                if (z && i2 == 0) {
                    mxVar.c();
                }
            }
        }
    }

    @Override // defpackage.vd
    public final void b(xa0 xa0Var) {
        ArrayList arrayList = this.c.b;
        if ((xa0Var.a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((mx) arrayList.get(size)).e++;
            }
        }
    }

    @Override // defpackage.vd
    public final rb0 c(rb0 rb0Var, List list) {
        ArrayList arrayList = this.c.b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            xa0 xa0Var = (xa0) list.get(size);
            Integer num = (Integer) this.b.get(xa0Var);
            if (num != null) {
                int intValue = num.intValue();
                float a = xa0Var.a.a();
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
        to.b(rb0Var.a.h(519), rb0Var.a.h(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            mx mxVar = (mx) arrayList.get(size2);
            to toVar = mxVar.d;
            ArrayList arrayList2 = mxVar.a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                ((jb) arrayList2.get(size3)).getClass();
                if ((0 & i) != 0) {
                    throw null;
                }
            }
        }
        return rb0Var;
    }

    @Override // defpackage.vd
    public final q4 d(xa0 xa0Var, q4 q4Var) {
        if ((xa0Var.a.d() & 519) != 0) {
            to toVar = (to) q4Var.h;
            to toVar2 = (to) q4Var.g;
            int i = toVar.a != toVar2.a ? 1 : 0;
            if (toVar.b != toVar2.b) {
                i |= 2;
            }
            if (toVar.c != toVar2.c) {
                i |= 4;
            }
            if (toVar.d != toVar2.d) {
                i |= 8;
            }
            this.b.put(xa0Var, Integer.valueOf(i));
        }
        return q4Var;
    }
}
