package a3;

import com.google.android.gms.internal.ads.e6;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.g7;
import com.google.android.gms.internal.ads.ho0;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
final class o0 extends g7 {

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ byte[] f121t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ Map f122u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ ho0 f123v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o0(u0 u0Var, int i7, String str, f6 f6Var, e6 e6Var, byte[] bArr, Map map, ho0 ho0Var) {
        super(i7, str, f6Var, e6Var);
        this.f121t = bArr;
        this.f122u = map;
        this.f123v = ho0Var;
    }

    @Override // com.google.android.gms.internal.ads.g7
    protected final void A(String str) {
        this.f123v.g(str);
        super.A(str);
    }

    @Override // com.google.android.gms.internal.ads.a6
    public final Map<String, String> m() {
        Map<String, String> map = this.f122u;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.a6
    protected final /* bridge */ /* synthetic */ void p(String str) {
        A(str);
    }

    @Override // com.google.android.gms.internal.ads.a6
    public final byte[] y() {
        byte[] bArr = this.f121t;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }
}
