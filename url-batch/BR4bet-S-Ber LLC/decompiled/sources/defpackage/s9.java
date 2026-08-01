package defpackage;

import android.graphics.Typeface;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class s9 extends b9 {
    public final Typeface x;
    public final rc0 y;
    public boolean z;

    public s9(rc0 rc0Var, Typeface typeface) {
        this.x = typeface;
        this.y = rc0Var;
    }

    @Override // defpackage.b9
    public final void B(Typeface typeface, boolean z) {
        if (this.z) {
            return;
        }
        vb vbVar = (vb) this.y.g;
        if (vbVar.l(typeface)) {
            vbVar.j(false);
        }
    }

    @Override // defpackage.b9
    public final void z(int i) {
        if (this.z) {
            return;
        }
        vb vbVar = (vb) this.y.g;
        if (vbVar.l(this.x)) {
            vbVar.j(false);
        }
    }
}
