package r;

import h1.C0438i;

/* renamed from: r.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0806c implements InterfaceC0809f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7055a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7056b;

    public C0806c(int i3) {
        this.f7055a = i3;
        switch (i3) {
            case 1:
                this.f7056b = 0;
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                this.f7056b = 0;
                break;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                this.f7056b = 0;
                break;
            default:
                this.f7056b = 0;
                break;
        }
    }

    @Override // r.InterfaceC0808e, r.InterfaceC0811h
    public final float a() {
        switch (this.f7055a) {
        }
        return this.f7056b;
    }

    @Override // r.InterfaceC0808e
    public final void b(M0.b bVar, int i3, int[] iArr, M0.j jVar, int[] iArr2) {
        switch (this.f7055a) {
            case 0:
                if (jVar != M0.j.f2775d) {
                    AbstractC0813j.a(i3, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC0813j.a(i3, iArr, iArr2, false);
                    break;
                }
            case 1:
                if (jVar != M0.j.f2775d) {
                    AbstractC0813j.d(i3, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC0813j.d(i3, iArr, iArr2, false);
                    break;
                }
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                if (jVar != M0.j.f2775d) {
                    AbstractC0813j.e(i3, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC0813j.e(i3, iArr, iArr2, false);
                    break;
                }
            default:
                if (jVar != M0.j.f2775d) {
                    AbstractC0813j.f(i3, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC0813j.f(i3, iArr, iArr2, false);
                    break;
                }
        }
    }

    @Override // r.InterfaceC0811h
    public final void c(r0.C c3, int i3, int[] iArr, int[] iArr2) {
        switch (this.f7055a) {
            case 0:
                AbstractC0813j.a(i3, iArr, iArr2, false);
                break;
            case 1:
                AbstractC0813j.d(i3, iArr, iArr2, false);
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC0813j.e(i3, iArr, iArr2, false);
                break;
            default:
                AbstractC0813j.f(i3, iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f7055a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
