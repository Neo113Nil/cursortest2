package defpackage;

import android.animation.TimeInterpolator;
import android.util.Property;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class flk extends Property {
    public flk(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = flm.a;
        return Float.valueOf(((flm) obj).f);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        int i;
        flm flmVar = (flm) obj;
        float floatValue = ((Float) obj2).floatValue();
        flmVar.f = floatValue;
        float f = floatValue * 6000.0f;
        List list = flmVar.k;
        flu fluVar = (flu) list.get(0);
        float f2 = flmVar.f * 1080.0f;
        int[] iArr = flm.a;
        int length = iArr.length;
        int i2 = 0;
        float f3 = 0.0f;
        while (true) {
            i = (int) f;
            if (i2 >= 4) {
                break;
            }
            f3 += flmVar.c.getInterpolation(flm.h(i, iArr[i2], 500)) * 90.0f;
            i2++;
        }
        fluVar.g = f2 + f3;
        TimeInterpolator timeInterpolator = flmVar.c;
        float interpolation = timeInterpolator.getInterpolation(flm.h(i, 0, 3000)) - timeInterpolator.getInterpolation(flm.h(i, 3000, 3000));
        fluVar.a = 0.0f;
        float[] fArr = flm.b;
        float f4 = ((1.0f - interpolation) * fArr[0]) + (interpolation * fArr[1]);
        fluVar.b = f4;
        float f5 = flmVar.g;
        if (f5 > 0.0f) {
            fluVar.b = f4 * (1.0f - f5);
        }
        int i3 = 0;
        while (true) {
            int length2 = iArr.length;
            if (i3 >= 4) {
                break;
            }
            float h = flm.h(i, iArr[i3], 100);
            if (h >= 0.0f && h <= 1.0f) {
                int i4 = i3 + flmVar.e;
                int[] iArr2 = flmVar.d.e;
                int length3 = iArr2.length;
                int i5 = i4 % length3;
                int i6 = (i5 + 1) % length3;
                int i7 = iArr2[i5];
                int i8 = iArr2[i6];
                ((flu) list.get(0)).c = fet.a(timeInterpolator.getInterpolation(h), Integer.valueOf(i7), Integer.valueOf(i8)).intValue();
                break;
            }
            i3++;
        }
        flmVar.j.invalidateSelf();
    }
}
