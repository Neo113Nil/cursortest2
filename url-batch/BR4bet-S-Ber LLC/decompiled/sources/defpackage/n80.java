package defpackage;

import android.graphics.Typeface;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class n80 extends b9 {
    public final /* synthetic */ b9 x;
    public final /* synthetic */ p80 y;

    public n80(p80 p80Var, b9 b9Var) {
        this.y = p80Var;
        this.x = b9Var;
    }

    @Override // defpackage.b9
    public final void A(Typeface typeface) {
        p80 p80Var = this.y;
        Typeface create = Typeface.create(typeface, p80Var.d);
        p80Var.p = create;
        p80Var.n = true;
        this.x.B(create, false);
    }

    @Override // defpackage.b9
    public final void z(int i) {
        this.y.n = true;
        this.x.z(i);
    }
}
