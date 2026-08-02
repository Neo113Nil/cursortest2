package j$.util.concurrent;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class r extends l {
    public r e;
    public r f;
    public r g;
    public r h;
    public boolean i;

    public r(int i, Object obj, Object obj2, l lVar, r rVar) {
        super(i, obj, obj2, lVar);
        this.e = rVar;
    }

    @Override // j$.util.concurrent.l
    public final l a(int i, Object obj) {
        return b(i, obj, null);
    }

    public final r b(int i, Object obj, Class cls) {
        if (obj == null) {
            return null;
        }
        do {
            r rVar = this.f;
            r rVar2 = this.g;
            int i2 = this.a;
            if (i2 <= i) {
                if (i2 >= i) {
                    Object obj2 = this.b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return this;
                    }
                    if (rVar != null) {
                        if (rVar2 != null) {
                            if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                                int i3 = ConcurrentHashMap.g;
                                int compareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                                if (compareTo != 0) {
                                    if (compareTo >= 0) {
                                        rVar = rVar2;
                                    }
                                }
                            }
                            r b = rVar2.b(i, obj, cls);
                            if (b != null) {
                                return b;
                            }
                        }
                    }
                }
                this = rVar2;
            }
            this = rVar;
        } while (this != null);
        return null;
    }
}
