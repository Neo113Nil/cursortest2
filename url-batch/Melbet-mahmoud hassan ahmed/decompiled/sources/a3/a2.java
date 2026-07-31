package a3;

import android.content.Context;
import com.google.android.gms.internal.ads.ao0;

/* loaded from: classes.dex */
final class a2 implements ao0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f40a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f41b;

    a2(g2 g2Var, Context context, String str) {
        this.f40a = context;
        this.f41b = str;
    }

    @Override // com.google.android.gms.internal.ads.ao0
    public final void b(String str) {
        y2.t.q();
        g2.o(this.f40a, this.f41b, str);
    }
}
