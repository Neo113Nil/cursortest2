package p000createpolar;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageMapPixelBlazeOmega4432 extends PolarVoyageAdMobTurboOmegaLegend7735 implements PolarVoyageButtonSpeedElite2479 {
    private volatile Object _preHandler;

    public PolarVoyageMapPixelBlazeOmega4432() {
        super(PolarVoyageOnLongClickListenerOlympianPhantomAlpha1069.PolarVoyageBottomSheetOmegaNeo1907);
        this._preHandler = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        if (java.lang.reflect.Modifier.isStatic(r3.getModifiers()) != false) goto L15;
     */
    @Override // p000createpolar.PolarVoyageButtonSpeedElite2479
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PolarVoyageCameraViewSpectraMaxSpectra2824(PolarVoyageEventNebulaCelestialOlympian6822 polarVoyageEventNebulaCelestialOlympian6822, Throwable th) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (26 > i || i >= 28) {
            return;
        }
        Object obj = this._preHandler;
        if (obj != this) {
            method = (Method) obj;
        } else {
            try {
                method = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
                if (Modifier.isPublic(method.getModifiers())) {
                }
            } catch (Throwable unused) {
            }
            method = null;
            this._preHandler = method;
        }
        Object invoke = method != null ? method.invoke(null, null) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
