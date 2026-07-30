package c0;

import D0.j;
import androidx.lifecycle.InterfaceC0256w;
import androidx.lifecycle.b0;
import java.io.PrintWriter;
import u.C0940k;

/* renamed from: c0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287c extends AbstractC0285a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0256w f4168a;

    /* renamed from: b, reason: collision with root package name */
    public final C0286b f4169b;

    public C0287c(InterfaceC0256w interfaceC0256w, b0 b0Var) {
        this.f4168a = interfaceC0256w;
        this.f4169b = (C0286b) new j(b0Var, C0286b.f4166b).G(C0286b.class);
    }

    public final void b(String str, PrintWriter printWriter) {
        C0940k c0940k = this.f4169b.f4167a;
        if (c0940k.f8048i > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (c0940k.f8048i <= 0) {
                return;
            }
            if (c0940k.f8047e[0] != null) {
                throw new ClassCastException();
            }
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(c0940k.f8046d[0]);
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
        InterfaceC0256w interfaceC0256w = this.f4168a;
        if (interfaceC0256w == null) {
            sb.append("null");
        } else {
            String simpleName = interfaceC0256w.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = interfaceC0256w.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            sb.append(Integer.toHexString(System.identityHashCode(interfaceC0256w)));
        }
        sb.append("}}");
        return sb.toString();
    }
}
