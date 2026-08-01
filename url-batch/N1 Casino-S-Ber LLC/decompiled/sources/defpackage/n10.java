package defpackage;

import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class n10 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ SearchView g;

    public /* synthetic */ n10(SearchView searchView, int i) {
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
                yd ydVar = searchView.U;
                if (ydVar instanceof o40) {
                    ydVar.b(null);
                    break;
                }
                break;
        }
    }
}
