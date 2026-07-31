package T5;

/* renamed from: T5.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203t extends N {

    /* renamed from: c, reason: collision with root package name */
    public static final C0203t f2462c = new C0203t(C0204u.f2463a);

    @Override // T5.AbstractC0185a
    public final int g(Object obj) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.i.e(fArr, "<this>");
        return fArr.length;
    }

    @Override // T5.AbstractC0197m, T5.AbstractC0185a
    public final void i(S5.a aVar, int i7, Object obj) {
        C0202s builder = (C0202s) obj;
        kotlin.jvm.internal.i.e(builder, "builder");
        float c7 = aVar.c(this.f2398b, i7);
        builder.b(builder.d() + 1);
        float[] fArr = builder.f2460a;
        int i8 = builder.f2461b;
        builder.f2461b = i8 + 1;
        fArr[i8] = c7;
    }

    @Override // T5.AbstractC0185a
    public final Object j(Object obj) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.i.e(fArr, "<this>");
        C0202s c0202s = new C0202s();
        c0202s.f2460a = fArr;
        c0202s.f2461b = fArr.length;
        c0202s.b(10);
        return c0202s;
    }

    @Override // T5.N
    public final Object m() {
        return new float[0];
    }

    @Override // T5.N
    public final void n(V5.s encoder, Object obj, int i7) {
        float[] content = (float[]) obj;
        kotlin.jvm.internal.i.e(encoder, "encoder");
        kotlin.jvm.internal.i.e(content, "content");
        for (int i8 = 0; i8 < i7; i8++) {
            float f7 = content[i8];
            M descriptor = this.f2398b;
            kotlin.jvm.internal.i.e(descriptor, "descriptor");
            encoder.f(descriptor, i8);
            encoder.g(f7);
        }
    }
}
