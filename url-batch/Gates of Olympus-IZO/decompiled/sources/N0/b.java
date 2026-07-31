package N0;

import j.AbstractC0495m;
import j.C0481G;
import k.AbstractC0522a;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f2849a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0481G f2850b = new C0481G();

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f2851c;

    static {
        Object[] objArr = new Object[0];
        f2851c = objArr;
        synchronized (objArr) {
            f2850b.d((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f2850b.d((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f2850b.d((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f2850b.d((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f2850b.d((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f2850b.c(0) / 100.0f) - 0.01f <= 1.03f) {
            throw new IllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
    }

    public static a a(float f3) {
        float c3;
        a aVar;
        if (f3 < 1.03f) {
            return null;
        }
        int i3 = (int) (f3 * 100.0f);
        a aVar2 = (a) f2850b.b(i3);
        if (aVar2 != null) {
            return aVar2;
        }
        C0481G c0481g = f2850b;
        if (c0481g.f5141d) {
            AbstractC0495m.a(c0481g);
        }
        int a3 = AbstractC0522a.a(c0481g.f5142e, c0481g.f5144g, i3);
        if (a3 >= 0) {
            return (a) f2850b.f(a3);
        }
        int i4 = -(a3 + 1);
        int i5 = i4 - 1;
        if (i4 >= f2850b.e()) {
            c cVar = new c(new float[]{1.0f}, new float[]{f3});
            b(f3, cVar);
            return cVar;
        }
        float[] fArr = f2849a;
        if (i5 < 0) {
            aVar = new c(fArr, fArr);
            c3 = 1.0f;
        } else {
            c3 = f2850b.c(i5) / 100.0f;
            aVar = (a) f2850b.f(i5);
        }
        float c4 = f2850b.c(i4) / 100.0f;
        float max = (Math.max(0.0f, Math.min(1.0f, c3 == c4 ? 0.0f : (f3 - c3) / (c4 - c3))) * 1.0f) + 0.0f;
        a aVar3 = (a) f2850b.f(i4);
        float[] fArr2 = new float[9];
        for (int i6 = 0; i6 < 9; i6++) {
            float f4 = fArr[i6];
            float b2 = aVar.b(f4);
            fArr2[i6] = ((aVar3.b(f4) - b2) * max) + b2;
        }
        c cVar2 = new c(fArr, fArr2);
        b(f3, cVar2);
        return cVar2;
    }

    public static void b(float f3, c cVar) {
        synchronized (f2851c) {
            C0481G clone = f2850b.clone();
            clone.d((int) (f3 * 100.0f), cVar);
            f2850b = clone;
        }
    }
}
