package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class bu extends gh0 {
    public final /* synthetic */ du e;
    public final /* synthetic */ int f;
    public final /* synthetic */ kn g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu(String str, du duVar, int i, kn knVar) {
        super(str, true);
        this.e = duVar;
        this.f = i;
        this.g = knVar;
    }

    @Override // defpackage.gh0
    public final long a() {
        du duVar = this.e;
        try {
            int i = this.f;
            kn knVar = this.g;
            knVar.getClass();
            duVar.B.P(i, knVar);
            return -1L;
        } catch (IOException e) {
            duVar.n(e);
            return -1L;
        }
    }
}
