package U0;

import T0.T;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes.dex */
public final class m implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f2553b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2554c;

    public /* synthetic */ m(Intent intent, Object obj, int i7) {
        this.f2552a = i7;
        this.f2553b = intent;
        this.f2554c = obj;
    }

    public final void a() {
        switch (this.f2552a) {
            case 0:
                Intent intent = this.f2553b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f2554c).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                Intent intent2 = this.f2553b;
                if (intent2 != null) {
                    ((T) this.f2554c).startActivityForResult(intent2, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        try {
            a();
        } catch (ActivityNotFoundException e4) {
            Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e4);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
