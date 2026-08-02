package defpackage;

import android.util.Property;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fma extends Property {
    public fma(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int i = fmb.f;
        return Float.valueOf(((fmb) obj).e);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        fmb fmbVar = (fmb) obj;
        float floatValue = ((Float) obj2).floatValue();
        fmbVar.e = floatValue;
        List list = fmbVar.k;
        ((flu) list.get(0)).a = 0.0f;
        flu fluVar = (flu) list.get(0);
        flu fluVar2 = (flu) list.get(1);
        adx adxVar = fmbVar.a;
        float h = fmb.h((int) (floatValue * 333.0f), 0, 667);
        float interpolation = adxVar.getInterpolation(h);
        fluVar2.a = interpolation;
        fluVar.b = interpolation;
        flu fluVar3 = (flu) list.get(1);
        flu fluVar4 = (flu) list.get(2);
        float interpolation2 = adxVar.getInterpolation(h + 0.49925038f);
        fluVar4.a = interpolation2;
        fluVar3.b = interpolation2;
        ((flu) list.get(2)).b = 1.0f;
        if (fmbVar.d && ((flu) list.get(1)).b < 1.0f) {
            ((flu) list.get(2)).c = ((flu) list.get(1)).c;
            ((flu) list.get(1)).c = ((flu) list.get(0)).c;
            ((flu) list.get(0)).c = fmbVar.b.e[fmbVar.c];
            fmbVar.d = false;
        }
        fmbVar.j.invalidateSelf();
    }
}
