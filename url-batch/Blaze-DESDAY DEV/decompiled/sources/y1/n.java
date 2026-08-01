package y1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class n extends u1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f4263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4264f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f4265g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, o oVar, int i, long j2) {
        super(str, true);
        this.f4263e = oVar;
        this.f4264f = i;
        this.f4265g = j2;
    }

    @Override // u1.a
    public final long a() {
        o oVar = this.f4263e;
        try {
            oVar.f4286w.n(this.f4264f, this.f4265g);
            return -1L;
        } catch (IOException e2) {
            oVar.g(2, 2, e2);
            return -1L;
        }
    }
}
