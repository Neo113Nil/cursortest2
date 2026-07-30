package p000createpolar;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.polarvoyage.glacialoceans.icepathfinder.quest.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageGradientDrawableStormTitan5979 extends Activity implements PolarVoyageTranslateAnimationMegaCyber7300 {
    public final PolarVoyageGradientDrawableNeoVisionSpeed1253 PolarVoyageItemDecorationUltraDeltaEpic7485 = new PolarVoyageGradientDrawableNeoVisionSpeed1253(this, true);

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object invoke;
        boolean booleanValue;
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageViewRogueMaster4778(decorView, keyEvent)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return super.dispatchKeyEvent(keyEvent);
        }
        onUserInteraction();
        Window window = getWindow();
        boolean z = false;
        if (window.hasFeature(8)) {
            ActionBar actionBar = getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                if (!PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageDrawableDeltaHyperion5742) {
                    try {
                        PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageSnackbarGammaEclipse2140 = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageDrawableDeltaHyperion5742 = true;
                }
                Method method = PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageSnackbarGammaEclipse2140;
                if (method != null) {
                    try {
                        invoke = method.invoke(actionBar, keyEvent);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                    if (invoke != null) {
                        booleanValue = ((Boolean) invoke).booleanValue();
                        if (booleanValue) {
                            return true;
                        }
                    }
                }
                booleanValue = false;
                if (booleanValue) {
                }
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window.getDecorView();
        int i = PolarVoyageLayoutInflaterTitaniumStrike4588.PolarVoyageZipVortexCelestial6185;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = PolarVoyageAlertDialogMegaCyberTurbo5558.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            PolarVoyageAlertDialogMegaCyberTurbo5558 polarVoyageAlertDialogMegaCyberTurbo5558 = (PolarVoyageAlertDialogMegaCyberTurbo5558) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            if (polarVoyageAlertDialogMegaCyberTurbo5558 == null) {
                polarVoyageAlertDialogMegaCyberTurbo5558 = new PolarVoyageAlertDialogMegaCyberTurbo5558();
                polarVoyageAlertDialogMegaCyberTurbo5558.PolarVoyageZipVortexCelestial6185 = null;
                polarVoyageAlertDialogMegaCyberTurbo5558.PolarVoyageMotionLayoutTransitionHeroVision4068 = null;
                polarVoyageAlertDialogMegaCyberTurbo5558.PolarVoyageKotlinBetaPulseBeta3653 = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, polarVoyageAlertDialogMegaCyberTurbo5558);
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = polarVoyageAlertDialogMegaCyberTurbo5558.PolarVoyageZipVortexCelestial6185;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = PolarVoyageAlertDialogMegaCyberTurbo5558.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (polarVoyageAlertDialogMegaCyberTurbo5558.PolarVoyageZipVortexCelestial6185 == null) {
                                polarVoyageAlertDialogMegaCyberTurbo5558.PolarVoyageZipVortexCelestial6185 = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = PolarVoyageAlertDialogMegaCyberTurbo5558.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    polarVoyageAlertDialogMegaCyberTurbo5558.PolarVoyageZipVortexCelestial6185.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        polarVoyageAlertDialogMegaCyberTurbo5558.PolarVoyageZipVortexCelestial6185.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View PolarVoyageZipVortexCelestial6185 = polarVoyageAlertDialogMegaCyberTurbo5558.PolarVoyageZipVortexCelestial6185(decorView2);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (PolarVoyageZipVortexCelestial6185 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (polarVoyageAlertDialogMegaCyberTurbo5558.PolarVoyageMotionLayoutTransitionHeroVision4068 == null) {
                        polarVoyageAlertDialogMegaCyberTurbo5558.PolarVoyageMotionLayoutTransitionHeroVision4068 = new SparseArray();
                    }
                    polarVoyageAlertDialogMegaCyberTurbo5558.PolarVoyageMotionLayoutTransitionHeroVision4068.put(keyCode, new WeakReference(PolarVoyageZipVortexCelestial6185));
                }
            }
            if (PolarVoyageZipVortexCelestial6185 != null) {
                z = true;
            }
        }
        if (z) {
            return true;
        }
        return keyEvent.dispatch(this, decorView2 != null ? decorView2.getKeyDispatcherState() : null, this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageViewRogueMaster4778(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = PolarVoyageDrawableMasterTitanQuantum4990.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageTextInputLayoutSparkNova7677.PolarVoyageMotionLayoutTransitionHeroVision4068(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        PolarVoyageGradientDrawableNeoVisionSpeed1253 polarVoyageGradientDrawableNeoVisionSpeed1253 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        polarVoyageGradientDrawableNeoVisionSpeed1253.getClass();
        polarVoyageGradientDrawableNeoVisionSpeed1253.PolarVoyageKotlinBetaPulseBeta3653("setCurrentState");
        polarVoyageGradientDrawableNeoVisionSpeed1253.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageNotificationManagerBetaTitaniumCelestial6531.PolarVoyageRotateAnimationCyberCelestialDelta4768);
        super.onSaveInstanceState(bundle);
    }
}
