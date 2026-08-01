package G1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends C1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f399f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f400g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, q qVar, int i, int i2, int i3) {
        super(str, true);
        this.f398e = i3;
        this.f399f = qVar;
        this.f400g = i;
        this.h = i2;
    }

    @Override // C1.a
    public final long a() {
        switch (this.f398e) {
            case 0:
                int i = this.f400g;
                int i2 = this.h;
                q qVar = this.f399f;
                qVar.getClass();
                try {
                    qVar.f432w.r(i, i2, true);
                    return -1L;
                } catch (IOException e2) {
                    qVar.a(2, 2, e2);
                    return -1L;
                }
            case 1:
                C c2 = this.f399f.f420k;
                int i3 = this.h;
                c2.getClass();
                AbstractC0001b.j("errorCode", i3);
                synchronized (this.f399f) {
                    this.f399f.f434y.remove(Integer.valueOf(this.f400g));
                }
                return -1L;
            default:
                q qVar2 = this.f399f;
                try {
                    int i4 = this.f400g;
                    int i5 = this.h;
                    qVar2.getClass();
                    AbstractC0001b.j("statusCode", i5);
                    qVar2.f432w.s(i4, i5);
                    return -1L;
                } catch (IOException e3) {
                    qVar2.a(2, 2, e3);
                    return -1L;
                }
        }
    }
}
