package x0;

import d6.a0;
import java.util.List;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d extends RuntimeException {

    /* renamed from: d, reason: collision with root package name */
    public final List f8319d;

    public d(List list) {
        this.f8319d = list;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        e6.c cVar = new e6.c(10);
        List list = this.f8319d;
        i.e(list, "<this>");
        a0 a0Var = new a0(list);
        if (a0Var.a() > 0) {
            ((a) a0Var.get(0)).getClass();
            throw null;
        }
        e6.c h8 = s6.a.h(cVar);
        i.e(h8, "<this>");
        a0 a0Var2 = new a0(h8);
        int a8 = a0Var2.a();
        for (int i = 0; i < a8; i++) {
            sb.append("\tat " + ((String) a0Var2.get(i)));
            sb.append('\n');
        }
        String sb2 = sb.toString();
        i.d(sb2, "toString(...)");
        return sb2;
    }
}
