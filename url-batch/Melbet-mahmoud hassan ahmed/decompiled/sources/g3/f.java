package g3;

import com.google.android.gms.internal.ads.aa1;
import com.google.android.gms.internal.ads.ba1;
import com.google.android.gms.internal.ads.cc3;
import com.google.android.gms.internal.ads.gw2;
import com.google.android.gms.internal.ads.kv3;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.nw2;
import com.google.android.gms.internal.ads.sw;
import com.google.android.gms.internal.ads.yv3;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class f implements kv3<cc3<j>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<nw2> f16615a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<h> f16616b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<aa1> f16617c;

    public f(yv3<nw2> yv3Var, yv3<h> yv3Var2, yv3<aa1> yv3Var3) {
        this.f16615a = yv3Var;
        this.f16616b = yv3Var2;
        this.f16617c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return this.f16615a.a().b(gw2.GENERATE_SIGNALS, ((ba1) this.f16617c).a().c()).f(((i) this.f16616b).a()).i(((Integer) sw.c().b(m10.W3)).intValue(), TimeUnit.SECONDS).a();
    }
}
