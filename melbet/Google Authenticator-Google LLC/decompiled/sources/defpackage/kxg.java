package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxg extends lcq implements kwq {
    @Override // defpackage.kwq
    public final boolean bR() {
        return true;
    }

    public final String c(String str) {
        StringBuilder sb = new StringBuilder("List{");
        sb.append(str);
        sb.append("}[");
        Object f = f();
        f.getClass();
        boolean z = true;
        for (lcs lcsVar = (lcs) f; !ksp.b(lcsVar, this); lcsVar = lcsVar.g()) {
            if ((lcsVar instanceof kwx) && !lcsVar.bT()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(lcsVar);
                z = false;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.lcs
    public final String toString() {
        return kvo.a ? c("Active") : super.toString();
    }

    @Override // defpackage.kwq
    public final kxg bP() {
        return this;
    }
}
