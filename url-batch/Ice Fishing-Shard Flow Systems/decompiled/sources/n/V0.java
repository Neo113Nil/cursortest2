package n;

import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class V0 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SearchView f6721e;

    public /* synthetic */ V0(SearchView searchView, int i2) {
        this.f6720d = i2;
        this.f6721e = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6720d) {
            case 0:
                this.f6721e.r();
                break;
            default:
                M.c cVar = this.f6721e.f3241W;
                if (cVar instanceof f1) {
                    cVar.b(null);
                    break;
                }
                break;
        }
    }
}
