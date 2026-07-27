package B1;

import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.chicken.road.kedro.laqer.village.VillagePageActivity;
import e.C0550a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VillagePageActivity f1013b;

    public /* synthetic */ m(VillagePageActivity villagePageActivity, int i2) {
        this.f1012a = i2;
        this.f1013b = villagePageActivity;
    }

    public final void a(Object obj) {
        VillagePageActivity villagePageActivity = this.f1013b;
        switch (this.f1012a) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                PermissionRequest permissionRequest = villagePageActivity.f6018K;
                villagePageActivity.f6018K = null;
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
                C0550a result = (C0550a) obj;
                q qVar = VillagePageActivity.Companion;
                Intrinsics.checkNotNullParameter(result, "result");
                ValueCallback valueCallback = villagePageActivity.f6019L;
                villagePageActivity.f6019L = null;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(result.f6136d, result.f6137e));
                    break;
                }
                break;
        }
    }
}
