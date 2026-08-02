package S;

import B1.j;
import androidx.lifecycle.InterfaceC0235n;
import androidx.lifecycle.O;
import java.io.PrintWriter;
import p.k;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2380a;

    /* renamed from: b, reason: collision with root package name */
    public final c f2381b;

    public d(InterfaceC0235n interfaceC0235n, O o) {
        this.f2380a = interfaceC0235n;
        j jVar = new j(o, c.f2378e);
        String canonicalName = c.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        this.f2381b = (c) jVar.l(c.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
    }

    public final void b(String str, PrintWriter printWriter) {
        k kVar = this.f2381b.f2379d;
        if (kVar.f14670c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (kVar.f14670c <= 0) {
                return;
            }
            if (kVar.f14669b[0] != null) {
                throw new ClassCastException();
            }
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(kVar.f14668a[0]);
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
        Object obj = this.f2380a;
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}}");
        return sb.toString();
    }
}
