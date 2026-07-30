package f4;

import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.lifecycle.q0;
import com.android.installreferrer.api.InstallReferrerClient;
import com.chicken.road.whale.plate.PlatePageActivity;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlatePageActivity f3338b;

    public /* synthetic */ l(PlatePageActivity platePageActivity, int i7) {
        this.f3337a = i7;
        this.f3338b = platePageActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.f3337a;
        h6.d dVar = null;
        PlatePageActivity platePageActivity = this.f3338b;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                m mVar = PlatePageActivity.Companion;
                c7.a0.p(q0.h(platePageActivity), null, null, new c(platePageActivity, dVar, 1), 3);
                return;
            default:
                m mVar2 = PlatePageActivity.Companion;
                LinearLayout linearLayout = platePageActivity.G;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                platePageActivity.F = false;
                WebView webView = platePageActivity.B;
                if (webView == null) {
                    r6.k.j("web");
                    throw null;
                }
                String str = platePageActivity.E;
                if (str == null) {
                    str = platePageActivity.C;
                }
                webView.loadUrl(str);
                return;
        }
    }
}
