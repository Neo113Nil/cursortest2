package T5;

/* renamed from: T5.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0208y extends N {

    /* renamed from: c, reason: collision with root package name */
    public static final C0208y f2478c = new C0208y(C0209z.f2479a);

    @Override // T5.AbstractC0185a
    public final int g(Object obj) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.i.e(iArr, "<this>");
        return iArr.length;
    }

    @Override // T5.AbstractC0197m, T5.AbstractC0185a
    public final void i(S5.a aVar, int i7, Object obj) {
        C0207x builder = (C0207x) obj;
        kotlin.jvm.internal.i.e(builder, "builder");
        int n7 = aVar.n(this.f2398b, i7);
        builder.b(builder.d() + 1);
        int[] iArr = builder.f2476a;
        int i8 = builder.f2477b;
        builder.f2477b = i8 + 1;
        iArr[i8] = n7;
    }

    @Override // T5.AbstractC0185a
    public final Object j(Object obj) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.i.e(iArr, "<this>");
        C0207x c0207x = new C0207x();
        c0207x.f2476a = iArr;
        c0207x.f2477b = iArr.length;
        c0207x.b(10);
        return c0207x;
    }

    @Override // T5.N
    public final Object m() {
        return new int[0];
    }

    @Override // T5.N
    public final void n(V5.s encoder, Object obj, int i7) {
        int[] content = (int[]) obj;
        kotlin.jvm.internal.i.e(encoder, "encoder");
        kotlin.jvm.internal.i.e(content, "content");
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = content[i8];
            M descriptor = this.f2398b;
            kotlin.jvm.internal.i.e(descriptor, "descriptor");
            encoder.f(descriptor, i8);
            encoder.j(i9);
        }
    }
}
