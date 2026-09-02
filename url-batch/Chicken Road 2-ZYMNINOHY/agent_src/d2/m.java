package d2;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes.dex */
public final class m implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f8280b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8281c;

    public /* synthetic */ m(Intent intent, Object obj, int i4) {
        this.f8279a = i4;
        this.f8280b = intent;
        this.f8281c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [c2.e, java.lang.Object] */
    public final void a() {
        switch (this.f8279a) {
            case 0:
                Intent intent = this.f8280b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f8281c).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                Intent intent2 = this.f8280b;
                if (intent2 != null) {
                    this.f8281c.b(intent2, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e4) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e4);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
