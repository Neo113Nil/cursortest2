package L1;

import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.lifecycle.P;
import com.gatesof.olympus.martu.marku.salon.SalonPageActivity;
import q2.AbstractC0837y;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3377a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SalonPageActivity f3378b;

    public /* synthetic */ j(SalonPageActivity salonPageActivity, int i3) {
        this.f3377a = i3;
        this.f3378b = salonPageActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SalonPageActivity salonPageActivity = this.f3378b;
        switch (this.f3377a) {
            case 0:
                k kVar = SalonPageActivity.Companion;
                salonPageActivity.getClass();
                AbstractC0837y.r(P.h(salonPageActivity), null, null, new m(salonPageActivity, null), 3);
                return;
            default:
                k kVar2 = SalonPageActivity.Companion;
                LinearLayout linearLayout = salonPageActivity.f5629E;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                salonPageActivity.D = false;
                WebView webView = salonPageActivity.f5638z;
                if (webView == null) {
                    f2.j.j("web");
                    throw null;
                }
                String str = salonPageActivity.C;
                if (str == null) {
                    str = salonPageActivity.f5627A;
                }
                webView.loadUrl(str);
                return;
        }
    }
}
