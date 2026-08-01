package y1;

import Y.V;
import java.io.IOException;

/* loaded from: classes.dex */
public final class j extends u1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4252e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f4253f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4254g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, o oVar, int i, int i2, int i3) {
        super(str, true);
        this.f4252e = i3;
        this.f4253f = oVar;
        this.f4254g = i;
        this.h = i2;
    }

    @Override // u1.a
    public final long a() {
        switch (this.f4252e) {
            case 0:
                int i = this.f4254g;
                int i2 = this.h;
                o oVar = this.f4253f;
                oVar.getClass();
                try {
                    oVar.f4286w.l(i, i2, true);
                    return -1L;
                } catch (IOException e2) {
                    oVar.g(2, 2, e2);
                    return -1L;
                }
            case 1:
                z zVar = this.f4253f.f4274k;
                int i3 = this.h;
                zVar.getClass();
                V.h("errorCode", i3);
                synchronized (this.f4253f) {
                    this.f4253f.f4288y.remove(Integer.valueOf(this.f4254g));
                }
                return -1L;
            default:
                o oVar2 = this.f4253f;
                try {
                    int i4 = this.f4254g;
                    int i5 = this.h;
                    oVar2.getClass();
                    V.h("statusCode", i5);
                    oVar2.f4286w.m(i4, i5);
                    return -1L;
                } catch (IOException e3) {
                    oVar2.g(2, 2, e3);
                    return -1L;
                }
        }
    }
}
