package s2;

import o.r;
import o.u0;
import r2.h;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f6691a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* renamed from: b, reason: collision with root package name */
    public static volatile u0 f6692b = new u0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f6693c;

    static {
        Object[] objArr = new Object[0];
        f6693c = objArr;
        synchronized (objArr) {
            f6692b.e((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f6692b.e((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f6692b.e((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f6692b.e((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f6692b.e((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f6692b.d(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        h.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static a a(float f6) {
        float d8;
        a aVar;
        float[] fArr = f6691a;
        if (f6 < 1.03f) {
            return null;
        }
        int i = (int) (f6 * 100.0f);
        a aVar2 = (a) f6692b.c(i);
        if (aVar2 != null) {
            return aVar2;
        }
        u0 u0Var = f6692b;
        if (u0Var.f5547d) {
            r.a(u0Var);
        }
        int a8 = p.a.a(u0Var.f5550g, i, u0Var.f5548e);
        if (a8 >= 0) {
            return (a) f6692b.g(a8);
        }
        int i8 = -(a8 + 1);
        int i9 = i8 - 1;
        if (i8 >= f6692b.f()) {
            c cVar = new c(new float[]{1.0f}, new float[]{f6});
            b(f6, cVar);
            return cVar;
        }
        if (i9 < 0) {
            aVar = new c(fArr, fArr);
            d8 = 1.0f;
        } else {
            d8 = f6692b.d(i9) / 100.0f;
            aVar = (a) f6692b.g(i9);
        }
        float d9 = f6692b.d(i8) / 100.0f;
        float max = (Math.max(0.0f, Math.min(1.0f, d8 == d9 ? 0.0f : (f6 - d8) / (d9 - d8))) * 1.0f) + 0.0f;
        a aVar3 = (a) f6692b.g(i8);
        float[] fArr2 = new float[9];
        for (int i10 = 0; i10 < 9; i10++) {
            float f8 = fArr[i10];
            float b8 = aVar.b(f8);
            fArr2[i10] = ((aVar3.b(f8) - b8) * max) + b8;
        }
        c cVar2 = new c(fArr, fArr2);
        b(f6, cVar2);
        return cVar2;
    }

    public static void b(float f6, c cVar) {
        synchronized (f6693c) {
            u0 clone = f6692b.clone();
            clone.e((int) (f6 * 100.0f), cVar);
            f6692b = clone;
        }
    }
}
