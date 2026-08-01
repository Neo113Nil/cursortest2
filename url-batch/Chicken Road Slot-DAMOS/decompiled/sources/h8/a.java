package h8;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.a6;
import com.google.android.gms.internal.measurement.d7;
import com.google.android.gms.internal.measurement.q6;
import com.google.android.gms.internal.measurement.r6;
import com.google.android.gms.internal.measurement.s6;
import com.google.android.gms.internal.measurement.t6;
import com.google.android.gms.internal.measurement.u6;
import com.google.android.gms.internal.measurement.w6;
import com.google.android.gms.internal.measurement.x6;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import s7.r2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements r2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d7 f4488a;

    public a(d7 d7Var) {
        this.f4488a = d7Var;
    }

    @Override // s7.r2
    public final void a(String str, String str2, Bundle bundle) {
        d7 d7Var = this.f4488a;
        d7Var.a(new r6(d7Var, str, str2, bundle, 1));
    }

    @Override // s7.r2
    public final long b() {
        return this.f4488a.d();
    }

    @Override // s7.r2
    public final String c() {
        a6 a6Var = new a6();
        d7 d7Var = this.f4488a;
        d7Var.a(new w6(d7Var, a6Var, 3, false));
        return (String) a6.E(a6Var.D(500L), String.class);
    }

    @Override // s7.r2
    public final void d(String str, String str2, Bundle bundle) {
        d7 d7Var = this.f4488a;
        d7Var.a(new r6(d7Var, str, str2, bundle, 0));
    }

    @Override // s7.r2
    public final String e() {
        a6 a6Var = new a6();
        d7 d7Var = this.f4488a;
        d7Var.a(new w6(d7Var, a6Var, 4, false));
        return (String) a6.E(a6Var.D(500L), String.class);
    }

    @Override // s7.r2
    public final List f(String str, String str2) {
        a6 a6Var = new a6();
        d7 d7Var = this.f4488a;
        d7Var.a(new s6(d7Var, str, str2, a6Var));
        List list = (List) a6.E(a6Var.D(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // s7.r2
    public final void g(Bundle bundle) {
        d7 d7Var = this.f4488a;
        d7Var.a(new q6(d7Var, bundle, 1));
    }

    @Override // s7.r2
    public final int h(String str) {
        a6 a6Var = new a6();
        d7 d7Var = this.f4488a;
        d7Var.a(new t6(d7Var, str, a6Var, 1));
        Integer num = (Integer) a6.E(a6Var.D(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // s7.r2
    public final String i() {
        a6 a6Var = new a6();
        d7 d7Var = this.f4488a;
        d7Var.a(new w6(d7Var, a6Var, 1));
        return (String) a6.E(a6Var.D(50L), String.class);
    }

    @Override // s7.r2
    public final void j(String str) {
        d7 d7Var = this.f4488a;
        d7Var.a(new u6(d7Var, str, 1));
    }

    @Override // s7.r2
    public final String k() {
        a6 a6Var = new a6();
        d7 d7Var = this.f4488a;
        d7Var.a(new w6(d7Var, a6Var, 0));
        return (String) a6.E(a6Var.D(500L), String.class);
    }

    @Override // s7.r2
    public final Map l(String str, String str2, boolean z10) {
        a6 a6Var = new a6();
        d7 d7Var = this.f4488a;
        d7Var.a(new x6(d7Var, str, str2, z10, a6Var));
        Bundle D = a6Var.D(5000L);
        if (D == null || D.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(D.size());
        for (String str3 : D.keySet()) {
            Object obj = D.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    @Override // s7.r2
    public final void m(String str) {
        d7 d7Var = this.f4488a;
        d7Var.a(new u6(d7Var, str, 0));
    }
}
