package defpackage;

import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class cc0 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ SearchView g;

    public /* synthetic */ cc0(SearchView searchView, int i) {
        this.f = i;
        this.g = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        SearchView searchView = this.g;
        switch (i) {
            case 0:
                searchView.s();
                break;
            default:
                kh khVar = searchView.U;
                if (khVar instanceof yf0) {
                    khVar.b(null);
                    break;
                }
                break;
        }
    }
}
