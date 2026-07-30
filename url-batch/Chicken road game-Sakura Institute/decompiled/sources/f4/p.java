package f4;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.chicken.road.whale.plate.PlatePageActivity;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PlatePageActivity f3341a;

    public p(PlatePageActivity platePageActivity) {
        this.f3341a = platePageActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        this.f3341a.finish();
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        r6.k.f(permissionRequest, "request");
        String[] resources = permissionRequest.getResources();
        r6.k.e(resources, "getResources(...)");
        if (e6.k.g0(resources, "android.webkit.resource.VIDEO_CAPTURE") < 0) {
            permissionRequest.deny();
            return;
        }
        m mVar = PlatePageActivity.Companion;
        PlatePageActivity platePageActivity = this.f3341a;
        if (a8.m.o(platePageActivity, "android.permission.CAMERA") == 0) {
            permissionRequest.grant(permissionRequest.getResources());
        } else {
            platePageActivity.J = permissionRequest;
            platePageActivity.L.u("android.permission.CAMERA");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Intent createIntent;
        if (fileChooserParams != null && (createIntent = fileChooserParams.createIntent()) != null) {
            PlatePageActivity platePageActivity = this.f3341a;
            ValueCallback valueCallback2 = platePageActivity.K;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(null);
            }
            platePageActivity.K = valueCallback;
            try {
                platePageActivity.M.u(createIntent);
                return true;
            } catch (ActivityNotFoundException unused) {
                platePageActivity.K = null;
            }
        }
        return false;
    }
}
