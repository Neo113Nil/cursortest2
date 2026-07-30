package a8;

/* renamed from: a8.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0448o extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final C0448o f4494c = new C0448o(C0449p.f4495a);

    @Override // a8.AbstractC0434a
    public final int g(Object obj) {
        double[] dArr = (double[]) obj;
        kotlin.jvm.internal.h.e(dArr, "<this>");
        return dArr.length;
    }

    @Override // a8.AbstractC0446m, a8.AbstractC0434a
    public final void i(Z7.a aVar, int i, Object obj) {
        C0447n builder = (C0447n) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        double g9 = aVar.g(this.f4442b, i);
        builder.b(builder.d() + 1);
        double[] dArr = builder.f4492a;
        int i4 = builder.f4493b;
        builder.f4493b = i4 + 1;
        dArr[i4] = g9;
    }

    @Override // a8.AbstractC0434a
    public final Object j(Object obj) {
        double[] dArr = (double[]) obj;
        kotlin.jvm.internal.h.e(dArr, "<this>");
        C0447n c0447n = new C0447n();
        c0447n.f4492a = dArr;
        c0447n.f4493b = dArr.length;
        c0447n.b(10);
        return c0447n;
    }

    @Override // a8.M
    public final Object m() {
        return new double[0];
    }

    @Override // a8.M
    public final void n(c8.r encoder, Object obj, int i) {
        double[] content = (double[]) obj;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        kotlin.jvm.internal.h.e(content, "content");
        for (int i4 = 0; i4 < i; i4++) {
            double d2 = content[i4];
            L descriptor = this.f4442b;
            kotlin.jvm.internal.h.e(descriptor, "descriptor");
            encoder.f(descriptor, i4);
            encoder.e(d2);
        }
    }
}
