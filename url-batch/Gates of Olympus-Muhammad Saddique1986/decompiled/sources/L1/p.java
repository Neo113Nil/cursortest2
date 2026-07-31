package L1;

import R0.C0213b;
import android.webkit.WebView;
import androidx.lifecycle.P;
import b.AbstractC0327w;
import com.gatesof.olympus.martu.marku.salon.SalonPageActivity;
import q2.AbstractC0837y;
import t1.C1013A;
import t1.C1028h;

/* loaded from: classes.dex */
public final class p extends AbstractC0327w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3384d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3385e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(SalonPageActivity salonPageActivity) {
        super(true);
        this.f3385e = salonPageActivity;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [e2.a, f2.h] */
    @Override // b.AbstractC0327w
    public final void b() {
        switch (this.f3384d) {
            case 0:
                SalonPageActivity salonPageActivity = (SalonPageActivity) this.f3385e;
                if (salonPageActivity.f5628B) {
                    AbstractC0837y.r(P.h(salonPageActivity), null, null, new m(salonPageActivity, null), 3);
                    return;
                }
                WebView webView = salonPageActivity.f5638z;
                if (webView == null) {
                    f2.j.j("web");
                    throw null;
                }
                if (webView.canGoBack()) {
                    WebView webView2 = salonPageActivity.f5638z;
                    if (webView2 != null) {
                        webView2.goBack();
                        return;
                    } else {
                        f2.j.j("web");
                        throw null;
                    }
                }
                this.f5337a = false;
                ?? r12 = this.f5339c;
                if (r12 != 0) {
                    r12.b();
                }
                salonPageActivity.finish();
                return;
            case 1:
                ((C0213b) this.f3385e).n(this);
                return;
            default:
                C1013A c1013a = (C1013A) this.f3385e;
                if (c1013a.f8812g.isEmpty()) {
                    return;
                }
                C1028h c1028h = (C1028h) c1013a.f8812g.k();
                t1.u uVar = c1028h != null ? c1028h.f8874e : null;
                f2.j.c(uVar);
                if (c1013a.k(uVar.f8936i, true, false)) {
                    c1013a.b();
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(C1013A c1013a) {
        super(false);
        this.f3385e = c1013a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(boolean z3, C0213b c0213b) {
        super(z3);
        this.f3385e = c0213b;
    }
}
