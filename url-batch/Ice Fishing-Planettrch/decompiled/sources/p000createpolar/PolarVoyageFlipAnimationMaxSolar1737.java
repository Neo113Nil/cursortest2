package p000createpolar;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFlipAnimationMaxSolar1737 implements Closeable {
    public final RandomAccessFile PolarVoyageBottomSheetOmegaNeo1907;
    public boolean PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final ReentrantLock PolarVoyageRotateAnimationCyberCelestialDelta4768 = new ReentrantLock();
    public int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageFlipAnimationMaxSolar1737(RandomAccessFile randomAccessFile) {
        this.PolarVoyageBottomSheetOmegaNeo1907 = randomAccessFile;
    }

    public final PolarVoyageIntentUltraNovaX6364 PolarVoyageMotionLayoutTransitionHeroVision4068(long j) {
        ReentrantLock reentrantLock = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        reentrantLock.lock();
        try {
            if (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                throw new IllegalStateException("closed");
            }
            this.PolarVoyageStrictModeLegendEpic1532++;
            reentrantLock.unlock();
            return new PolarVoyageIntentUltraNovaX6364(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        reentrantLock.lock();
        try {
            if (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                return;
            }
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = true;
            if (this.PolarVoyageStrictModeLegendEpic1532 != 0) {
                return;
            }
            synchronized (this) {
                this.PolarVoyageBottomSheetOmegaNeo1907.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        reentrantLock.lock();
        try {
            if (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.PolarVoyageBottomSheetOmegaNeo1907.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }
}
