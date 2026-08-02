package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: b, reason: collision with root package name */
    public static final C0152t f2224b = new C0152t(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f2225a;

    public F(C0146m c0146m) {
        AbstractC0157y.a(c0146m, "output");
        this.f2225a = c0146m;
        c0146m.f2327i = this;
    }

    public void a(int i3, Object obj, W w3) {
        C0146m c0146m = (C0146m) this.f2225a;
        c0146m.q0(i3, 3);
        w3.b((AbstractC0134a) obj, c0146m.f2327i);
        c0146m.q0(i3, 4);
    }

    public F() {
        T t3 = T.f2253c;
        Object obj = f2224b;
        try {
            obj = (L) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
        }
        L[] lArr = {C0152t.f2360b, obj};
        E e3 = new E();
        e3.f2223a = lArr;
        Charset charset = AbstractC0157y.f2364a;
        this.f2225a = e3;
    }
}
