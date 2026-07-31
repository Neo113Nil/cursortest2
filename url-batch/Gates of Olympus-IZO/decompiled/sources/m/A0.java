package m;

/* loaded from: classes.dex */
public interface A0 {
    boolean a();

    r b(long j3, r rVar, r rVar2, r rVar3);

    r c(long j3, r rVar, r rVar2, r rVar3);

    long d(r rVar, r rVar2, r rVar3);

    default r e(r rVar, r rVar2, r rVar3) {
        return b(d(rVar, rVar2, rVar3), rVar, rVar2, rVar3);
    }
}
