package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.facebook.appevents.UserDataStore;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.firebase.encoders.json.BuildConfig;
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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class f33 {
    public final Context a;
    public final jl1 b;
    public final tc2 c;
    public final mh d;
    public final Executor e;
    public final tc2 f;
    public final dq2 g;
    public final dq2 h;
    public final tc2 i;

    public f33(Context context, jl1 jl1Var, tc2 tc2Var, mh mhVar, Executor executor, tc2 tc2Var2, dq2 dq2Var, dq2 dq2Var2, tc2 tc2Var3) {
        this.a = context;
        this.b = jl1Var;
        this.c = tc2Var;
        this.d = mhVar;
        this.e = executor;
        this.f = tc2Var2;
        this.g = dq2Var;
        this.h = dq2Var2;
        this.i = tc2Var3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03c3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final gm gmVar, int i) {
        byte[] bArr;
        long j;
        rl rlVar;
        String str;
        rl rlVar2;
        int i2;
        bt c;
        String str2;
        Integer num;
        oy2 oy2Var;
        int i3;
        final f33 f33Var = this;
        final gm gmVar2 = gmVar;
        byte[] bArr2 = gmVar2.b;
        mz2 a = f33Var.b.a(gmVar2.a);
        long j2 = 0;
        while (true) {
            final int i4 = 0;
            cs2 cs2Var = new cs2(f33Var) { // from class: d33
                public final /* synthetic */ f33 n;

                {
                    this.n = f33Var;
                }

                @Override // defpackage.cs2
                public final Object b() {
                    Boolean bool;
                    int i5 = i4;
                    gm gmVar3 = gmVar2;
                    f33 f33Var2 = this.n;
                    switch (i5) {
                        case 0:
                            tc2 tc2Var = f33Var2.c;
                            SQLiteDatabase b = tc2Var.b();
                            b.beginTransaction();
                            try {
                                Long f = tc2.f(b, gmVar3);
                                if (f == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = tc2Var.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{f.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                b.setTransactionSuccessful();
                                return bool;
                            } finally {
                                b.endTransaction();
                            }
                        default:
                            tc2 tc2Var2 = f33Var2.c;
                            tc2Var2.getClass();
                            return (Iterable) tc2Var2.m(new lv(4, tc2Var2, gmVar3));
                    }
                }
            };
            tc2 tc2Var = f33Var.f;
            if (!((Boolean) tc2Var.p(cs2Var)).booleanValue()) {
                tc2Var.p(new qc2(j2, f33Var, gmVar2));
                return;
            }
            final int i5 = 1;
            final Iterable iterable = (Iterable) tc2Var.p(new cs2(f33Var) { // from class: d33
                public final /* synthetic */ f33 n;

                {
                    this.n = f33Var;
                }

                @Override // defpackage.cs2
                public final Object b() {
                    Boolean bool;
                    int i52 = i5;
                    gm gmVar3 = gmVar2;
                    f33 f33Var2 = this.n;
                    switch (i52) {
                        case 0:
                            tc2 tc2Var2 = f33Var2.c;
                            SQLiteDatabase b = tc2Var2.b();
                            b.beginTransaction();
                            try {
                                Long f = tc2.f(b, gmVar3);
                                if (f == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = tc2Var2.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{f.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                b.setTransactionSuccessful();
                                return bool;
                            } finally {
                                b.endTransaction();
                            }
                        default:
                            tc2 tc2Var22 = f33Var2.c;
                            tc2Var22.getClass();
                            return (Iterable) tc2Var22.m(new lv(4, tc2Var22, gmVar3));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (a == null) {
                s93.C("Uploader", "Unknown backend for %s, deleting event batch for it...", gmVar2);
                rlVar2 = new rl(-1L, 3);
                bArr = bArr2;
                j = j2;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((cm) it.next()).c);
                }
                if (bArr2 != null) {
                    tc2 tc2Var2 = f33Var.i;
                    Objects.requireNonNull(tc2Var2);
                    ru ruVar = (ru) tc2Var.p(new c33(tc2Var2, i4));
                    sf sfVar = new sf();
                    sfVar.f = new HashMap();
                    sfVar.d = Long.valueOf(f33Var.g.h());
                    sfVar.e = Long.valueOf(f33Var.h.h());
                    sfVar.a = "GDT_CLIENT_METRICS";
                    kh0 kh0Var = new kh0("proto");
                    ruVar.getClass();
                    sfVar.c = new hh0(kh0Var, p52.a.encode(ruVar));
                    arrayList.add(((ct) a).a(sfVar.e()));
                }
                ct ctVar = (ct) a;
                HashMap hashMap = new HashMap();
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    wl wlVar = (wl) obj;
                    String str3 = wlVar.a;
                    if (hashMap.containsKey(str3)) {
                        ((List) hashMap.get(str3)).add(wlVar);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(wlVar);
                        hashMap.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    wl wlVar2 = (wl) ((List) entry.getValue()).get(0);
                    x52 x52Var = x52.m;
                    long h = ctVar.f.h();
                    long h2 = ctVar.e.h();
                    tl tlVar = new tl(new ql(Integer.valueOf(wlVar2.b("sdk-version")), wlVar2.a(DeviceRequestsHelper.DEVICE_INFO_MODEL), wlVar2.a("hardware"), wlVar2.a(DeviceRequestsHelper.DEVICE_INFO_DEVICE), wlVar2.a("product"), wlVar2.a("os-uild"), wlVar2.a("manufacturer"), wlVar2.a("fingerprint"), wlVar2.a("locale"), wlVar2.a(UserDataStore.COUNTRY), wlVar2.a("mcc_mnc"), wlVar2.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (wl wlVar3 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        hh0 hh0Var = wlVar3.c;
                        kh0 kh0Var2 = hh0Var.a;
                        byte[] bArr4 = hh0Var.b;
                        long j3 = j2;
                        if (kh0Var2.equals(new kh0("proto"))) {
                            oy2Var = new oy2();
                            oy2Var.p = bArr4;
                        } else if (kh0Var2.equals(new kh0("json"))) {
                            String str4 = new String(bArr4, Charset.forName("UTF-8"));
                            oy2 oy2Var2 = new oy2();
                            oy2Var2.q = str4;
                            oy2Var = oy2Var2;
                        } else {
                            String G = s93.G("CctTransportBackend");
                            if (Log.isLoggable(G, 5)) {
                                Log.w(G, "Received event of unsupported encoding " + kh0Var2 + ". Skipping...");
                            }
                            bArr2 = bArr3;
                            j2 = j3;
                        }
                        oy2Var.m = Long.valueOf(wlVar3.d);
                        oy2Var.o = Long.valueOf(wlVar3.e);
                        String str5 = (String) wlVar3.f.get("tz-offset");
                        oy2Var.r = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        oy2Var.s = new bm((tr1) tr1.m.get(wlVar3.b("net-type")), (sr1) sr1.m.get(wlVar3.b("mobile-subtype")));
                        Integer num2 = wlVar3.b;
                        if (num2 != null) {
                            oy2Var.n = num2;
                        }
                        String str6 = ((Long) oy2Var.m) == null ? " eventTimeMs" : BuildConfig.FLAVOR;
                        if (((Long) oy2Var.o) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) oy2Var.r) == null) {
                            str6 = str6.concat(" timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            lh.g("Missing required properties:".concat(str6));
                            return;
                        } else {
                            arrayList4.add(new yl(((Long) oy2Var.m).longValue(), (Integer) oy2Var.n, ((Long) oy2Var.o).longValue(), (byte[]) oy2Var.p, (String) oy2Var.q, ((Long) oy2Var.r).longValue(), (bm) oy2Var.s));
                            bArr2 = bArr3;
                            j2 = j3;
                        }
                    }
                    arrayList3.add(new zl(h, h2, tlVar, num, str2, arrayList4));
                    bArr2 = bArr2;
                }
                bArr = bArr2;
                j = j2;
                sl slVar = new sl(arrayList3);
                URL url = ctVar.d;
                if (bArr != null) {
                    try {
                        fr a2 = fr.a(bArr);
                        str = a2.b;
                        if (str == null) {
                            str = null;
                        }
                        url = ct.b(a2.a);
                    } catch (IllegalArgumentException unused2) {
                        rlVar = new rl(-1L, 3);
                    }
                } else {
                    str = null;
                }
                try {
                    mh mhVar = new mh(url, slVar, str, 5);
                    k4 k4Var = new k4(1, ctVar);
                    int i7 = 5;
                    do {
                        c = k4Var.c(mhVar);
                        URL url2 = c.b;
                        if (url2 != null) {
                            s93.C("CctTransportBackend", "Following redirect to: %s", url2);
                            mhVar = new mh(url2, (sl) mhVar.o, (String) mhVar.p, 5);
                        } else {
                            mhVar = null;
                        }
                        if (mhVar == null) {
                            break;
                        } else {
                            i7--;
                        }
                    } while (i7 >= 1);
                    int i8 = c.a;
                    if (i8 == 200) {
                        rlVar2 = new rl(c.c, 1);
                    } else {
                        if (i8 >= 500 || i8 == 404) {
                            rlVar = new rl(-1L, 2);
                        } else if (i8 == 400) {
                            try {
                                rlVar = new rl(-1L, 4);
                            } catch (IOException e) {
                                e = e;
                                s93.D("CctTransportBackend", "Could not make request to the backend", e);
                                i2 = 2;
                                rlVar2 = new rl(-1L, 2);
                                i3 = rlVar2.a;
                                if (i3 != i2) {
                                }
                            }
                        } else {
                            rlVar = new rl(-1L, 3);
                        }
                        rlVar2 = rlVar;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            i2 = 2;
            i3 = rlVar2.a;
            if (i3 != i2) {
                final long j4 = j;
                tc2Var.p(new cs2() { // from class: e33
                    @Override // defpackage.cs2
                    public final Object b() {
                        f33 f33Var2 = f33.this;
                        tc2 tc2Var3 = f33Var2.c;
                        tc2Var3.getClass();
                        Iterable iterable2 = iterable;
                        if (iterable2.iterator().hasNext()) {
                            String concat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(tc2.q(iterable2));
                            SQLiteDatabase b = tc2Var3.b();
                            b.beginTransaction();
                            try {
                                b.compileStatement(concat).execute();
                                Cursor rawQuery = b.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                                while (rawQuery.moveToNext()) {
                                    try {
                                        tc2Var3.o(rawQuery.getInt(0), cg1.MAX_RETRIES_REACHED, rawQuery.getString(1));
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                rawQuery.close();
                                b.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                                b.setTransactionSuccessful();
                            } finally {
                                b.endTransaction();
                            }
                        }
                        tc2Var3.m(new pc2(f33Var2.g.h() + j4, gmVar));
                        return null;
                    }
                });
                this.d.C(gmVar, i + 1, true);
                return;
            }
            f33Var = this;
            gmVar2 = gmVar;
            j2 = j;
            tc2Var.p(new lv(5, f33Var, iterable));
            if (i3 == 1) {
                j2 = Math.max(j2, rlVar2.b);
                if (bArr != null) {
                    tc2Var.p(new k4(14, f33Var));
                }
            } else if (i3 == 4) {
                HashMap hashMap2 = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String str7 = ((cm) it2.next()).c.a;
                    if (hashMap2.containsKey(str7)) {
                        hashMap2.put(str7, Integer.valueOf(((Integer) hashMap2.get(str7)).intValue() + 1));
                    } else {
                        hashMap2.put(str7, 1);
                    }
                }
                tc2Var.p(new lv(6, f33Var, hashMap2));
            }
            bArr2 = bArr;
        }
    }
}
