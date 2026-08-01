package v1;

import Y.V;
import java.io.IOException;

/* loaded from: classes.dex */
public final class j extends r1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f4081f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4082g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, o oVar, int i, int i2, int i3) {
        super(str, true);
        this.f4080e = i3;
        this.f4081f = oVar;
        this.f4082g = i;
        this.h = i2;
    }

    @Override // r1.a
    public final long a() {
        switch (this.f4080e) {
            case 0:
                int i = this.f4082g;
                int i2 = this.h;
                o oVar = this.f4081f;
                oVar.getClass();
                try {
                    oVar.f4114w.l(i, i2, true);
                    return -1L;
                } catch (IOException e2) {
                    oVar.g(2, 2, e2);
                    return -1L;
                }
            case 1:
                z zVar = this.f4081f.f4102k;
                int i3 = this.h;
                zVar.getClass();
                V.h("errorCode", i3);
                synchronized (this.f4081f) {
                    this.f4081f.f4116y.remove(Integer.valueOf(this.f4082g));
                }
                return -1L;
            default:
                o oVar2 = this.f4081f;
                try {
                    int i4 = this.f4082g;
                    int i5 = this.h;
                    oVar2.getClass();
                    V.h("statusCode", i5);
                    oVar2.f4114w.m(i4, i5);
                    return -1L;
                } catch (IOException e3) {
                    oVar2.g(2, 2, e3);
                    return -1L;
                }
        }
    }
}
