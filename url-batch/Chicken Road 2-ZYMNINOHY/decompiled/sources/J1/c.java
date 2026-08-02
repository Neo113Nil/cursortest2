package J1;

import C2.d;
import E.AbstractC0005f;
import K1.e;
import K1.g;
import K1.j;
import K1.k;
import K1.l;
import K1.n;
import K1.o;
import K1.q;
import K1.r;
import K1.s;
import K1.t;
import K1.u;
import K1.v;
import M1.f;
import a2.i;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import i2.AbstractC0457a;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import t1.h;

/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final h f1159a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f1160b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f1161c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f1162d;

    /* renamed from: e, reason: collision with root package name */
    public final i f1163e;

    /* renamed from: f, reason: collision with root package name */
    public final i f1164f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1165g;

    public c(Context context, i iVar, i iVar2) {
        d dVar = new d();
        K1.c cVar = K1.c.f1465a;
        dVar.a(o.class, cVar);
        dVar.a(K1.i.class, cVar);
        K1.f fVar = K1.f.f1478a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        K1.d dVar2 = K1.d.f1467a;
        dVar.a(q.class, dVar2);
        dVar.a(j.class, dVar2);
        K1.b bVar = K1.b.f1452a;
        dVar.a(K1.a.class, bVar);
        dVar.a(K1.h.class, bVar);
        e eVar = e.f1470a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        g gVar = g.f1486a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.f272d = true;
        this.f1159a = new h(2, dVar);
        this.f1161c = context;
        this.f1160b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f1162d = b(a.f1151c);
        this.f1163e = iVar2;
        this.f1164f = iVar;
        this.f1165g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e4) {
            throw new IllegalArgumentException(AbstractC0005f.n("Invalid url: ", str), e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (((K1.t) K1.t.f1521a.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final L1.i a(L1.i iVar) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.f1160b.getActiveNetworkInfo();
        L1.h c4 = iVar.c();
        int i4 = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c4.f1638f;
        if (hashMap2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap2.put("sdk-version", String.valueOf(i4));
        c4.a(CommonUrlParts.MODEL, Build.MODEL);
        c4.a("hardware", Build.HARDWARE);
        c4.a("device", Build.DEVICE);
        c4.a("product", Build.PRODUCT);
        c4.a("os-uild", Build.ID);
        c4.a(CommonUrlParts.MANUFACTURER, Build.MANUFACTURER);
        c4.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
        HashMap hashMap3 = (HashMap) c4.f1638f;
        if (hashMap3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i5 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = u.f1523a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) c4.f1638f;
        if (hashMap4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = t.f1521a;
                subtype = 100;
            }
            hashMap = (HashMap) c4.f1638f;
            if (hashMap != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c4.a("country", Locale.getDefault().getCountry());
            c4.a(CommonUrlParts.LOCALE, Locale.getDefault().getLanguage());
            Context context = this.f1161c;
            c4.a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i5 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e4) {
                AbstractC0457a.o("CctTransportBackend", "Unable to find version code for package", e4);
            }
            c4.a("application_build", Integer.toString(i5));
            return c4.d();
        }
        SparseArray sparseArray3 = t.f1521a;
        subtype = 0;
        hashMap = (HashMap) c4.f1638f;
        if (hashMap != null) {
        }
    }
}
