package P4;

import f4.C0441r;

/* loaded from: classes.dex */
public final class b0 extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f2358c = new b0(c0.f2360a);

    @Override // P4.AbstractC0122a
    public final int g(Object obj) {
        long[] collectionSize = ((C0441r) obj).f5685a;
        kotlin.jvm.internal.i.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // P4.AbstractC0134m, P4.AbstractC0122a
    public final void i(O4.a aVar, int i2, Object obj, boolean z) {
        a0 builder = (a0) obj;
        kotlin.jvm.internal.i.e(builder, "builder");
        long c2 = aVar.a(this.f2335b, i2).c();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f2356a;
        int i3 = builder.f2357b;
        builder.f2357b = i3 + 1;
        jArr[i3] = c2;
    }

    @Override // P4.AbstractC0122a
    public final Object j(Object obj) {
        long[] toBuilder = ((C0441r) obj).f5685a;
        kotlin.jvm.internal.i.e(toBuilder, "$this$toBuilder");
        a0 a0Var = new a0();
        a0Var.f2356a = toBuilder;
        a0Var.f2357b = toBuilder.length;
        a0Var.b(10);
        return a0Var;
    }

    @Override // P4.M
    public final Object m() {
        return new C0441r(new long[0]);
    }

    @Override // P4.M
    public final void n(R4.s encoder, Object obj, int i2) {
        long[] jArr = ((C0441r) obj).f5685a;
        kotlin.jvm.internal.i.e(encoder, "encoder");
        for (int i3 = 0; i3 < i2; i3++) {
            encoder.i(this.f2335b, i3).k(jArr[i3]);
        }
    }
}
