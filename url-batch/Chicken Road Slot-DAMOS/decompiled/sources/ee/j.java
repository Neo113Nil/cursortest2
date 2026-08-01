package ee;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j implements k {

    /* renamed from: d, reason: collision with root package name */
    public final long f3979d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3980e;

    public j(int i3, long j) {
        this.f3979d = j;
        this.f3980e = i3;
    }

    @Override // ee.k
    public final g toInstant() {
        g gVar = g.f3971i;
        g gVar2 = g.f3971i;
        long j = gVar2.f3973d;
        long j3 = this.f3979d;
        if (j3 >= j) {
            g gVar3 = g.f3972r;
            if (j3 <= gVar3.f3973d) {
                long j10 = this.f3980e;
                long j11 = j10 / 1000000000;
                if ((j10 ^ 1000000000) < 0 && j11 * 1000000000 != j10) {
                    j11--;
                }
                long j12 = j3 + j11;
                if ((j3 ^ j12) < 0 && (j11 ^ j3) >= 0) {
                    return j3 > 0 ? gVar3 : gVar2;
                }
                if (j12 >= -31557014167219200L) {
                    if (j12 <= 31556889864403199L) {
                        long j13 = j10 % 1000000000;
                        return new g((int) (j13 + ((((j13 ^ 1000000000) & ((-j13) | j13)) >> 63) & 1000000000)), j12);
                    }
                }
            }
        }
        throw new h("The parsed date is outside the range representable by Instant (Unix epoch second " + j3 + ')');
    }
}
