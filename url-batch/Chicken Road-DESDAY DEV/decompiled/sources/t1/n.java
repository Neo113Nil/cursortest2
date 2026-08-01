package t1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class n extends p1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f3789e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3790f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f3791g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, o oVar, int i, long j2) {
        super(str, true);
        this.f3789e = oVar;
        this.f3790f = i;
        this.f3791g = j2;
    }

    @Override // p1.a
    public final long a() {
        o oVar = this.f3789e;
        try {
            oVar.f3812w.n(this.f3790f, this.f3791g);
            return -1L;
        } catch (IOException e2) {
            oVar.g(2, 2, e2);
            return -1L;
        }
    }
}
