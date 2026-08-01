package p1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class j extends l1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3799e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f3800f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3801g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, o oVar, int i, int i2, int i3) {
        super(str, true);
        this.f3799e = i3;
        this.f3800f = oVar;
        this.f3801g = i;
        this.h = i2;
    }

    @Override // l1.a
    public final long a() {
        switch (this.f3799e) {
            case 0:
                int i = this.f3801g;
                int i2 = this.h;
                o oVar = this.f3800f;
                oVar.getClass();
                try {
                    oVar.f3834w.l(i, i2, true);
                    return -1L;
                } catch (IOException e2) {
                    oVar.g(2, 2, e2);
                    return -1L;
                }
            case 1:
                A a2 = this.f3800f.f3822k;
                int i3 = this.h;
                a2.getClass();
                X0.e.g("errorCode", i3);
                synchronized (this.f3800f) {
                    this.f3800f.f3836y.remove(Integer.valueOf(this.f3801g));
                }
                return -1L;
            default:
                o oVar2 = this.f3800f;
                try {
                    int i4 = this.f3801g;
                    int i5 = this.h;
                    oVar2.getClass();
                    X0.e.g("statusCode", i5);
                    oVar2.f3834w.m(i4, i5);
                    return -1L;
                } catch (IOException e3) {
                    oVar2.g(2, 2, e3);
                    return -1L;
                }
        }
    }
}
