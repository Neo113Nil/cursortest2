package P4;

/* loaded from: classes.dex */
public final class Q extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final Q f2341c = new Q(S.f2342a);

    @Override // P4.AbstractC0122a
    public final int g(Object obj) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.i.e(sArr, "<this>");
        return sArr.length;
    }

    @Override // P4.AbstractC0134m, P4.AbstractC0122a
    public final void i(O4.a aVar, int i2, Object obj, boolean z) {
        P builder = (P) obj;
        kotlin.jvm.internal.i.e(builder, "builder");
        short r5 = aVar.r(this.f2335b, i2);
        builder.b(builder.d() + 1);
        short[] sArr = builder.f2339a;
        int i3 = builder.f2340b;
        builder.f2340b = i3 + 1;
        sArr[i3] = r5;
    }

    @Override // P4.AbstractC0122a
    public final Object j(Object obj) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.i.e(sArr, "<this>");
        P p5 = new P();
        p5.f2339a = sArr;
        p5.f2340b = sArr.length;
        p5.b(10);
        return p5;
    }

    @Override // P4.M
    public final Object m() {
        return new short[0];
    }

    @Override // P4.M
    public final void n(R4.s encoder, Object obj, int i2) {
        short[] content = (short[]) obj;
        kotlin.jvm.internal.i.e(encoder, "encoder");
        kotlin.jvm.internal.i.e(content, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            short s2 = content[i3];
            L descriptor = this.f2335b;
            kotlin.jvm.internal.i.e(descriptor, "descriptor");
            encoder.f(descriptor, i3);
            encoder.n(s2);
        }
    }
}
