package defpackage;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fw2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public final /* synthetic */ Object TSizfFm2Yiuu;
    public final /* synthetic */ Intent lS5Rgt96tfkO;

    public /* synthetic */ fw2(Intent intent, Object obj, int i) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = intent;
        this.TSizfFm2Yiuu = obj;
    }

    public final void PxuCJdSBwIXG() {
        int i = this.PxuCJdSBwIXG;
        Object obj = this.TSizfFm2Yiuu;
        Intent intent = this.lS5Rgt96tfkO;
        switch (i) {
            case 0:
                if (intent != null) {
                    ((GoogleApiActivity) obj).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                if (intent != null) {
                    ((xw2) obj).startActivityForResult(intent, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                PxuCJdSBwIXG();
            } catch (ActivityNotFoundException e) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
