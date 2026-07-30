package a8;

/* renamed from: a8.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0438e extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final C0438e f4473c = new C0438e(C0439f.f4475a);

    @Override // a8.AbstractC0434a
    public final int g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.h.e(zArr, "<this>");
        return zArr.length;
    }

    @Override // a8.AbstractC0446m, a8.AbstractC0434a
    public final void i(Z7.a aVar, int i, Object obj) {
        C0437d builder = (C0437d) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        boolean k6 = aVar.k(this.f4442b, i);
        builder.b(builder.d() + 1);
        boolean[] zArr = builder.f4469a;
        int i4 = builder.f4470b;
        builder.f4470b = i4 + 1;
        zArr[i4] = k6;
    }

    @Override // a8.AbstractC0434a
    public final Object j(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.h.e(zArr, "<this>");
        C0437d c0437d = new C0437d();
        c0437d.f4469a = zArr;
        c0437d.f4470b = zArr.length;
        c0437d.b(10);
        return c0437d;
    }

    @Override // a8.M
    public final Object m() {
        return new boolean[0];
    }

    @Override // a8.M
    public final void n(c8.r encoder, Object obj, int i) {
        boolean[] content = (boolean[]) obj;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        kotlin.jvm.internal.h.e(content, "content");
        for (int i4 = 0; i4 < i; i4++) {
            boolean z8 = content[i4];
            L descriptor = this.f4442b;
            kotlin.jvm.internal.h.e(descriptor, "descriptor");
            encoder.f(descriptor, i4);
            encoder.b(z8);
        }
    }
}
