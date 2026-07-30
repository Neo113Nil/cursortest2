package a8;

/* loaded from: classes2.dex */
public final class e0 extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f4474c = new e0(f0.f4477a);

    @Override // a8.AbstractC0434a
    public final int g(Object obj) {
        short[] collectionSize = ((q7.u) obj).f40182n;
        kotlin.jvm.internal.h.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // a8.AbstractC0446m, a8.AbstractC0434a
    public final void i(Z7.a aVar, int i, Object obj) {
        d0 builder = (d0) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        short v6 = aVar.r(this.f4442b, i).v();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f4471a;
        int i4 = builder.f4472b;
        builder.f4472b = i4 + 1;
        sArr[i4] = v6;
    }

    @Override // a8.AbstractC0434a
    public final Object j(Object obj) {
        short[] toBuilder = ((q7.u) obj).f40182n;
        kotlin.jvm.internal.h.e(toBuilder, "$this$toBuilder");
        d0 d0Var = new d0();
        d0Var.f4471a = toBuilder;
        d0Var.f4472b = toBuilder.length;
        d0Var.b(10);
        return d0Var;
    }

    @Override // a8.M
    public final Object m() {
        return new q7.u(new short[0]);
    }

    @Override // a8.M
    public final void n(c8.r encoder, Object obj, int i) {
        short[] sArr = ((q7.u) obj).f40182n;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        for (int i4 = 0; i4 < i; i4++) {
            encoder.i(this.f4442b, i4).n(sArr[i4]);
        }
    }
}
