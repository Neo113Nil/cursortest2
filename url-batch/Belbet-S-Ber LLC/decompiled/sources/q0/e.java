package q0;

import android.graphics.RectF;
import androidx.emoji2.text.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import n0.b1;
import n0.v1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e extends b1.b {

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3134b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3135c;

    public e(f fVar) {
        this.f3135c = fVar;
    }

    @Override // b1.b
    public final void a(b1 b1Var) {
        ArrayList arrayList = this.f3135c.f3137b;
        if ((b1Var.f2759a.d() & 519) != 0) {
            this.f3134b.remove(b1Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) arrayList.get(size);
                int i = cVar.f3130e;
                boolean z4 = i > 0;
                int i4 = i - 1;
                cVar.f3130e = i4;
                if (z4 && i4 == 0) {
                    cVar.c();
                }
            }
        }
    }

    @Override // b1.b
    public final void b(b1 b1Var) {
        ArrayList arrayList = this.f3135c.f3137b;
        if ((b1Var.f2759a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((c) arrayList.get(size)).f3130e++;
            }
        }
    }

    @Override // b1.b
    public final v1 c(v1 v1Var, List list) {
        ArrayList arrayList = this.f3135c.f3137b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            b1 b1Var = (b1) list.get(size);
            Integer num = (Integer) this.f3134b.get(b1Var);
            if (num != null) {
                int intValue = num.intValue();
                float a5 = b1Var.f2759a.a();
                if ((intValue & 1) != 0) {
                    rectF.left = a5;
                }
                if ((intValue & 2) != 0) {
                    rectF.top = a5;
                }
                if ((intValue & 4) != 0) {
                    rectF.right = a5;
                }
                if ((intValue & 8) != 0) {
                    rectF.bottom = a5;
                }
                i |= intValue;
            }
        }
        f0.c.b(v1Var.f2842a.h(519), v1Var.f2842a.h(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            c cVar = (c) arrayList.get(size2);
            f0.c cVar2 = cVar.d;
            ArrayList arrayList2 = cVar.f3127a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                ((a) arrayList2.get(size3)).getClass();
                if ((0 & i) != 0) {
                    throw null;
                }
            }
        }
        return v1Var;
    }

    @Override // b1.b
    public final q d(b1 b1Var, q qVar) {
        if ((b1Var.f2759a.d() & 519) != 0) {
            f0.c cVar = (f0.c) qVar.h;
            f0.c cVar2 = (f0.c) qVar.f466g;
            int i = cVar.f1415a != cVar2.f1415a ? 1 : 0;
            if (cVar.f1416b != cVar2.f1416b) {
                i |= 2;
            }
            if (cVar.f1417c != cVar2.f1417c) {
                i |= 4;
            }
            if (cVar.d != cVar2.d) {
                i |= 8;
            }
            this.f3134b.put(b1Var, Integer.valueOf(i));
        }
        return qVar;
    }
}
