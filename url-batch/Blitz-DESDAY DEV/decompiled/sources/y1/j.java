package y1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class j extends u1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f4224f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4225g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, o oVar, int i, int i2, int i3) {
        super(str, true);
        this.f4223e = i3;
        this.f4224f = oVar;
        this.f4225g = i;
        this.h = i2;
    }

    @Override // u1.a
    public final long a() {
        switch (this.f4223e) {
            case 0:
                int i = this.f4225g;
                int i2 = this.h;
                o oVar = this.f4224f;
                oVar.getClass();
                try {
                    oVar.f4257w.l(i, i2, true);
                    return -1L;
                } catch (IOException e2) {
                    oVar.g(2, 2, e2);
                    return -1L;
                }
            case 1:
                z zVar = this.f4224f.f4245k;
                int i3 = this.h;
                zVar.getClass();
                X0.a.h("errorCode", i3);
                synchronized (this.f4224f) {
                    this.f4224f.f4259y.remove(Integer.valueOf(this.f4225g));
                }
                return -1L;
            default:
                o oVar2 = this.f4224f;
                try {
                    int i4 = this.f4225g;
                    int i5 = this.h;
                    oVar2.getClass();
                    X0.a.h("statusCode", i5);
                    oVar2.f4257w.m(i4, i5);
                    return -1L;
                } catch (IOException e3) {
                    oVar2.g(2, 2, e3);
                    return -1L;
                }
        }
    }
}
