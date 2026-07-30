package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.appsflyer.AdRevenueScheme;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class cg implements fj1 {
    public final s40 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final me1 e;
    public final me1 f;
    public final int g;

    public cg(Context context, me1 me1Var, me1 me1Var2) {
        vb0 vb0Var = new vb0();
        na naVar = na.a;
        vb0Var.a(gd.class, naVar);
        vb0Var.a(fb.class, naVar);
        qa qaVar = qa.a;
        vb0Var.a(wi0.class, qaVar);
        vb0Var.a(rb.class, qaVar);
        oa oaVar = oa.a;
        vb0Var.a(hh.class, oaVar);
        vb0Var.a(gb.class, oaVar);
        ma maVar = ma.a;
        vb0Var.a(l3.class, maVar);
        vb0Var.a(db.class, maVar);
        pa paVar = pa.a;
        vb0Var.a(ti0.class, paVar);
        vb0Var.a(qb.class, paVar);
        ra raVar = ra.a;
        vb0Var.a(dp0.class, raVar);
        vb0Var.a(tb.class, raVar);
        vb0Var.d = true;
        this.a = new s40(25, vb0Var);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(gf.c);
        this.e = me1Var2;
        this.f = me1Var;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(qy0.j("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (((defpackage.bp0) defpackage.bp0.d.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kb a(kb kbVar) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        jb c = kbVar.c();
        int i = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c.f;
        if (hashMap2 == null) {
            dd0.j("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap2.put("sdk-version", String.valueOf(i));
        c.f("model", Build.MODEL);
        c.f("hardware", Build.HARDWARE);
        c.f("device", Build.DEVICE);
        c.f("product", Build.PRODUCT);
        c.f("os-uild", Build.ID);
        c.f("manufacturer", Build.MANUFACTURER);
        c.f("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap hashMap3 = (HashMap) c.f;
        if (hashMap3 == null) {
            dd0.j("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = cp0.d;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) c.f;
        if (hashMap4 == null) {
            dd0.j("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = bp0.d;
                subtype = 100;
            }
            hashMap = (HashMap) c.f;
            if (hashMap != null) {
                dd0.j("Property \"autoMetadata\" has not been set");
                return null;
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c.f(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
            c.f("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            c.f("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                xa0.l("CctTransportBackend", "Unable to find version code for package", e);
            }
            c.f("application_build", Integer.toString(i2));
            return c.g();
        }
        SparseArray sparseArray3 = bp0.d;
        subtype = 0;
        hashMap = (HashMap) c.f;
        if (hashMap != null) {
        }
    }
}
