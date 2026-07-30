package p1;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f7107b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f7108c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f7110e;

    public /* synthetic */ x(g0 g0Var, b0 b0Var, int i7, g0 g0Var2, int i8) {
        this.f7106a = i8;
        this.f7108c = b0Var;
        this.f7109d = i7;
        this.f7110e = g0Var2;
        this.f7107b = g0Var;
    }

    @Override // p1.g0
    public final int f() {
        switch (this.f7106a) {
        }
        return this.f7107b.f();
    }

    @Override // p1.g0
    public final int n() {
        switch (this.f7106a) {
        }
        return this.f7107b.n();
    }

    @Override // p1.g0
    public final Map o() {
        switch (this.f7106a) {
        }
        return this.f7107b.o();
    }

    @Override // p1.g0
    public final void p() {
        boolean z8;
        switch (this.f7106a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f7109d;
                b0 b0Var = this.f7108c;
                b0Var.f7022j = i7;
                this.f7110e.p();
                Set entrySet = b0Var.f7029q.entrySet();
                r6.k.f(entrySet, "<this>");
                Iterator it = entrySet.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    t0 t0Var = (t0) entry.getValue();
                    int k8 = b0Var.f7030r.k(key);
                    if (k8 < 0 || k8 >= b0Var.f7022j) {
                        t0Var.a();
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        it.remove();
                    }
                }
                break;
            default:
                int i8 = this.f7109d;
                b0 b0Var2 = this.f7108c;
                b0Var2.f7021i = i8;
                this.f7110e.p();
                b0Var2.d(b0Var2.f7021i);
                break;
        }
    }

    @Override // p1.g0
    public final q6.c q() {
        switch (this.f7106a) {
        }
        return this.f7107b.q();
    }
}
