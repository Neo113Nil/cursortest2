package P4;

/* renamed from: P4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0132k extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final C0132k f2381c = new C0132k(C0133l.f2382a);

    @Override // P4.AbstractC0122a
    public final int g(Object obj) {
        char[] cArr = (char[]) obj;
        kotlin.jvm.internal.i.e(cArr, "<this>");
        return cArr.length;
    }

    @Override // P4.AbstractC0134m, P4.AbstractC0122a
    public final void i(O4.a aVar, int i2, Object obj, boolean z) {
        C0131j builder = (C0131j) obj;
        kotlin.jvm.internal.i.e(builder, "builder");
        char m6 = aVar.m(this.f2335b, i2);
        builder.b(builder.d() + 1);
        char[] cArr = builder.f2379a;
        int i3 = builder.f2380b;
        builder.f2380b = i3 + 1;
        cArr[i3] = m6;
    }

    @Override // P4.AbstractC0122a
    public final Object j(Object obj) {
        char[] cArr = (char[]) obj;
        kotlin.jvm.internal.i.e(cArr, "<this>");
        C0131j c0131j = new C0131j();
        c0131j.f2379a = cArr;
        c0131j.f2380b = cArr.length;
        c0131j.b(10);
        return c0131j;
    }

    @Override // P4.M
    public final Object m() {
        return new char[0];
    }

    @Override // P4.M
    public final void n(R4.s encoder, Object obj, int i2) {
        char[] content = (char[]) obj;
        kotlin.jvm.internal.i.e(encoder, "encoder");
        kotlin.jvm.internal.i.e(content, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = content[i3];
            L descriptor = this.f2335b;
            kotlin.jvm.internal.i.e(descriptor, "descriptor");
            encoder.f(descriptor, i3);
            encoder.d(c2);
        }
    }
}
