package g0;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3946g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3947h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3948i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3949j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i7, int i8, Object obj, Object obj2) {
        super(2);
        this.f3946g = i8;
        this.f3949j = obj;
        this.f3947h = obj2;
        this.f3948i = i7;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f3946g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Number) obj2).intValue();
                n1[] n1VarArr = (n1[]) this.f3949j;
                d.b((n1[]) Arrays.copyOf(n1VarArr, n1VarArr.length), (q6.e) this.f3947h, (p) obj, d.T(this.f3948i | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                d.a((n1) this.f3949j, (q6.e) this.f3947h, (p) obj, d.T(this.f3948i | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                l.p1 p1Var = (l.p1) this.f3949j;
                int T = d.T(this.f3948i | 1);
                p1Var.a(this.f3947h, (p) obj, T);
                break;
            case 3:
                ((Number) obj2).intValue();
                o0.a aVar = (o0.a) this.f3949j;
                int T2 = d.T(this.f3948i) | 1;
                aVar.g(this.f3947h, (p) obj, T2);
                break;
            case 4:
                ((Number) obj2).intValue();
                a8.m.e((s0.o) this.f3949j, (o0.a) this.f3947h, (p) obj, d.T(this.f3948i | 1));
                break;
            case 5:
                ((Number) obj2).intValue();
                u3.q.c((p0.c) this.f3949j, (o0.a) this.f3947h, (p) obj, d.T(this.f3948i | 1));
                break;
            default:
                ((Number) obj2).intValue();
                w.g0.b((a0.x0) this.f3949j, (o0.a) this.f3947h, (p) obj, d.T(this.f3948i | 1));
                break;
        }
        return d6.z.f2639a;
    }
}
