package p1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class n extends l1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f3441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3442f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f3443g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, o oVar, int i, long j2) {
        super(str, true);
        this.f3441e = oVar;
        this.f3442f = i;
        this.f3443g = j2;
    }

    @Override // l1.a
    public final long a() {
        o oVar = this.f3441e;
        try {
            oVar.f3464w.l(this.f3442f, this.f3443g);
            return -1L;
        } catch (IOException e2) {
            oVar.e(2, 2, e2);
            return -1L;
        }
    }
}
