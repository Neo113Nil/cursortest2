package defpackage;

import java.io.PrintWriter;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hf1 extends ff1 {
    public final id1 a;
    public final gf1 b;

    public hf1(id1 id1Var, t53 t53Var) {
        this.a = id1Var;
        t53Var.getClass();
        h50 h50Var = h50.b;
        h50Var.getClass();
        js0 js0Var = new js0(t53Var, gf1.c, h50Var);
        gu a = d82.a(gf1.class);
        String b = a.b();
        if (b != null) {
            this.b = (gf1) js0Var.x(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        } else {
            lh.e("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public final void b(String str, PrintWriter printWriter) {
        yn2 yn2Var = this.b.b;
        if (yn2Var.f() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (yn2Var.f() <= 0) {
                return;
            }
            if (yn2Var.g(0) != null) {
                b71.o();
                return;
            }
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(yn2Var.d(0));
            printWriter.print(": ");
            throw null;
        }
    }

    public final String toString() {
        int lastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        id1 id1Var = this.a;
        String simpleName = id1Var.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = id1Var.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(id1Var)));
        sb.append("}}");
        return sb.toString();
    }
}
