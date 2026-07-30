package a8;

/* renamed from: a8.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0444k extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final C0444k f4488c = new C0444k(C0445l.f4489a);

    @Override // a8.AbstractC0434a
    public final int g(Object obj) {
        char[] cArr = (char[]) obj;
        kotlin.jvm.internal.h.e(cArr, "<this>");
        return cArr.length;
    }

    @Override // a8.AbstractC0446m, a8.AbstractC0434a
    public final void i(Z7.a aVar, int i, Object obj) {
        C0443j builder = (C0443j) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        char a9 = aVar.a(this.f4442b, i);
        builder.b(builder.d() + 1);
        char[] cArr = builder.f4486a;
        int i4 = builder.f4487b;
        builder.f4487b = i4 + 1;
        cArr[i4] = a9;
    }

    @Override // a8.AbstractC0434a
    public final Object j(Object obj) {
        char[] cArr = (char[]) obj;
        kotlin.jvm.internal.h.e(cArr, "<this>");
        C0443j c0443j = new C0443j();
        c0443j.f4486a = cArr;
        c0443j.f4487b = cArr.length;
        c0443j.b(10);
        return c0443j;
    }

    @Override // a8.M
    public final Object m() {
        return new char[0];
    }

    @Override // a8.M
    public final void n(c8.r encoder, Object obj, int i) {
        char[] content = (char[]) obj;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        kotlin.jvm.internal.h.e(content, "content");
        for (int i4 = 0; i4 < i; i4++) {
            char c4 = content[i4];
            L descriptor = this.f4442b;
            kotlin.jvm.internal.h.e(descriptor, "descriptor");
            encoder.f(descriptor, i4);
            encoder.d(c4);
        }
    }
}
