package s7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.onesignal.core.activities.PermissionsActivity;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends c1.b {

    /* renamed from: e, reason: collision with root package name */
    public Boolean f8699e;

    /* renamed from: i, reason: collision with root package name */
    public String f8700i;

    /* renamed from: r, reason: collision with root package name */
    public f f8701r;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f8702s;

    public final long A(String str, d0 d0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) d0Var.a(null)).longValue();
        }
        String c10 = this.f8701r.c(str, d0Var.f8570a);
        if (TextUtils.isEmpty(c10)) {
            return ((Long) d0Var.a(null)).longValue();
        }
        try {
            return ((Long) d0Var.a(Long.valueOf(Long.parseLong(c10)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) d0Var.a(null)).longValue();
        }
    }

    public final int B(String str, d0 d0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) d0Var.a(null)).intValue();
        }
        String c10 = this.f8701r.c(str, d0Var.f8570a);
        if (TextUtils.isEmpty(c10)) {
            return ((Integer) d0Var.a(null)).intValue();
        }
        try {
            return ((Integer) d0Var.a(Integer.valueOf(Integer.parseInt(c10)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) d0Var.a(null)).intValue();
        }
    }

    public final double C(String str, d0 d0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) d0Var.a(null)).doubleValue();
        }
        String c10 = this.f8701r.c(str, d0Var.f8570a);
        if (TextUtils.isEmpty(c10)) {
            return ((Double) d0Var.a(null)).doubleValue();
        }
        try {
            return ((Double) d0Var.a(Double.valueOf(Double.parseDouble(c10)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) d0Var.a(null)).doubleValue();
        }
    }

    public final boolean D(String str, d0 d0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) d0Var.a(null)).booleanValue();
        }
        String c10 = this.f8701r.c(str, d0Var.f8570a);
        return TextUtils.isEmpty(c10) ? ((Boolean) d0Var.a(null)).booleanValue() : ((Boolean) d0Var.a(Boolean.valueOf("1".equals(c10)))).booleanValue();
    }

    public final Bundle E() {
        q1 q1Var = (q1) this.f1478d;
        try {
            Context context = q1Var.f8932d;
            Context context2 = q1Var.f8932d;
            v0 v0Var = q1Var.f8937t;
            if (context.getPackageManager() == null) {
                q1.l(v0Var);
                v0Var.f9050t.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo d10 = i7.b.a(context2).d(128, context2.getPackageName());
            if (d10 != null) {
                return d10.metaData;
            }
            q1.l(v0Var);
            v0Var.f9050t.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            v0 v0Var2 = q1Var.f8937t;
            q1.l(v0Var2);
            v0Var2.f9050t.b(e2, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean F(String str) {
        c7.c0.d(str);
        Bundle E = E();
        if (E != null) {
            if (E.containsKey(str)) {
                return Boolean.valueOf(E.getBoolean(str));
            }
            return null;
        }
        v0 v0Var = ((q1) this.f1478d).f8937t;
        q1.l(v0Var);
        v0Var.f9050t.a("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean G() {
        ((q1) this.f1478d).getClass();
        Boolean F = F("firebase_analytics_collection_deactivated");
        return F != null && F.booleanValue();
    }

    public final boolean H() {
        Boolean F = F("google_analytics_automatic_screen_reporting_enabled");
        return F == null || F.booleanValue();
    }

    public final z1 I(String str, boolean z10) {
        Object obj;
        c7.c0.d(str);
        q1 q1Var = (q1) this.f1478d;
        Bundle E = E();
        if (E == null) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9050t.a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = E.get(str);
        }
        z1 z1Var = z1.UNINITIALIZED;
        if (obj == null) {
            return z1Var;
        }
        if (Boolean.TRUE.equals(obj)) {
            return z1.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return z1.DENIED;
        }
        if (z10 && "eu_consent_policy".equals(obj)) {
            return z1.POLICY;
        }
        v0 v0Var2 = q1Var.f8937t;
        q1.l(v0Var2);
        v0Var2.f9053w.b(str, "Invalid manifest metadata for");
        return z1Var;
    }

    public final boolean t(String str) {
        q1.j(((q1) this.f1478d).f8940w);
        if (p4.U((String) e0.f8624g1.a(null), str) || p4.U((String) e0.f8626h1.a(null), str) || p4.U((String) e0.f8629i1.a(null), str)) {
            return true;
        }
        return "1".equals(this.f8701r.c(str, "gaia_collection_enabled"));
    }

    public final boolean u(String str) {
        return "1".equals(this.f8701r.c(str, "measurement.event_sampling_enabled"));
    }

    public final boolean v() {
        if (this.f8699e == null) {
            Boolean F = F("app_measurement_lite");
            this.f8699e = F;
            if (F == null) {
                this.f8699e = Boolean.FALSE;
            }
        }
        return this.f8699e.booleanValue() || !((q1) this.f1478d).f8933e;
    }

    public final String w(String str) {
        q1 q1Var = (q1) this.f1478d;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            c7.c0.g(str2);
            return str2;
        } catch (ClassNotFoundException e2) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9050t.b(e2, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e9) {
            v0 v0Var2 = q1Var.f8937t;
            q1.l(v0Var2);
            v0Var2.f9050t.b(e9, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e10) {
            v0 v0Var3 = q1Var.f8937t;
            q1.l(v0Var3);
            v0Var3.f9050t.b(e10, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e11) {
            v0 v0Var4 = q1Var.f8937t;
            q1.l(v0Var4);
            v0Var4.f9050t.b(e11, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final int x(String str, boolean z10) {
        int i3 = PermissionsActivity.DELAY_TIME_CALLBACK_CALL;
        if (z10) {
            i3 = Math.max(Math.min(B(str, e0.f8623g0), PermissionsActivity.DELAY_TIME_CALLBACK_CALL), 100);
        }
        return Math.max(i3, 256);
    }

    public final void y() {
        ((q1) this.f1478d).getClass();
    }

    public final String z(String str, d0 d0Var) {
        return TextUtils.isEmpty(str) ? (String) d0Var.a(null) : (String) d0Var.a(this.f8701r.c(str, d0Var.f8570a));
    }
}
