package androidx.compose.ui.layout;

import defpackage.a31;
import defpackage.k83;
import defpackage.l83;
import defpackage.m83;
import defpackage.ng1;
import defpackage.nk2;
import defpackage.o21;
import defpackage.vl1;
import defpackage.zm1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class b {
    public static final zm1 a;
    public static final l83[] b;
    public static final zm1 c;

    static {
        zm1 zm1Var = new zm1(8);
        l83.a.getClass();
        m83 m83Var = k83.g;
        zm1Var.h(1, m83Var);
        m83 m83Var2 = k83.f;
        zm1Var.h(2, m83Var2);
        m83 m83Var3 = k83.b;
        zm1Var.h(4, m83Var3);
        m83 m83Var4 = k83.d;
        zm1Var.h(8, m83Var4);
        m83 m83Var5 = k83.h;
        zm1Var.h(16, m83Var5);
        m83 m83Var6 = k83.e;
        zm1Var.h(32, m83Var6);
        m83 m83Var7 = k83.i;
        zm1Var.h(64, m83Var7);
        a = zm1Var;
        b = new l83[]{m83Var, m83Var2, m83Var3, m83Var7, m83Var5, m83Var6, m83Var4, k83.j, k83.c};
        zm1 zm1Var2 = new zm1(7);
        zm1Var2.h(1, m83Var);
        zm1Var2.h(2, m83Var2);
        zm1Var2.h(4, m83Var3);
        zm1Var2.h(16, m83Var5);
        zm1Var2.h(64, m83Var7);
        zm1Var2.h(32, m83Var6);
        zm1Var2.h(8, m83Var4);
        c = zm1Var2;
    }

    public static final void a(ng1 ng1Var, o21 o21Var, long j, int i, int i2) {
        if (nk2.h(j, -1L)) {
            return;
        }
        ng1Var.a(o21Var.b(), (int) ((j >>> 48) & 65535));
        ng1Var.a(o21Var.d(), (int) ((j >>> 32) & 65535));
        ng1Var.a(o21Var.c(), i - ((int) ((j >>> 16) & 65535)));
        ng1Var.a(o21Var.a(), i2 - ((int) (j & 65535)));
    }

    public static final vl1 b(a31 a31Var) {
        return new RulerProviderModifierElement(a31Var);
    }
}
