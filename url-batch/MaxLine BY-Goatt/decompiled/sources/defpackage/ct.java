package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.facebook.appevents.UserDataStore;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ct implements mz2 {
    public final ConnectivityManager b;
    public final Context c;
    public final dq2 e;
    public final dq2 f;
    public final DataEncoder a = new JsonDataEncoderBuilder().configureWith(qb2.F).ignoreNullValues(true).build();
    public final URL d = b(fr.c);
    public final int g = 130000;

    public ct(Context context, dq2 dq2Var, dq2 dq2Var2) {
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.e = dq2Var2;
        this.f = dq2Var;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(q40.l("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (((defpackage.sr1) defpackage.sr1.m.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wl a(wl wlVar) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        sf c = wlVar.c();
        int i = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c.f;
        if (hashMap2 == null) {
            lh.g("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap2.put("sdk-version", String.valueOf(i));
        c.b(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
        c.b("hardware", Build.HARDWARE);
        c.b(DeviceRequestsHelper.DEVICE_INFO_DEVICE, Build.DEVICE);
        c.b("product", Build.PRODUCT);
        c.b("os-uild", Build.ID);
        c.b("manufacturer", Build.MANUFACTURER);
        c.b("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap hashMap3 = (HashMap) c.f;
        if (hashMap3 == null) {
            lh.g("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = tr1.m;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) c.f;
        if (hashMap4 == null) {
            lh.g("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = sr1.m;
                subtype = 100;
            }
            hashMap = (HashMap) c.f;
            if (hashMap != null) {
                lh.g("Property \"autoMetadata\" has not been set");
                return null;
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c.b(UserDataStore.COUNTRY, Locale.getDefault().getCountry());
            c.b("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            c.b("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                s93.D("CctTransportBackend", "Unable to find version code for package", e);
            }
            c.b("application_build", Integer.toString(i2));
            return c.e();
        }
        SparseArray sparseArray3 = sr1.m;
        subtype = 0;
        hashMap = (HashMap) c.f;
        if (hashMap != null) {
        }
    }
}
