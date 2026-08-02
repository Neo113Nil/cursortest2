package N0;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes.dex */
public final class l implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f1038b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1039c;

    public /* synthetic */ l(Intent intent, Object obj, int i3) {
        this.f1037a = i3;
        this.f1038b = intent;
        this.f1039c = obj;
    }

    public final void a() {
        switch (this.f1037a) {
            case 0:
                Intent intent = this.f1038b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f1039c).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                Intent intent2 = this.f1038b;
                if (intent2 != null) {
                    ((M0.y) this.f1039c).startActivityForResult(intent2, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i3) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e3) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e3);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
