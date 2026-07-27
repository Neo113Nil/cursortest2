package P4;

import f4.C0439p;

/* loaded from: classes.dex */
public final class Y extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final Y f2353c = new Y(Z.f2354a);

    @Override // P4.AbstractC0122a
    public final int g(Object obj) {
        int[] collectionSize = ((C0439p) obj).f5683a;
        kotlin.jvm.internal.i.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // P4.AbstractC0134m, P4.AbstractC0122a
    public final void i(O4.a aVar, int i2, Object obj, boolean z) {
        X builder = (X) obj;
        kotlin.jvm.internal.i.e(builder, "builder");
        int q5 = aVar.a(this.f2335b, i2).q();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f2351a;
        int i3 = builder.f2352b;
        builder.f2352b = i3 + 1;
        iArr[i3] = q5;
    }

    @Override // P4.AbstractC0122a
    public final Object j(Object obj) {
        int[] toBuilder = ((C0439p) obj).f5683a;
        kotlin.jvm.internal.i.e(toBuilder, "$this$toBuilder");
        X x5 = new X();
        x5.f2351a = toBuilder;
        x5.f2352b = toBuilder.length;
        x5.b(10);
        return x5;
    }

    @Override // P4.M
    public final Object m() {
        return new C0439p(new int[0]);
    }

    @Override // P4.M
    public final void n(R4.s encoder, Object obj, int i2) {
        int[] iArr = ((C0439p) obj).f5683a;
        kotlin.jvm.internal.i.e(encoder, "encoder");
        for (int i3 = 0; i3 < i2; i3++) {
            encoder.i(this.f2335b, i3).j(iArr[i3]);
        }
    }
}
