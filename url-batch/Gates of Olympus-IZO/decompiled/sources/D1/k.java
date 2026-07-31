package D1;

import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.lifecycle.P;
import com.gates.olympus.miruv.tenon.TenonPageActivity;
import k2.AbstractC0552y;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TenonPageActivity f561b;

    public /* synthetic */ k(TenonPageActivity tenonPageActivity, int i3) {
        this.f560a = i3;
        this.f561b = tenonPageActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TenonPageActivity tenonPageActivity = this.f561b;
        switch (this.f560a) {
            case 0:
                m mVar = TenonPageActivity.Companion;
                tenonPageActivity.getClass();
                AbstractC0552y.q(P.h(tenonPageActivity), null, null, new o(tenonPageActivity, null), 3);
                return;
            default:
                m mVar2 = TenonPageActivity.Companion;
                LinearLayout linearLayout = tenonPageActivity.f4424E;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                tenonPageActivity.D = false;
                WebView webView = tenonPageActivity.f4433z;
                if (webView == null) {
                    Z1.i.j("web");
                    throw null;
                }
                String str = tenonPageActivity.C;
                if (str == null) {
                    str = tenonPageActivity.f4423A;
                }
                webView.loadUrl(str);
                return;
        }
    }
}
