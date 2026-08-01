package t1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends p1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f3865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3866f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z1.f f3867g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, o oVar, int i, z1.f fVar, int i2, boolean z2) {
        super(str, true);
        this.f3865e = oVar;
        this.f3866f = i;
        this.f3867g = fVar;
        this.h = i2;
    }

    @Override // p1.a
    public final long a() {
        try {
            A a2 = this.f3865e.f3882k;
            z1.f fVar = this.f3867g;
            int i = this.h;
            a2.getClass();
            fVar.o(i);
            this.f3865e.f3894w.m(this.f3866f, 9);
            synchronized (this.f3865e) {
                this.f3865e.f3896y.remove(Integer.valueOf(this.f3866f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
