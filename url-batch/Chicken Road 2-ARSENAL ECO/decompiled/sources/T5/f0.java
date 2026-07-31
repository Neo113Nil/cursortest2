package T5;

/* loaded from: classes.dex */
public final class f0 extends N {

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f2432c = new f0(g0.f2435a);

    @Override // T5.AbstractC0185a
    public final int g(Object obj) {
        short[] collectionSize = ((k5.u) obj).f5218f;
        kotlin.jvm.internal.i.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // T5.AbstractC0197m, T5.AbstractC0185a
    public final void i(S5.a aVar, int i7, Object obj) {
        e0 builder = (e0) obj;
        kotlin.jvm.internal.i.e(builder, "builder");
        short t6 = aVar.o(this.f2398b, i7).t();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f2428a;
        int i8 = builder.f2429b;
        builder.f2429b = i8 + 1;
        sArr[i8] = t6;
    }

    @Override // T5.AbstractC0185a
    public final Object j(Object obj) {
        short[] toBuilder = ((k5.u) obj).f5218f;
        kotlin.jvm.internal.i.e(toBuilder, "$this$toBuilder");
        e0 e0Var = new e0();
        e0Var.f2428a = toBuilder;
        e0Var.f2429b = toBuilder.length;
        e0Var.b(10);
        return e0Var;
    }

    @Override // T5.N
    public final Object m() {
        return new k5.u(new short[0]);
    }

    @Override // T5.N
    public final void n(V5.s encoder, Object obj, int i7) {
        short[] sArr = ((k5.u) obj).f5218f;
        kotlin.jvm.internal.i.e(encoder, "encoder");
        for (int i8 = 0; i8 < i7; i8++) {
            encoder.i(this.f2398b, i8).n(sArr[i8]);
        }
    }
}
