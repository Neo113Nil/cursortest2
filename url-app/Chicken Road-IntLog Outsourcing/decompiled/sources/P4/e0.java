package P4;

/* loaded from: classes.dex */
public final class e0 extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f2367c = new e0(f0.f2370a);

    @Override // P4.AbstractC0122a
    public final int g(Object obj) {
        short[] collectionSize = ((f4.u) obj).f5688a;
        kotlin.jvm.internal.i.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // P4.AbstractC0134m, P4.AbstractC0122a
    public final void i(O4.a aVar, int i2, Object obj, boolean z) {
        d0 builder = (d0) obj;
        kotlin.jvm.internal.i.e(builder, "builder");
        short t5 = aVar.a(this.f2335b, i2).t();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f2364a;
        int i3 = builder.f2365b;
        builder.f2365b = i3 + 1;
        sArr[i3] = t5;
    }

    @Override // P4.AbstractC0122a
    public final Object j(Object obj) {
        short[] toBuilder = ((f4.u) obj).f5688a;
        kotlin.jvm.internal.i.e(toBuilder, "$this$toBuilder");
        d0 d0Var = new d0();
        d0Var.f2364a = toBuilder;
        d0Var.f2365b = toBuilder.length;
        d0Var.b(10);
        return d0Var;
    }

    @Override // P4.M
    public final Object m() {
        return new f4.u(new short[0]);
    }

    @Override // P4.M
    public final void n(R4.s encoder, Object obj, int i2) {
        short[] sArr = ((f4.u) obj).f5688a;
        kotlin.jvm.internal.i.e(encoder, "encoder");
        for (int i3 = 0; i3 < i2; i3++) {
            encoder.i(this.f2335b, i3).n(sArr[i3]);
        }
    }
}
