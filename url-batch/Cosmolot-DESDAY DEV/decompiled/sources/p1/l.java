package p1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends l1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f3413e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3414f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v1.f f3415g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, o oVar, int i, v1.f fVar, int i2, boolean z2) {
        super(str, true);
        this.f3413e = oVar;
        this.f3414f = i;
        this.f3415g = fVar;
        this.h = i2;
    }

    @Override // l1.a
    public final long a() {
        try {
            A a2 = this.f3413e.f3430k;
            v1.f fVar = this.f3415g;
            int i = this.h;
            a2.getClass();
            fVar.m(i);
            this.f3413e.f3442w.k(this.f3414f, 9);
            synchronized (this.f3413e) {
                this.f3413e.f3444y.remove(Integer.valueOf(this.f3414f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
