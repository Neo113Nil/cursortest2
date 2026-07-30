package a0;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p0 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f122g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ArrayList f123h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(int i7, ArrayList arrayList) {
        super(1);
        this.f122g = i7;
        this.f123h = arrayList;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f122g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p1.m0 m0Var = (p1.m0) obj;
                ArrayList arrayList = this.f123h;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    p1.m0.d(m0Var, (p1.n0) arrayList.get(i7), 0, 0);
                }
                break;
            case 1:
                p1.m0 m0Var2 = (p1.m0) obj;
                ArrayList arrayList2 = this.f123h;
                int size2 = arrayList2.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    p1.m0.d(m0Var2, (p1.n0) arrayList2.get(i8), 0, 0);
                }
                break;
            case 2:
                p1.m0 m0Var3 = (p1.m0) obj;
                ArrayList arrayList3 = this.f123h;
                int size3 = arrayList3.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    p1.m0.g(m0Var3, (p1.n0) arrayList3.get(i9), 0, 0);
                }
                break;
            case 3:
                p1.m0 m0Var4 = (p1.m0) obj;
                ArrayList arrayList4 = this.f123h;
                int size4 = arrayList4.size();
                for (int i10 = 0; i10 < size4; i10++) {
                    p1.m0.f(m0Var4, (p1.n0) arrayList4.get(i10), 0, 0);
                }
                break;
            default:
                p1.m0 m0Var5 = (p1.m0) obj;
                ArrayList arrayList5 = this.f123h;
                int W = e6.m.W(arrayList5);
                if (W >= 0) {
                    int i11 = 0;
                    while (true) {
                        p1.m0.f(m0Var5, (p1.n0) arrayList5.get(i11), 0, 0);
                        if (i11 != W) {
                            i11++;
                        }
                    }
                }
                break;
        }
        return d6.z.f2639a;
    }
}
