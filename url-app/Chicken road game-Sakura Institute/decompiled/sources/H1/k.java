package H1;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes.dex */
public final class k implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f3275b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3276c;

    public /* synthetic */ k(Intent intent, Object obj, int i2) {
        this.f3274a = i2;
        this.f3275b = intent;
        this.f3276c = obj;
    }

    public final void a() {
        switch (this.f3274a) {
            case 0:
                Intent intent = this.f3275b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f3276c).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                Intent intent2 = this.f3275b;
                if (intent2 != null) {
                    ((G1.z) this.f3276c).startActivityForResult(intent2, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        try {
            a();
        } catch (ActivityNotFoundException e4) {
            Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e4);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
