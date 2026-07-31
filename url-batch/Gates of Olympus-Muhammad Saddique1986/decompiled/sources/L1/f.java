package L1;

import android.widget.Toast;
import com.gatesof.olympus.martu.marku.R;
import com.gatesof.olympus.martu.marku.salon.SalonPageActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SalonPageActivity f3370e;

    public /* synthetic */ f(SalonPageActivity salonPageActivity, int i3) {
        this.f3369d = i3;
        this.f3370e = salonPageActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SalonPageActivity salonPageActivity = this.f3370e;
        switch (this.f3369d) {
            case 0:
                k kVar = SalonPageActivity.Companion;
                salonPageActivity.setRequestedOrientation(13);
                break;
            default:
                k kVar2 = SalonPageActivity.Companion;
                String string = salonPageActivity.getString(R.string.web_download_failed);
                f2.j.e(string, "getString(...)");
                Toast.makeText(salonPageActivity, string, 0).show();
                break;
        }
    }
}
