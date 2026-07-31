package T5;

/* loaded from: classes.dex */
public final class E extends N {

    /* renamed from: c, reason: collision with root package name */
    public static final E f2387c = new E(F.f2388a);

    @Override // T5.AbstractC0185a
    public final int g(Object obj) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.i.e(jArr, "<this>");
        return jArr.length;
    }

    @Override // T5.AbstractC0197m, T5.AbstractC0185a
    public final void i(S5.a aVar, int i7, Object obj) {
        D builder = (D) obj;
        kotlin.jvm.internal.i.e(builder, "builder");
        long d7 = aVar.d(this.f2398b, i7);
        builder.b(builder.d() + 1);
        long[] jArr = builder.f2385a;
        int i8 = builder.f2386b;
        builder.f2386b = i8 + 1;
        jArr[i8] = d7;
    }

    @Override // T5.AbstractC0185a
    public final Object j(Object obj) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.i.e(jArr, "<this>");
        D d7 = new D();
        d7.f2385a = jArr;
        d7.f2386b = jArr.length;
        d7.b(10);
        return d7;
    }

    @Override // T5.N
    public final Object m() {
        return new long[0];
    }

    @Override // T5.N
    public final void n(V5.s encoder, Object obj, int i7) {
        long[] content = (long[]) obj;
        kotlin.jvm.internal.i.e(encoder, "encoder");
        kotlin.jvm.internal.i.e(content, "content");
        for (int i8 = 0; i8 < i7; i8++) {
            long j4 = content[i8];
            M descriptor = this.f2398b;
            kotlin.jvm.internal.i.e(descriptor, "descriptor");
            encoder.f(descriptor, i8);
            encoder.k(j4);
        }
    }
}
