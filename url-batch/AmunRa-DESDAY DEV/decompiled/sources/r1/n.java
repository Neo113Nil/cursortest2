package r1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class n extends n1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f3568e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3569f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f3570g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, o oVar, int i, long j2) {
        super(str, true);
        this.f3568e = oVar;
        this.f3569f = i;
        this.f3570g = j2;
    }

    @Override // n1.a
    public final long a() {
        o oVar = this.f3568e;
        try {
            oVar.f3591w.n(this.f3569f, this.f3570g);
            return -1L;
        } catch (IOException e2) {
            oVar.f(2, 2, e2);
            return -1L;
        }
    }
}
