package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class dm1 {
    public Function1 a;

    public abstract void a(hu huVar);

    public Function1 b() {
        return this.a;
    }

    public final void c() {
        Function1 b = b();
        if (b != null) {
            b.invoke(this);
        }
    }

    public void d(a3 a3Var) {
        this.a = a3Var;
    }
}
