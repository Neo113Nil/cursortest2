package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ct1 {
    public static final yw i = new yw(new zr1(2), new a60(14));
    public final Context a;
    public final String b;
    public final yw c;
    public final sg1 d;
    public final h8 e;
    public final int f;
    public final j41 g;
    public final g50 h;

    public ct1(Context context, sg1 sg1Var) {
        b50 b50Var = b50.b;
        y90.j(context, "Null context is not permitted.");
        yw ywVar = i;
        y90.j(ywVar, "Api must not be null.");
        y90.j(b50Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        y90.j(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        String attributionTag = context.getAttributionTag();
        this.b = attributionTag;
        this.c = ywVar;
        this.d = sg1Var;
        this.e = new h8(ywVar, sg1Var, attributionTag);
        g50 d = g50.d(applicationContext);
        this.h = d;
        this.f = d.h.getAndIncrement();
        this.g = b50Var.a;
        gt1 gt1Var = d.m;
        gt1Var.sendMessage(gt1Var.obtainMessage(7, this));
    }

    public final i8 a() {
        i8 i8Var = new i8(6, false);
        Set set = Collections.EMPTY_SET;
        if (((t9) i8Var.e) == null) {
            i8Var.e = new t9(0);
        }
        ((t9) i8Var.e).addAll(set);
        Context context = this.a;
        i8Var.h = context.getClass().getName();
        i8Var.g = context.getPackageName();
        return i8Var;
    }

    public final zu1 b(rg1 rg1Var) {
        nq0 nq0Var = new nq0(14, false);
        vx[] vxVarArr = {mo.r};
        nq0Var.e = new nq0(26, rg1Var);
        e30 e30Var = new e30(nq0Var, vxVarArr, false);
        ng1 ng1Var = new ng1();
        g50 g50Var = this.h;
        g50Var.getClass();
        os1 os1Var = new os1(new xs1(e30Var, ng1Var, this.g), g50Var.i.get(), this);
        gt1 gt1Var = g50Var.m;
        gt1Var.sendMessage(gt1Var.obtainMessage(4, os1Var));
        return ng1Var.a;
    }
}
