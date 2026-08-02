package C0;

import T.r;
import y0.C1568A;
import y0.n;
import y0.o;
import y0.p;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259a;

    /* renamed from: b, reason: collision with root package name */
    public final n f260b;

    public a(int i4, byte b4) {
        this.f259a = i4;
        switch (i4) {
            case 1:
                this.f260b = new C1568A(35152, 2, "image/png");
                break;
            default:
                this.f260b = new C1568A(16973, 2, "image/bmp");
                break;
        }
    }

    @Override // y0.n
    public final void a(long j4, long j5) {
        switch (this.f259a) {
            case 0:
                ((C1568A) this.f260b).a(j4, j5);
                break;
            case 1:
                ((C1568A) this.f260b).a(j4, j5);
                break;
            default:
                this.f260b.a(j4, j5);
                break;
        }
    }

    @Override // y0.n
    public final boolean b(o oVar) {
        switch (this.f259a) {
            case 0:
                return ((C1568A) this.f260b).b(oVar);
            case 1:
                return ((C1568A) this.f260b).b(oVar);
            default:
                return this.f260b.b(oVar);
        }
    }

    @Override // y0.n
    public final int c(o oVar, r rVar) {
        switch (this.f259a) {
            case 0:
                return ((C1568A) this.f260b).c(oVar, rVar);
            case 1:
                return ((C1568A) this.f260b).c(oVar, rVar);
            default:
                return this.f260b.c(oVar, rVar);
        }
    }

    @Override // y0.n
    public final void e(p pVar) {
        switch (this.f259a) {
            case 0:
                ((C1568A) this.f260b).e(pVar);
                break;
            case 1:
                ((C1568A) this.f260b).e(pVar);
                break;
            default:
                this.f260b.e(pVar);
                break;
        }
    }

    @Override // y0.n
    public final void release() {
        switch (this.f259a) {
            case 0:
            case 1:
                break;
            default:
                this.f260b.release();
                break;
        }
    }

    public a(int i4) {
        this.f259a = 2;
        if ((i4 & 1) != 0) {
            this.f260b = new C1568A(65496, 2, "image/jpeg");
        } else {
            this.f260b = new G0.a();
        }
    }

    private final void f() {
    }

    private final void g() {
    }
}
