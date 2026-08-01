package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class z20 extends bz {
    public boolean a = false;
    public final /* synthetic */ ow b;

    public z20(ow owVar) {
        this.b = owVar;
    }

    @Override // defpackage.bz
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.f();
        }
    }

    @Override // defpackage.bz
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.a = true;
    }
}
