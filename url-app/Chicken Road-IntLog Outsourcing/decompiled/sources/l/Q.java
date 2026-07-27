package l;

import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class Q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10814a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f10815b;

    public /* synthetic */ Q(SearchView searchView, int i2) {
        this.f10814a = i2;
        this.f10815b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10814a) {
            case 0:
                this.f10815b.q();
                break;
            default:
                J.c cVar = this.f10815b.f4189V;
                if (cVar instanceof d0) {
                    cVar.b(null);
                    break;
                }
                break;
        }
    }
}
