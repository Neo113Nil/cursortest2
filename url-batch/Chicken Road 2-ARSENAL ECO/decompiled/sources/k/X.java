package k;

import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class X implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4979f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SearchView f4980g;

    public /* synthetic */ X(SearchView searchView, int i7) {
        this.f4979f = i7;
        this.f4980g = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4979f) {
            case 0:
                this.f4980g.q();
                break;
            default:
                J.b bVar = this.f4980g.f3333T;
                if (bVar instanceof j0) {
                    bVar.b(null);
                    break;
                }
                break;
        }
    }
}
