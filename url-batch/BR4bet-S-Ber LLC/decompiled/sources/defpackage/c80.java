package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class c80 extends nf {
    public final HashMap b = new HashMap();
    public final /* synthetic */ d80 c;

    public c80(d80 d80Var) {
        this.c = d80Var;
    }

    @Override // defpackage.nf
    public final void a(ee0 ee0Var) {
        ArrayList arrayList = this.c.b;
        if ((ee0Var.a.d() & 519) != 0) {
            this.b.remove(ee0Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                p00 p00Var = (p00) arrayList.get(size);
                int i = p00Var.e;
                boolean z = i > 0;
                int i2 = i - 1;
                p00Var.e = i2;
                if (z && i2 == 0) {
                    p00Var.c();
                }
            }
        }
    }

    @Override // defpackage.nf
    public final void b(ee0 ee0Var) {
        ArrayList arrayList = this.c.b;
        if ((ee0Var.a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((p00) arrayList.get(size)).e++;
            }
        }
    }

    @Override // defpackage.nf
    public final ye0 c(ye0 ye0Var, List list) {
        ArrayList arrayList = this.c.b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            ee0 ee0Var = (ee0) list.get(size);
            Integer num = (Integer) this.b.get(ee0Var);
            if (num != null) {
                int intValue = num.intValue();
                float a = ee0Var.a.a();
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
        er.b(ye0Var.a.h(519), ye0Var.a.h(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            p00 p00Var = (p00) arrayList.get(size2);
            er erVar = p00Var.d;
            ArrayList arrayList2 = p00Var.a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                ((ec) arrayList2.get(size3)).getClass();
                if ((0 & i) != 0) {
                    throw null;
                }
            }
        }
        return ye0Var;
    }

    @Override // defpackage.nf
    public final a5 d(ee0 ee0Var, a5 a5Var) {
        if ((ee0Var.a.d() & 519) != 0) {
            er erVar = (er) a5Var.h;
            er erVar2 = (er) a5Var.g;
            int i = erVar.a != erVar2.a ? 1 : 0;
            if (erVar.b != erVar2.b) {
                i |= 2;
            }
            if (erVar.c != erVar2.c) {
                i |= 4;
            }
            if (erVar.d != erVar2.d) {
                i |= 8;
            }
            this.b.put(ee0Var, Integer.valueOf(i));
        }
        return a5Var;
    }
}
