package defpackage;

import android.util.Property;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class flf extends Property {
    public flf(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = flh.a;
        return Float.valueOf(((flh) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        int i;
        flh flhVar = (flh) obj;
        float floatValue = ((Float) obj2).floatValue();
        flhVar.g = floatValue;
        float f = floatValue * 5400.0f;
        List list = flhVar.k;
        flu fluVar = (flu) list.get(0);
        float f2 = flhVar.g * 1520.0f;
        fluVar.a = (-20.0f) + f2;
        fluVar.b = f2;
        int i2 = 0;
        while (true) {
            i = (int) f;
            if (i2 >= 4) {
                break;
            }
            float h = flh.h(i, flh.a[i2], 667);
            float f3 = fluVar.b;
            adx adxVar = flhVar.d;
            fluVar.b = f3 + (adxVar.getInterpolation(h) * 250.0f);
            fluVar.a += adxVar.getInterpolation(flh.h(i, flh.b[i2], 667)) * 250.0f;
            i2++;
        }
        float f4 = fluVar.a;
        float f5 = fluVar.b;
        float f6 = f4 + ((f5 - f4) * flhVar.h);
        fluVar.a = f6;
        fluVar.a = f6 / 360.0f;
        fluVar.b = f5 / 360.0f;
        int i3 = 0;
        while (true) {
            if (i3 >= 4) {
                break;
            }
            float h2 = flh.h(i, flh.c[i3], 333);
            if (h2 > 0.0f && h2 < 1.0f) {
                int i4 = i3 + flhVar.f;
                int[] iArr = flhVar.e.e;
                int length = iArr.length;
                int i5 = i4 % length;
                int i6 = (i5 + 1) % length;
                int i7 = iArr[i5];
                int i8 = iArr[i6];
                ((flu) list.get(0)).c = fet.a(flhVar.d.getInterpolation(h2), Integer.valueOf(i7), Integer.valueOf(i8)).intValue();
                break;
            }
            i3++;
        }
        flhVar.j.invalidateSelf();
    }
}
