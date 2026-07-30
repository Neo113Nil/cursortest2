package p000createpolar;

import android.os.Handler;
import android.os.Looper;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLinearLayoutInfernoDelta2662 implements Executor {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final Object PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageLinearLayoutInfernoDelta2662() {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 2;
        PolarVoyageLayoutTitaniumOlympian9962 polarVoyageLayoutTitaniumOlympian9962 = new PolarVoyageLayoutTitaniumOlympian9962(Looper.getMainLooper());
        Looper.getMainLooper();
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageLayoutTitaniumOlympian9962;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Handler handler = (Handler) obj;
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                ((Executor) obj).execute(new PolarVoyageLooperThreadNovaSolar2749(runnable, 0));
                return;
            default:
                ((PolarVoyageLayoutTitaniumOlympian9962) obj).post(runnable);
                return;
        }
    }

    public /* synthetic */ PolarVoyageLinearLayoutInfernoDelta2662(int i, Object obj) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
    }
}
