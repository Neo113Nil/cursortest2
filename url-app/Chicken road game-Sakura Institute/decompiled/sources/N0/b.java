package N0;

import i.H;
import i.n;
import j.AbstractC0705a;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f3613a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* renamed from: b, reason: collision with root package name */
    public static volatile H f3614b = new H();

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f3615c;

    static {
        Object[] objArr = new Object[0];
        f3615c = objArr;
        synchronized (objArr) {
            f3614b.d((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f3614b.d((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f3614b.d((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f3614b.d((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f3614b.d((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            Unit unit = Unit.f7487a;
        }
        if ((f3614b.c(0) / 100.0f) - 0.01f <= 1.03f) {
            throw new IllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
    }

    public static a a(float f4) {
        float c4;
        a aVar;
        if (f4 < 1.03f) {
            return null;
        }
        int i2 = (int) (f4 * 100.0f);
        a aVar2 = (a) f3614b.b(i2);
        if (aVar2 != null) {
            return aVar2;
        }
        H h4 = f3614b;
        if (h4.f6896d) {
            n.a(h4);
        }
        int a4 = AbstractC0705a.a(h4.f6897e, h4.f6899j, i2);
        if (a4 >= 0) {
            return (a) f3614b.f(a4);
        }
        int i4 = -(a4 + 1);
        int i5 = i4 - 1;
        if (i4 >= f3614b.e()) {
            c cVar = new c(new float[]{1.0f}, new float[]{f4});
            b(f4, cVar);
            return cVar;
        }
        float[] fArr = f3613a;
        if (i5 < 0) {
            aVar = new c(fArr, fArr);
            c4 = 1.0f;
        } else {
            c4 = f3614b.c(i5) / 100.0f;
            aVar = (a) f3614b.f(i5);
        }
        float c5 = f3614b.c(i4) / 100.0f;
        float max = (Math.max(0.0f, Math.min(1.0f, c4 == c5 ? 0.0f : (f4 - c4) / (c5 - c4))) * 1.0f) + 0.0f;
        a aVar3 = (a) f3614b.f(i4);
        float[] fArr2 = new float[9];
        for (int i6 = 0; i6 < 9; i6++) {
            float f5 = fArr[i6];
            float b4 = aVar.b(f5);
            fArr2[i6] = ((aVar3.b(f5) - b4) * max) + b4;
        }
        c cVar2 = new c(fArr, fArr2);
        b(f4, cVar2);
        return cVar2;
    }

    public static void b(float f4, c cVar) {
        synchronized (f3615c) {
            H clone = f3614b.clone();
            clone.d((int) (f4 * 100.0f), cVar);
            f3614b = clone;
            Unit unit = Unit.f7487a;
        }
    }
}
