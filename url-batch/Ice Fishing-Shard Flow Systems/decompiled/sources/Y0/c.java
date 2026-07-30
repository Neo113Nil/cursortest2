package Y0;

import D6.z;
import Z0.e;
import Z0.g;
import Z0.h;
import Z0.i;
import Z0.j;
import Z0.k;
import Z0.l;
import Z0.n;
import Z0.o;
import Z0.q;
import Z0.r;
import Z0.s;
import Z0.t;
import Z0.u;
import Z0.v;
import Z1.d;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import b1.f;
import com.appsflyer.AdRevenueScheme;
import j1.InterfaceC0568a;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final l2.c f2904a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f2905b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2906c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f2907d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0568a f2908e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0568a f2909f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2910g;

    public c(Context context, InterfaceC0568a interfaceC0568a, InterfaceC0568a interfaceC0568a2) {
        d dVar = new d();
        Z0.c cVar = Z0.c.f2948a;
        dVar.a(o.class, cVar);
        dVar.a(i.class, cVar);
        Z0.f fVar = Z0.f.f2961a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        Z0.d dVar2 = Z0.d.f2950a;
        dVar.a(q.class, dVar2);
        dVar.a(j.class, dVar2);
        Z0.b bVar = Z0.b.f2936a;
        dVar.a(Z0.a.class, bVar);
        dVar.a(h.class, bVar);
        e eVar = e.f2953a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        g gVar = g.f2969a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.f3019d = true;
        this.f2904a = new l2.c(dVar);
        this.f2906c = context;
        this.f2905b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f2907d = b(a.f2895c);
        this.f2908e = interfaceC0568a2;
        this.f2909f = interfaceC0568a;
        this.f2910g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e7) {
            throw new IllegalArgumentException(r4.f.i("Invalid url: ", str), e7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (((Z0.t) Z0.t.f3003d.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a1.h a(a1.h hVar) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.f2905b.getActiveNetworkInfo();
        z c7 = hVar.c();
        int i2 = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c7.f644g;
        if (hashMap2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap2.put("sdk-version", String.valueOf(i2));
        c7.g("model", Build.MODEL);
        c7.g("hardware", Build.HARDWARE);
        c7.g("device", Build.DEVICE);
        c7.g("product", Build.PRODUCT);
        c7.g("os-uild", Build.ID);
        c7.g("manufacturer", Build.MANUFACTURER);
        c7.g("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap hashMap3 = (HashMap) c7.f644g;
        if (hashMap3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i5 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = u.f3005d;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) c7.f644g;
        if (hashMap4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = t.f3003d;
                subtype = 100;
            }
            hashMap = (HashMap) c7.f644g;
            if (hashMap != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c7.g(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
            c7.g("locale", Locale.getDefault().getLanguage());
            Context context = this.f2906c;
            c7.g("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i5 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e7) {
                d4.c.l("CctTransportBackend", "Unable to find version code for package", e7);
            }
            c7.g("application_build", Integer.toString(i5));
            return c7.i();
        }
        SparseArray sparseArray3 = t.f3003d;
        subtype = 0;
        hashMap = (HashMap) c7.f644g;
        if (hashMap != null) {
        }
    }
}
