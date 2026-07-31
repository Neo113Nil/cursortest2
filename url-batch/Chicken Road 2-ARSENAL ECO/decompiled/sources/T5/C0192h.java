package T5;

/* renamed from: T5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0192h extends N {

    /* renamed from: c, reason: collision with root package name */
    public static final C0192h f2437c = new C0192h(C0193i.f2440a);

    @Override // T5.AbstractC0185a
    public final int g(Object obj) {
        byte[] bArr = (byte[]) obj;
        kotlin.jvm.internal.i.e(bArr, "<this>");
        return bArr.length;
    }

    @Override // T5.AbstractC0197m, T5.AbstractC0185a
    public final void i(S5.a aVar, int i7, Object obj) {
        C0191g builder = (C0191g) obj;
        kotlin.jvm.internal.i.e(builder, "builder");
        byte l7 = aVar.l(this.f2398b, i7);
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f2433a;
        int i8 = builder.f2434b;
        builder.f2434b = i8 + 1;
        bArr[i8] = l7;
    }

    @Override // T5.AbstractC0185a
    public final Object j(Object obj) {
        byte[] bArr = (byte[]) obj;
        kotlin.jvm.internal.i.e(bArr, "<this>");
        C0191g c0191g = new C0191g();
        c0191g.f2433a = bArr;
        c0191g.f2434b = bArr.length;
        c0191g.b(10);
        return c0191g;
    }

    @Override // T5.N
    public final Object m() {
        return new byte[0];
    }

    @Override // T5.N
    public final void n(V5.s encoder, Object obj, int i7) {
        byte[] content = (byte[]) obj;
        kotlin.jvm.internal.i.e(encoder, "encoder");
        kotlin.jvm.internal.i.e(content, "content");
        for (int i8 = 0; i8 < i7; i8++) {
            byte b7 = content[i8];
            M descriptor = this.f2398b;
            kotlin.jvm.internal.i.e(descriptor, "descriptor");
            encoder.f(descriptor, i8);
            encoder.c(b7);
        }
    }
}
