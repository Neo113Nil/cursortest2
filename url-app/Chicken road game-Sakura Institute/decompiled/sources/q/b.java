package q;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7253a;

    public /* synthetic */ b(int i7) {
        this.f7253a = i7;
    }

    public static final a c(String str, int i7) {
        WeakHashMap weakHashMap = u0.f7347u;
        return new a(str, i7);
    }

    public static final r0 d(String str, int i7) {
        WeakHashMap weakHashMap = u0.f7347u;
        return new r0(new c0(0, 0, 0, 0), str);
    }

    @Override // q.f
    public void b(m2.b bVar, int i7, int[] iArr, m2.k kVar, int[] iArr2) {
        switch (this.f7253a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                j.b(iArr, iArr2, false);
                break;
            case 1:
                j.c(i7, iArr, iArr2, false);
                break;
            case 2:
                if (kVar != m2.k.f6322f) {
                    j.b(iArr, iArr2, true);
                    break;
                } else {
                    j.c(i7, iArr, iArr2, false);
                    break;
                }
            default:
                if (kVar != m2.k.f6322f) {
                    j.c(i7, iArr, iArr2, true);
                    break;
                } else {
                    j.b(iArr, iArr2, false);
                    break;
                }
        }
    }

    public String toString() {
        switch (this.f7253a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
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
