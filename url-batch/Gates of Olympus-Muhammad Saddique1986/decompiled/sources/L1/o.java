package L1;

import a.AbstractC0235a;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.gatesof.olympus.martu.marku.salon.SalonPageActivity;

/* loaded from: classes.dex */
public final class o extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SalonPageActivity f3383a;

    public o(SalonPageActivity salonPageActivity) {
        this.f3383a = salonPageActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        this.f3383a.finish();
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        f2.j.f(permissionRequest, "request");
        String[] resources = permissionRequest.getResources();
        f2.j.e(resources, "getResources(...)");
        if (S1.k.u0(resources, "android.webkit.resource.VIDEO_CAPTURE") < 0) {
            permissionRequest.deny();
            return;
        }
        k kVar = SalonPageActivity.Companion;
        SalonPageActivity salonPageActivity = this.f3383a;
        salonPageActivity.getClass();
        if (AbstractC0235a.o(salonPageActivity, "android.permission.CAMERA") == 0) {
            permissionRequest.grant(permissionRequest.getResources());
        } else {
            salonPageActivity.f5632H = permissionRequest;
            salonPageActivity.f5634J.r("android.permission.CAMERA");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Intent createIntent;
        if (fileChooserParams == null || (createIntent = fileChooserParams.createIntent()) == null) {
            return false;
        }
        SalonPageActivity salonPageActivity = this.f3383a;
        ValueCallback valueCallback2 = salonPageActivity.f5633I;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        salonPageActivity.f5633I = valueCallback;
        try {
            salonPageActivity.f5635K.r(createIntent);
            return true;
        } catch (ActivityNotFoundException unused) {
            salonPageActivity.f5633I = null;
            return false;
        }
    }
}
