package T5;

/* loaded from: classes.dex */
public final class W extends N {

    /* renamed from: c, reason: collision with root package name */
    public static final W f2411c = new W(X.f2412a);

    @Override // T5.AbstractC0185a
    public final int g(Object obj) {
        byte[] collectionSize = ((k5.n) obj).f5211f;
        kotlin.jvm.internal.i.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // T5.AbstractC0197m, T5.AbstractC0185a
    public final void i(S5.a aVar, int i7, Object obj) {
        V builder = (V) obj;
        kotlin.jvm.internal.i.e(builder, "builder");
        byte r6 = aVar.o(this.f2398b, i7).r();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f2409a;
        int i8 = builder.f2410b;
        builder.f2410b = i8 + 1;
        bArr[i8] = r6;
    }

    @Override // T5.AbstractC0185a
    public final Object j(Object obj) {
        byte[] toBuilder = ((k5.n) obj).f5211f;
        kotlin.jvm.internal.i.e(toBuilder, "$this$toBuilder");
        V v5 = new V();
        v5.f2409a = toBuilder;
        v5.f2410b = toBuilder.length;
        v5.b(10);
        return v5;
    }

    @Override // T5.N
    public final Object m() {
        return new k5.n(new byte[0]);
    }

    @Override // T5.N
    public final void n(V5.s encoder, Object obj, int i7) {
        byte[] bArr = ((k5.n) obj).f5211f;
        kotlin.jvm.internal.i.e(encoder, "encoder");
        for (int i8 = 0; i8 < i7; i8++) {
            encoder.i(this.f2398b, i8).c(bArr[i8]);
        }
    }
}
