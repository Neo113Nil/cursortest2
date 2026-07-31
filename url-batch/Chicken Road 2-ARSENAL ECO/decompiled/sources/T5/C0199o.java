package T5;

/* renamed from: T5.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199o extends N {

    /* renamed from: c, reason: collision with root package name */
    public static final C0199o f2450c = new C0199o(C0200p.f2451a);

    @Override // T5.AbstractC0185a
    public final int g(Object obj) {
        double[] dArr = (double[]) obj;
        kotlin.jvm.internal.i.e(dArr, "<this>");
        return dArr.length;
    }

    @Override // T5.AbstractC0197m, T5.AbstractC0185a
    public final void i(S5.a aVar, int i7, Object obj) {
        C0198n builder = (C0198n) obj;
        kotlin.jvm.internal.i.e(builder, "builder");
        double q6 = aVar.q(this.f2398b, i7);
        builder.b(builder.d() + 1);
        double[] dArr = builder.f2448a;
        int i8 = builder.f2449b;
        builder.f2449b = i8 + 1;
        dArr[i8] = q6;
    }

    @Override // T5.AbstractC0185a
    public final Object j(Object obj) {
        double[] dArr = (double[]) obj;
        kotlin.jvm.internal.i.e(dArr, "<this>");
        C0198n c0198n = new C0198n();
        c0198n.f2448a = dArr;
        c0198n.f2449b = dArr.length;
        c0198n.b(10);
        return c0198n;
    }

    @Override // T5.N
    public final Object m() {
        return new double[0];
    }

    @Override // T5.N
    public final void n(V5.s encoder, Object obj, int i7) {
        double[] content = (double[]) obj;
        kotlin.jvm.internal.i.e(encoder, "encoder");
        kotlin.jvm.internal.i.e(content, "content");
        for (int i8 = 0; i8 < i7; i8++) {
            double d7 = content[i8];
            M descriptor = this.f2398b;
            kotlin.jvm.internal.i.e(descriptor, "descriptor");
            encoder.f(descriptor, i8);
            encoder.e(d7);
        }
    }
}
