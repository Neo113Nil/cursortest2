package androidx.loader.app;

import defpackage.lx;
import defpackage.sm0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class b {
    public final lx a;
    public final LoaderManagerImpl$LoaderViewModel b;

    public b(lx lxVar, sm0 sm0Var) {
        this.a = lxVar;
        this.b = LoaderManagerImpl$LoaderViewModel.getInstance(sm0Var);
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.b.dump(str, fileDescriptor, printWriter, strArr);
    }

    public final void b() {
        this.b.markForRedelivery();
    }

    public final String toString() {
        int lastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        lx lxVar = this.a;
        if (lxVar == null) {
            sb.append("null");
        } else {
            String simpleName = lxVar.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = lxVar.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            sb.append(Integer.toHexString(System.identityHashCode(lxVar)));
        }
        sb.append("}}");
        return sb.toString();
    }
}
