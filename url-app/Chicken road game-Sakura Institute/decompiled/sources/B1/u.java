package B1;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.chicken.road.kedro.laqer.village.VillagePageActivity;
import kotlin.jvm.internal.Intrinsics;
import z2.C1439w;

/* loaded from: classes.dex */
public final class u extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VillagePageActivity f1024a;

    public u(VillagePageActivity villagePageActivity) {
        this.f1024a = villagePageActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        this.f1024a.finish();
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        String[] resources = request.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        if (!C1439w.r(resources, "android.webkit.resource.VIDEO_CAPTURE")) {
            request.deny();
            return;
        }
        q qVar = VillagePageActivity.Companion;
        VillagePageActivity villagePageActivity = this.f1024a;
        villagePageActivity.getClass();
        if (u3.l.S(villagePageActivity, "android.permission.CAMERA") == 0) {
            request.grant(request.getResources());
        } else {
            villagePageActivity.f6018K = request;
            villagePageActivity.f6020M.x("android.permission.CAMERA");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Intent createIntent;
        if (fileChooserParams == null || (createIntent = fileChooserParams.createIntent()) == null) {
            return false;
        }
        VillagePageActivity villagePageActivity = this.f1024a;
        ValueCallback valueCallback2 = villagePageActivity.f6019L;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        villagePageActivity.f6019L = valueCallback;
        try {
            villagePageActivity.f6021N.x(createIntent);
            return true;
        } catch (ActivityNotFoundException unused) {
            villagePageActivity.f6019L = null;
            return false;
        }
    }
}
