package defpackage;

import android.content.Context;
import android.net.Uri;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class jo1 extends WebChromeClient {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ao0 b;
    public final /* synthetic */ ao0 c;
    public final /* synthetic */ qj0 d;

    public jo1(Context context, ao0 ao0Var, ao0 ao0Var2, qj0 qj0Var) {
        this.a = context;
        this.b = ao0Var;
        this.c = ao0Var2;
        this.d = qj0Var;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        permissionRequest.getClass();
        String[] resources = permissionRequest.getResources();
        resources.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : resources) {
            if (Intrinsics.a(str, "android.webkit.resource.PROTECTED_MEDIA_ID")) {
                arrayList.add(str);
            }
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        if (strArr.length == 0) {
            permissionRequest.deny();
        } else {
            permissionRequest.grant(strArr);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Object j31Var;
        Object j31Var2;
        Context context = this.a;
        webView.getClass();
        valueCallback.getClass();
        fileChooserParams.getClass();
        ao0 ao0Var = this.b;
        ValueCallback valueCallback2 = (ValueCallback) ao0Var.getValue();
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        ao0Var.setValue(valueCallback);
        try {
            i31 i31Var = k31.d;
            File file = new File(context.getCacheDir(), "web_uploads");
            file.mkdirs();
            j31Var = FileProvider.d(context, context.getPackageName() + ".fileprovider", File.createTempFile("capture_", ".jpg", file));
        } catch (Throwable th) {
            i31 i31Var2 = k31.d;
            j31Var = new j31(th);
        }
        if (j31Var instanceof j31) {
            j31Var = null;
        }
        Uri uri = (Uri) j31Var;
        ao0 ao0Var2 = this.c;
        ao0Var2.setValue(uri);
        try {
            this.d.k0(m90.i(context, fileChooserParams, uri));
            j31Var2 = Boolean.TRUE;
        } catch (Throwable th2) {
            i31 i31Var3 = k31.d;
            j31Var2 = new j31(th2);
        }
        if (k31.a(j31Var2) != null) {
            ao0Var.setValue(null);
            ao0Var2.setValue(null);
            valueCallback.onReceiveValue(null);
            j31Var2 = Boolean.FALSE;
        }
        return ((Boolean) j31Var2).booleanValue();
    }
}
