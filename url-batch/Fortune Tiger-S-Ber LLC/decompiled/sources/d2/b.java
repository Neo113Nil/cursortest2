package d2;

import android.graphics.Typeface;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b extends b0.b {
    public final /* synthetic */ k3.d h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f1471i;

    public b(d dVar, k3.d dVar2) {
        this.f1471i = dVar;
        this.h = dVar2;
    }

    @Override // b0.b
    public final void g(int i4) {
        this.f1471i.f1484n = true;
        this.h.R(i4);
    }

    @Override // b0.b
    public final void h(Typeface typeface) {
        d dVar = this.f1471i;
        dVar.f1486p = Typeface.create(typeface, dVar.f1476d);
        dVar.f1484n = true;
        this.h.S(dVar.f1486p, false);
    }
}
