package b0;

import B0.d;
import androidx.lifecycle.InterfaceC0086t;
import androidx.lifecycle.U;
import java.io.PrintWriter;
import o.l;

/* renamed from: b0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0093c extends AbstractC0091a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0086t f1636a;

    /* renamed from: b, reason: collision with root package name */
    public final C0092b f1637b;

    public C0093c(InterfaceC0086t interfaceC0086t, U u2) {
        this.f1636a = interfaceC0086t;
        this.f1637b = (C0092b) new d(u2, C0092b.f1634c).B(C0092b.class);
    }

    public final void b(String str, PrintWriter printWriter) {
        l lVar = this.f1637b.f1635b;
        if (lVar.f3715c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (lVar.f3715c <= 0) {
                return;
            }
            if (lVar.f3714b[0] != null) {
                throw new ClassCastException();
            }
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(lVar.f3713a[0]);
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
        InterfaceC0086t interfaceC0086t = this.f1636a;
        if (interfaceC0086t == null) {
            sb.append("null");
        } else {
            String simpleName = interfaceC0086t.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = interfaceC0086t.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            sb.append(Integer.toHexString(System.identityHashCode(interfaceC0086t)));
        }
        sb.append("}}");
        return sb.toString();
    }
}
