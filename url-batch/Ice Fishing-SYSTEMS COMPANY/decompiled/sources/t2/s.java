package t2;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C2881Yl;
import com.google.android.gms.internal.ads.C3614n5;
import com.google.android.gms.internal.ads.S4;
import com.google.android.gms.internal.ads.T2;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static S0.q f40933a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f40934b = new Object();

    public s(Context context) {
        S0.q qVar;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f40934b) {
            try {
                if (f40933a == null) {
                    AbstractC3368ia.a(context);
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31757p5)).booleanValue()) {
                        qVar = C5078l.x(context);
                    } else {
                        qVar = new S0.q(new C3614n5(new C2881Yl(context.getApplicationContext())), new C2881Yl(new T2(20)));
                        qVar.n();
                    }
                    f40933a = qVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final q a(int i, String str, HashMap hashMap, byte[] bArr) {
        q qVar = new q();
        S0.l lVar = new S0.l(this, str, qVar);
        u2.f fVar = new u2.f();
        p pVar = new p(this, i, str, qVar, lVar, bArr, hashMap, fVar);
        if (u2.f.c()) {
            try {
                Map e6 = pVar.e();
                byte[] bArr2 = bArr == null ? null : bArr;
                if (u2.f.c()) {
                    fVar.e("onNetworkRequest", new f4.p(str, "GET", e6, bArr2, 7));
                }
            } catch (S4 e9) {
                String message = e9.getMessage();
                int i4 = C.f40822b;
                u2.i.f(message);
            }
        }
        f40933a.o(pVar);
        return qVar;
    }
}
