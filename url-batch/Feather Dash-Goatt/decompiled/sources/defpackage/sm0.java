package defpackage;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class sm0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ sm0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.j = obj5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                zr zrVar = (zr) obj6;
                z11 z11Var = (z11) obj5;
                w11 w11Var = (w11) obj4;
                d81 d81Var = (d81) obj3;
                v11 v11Var = (v11) obj2;
                float floatValue = ((Float) obj).floatValue();
                qm0 g = zr.g((we) zrVar.f);
                if (g != null) {
                    zrVar.h(g);
                    qm0 a = ((qm0) z11Var.d).a(g);
                    z11Var.d = a;
                    w11Var.d = d81Var.i(d81Var.e(a.a));
                    v11Var.d = !y90.b(r8 - floatValue);
                }
                return Boolean.valueOf(g != null);
            default:
                ao0 ao0Var = (ao0) obj6;
                ao0 ao0Var2 = (ao0) obj5;
                ao0 ao0Var3 = (ao0) obj4;
                ao0 ao0Var4 = (ao0) obj3;
                ao0 ao0Var5 = (ao0) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                frameLayout.getClass();
                View childAt = frameLayout.getChildAt(0);
                WebView webView = childAt instanceof WebView ? (WebView) childAt : null;
                if (webView != null && !StringsKt.n((String) ao0Var.getValue()) && !Intrinsics.a((String) ao0Var2.getValue(), (String) ao0Var.getValue())) {
                    ao0Var2.setValue((String) ao0Var.getValue());
                    if (!((Boolean) ao0Var3.getValue()).booleanValue()) {
                        m90.f(ao0Var4, true);
                    }
                    webView.loadUrl((String) ao0Var.getValue());
                }
                ao0Var5.setValue(webView);
                return Unit.a;
        }
    }
}
