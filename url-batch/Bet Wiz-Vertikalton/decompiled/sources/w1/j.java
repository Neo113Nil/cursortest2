package w1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class j extends s1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4108e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f4109f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4110g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, o oVar, int i, int i2, int i3) {
        super(str, true);
        this.f4108e = i3;
        this.f4109f = oVar;
        this.f4110g = i;
        this.h = i2;
    }

    @Override // s1.a
    public final long a() {
        switch (this.f4108e) {
            case 0:
                int i = this.f4110g;
                int i2 = this.h;
                o oVar = this.f4109f;
                oVar.getClass();
                try {
                    oVar.f4142w.l(i, i2, true);
                    return -1L;
                } catch (IOException e2) {
                    oVar.g(2, 2, e2);
                    return -1L;
                }
            case 1:
                z zVar = this.f4109f.f4130k;
                int i3 = this.h;
                zVar.getClass();
                T0.c.g("errorCode", i3);
                synchronized (this.f4109f) {
                    this.f4109f.f4144y.remove(Integer.valueOf(this.f4110g));
                }
                return -1L;
            default:
                o oVar2 = this.f4109f;
                try {
                    int i4 = this.f4110g;
                    int i5 = this.h;
                    oVar2.getClass();
                    T0.c.g("statusCode", i5);
                    oVar2.f4142w.m(i4, i5);
                    return -1L;
                } catch (IOException e3) {
                    oVar2.g(2, 2, e3);
                    return -1L;
                }
        }
    }
}
