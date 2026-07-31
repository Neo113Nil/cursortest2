package T5;

/* loaded from: classes.dex */
public final class S extends N {

    /* renamed from: c, reason: collision with root package name */
    public static final S f2404c = new S(T.f2405a);

    @Override // T5.AbstractC0185a
    public final int g(Object obj) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.i.e(sArr, "<this>");
        return sArr.length;
    }

    @Override // T5.AbstractC0197m, T5.AbstractC0185a
    public final void i(S5.a aVar, int i7, Object obj) {
        Q builder = (Q) obj;
        kotlin.jvm.internal.i.e(builder, "builder");
        short e4 = aVar.e(this.f2398b, i7);
        builder.b(builder.d() + 1);
        short[] sArr = builder.f2402a;
        int i8 = builder.f2403b;
        builder.f2403b = i8 + 1;
        sArr[i8] = e4;
    }

    @Override // T5.AbstractC0185a
    public final Object j(Object obj) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.i.e(sArr, "<this>");
        Q q6 = new Q();
        q6.f2402a = sArr;
        q6.f2403b = sArr.length;
        q6.b(10);
        return q6;
    }

    @Override // T5.N
    public final Object m() {
        return new short[0];
    }

    @Override // T5.N
    public final void n(V5.s encoder, Object obj, int i7) {
        short[] content = (short[]) obj;
        kotlin.jvm.internal.i.e(encoder, "encoder");
        kotlin.jvm.internal.i.e(content, "content");
        for (int i8 = 0; i8 < i7; i8++) {
            short s6 = content[i8];
            M descriptor = this.f2398b;
            kotlin.jvm.internal.i.e(descriptor, "descriptor");
            encoder.f(descriptor, i8);
            encoder.n(s6);
        }
    }
}
