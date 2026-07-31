package H2;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends D2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1969e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f1970f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1971g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1972h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, p pVar, int i3, int i4, int i5) {
        super(str, true);
        this.f1969e = i5;
        this.f1970f = pVar;
        this.f1971g = i3;
        this.f1972h = i4;
    }

    @Override // D2.a
    public final long a() {
        switch (this.f1969e) {
            case 0:
                int i3 = this.f1971g;
                int i4 = this.f1972h;
                p pVar = this.f1970f;
                pVar.getClass();
                try {
                    pVar.f2005z.j(i3, i4, true);
                    return -1L;
                } catch (IOException e3) {
                    pVar.a(2, 2, e3);
                    return -1L;
                }
            case 1:
                B b2 = this.f1970f.f1994n;
                int i5 = this.f1972h;
                b2.getClass();
                AbstractC0080b.s("errorCode", i5);
                synchronized (this.f1970f) {
                    this.f1970f.B.remove(Integer.valueOf(this.f1971g));
                }
                return -1L;
            default:
                p pVar2 = this.f1970f;
                try {
                    int i6 = this.f1971g;
                    int i7 = this.f1972h;
                    pVar2.getClass();
                    AbstractC0080b.s("statusCode", i7);
                    pVar2.f2005z.k(i6, i7);
                    return -1L;
                } catch (IOException e4) {
                    pVar2.a(2, 2, e4);
                    return -1L;
                }
        }
    }
}
