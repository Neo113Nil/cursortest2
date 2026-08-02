package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aba extends yy {
    final /* synthetic */ abc b;
    private final HashMap c = new HashMap();

    public aba(abc abcVar) {
        this.b = abcVar;
    }

    private static final boolean e(brn brnVar) {
        return (brnVar.J() & 519) != 0;
    }

    @Override // defpackage.yy
    public final void a(zz zzVar, List list) {
        ArrayList arrayList;
        int size;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            brn brnVar = (brn) list.get(size2);
            Integer num = (Integer) this.c.get(brnVar);
            if (num != null) {
                int intValue = num.intValue();
                float g = ((zf) brnVar.a).g();
                if ((intValue & 1) != 0) {
                    rectF.left = g;
                }
                if ((intValue & 2) != 0) {
                    rectF.top = g;
                }
                if ((intValue & 4) != 0) {
                    rectF.right = g;
                }
                if ((intValue & 8) != 0) {
                    rectF.bottom = g;
                }
            }
        }
        abc abcVar = this.b;
        abc.a(zzVar);
        ArrayList arrayList2 = abcVar.b;
        int size3 = arrayList2.size();
        do {
            size3--;
            if (size3 < 0) {
                return;
            }
            arrayList = ((aay) arrayList2.get(size3)).a;
            size = arrayList.size() - 1;
        } while (size < 0);
        throw null;
    }

    @Override // defpackage.yy
    public final void b(brn brnVar) {
        if (!e(brnVar)) {
            return;
        }
        this.c.remove(brnVar);
        ArrayList arrayList = this.b.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            aay aayVar = (aay) arrayList.get(size);
            int i = aayVar.c;
            int i2 = i - 1;
            aayVar.c = i2;
            if (i > 0 && i2 == 0) {
                aayVar.b();
            }
        }
    }

    @Override // defpackage.yy
    public final void c(brn brnVar) {
        if (!e(brnVar)) {
            return;
        }
        ArrayList arrayList = this.b.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((aay) arrayList.get(size)).c++;
        }
    }

    @Override // defpackage.yy
    public final void d(brn brnVar, yx yxVar) {
        if (e(brnVar)) {
            vb vbVar = yxVar.b;
            vb vbVar2 = yxVar.a;
            int i = vbVar.b != vbVar2.b ? 1 : 0;
            if (vbVar.c != vbVar2.c) {
                i |= 2;
            }
            if (vbVar.d != vbVar2.d) {
                i |= 4;
            }
            if (vbVar.e != vbVar2.e) {
                i |= 8;
            }
            this.c.put(brnVar, Integer.valueOf(i));
        }
    }
}
