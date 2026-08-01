package h0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class Y extends AbstractC0144J {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2975a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0172w f2976b;

    public Y(C0172w c0172w) {
        this.f2976b = c0172w;
    }

    @Override // h0.AbstractC0144J
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f2975a) {
            this.f2975a = false;
            this.f2976b.f();
        }
    }

    @Override // h0.AbstractC0144J
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f2975a = true;
    }
}
