package p1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class n extends l1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f3440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3441f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f3442g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, o oVar, int i, long j2) {
        super(str, true);
        this.f3440e = oVar;
        this.f3441f = i;
        this.f3442g = j2;
    }

    @Override // l1.a
    public final long a() {
        o oVar = this.f3440e;
        try {
            oVar.f3463w.l(this.f3441f, this.f3442g);
            return -1L;
        } catch (IOException e2) {
            oVar.e(2, 2, e2);
            return -1L;
        }
    }
}
