package p000createpolar;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFontFamilyNeoForceEclipse2734 extends PolarVoyageLayoutTitaniumOlympian9962 {
    public final /* synthetic */ PolarVoyageFilterBlazeCelestial3240 PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final Context PolarVoyageZipVortexCelestial6185;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolarVoyageFontFamilyNeoForceEclipse2734(PolarVoyageFilterBlazeCelestial3240 polarVoyageFilterBlazeCelestial3240, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageFilterBlazeCelestial3240;
        this.PolarVoyageZipVortexCelestial6185 = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int i2 = PolarVoyageServiceVisionUltraNova5701.PolarVoyageZipVortexCelestial6185;
        PolarVoyageFilterBlazeCelestial3240 polarVoyageFilterBlazeCelestial3240 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        Context context = this.PolarVoyageZipVortexCelestial6185;
        int PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageFilterBlazeCelestial3240.PolarVoyageMotionLayoutTransitionHeroVision4068(context, i2);
        AtomicBoolean atomicBoolean = PolarVoyageVideoCaptureCelestialLegend8331.PolarVoyageZipVortexCelestial6185;
        if (PolarVoyageMotionLayoutTransitionHeroVision4068 == 1 || PolarVoyageMotionLayoutTransitionHeroVision4068 == 2 || PolarVoyageMotionLayoutTransitionHeroVision4068 == 3 || PolarVoyageMotionLayoutTransitionHeroVision4068 == 9) {
            Intent PolarVoyageZipVortexCelestial6185 = polarVoyageFilterBlazeCelestial3240.PolarVoyageZipVortexCelestial6185(PolarVoyageMotionLayoutTransitionHeroVision4068, context, "n");
            polarVoyageFilterBlazeCelestial3240.PolarVoyageDiffUtilTurboStrike5735(context, PolarVoyageMotionLayoutTransitionHeroVision4068, PolarVoyageZipVortexCelestial6185 == null ? null : PendingIntent.getActivity(context, 0, PolarVoyageZipVortexCelestial6185, 201326592));
        }
    }
}
