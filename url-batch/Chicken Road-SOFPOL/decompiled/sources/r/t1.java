package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public interface t1 {
    boolean a();

    p k(long j7, p pVar, p pVar2, p pVar3);

    p l(long j7, p pVar, p pVar2, p pVar3);

    long m(p pVar, p pVar2, p pVar3);

    default p o(p pVar, p pVar2, p pVar3) {
        return l(m(pVar, pVar2, pVar3), pVar, pVar2, pVar3);
    }
}
