package p000createpolar;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAnimationSetHeroAurora9466 implements Executor {
    public static final PolarVoyageAnimationSetHeroAurora9466 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public static final /* synthetic */ PolarVoyageAnimationSetHeroAurora9466[] PolarVoyageStrictModeLegendEpic1532;

    static {
        PolarVoyageAnimationSetHeroAurora9466 polarVoyageAnimationSetHeroAurora9466 = new PolarVoyageAnimationSetHeroAurora9466("INSTANCE", 0);
        PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageAnimationSetHeroAurora9466;
        PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageAnimationSetHeroAurora9466[]{polarVoyageAnimationSetHeroAurora9466};
    }

    public static PolarVoyageAnimationSetHeroAurora9466 valueOf(String str) {
        return (PolarVoyageAnimationSetHeroAurora9466) Enum.valueOf(PolarVoyageAnimationSetHeroAurora9466.class, str);
    }

    public static PolarVoyageAnimationSetHeroAurora9466[] values() {
        return (PolarVoyageAnimationSetHeroAurora9466[]) PolarVoyageStrictModeLegendEpic1532.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
