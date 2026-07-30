package o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final t.e f6627a;

    /* renamed from: b, reason: collision with root package name */
    public final c7.h f6628b;

    public h(t.e eVar, c7.h hVar) {
        this.f6627a = eVar;
        this.f6628b = hVar;
    }

    public final String toString() {
        c7.h hVar = this.f6628b;
        if (hVar.f1702j.u(c7.w.f1752g) != null) {
            throw new ClassCastException();
        }
        StringBuilder sb = new StringBuilder("Request@");
        int hashCode = hashCode();
        v1.g.b(16);
        String num = Integer.toString(hashCode, 16);
        r6.k.e(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        sb.append("(currentBounds()=");
        sb.append(this.f6627a.a());
        sb.append(", continuation=");
        sb.append(hVar);
        sb.append(')');
        return sb.toString();
    }
}
