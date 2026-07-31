package a3;

import com.google.android.gms.internal.ads.a6;
import com.google.android.gms.internal.ads.bp0;
import com.google.android.gms.internal.ads.g6;
import com.google.android.gms.internal.ads.ho0;
import com.google.android.gms.internal.ads.w5;
import com.google.android.gms.internal.ads.y6;
import java.util.Map;

/* loaded from: classes.dex */
public final class t0 extends a6<w5> {

    /* renamed from: r, reason: collision with root package name */
    private final bp0<w5> f149r;

    /* renamed from: s, reason: collision with root package name */
    private final ho0 f150s;

    public t0(String str, Map<String, String> map, bp0<w5> bp0Var) {
        super(0, str, new s0(bp0Var));
        this.f149r = bp0Var;
        ho0 ho0Var = new ho0(null);
        this.f150s = ho0Var;
        ho0Var.d(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.a6
    protected final g6<w5> i(w5 w5Var) {
        return g6.b(w5Var, y6.b(w5Var));
    }

    @Override // com.google.android.gms.internal.ads.a6
    protected final /* bridge */ /* synthetic */ void p(w5 w5Var) {
        w5 w5Var2 = w5Var;
        this.f150s.f(w5Var2.f13718c, w5Var2.f13716a);
        ho0 ho0Var = this.f150s;
        byte[] bArr = w5Var2.f13717b;
        if (ho0.l() && bArr != null) {
            ho0Var.h(bArr);
        }
        this.f149r.e(w5Var2);
    }
}
