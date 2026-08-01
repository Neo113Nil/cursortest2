package defpackage;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class zv {
    public final aw a;
    public boolean b;
    public we c;
    public final uk d;
    public boolean e;

    public zv(uk ukVar, aw awVar) {
        ukVar.getClass();
        boolean z = ukVar.b;
        this.a = awVar;
        this.b = z;
        this.d = ukVar;
        this.e = true;
    }

    public final void a() {
        we weVar = this.c;
        if (weVar == null || !((LinkedHashSet) weVar.h).remove(this)) {
            return;
        }
        uu uuVar = (uu) weVar.g;
        uuVar.getClass();
        if (this == uuVar.f) {
            if (uuVar.g == -1) {
                this.d.getClass();
            }
            uuVar.f = null;
            uuVar.g = 0;
            uuVar.h = null;
        }
        uuVar.d.remove(this);
        uuVar.e.remove(this);
        this.c = null;
        uuVar.b();
    }

    public final void b(boolean z) {
        uu uuVar;
        this.e = z;
        boolean z2 = z && this.d.b;
        if (this.b == z2) {
            return;
        }
        this.b = z2;
        we weVar = this.c;
        if (weVar == null || (uuVar = (uu) weVar.g) == null) {
            return;
        }
        uuVar.b();
    }
}
