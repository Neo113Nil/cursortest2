package y2;

import s.q;
import s.s0;
import x2.h;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f10575a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* renamed from: b, reason: collision with root package name */
    public static volatile s0 f10576b = new s0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f10577c;

    static {
        Object[] objArr = new Object[0];
        f10577c = objArr;
        synchronized (objArr) {
            f10576b.e((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f10576b.e((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f10576b.e((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f10576b.e((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f10576b.e((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f10576b.d(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        h.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static a a(float f3) {
        float d10;
        a aVar;
        float[] fArr = f10575a;
        if (f3 < 1.03f) {
            return null;
        }
        int i3 = (int) (f3 * 100.0f);
        a aVar2 = (a) f10576b.c(i3);
        if (aVar2 != null) {
            return aVar2;
        }
        s0 s0Var = f10576b;
        if (s0Var.f8373d) {
            q.a(s0Var);
        }
        int a9 = t.a.a(s0Var.f8376r, i3, s0Var.f8374e);
        if (a9 >= 0) {
            return (a) f10576b.g(a9);
        }
        int i10 = -(a9 + 1);
        int i11 = i10 - 1;
        if (i10 >= f10576b.f()) {
            c cVar = new c(new float[]{1.0f}, new float[]{f3});
            b(f3, cVar);
            return cVar;
        }
        if (i11 < 0) {
            aVar = new c(fArr, fArr);
            d10 = 1.0f;
        } else {
            d10 = f10576b.d(i11) / 100.0f;
            aVar = (a) f10576b.g(i11);
        }
        float d11 = f10576b.d(i10) / 100.0f;
        float max = (Math.max(0.0f, Math.min(1.0f, d10 == d11 ? 0.0f : (f3 - d10) / (d11 - d10))) * 1.0f) + 0.0f;
        a aVar3 = (a) f10576b.g(i10);
        float[] fArr2 = new float[9];
        for (int i12 = 0; i12 < 9; i12++) {
            float f10 = fArr[i12];
            float b10 = aVar.b(f10);
            fArr2[i12] = ((aVar3.b(f10) - b10) * max) + b10;
        }
        c cVar2 = new c(fArr, fArr2);
        b(f3, cVar2);
        return cVar2;
    }

    public static void b(float f3, c cVar) {
        synchronized (f10577c) {
            s0 clone = f10576b.clone();
            clone.e((int) (f3 * 100.0f), cVar);
            f10576b = clone;
        }
    }
}
