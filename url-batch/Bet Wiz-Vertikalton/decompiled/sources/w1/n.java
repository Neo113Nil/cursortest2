package w1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class n extends s1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f4119e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4120f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f4121g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, o oVar, int i, long j2) {
        super(str, true);
        this.f4119e = oVar;
        this.f4120f = i;
        this.f4121g = j2;
    }

    @Override // s1.a
    public final long a() {
        o oVar = this.f4119e;
        try {
            oVar.f4142w.n(this.f4120f, this.f4121g);
            return -1L;
        } catch (IOException e2) {
            oVar.g(2, 2, e2);
            return -1L;
        }
    }
}
