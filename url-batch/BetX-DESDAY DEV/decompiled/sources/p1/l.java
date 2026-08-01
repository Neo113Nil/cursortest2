package p1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends l1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f3808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3809f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v1.f f3810g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, o oVar, int i, v1.f fVar, int i2, boolean z2) {
        super(str, true);
        this.f3808e = oVar;
        this.f3809f = i;
        this.f3810g = fVar;
        this.h = i2;
    }

    @Override // l1.a
    public final long a() {
        try {
            A a2 = this.f3808e.f3826k;
            v1.f fVar = this.f3810g;
            int i = this.h;
            a2.getClass();
            fVar.o(i);
            this.f3808e.f3838w.m(this.f3809f, 9);
            synchronized (this.f3808e) {
                this.f3808e.f3840y.remove(Integer.valueOf(this.f3809f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
