package P4;

/* renamed from: P4.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136o extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final C0136o f2387c = new C0136o(C0137p.f2388a);

    @Override // P4.AbstractC0122a
    public final int g(Object obj) {
        double[] dArr = (double[]) obj;
        kotlin.jvm.internal.i.e(dArr, "<this>");
        return dArr.length;
    }

    @Override // P4.AbstractC0134m, P4.AbstractC0122a
    public final void i(O4.a aVar, int i2, Object obj, boolean z) {
        C0135n builder = (C0135n) obj;
        kotlin.jvm.internal.i.e(builder, "builder");
        double f3 = aVar.f(this.f2335b, i2);
        builder.b(builder.d() + 1);
        double[] dArr = builder.f2385a;
        int i3 = builder.f2386b;
        builder.f2386b = i3 + 1;
        dArr[i3] = f3;
    }

    @Override // P4.AbstractC0122a
    public final Object j(Object obj) {
        double[] dArr = (double[]) obj;
        kotlin.jvm.internal.i.e(dArr, "<this>");
        C0135n c0135n = new C0135n();
        c0135n.f2385a = dArr;
        c0135n.f2386b = dArr.length;
        c0135n.b(10);
        return c0135n;
    }

    @Override // P4.M
    public final Object m() {
        return new double[0];
    }

    @Override // P4.M
    public final void n(R4.s encoder, Object obj, int i2) {
        double[] content = (double[]) obj;
        kotlin.jvm.internal.i.e(encoder, "encoder");
        kotlin.jvm.internal.i.e(content, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            double d6 = content[i3];
            L descriptor = this.f2335b;
            kotlin.jvm.internal.i.e(descriptor, "descriptor");
            encoder.f(descriptor, i3);
            encoder.e(d6);
        }
    }
}
