package defpackage;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class cz {
    public final dz a;
    public boolean b;
    public rg c;
    public final xm d;
    public boolean e;

    public cz(xm xmVar, dz dzVar) {
        xmVar.getClass();
        boolean z = xmVar.b;
        this.a = dzVar;
        this.b = z;
        this.d = xmVar;
        this.e = true;
    }

    public final void a() {
        rg rgVar = this.c;
        if (rgVar == null || !((LinkedHashSet) rgVar.h).remove(this)) {
            return;
        }
        wx wxVar = (wx) rgVar.g;
        wxVar.getClass();
        if (this == wxVar.f) {
            if (wxVar.g == -1) {
                this.d.getClass();
            }
            wxVar.f = null;
            wxVar.g = 0;
            wxVar.h = null;
        }
        wxVar.d.remove(this);
        wxVar.e.remove(this);
        this.c = null;
        wxVar.b();
    }

    public final void b(boolean z) {
        wx wxVar;
        this.e = z;
        boolean z2 = z && this.d.b;
        if (this.b == z2) {
            return;
        }
        this.b = z2;
        rg rgVar = this.c;
        if (rgVar == null || (wxVar = (wx) rgVar.g) == null) {
            return;
        }
        wxVar.b();
    }
}
