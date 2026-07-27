package P4;

/* renamed from: P4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129h extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final C0129h f2376c = new C0129h(C0130i.f2377a);

    @Override // P4.AbstractC0122a
    public final int g(Object obj) {
        byte[] bArr = (byte[]) obj;
        kotlin.jvm.internal.i.e(bArr, "<this>");
        return bArr.length;
    }

    @Override // P4.AbstractC0134m, P4.AbstractC0122a
    public final void i(O4.a aVar, int i2, Object obj, boolean z) {
        C0128g builder = (C0128g) obj;
        kotlin.jvm.internal.i.e(builder, "builder");
        byte j2 = aVar.j(this.f2335b, i2);
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f2372a;
        int i3 = builder.f2373b;
        builder.f2373b = i3 + 1;
        bArr[i3] = j2;
    }

    @Override // P4.AbstractC0122a
    public final Object j(Object obj) {
        byte[] bArr = (byte[]) obj;
        kotlin.jvm.internal.i.e(bArr, "<this>");
        C0128g c0128g = new C0128g();
        c0128g.f2372a = bArr;
        c0128g.f2373b = bArr.length;
        c0128g.b(10);
        return c0128g;
    }

    @Override // P4.M
    public final Object m() {
        return new byte[0];
    }

    @Override // P4.M
    public final void n(R4.s encoder, Object obj, int i2) {
        byte[] content = (byte[]) obj;
        kotlin.jvm.internal.i.e(encoder, "encoder");
        kotlin.jvm.internal.i.e(content, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            byte b6 = content[i3];
            L descriptor = this.f2335b;
            kotlin.jvm.internal.i.e(descriptor, "descriptor");
            encoder.f(descriptor, i3);
            encoder.c(b6);
        }
    }
}
