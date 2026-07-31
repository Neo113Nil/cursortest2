package a3;

import android.content.Context;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.py;

/* loaded from: classes.dex */
final class y extends py {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Context f200f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ c0 f201g;

    y(c0 c0Var, Context context) {
        this.f201g = c0Var;
        this.f200f = context;
    }

    @Override // com.google.android.gms.internal.ads.qy
    public final void V2(cv cvVar) {
        if (cvVar == null) {
            return;
        }
        this.f201g.i(this.f200f, cvVar.f3955g, true, true);
    }
}
