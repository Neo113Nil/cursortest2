package c7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final i f1799a = new i();

    public static c a(int i, a aVar, int i8) {
        int i9 = i8 & 2;
        a aVar2 = a.f1760d;
        if (i9 != 0) {
            aVar = aVar2;
        }
        if (i == -2) {
            if (aVar != aVar2) {
                return new n(1, aVar);
            }
            g.f1797a.getClass();
            return new c(f.f1796b);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? aVar == aVar2 ? new c(i) : new n(i, aVar) : new c(Integer.MAX_VALUE) : aVar == aVar2 ? new c(0) : new n(1, aVar);
        }
        if (aVar == aVar2) {
            return new n(1, a.f1761e);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }
}
