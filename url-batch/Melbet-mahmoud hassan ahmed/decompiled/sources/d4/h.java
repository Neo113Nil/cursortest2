package d4;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class h extends x {

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ String f15680j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ String f15681k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ Context f15682l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Bundle f15683m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ g0 f15684n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(g0 g0Var, String str, String str2, Context context, Bundle bundle) {
        super(g0Var, true);
        this.f15684n = g0Var;
        this.f15680j = str;
        this.f15681k = str2;
        this.f15682l = context;
        this.f15683m = bundle;
    }

    @Override // d4.x
    public final void a() {
        boolean r7;
        String str;
        String str2;
        String str3;
        p0 p0Var;
        p0 p0Var2;
        String str4;
        String str5;
        try {
            g0 g0Var = this.f15684n;
            r7 = g0.r(this.f15680j, this.f15681k);
            if (r7) {
                String str6 = this.f15681k;
                String str7 = this.f15680j;
                str5 = this.f15684n.f15671a;
                str2 = str7;
                str3 = str6;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            r3.o.i(this.f15682l);
            g0 g0Var2 = this.f15684n;
            g0Var2.f15679i = g0Var2.u(this.f15682l, true);
            p0Var = this.f15684n.f15679i;
            if (p0Var == null) {
                str4 = this.f15684n.f15671a;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int a7 = DynamiteModule.a(this.f15682l, "com.google.android.gms.measurement.dynamite");
            s0 s0Var = new s0(39065L, Math.max(a7, r0), DynamiteModule.c(this.f15682l, "com.google.android.gms.measurement.dynamite") < a7, str, str2, str3, this.f15683m, g4.a.a(this.f15682l));
            p0Var2 = this.f15684n.f15679i;
            ((p0) r3.o.i(p0Var2)).s2(x3.b.B3(this.f15682l), s0Var, this.f15739f);
        } catch (Exception e7) {
            this.f15684n.p(e7, true, false);
        }
    }
}
