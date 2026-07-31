package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final t f686b = new t(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f687a;

    public g0(m mVar) {
        y.a(mVar, "output");
        this.f687a = mVar;
        mVar.f727k = this;
    }

    public void a(int i, Object obj, x0 x0Var) {
        m mVar = (m) this.f687a;
        mVar.e0(i, 3);
        x0Var.b((a) obj, mVar.f727k);
        mVar.e0(i, 4);
    }

    public g0() {
        m0 m0Var;
        u0 u0Var = u0.f784c;
        try {
            m0Var = (m0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            m0Var = f686b;
        }
        m0[] m0VarArr = {t.f771b, m0Var};
        f0 f0Var = new f0();
        f0Var.f681a = m0VarArr;
        Charset charset = y.f794a;
        this.f687a = f0Var;
    }
}
