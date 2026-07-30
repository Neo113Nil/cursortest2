package p000createpolar;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFragmentManagerUltraDelta6251 implements ThreadFactory {
    public final AtomicInteger PolarVoyageZipVortexCelestial6185 = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.PolarVoyageZipVortexCelestial6185.getAndIncrement());
        return thread;
    }
}
