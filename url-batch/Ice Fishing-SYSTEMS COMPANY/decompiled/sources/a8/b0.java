package a8;

import q7.C4949r;

/* loaded from: classes2.dex */
public final class b0 extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f4465c = new b0(c0.f4467a);

    @Override // a8.AbstractC0434a
    public final int g(Object obj) {
        long[] collectionSize = ((C4949r) obj).f40179n;
        kotlin.jvm.internal.h.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // a8.AbstractC0446m, a8.AbstractC0434a
    public final void i(Z7.a aVar, int i, Object obj) {
        a0 builder = (a0) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        long m8 = aVar.r(this.f4442b, i).m();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f4463a;
        int i4 = builder.f4464b;
        builder.f4464b = i4 + 1;
        jArr[i4] = m8;
    }

    @Override // a8.AbstractC0434a
    public final Object j(Object obj) {
        long[] toBuilder = ((C4949r) obj).f40179n;
        kotlin.jvm.internal.h.e(toBuilder, "$this$toBuilder");
        a0 a0Var = new a0();
        a0Var.f4463a = toBuilder;
        a0Var.f4464b = toBuilder.length;
        a0Var.b(10);
        return a0Var;
    }

    @Override // a8.M
    public final Object m() {
        return new C4949r(new long[0]);
    }

    @Override // a8.M
    public final void n(c8.r encoder, Object obj, int i) {
        long[] jArr = ((C4949r) obj).f40179n;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        for (int i4 = 0; i4 < i; i4++) {
            encoder.i(this.f4442b, i4).k(jArr[i4]);
        }
    }
}
