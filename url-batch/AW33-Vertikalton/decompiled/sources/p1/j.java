package p1;

import X.V;
import java.io.IOException;

/* loaded from: classes.dex */
public final class j extends l1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f3426f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3427g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, o oVar, int i, int i2, int i3) {
        super(str, true);
        this.f3425e = i3;
        this.f3426f = oVar;
        this.f3427g = i;
        this.h = i2;
    }

    @Override // l1.a
    public final long a() {
        switch (this.f3425e) {
            case 0:
                int i = this.f3427g;
                int i2 = this.h;
                o oVar = this.f3426f;
                oVar.getClass();
                try {
                    oVar.f3459w.j(i, i2, true);
                    return -1L;
                } catch (IOException e2) {
                    oVar.e(2, 2, e2);
                    return -1L;
                }
            case 1:
                A a2 = this.f3426f.f3447k;
                int i3 = this.h;
                a2.getClass();
                V.g("errorCode", i3);
                synchronized (this.f3426f) {
                    this.f3426f.f3461y.remove(Integer.valueOf(this.f3427g));
                }
                return -1L;
            default:
                o oVar2 = this.f3426f;
                try {
                    int i4 = this.f3427g;
                    int i5 = this.h;
                    oVar2.getClass();
                    V.g("statusCode", i5);
                    oVar2.f3459w.k(i4, i5);
                    return -1L;
                } catch (IOException e3) {
                    oVar2.e(2, 2, e3);
                    return -1L;
                }
        }
    }
}
