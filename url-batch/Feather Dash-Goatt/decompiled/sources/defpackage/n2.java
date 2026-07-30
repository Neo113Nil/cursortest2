package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.webkit.WebView;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class n2 implements os {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.os
    public final void a() {
        Integer num;
        int i = this.a;
        Unit unit = null;
        Object obj = this.b;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                k2 k2Var = ((j2) obj).a;
                if (k2Var != null) {
                    rj rjVar = k2Var.v;
                    String str = k2Var.t;
                    Bundle bundle = rjVar.g;
                    HashMap hashMap = rjVar.f;
                    if (!rjVar.d.contains(str) && (num = (Integer) rjVar.b.remove(str)) != null) {
                        rjVar.a.remove(num);
                    }
                    rjVar.e.remove(str);
                    if (hashMap.containsKey(str)) {
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + hashMap.get(str));
                        hashMap.remove(str);
                    }
                    if (bundle.containsKey(str)) {
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + bundle.getParcelable(str));
                        bundle.remove(str);
                    }
                    if (rjVar.c.get(str) != null) {
                        af.c();
                        break;
                    } else {
                        unit = Unit.a;
                    }
                }
                if (unit == null) {
                    dd0.j("Launcher has not been initialized");
                    break;
                }
                break;
            case 1:
                ((ss) obj).e.invoke();
                break;
            case 2:
                Iterator it = ((qc) obj).b.iterator();
                while (it.hasNext()) {
                    ((rf) it.next()).cancel();
                }
                break;
            case 3:
                WindowInsetsController windowInsetsController = (WindowInsetsController) obj;
                if (windowInsetsController != null) {
                    windowInsetsController.show(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
                    break;
                }
                break;
            case 4:
                ((oe0) obj).d = null;
                break;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                bf0 bf0Var = (bf0) obj;
                nz nzVar = bf0Var.c;
                if (nzVar != null) {
                    nzVar.a = false;
                }
                bf0Var.c = null;
                break;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                ((we0) obj).f = true;
                break;
            default:
                ao0 ao0Var = (ao0) obj;
                WebView webView = (WebView) ao0Var.getValue();
                if (webView != null) {
                    webView.stopLoading();
                }
                WebView webView2 = (WebView) ao0Var.getValue();
                if (webView2 != null) {
                    webView2.destroy();
                }
                ao0Var.setValue(null);
                break;
        }
    }
}
