package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class b60 extends e20 {
    public boolean a = false;
    public final /* synthetic */ sz b;

    public b60(sz szVar) {
        this.b = szVar;
    }

    @Override // defpackage.e20
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.f();
        }
    }

    @Override // defpackage.e20
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.a = true;
    }
}
