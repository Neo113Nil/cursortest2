package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class did extends AbstractOwnableSynchronizer {
    public final void a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }
}
