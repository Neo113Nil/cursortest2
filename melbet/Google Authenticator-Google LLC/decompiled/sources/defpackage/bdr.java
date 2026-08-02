package defpackage;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bdr extends Exception {
    private static final StackTraceElement[] a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List b;
    private bbh c;
    private Class d;
    private String e;
    private int f;

    public bdr(String str, List list) {
        this.e = str;
        setStackTrace(a);
        this.b = list;
    }

    private final void c(Throwable th, List list) {
        if (th instanceof bdr) {
            Iterator it = ((bdr) th).b.iterator();
            while (it.hasNext()) {
                c((Throwable) it.next(), list);
            }
        } else if (th != null) {
            list.add(th);
        }
    }

    private static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private final void e(Appendable appendable) {
        d(this, appendable);
        bdq bdqVar = new bdq(appendable);
        List list = this.b;
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                bdqVar.append("Cause (");
                int i2 = i + 1;
                bdqVar.append(String.valueOf(i2));
                bdqVar.append(" of ");
                bdqVar.append(String.valueOf(size));
                bdqVar.append("): ");
                Throwable th = (Throwable) list.get(i);
                if (th instanceof bdr) {
                    ((bdr) th).e(bdqVar);
                } else {
                    d(th, bdqVar);
                }
                i = i2;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        c(this, arrayList);
        return arrayList;
    }

    final void b(bbh bbhVar, int i, Class cls) {
        this.c = bbhVar;
        this.f = i;
        this.d = cls;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.e);
        Class cls = this.d;
        sb.append(cls != null ? ", ".concat(cls.toString()) : "");
        int i = this.f;
        sb.append(i != 0 ? ", ".concat(afn.r(i)) : "");
        bbh bbhVar = this.c;
        sb.append(bbhVar != null ? ", ".concat(bbhVar.toString()) : "");
        List<Throwable> a2 = a();
        if (a2.isEmpty()) {
            return sb.toString();
        }
        if (a2.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(a2.size());
            sb.append(" root causes:");
        }
        for (Throwable th : a2) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        e(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }

    public bdr(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
