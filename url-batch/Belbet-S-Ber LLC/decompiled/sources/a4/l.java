package a4;

import java.io.IOException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class l extends w3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f184e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f185f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f186g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, r rVar, int i, int i4, int i5) {
        super(str, true);
        this.f184e = i5;
        this.f185f = rVar;
        this.f186g = i;
        this.h = i4;
    }

    @Override // w3.a
    public final long a() {
        switch (this.f184e) {
            case 0:
                r rVar = this.f185f;
                try {
                    rVar.B.r(this.f186g, this.h, true);
                    return -1L;
                } catch (IOException e4) {
                    rVar.m(2, 2, e4);
                    return -1L;
                }
            case 1:
                d0 d0Var = this.f185f.f208p;
                int i = this.h;
                d0Var.getClass();
                b.i("errorCode", i);
                synchronized (this.f185f) {
                    this.f185f.D.remove(Integer.valueOf(this.f186g));
                }
                return -1L;
            default:
                r rVar2 = this.f185f;
                try {
                    int i4 = this.f186g;
                    int i5 = this.h;
                    b.i("statusCode", i5);
                    rVar2.B.s(i4, i5);
                    return -1L;
                } catch (IOException e5) {
                    rVar2.m(2, 2, e5);
                    return -1L;
                }
        }
    }
}
