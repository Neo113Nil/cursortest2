package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class kr0 {
    public final b4 a;
    public final m9 b = new m9();
    public qc c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public kr0(b4 b4Var) {
        OnBackInvokedCallback a;
        this.a = b4Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                a = hr0.a.a(new cr0(this, 0), new cr0(this, 1), new dr0(this, 0), new dr0(this, 1));
            } else {
                a = fr0.a.a(new dr0(this, 2));
            }
            this.d = a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void a() {
        qc qcVar;
        qc qcVar2 = this.c;
        if (qcVar2 == null) {
            m9 m9Var = this.b;
            ListIterator listIterator = m9Var.listIterator(m9Var.a());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    qcVar = 0;
                    break;
                } else {
                    qcVar = listIterator.previous();
                    if (((qc) qcVar).a) {
                        break;
                    }
                }
            }
            qcVar2 = qcVar;
        }
        this.c = null;
        if (qcVar2 != null) {
            ((Function0) qcVar2.d.getValue()).invoke();
        } else {
            this.a.run();
        }
    }

    public final void b(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        fr0 fr0Var = fr0.a;
        if (z && !this.f) {
            fr0Var.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            fr0Var.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void c() {
        boolean z = this.g;
        boolean z2 = false;
        m9 m9Var = this.b;
        if (m9Var == null || !m9Var.isEmpty()) {
            Iterator it = m9Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((qc) it.next()).a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        b(z2);
    }
}
