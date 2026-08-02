package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hlg extends hld {
    public static final hks a = new hle();
    public static final ThreadLocal b = new hlf();
    final AtomicInteger e = new AtomicInteger();

    @Override // defpackage.hld
    public final void a() {
        this.e.decrementAndGet();
    }
}
