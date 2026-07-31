package g3;

import com.google.android.gms.internal.ads.dc3;
import com.google.android.gms.internal.ads.e02;
import com.google.android.gms.internal.ads.f02;
import com.google.android.gms.internal.ads.kv3;
import com.google.android.gms.internal.ads.sv3;
import com.google.android.gms.internal.ads.wo0;
import com.google.android.gms.internal.ads.yv3;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i implements kv3<h> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Executor> f16653a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<e02> f16654b;

    public i(yv3<Executor> yv3Var, yv3<e02> yv3Var2) {
        this.f16653a = yv3Var;
        this.f16654b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final h a() {
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new h(dc3Var, ((f02) this.f16654b).a());
    }
}
