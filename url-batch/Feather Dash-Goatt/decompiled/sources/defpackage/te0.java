package defpackage;

import android.webkit.WebView;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class te0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ao0 e;

    public /* synthetic */ te0(ao0 ao0Var, int i) {
        this.d = i;
        this.e = ao0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        ao0 ao0Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            case 1:
                break;
            case 2:
                ao0Var.setValue(null);
                break;
            default:
                WebView webView = (WebView) ao0Var.getValue();
                if (webView != null && webView.canGoBack()) {
                    webView.goBack();
                }
                break;
        }
        return Unit.a;
    }
}
