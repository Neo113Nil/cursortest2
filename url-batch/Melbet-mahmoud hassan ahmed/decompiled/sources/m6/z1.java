package m6;

/* loaded from: classes.dex */
public final class z1 extends kotlinx.coroutines.internal.l implements j1 {
    @Override // m6.j1
    public boolean b() {
        return true;
    }

    @Override // m6.j1
    public z1 h() {
        return this;
    }

    @Override // kotlinx.coroutines.internal.n
    public String toString() {
        return p0.c() ? y("Active") : super.toString();
    }

    public final String y(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        boolean z6 = true;
        for (kotlinx.coroutines.internal.n nVar = (kotlinx.coroutines.internal.n) o(); !kotlin.jvm.internal.i.a(nVar, this); nVar = nVar.p()) {
            if (nVar instanceof u1) {
                u1 u1Var = (u1) nVar;
                if (z6) {
                    z6 = false;
                } else {
                    sb.append(", ");
                }
                sb.append(u1Var);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.c(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
