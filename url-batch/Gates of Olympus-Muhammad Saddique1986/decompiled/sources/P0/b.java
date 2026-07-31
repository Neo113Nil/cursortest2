package P0;

import j.AbstractC0539m;
import j.C0525G;
import k.AbstractC0561a;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f3914a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0525G f3915b = new C0525G();

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f3916c;

    static {
        Object[] objArr = new Object[0];
        f3916c = objArr;
        synchronized (objArr) {
            f3915b.d((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f3915b.d((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f3915b.d((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f3915b.d((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f3915b.d((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f3915b.c(0) / 100.0f) - 0.01f <= 1.03f) {
            throw new IllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
    }

    public static a a(float f3) {
        float c2;
        a aVar;
        if (f3 < 1.03f) {
            return null;
        }
        int i3 = (int) (f3 * 100.0f);
        a aVar2 = (a) f3915b.b(i3);
        if (aVar2 != null) {
            return aVar2;
        }
        C0525G c0525g = f3915b;
        if (c0525g.f6259d) {
            AbstractC0539m.a(c0525g);
        }
        int a3 = AbstractC0561a.a(c0525g.f6260e, c0525g.f6262g, i3);
        if (a3 >= 0) {
            return (a) f3915b.f(a3);
        }
        int i4 = -(a3 + 1);
        int i5 = i4 - 1;
        if (i4 >= f3915b.e()) {
            c cVar = new c(new float[]{1.0f}, new float[]{f3});
            b(f3, cVar);
            return cVar;
        }
        float[] fArr = f3914a;
        if (i5 < 0) {
            aVar = new c(fArr, fArr);
            c2 = 1.0f;
        } else {
            c2 = f3915b.c(i5) / 100.0f;
            aVar = (a) f3915b.f(i5);
        }
        float c3 = f3915b.c(i4) / 100.0f;
        float max = (Math.max(0.0f, Math.min(1.0f, c2 == c3 ? 0.0f : (f3 - c2) / (c3 - c2))) * 1.0f) + 0.0f;
        a aVar3 = (a) f3915b.f(i4);
        float[] fArr2 = new float[9];
        for (int i6 = 0; i6 < 9; i6++) {
            float f4 = fArr[i6];
            float b3 = aVar.b(f4);
            fArr2[i6] = ((aVar3.b(f4) - b3) * max) + b3;
        }
        c cVar2 = new c(fArr, fArr2);
        b(f3, cVar2);
        return cVar2;
    }

    public static void b(float f3, c cVar) {
        synchronized (f3916c) {
            C0525G clone = f3915b.clone();
            clone.d((int) (f3 * 100.0f), cVar);
            f3915b = clone;
        }
    }
}
