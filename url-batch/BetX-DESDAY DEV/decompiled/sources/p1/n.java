package p1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class n extends l1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f3814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3815f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f3816g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, o oVar, int i, long j2) {
        super(str, true);
        this.f3814e = oVar;
        this.f3815f = i;
        this.f3816g = j2;
    }

    @Override // l1.a
    public final long a() {
        o oVar = this.f3814e;
        try {
            oVar.f3838w.n(this.f3815f, this.f3816g);
            return -1L;
        } catch (IOException e2) {
            oVar.g(2, 2, e2);
            return -1L;
        }
    }
}
