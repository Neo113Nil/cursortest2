package z1;

import Z.V;
import java.io.IOException;

/* loaded from: classes.dex */
public final class j extends v1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4449e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f4450f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4451g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4452h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, o oVar, int i, int i2, int i3) {
        super(str, true);
        this.f4449e = i3;
        this.f4450f = oVar;
        this.f4451g = i;
        this.f4452h = i2;
    }

    @Override // v1.a
    public final long a() {
        switch (this.f4449e) {
            case 0:
                int i = this.f4451g;
                int i2 = this.f4452h;
                o oVar = this.f4450f;
                oVar.getClass();
                try {
                    oVar.f4486w.l(i, i2, true);
                    return -1L;
                } catch (IOException e2) {
                    oVar.g(2, 2, e2);
                    return -1L;
                }
            case 1:
                z zVar = this.f4450f.f4474k;
                int i3 = this.f4452h;
                zVar.getClass();
                V.h("errorCode", i3);
                synchronized (this.f4450f) {
                    this.f4450f.f4488y.remove(Integer.valueOf(this.f4451g));
                }
                return -1L;
            default:
                o oVar2 = this.f4450f;
                try {
                    int i4 = this.f4451g;
                    int i5 = this.f4452h;
                    oVar2.getClass();
                    V.h("statusCode", i5);
                    oVar2.f4486w.m(i4, i5);
                    return -1L;
                } catch (IOException e3) {
                    oVar2.g(2, 2, e3);
                    return -1L;
                }
        }
    }
}
