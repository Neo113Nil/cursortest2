package t1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class n extends p1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f3871e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3872f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f3873g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, o oVar, int i, long j2) {
        super(str, true);
        this.f3871e = oVar;
        this.f3872f = i;
        this.f3873g = j2;
    }

    @Override // p1.a
    public final long a() {
        o oVar = this.f3871e;
        try {
            oVar.f3894w.n(this.f3872f, this.f3873g);
            return -1L;
        } catch (IOException e2) {
            oVar.g(2, 2, e2);
            return -1L;
        }
    }
}
