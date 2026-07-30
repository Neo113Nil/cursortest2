package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class uy0 extends it2 {
    public final /* synthetic */ vy0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy0(String str, vy0 vy0Var, int i, long j) {
        super(str, true);
        this.e = vy0Var;
        this.f = i;
        this.g = j;
    }

    @Override // defpackage.it2
    public final long a() {
        vy0 vy0Var = this.e;
        try {
            vy0Var.I.s(this.g, this.f);
            return -1L;
        } catch (IOException e) {
            vy0Var.b(2, 2, e);
            return -1L;
        }
    }
}
