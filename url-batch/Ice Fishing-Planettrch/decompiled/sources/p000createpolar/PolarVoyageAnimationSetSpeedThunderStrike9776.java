package p000createpolar;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAnimationSetSpeedThunderStrike9776 implements ServiceConnection {
    public final long PolarVoyageZipVortexCelestial6185;
    public boolean PolarVoyageMotionLayoutTransitionHeroVision4068 = false;
    public final LinkedBlockingQueue PolarVoyageKotlinBetaPulseBeta3653 = new LinkedBlockingQueue(1);

    public PolarVoyageAnimationSetSpeedThunderStrike9776(long j) {
        this.PolarVoyageZipVortexCelestial6185 = j;
    }

    public final IBinder PolarVoyageZipVortexCelestial6185() {
        if (this.PolarVoyageMotionLayoutTransitionHeroVision4068) {
            PolarVoyageR8UltraEliteBeta8736.PolarVoyageAnimatorSetSparkUltraMax8233();
            return null;
        }
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = true;
        return (IBinder) this.PolarVoyageKotlinBetaPulseBeta3653.poll(this.PolarVoyageZipVortexCelestial6185, TimeUnit.MILLISECONDS);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.PolarVoyageKotlinBetaPulseBeta3653.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
