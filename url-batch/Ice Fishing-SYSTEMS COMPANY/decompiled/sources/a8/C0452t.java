package a8;

/* renamed from: a8.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0452t extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final C0452t f4506c = new C0452t(C0453u.f4507a);

    @Override // a8.AbstractC0434a
    public final int g(Object obj) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.h.e(fArr, "<this>");
        return fArr.length;
    }

    @Override // a8.AbstractC0446m, a8.AbstractC0434a
    public final void i(Z7.a aVar, int i, Object obj) {
        C0451s builder = (C0451s) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        float f6 = aVar.f(this.f4442b, i);
        builder.b(builder.d() + 1);
        float[] fArr = builder.f4504a;
        int i4 = builder.f4505b;
        builder.f4505b = i4 + 1;
        fArr[i4] = f6;
    }

    @Override // a8.AbstractC0434a
    public final Object j(Object obj) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.h.e(fArr, "<this>");
        C0451s c0451s = new C0451s();
        c0451s.f4504a = fArr;
        c0451s.f4505b = fArr.length;
        c0451s.b(10);
        return c0451s;
    }

    @Override // a8.M
    public final Object m() {
        return new float[0];
    }

    @Override // a8.M
    public final void n(c8.r encoder, Object obj, int i) {
        float[] content = (float[]) obj;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        kotlin.jvm.internal.h.e(content, "content");
        for (int i4 = 0; i4 < i; i4++) {
            float f6 = content[i4];
            L descriptor = this.f4442b;
            kotlin.jvm.internal.h.e(descriptor, "descriptor");
            encoder.f(descriptor, i4);
            encoder.g(f6);
        }
    }
}
