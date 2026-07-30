package o;

import com.android.installreferrer.api.InstallReferrerClient;
import g0.n2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6558g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0 f6559h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(x0 x0Var, int i7) {
        super(0);
        this.f6558g = i7;
        this.f6559h = x0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r0 != false) goto L13;
     */
    @Override // q6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        boolean z8;
        boolean z9;
        switch (this.f6558g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                e7.e eVar = this.f6559h.f6796y;
                if (eVar != null) {
                    eVar.e(n.f6697a);
                }
                return d6.z.f2639a;
            case 1:
                f1 f1Var = this.f6559h.H;
                if (!f1Var.f6609a.c()) {
                    m.w0 w0Var = f1Var.f6610b;
                    z8 = false;
                    if (w0Var == null) {
                        z9 = false;
                        break;
                    } else {
                        z9 = w0Var.b();
                        break;
                    }
                }
                z8 = true;
                return Boolean.valueOf(!z8);
            default:
                n2 n2Var = s1.f1.f8217f;
                x0 x0Var = this.f6559h;
                x0Var.G.f6662a = new l.w(new b6.c((m2.b) r1.f.i(x0Var, n2Var)));
                return d6.z.f2639a;
        }
    }
}
