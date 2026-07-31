package D1;

import android.webkit.WebView;
import androidx.lifecycle.P;
import com.gates.olympus.miruv.tenon.TenonPageActivity;
import k2.AbstractC0552y;
import q1.C0775D;

/* loaded from: classes.dex */
public final class r extends b.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f568d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f569e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(TenonPageActivity tenonPageActivity) {
        super(true);
        this.f569e = tenonPageActivity;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [Y1.a, Z1.g] */
    @Override // b.w
    public final void b() {
        switch (this.f568d) {
            case 0:
                TenonPageActivity tenonPageActivity = (TenonPageActivity) this.f569e;
                if (tenonPageActivity.B) {
                    AbstractC0552y.q(P.h(tenonPageActivity), null, null, new o(tenonPageActivity, null), 3);
                    return;
                }
                WebView webView = tenonPageActivity.f4433z;
                if (webView == null) {
                    Z1.i.j("web");
                    throw null;
                }
                if (webView.canGoBack()) {
                    WebView webView2 = tenonPageActivity.f4433z;
                    if (webView2 != null) {
                        webView2.goBack();
                        return;
                    } else {
                        Z1.i.j("web");
                        throw null;
                    }
                }
                this.f4200a = false;
                ?? r12 = this.f4202c;
                if (r12 != 0) {
                    r12.b();
                }
                tenonPageActivity.finish();
                return;
            case 1:
                ((P0.b) this.f569e).j(this);
                return;
            default:
                ((C0775D) this.f569e).l();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C0775D c0775d) {
        super(false);
        this.f569e = c0775d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(boolean z3, P0.b bVar) {
        super(z3);
        this.f569e = bVar;
    }
}
