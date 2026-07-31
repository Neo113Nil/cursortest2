package T5;

/* loaded from: classes.dex */
public final class Z extends N {

    /* renamed from: c, reason: collision with root package name */
    public static final Z f2416c = new Z(a0.f2417a);

    @Override // T5.AbstractC0185a
    public final int g(Object obj) {
        int[] collectionSize = ((k5.p) obj).f5213f;
        kotlin.jvm.internal.i.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // T5.AbstractC0197m, T5.AbstractC0185a
    public final void i(S5.a aVar, int i7, Object obj) {
        Y builder = (Y) obj;
        kotlin.jvm.internal.i.e(builder, "builder");
        int p4 = aVar.o(this.f2398b, i7).p();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f2414a;
        int i8 = builder.f2415b;
        builder.f2415b = i8 + 1;
        iArr[i8] = p4;
    }

    @Override // T5.AbstractC0185a
    public final Object j(Object obj) {
        int[] toBuilder = ((k5.p) obj).f5213f;
        kotlin.jvm.internal.i.e(toBuilder, "$this$toBuilder");
        Y y = new Y();
        y.f2414a = toBuilder;
        y.f2415b = toBuilder.length;
        y.b(10);
        return y;
    }

    @Override // T5.N
    public final Object m() {
        return new k5.p(new int[0]);
    }

    @Override // T5.N
    public final void n(V5.s encoder, Object obj, int i7) {
        int[] iArr = ((k5.p) obj).f5213f;
        kotlin.jvm.internal.i.e(encoder, "encoder");
        for (int i8 = 0; i8 < i7; i8++) {
            encoder.i(this.f2398b, i8).j(iArr[i8]);
        }
    }
}
