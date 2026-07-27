package G;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class G implements A0 {

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f2680d;

    /* renamed from: e, reason: collision with root package name */
    public H f2681e;

    public G(Function1 function1) {
        this.f2680d = function1;
    }

    @Override // G.A0
    public final void a() {
        H h4 = this.f2681e;
        if (h4 != null) {
            h4.a();
        }
        this.f2681e = null;
    }

    @Override // G.A0
    public final void b() {
        this.f2681e = (H) this.f2680d.invoke(C0192d.f2799h);
    }

    @Override // G.A0
    public final void d() {
    }
}
