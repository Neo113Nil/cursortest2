package p000createpolar;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageCrashlyticsGammaSparkEclipse1822 extends ContentObserver {
    public final /* synthetic */ PolarVoyageLiveDataSolarQuantumUltra7998 PolarVoyageKotlinBetaPulseBeta3653;
    public final Uri PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final ContentResolver PolarVoyageZipVortexCelestial6185;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolarVoyageCrashlyticsGammaSparkEclipse1822(PolarVoyageLiveDataSolarQuantumUltra7998 polarVoyageLiveDataSolarQuantumUltra7998, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageLiveDataSolarQuantumUltra7998;
        this.PolarVoyageZipVortexCelestial6185 = contentResolver;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageKotlinBetaPulseBeta3653();
    }
}
