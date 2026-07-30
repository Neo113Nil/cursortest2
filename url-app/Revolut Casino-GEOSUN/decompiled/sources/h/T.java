package h;

import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2147e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SearchView f2148f;

    public /* synthetic */ T(SearchView searchView, int i2) {
        this.f2147e = i2;
        this.f2148f = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2147e) {
            case 0:
                this.f2148f.q();
                break;
            default:
                B.c cVar = this.f2148f.f1197S;
                if (cVar instanceof f0) {
                    cVar.b(null);
                    break;
                }
                break;
        }
    }
}
