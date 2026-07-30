package j$.time.temporal;

import j$.time.LocalDate;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public interface m extends TemporalAccessor {
    default m a(long j, s sVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = l(Long.MAX_VALUE, sVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.l(j2, sVar);
    }

    m i(long j, q qVar);

    /* renamed from: j */
    m m(LocalDate localDate);

    m l(long j, s sVar);
}
