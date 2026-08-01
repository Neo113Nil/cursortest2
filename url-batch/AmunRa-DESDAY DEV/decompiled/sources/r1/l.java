package r1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends n1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f3562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3563f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x1.f f3564g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, o oVar, int i, x1.f fVar, int i2, boolean z2) {
        super(str, true);
        this.f3562e = oVar;
        this.f3563f = i;
        this.f3564g = fVar;
        this.h = i2;
    }

    @Override // n1.a
    public final long a() {
        try {
            A a2 = this.f3562e.f3579k;
            x1.f fVar = this.f3564g;
            int i = this.h;
            a2.getClass();
            fVar.o(i);
            this.f3562e.f3591w.m(this.f3563f, 9);
            synchronized (this.f3562e) {
                this.f3562e.f3593y.remove(Integer.valueOf(this.f3563f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
