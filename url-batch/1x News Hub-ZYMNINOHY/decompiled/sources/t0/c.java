package t0;

import E1.AbstractC0033i;
import K0.j;
import a.AbstractC0129a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import b0.r;
import g1.C0335d;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import u0.AbstractC1217a;
import u0.C1218b;
import u0.C1219c;
import u0.C1220d;
import u0.e;
import u0.f;
import u0.h;
import u0.i;
import u0.k;
import u0.l;
import u0.n;
import u0.o;
import u0.q;
import u0.s;
import u0.t;
import u0.u;
import u0.v;
import w0.g;

/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final r f10364a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f10365b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f10366c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f10367d;

    /* renamed from: e, reason: collision with root package name */
    public final j f10368e;
    public final j f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10369g;

    public c(Context context, j jVar, j jVar2) {
        C0335d c0335d = new C0335d();
        C1219c c1219c = C1219c.f10469a;
        c0335d.a(o.class, c1219c);
        c0335d.a(i.class, c1219c);
        f fVar = f.f10481a;
        c0335d.a(s.class, fVar);
        c0335d.a(l.class, fVar);
        C1220d c1220d = C1220d.f10471a;
        c0335d.a(q.class, c1220d);
        c0335d.a(u0.j.class, c1220d);
        C1218b c1218b = C1218b.f10457a;
        c0335d.a(AbstractC1217a.class, c1218b);
        c0335d.a(h.class, c1218b);
        e eVar = e.f10474a;
        c0335d.a(u0.r.class, eVar);
        c0335d.a(k.class, eVar);
        u0.g gVar = u0.g.f10488a;
        c0335d.a(v.class, gVar);
        c0335d.a(n.class, gVar);
        c0335d.f5046d = true;
        this.f10364a = new r(c0335d);
        this.f10366c = context;
        this.f10365b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f10367d = b(C1189a.f10356c);
        this.f10368e = jVar2;
        this.f = jVar;
        this.f10369g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e3) {
            throw new IllegalArgumentException(AbstractC0033i.j("Invalid url: ", str), e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (((u0.t) u0.t.f10520a.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v0.h a(v0.h hVar) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.f10365b.getActiveNetworkInfo();
        F1.c c3 = hVar.c();
        int i3 = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c3.f;
        if (hashMap2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap2.put("sdk-version", String.valueOf(i3));
        c3.a(CommonUrlParts.MODEL, Build.MODEL);
        c3.a("hardware", Build.HARDWARE);
        c3.a("device", Build.DEVICE);
        c3.a("product", Build.PRODUCT);
        c3.a("os-uild", Build.ID);
        c3.a(CommonUrlParts.MANUFACTURER, Build.MANUFACTURER);
        c3.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
        HashMap hashMap3 = (HashMap) c3.f;
        if (hashMap3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i4 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = u.f10522a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) c3.f;
        if (hashMap4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = t.f10520a;
                subtype = 100;
            }
            hashMap = (HashMap) c3.f;
            if (hashMap != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c3.a("country", Locale.getDefault().getCountry());
            c3.a(CommonUrlParts.LOCALE, Locale.getDefault().getLanguage());
            Context context = this.f10366c;
            c3.a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i4 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e3) {
                AbstractC0129a.l("CctTransportBackend", "Unable to find version code for package", e3);
            }
            c3.a("application_build", Integer.toString(i4));
            return c3.c();
        }
        SparseArray sparseArray3 = t.f10520a;
        subtype = 0;
        hashMap = (HashMap) c3.f;
        if (hashMap != null) {
        }
    }
}
