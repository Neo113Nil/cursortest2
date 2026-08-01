package defpackage;

import android.app.Application;
import android.content.Context;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ry extends x2 {
    public final oy b;
    public final rx c;
    public final rx d;
    public String e;
    public String f;
    public u60 g;

    public ry(Application application) {
        application.getClass();
        ky kyVar = oy.f;
        oy oyVar = oy.g;
        if (oyVar == null) {
            synchronized (kyVar) {
                Context applicationContext = application.getApplicationContext();
                applicationContext.getClass();
                oyVar = new oy(applicationContext, "win_notes.db", null, 1);
                oy.g = oyVar;
            }
        }
        this.b = oyVar;
        rx rxVar = new rx();
        this.c = rxVar;
        this.d = rxVar;
        new rx(0);
        this.e = "";
        this.f = "All";
        d();
    }

    public final void d() {
        u60 u60Var = this.g;
        if (u60Var != null) {
            u60Var.a(new qr(u60Var.b(), null, u60Var));
        }
        tb E = kr.E(this);
        og ogVar = zh.a;
        this.g = mz.z(E, eg.h, new qy(this, null));
    }
}
