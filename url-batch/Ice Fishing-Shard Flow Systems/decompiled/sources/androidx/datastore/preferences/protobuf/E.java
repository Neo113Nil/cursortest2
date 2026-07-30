package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: b, reason: collision with root package name */
    public static final C0202s f3423b = new C0202s(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f3424a;

    public E(C0196l c0196l) {
        AbstractC0207x.a(c0196l, "output");
        this.f3424a = c0196l;
        c0196l.f3531c = this;
    }

    public void a(int i2, Object obj, V v7) {
        C0196l c0196l = (C0196l) this.f3424a;
        c0196l.t0(i2, 3);
        v7.b((AbstractC0185a) obj, c0196l.f3531c);
        c0196l.t0(i2, 4);
    }

    public E() {
        K k7;
        S s7 = S.f3454c;
        try {
            k7 = (K) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            k7 = f3423b;
        }
        K[] kArr = {C0202s.f3567b, k7};
        D d7 = new D();
        d7.f3422a = kArr;
        Charset charset = AbstractC0207x.f3571a;
        this.f3424a = d7;
    }
}
