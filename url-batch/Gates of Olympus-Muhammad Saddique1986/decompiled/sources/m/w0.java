package m;

/* loaded from: classes.dex */
public interface w0 {
    boolean a();

    r d(long j3, r rVar, r rVar2, r rVar3);

    r f(long j3, r rVar, r rVar2, r rVar3);

    long g(r rVar, r rVar2, r rVar3);

    default r h(r rVar, r rVar2, r rVar3) {
        return d(g(rVar, rVar2, rVar3), rVar, rVar2, rVar3);
    }
}
