package l;

import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class U implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9771a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f9772b;

    public /* synthetic */ U(SearchView searchView, int i3) {
        this.f9771a = i3;
        this.f9772b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9771a) {
            case 0:
                this.f9772b.q();
                break;
            default:
                I.b bVar = this.f9772b.f2064O;
                if (bVar instanceof f0) {
                    bVar.b(null);
                    break;
                }
                break;
        }
    }
}
