package p1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends l1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f3430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3431f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v1.f f3432g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, o oVar, int i, v1.f fVar, int i2, boolean z2) {
        super(str, true);
        this.f3430e = oVar;
        this.f3431f = i;
        this.f3432g = fVar;
        this.h = i2;
    }

    @Override // l1.a
    public final long a() {
        try {
            A a2 = this.f3430e.f3447k;
            v1.f fVar = this.f3432g;
            int i = this.h;
            a2.getClass();
            fVar.m(i);
            this.f3430e.f3459w.k(this.f3431f, 9);
            synchronized (this.f3430e) {
                this.f3430e.f3461y.remove(Integer.valueOf(this.f3431f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
