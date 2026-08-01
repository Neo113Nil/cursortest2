package G1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class n extends C1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f404f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ M1.f f405g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, q qVar, int i, M1.f fVar, int i2, boolean z2) {
        super(str, true);
        this.f403e = qVar;
        this.f404f = i;
        this.f405g = fVar;
        this.h = i2;
    }

    @Override // C1.a
    public final long a() {
        try {
            C c2 = this.f403e.f420k;
            M1.f fVar = this.f405g;
            int i = this.h;
            c2.getClass();
            fVar.u(i);
            this.f403e.f432w.s(this.f404f, 9);
            synchronized (this.f403e) {
                this.f403e.f434y.remove(Integer.valueOf(this.f404f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
