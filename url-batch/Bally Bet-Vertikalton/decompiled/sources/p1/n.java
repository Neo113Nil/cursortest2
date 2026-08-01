package p1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class n extends l1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f3424e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3425f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f3426g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, o oVar, int i, long j2) {
        super(str, true);
        this.f3424e = oVar;
        this.f3425f = i;
        this.f3426g = j2;
    }

    @Override // l1.a
    public final long a() {
        o oVar = this.f3424e;
        try {
            oVar.f3447w.l(this.f3425f, this.f3426g);
            return -1L;
        } catch (IOException e2) {
            oVar.e(2, 2, e2);
            return -1L;
        }
    }
}
