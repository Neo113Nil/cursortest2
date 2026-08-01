package z1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class n extends v1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f4462e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4463f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f4464g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, o oVar, int i, long j2) {
        super(str, true);
        this.f4462e = oVar;
        this.f4463f = i;
        this.f4464g = j2;
    }

    @Override // v1.a
    public final long a() {
        o oVar = this.f4462e;
        try {
            oVar.f4486w.n(this.f4463f, this.f4464g);
            return -1L;
        } catch (IOException e2) {
            oVar.g(2, 2, e2);
            return -1L;
        }
    }
}
