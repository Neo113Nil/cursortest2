package Q7;

/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final i f2771a = new i();

    public static c a(int i, a aVar, int i4) {
        if ((i4 & 2) != 0) {
            aVar = a.f2731n;
        }
        if (i == -2) {
            if (aVar != a.f2731n) {
                return new n(1, aVar);
            }
            g.f2769h0.getClass();
            return new c(f.f2768b);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? aVar == a.f2731n ? new c(i) : new n(i, aVar) : new c(Integer.MAX_VALUE) : aVar == a.f2731n ? new c(0) : new n(1, aVar);
        }
        if (aVar == a.f2731n) {
            return new n(1, a.f2732u);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static final Throwable b(Object obj) {
        h hVar = obj instanceof h ? (h) obj : null;
        if (hVar != null) {
            return hVar.f2770a;
        }
        return null;
    }
}
