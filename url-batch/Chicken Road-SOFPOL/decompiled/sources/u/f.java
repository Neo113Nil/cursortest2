package u;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final b0.b f6974a;

    /* renamed from: b, reason: collision with root package name */
    public final a7.h f6975b;

    public f(b0.b bVar, a7.h hVar) {
        this.f6974a = bVar;
        this.f6975b = hVar;
    }

    public final String toString() {
        a7.h hVar = this.f6975b;
        if (hVar.f261h.l(a7.t.f300e) != null) {
            throw new ClassCastException();
        }
        StringBuilder sb = new StringBuilder("Request@");
        int hashCode = hashCode();
        r2.o.p(16);
        String num = Integer.toString(hashCode, 16);
        q6.i.d(num, "toString(...)");
        sb.append(num);
        sb.append("(currentBounds()=");
        sb.append(this.f6974a.b());
        sb.append(", continuation=");
        sb.append(hVar);
        sb.append(')');
        return sb.toString();
    }
}
