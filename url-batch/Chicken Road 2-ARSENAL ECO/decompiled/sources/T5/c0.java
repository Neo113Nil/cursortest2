package T5;

/* loaded from: classes.dex */
public final class c0 extends N {

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f2422c = new c0(d0.f2425a);

    @Override // T5.AbstractC0185a
    public final int g(Object obj) {
        long[] collectionSize = ((k5.r) obj).f5215f;
        kotlin.jvm.internal.i.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // T5.AbstractC0197m, T5.AbstractC0185a
    public final void i(S5.a aVar, int i7, Object obj) {
        b0 builder = (b0) obj;
        kotlin.jvm.internal.i.e(builder, "builder");
        long a7 = aVar.o(this.f2398b, i7).a();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f2419a;
        int i8 = builder.f2420b;
        builder.f2420b = i8 + 1;
        jArr[i8] = a7;
    }

    @Override // T5.AbstractC0185a
    public final Object j(Object obj) {
        long[] toBuilder = ((k5.r) obj).f5215f;
        kotlin.jvm.internal.i.e(toBuilder, "$this$toBuilder");
        b0 b0Var = new b0();
        b0Var.f2419a = toBuilder;
        b0Var.f2420b = toBuilder.length;
        b0Var.b(10);
        return b0Var;
    }

    @Override // T5.N
    public final Object m() {
        return new k5.r(new long[0]);
    }

    @Override // T5.N
    public final void n(V5.s encoder, Object obj, int i7) {
        long[] jArr = ((k5.r) obj).f5215f;
        kotlin.jvm.internal.i.e(encoder, "encoder");
        for (int i8 = 0; i8 < i7; i8++) {
            encoder.i(this.f2398b, i8).k(jArr[i8]);
        }
    }
}
