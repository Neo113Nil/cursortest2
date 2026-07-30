package defpackage;

import kotlin.text.CharsKt;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class g20 {
    public final qp a;
    public final fs b;

    public g20(qp qpVar, fs fsVar) {
        this.a = qpVar;
        this.b = fsVar;
    }

    public final String toString() {
        fs fsVar = this.b;
        w40 w40Var = (w40) fsVar.q.m(w40.o);
        String str = w40Var != null ? w40Var.n : null;
        StringBuilder sb = new StringBuilder("Request@");
        String num = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        num.getClass();
        sb.append(num);
        sb.append(str != null ? q40.m("[", str, "](") : "(");
        sb.append("currentBounds()=");
        sb.append(this.a.invoke());
        sb.append(", continuation=");
        sb.append(fsVar);
        sb.append(')');
        return sb.toString();
    }
}
