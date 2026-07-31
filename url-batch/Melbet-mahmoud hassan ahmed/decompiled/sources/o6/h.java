package o6;

/* loaded from: classes.dex */
public final class h {
    public static final <E> f<E> a(int i7, e eVar, f6.l<? super E, v5.q> lVar) {
        if (i7 == -2) {
            return new d(eVar == e.SUSPEND ? f.f19919a.a() : 1, eVar, lVar);
        }
        if (i7 != -1) {
            return i7 != 0 ? i7 != Integer.MAX_VALUE ? (i7 == 1 && eVar == e.DROP_OLDEST) ? new m(lVar) : new d(i7, eVar, lVar) : new n(lVar) : eVar == e.SUSPEND ? new r(lVar) : new d(1, eVar, lVar);
        }
        if ((eVar != e.SUSPEND ? 0 : 1) != 0) {
            return new m(lVar);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
    }

    public static /* synthetic */ f b(int i7, e eVar, f6.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 0;
        }
        if ((i8 & 2) != 0) {
            eVar = e.SUSPEND;
        }
        if ((i8 & 4) != 0) {
            lVar = null;
        }
        return a(i7, eVar, lVar);
    }
}
