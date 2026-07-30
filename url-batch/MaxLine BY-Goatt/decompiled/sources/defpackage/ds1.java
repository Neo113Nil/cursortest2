package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ds1 {
    public ul1 a;
    public int b;
    public eo1 c;
    public eo1 d;
    public boolean e;
    public final /* synthetic */ fs1 f;

    public ds1(fs1 fs1Var, ul1 ul1Var, int i, eo1 eo1Var, eo1 eo1Var2, boolean z) {
        this.f = fs1Var;
        this.a = ul1Var;
        this.b = i;
        this.c = eo1Var;
        this.d = eo1Var2;
        this.e = z;
    }

    public final boolean a(int i, int i2) {
        eo1 eo1Var = this.c;
        int i3 = this.b;
        tl1 tl1Var = (tl1) eo1Var.m[i + i3];
        tl1 tl1Var2 = (tl1) this.d.m[i3 + i2];
        return Intrinsics.b(tl1Var, tl1Var2) || tl1Var.getClass() == tl1Var2.getClass();
    }
}
