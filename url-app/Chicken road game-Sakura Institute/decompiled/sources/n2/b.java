package n2;

import i.h0;
import i.m;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f6499a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* renamed from: b, reason: collision with root package name */
    public static volatile h0 f6500b = new h0();

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f6501c;

    static {
        Object[] objArr = new Object[0];
        f6501c = objArr;
        synchronized (objArr) {
            f6500b.d((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f6500b.d((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f6500b.d((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f6500b.d((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f6500b.d((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f6500b.c(0) / 100.0f) - 0.01f <= 1.03f) {
            throw new IllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
    }

    public static a a(float f9) {
        float c4;
        a aVar;
        float[] fArr = f6499a;
        if (f9 < 1.03f) {
            return null;
        }
        int i7 = (int) (f9 * 100.0f);
        a aVar2 = (a) f6500b.b(i7);
        if (aVar2 != null) {
            return aVar2;
        }
        h0 h0Var = f6500b;
        if (h0Var.f4746f) {
            m.a(h0Var);
        }
        int a3 = j.a.a(h0Var.f4747g, h0Var.f4749i, i7);
        if (a3 >= 0) {
            return (a) f6500b.f(a3);
        }
        int i8 = -(a3 + 1);
        int i9 = i8 - 1;
        if (i8 >= f6500b.e()) {
            c cVar = new c(new float[]{1.0f}, new float[]{f9});
            b(f9, cVar);
            return cVar;
        }
        if (i9 < 0) {
            aVar = new c(fArr, fArr);
            c4 = 1.0f;
        } else {
            c4 = f6500b.c(i9) / 100.0f;
            aVar = (a) f6500b.f(i9);
        }
        float c6 = f6500b.c(i8) / 100.0f;
        float max = (Math.max(0.0f, Math.min(1.0f, c4 == c6 ? 0.0f : (f9 - c4) / (c6 - c4))) * 1.0f) + 0.0f;
        a aVar3 = (a) f6500b.f(i8);
        float[] fArr2 = new float[9];
        for (int i10 = 0; i10 < 9; i10++) {
            float f10 = fArr[i10];
            float b9 = aVar.b(f10);
            fArr2[i10] = ((aVar3.b(f10) - b9) * max) + b9;
        }
        c cVar2 = new c(fArr, fArr2);
        b(f9, cVar2);
        return cVar2;
    }

    public static void b(float f9, c cVar) {
        synchronized (f6501c) {
            h0 clone = f6500b.clone();
            clone.d((int) (f9 * 100.0f), cVar);
            f6500b = clone;
        }
    }
}
