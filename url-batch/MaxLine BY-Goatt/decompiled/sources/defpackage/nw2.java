package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nw2 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ ow2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nw2(ow2 ow2Var, int i) {
        super(1);
        this.m = i;
        this.n = ow2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012c  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ca0 ca0Var;
        bw2 bw2Var;
        int i = this.m;
        ow2 ow2Var = this.n;
        switch (i) {
            case 0:
                List list = (List) obj;
                dz1 G0 = ow2Var.G0();
                pw2 e = pw2.e(ow2Var.B, aw.g, 0L, null, 0L, 0, 0L, 16777214);
                u81 u81Var = G0.o;
                bw2 bw2Var2 = null;
                if (u81Var != null && (ca0Var = G0.i) != null) {
                    yd ydVar = new yd(6, G0.a, null);
                    if (G0.j != null && G0.n != null) {
                        long a = u10.a(G0.p, 0, 0, 0, 0, 10);
                        ah0 ah0Var = ah0.m;
                        int i2 = G0.f;
                        boolean z = G0.e;
                        int i3 = G0.d;
                        hp0 hp0Var = G0.c;
                        bw2Var = new bw2(new aw2(ydVar, e, ah0Var, i2, z, i3, ca0Var, u81Var, hp0Var, a), new sm1(new fy(ydVar, e, ah0Var, ca0Var, hp0Var), a, G0.f, G0.d == 2), G0.l);
                        if (bw2Var != null) {
                            list.add(bw2Var);
                            bw2Var2 = bw2Var;
                        }
                        break;
                    }
                }
                bw2Var = null;
                if (bw2Var != null) {
                }
                break;
            case 1:
                String str = ((yd) obj).n;
                mw2 mw2Var = ow2Var.K;
                if (mw2Var == null) {
                    mw2 mw2Var2 = new mw2(ow2Var.A, str);
                    dz1 dz1Var = new dz1(str, ow2Var.B, ow2Var.C, ow2Var.D, ow2Var.E, ow2Var.F, ow2Var.G);
                    dz1Var.d(ow2Var.G0().i);
                    mw2Var2.d = dz1Var;
                    ow2Var.K = mw2Var2;
                } else if (!Intrinsics.b(str, mw2Var.b)) {
                    mw2Var.b = str;
                    dz1 dz1Var2 = mw2Var.d;
                    if (dz1Var2 != null) {
                        pw2 pw2Var = ow2Var.B;
                        hp0 hp0Var2 = ow2Var.C;
                        int i4 = ow2Var.D;
                        boolean z2 = ow2Var.E;
                        int i5 = ow2Var.F;
                        int i6 = ow2Var.G;
                        dz1Var2.a = str;
                        dz1Var2.b = pw2Var;
                        dz1Var2.c = hp0Var2;
                        dz1Var2.d = i4;
                        dz1Var2.e = z2;
                        dz1Var2.f = i5;
                        dz1Var2.g = i6;
                        dz1Var2.c();
                        Unit unit = Unit.a;
                    }
                }
                yh2.l(ow2Var);
                zm3.C(ow2Var);
                z71.F(ow2Var);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                mw2 mw2Var3 = ow2Var.K;
                if (mw2Var3 != null) {
                    mw2Var3.c = booleanValue;
                    yh2.l(ow2Var);
                    zm3.C(ow2Var);
                    z71.F(ow2Var);
                    break;
                } else {
                    break;
                }
        }
        return Boolean.TRUE;
    }
}
