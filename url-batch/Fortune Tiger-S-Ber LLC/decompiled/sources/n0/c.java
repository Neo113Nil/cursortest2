package n0;

import a2.s;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k0.m1;
import k0.o0;
import k0.w0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c extends o0 {

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2941b = new HashMap();
    public final /* synthetic */ d c;

    public c(d dVar) {
        this.c = dVar;
    }

    @Override // k0.o0
    public final void a(w0 w0Var) {
        ArrayList arrayList = this.c.f2943b;
        if ((w0Var.f2788a.d() & 519) != 0) {
            this.f2941b.remove(w0Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i4 = aVar.c;
                boolean z3 = i4 > 0;
                int i5 = i4 - 1;
                aVar.c = i5;
                if (z3 && i5 == 0) {
                    ArrayList arrayList2 = aVar.f2937a;
                    int size2 = arrayList2.size() - 1;
                    if (size2 >= 0) {
                        throw androidx.fragment.app.w0.d(arrayList2, size2);
                    }
                }
            }
        }
    }

    @Override // k0.o0
    public final void b(w0 w0Var) {
        ArrayList arrayList = this.c.f2943b;
        if ((w0Var.f2788a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((a) arrayList.get(size)).c++;
            }
        }
    }

    @Override // k0.o0
    public final m1 c(m1 m1Var, List list) {
        ArrayList arrayList = this.c.f2943b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        for (int size = list.size() - 1; size >= 0; size--) {
            w0 w0Var = (w0) list.get(size);
            Integer num = (Integer) this.f2941b.get(w0Var);
            if (num != null) {
                int intValue = num.intValue();
                float a4 = w0Var.f2788a.a();
                if ((intValue & 1) != 0) {
                    rectF.left = a4;
                }
                if ((intValue & 2) != 0) {
                    rectF.top = a4;
                }
                if ((intValue & 4) != 0) {
                    rectF.right = a4;
                }
                if ((intValue & 8) != 0) {
                    rectF.bottom = a4;
                }
            }
        }
        c0.c.b(m1Var.f2760a.f(519), m1Var.f2760a.f(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList2 = ((a) arrayList.get(size2)).f2937a;
            int size3 = arrayList2.size() - 1;
            if (size3 >= 0) {
                throw androidx.fragment.app.w0.d(arrayList2, size3);
            }
        }
        return m1Var;
    }

    @Override // k0.o0
    public final s d(w0 w0Var, s sVar) {
        if ((w0Var.f2788a.d() & 519) != 0) {
            c0.c cVar = (c0.c) sVar.h;
            c0.c cVar2 = (c0.c) sVar.g;
            int i4 = cVar.f978a != cVar2.f978a ? 1 : 0;
            if (cVar.f979b != cVar2.f979b) {
                i4 |= 2;
            }
            if (cVar.c != cVar2.c) {
                i4 |= 4;
            }
            if (cVar.f980d != cVar2.f980d) {
                i4 |= 8;
            }
            this.f2941b.put(w0Var, Integer.valueOf(i4));
        }
        return sVar;
    }
}
