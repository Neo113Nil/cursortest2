package defpackage;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class rr extends pr {
    public final nq a;

    public rr(nq nqVar, q90 q90Var) {
        this.a = nqVar;
        r6 r6Var = new r6(q90Var, qr.e);
        String canonicalName = qr.class.getCanonicalName();
        if (canonicalName != null) {
        } else {
            o8.j("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public final String toString() {
        int lastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        nq nqVar = this.a;
        String simpleName = nqVar.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = nqVar.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(nqVar)));
        sb.append("}}");
        return sb.toString();
    }
}
