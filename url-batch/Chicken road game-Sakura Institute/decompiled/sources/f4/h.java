package f4;

import android.widget.Toast;
import com.android.installreferrer.R;
import com.android.installreferrer.api.InstallReferrerClient;
import com.chicken.road.whale.plate.PlatePageActivity;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3330f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ PlatePageActivity f3331g;

    public /* synthetic */ h(PlatePageActivity platePageActivity, int i7) {
        this.f3330f = i7;
        this.f3331g = platePageActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f3330f;
        PlatePageActivity platePageActivity = this.f3331g;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                m mVar = PlatePageActivity.Companion;
                platePageActivity.setRequestedOrientation(13);
                break;
            default:
                m mVar2 = PlatePageActivity.Companion;
                String string = platePageActivity.getString(R.string.web_download_failed);
                r6.k.e(string, "getString(...)");
                Toast.makeText(platePageActivity, string, 0).show();
                break;
        }
    }
}
