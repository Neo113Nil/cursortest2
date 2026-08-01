package v1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends r1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f4085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4086f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ B1.f f4087g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, o oVar, int i, B1.f fVar, int i2, boolean z2) {
        super(str, true);
        this.f4085e = oVar;
        this.f4086f = i;
        this.f4087g = fVar;
        this.h = i2;
    }

    @Override // r1.a
    public final long a() {
        try {
            z zVar = this.f4085e.f4102k;
            B1.f fVar = this.f4087g;
            int i = this.h;
            zVar.getClass();
            fVar.o(i);
            this.f4085e.f4114w.m(this.f4086f, 9);
            synchronized (this.f4085e) {
                this.f4085e.f4116y.remove(Integer.valueOf(this.f4086f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
