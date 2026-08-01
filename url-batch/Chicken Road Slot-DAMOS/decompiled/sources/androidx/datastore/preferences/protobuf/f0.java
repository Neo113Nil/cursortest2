package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final s f537b = new s(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f538a;

    public f0() {
        l0 l0Var;
        t0 t0Var = t0.f636c;
        try {
            l0Var = (l0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            l0Var = f537b;
        }
        l0[] l0VarArr = {s.f622b, l0Var};
        e0 e0Var = new e0();
        e0Var.f532a = l0VarArr;
        Charset charset = x.f647a;
        this.f538a = e0Var;
    }

    public void a(int i3, Object obj, w0 w0Var) {
        l lVar = (l) this.f538a;
        lVar.B(i3, 3);
        w0Var.b((a) obj, lVar.f578a);
        lVar.B(i3, 4);
    }

    public f0(l lVar) {
        x.a(lVar, "output");
        this.f538a = lVar;
        lVar.f578a = this;
    }
}
