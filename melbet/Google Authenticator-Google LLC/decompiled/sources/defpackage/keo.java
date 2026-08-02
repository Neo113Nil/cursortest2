package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class keo implements khx {
    private final AtomicLong a = new AtomicLong();

    @Override // defpackage.khx
    public final void a() {
        this.a.getAndAdd(1L);
    }
}
