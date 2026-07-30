package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class oa0 extends RuntimeException {
    public final List m;

    public oa0(List list) {
        this.m = list;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        le1 b = pv.b();
        List list = this.m;
        list.getClass();
        ni1 ni1Var = new ni1(list);
        if (ni1Var.a() > 0) {
            ((nz) ni1Var.get(0)).getClass();
            throw null;
        }
        le1 a = pv.a(b);
        a.getClass();
        ni1 ni1Var2 = new ni1(a);
        int a2 = ni1Var2.a();
        for (int i = 0; i < a2; i++) {
            sb.append("\tat " + ((String) ni1Var2.get(i)));
            sb.append('\n');
        }
        return sb.toString();
    }
}
