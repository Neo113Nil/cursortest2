package p000createpolar;

import android.content.Context;
import com.adjust.sdk.AdjustInstance;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageTabLayoutTurboBetaRogue3011 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ Context PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageTabLayoutTurboBetaRogue3011(Context context, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Context context = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AdjustInstance.lambda$setSendingReferrersAsNotSent$2(context);
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new PolarVoyageTabLayoutTurboBetaRogue3011(context, 2));
                break;
            default:
                PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageWithContextPulseSolarHyperion4393(context, new PolarVoyageFilterTurboThunderEclipse3279(1), PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageTextInputEditTextNebulaHero6651, false);
                break;
        }
    }
}
