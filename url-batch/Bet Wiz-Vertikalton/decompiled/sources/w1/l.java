package w1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends s1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f4113e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4114f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1.f f4115g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, o oVar, int i, C1.f fVar, int i2, boolean z2) {
        super(str, true);
        this.f4113e = oVar;
        this.f4114f = i;
        this.f4115g = fVar;
        this.h = i2;
    }

    @Override // s1.a
    public final long a() {
        try {
            z zVar = this.f4113e.f4130k;
            C1.f fVar = this.f4115g;
            int i = this.h;
            zVar.getClass();
            fVar.o(i);
            this.f4113e.f4142w.m(this.f4114f, 9);
            synchronized (this.f4113e) {
                this.f4113e.f4144y.remove(Integer.valueOf(this.f4114f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
