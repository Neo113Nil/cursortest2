package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class q80 extends ry1 {
    public static final tt1 H = iv1.L(sc.C, o3.L);
    public final lz1 G;

    public q80(int i, float f, Function0 function0) {
        super(i, f);
        this.G = ij2.j(function0);
    }

    @Override // defpackage.ry1
    public final int m() {
        return ((Number) ((Function0) this.G.getValue()).invoke()).intValue();
    }
}
