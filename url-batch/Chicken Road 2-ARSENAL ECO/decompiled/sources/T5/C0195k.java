package T5;

/* renamed from: T5.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0195k extends N {

    /* renamed from: c, reason: collision with root package name */
    public static final C0195k f2444c = new C0195k(C0196l.f2445a);

    @Override // T5.AbstractC0185a
    public final int g(Object obj) {
        char[] cArr = (char[]) obj;
        kotlin.jvm.internal.i.e(cArr, "<this>");
        return cArr.length;
    }

    @Override // T5.AbstractC0197m, T5.AbstractC0185a
    public final void i(S5.a aVar, int i7, Object obj) {
        C0194j builder = (C0194j) obj;
        kotlin.jvm.internal.i.e(builder, "builder");
        char b7 = aVar.b(this.f2398b, i7);
        builder.b(builder.d() + 1);
        char[] cArr = builder.f2442a;
        int i8 = builder.f2443b;
        builder.f2443b = i8 + 1;
        cArr[i8] = b7;
    }

    @Override // T5.AbstractC0185a
    public final Object j(Object obj) {
        char[] cArr = (char[]) obj;
        kotlin.jvm.internal.i.e(cArr, "<this>");
        C0194j c0194j = new C0194j();
        c0194j.f2442a = cArr;
        c0194j.f2443b = cArr.length;
        c0194j.b(10);
        return c0194j;
    }

    @Override // T5.N
    public final Object m() {
        return new char[0];
    }

    @Override // T5.N
    public final void n(V5.s encoder, Object obj, int i7) {
        char[] content = (char[]) obj;
        kotlin.jvm.internal.i.e(encoder, "encoder");
        kotlin.jvm.internal.i.e(content, "content");
        for (int i8 = 0; i8 < i7; i8++) {
            char c7 = content[i8];
            M descriptor = this.f2398b;
            kotlin.jvm.internal.i.e(descriptor, "descriptor");
            encoder.f(descriptor, i8);
            encoder.d(c7);
        }
    }
}
