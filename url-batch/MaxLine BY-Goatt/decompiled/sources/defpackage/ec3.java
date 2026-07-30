package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.google.firebase.encoders.json.BuildConfig;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ec3 extends rp3 {
    public Boolean n;
    public String o;
    public dc3 p;
    public Boolean q;

    public final String A(String str) {
        pj3 pj3Var = (pj3) this.m;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, BuildConfig.FLAVOR);
            ll3.v(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.r.c(e, "Could not find SystemProperties class");
            return BuildConfig.FLAVOR;
        } catch (IllegalAccessException e2) {
            vh3 vh3Var2 = pj3Var.r;
            pj3.m(vh3Var2);
            vh3Var2.r.c(e2, "Could not access SystemProperties.get()");
            return BuildConfig.FLAVOR;
        } catch (NoSuchMethodException e3) {
            vh3 vh3Var3 = pj3Var.r;
            pj3.m(vh3Var3);
            vh3Var3.r.c(e3, "Could not find SystemProperties.get() method");
            return BuildConfig.FLAVOR;
        } catch (InvocationTargetException e4) {
            vh3 vh3Var4 = pj3Var.r;
            pj3.m(vh3Var4);
            vh3Var4.r.c(e4, "SystemProperties.get() threw an exception");
            return BuildConfig.FLAVOR;
        }
    }

    public final void B() {
        ((pj3) this.m).getClass();
    }

    public final String C(String str, tg3 tg3Var) {
        return TextUtils.isEmpty(str) ? (String) tg3Var.a(null) : (String) tg3Var.a(this.p.b(str, tg3Var.a));
    }

    public final long D(String str, tg3 tg3Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) tg3Var.a(null)).longValue();
        }
        String b = this.p.b(str, tg3Var.a);
        if (TextUtils.isEmpty(b)) {
            return ((Long) tg3Var.a(null)).longValue();
        }
        try {
            return ((Long) tg3Var.a(Long.valueOf(Long.parseLong(b)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) tg3Var.a(null)).longValue();
        }
    }

    public final int E(String str, tg3 tg3Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) tg3Var.a(null)).intValue();
        }
        String b = this.p.b(str, tg3Var.a);
        if (TextUtils.isEmpty(b)) {
            return ((Integer) tg3Var.a(null)).intValue();
        }
        try {
            return ((Integer) tg3Var.a(Integer.valueOf(Integer.parseInt(b)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) tg3Var.a(null)).intValue();
        }
    }

    public final double F(String str, tg3 tg3Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) tg3Var.a(null)).doubleValue();
        }
        String b = this.p.b(str, tg3Var.a);
        if (TextUtils.isEmpty(b)) {
            return ((Double) tg3Var.a(null)).doubleValue();
        }
        try {
            return ((Double) tg3Var.a(Double.valueOf(Double.parseDouble(b)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) tg3Var.a(null)).doubleValue();
        }
    }

    public final boolean G(String str, tg3 tg3Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) tg3Var.a(null)).booleanValue();
        }
        String b = this.p.b(str, tg3Var.a);
        return TextUtils.isEmpty(b) ? ((Boolean) tg3Var.a(null)).booleanValue() : ((Boolean) tg3Var.a(Boolean.valueOf(AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(b)))).booleanValue();
    }

    public final Bundle H() {
        pj3 pj3Var = (pj3) this.m;
        try {
            Context context = pj3Var.m;
            Context context2 = pj3Var.m;
            vh3 vh3Var = pj3Var.r;
            if (context.getPackageManager() == null) {
                pj3.m(vh3Var);
                vh3Var.r.b("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo b = i93.a(context2).b(128, context2.getPackageName());
            if (b != null) {
                return b.metaData;
            }
            pj3.m(vh3Var);
            vh3Var.r.b("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            vh3 vh3Var2 = pj3Var.r;
            pj3.m(vh3Var2);
            vh3Var2.r.c(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean I(String str) {
        ll3.s(str);
        Bundle H = H();
        if (H != null) {
            if (H.containsKey(str)) {
                return Boolean.valueOf(H.getBoolean(str));
            }
            return null;
        }
        vh3 vh3Var = ((pj3) this.m).r;
        pj3.m(vh3Var);
        vh3Var.r.b("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean J() {
        ((pj3) this.m).getClass();
        Boolean I = I("firebase_analytics_collection_deactivated");
        return I != null && I.booleanValue();
    }

    public final boolean K() {
        Boolean I = I("google_analytics_automatic_screen_reporting_enabled");
        return I == null || I.booleanValue();
    }

    public final sk3 L(String str, boolean z) {
        Object obj;
        ll3.s(str);
        pj3 pj3Var = (pj3) this.m;
        Bundle H = H();
        if (H == null) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.r.b("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = H.get(str);
        }
        sk3 sk3Var = sk3.UNINITIALIZED;
        if (obj == null) {
            return sk3Var;
        }
        if (Boolean.TRUE.equals(obj)) {
            return sk3.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return sk3.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return sk3.POLICY;
        }
        vh3 vh3Var2 = pj3Var.r;
        pj3.m(vh3Var2);
        vh3Var2.u.c(str, "Invalid manifest metadata for");
        return sk3Var;
    }

    public final boolean x(String str) {
        return AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(this.p.b(str, "gaia_collection_enabled"));
    }

    public final boolean y(String str) {
        return AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(this.p.b(str, "measurement.event_sampling_enabled"));
    }

    public final boolean z() {
        if (this.n == null) {
            Boolean I = I("app_measurement_lite");
            this.n = I;
            if (I == null) {
                this.n = Boolean.FALSE;
            }
        }
        return this.n.booleanValue() || !((pj3) this.m).n;
    }
}
