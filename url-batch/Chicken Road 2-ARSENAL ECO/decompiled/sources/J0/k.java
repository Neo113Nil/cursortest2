package J0;

import C0.n;
import C0.t;
import C0.u;
import C0.w;
import D0.m;
import D0.o;
import H1.C0133g;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
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
import k.v0;
import m1.AbstractC0521b;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1269a;

    /* renamed from: b, reason: collision with root package name */
    public final E0.e f1270b;

    /* renamed from: c, reason: collision with root package name */
    public final K0.d f1271c;

    /* renamed from: d, reason: collision with root package name */
    public final d f1272d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f1273e;

    /* renamed from: f, reason: collision with root package name */
    public final L0.c f1274f;

    /* renamed from: g, reason: collision with root package name */
    public final M0.a f1275g;

    /* renamed from: h, reason: collision with root package name */
    public final M0.a f1276h;

    /* renamed from: i, reason: collision with root package name */
    public final K0.c f1277i;

    public k(Context context, E0.e eVar, K0.d dVar, d dVar2, Executor executor, L0.c cVar, M0.a aVar, M0.a aVar2, K0.c cVar2) {
        this.f1269a = context;
        this.f1270b = eVar;
        this.f1271c = dVar;
        this.f1272d = dVar2;
        this.f1273e = executor;
        this.f1274f = cVar;
        this.f1275g = aVar;
        this.f1276h = aVar2;
        this.f1277i = cVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03dd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(D0.j jVar, int i7) {
        byte[] bArr;
        long j4;
        E0.a aVar;
        String str;
        int i8;
        B0.d d7;
        String str2;
        Integer num;
        v0 v0Var;
        ArrayList arrayList;
        int i9;
        long j7;
        final k kVar = this;
        final D0.j jVar2 = jVar;
        byte[] bArr2 = jVar2.f343b;
        E0.f a7 = kVar.f1270b.a(jVar2.f342a);
        long j8 = 0;
        while (true) {
            final int i10 = 0;
            L0.b bVar = new L0.b(kVar) { // from class: J0.h

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ k f1259g;

                {
                    this.f1259g = kVar;
                }

                @Override // L0.b
                public final Object c() {
                    Boolean bool;
                    switch (i10) {
                        case 0:
                            D0.j jVar3 = jVar2;
                            K0.h hVar = (K0.h) this.f1259g.f1271c;
                            SQLiteDatabase a8 = hVar.a();
                            a8.beginTransaction();
                            try {
                                Long d8 = K0.h.d(a8, jVar3);
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
                            K0.h hVar2 = (K0.h) this.f1259g.f1271c;
                            hVar2.getClass();
                            return (Iterable) hVar2.e(new C0133g(hVar2, 5, jVar2));
                    }
                }
            };
            K0.h hVar = (K0.h) kVar.f1274f;
            if (!((Boolean) hVar.m(bVar)).booleanValue()) {
                hVar.m(new j(kVar, jVar2, j8));
                return;
            }
            final int i11 = 1;
            Iterable iterable = (Iterable) hVar.m(new L0.b(kVar) { // from class: J0.h

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ k f1259g;

                {
                    this.f1259g = kVar;
                }

                @Override // L0.b
                public final Object c() {
                    Boolean bool;
                    switch (i11) {
                        case 0:
                            D0.j jVar3 = jVar2;
                            K0.h hVar2 = (K0.h) this.f1259g.f1271c;
                            SQLiteDatabase a8 = hVar2.a();
                            a8.beginTransaction();
                            try {
                                Long d8 = K0.h.d(a8, jVar3);
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
                            K0.h hVar22 = (K0.h) this.f1259g.f1271c;
                            hVar22.getClass();
                            return (Iterable) hVar22.e(new C0133g(hVar22, 5, jVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (a7 == null) {
                AbstractC0521b.i("Uploader", "Unknown backend for %s, deleting event batch for it...", jVar2);
                aVar = new E0.a(-1L, 3);
                bArr = bArr2;
                j4 = j8;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((K0.b) it.next()).f1351c);
                }
                if (bArr2 != null) {
                    K0.c cVar = kVar.f1277i;
                    Objects.requireNonNull(cVar);
                    G0.a aVar2 = (G0.a) hVar.m(new B0.b(6, cVar));
                    D0.h hVar2 = new D0.h(0);
                    hVar2.f335g = new HashMap();
                    hVar2.f333e = Long.valueOf(kVar.f1275g.c());
                    hVar2.f334f = Long.valueOf(kVar.f1276h.c());
                    hVar2.f330b = "GDT_CLIENT_METRICS";
                    A0.c cVar2 = new A0.c("proto");
                    aVar2.getClass();
                    B0.c cVar3 = o.f349a;
                    cVar3.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        cVar3.j(aVar2, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    hVar2.f332d = new m(cVar2, byteArrayOutputStream.toByteArray());
                    arrayList2.add(((B0.e) a7).a(hVar2.c()));
                }
                B0.e eVar = (B0.e) a7;
                HashMap hashMap = new HashMap();
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    D0.i iVar = (D0.i) obj;
                    String str3 = iVar.f336a;
                    if (hashMap.containsKey(str3)) {
                        arrayList = arrayList2;
                        ((List) hashMap.get(str3)).add(iVar);
                    } else {
                        arrayList = arrayList2;
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(iVar);
                        hashMap.put(str3, arrayList3);
                    }
                    arrayList2 = arrayList;
                }
                ArrayList arrayList4 = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    D0.i iVar2 = (D0.i) ((List) entry.getValue()).get(0);
                    w wVar = w.f187f;
                    long c7 = eVar.f82f.c();
                    long c8 = eVar.f81e.c();
                    C0.j jVar3 = new C0.j(new C0.h(Integer.valueOf(iVar2.b("sdk-version")), iVar2.a("model"), iVar2.a("hardware"), iVar2.a("device"), iVar2.a("product"), iVar2.a("os-uild"), iVar2.a("manufacturer"), iVar2.a("fingerprint"), iVar2.a("locale"), iVar2.a("country"), iVar2.a("mcc_mnc"), iVar2.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (D0.i iVar3 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        m mVar = iVar3.f338c;
                        A0.c cVar4 = mVar.f346a;
                        byte[] bArr4 = mVar.f347b;
                        long j9 = j8;
                        if (cVar4.equals(new A0.c("proto"))) {
                            v0Var = new v0();
                            v0Var.f5139i = bArr4;
                        } else if (cVar4.equals(new A0.c("json"))) {
                            String str4 = new String(bArr4, Charset.forName("UTF-8"));
                            v0 v0Var2 = new v0();
                            v0Var2.f5140j = str4;
                            v0Var = v0Var2;
                        } else {
                            String o7 = AbstractC0521b.o("CctTransportBackend");
                            if (Log.isLoggable(o7, 5)) {
                                Log.w(o7, "Received event of unsupported encoding " + cVar4 + ". Skipping...");
                            }
                            bArr2 = bArr3;
                            j8 = j9;
                        }
                        v0Var.f5136f = Long.valueOf(iVar3.f339d);
                        v0Var.f5138h = Long.valueOf(iVar3.f340e);
                        String str5 = (String) iVar3.f341f.get("tz-offset");
                        v0Var.f5141k = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        v0Var.f5142l = new n((u) u.f185f.get(iVar3.b("net-type")), (t) t.f183f.get(iVar3.b("mobile-subtype")));
                        Integer num2 = iVar3.f337b;
                        if (num2 != null) {
                            v0Var.f5137g = num2;
                        }
                        String str6 = ((Long) v0Var.f5136f) == null ? " eventTimeMs" : "";
                        if (((Long) v0Var.f5138h) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) v0Var.f5141k) == null) {
                            str6 = W4.o.d(str6, " timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str6));
                        }
                        arrayList5.add(new C0.k(((Long) v0Var.f5136f).longValue(), (Integer) v0Var.f5137g, ((Long) v0Var.f5138h).longValue(), (byte[]) v0Var.f5139i, (String) v0Var.f5140j, ((Long) v0Var.f5141k).longValue(), (n) v0Var.f5142l));
                        bArr2 = bArr3;
                        j8 = j9;
                    }
                    arrayList4.add(new C0.l(c7, c8, jVar3, num, str2, arrayList5));
                }
                bArr = bArr2;
                j4 = j8;
                C0.i iVar4 = new C0.i(arrayList4);
                URL url = eVar.f80d;
                if (bArr != null) {
                    try {
                        B0.a a8 = B0.a.a(bArr);
                        str = a8.f67b;
                        if (str == null) {
                            str = null;
                        }
                        String str7 = a8.f66a;
                        if (str7 != null) {
                            url = B0.e.b(str7);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new E0.a(-1L, 3);
                    }
                } else {
                    str = null;
                }
                try {
                    int i13 = 0;
                    B0.c cVar5 = new B0.c(url, iVar4, str, i13);
                    B0.b bVar2 = new B0.b(i13, eVar);
                    int i14 = 5;
                    do {
                        d7 = bVar2.d(cVar5);
                        URL url2 = d7.f75b;
                        if (url2 != null) {
                            AbstractC0521b.i("CctTransportBackend", "Following redirect to: %s", url2);
                            cVar5 = new B0.c(url2, (C0.i) cVar5.f73i, (String) cVar5.f71g, 0);
                        } else {
                            cVar5 = null;
                        }
                        if (cVar5 == null) {
                            break;
                        } else {
                            i14--;
                        }
                    } while (i14 >= 1);
                    int i15 = d7.f74a;
                    if (i15 == 200) {
                        aVar = new E0.a(d7.f76c, 1);
                    } else if (i15 >= 500 || i15 == 404) {
                        aVar = new E0.a(-1L, 2);
                    } else if (i15 == 400) {
                        try {
                            aVar = new E0.a(-1L, 4);
                        } catch (IOException e4) {
                            e = e4;
                            AbstractC0521b.l("CctTransportBackend", "Could not make request to the backend", e);
                            i8 = 2;
                            aVar = new E0.a(-1L, 2);
                            i9 = aVar.f586a;
                            if (i9 != i8) {
                            }
                        }
                    } else {
                        aVar = new E0.a(-1L, 3);
                    }
                } catch (IOException e7) {
                    e = e7;
                }
            }
            i8 = 2;
            i9 = aVar.f586a;
            if (i9 != i8) {
                hVar.m(new i(this, iterable, jVar, j4));
                this.f1272d.a(jVar, i7 + 1, true);
                return;
            }
            long j10 = j4;
            hVar.m(new C0133g(this, i8, iterable));
            if (i9 == 1) {
                j7 = Math.max(j10, aVar.f587b);
                if (bArr != null) {
                    hVar.m(new B0.b(8, this));
                }
            } else {
                if (i9 == 4) {
                    HashMap hashMap2 = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String str8 = ((K0.b) it2.next()).f1351c.f336a;
                        if (hashMap2.containsKey(str8)) {
                            hashMap2.put(str8, Integer.valueOf(((Integer) hashMap2.get(str8)).intValue() + 1));
                        } else {
                            hashMap2.put(str8, 1);
                        }
                    }
                    hVar.m(new C0133g(this, 3, hashMap2));
                }
                j7 = j10;
            }
            kVar = this;
            jVar2 = jVar;
            j8 = j7;
            bArr2 = bArr;
        }
    }
}
