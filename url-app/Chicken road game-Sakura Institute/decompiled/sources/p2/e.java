package p2;

import a0.p0;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;
import k.c0;
import p1.e0;
import p1.f0;
import p1.g0;
import p1.h0;
import p1.n0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e implements f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final e f7129b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f7130c = new e(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7131a;

    public /* synthetic */ e(int i7) {
        this.f7131a = i7;
    }

    @Override // p1.f0
    public final g0 a(h0 h0Var, List list, long j8) {
        Object obj;
        int i7;
        switch (this.f7131a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    arrayList.add(((e0) list.get(i8)).b(j8));
                }
                Object obj2 = null;
                int i9 = 1;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    obj = arrayList.get(0);
                    int i10 = ((n0) obj).f7063f;
                    int W = e6.m.W(arrayList);
                    if (1 <= W) {
                        int i11 = 1;
                        while (true) {
                            Object obj3 = arrayList.get(i11);
                            int i12 = ((n0) obj3).f7063f;
                            if (i10 < i12) {
                                obj = obj3;
                                i10 = i12;
                            }
                            if (i11 != W) {
                                i11++;
                            }
                        }
                    }
                }
                n0 n0Var = (n0) obj;
                int j9 = n0Var != null ? n0Var.f7063f : m2.a.j(j8);
                if (!arrayList.isEmpty()) {
                    obj2 = arrayList.get(0);
                    int i13 = ((n0) obj2).f7064g;
                    int W2 = e6.m.W(arrayList);
                    if (1 <= W2) {
                        while (true) {
                            Object obj4 = arrayList.get(i9);
                            int i14 = ((n0) obj4).f7064g;
                            if (i13 < i14) {
                                obj2 = obj4;
                                i13 = i14;
                            }
                            if (i9 != W2) {
                                i9++;
                            }
                        }
                    }
                }
                n0 n0Var2 = (n0) obj2;
                return h0Var.C(j9, n0Var2 != null ? n0Var2.f7064g : m2.a.i(j8), e6.v.f2827f, new p0(3, arrayList));
            default:
                int size2 = list.size();
                e6.v vVar = e6.v.f2827f;
                int i15 = 0;
                if (size2 == 0) {
                    return h0Var.C(0, 0, vVar, b.f7120l);
                }
                if (size2 == 1) {
                    n0 b9 = ((e0) list.get(0)).b(j8);
                    return h0Var.C(b9.f7063f, b9.f7064g, vVar, new c0(b9, 3));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i16 = 0; i16 < size3; i16++) {
                    arrayList2.add(((e0) list.get(i16)).b(j8));
                }
                int W3 = e6.m.W(arrayList2);
                if (W3 >= 0) {
                    int i17 = 0;
                    i7 = 0;
                    while (true) {
                        n0 n0Var3 = (n0) arrayList2.get(i15);
                        i17 = Math.max(i17, n0Var3.f7063f);
                        i7 = Math.max(i7, n0Var3.f7064g);
                        if (i15 != W3) {
                            i15++;
                        } else {
                            i15 = i17;
                        }
                    }
                } else {
                    i7 = 0;
                }
                return h0Var.C(i15, i7, vVar, new p0(4, arrayList2));
        }
    }
}
