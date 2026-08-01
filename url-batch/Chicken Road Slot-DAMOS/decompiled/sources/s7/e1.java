package s7;

import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.e9;
import com.google.android.gms.internal.measurement.w8;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public long f8664a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8665b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f8666c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f8667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y1 f8668e;

    public /* synthetic */ e1(f1 f1Var, long j) {
        this.f8668e = f1Var;
        c7.c0.d("health_monitor");
        c7.c0.b(j > 0);
        this.f8665b = "health_monitor:start";
        this.f8666c = "health_monitor:count";
        this.f8667d = "health_monitor:value";
        this.f8664a = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        if (r2 < java.lang.Math.max(0, ((java.lang.Integer) s7.e0.j.a(null)).intValue())) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        if (r2 >= java.lang.Math.max(0, ((java.lang.Integer) s7.e0.j.a(null)).intValue())) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(long j, w8 w8Var) {
        if (((ArrayList) this.f8667d) == null) {
            this.f8667d = new ArrayList();
        }
        if (((ArrayList) this.f8666c) == null) {
            this.f8666c = new ArrayList();
        }
        if (((ArrayList) this.f8667d).isEmpty() || ((((w8) ((ArrayList) this.f8667d).get(0)).A() / 1000) / 60) / 60 == ((w8Var.A() / 1000) / 60) / 60) {
            long m10 = this.f8664a + w8Var.m();
            j4 j4Var = (j4) this.f8668e;
            if (j4Var.e0().D(null, e0.Y0)) {
                if (!((ArrayList) this.f8667d).isEmpty()) {
                    j4Var.e0();
                }
                this.f8664a = m10;
                ((ArrayList) this.f8667d).add(w8Var);
                ((ArrayList) this.f8666c).add(Long.valueOf(j));
                e9 e9Var = (e9) this.f8665b;
                if (((ArrayList) this.f8667d).size() < Math.max(1, j4Var.e0().B(e9Var != null ? e9Var.t() : null, e0.f8632k))) {
                    return true;
                }
            } else {
                j4Var.e0();
            }
        }
        return false;
    }

    public void b() {
        f1 f1Var = (f1) this.f8668e;
        f1Var.s();
        ((q1) f1Var.f1478d).f8942y.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = f1Var.w().edit();
        edit.remove((String) this.f8666c);
        edit.remove((String) this.f8667d);
        edit.putLong((String) this.f8665b, currentTimeMillis);
        edit.apply();
    }

    public /* synthetic */ e1(j4 j4Var) {
        this.f8668e = j4Var;
    }
}
