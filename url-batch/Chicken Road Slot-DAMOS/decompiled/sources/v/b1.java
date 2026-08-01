package v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface b1 {
    boolean a();

    l i(long j, l lVar, l lVar2, l lVar3);

    long j(l lVar, l lVar2, l lVar3);

    default l k(l lVar, l lVar2, l lVar3) {
        return n(j(lVar, lVar2, lVar3), lVar, lVar2, lVar3);
    }

    l n(long j, l lVar, l lVar2, l lVar3);
}
