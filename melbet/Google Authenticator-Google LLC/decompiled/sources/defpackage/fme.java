package defpackage;

import android.util.Property;
import android.view.animation.Interpolator;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fme extends Property {
    public fme(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = fmf.a;
        return Float.valueOf(((fmf) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        List list;
        fmf fmfVar = (fmf) obj;
        float floatValue = ((Float) obj2).floatValue();
        fmfVar.g = floatValue;
        float f = floatValue * 1800.0f;
        int i = 0;
        while (true) {
            list = fmfVar.k;
            if (i >= list.size()) {
                break;
            }
            int i2 = (int) f;
            flu fluVar = (flu) list.get(i);
            int[] iArr = fmf.b;
            int i3 = i + i;
            int i4 = iArr[i3];
            int[] iArr2 = fmf.a;
            float h = fmf.h(i2, i4, iArr2[i3]);
            Interpolator[] interpolatorArr = fmfVar.c;
            fluVar.a = pj.i(interpolatorArr[i3].getInterpolation(h), 0.0f, 1.0f);
            int i5 = i3 + 1;
            fluVar.b = pj.i(interpolatorArr[i5].getInterpolation(fmf.h(i2, iArr[i5], iArr2[i5])), 0.0f, 1.0f);
            i++;
        }
        if (fmfVar.f) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((flu) it.next()).c = fmfVar.d.e[fmfVar.e];
            }
            fmfVar.f = false;
        }
        fmfVar.j.invalidateSelf();
    }
}
