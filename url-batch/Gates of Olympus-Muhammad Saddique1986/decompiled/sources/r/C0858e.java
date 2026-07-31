package r;

import r0.InterfaceC0887I;

/* renamed from: r.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0858e implements InterfaceC0860g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8046a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8047b;

    public C0858e(int i3) {
        this.f8046a = i3;
        switch (i3) {
            case 1:
                this.f8047b = 0;
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                this.f8047b = 0;
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                this.f8047b = 0;
                break;
            default:
                this.f8047b = 0;
                break;
        }
    }

    @Override // r.InterfaceC0859f, r.InterfaceC0862i
    public final float a() {
        switch (this.f8046a) {
        }
        return this.f8047b;
    }

    @Override // r.InterfaceC0859f
    public final void b(O0.b bVar, int i3, int[] iArr, O0.k kVar, int[] iArr2) {
        switch (this.f8046a) {
            case 0:
                if (kVar != O0.k.f3741d) {
                    AbstractC0864k.a(i3, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC0864k.a(i3, iArr, iArr2, false);
                    break;
                }
            case 1:
                if (kVar != O0.k.f3741d) {
                    AbstractC0864k.d(i3, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC0864k.d(i3, iArr, iArr2, false);
                    break;
                }
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                if (kVar != O0.k.f3741d) {
                    AbstractC0864k.e(i3, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC0864k.e(i3, iArr, iArr2, false);
                    break;
                }
            default:
                if (kVar != O0.k.f3741d) {
                    AbstractC0864k.f(i3, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC0864k.f(i3, iArr, iArr2, false);
                    break;
                }
        }
    }

    @Override // r.InterfaceC0862i
    public final void c(int i3, InterfaceC0887I interfaceC0887I, int[] iArr, int[] iArr2) {
        switch (this.f8046a) {
            case 0:
                AbstractC0864k.a(i3, iArr, iArr2, false);
                break;
            case 1:
                AbstractC0864k.d(i3, iArr, iArr2, false);
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC0864k.e(i3, iArr, iArr2, false);
                break;
            default:
                AbstractC0864k.f(i3, iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f8046a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
