package B1;

import android.widget.Toast;
import com.chicken.road.kedro.laqer.R;
import com.chicken.road.kedro.laqer.village.VillagePageActivity;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: B1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0105l implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ VillagePageActivity f1011e;

    public /* synthetic */ RunnableC0105l(VillagePageActivity villagePageActivity, int i2) {
        this.f1010d = i2;
        this.f1011e = villagePageActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VillagePageActivity villagePageActivity = this.f1011e;
        switch (this.f1010d) {
            case 0:
                q qVar = VillagePageActivity.Companion;
                villagePageActivity.setRequestedOrientation(13);
                break;
            default:
                q qVar2 = VillagePageActivity.Companion;
                String string = villagePageActivity.getString(R.string.web_download_failed);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                Toast.makeText(villagePageActivity, string, 0).show();
                break;
        }
    }
}
