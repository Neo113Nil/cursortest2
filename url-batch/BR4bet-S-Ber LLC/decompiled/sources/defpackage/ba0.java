package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ba0 extends aa0 {
    public final /* synthetic */ x6 a;
    public final /* synthetic */ ca0 b;

    public ba0(ca0 ca0Var, x6 x6Var) {
        this.b = ca0Var;
        this.a = x6Var;
    }

    @Override // defpackage.x90
    public final void d(z90 z90Var) {
        ((ArrayList) this.a.get(this.b.g)).remove(z90Var);
        z90Var.x(this);
    }
}
