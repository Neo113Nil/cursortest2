package B1;

import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.chicken.road.kedro.laqer.village.VillagePageActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VillagePageActivity f1019b;

    public /* synthetic */ p(VillagePageActivity villagePageActivity, int i2) {
        this.f1018a = i2;
        this.f1019b = villagePageActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VillagePageActivity villagePageActivity = this.f1019b;
        switch (this.f1018a) {
            case 0:
                q qVar = VillagePageActivity.Companion;
                villagePageActivity.l();
                return;
            default:
                q qVar2 = VillagePageActivity.Companion;
                LinearLayout linearLayout = villagePageActivity.f6015H;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                villagePageActivity.f6014G = false;
                WebView webView = villagePageActivity.f6010C;
                if (webView == null) {
                    Intrinsics.g("web");
                    throw null;
                }
                String str = villagePageActivity.f6013F;
                if (str == null) {
                    str = villagePageActivity.f6011D;
                }
                webView.loadUrl(str);
                return;
        }
    }
}
