package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class q33 {
    public Function1 a;

    public abstract void a(yd0 yd0Var);

    public Function1 b() {
        return this.a;
    }

    public final void c() {
        Function1 b = b();
        if (b != null) {
            b.invoke(this);
        }
    }

    public void d(j6 j6Var) {
        this.a = j6Var;
    }
}
