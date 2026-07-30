package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ry0 extends it2 {
    public final /* synthetic */ vy0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ fq g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry0(String str, vy0 vy0Var, int i, fq fqVar, int i2, boolean z) {
        super(str, true);
        this.e = vy0Var;
        this.f = i;
        this.g = fqVar;
        this.h = i2;
    }

    @Override // defpackage.it2
    public final long a() {
        try {
            by1 by1Var = this.e.w;
            fq fqVar = this.g;
            int i = this.h;
            by1Var.getClass();
            fqVar.skip(i);
            this.e.I.q(this.f, 9);
            synchronized (this.e) {
                this.e.K.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
