package a3;

import android.content.Context;
import com.google.android.gms.internal.ads.bp0;
import com.google.android.gms.internal.ads.cc3;
import com.google.android.gms.internal.ads.d6;
import com.google.android.gms.internal.ads.ho0;
import com.google.android.gms.internal.ads.i5;
import com.google.android.gms.internal.ads.i7;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.sw;
import com.google.android.gms.internal.ads.w5;
import java.util.Map;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    private static d6 f152a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f153b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final p0<Void> f154c = new m0();

    public u0(Context context) {
        d6 a7;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f153b) {
            if (f152a == null) {
                m10.c(context);
                if (!v3.c.a()) {
                    if (((Boolean) sw.c().b(m10.X2)).booleanValue()) {
                        a7 = d0.b(context);
                        f152a = a7;
                    }
                }
                a7 = i7.a(context, null);
                f152a = a7;
            }
        }
    }

    public final cc3<w5> a(String str) {
        bp0 bp0Var = new bp0();
        f152a.a(new t0(str, null, bp0Var));
        return bp0Var;
    }

    public final cc3<String> b(int i7, String str, Map<String, String> map, byte[] bArr) {
        r0 r0Var = new r0(null);
        n0 n0Var = new n0(this, str, r0Var);
        ho0 ho0Var = new ho0(null);
        o0 o0Var = new o0(this, i7, str, r0Var, n0Var, bArr, map, ho0Var);
        if (ho0.l()) {
            try {
                ho0Var.d(str, "GET", o0Var.m(), o0Var.y());
            } catch (i5 e7) {
                io0.g(e7.getMessage());
            }
        }
        f152a.a(o0Var);
        return r0Var;
    }
}
