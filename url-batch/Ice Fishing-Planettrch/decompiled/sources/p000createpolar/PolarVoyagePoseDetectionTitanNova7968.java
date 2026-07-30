package p000createpolar;

import android.content.Context;
import android.net.Uri;
import com.adjust.sdk.AdjustInstance;
import com.adjust.sdk.OnLastDeeplinkReadListener;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyagePoseDetectionTitanNova7968 extends AsyncTaskExecutor {
    public final /* synthetic */ AdjustInstance PolarVoyageKotlinBetaPulseBeta3653;
    public final /* synthetic */ OnLastDeeplinkReadListener PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final /* synthetic */ Context PolarVoyageZipVortexCelestial6185;

    public PolarVoyagePoseDetectionTitanNova7968(AdjustInstance adjustInstance, Context context, OnLastDeeplinkReadListener onLastDeeplinkReadListener) {
        this.PolarVoyageKotlinBetaPulseBeta3653 = adjustInstance;
        this.PolarVoyageZipVortexCelestial6185 = context;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = onLastDeeplinkReadListener;
    }

    @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
    public final Object doInBackground(Object[] objArr) {
        String cachedDeeplink;
        cachedDeeplink = this.PolarVoyageKotlinBetaPulseBeta3653.getCachedDeeplink(this.PolarVoyageZipVortexCelestial6185);
        try {
            return Uri.parse(cachedDeeplink);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
    public final void onPostExecute(Object obj) {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068.onLastDeeplinkRead((Uri) obj);
    }
}
