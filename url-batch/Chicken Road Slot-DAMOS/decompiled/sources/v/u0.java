package v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface u0 {
    Object a();

    default boolean b(u.w wVar, u.w wVar2) {
        return wVar.equals(a()) && wVar2.equals(c());
    }

    Object c();
}
