package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cyg {
    public static volatile cyg a;
    public static final Object b = new Object();
    public final AtomicLong c = new AtomicLong(-1);
    private final crv d;

    public cyg(Context context) {
        this.d = new crv(context, new crh("module:cronet_dynamite"));
    }

    final synchronized void a(int i, int i2, long j, long j2, int i3) {
        AtomicLong atomicLong = this.c;
        if (atomicLong.get() != -1 && SystemClock.uptimeMillis() - atomicLong.get() <= 1800000) {
            return;
        }
        this.d.a(new crg(0, Arrays.asList(new cqy(i, i2, -1, j, j2, null, null, 368, i3)))).m(new cvy(this, 4));
    }
}
