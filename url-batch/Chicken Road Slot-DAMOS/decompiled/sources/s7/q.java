package s7;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f8926a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8927b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8928c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8929d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8930e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8931f;
    public final t g;

    public q(q1 q1Var, String str, String str2, String str3, long j, long j3, long j10, Bundle bundle) {
        t tVar;
        c7.c0.d(str2);
        c7.c0.d(str3);
        this.f8926a = str2;
        this.f8927b = str3;
        this.f8928c = true == TextUtils.isEmpty(str) ? null : str;
        this.f8929d = j;
        this.f8930e = j3;
        this.f8931f = j10;
        if (j10 != 0 && j10 > j) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9053w.b(v0.A(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            tVar = new t(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    v0 v0Var2 = q1Var.f8937t;
                    q1.l(v0Var2);
                    v0Var2.f9050t.a("Param name can't be null");
                    it.remove();
                } else {
                    p4 p4Var = q1Var.f8940w;
                    q1.j(p4Var);
                    Object B = p4Var.B(bundle2.get(next), next);
                    if (B == null) {
                        v0 v0Var3 = q1Var.f8937t;
                        q1.l(v0Var3);
                        v0Var3.f9053w.b(q1Var.f8941x.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        p4 p4Var2 = q1Var.f8940w;
                        q1.j(p4Var2);
                        p4Var2.J(bundle2, next, B);
                    }
                }
            }
            tVar = new t(bundle2);
        }
        this.g = tVar;
    }

    public final q a(q1 q1Var, long j) {
        return new q(q1Var, this.f8928c, this.f8926a, this.f8927b, this.f8929d, this.f8930e, j, this.g);
    }

    public final String toString() {
        String tVar = this.g.toString();
        String str = this.f8926a;
        int length = String.valueOf(str).length();
        String str2 = this.f8927b;
        StringBuilder sb2 = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + tVar.length() + 1);
        n0.l.l(sb2, "Event{appId='", str, "', name='", str2);
        return v4.a.p(sb2, "', params=", tVar, "}");
    }

    public q(q1 q1Var, String str, String str2, String str3, long j, long j3, long j10, t tVar) {
        c7.c0.d(str2);
        c7.c0.d(str3);
        c7.c0.g(tVar);
        this.f8926a = str2;
        this.f8927b = str3;
        this.f8928c = true == TextUtils.isEmpty(str) ? null : str;
        this.f8929d = j;
        this.f8930e = j3;
        this.f8931f = j10;
        if (j10 != 0 && j10 > j) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9053w.c(v0.A(str2), v0.A(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.g = tVar;
    }
}
