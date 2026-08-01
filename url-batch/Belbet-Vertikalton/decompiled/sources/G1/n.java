package G1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class n extends C1.a {
    public final /* synthetic */ q e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f387f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ M1.f f388g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f389h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, q qVar, int i, M1.f fVar, int i2, boolean z2) {
        super(str, true);
        this.e = qVar;
        this.f387f = i;
        this.f388g = fVar;
        this.f389h = i2;
    }

    @Override // C1.a
    public final long a() {
        try {
            C c2 = this.e.f402k;
            M1.f fVar = this.f388g;
            int i = this.f389h;
            c2.getClass();
            fVar.G(i);
            this.e.f414w.E(this.f387f, 9);
            synchronized (this.e) {
                this.e.f416y.remove(Integer.valueOf(this.f387f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
