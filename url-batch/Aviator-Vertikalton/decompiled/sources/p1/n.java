package p1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class n extends l1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f3810e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3811f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f3812g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, o oVar, int i, long j2) {
        super(str, true);
        this.f3810e = oVar;
        this.f3811f = i;
        this.f3812g = j2;
    }

    @Override // l1.a
    public final long a() {
        o oVar = this.f3810e;
        try {
            oVar.f3834w.n(this.f3811f, this.f3812g);
            return -1L;
        } catch (IOException e2) {
            oVar.g(2, 2, e2);
            return -1L;
        }
    }
}
