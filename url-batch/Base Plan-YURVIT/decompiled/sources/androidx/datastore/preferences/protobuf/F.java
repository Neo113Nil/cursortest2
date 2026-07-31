package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: b, reason: collision with root package name */
    public static final C0107t f1451b = new C0107t(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f1452a;

    public F(C0101m c0101m) {
        AbstractC0112y.a(c0101m, "output");
        this.f1452a = c0101m;
        c0101m.f1562e = this;
    }

    public void a(int i2, Object obj, W w2) {
        C0101m c0101m = (C0101m) this.f1452a;
        c0101m.o0(i2, 3);
        w2.b((AbstractC0089a) obj, c0101m.f1562e);
        c0101m.o0(i2, 4);
    }

    public F() {
        L l2;
        T t = T.f1483c;
        try {
            l2 = (L) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            l2 = f1451b;
        }
        L[] lArr = {C0107t.f1587b, l2};
        E e2 = new E();
        e2.f1450a = lArr;
        Charset charset = AbstractC0112y.f1602a;
        this.f1452a = e2;
    }
}
