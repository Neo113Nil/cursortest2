package p000createpolar;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFCMShadowUltra8547 implements ServiceConnection {
    public final ArrayDeque PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final SparseArray PolarVoyageBitmapVisionAuroraPixel4705;
    public final /* synthetic */ PolarVoyageSQLiteTitanForceLegend7380 PolarVoyageDiffUtilTurboStrike5735;
    public PolarVoyageBundlePhantomEclipseMega7910 PolarVoyageKotlinBetaPulseBeta3653;
    public final Messenger PolarVoyageMotionLayoutTransitionHeroVision4068;
    public int PolarVoyageZipVortexCelestial6185 = 0;

    public PolarVoyageFCMShadowUltra8547(PolarVoyageSQLiteTitanForceLegend7380 polarVoyageSQLiteTitanForceLegend7380) {
        this.PolarVoyageDiffUtilTurboStrike5735 = polarVoyageSQLiteTitanForceLegend7380;
        PolarVoyageLayoutTitaniumOlympian9962 polarVoyageLayoutTitaniumOlympian9962 = new PolarVoyageLayoutTitaniumOlympian9962(Looper.getMainLooper(), new PolarVoyageToastPhantomRogue2255(0, this));
        Looper.getMainLooper();
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = new Messenger(polarVoyageLayoutTitaniumOlympian9962);
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new ArrayDeque();
        this.PolarVoyageBitmapVisionAuroraPixel4705 = new SparseArray();
    }

    public final synchronized boolean PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageAnimatorHeroPrime4575 polarVoyageAnimatorHeroPrime4575) {
        PolarVoyageFCMShadowUltra8547 polarVoyageFCMShadowUltra8547;
        Throwable th;
        int i;
        try {
            try {
                i = this.PolarVoyageZipVortexCelestial6185;
                try {
                } catch (Throwable th2) {
                    th = th2;
                    polarVoyageFCMShadowUltra8547 = this;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            polarVoyageFCMShadowUltra8547 = this;
            th = th;
            throw th;
        }
        if (i != 0) {
            if (i == 1) {
                this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.add(polarVoyageAnimatorHeroPrime4575);
                return true;
            }
            int i2 = 0;
            if (i != 2) {
                return false;
            }
            this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.add(polarVoyageAnimatorHeroPrime4575);
            ((ScheduledExecutorService) this.PolarVoyageDiffUtilTurboStrike5735.PolarVoyageKotlinBetaPulseBeta3653).execute(new PolarVoyageOnAttachStateChangeListenerNebulaEclipse2024(this, i2));
            return true;
        }
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.add(polarVoyageAnimatorHeroPrime4575);
        try {
            if (this.PolarVoyageZipVortexCelestial6185 == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.PolarVoyageZipVortexCelestial6185 = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    PolarVoyageRealtimeDatabaseEclipseUltra8894 PolarVoyageViewRogueMaster4778 = PolarVoyageRealtimeDatabaseEclipseUltra8894.PolarVoyageViewRogueMaster4778();
                    try {
                        Context context = (Context) this.PolarVoyageDiffUtilTurboStrike5735.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        try {
                            polarVoyageFCMShadowUltra8547 = this;
                            try {
                                try {
                                    if (PolarVoyageViewRogueMaster4778.PolarVoyageLayerDrawableShadowTitaniumOmega1942(context, context.getClass().getName(), intent, polarVoyageFCMShadowUltra8547, 1, null)) {
                                        ((ScheduledExecutorService) polarVoyageFCMShadowUltra8547.PolarVoyageDiffUtilTurboStrike5735.PolarVoyageKotlinBetaPulseBeta3653).schedule(new PolarVoyageOnAttachStateChangeListenerNebulaEclipse2024(polarVoyageFCMShadowUltra8547, 1), 30L, TimeUnit.SECONDS);
                                    } else {
                                        polarVoyageFCMShadowUltra8547.PolarVoyageZipVortexCelestial6185("Unable to bind to service");
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } catch (SecurityException e) {
                                e = e;
                                polarVoyageFCMShadowUltra8547.PolarVoyageMotionLayoutTransitionHeroVision4068("Unable to bind to service", e);
                                return true;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            polarVoyageFCMShadowUltra8547 = this;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        polarVoyageFCMShadowUltra8547 = this;
                    }
                } catch (SecurityException e2) {
                    e = e2;
                    polarVoyageFCMShadowUltra8547 = this;
                }
                return true;
            }
            polarVoyageFCMShadowUltra8547 = this;
            try {
                throw new IllegalStateException();
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Throwable th9) {
            th = th9;
        }
        th = th;
        throw th;
    }

    public final synchronized void PolarVoyageKotlinBetaPulseBeta3653() {
        try {
            if (this.PolarVoyageZipVortexCelestial6185 == 2 && this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.isEmpty() && this.PolarVoyageBitmapVisionAuroraPixel4705.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.PolarVoyageZipVortexCelestial6185 = 3;
                PolarVoyageRealtimeDatabaseEclipseUltra8894.PolarVoyageViewRogueMaster4778().PolarVoyageBitmapMaxTitanTitan7960((Context) this.PolarVoyageDiffUtilTurboStrike5735.PolarVoyageMotionLayoutTransitionHeroVision4068, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void PolarVoyageMotionLayoutTransitionHeroVision4068(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i = this.PolarVoyageZipVortexCelestial6185;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.PolarVoyageZipVortexCelestial6185 = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.PolarVoyageZipVortexCelestial6185 = 4;
            PolarVoyageRealtimeDatabaseEclipseUltra8894.PolarVoyageViewRogueMaster4778().PolarVoyageBitmapMaxTitanTitan7960((Context) this.PolarVoyageDiffUtilTurboStrike5735.PolarVoyageMotionLayoutTransitionHeroVision4068, this);
            PolarVoyageBarcodeScannerOlympianNeoShadow6002 polarVoyageBarcodeScannerOlympianNeoShadow6002 = new PolarVoyageBarcodeScannerOlympianNeoShadow6002(str, securityException);
            Iterator it = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.iterator();
            while (it.hasNext()) {
                ((PolarVoyageAnimatorHeroPrime4575) it.next()).PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageBarcodeScannerOlympianNeoShadow6002);
            }
            this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.clear();
            int i2 = 0;
            while (true) {
                int size = this.PolarVoyageBitmapVisionAuroraPixel4705.size();
                SparseArray sparseArray = this.PolarVoyageBitmapVisionAuroraPixel4705;
                if (i2 >= size) {
                    sparseArray.clear();
                    return;
                } else {
                    ((PolarVoyageAnimatorHeroPrime4575) sparseArray.valueAt(i2)).PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageBarcodeScannerOlympianNeoShadow6002);
                    i2++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void PolarVoyageZipVortexCelestial6185(String str) {
        PolarVoyageMotionLayoutTransitionHeroVision4068(str, null);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.PolarVoyageDiffUtilTurboStrike5735.PolarVoyageKotlinBetaPulseBeta3653).execute(new PolarVoyageAnimationSetEclipseBlaze5194(0, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = 2;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.PolarVoyageDiffUtilTurboStrike5735.PolarVoyageKotlinBetaPulseBeta3653).execute(new PolarVoyageOnAttachStateChangeListenerNebulaEclipse2024(this, i));
    }
}
