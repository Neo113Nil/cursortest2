package p000createpolar;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageAnimatedVectorDrawableInfernoNeo1500 extends DialogFragment {
    public Dialog PolarVoyageItemDecorationUltraDeltaEpic7485;
    public AlertDialog PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public DialogInterface.OnCancelListener PolarVoyageStrictModeLegendEpic1532;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.PolarVoyageStrictModeLegendEpic1532;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768 == null) {
            Activity activity = getActivity();
            PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageDisplayMetricsVortexDragon9516(activity);
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new AlertDialog.Builder(activity).create();
        }
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }
}
