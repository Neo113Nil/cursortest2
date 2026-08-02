package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hkd extends hld {
    public static final hks a = new hkb();
    public final AtomicLong b = new AtomicLong(-1);

    @Override // defpackage.hld
    public final void a() {
        AtomicLong atomicLong = this.b;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
