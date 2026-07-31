package U;

/* loaded from: classes.dex */
public interface j extends l {
    @Override // U.l
    default Object a(Object obj, Y1.e eVar) {
        return eVar.g(obj, this);
    }

    @Override // U.l
    default boolean c(Y1.c cVar) {
        return ((Boolean) cVar.j(this)).booleanValue();
    }
}
