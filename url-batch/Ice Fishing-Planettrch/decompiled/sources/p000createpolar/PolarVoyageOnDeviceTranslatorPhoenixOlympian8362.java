package p000createpolar;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageOnDeviceTranslatorPhoenixOlympian8362 {
    public final AtomicReferenceArray PolarVoyageZipVortexCelestial6185 = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater PolarVoyageMotionLayoutTransitionHeroVision4068 = AtomicReferenceFieldUpdater.newUpdater(PolarVoyageOnDeviceTranslatorPhoenixOlympian8362.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater PolarVoyageKotlinBetaPulseBeta3653 = AtomicIntegerFieldUpdater.newUpdater(PolarVoyageOnDeviceTranslatorPhoenixOlympian8362.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater PolarVoyageBarcodeScannerInfernoSolarSpark7767 = AtomicIntegerFieldUpdater.newUpdater(PolarVoyageOnDeviceTranslatorPhoenixOlympian8362.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater PolarVoyageBitmapVisionAuroraPixel4705 = AtomicIntegerFieldUpdater.newUpdater(PolarVoyageOnDeviceTranslatorPhoenixOlympian8362.class, "blockingTasksInBuffer$volatile");

    public final PolarVoyageModelInputOutputNebulaRogueOlympian9897 PolarVoyageKotlinBetaPulseBeta3653(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.PolarVoyageZipVortexCelestial6185;
        PolarVoyageModelInputOutputNebulaRogueOlympian9897 polarVoyageModelInputOutputNebulaRogueOlympian9897 = (PolarVoyageModelInputOutputNebulaRogueOlympian9897) atomicReferenceArray.get(i2);
        if (polarVoyageModelInputOutputNebulaRogueOlympian9897 != null && polarVoyageModelInputOutputNebulaRogueOlympian9897.PolarVoyageStrictModeLegendEpic1532 == z) {
            while (!atomicReferenceArray.compareAndSet(i2, polarVoyageModelInputOutputNebulaRogueOlympian9897, null)) {
                if (atomicReferenceArray.get(i2) != polarVoyageModelInputOutputNebulaRogueOlympian9897) {
                }
            }
            if (z) {
                PolarVoyageBitmapVisionAuroraPixel4705.decrementAndGet(this);
            }
            return polarVoyageModelInputOutputNebulaRogueOlympian9897;
        }
        return null;
    }

    public final PolarVoyageModelInputOutputNebulaRogueOlympian9897 PolarVoyageMotionLayoutTransitionHeroVision4068() {
        PolarVoyageModelInputOutputNebulaRogueOlympian9897 polarVoyageModelInputOutputNebulaRogueOlympian9897;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - PolarVoyageKotlinBetaPulseBeta3653.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (polarVoyageModelInputOutputNebulaRogueOlympian9897 = (PolarVoyageModelInputOutputNebulaRogueOlympian9897) this.PolarVoyageZipVortexCelestial6185.getAndSet(i2, null)) != null) {
                if (polarVoyageModelInputOutputNebulaRogueOlympian9897.PolarVoyageStrictModeLegendEpic1532) {
                    PolarVoyageBitmapVisionAuroraPixel4705.decrementAndGet(this);
                }
                return polarVoyageModelInputOutputNebulaRogueOlympian9897;
            }
        }
    }

    public final PolarVoyageModelInputOutputNebulaRogueOlympian9897 PolarVoyageZipVortexCelestial6185(PolarVoyageModelInputOutputNebulaRogueOlympian9897 polarVoyageModelInputOutputNebulaRogueOlympian9897) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = PolarVoyageKotlinBetaPulseBeta3653;
        if (atomicIntegerFieldUpdater.get(this) - PolarVoyageBarcodeScannerInfernoSolarSpark7767.get(this) == 127) {
            return polarVoyageModelInputOutputNebulaRogueOlympian9897;
        }
        if (polarVoyageModelInputOutputNebulaRogueOlympian9897.PolarVoyageStrictModeLegendEpic1532) {
            PolarVoyageBitmapVisionAuroraPixel4705.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.PolarVoyageZipVortexCelestial6185;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, polarVoyageModelInputOutputNebulaRogueOlympian9897);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }
}
