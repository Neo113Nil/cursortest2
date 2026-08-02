package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gzo {
    private final String a;
    private final gzn b;
    private gzn c;
    private boolean d;

    public gzo(String str) {
        gzn gznVar = new gzn();
        this.b = gznVar;
        this.c = gznVar;
        this.d = false;
        str.getClass();
        this.a = str;
    }

    private final gzn h() {
        gzn gznVar = new gzn();
        this.c.c = gznVar;
        this.c = gznVar;
        return gznVar;
    }

    public final void a(Object obj) {
        h().b = obj;
    }

    public final void b(String str, Object obj) {
        gzn h = h();
        h.b = obj;
        h.a = str;
    }

    public final void c(String str, Object obj) {
        gzm gzmVar = new gzm();
        this.c.c = gzmVar;
        this.c = gzmVar;
        gzmVar.b = obj;
        gzmVar.a = str;
    }

    public final void d() {
        this.d = true;
    }

    public final void e(String str, int i) {
        c(str, String.valueOf(i));
    }

    public final void f(String str, long j) {
        c(str, String.valueOf(j));
    }

    public final void g(String str, boolean z) {
        c(str, String.valueOf(z));
    }

    public final String toString() {
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        String str = "";
        for (gzn gznVar = this.b.c; gznVar != null; gznVar = gznVar.c) {
            boolean z2 = gznVar instanceof gzm;
            Object obj = gznVar.b;
            if (z2 || obj != null || !z) {
                sb.append(str);
                String str2 = gznVar.a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
