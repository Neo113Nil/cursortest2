package q;

import p0.InterfaceC0947H;

/* renamed from: q.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1026e implements InterfaceC1027f, InterfaceC1029h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9251a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9252b;

    public C1026e(int i2) {
        this.f9251a = i2;
        switch (i2) {
            case 1:
                this.f9252b = 0;
                break;
            case 2:
                this.f9252b = 0;
                break;
            case 3:
                this.f9252b = 0;
                break;
            default:
                this.f9252b = 0;
                break;
        }
    }

    @Override // q.InterfaceC1027f, q.InterfaceC1029h
    public final float a() {
        switch (this.f9251a) {
        }
        return this.f9252b;
    }

    @Override // q.InterfaceC1027f
    public final void b(M0.b bVar, int i2, int[] iArr, M0.k kVar, int[] iArr2) {
        switch (this.f9251a) {
            case 0:
                if (kVar != M0.k.f3555d) {
                    AbstractC1031j.a(i2, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC1031j.a(i2, iArr, iArr2, false);
                    break;
                }
            case 1:
                if (kVar != M0.k.f3555d) {
                    AbstractC1031j.d(i2, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC1031j.d(i2, iArr, iArr2, false);
                    break;
                }
            case 2:
                if (kVar != M0.k.f3555d) {
                    AbstractC1031j.e(i2, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC1031j.e(i2, iArr, iArr2, false);
                    break;
                }
            default:
                if (kVar != M0.k.f3555d) {
                    AbstractC1031j.f(i2, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC1031j.f(i2, iArr, iArr2, false);
                    break;
                }
        }
    }

    @Override // q.InterfaceC1029h
    public final void c(int i2, InterfaceC0947H interfaceC0947H, int[] iArr, int[] iArr2) {
        switch (this.f9251a) {
            case 0:
                AbstractC1031j.a(i2, iArr, iArr2, false);
                break;
            case 1:
                AbstractC1031j.d(i2, iArr, iArr2, false);
                break;
            case 2:
                AbstractC1031j.e(i2, iArr, iArr2, false);
                break;
            default:
                AbstractC1031j.f(i2, iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f9251a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
