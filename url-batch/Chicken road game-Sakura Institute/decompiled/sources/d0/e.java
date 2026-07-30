package d0;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1912g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1913h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1914i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1915j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1916k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g0.e0 e0Var, o0.b bVar, i.u uVar, int i7) {
        super(1);
        this.f1912g = 1;
        this.f1914i = e0Var;
        this.f1915j = bVar;
        this.f1916k = uVar;
        this.f1913h = i7;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f1912g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p1.m0 m0Var = (p1.m0) obj;
                ArrayList arrayList = (ArrayList) this.f1914i;
                p1.h0 h0Var = (p1.h0) this.f1916k;
                float f9 = m.f2157c;
                ArrayList arrayList2 = (ArrayList) this.f1915j;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    List list = (List) arrayList.get(i7);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    int i8 = 0;
                    while (i8 < size2) {
                        iArr[i8] = ((p1.n0) list.get(i8)).f7063f + (i8 < e6.m.W(list) ? h0Var.K(f9) : 0);
                        i8++;
                    }
                    q.b bVar = q.j.f7292b;
                    int[] iArr2 = new int[size2];
                    for (int i9 = 0; i9 < size2; i9++) {
                        iArr2[i9] = 0;
                    }
                    bVar.b(h0Var, this.f1913h, iArr, h0Var.getLayoutDirection(), iArr2);
                    int size3 = list.size();
                    for (int i10 = 0; i10 < size3; i10++) {
                        p1.m0.d(m0Var, (p1.n0) list.get(i10), iArr2[i10], ((Number) arrayList2.get(i7)).intValue());
                    }
                }
                return d6.z.f2639a;
            case 1:
                if (obj == ((g0.e0) this.f1914i)) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof q0.u) {
                    int i11 = ((o0.b) this.f1915j).f6815a;
                    i.u uVar = (i.u) this.f1916k;
                    int i12 = i11 - this.f1913h;
                    int c4 = uVar.c(obj);
                    uVar.f(Math.min(i12, c4 >= 0 ? uVar.f4800c[c4] : Integer.MAX_VALUE), obj);
                }
                return d6.z.f2639a;
            case 2:
                p1.m0 m0Var2 = (p1.m0) obj;
                p1.n0[] n0VarArr = (p1.n0[]) this.f1914i;
                q.m0 m0Var3 = (q.m0) this.f1915j;
                int[] iArr3 = (int[]) this.f1916k;
                int length = n0VarArr.length;
                int i13 = 0;
                int i14 = 0;
                while (i13 < length) {
                    p1.n0 n0Var = n0VarArr[i13];
                    int i15 = i14 + 1;
                    r6.k.c(n0Var);
                    Object g9 = n0Var.g();
                    q.k0 k0Var = g9 instanceof q.k0 ? (q.k0) g9 : null;
                    q.v vVar = k0Var != null ? k0Var.f7299c : null;
                    int i16 = this.f1913h;
                    p1.m0.d(m0Var2, n0Var, iArr3[i14], vVar != null ? vVar.a(i16 - n0Var.f7064g, m2.k.f6322f) : m0Var3.f7309b.a(0, i16 - n0Var.f7064g));
                    i13++;
                    i14 = i15;
                }
                return d6.z.f2639a;
            case 3:
                p1.m0 m0Var4 = (p1.m0) obj;
                p1.n0 n0Var2 = (p1.n0) this.f1915j;
                p1.h0 h0Var2 = (p1.h0) this.f1916k;
                w.c0 c0Var = (w.c0) this.f1914i;
                int i17 = c0Var.f9203b;
                w.x0 x0Var = c0Var.f9202a;
                g2.d0 d0Var = c0Var.f9204c;
                w.z0 z0Var = (w.z0) c0Var.f9205d.a();
                x0Var.a(o.j0.f6658g, w.g0.h(h0Var2, i17, d0Var, z0Var != null ? z0Var.f9471a : null, h0Var2.getLayoutDirection() == m2.k.f6323g, n0Var2.f7063f), this.f1913h, n0Var2.f7063f);
                p1.m0.f(m0Var4, n0Var2, Math.round(-x0Var.f9455a.e()), 0);
                return d6.z.f2639a;
            case 4:
                p1.m0 m0Var5 = (p1.m0) obj;
                p1.n0 n0Var3 = (p1.n0) this.f1915j;
                p1.h0 h0Var3 = (p1.h0) this.f1916k;
                w.b1 b1Var = (w.b1) this.f1914i;
                int i18 = b1Var.f9198b;
                w.x0 x0Var2 = b1Var.f9197a;
                g2.d0 d0Var2 = b1Var.f9199c;
                w.z0 z0Var2 = (w.z0) b1Var.f9200d.a();
                x0Var2.a(o.j0.f6657f, w.g0.h(h0Var3, i18, d0Var2, z0Var2 != null ? z0Var2.f9471a : null, false, n0Var3.f7063f), this.f1913h, n0Var3.f7064g);
                p1.m0.f(m0Var5, n0Var3, 0, Math.round(-x0Var2.f9455a.e()));
                return d6.z.f2639a;
            case 5:
                p1.d dVar = (p1.d) obj;
                boolean H = x0.d.H((x0.r) this.f1914i, (x0.r) this.f1915j, this.f1913h, (c.h) this.f1916k);
                Boolean valueOf = Boolean.valueOf(H);
                if (H || !dVar.a()) {
                    return valueOf;
                }
                return null;
            default:
                p1.d dVar2 = (p1.d) obj;
                boolean G = x0.d.G(this.f1913h, (c.h) this.f1916k, (x0.r) this.f1914i, (y0.d) this.f1915j);
                Boolean valueOf2 = Boolean.valueOf(G);
                if (G || !dVar2.a()) {
                    return valueOf2;
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Object obj2, int i7, Serializable serializable, int i8) {
        super(1);
        this.f1912g = i8;
        this.f1914i = obj;
        this.f1915j = obj2;
        this.f1913h = i7;
        this.f1916k = serializable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ArrayList arrayList, p1.h0 h0Var, int i7, ArrayList arrayList2) {
        super(1);
        this.f1912g = 0;
        float f9 = m.f2155a;
        this.f1914i = arrayList;
        this.f1916k = h0Var;
        this.f1913h = i7;
        this.f1915j = arrayList2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(p1.h0 h0Var, p1.r rVar, p1.n0 n0Var, int i7, int i8) {
        super(1);
        this.f1912g = i8;
        this.f1916k = h0Var;
        this.f1914i = rVar;
        this.f1915j = n0Var;
        this.f1913h = i7;
    }
}
