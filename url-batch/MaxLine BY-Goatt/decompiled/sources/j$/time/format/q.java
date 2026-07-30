package j$.time.format;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class q implements e {
    public final j$.time.temporal.q a;
    public final g0 b;
    public final b0 c;
    public volatile i d;

    public q(j$.time.temporal.q qVar, g0 g0Var, b0 b0Var) {
        this.a = qVar;
        this.b = g0Var;
        this.c = b0Var;
    }

    @Override // j$.time.format.e
    public final int B(v vVar, CharSequence charSequence, int i) {
        b0 b0Var = this.c;
        j$.time.temporal.q qVar = this.a;
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException();
        }
        boolean z = vVar.c;
        DateTimeFormatter dateTimeFormatter = vVar.a;
        g0 g0Var = z ? this.b : null;
        j$.time.chrono.m mVar = vVar.c().c;
        if (mVar == null && (mVar = vVar.a.e) == null) {
            mVar = j$.time.chrono.t.c;
        }
        j$.time.chrono.m mVar2 = mVar;
        Iterator e = (mVar2 == null || mVar2 == j$.time.chrono.t.c) ? b0Var.e(qVar, g0Var, dateTimeFormatter.b) : b0Var.d(mVar2, qVar, g0Var, dateTimeFormatter.b);
        if (e != null) {
            while (e.hasNext()) {
                Map.Entry entry = (Map.Entry) e.next();
                String str = (String) entry.getKey();
                if (vVar.g(str, 0, charSequence, i, str.length())) {
                    return vVar.f(this.a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                }
            }
            if (qVar == j$.time.temporal.a.ERA && !vVar.c) {
                Iterator it = mVar2.A().iterator();
                while (it.hasNext()) {
                    String obj = ((j$.time.chrono.n) it.next()).toString();
                    if (vVar.g(obj, 0, charSequence, i, obj.length())) {
                        return vVar.f(this.a, r8.getValue(), i, obj.length() + i);
                    }
                }
            }
            if (vVar.c) {
                return ~i;
            }
        }
        if (this.d == null) {
            this.d = new i(this.a, 1, 19, f0.NORMAL);
        }
        return this.d.B(vVar, charSequence, i);
    }

    @Override // j$.time.format.e
    public final boolean s(y yVar, StringBuilder sb) {
        Long a = yVar.a(this.a);
        DateTimeFormatter dateTimeFormatter = yVar.b;
        if (a == null) {
            return false;
        }
        j$.time.chrono.m mVar = (j$.time.chrono.m) yVar.a.b(j$.time.temporal.r.b);
        String c = (mVar == null || mVar == j$.time.chrono.t.c) ? this.c.c(this.a, a.longValue(), this.b, dateTimeFormatter.b) : this.c.b(mVar, this.a, a.longValue(), this.b, dateTimeFormatter.b);
        if (c != null) {
            sb.append(c);
            return true;
        }
        if (this.d == null) {
            this.d = new i(this.a, 1, 19, f0.NORMAL);
        }
        return this.d.s(yVar, sb);
    }

    public final String toString() {
        g0 g0Var = g0.FULL;
        g0 g0Var2 = this.b;
        j$.time.temporal.q qVar = this.a;
        if (g0Var2 == g0Var) {
            return "Text(" + qVar + ")";
        }
        return "Text(" + qVar + "," + g0Var2 + ")";
    }
}
