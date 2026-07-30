package a8;

/* loaded from: classes2.dex */
public final class E extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final E f4431c = new E(F.f4432a);

    @Override // a8.AbstractC0434a
    public final int g(Object obj) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.h.e(jArr, "<this>");
        return jArr.length;
    }

    @Override // a8.AbstractC0446m, a8.AbstractC0434a
    public final void i(Z7.a aVar, int i, Object obj) {
        D builder = (D) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        long l9 = aVar.l(this.f4442b, i);
        builder.b(builder.d() + 1);
        long[] jArr = builder.f4429a;
        int i4 = builder.f4430b;
        builder.f4430b = i4 + 1;
        jArr[i4] = l9;
    }

    @Override // a8.AbstractC0434a
    public final Object j(Object obj) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.h.e(jArr, "<this>");
        D d2 = new D();
        d2.f4429a = jArr;
        d2.f4430b = jArr.length;
        d2.b(10);
        return d2;
    }

    @Override // a8.M
    public final Object m() {
        return new long[0];
    }

    @Override // a8.M
    public final void n(c8.r encoder, Object obj, int i) {
        long[] content = (long[]) obj;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        kotlin.jvm.internal.h.e(content, "content");
        for (int i4 = 0; i4 < i; i4++) {
            long j9 = content[i4];
            L descriptor = this.f4442b;
            kotlin.jvm.internal.h.e(descriptor, "descriptor");
            encoder.f(descriptor, i4);
            encoder.k(j9);
        }
    }
}
