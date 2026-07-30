package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: b, reason: collision with root package name */
    public static final s f830b = new s(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f831a;

    public h0(l lVar) {
        x.a(lVar, "output");
        this.f831a = lVar;
        lVar.f857c = this;
    }

    public void a(int i7, g gVar) {
        ((l) this.f831a).A(i7, gVar);
    }

    public void b(int i7, Object obj, y0 y0Var) {
        l lVar = (l) this.f831a;
        lVar.L(i7, 3);
        y0Var.c((a) obj, lVar.f857c);
        lVar.L(i7, 4);
    }

    public h0() {
        n0 n0Var;
        try {
            n0Var = (n0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            n0Var = f830b;
        }
        n0[] n0VarArr = {s.f908b, n0Var};
        g0 g0Var = new g0();
        g0Var.f820a = n0VarArr;
        Charset charset = x.f922a;
        this.f831a = g0Var;
    }
}
