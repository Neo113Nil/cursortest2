package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: b, reason: collision with root package name */
    public static final C0186t f4561b = new C0186t(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f4562a;

    public F(C0180m c0180m) {
        AbstractC0191y.a(c0180m, "output");
        this.f4562a = c0180m;
        c0180m.f4672a = this;
    }

    public void a(int i4, Object obj, W w4) {
        C0180m c0180m = (C0180m) this.f4562a;
        c0180m.t0(i4, 3);
        w4.b((AbstractC0168a) obj, c0180m.f4672a);
        c0180m.t0(i4, 4);
    }

    public F() {
        L l4;
        T t4 = T.f4591c;
        try {
            l4 = (L) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            l4 = f4561b;
        }
        L[] lArr = {C0186t.f4708b, l4};
        E e4 = new E();
        e4.f4560a = lArr;
        Charset charset = AbstractC0191y.f4712a;
        this.f4562a = e4;
    }
}
