package f4;

import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.android.installreferrer.api.InstallReferrerClient;
import com.chicken.road.whale.plate.PlatePageActivity;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlatePageActivity f3335b;

    public /* synthetic */ j(PlatePageActivity platePageActivity, int i7) {
        this.f3334a = i7;
        this.f3335b = platePageActivity;
    }

    public final void a(Object obj) {
        int i7 = this.f3334a;
        PlatePageActivity platePageActivity = this.f3335b;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                PermissionRequest permissionRequest = platePageActivity.J;
                platePageActivity.J = null;
                if (permissionRequest != null) {
                    if (!booleanValue) {
                        permissionRequest.deny();
                        break;
                    } else {
                        permissionRequest.grant(permissionRequest.getResources());
                        break;
                    }
                }
                break;
            default:
                e.a aVar = (e.a) obj;
                m mVar = PlatePageActivity.Companion;
                r6.k.f(aVar, "result");
                ValueCallback valueCallback = platePageActivity.K;
                platePageActivity.K = null;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(aVar.f2650f, aVar.f2651g));
                    break;
                }
                break;
        }
    }
}
