package s7;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class f2 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q2 f8693e;

    public /* synthetic */ f2(q2 q2Var, int i3) {
        this.f8692d = i3;
        this.f8693e = q2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8692d) {
            case 0:
                this.f8693e.P();
                break;
            case 1:
                h1 h1Var = this.f8693e.E;
                q1 q1Var = h1Var.f8724e;
                o1 o1Var = q1Var.f8938u;
                q2 q2Var = q1Var.A;
                f1 f1Var = q1Var.f8936s;
                q1.l(o1Var);
                o1Var.s();
                if (h1Var.e()) {
                    if (h1Var.d()) {
                        q1.j(f1Var);
                        f1Var.K.e(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        q1.k(q2Var);
                        q2Var.z("auto", "_cmpx", bundle);
                    } else {
                        q1.j(f1Var);
                        b7.o0 o0Var = f1Var.K;
                        String d10 = o0Var.d();
                        if (TextUtils.isEmpty(d10)) {
                            v0 v0Var = q1Var.f8937t;
                            q1.l(v0Var);
                            v0Var.f9051u.a("Cache still valid but referrer not found");
                        } else {
                            long a9 = f1Var.L.a() / 3600000;
                            Uri parse = Uri.parse(d10);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(parse.getPath(), bundle2);
                            for (String str : parse.getQueryParameterNames()) {
                                bundle2.putString(str, parse.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", (a9 - 1) * 3600000);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            q1.k(q2Var);
                            q2Var.z(str2, "_cmp", (Bundle) pair.second);
                        }
                        o0Var.e(null);
                    }
                    q1.j(f1Var);
                    f1Var.L.b(0L);
                    break;
                }
                break;
            case 2:
                q2 q2Var2 = this.f8693e;
                q2Var2.s();
                q1 q1Var2 = (q1) q2Var2.f1478d;
                f1 f1Var2 = q1Var2.f8936s;
                v0 v0Var2 = q1Var2.f8937t;
                q1.j(f1Var2);
                c1 c1Var = f1Var2.H;
                if (c1Var.a()) {
                    q1.l(v0Var2);
                    v0Var2.A.a("Deferred Deep Link already retrieved. Not fetching again.");
                    break;
                } else {
                    d1 d1Var = f1Var2.I;
                    long a10 = d1Var.a();
                    d1Var.b(1 + a10);
                    if (a10 >= 5) {
                        q1.l(v0Var2);
                        v0Var2.f9053w.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        c1Var.b(true);
                        break;
                    } else {
                        if (q2Var2.G == null) {
                            q2Var2.G = new g2(q2Var2, q1Var2, 3);
                        }
                        q2Var2.G.b(0L);
                        break;
                    }
                }
            default:
                this.f8693e.P();
                break;
        }
    }
}
