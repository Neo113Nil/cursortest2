package defpackage;

import android.os.SystemClock;
import j$.time.Duration;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class grl implements Callable {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ grl(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        long j = this.a;
        return i != 0 ? Long.valueOf(j) : Duration.ofMillis(SystemClock.elapsedRealtime() - j);
    }
}
