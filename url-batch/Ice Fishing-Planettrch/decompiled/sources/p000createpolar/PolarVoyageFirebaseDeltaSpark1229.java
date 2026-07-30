package p000createpolar;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageFirebaseDeltaSpark1229 {
    public static final /* synthetic */ int PolarVoyageZipVortexCelestial6185 = 0;
    private static volatile Choreographer choreographer;

    static {
        Object polarVoyageTraceThunderMaster6506;
        try {
            polarVoyageTraceThunderMaster6506 = new PolarVoyageButtonBetaFusion6638(PolarVoyageZipVortexCelestial6185(Looper.getMainLooper()));
        } catch (Throwable th) {
            polarVoyageTraceThunderMaster6506 = new PolarVoyageTraceThunderMaster6506(th);
        }
        if (polarVoyageTraceThunderMaster6506 instanceof PolarVoyageTraceThunderMaster6506) {
            polarVoyageTraceThunderMaster6506 = null;
        }
    }

    public static final Handler PolarVoyageZipVortexCelestial6185(Looper looper) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        invoke.getClass();
        return (Handler) invoke;
    }
}
