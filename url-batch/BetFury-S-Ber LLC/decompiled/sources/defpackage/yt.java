package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class yt extends gh0 {
    public final /* synthetic */ du e;
    public final /* synthetic */ int f;
    public final /* synthetic */ t9 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt(String str, du duVar, int i, t9 t9Var, int i2, boolean z) {
        super(str, true);
        this.e = duVar;
        this.f = i;
        this.g = t9Var;
        this.h = i2;
    }

    @Override // defpackage.gh0
    public final long a() {
        try {
            sl slVar = this.e.p;
            t9 t9Var = this.g;
            int i = this.h;
            slVar.getClass();
            t9Var.skip(i);
            this.e.B.P(this.f, kn.CANCEL);
            synchronized (this.e) {
                this.e.D.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
