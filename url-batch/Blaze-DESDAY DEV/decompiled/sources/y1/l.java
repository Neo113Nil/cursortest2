package y1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends u1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f4257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4258f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ E1.f f4259g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, o oVar, int i, E1.f fVar, int i2, boolean z2) {
        super(str, true);
        this.f4257e = oVar;
        this.f4258f = i;
        this.f4259g = fVar;
        this.h = i2;
    }

    @Override // u1.a
    public final long a() {
        try {
            z zVar = this.f4257e.f4274k;
            E1.f fVar = this.f4259g;
            int i = this.h;
            zVar.getClass();
            fVar.o(i);
            this.f4257e.f4286w.m(this.f4258f, 9);
            synchronized (this.f4257e) {
                this.f4257e.f4288y.remove(Integer.valueOf(this.f4258f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
