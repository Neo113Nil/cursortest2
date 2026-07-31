package i;

import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class U implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2178e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SearchView f2179f;

    public /* synthetic */ U(SearchView searchView, int i2) {
        this.f2178e = i2;
        this.f2179f = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2178e) {
            case 0:
                this.f2179f.q();
                break;
            default:
                D.c cVar = this.f2179f.f1286S;
                if (cVar instanceof f0) {
                    cVar.b(null);
                    break;
                }
                break;
        }
    }
}
