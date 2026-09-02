package q0;

import android.graphics.RectF;
import android.view.View;
import androidx.emoji2.text.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import n0.q1;
import n0.y0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class f extends a1.b {

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3064b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f3065c;

    public f(g gVar) {
        this.f3065c = gVar;
    }

    @Override // a1.b
    public final void a(y0 y0Var) {
        ArrayList arrayList = this.f3065c.f3067b;
        if ((y0Var.f2803a.d() & 519) != 0) {
            this.f3064b.remove(y0Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) arrayList.get(size);
                int i = cVar.f3057e;
                boolean z3 = i > 0;
                int i4 = i - 1;
                cVar.f3057e = i4;
                if (z3 && i4 == 0) {
                    cVar.c();
                }
            }
        }
    }

    @Override // a1.b
    public final void b(y0 y0Var) {
        ArrayList arrayList = this.f3065c.f3067b;
        if ((y0Var.f2803a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((c) arrayList.get(size)).f3057e++;
            }
        }
    }

    @Override // a1.b
    public final q1 c(q1 q1Var, List list) {
        ArrayList arrayList = this.f3065c.f3067b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            y0 y0Var = (y0) list.get(size);
            Integer num = (Integer) this.f3064b.get(y0Var);
            if (num != null) {
                int intValue = num.intValue();
                float a2 = y0Var.f2803a.a();
                if ((intValue & 1) != 0) {
                    rectF.left = a2;
                }
                if ((intValue & 2) != 0) {
                    rectF.top = a2;
                }
                if ((intValue & 4) != 0) {
                    rectF.right = a2;
                }
                if ((intValue & 8) != 0) {
                    rectF.bottom = a2;
                }
                i |= intValue;
            }
        }
        f0.c b4 = f0.c.b(q1Var.f2775a.f(519), q1Var.f2775a.f(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            c cVar = (c) arrayList.get(size2);
            f0.c cVar2 = cVar.d;
            ArrayList arrayList2 = cVar.f3054a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                a aVar = (a) arrayList2.get(size3);
                int i4 = aVar.f3040a;
                if ((i4 & i) != 0) {
                    b bVar = aVar.f3041b;
                    if (!bVar.d) {
                        bVar.d = true;
                        q qVar = bVar.i;
                        if (qVar != null) {
                            ((View) qVar.f347h).setVisibility(0);
                        }
                    }
                    if (i4 == 1) {
                        int i5 = cVar2.f1266a;
                        if (i5 > 0) {
                            aVar.b(b4.f1266a / i5);
                        }
                        aVar.a(rectF.left);
                    } else if (i4 == 2) {
                        int i6 = cVar2.f1267b;
                        if (i6 > 0) {
                            aVar.b(b4.f1267b / i6);
                        }
                        aVar.a(rectF.top);
                    } else if (i4 == 4) {
                        int i7 = cVar2.f1268c;
                        if (i7 > 0) {
                            aVar.b(b4.f1268c / i7);
                        }
                        aVar.a(rectF.right);
                    } else if (i4 == 8) {
                        int i8 = cVar2.d;
                        if (i8 > 0) {
                            aVar.b(b4.d / i8);
                        }
                        aVar.a(rectF.bottom);
                    }
                }
            }
        }
        return q1Var;
    }

    @Override // a1.b
    public final q d(y0 y0Var, q qVar) {
        if ((y0Var.f2803a.d() & 519) != 0) {
            f0.c cVar = (f0.c) qVar.f347h;
            f0.c cVar2 = (f0.c) qVar.f346g;
            int i = cVar.f1266a != cVar2.f1266a ? 1 : 0;
            if (cVar.f1267b != cVar2.f1267b) {
                i |= 2;
            }
            if (cVar.f1268c != cVar2.f1268c) {
                i |= 4;
            }
            if (cVar.d != cVar2.d) {
                i |= 8;
            }
            this.f3064b.put(y0Var, Integer.valueOf(i));
        }
        return qVar;
    }
}
