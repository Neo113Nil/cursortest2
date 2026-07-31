package D1;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.gates.olympus.miruv.tenon.TenonPageActivity;

/* loaded from: classes.dex */
public final class q extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TenonPageActivity f567a;

    public q(TenonPageActivity tenonPageActivity) {
        this.f567a = tenonPageActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        this.f567a.finish();
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        Z1.i.f(permissionRequest, "request");
        String[] resources = permissionRequest.getResources();
        Z1.i.e(resources, "getResources(...)");
        if (M1.k.g0(resources, "android.webkit.resource.VIDEO_CAPTURE") < 0) {
            permissionRequest.deny();
            return;
        }
        m mVar = TenonPageActivity.Companion;
        TenonPageActivity tenonPageActivity = this.f567a;
        tenonPageActivity.getClass();
        if (I2.d.s(tenonPageActivity, "android.permission.CAMERA") == 0) {
            permissionRequest.grant(permissionRequest.getResources());
        } else {
            tenonPageActivity.f4427H = permissionRequest;
            tenonPageActivity.f4429J.q("android.permission.CAMERA");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Intent createIntent;
        if (fileChooserParams == null || (createIntent = fileChooserParams.createIntent()) == null) {
            return false;
        }
        TenonPageActivity tenonPageActivity = this.f567a;
        ValueCallback valueCallback2 = tenonPageActivity.f4428I;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        tenonPageActivity.f4428I = valueCallback;
        try {
            tenonPageActivity.f4430K.q(createIntent);
            return true;
        } catch (ActivityNotFoundException unused) {
            tenonPageActivity.f4428I = null;
            return false;
        }
    }
}
