package t1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends p1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f3783e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3784f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z1.f f3785g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, o oVar, int i, z1.f fVar, int i2, boolean z2) {
        super(str, true);
        this.f3783e = oVar;
        this.f3784f = i;
        this.f3785g = fVar;
        this.h = i2;
    }

    @Override // p1.a
    public final long a() {
        try {
            A a2 = this.f3783e.f3800k;
            z1.f fVar = this.f3785g;
            int i = this.h;
            a2.getClass();
            fVar.o(i);
            this.f3783e.f3812w.m(this.f3784f, 9);
            synchronized (this.f3783e) {
                this.f3783e.f3814y.remove(Integer.valueOf(this.f3784f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
