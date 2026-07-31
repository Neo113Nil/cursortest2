package B0;

import C0.h;
import C0.i;
import C0.j;
import C0.k;
import C0.l;
import C0.n;
import C0.o;
import C0.q;
import C0.r;
import C0.s;
import C0.t;
import C0.u;
import C0.v;
import E0.f;
import V5.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import m1.AbstractC0521b;

/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final g f77a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f78b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f79c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f80d;

    /* renamed from: e, reason: collision with root package name */
    public final M0.a f81e;

    /* renamed from: f, reason: collision with root package name */
    public final M0.a f82f;

    /* renamed from: g, reason: collision with root package name */
    public final int f83g;

    public e(Context context, M0.a aVar, M0.a aVar2) {
        v1.d dVar = new v1.d();
        C0.c cVar = C0.c.f127a;
        dVar.a(o.class, cVar);
        dVar.a(i.class, cVar);
        C0.f fVar = C0.f.f140a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        C0.d dVar2 = C0.d.f129a;
        dVar.a(q.class, dVar2);
        dVar.a(j.class, dVar2);
        C0.b bVar = C0.b.f114a;
        dVar.a(C0.a.class, bVar);
        dVar.a(h.class, bVar);
        C0.e eVar = C0.e.f132a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        C0.g gVar = C0.g.f148a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.f6116d = true;
        this.f77a = new g(14, dVar);
        this.f79c = context;
        this.f78b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f80d = b(a.f62c);
        this.f81e = aVar2;
        this.f82f = aVar;
        this.f83g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e4) {
            throw new IllegalArgumentException(C1.c.h("Invalid url: ", str), e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (((C0.t) C0.t.f183f.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D0.i a(D0.i iVar) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.f78b.getActiveNetworkInfo();
        D0.h c7 = iVar.c();
        int i7 = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c7.f335g;
        if (hashMap2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap2.put("sdk-version", String.valueOf(i7));
        c7.a("model", Build.MODEL);
        c7.a("hardware", Build.HARDWARE);
        c7.a("device", Build.DEVICE);
        c7.a("product", Build.PRODUCT);
        c7.a("os-uild", Build.ID);
        c7.a("manufacturer", Build.MANUFACTURER);
        c7.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap hashMap3 = (HashMap) c7.f335g;
        if (hashMap3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i8 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = u.f185f;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) c7.f335g;
        if (hashMap4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = t.f183f;
                subtype = 100;
            }
            hashMap = (HashMap) c7.f335g;
            if (hashMap != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c7.a("country", Locale.getDefault().getCountry());
            c7.a("locale", Locale.getDefault().getLanguage());
            Context context = this.f79c;
            c7.a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i8 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e4) {
                AbstractC0521b.l("CctTransportBackend", "Unable to find version code for package", e4);
            }
            c7.a("application_build", Integer.toString(i8));
            return c7.c();
        }
        SparseArray sparseArray3 = t.f183f;
        subtype = 0;
        hashMap = (HashMap) c7.f335g;
        if (hashMap != null) {
        }
    }
}
