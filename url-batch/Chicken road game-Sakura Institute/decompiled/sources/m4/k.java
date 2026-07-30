package m4;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6376a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f6377b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6378c;

    public /* synthetic */ k(Intent intent, Object obj, int i7) {
        this.f6376a = i7;
        this.f6377b = intent;
        this.f6378c = obj;
    }

    public final void a() {
        switch (this.f6376a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intent intent = this.f6377b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f6378c).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                Intent intent2 = this.f6377b;
                if (intent2 != null) {
                    ((l4.u) this.f6378c).startActivityForResult(intent2, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        try {
            a();
        } catch (ActivityNotFoundException e9) {
            Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e9);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
