package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dgf extends hur implements hvk {
    public volatile hvk a;

    public dgf(hvi hviVar, hvk hvkVar) {
        super(hviVar);
        this.a = hvkVar;
        hviVar.c(new ath(this, 13), huf.a);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.a.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }
}
