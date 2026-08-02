package k;

import androidx.appcompat.widget.SearchView;

/* renamed from: k.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1194S implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13962a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f13963b;

    public /* synthetic */ RunnableC1194S(SearchView searchView, int i4) {
        this.f13962a = i4;
        this.f13963b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13962a) {
            case 0:
                this.f13963b.q();
                break;
            default:
                I.c cVar = this.f13963b.f4396O;
                if (cVar instanceof ViewOnClickListenerC1209d0) {
                    cVar.b(null);
                    break;
                }
                break;
        }
    }
}
