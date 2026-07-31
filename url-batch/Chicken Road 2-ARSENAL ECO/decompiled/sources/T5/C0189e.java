package T5;

/* renamed from: T5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0189e extends N {

    /* renamed from: c, reason: collision with root package name */
    public static final C0189e f2427c = new C0189e(C0190f.f2430a);

    @Override // T5.AbstractC0185a
    public final int g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.i.e(zArr, "<this>");
        return zArr.length;
    }

    @Override // T5.AbstractC0197m, T5.AbstractC0185a
    public final void i(S5.a aVar, int i7, Object obj) {
        C0188d builder = (C0188d) obj;
        kotlin.jvm.internal.i.e(builder, "builder");
        boolean m4 = aVar.m(this.f2398b, i7);
        builder.b(builder.d() + 1);
        boolean[] zArr = builder.f2423a;
        int i8 = builder.f2424b;
        builder.f2424b = i8 + 1;
        zArr[i8] = m4;
    }

    @Override // T5.AbstractC0185a
    public final Object j(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.i.e(zArr, "<this>");
        C0188d c0188d = new C0188d();
        c0188d.f2423a = zArr;
        c0188d.f2424b = zArr.length;
        c0188d.b(10);
        return c0188d;
    }

    @Override // T5.N
    public final Object m() {
        return new boolean[0];
    }

    @Override // T5.N
    public final void n(V5.s encoder, Object obj, int i7) {
        boolean[] content = (boolean[]) obj;
        kotlin.jvm.internal.i.e(encoder, "encoder");
        kotlin.jvm.internal.i.e(content, "content");
        for (int i8 = 0; i8 < i7; i8++) {
            boolean z5 = content[i8];
            M descriptor = this.f2398b;
            kotlin.jvm.internal.i.e(descriptor, "descriptor");
            encoder.f(descriptor, i8);
            encoder.b(z5);
        }
    }
}
