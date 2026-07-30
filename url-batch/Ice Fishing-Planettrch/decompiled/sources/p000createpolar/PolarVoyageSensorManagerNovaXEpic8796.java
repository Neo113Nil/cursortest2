package p000createpolar;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageSensorManagerNovaXEpic8796 implements Executor {
    public static final PolarVoyageSensorManagerNovaXEpic8796 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public static final /* synthetic */ PolarVoyageSensorManagerNovaXEpic8796[] PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public static final Handler PolarVoyageStrictModeLegendEpic1532;

    static {
        PolarVoyageSensorManagerNovaXEpic8796 polarVoyageSensorManagerNovaXEpic8796 = new PolarVoyageSensorManagerNovaXEpic8796("INSTANCE", 0);
        PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageSensorManagerNovaXEpic8796;
        PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageSensorManagerNovaXEpic8796[]{polarVoyageSensorManagerNovaXEpic8796};
        PolarVoyageStrictModeLegendEpic1532 = new Handler(Looper.getMainLooper());
    }

    public static PolarVoyageSensorManagerNovaXEpic8796 valueOf(String str) {
        return (PolarVoyageSensorManagerNovaXEpic8796) Enum.valueOf(PolarVoyageSensorManagerNovaXEpic8796.class, str);
    }

    public static PolarVoyageSensorManagerNovaXEpic8796[] values() {
        return (PolarVoyageSensorManagerNovaXEpic8796[]) PolarVoyageRotateAnimationCyberCelestialDelta4768.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        PolarVoyageStrictModeLegendEpic1532.post(runnable);
    }
}
