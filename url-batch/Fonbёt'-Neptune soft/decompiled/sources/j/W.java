package j;

import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class W implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2923e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SearchView f2924f;

    public /* synthetic */ W(SearchView searchView, int i2) {
        this.f2923e = i2;
        this.f2924f = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2923e) {
            case 0:
                this.f2924f.q();
                break;
            default:
                G.c cVar = this.f2924f.f1445S;
                if (cVar instanceof h0) {
                    cVar.b(null);
                    break;
                }
                break;
        }
    }
}
