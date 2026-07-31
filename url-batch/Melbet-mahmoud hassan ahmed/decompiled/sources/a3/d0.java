package a3;

import android.content.Context;
import com.google.android.gms.internal.ads.a6;
import com.google.android.gms.internal.ads.bo0;
import com.google.android.gms.internal.ads.c7;
import com.google.android.gms.internal.ads.d6;
import com.google.android.gms.internal.ads.e90;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.p6;
import com.google.android.gms.internal.ads.q6;
import com.google.android.gms.internal.ads.qw;
import com.google.android.gms.internal.ads.sw;
import com.google.android.gms.internal.ads.w5;
import com.google.android.gms.internal.ads.x6;
import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class d0 extends q6 {

    /* renamed from: d, reason: collision with root package name */
    private final Context f58d;

    private d0(Context context, p6 p6Var) {
        super(p6Var);
        this.f58d = context;
    }

    public static d6 b(Context context) {
        d6 d6Var = new d6(new x6(new File(context.getCacheDir(), "admob_volley"), 20971520), new d0(context, new c7(null, null)), 4);
        d6Var.d();
        return d6Var;
    }

    @Override // com.google.android.gms.internal.ads.q6, com.google.android.gms.internal.ads.t5
    public final w5 a(a6<?> a6Var) {
        if (a6Var.zza() == 0) {
            if (Pattern.matches((String) sw.c().b(m10.Y2), a6Var.l())) {
                qw.b();
                if (bo0.n(this.f58d, 13400000)) {
                    w5 a7 = new e90(this.f58d).a(a6Var);
                    if (a7 != null) {
                        String valueOf = String.valueOf(a6Var.l());
                        r1.k(valueOf.length() != 0 ? "Got gmscore asset response: ".concat(valueOf) : new String("Got gmscore asset response: "));
                        return a7;
                    }
                    String valueOf2 = String.valueOf(a6Var.l());
                    r1.k(valueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(valueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.a(a6Var);
    }
}
