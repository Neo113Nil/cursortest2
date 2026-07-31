package r;

import java.util.WeakHashMap;

/* renamed from: r.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0855b implements InterfaceC0859f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8029a;

    public /* synthetic */ C0855b(int i3) {
        this.f8029a = i3;
    }

    public static final C0854a c(String str, int i3) {
        WeakHashMap weakHashMap = Y.f8002u;
        return new C0854a(str, i3);
    }

    public static final W d(String str, int i3) {
        WeakHashMap weakHashMap = Y.f8002u;
        return new W(AbstractC0856c.e(X0.c.f4622e), str);
    }

    @Override // r.InterfaceC0859f
    public void b(O0.b bVar, int i3, int[] iArr, O0.k kVar, int[] iArr2) {
        switch (this.f8029a) {
            case 0:
                AbstractC0864k.b(iArr, iArr2, false);
                break;
            case 1:
                AbstractC0864k.c(i3, iArr, iArr2, false);
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                if (kVar != O0.k.f3741d) {
                    AbstractC0864k.b(iArr, iArr2, true);
                    break;
                } else {
                    AbstractC0864k.c(i3, iArr, iArr2, false);
                    break;
                }
            default:
                if (kVar != O0.k.f3741d) {
                    AbstractC0864k.c(i3, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC0864k.b(iArr, iArr2, false);
                    break;
                }
        }
    }

    public String toString() {
        switch (this.f8029a) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                return "Arrangement#End";
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }
}
