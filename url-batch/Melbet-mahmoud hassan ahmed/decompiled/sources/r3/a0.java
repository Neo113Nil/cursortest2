package r3;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class a0 implements DialogInterface.OnClickListener {
    public static a0 b(Activity activity, Intent intent, int i7) {
        return new z(intent, activity, i7);
    }

    protected abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        try {
            a();
        } catch (ActivityNotFoundException e7) {
            Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e7);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
