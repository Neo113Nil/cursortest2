package i6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.appsflyer.AdRevenueScheme;
import com.google.android.gms.internal.measurement.ra;
import j6.f;
import j6.g;
import j6.h;
import j6.i;
import j6.j;
import j6.k;
import j6.l;
import j6.n;
import j6.o;
import j6.q;
import j6.r;
import j6.s;
import j6.t;
import j6.u;
import j6.v;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.collections.i0;
import l.d;
import l6.e;
import s7.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final d f4656a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f4657b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f4658c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f4659d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f4660e;

    /* renamed from: f, reason: collision with root package name */
    public final c0 f4661f;
    public final int g;

    public c(Context context, c0 c0Var, c0 c0Var2) {
        r8.d dVar = new r8.d();
        j6.c cVar = j6.c.f5047a;
        dVar.a(o.class, cVar);
        dVar.a(i.class, cVar);
        f fVar = f.f5059a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        j6.d dVar2 = j6.d.f5049a;
        dVar.a(q.class, dVar2);
        dVar.a(j.class, dVar2);
        j6.b bVar = j6.b.f5036a;
        dVar.a(j6.a.class, bVar);
        dVar.a(h.class, bVar);
        j6.e eVar = j6.e.f5052a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        g gVar = g.f5066a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.f8220d = true;
        this.f4656a = new d(18, dVar);
        this.f4658c = context;
        this.f4657b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f4659d = b(a.f4647c);
        this.f4660e = c0Var2;
        this.f4661f = c0Var;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(v4.a.k("Invalid url: ", str), e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (((j6.t) j6.t.f5098d.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k6.h a(k6.h hVar) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.f4657b.getActiveNetworkInfo();
        ra c10 = hVar.c();
        int i3 = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c10.f2742f;
        if (hashMap2 == null) {
            i0.l("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap2.put("sdk-version", String.valueOf(i3));
        c10.a("model", Build.MODEL);
        c10.a("hardware", Build.HARDWARE);
        c10.a("device", Build.DEVICE);
        c10.a("product", Build.PRODUCT);
        c10.a("os-uild", Build.ID);
        c10.a("manufacturer", Build.MANUFACTURER);
        c10.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap hashMap3 = (HashMap) c10.f2742f;
        if (hashMap3 == null) {
            i0.l("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i10 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = u.f5100d;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) c10.f2742f;
        if (hashMap4 == null) {
            i0.l("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = t.f5098d;
                subtype = 100;
            }
            hashMap = (HashMap) c10.f2742f;
            if (hashMap != null) {
                i0.l("Property \"autoMetadata\" has not been set");
                return null;
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c10.a(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
            c10.a("locale", Locale.getDefault().getLanguage());
            Context context = this.f4658c;
            c10.a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e2) {
                k7.e.p("CctTransportBackend", "Unable to find version code for package", e2);
            }
            c10.a("application_build", Integer.toString(i10));
            return c10.c();
        }
        SparseArray sparseArray3 = t.f5098d;
        subtype = 0;
        hashMap = (HashMap) c10.f2742f;
        if (hashMap != null) {
        }
    }
}
