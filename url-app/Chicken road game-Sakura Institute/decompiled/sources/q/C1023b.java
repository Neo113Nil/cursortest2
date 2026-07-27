package q;

import java.util.WeakHashMap;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1023b implements InterfaceC1027f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9238a;

    public /* synthetic */ C1023b(int i2) {
        this.f9238a = i2;
    }

    public static final C1022a c(int i2, String str) {
        WeakHashMap weakHashMap = o0.f9297u;
        return new C1022a(i2, str);
    }

    public static final l0 d(int i2, String str) {
        WeakHashMap weakHashMap = o0.f9297u;
        return new l0(AbstractC1024c.i(V0.c.f4142e), str);
    }

    @Override // q.InterfaceC1027f
    public void b(M0.b bVar, int i2, int[] iArr, M0.k kVar, int[] iArr2) {
        switch (this.f9238a) {
            case 0:
                AbstractC1031j.b(iArr, iArr2, false);
                break;
            case 1:
                AbstractC1031j.c(i2, iArr, iArr2, false);
                break;
            case 2:
                if (kVar != M0.k.f3555d) {
                    AbstractC1031j.b(iArr, iArr2, true);
                    break;
                } else {
                    AbstractC1031j.c(i2, iArr, iArr2, false);
                    break;
                }
            default:
                if (kVar != M0.k.f3555d) {
                    AbstractC1031j.c(i2, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC1031j.b(iArr, iArr2, false);
                    break;
                }
        }
    }

    public String toString() {
        switch (this.f9238a) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "Arrangement#End";
            case 3:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }
}
