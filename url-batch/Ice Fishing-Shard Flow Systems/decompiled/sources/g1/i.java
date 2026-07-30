package g1;

import D6.z;
import Z0.k;
import Z0.t;
import Z0.u;
import Z0.w;
import a1.l;
import a1.n;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import b1.C0266a;
import com.appsflyer.AdRevenueScheme;
import com.google.firebase.messaging.C0318h;
import d1.C0354a;
import h1.C0469b;
import i1.InterfaceC0542b;
import i1.InterfaceC0543c;
import j1.InterfaceC0568a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import n.w1;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4998a;

    /* renamed from: b, reason: collision with root package name */
    public final b1.e f4999b;

    /* renamed from: c, reason: collision with root package name */
    public final h1.d f5000c;

    /* renamed from: d, reason: collision with root package name */
    public final c f5001d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f5002e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0543c f5003f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0568a f5004g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0568a f5005h;

    /* renamed from: i, reason: collision with root package name */
    public final h1.c f5006i;

    public i(Context context, b1.e eVar, h1.d dVar, c cVar, Executor executor, InterfaceC0543c interfaceC0543c, InterfaceC0568a interfaceC0568a, InterfaceC0568a interfaceC0568a2, h1.c cVar2) {
        this.f4998a = context;
        this.f4999b = eVar;
        this.f5000c = dVar;
        this.f5001d = cVar;
        this.f5002e = executor;
        this.f5003f = interfaceC0543c;
        this.f5004g = interfaceC0568a;
        this.f5005h = interfaceC0568a2;
        this.f5006i = cVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03d5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(a1.i iVar, int i2) {
        byte[] bArr;
        long j;
        C0266a c0266a;
        String str;
        C0266a c0266a2;
        int i5;
        Y0.b d7;
        String str2;
        Integer num;
        w1 w1Var;
        int i7;
        final i iVar2 = this;
        final a1.i iVar3 = iVar;
        byte[] bArr2 = iVar3.f3068b;
        b1.f a7 = iVar2.f4999b.a(iVar3.f3067a);
        long j7 = 0;
        while (true) {
            final int i8 = 0;
            InterfaceC0542b interfaceC0542b = new InterfaceC0542b(iVar2) { // from class: g1.g

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ i f4993e;

                {
                    this.f4993e = iVar2;
                }

                @Override // i1.InterfaceC0542b
                public final Object b() {
                    Boolean bool;
                    switch (i8) {
                        case 0:
                            a1.i iVar4 = iVar3;
                            h1.h hVar = (h1.h) this.f4993e.f5000c;
                            SQLiteDatabase a8 = hVar.a();
                            a8.beginTransaction();
                            try {
                                Long d8 = h1.h.d(a8, iVar4);
                                if (d8 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = hVar.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{d8.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                a8.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a8.endTransaction();
                            }
                        default:
                            h1.h hVar2 = (h1.h) this.f4993e.f5000c;
                            hVar2.getClass();
                            return (Iterable) hVar2.g(new C0318h(hVar2, 6, iVar3));
                    }
                }
            };
            h1.h hVar = (h1.h) iVar2.f5003f;
            if (!((Boolean) hVar.s(interfaceC0542b)).booleanValue()) {
                hVar.s(new h(j7, iVar2, iVar3));
                return;
            }
            final int i9 = 1;
            Iterable iterable = (Iterable) hVar.s(new InterfaceC0542b(iVar2) { // from class: g1.g

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ i f4993e;

                {
                    this.f4993e = iVar2;
                }

                @Override // i1.InterfaceC0542b
                public final Object b() {
                    Boolean bool;
                    switch (i9) {
                        case 0:
                            a1.i iVar4 = iVar3;
                            h1.h hVar2 = (h1.h) this.f4993e.f5000c;
                            SQLiteDatabase a8 = hVar2.a();
                            a8.beginTransaction();
                            try {
                                Long d8 = h1.h.d(a8, iVar4);
                                if (d8 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = hVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{d8.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                a8.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a8.endTransaction();
                            }
                        default:
                            h1.h hVar22 = (h1.h) this.f4993e.f5000c;
                            hVar22.getClass();
                            return (Iterable) hVar22.g(new C0318h(hVar22, 6, iVar3));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (a7 == null) {
                d4.c.k("Uploader", "Unknown backend for %s, deleting event batch for it...", iVar3);
                c0266a2 = new C0266a(-1L, 3);
                bArr = bArr2;
                j = j7;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C0469b) it.next()).f5130c);
                }
                if (bArr2 != null) {
                    h1.c cVar = iVar2.f5006i;
                    Objects.requireNonNull(cVar);
                    C0354a c0354a = (C0354a) hVar.s(new A4.b(9, cVar));
                    z zVar = new z(3);
                    zVar.f644g = new HashMap();
                    zVar.f642e = Long.valueOf(iVar2.f5004g.d());
                    zVar.f643f = Long.valueOf(iVar2.f5005h.d());
                    zVar.f639b = "GDT_CLIENT_METRICS";
                    X0.c cVar2 = new X0.c("proto");
                    c0354a.getClass();
                    D0.j jVar = n.f3074a;
                    jVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        jVar.E(c0354a, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    zVar.f641d = new l(cVar2, byteArrayOutputStream.toByteArray());
                    arrayList.add(((Y0.c) a7).a(zVar.i()));
                }
                Y0.c cVar3 = (Y0.c) a7;
                HashMap hashMap = new HashMap();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    a1.h hVar2 = (a1.h) obj;
                    String str3 = hVar2.f3061a;
                    if (hashMap.containsKey(str3)) {
                        ((List) hashMap.get(str3)).add(hVar2);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(hVar2);
                        hashMap.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    a1.h hVar3 = (a1.h) ((List) entry.getValue()).get(0);
                    w wVar = w.f3007d;
                    long d8 = cVar3.f2909f.d();
                    long d9 = cVar3.f2908e.d();
                    Z0.j jVar2 = new Z0.j(new Z0.h(Integer.valueOf(hVar3.b("sdk-version")), hVar3.a("model"), hVar3.a("hardware"), hVar3.a("device"), hVar3.a("product"), hVar3.a("os-uild"), hVar3.a("manufacturer"), hVar3.a("fingerprint"), hVar3.a("locale"), hVar3.a(AdRevenueScheme.COUNTRY), hVar3.a("mcc_mnc"), hVar3.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (a1.h hVar4 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        l lVar = hVar4.f3063c;
                        X0.c cVar4 = lVar.f3071a;
                        byte[] bArr4 = lVar.f3072b;
                        long j8 = j7;
                        if (cVar4.equals(new X0.c("proto"))) {
                            w1Var = new w1();
                            w1Var.f6944l = bArr4;
                        } else if (cVar4.equals(new X0.c("json"))) {
                            String str4 = new String(bArr4, Charset.forName("UTF-8"));
                            w1 w1Var2 = new w1();
                            w1Var2.f6945m = str4;
                            w1Var = w1Var2;
                        } else {
                            String u7 = d4.c.u("CctTransportBackend");
                            if (Log.isLoggable(u7, 5)) {
                                Log.w(u7, "Received event of unsupported encoding " + cVar4 + ". Skipping...");
                            }
                            bArr2 = bArr3;
                            j7 = j8;
                        }
                        w1Var.f6941d = Long.valueOf(hVar4.f3064d);
                        w1Var.f6943i = Long.valueOf(hVar4.f3065e);
                        String str5 = (String) hVar4.f3066f.get("tz-offset");
                        w1Var.f6946n = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        w1Var.f6947o = new Z0.n((u) u.f3005d.get(hVar4.b("net-type")), (t) t.f3003d.get(hVar4.b("mobile-subtype")));
                        Integer num2 = hVar4.f3062b;
                        if (num2 != null) {
                            w1Var.f6942e = num2;
                        }
                        String str6 = ((Long) w1Var.f6941d) == null ? " eventTimeMs" : "";
                        if (((Long) w1Var.f6943i) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) w1Var.f6946n) == null) {
                            str6 = r4.f.c(str6, " timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str6));
                        }
                        arrayList4.add(new k(((Long) w1Var.f6941d).longValue(), (Integer) w1Var.f6942e, ((Long) w1Var.f6943i).longValue(), (byte[]) w1Var.f6944l, (String) w1Var.f6945m, ((Long) w1Var.f6946n).longValue(), (Z0.n) w1Var.f6947o));
                        bArr2 = bArr3;
                        j7 = j8;
                    }
                    arrayList3.add(new Z0.l(d8, d9, jVar2, num, str2, arrayList4));
                    bArr2 = bArr2;
                }
                bArr = bArr2;
                j = j7;
                Z0.i iVar4 = new Z0.i(arrayList3);
                URL url = cVar3.f2907d;
                if (bArr != null) {
                    try {
                        Y0.a a8 = Y0.a.a(bArr);
                        str = a8.f2900b;
                        if (str == null) {
                            str = null;
                        }
                        String str7 = a8.f2899a;
                        if (str7 != null) {
                            url = Y0.c.b(str7);
                        }
                    } catch (IllegalArgumentException unused3) {
                        c0266a = new C0266a(-1L, 3);
                    }
                } else {
                    str = null;
                }
                int i11 = 3;
                try {
                    int i12 = 7;
                    D0.j jVar3 = new D0.j(url, iVar4, str, i12);
                    A4.b bVar = new A4.b(i11, cVar3);
                    int i13 = 5;
                    do {
                        d7 = bVar.d(jVar3);
                        URL url2 = d7.f2902b;
                        if (url2 != null) {
                            d4.c.k("CctTransportBackend", "Following redirect to: %s", url2);
                            jVar3 = new D0.j(url2, (Z0.i) jVar3.f331i, (String) jVar3.f332l, i12);
                        } else {
                            jVar3 = null;
                        }
                        if (jVar3 == null) {
                            break;
                        } else {
                            i13--;
                        }
                    } while (i13 >= 1);
                    int i14 = d7.f2901a;
                    if (i14 == 200) {
                        c0266a2 = new C0266a(d7.f2903c, 1);
                    } else {
                        if (i14 >= 500 || i14 == 404) {
                            c0266a = new C0266a(-1L, 2);
                        } else if (i14 == 400) {
                            try {
                                c0266a = new C0266a(-1L, 4);
                            } catch (IOException e7) {
                                e = e7;
                                d4.c.l("CctTransportBackend", "Could not make request to the backend", e);
                                i5 = 2;
                                c0266a2 = new C0266a(-1L, 2);
                                i7 = c0266a2.f4135a;
                                if (i7 != i5) {
                                }
                            }
                        } else {
                            c0266a = new C0266a(-1L, 3);
                        }
                        c0266a2 = c0266a;
                    }
                } catch (IOException e8) {
                    e = e8;
                }
            }
            i5 = 2;
            i7 = c0266a2.f4135a;
            if (i7 != i5) {
                hVar.s(new T1.b(this, iterable, iVar, j));
                this.f5001d.a(iVar, i2 + 1, true);
                return;
            }
            iVar2 = this;
            iVar3 = iVar;
            j7 = j;
            hVar.s(new C0318h(iVar2, 4, iterable));
            if (i7 == 1) {
                j7 = Math.max(j7, c0266a2.f4136b);
                if (bArr != null) {
                    hVar.s(new A4.b(11, iVar2));
                }
            } else if (i7 == 4) {
                HashMap hashMap2 = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String str8 = ((C0469b) it2.next()).f5130c.f3061a;
                    if (hashMap2.containsKey(str8)) {
                        hashMap2.put(str8, Integer.valueOf(((Integer) hashMap2.get(str8)).intValue() + 1));
                    } else {
                        hashMap2.put(str8, 1);
                    }
                }
                hVar.s(new C0318h(iVar2, 5, hashMap2));
            }
            bArr2 = bArr;
        }
    }
}
