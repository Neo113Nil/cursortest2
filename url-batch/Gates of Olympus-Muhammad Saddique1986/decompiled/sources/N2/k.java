package N2;

import java.io.IOException;

/* loaded from: classes.dex */
public final class k extends J2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f3622f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3623g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3624h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(String str, p pVar, int i3, int i4, int i5) {
        super(str, true);
        this.f3621e = i5;
        this.f3622f = pVar;
        this.f3623g = i3;
        this.f3624h = i4;
    }

    @Override // J2.a
    public final long a() {
        switch (this.f3621e) {
            case 0:
                int i3 = this.f3623g;
                int i4 = this.f3624h;
                p pVar = this.f3622f;
                pVar.getClass();
                try {
                    pVar.f3662z.h(i3, i4, true);
                    return -1L;
                } catch (IOException e3) {
                    pVar.a(2, 2, e3);
                    return -1L;
                }
            case 1:
                B b3 = this.f3622f.f3650n;
                int i5 = this.f3624h;
                b3.getClass();
                A.k.s("errorCode", i5);
                synchronized (this.f3622f) {
                    this.f3622f.f3639B.remove(Integer.valueOf(this.f3623g));
                }
                return -1L;
            default:
                p pVar2 = this.f3622f;
                try {
                    int i6 = this.f3623g;
                    int i7 = this.f3624h;
                    pVar2.getClass();
                    A.k.s("statusCode", i7);
                    pVar2.f3662z.l(i6, i7);
                    return -1L;
                } catch (IOException e4) {
                    pVar2.a(2, 2, e4);
                    return -1L;
                }
        }
    }
}
