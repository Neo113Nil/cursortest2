package com.anythink.core.a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.anythink.core.common.d.t;
import com.anythink.core.common.e.a;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.f;
import com.anythink.core.common.k;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: n, reason: collision with root package name */
    public static int f11704n = -1;

    /* renamed from: o, reason: collision with root package name */
    private static volatile b f11705o;

    /* renamed from: p, reason: collision with root package name */
    private static SimpleDateFormat f11706p;

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, f> f11708b;

    /* renamed from: c, reason: collision with root package name */
    ConcurrentHashMap<String, f> f11709c;

    /* renamed from: d, reason: collision with root package name */
    ConcurrentHashMap<String, f> f11710d;

    /* renamed from: e, reason: collision with root package name */
    ConcurrentHashMap<String, f> f11711e;

    /* renamed from: f, reason: collision with root package name */
    ConcurrentHashMap<String, f> f11712f;

    /* renamed from: g, reason: collision with root package name */
    ConcurrentHashMap<String, f> f11713g;

    /* renamed from: h, reason: collision with root package name */
    ConcurrentHashMap<String, Long> f11714h;
    ConcurrentHashMap<String, Long> i;

    /* renamed from: j, reason: collision with root package name */
    ConcurrentHashMap<String, Long> f11715j;

    /* renamed from: k, reason: collision with root package name */
    ConcurrentHashMap<String, Long> f11716k;

    /* renamed from: l, reason: collision with root package name */
    ConcurrentHashMap<String, Long> f11717l;

    /* renamed from: m, reason: collision with root package name */
    ConcurrentHashMap<String, Long> f11718m;

    /* renamed from: q, reason: collision with root package name */
    private final com.anythink.core.common.e.a f11719q;

    /* renamed from: s, reason: collision with root package name */
    private e f11721s;

    /* renamed from: t, reason: collision with root package name */
    private a f11722t;

    /* renamed from: u, reason: collision with root package name */
    private a f11723u;

    /* renamed from: v, reason: collision with root package name */
    private a f11724v;

    /* renamed from: w, reason: collision with root package name */
    private a f11725w;

    /* renamed from: a, reason: collision with root package name */
    final String f11707a = "b";

    /* renamed from: r, reason: collision with root package name */
    private final Object f11720r = new Object();

    /* renamed from: com.anythink.core.a.b$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f11726a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f11727b;

        public AnonymousClass1(String str, String str2) {
            this.f11726a = str;
            this.f11727b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (b.this.f11719q != null) {
                b.this.f11719q.e(this.f11726a, this.f11727b);
            }
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f11729a;

        /* renamed from: b, reason: collision with root package name */
        private int f11730b;

        /* renamed from: c, reason: collision with root package name */
        private Map<String, Pair<Integer, Integer>> f11731c;

        /* renamed from: d, reason: collision with root package name */
        private Map<String, Pair<Integer, Integer>> f11732d;

        /* renamed from: e, reason: collision with root package name */
        private Map<String, Pair<Integer, Integer>> f11733e;

        public final void a(int i) {
            this.f11729a = i;
        }

        public final void b(int i) {
            this.f11730b = i;
        }

        public final void c(Map<String, Pair<Integer, Integer>> map) {
            this.f11733e = map;
        }

        public final Map<String, Pair<Integer, Integer>> d() {
            return this.f11732d;
        }

        public final Map<String, Pair<Integer, Integer>> e() {
            return this.f11733e;
        }

        public final void a(Map<String, Pair<Integer, Integer>> map) {
            this.f11731c = map;
        }

        public final void b(Map<String, Pair<Integer, Integer>> map) {
            this.f11732d = map;
        }

        public final Map<String, Pair<Integer, Integer>> c() {
            return this.f11731c;
        }

        public final int a() {
            return this.f11729a;
        }

        public final int b() {
            return this.f11730b;
        }
    }

    private b(Context context) {
        this.f11719q = com.anythink.core.common.e.a.a(com.anythink.core.common.e.e.a(context));
        f11706p = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            com.anythink.core.common.v.b.b.a().b(new AnonymousClass1(a(new Date()), b(new Date())), 2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f11708b = new ConcurrentHashMap<>(3);
        this.f11709c = new ConcurrentHashMap<>(3);
        this.f11710d = new ConcurrentHashMap<>(3);
        this.f11711e = new ConcurrentHashMap<>(3);
        this.f11712f = new ConcurrentHashMap<>();
        this.f11713g = new ConcurrentHashMap<>(3);
        this.f11714h = new ConcurrentHashMap<>(3);
        this.f11715j = new ConcurrentHashMap<>(3);
        this.i = new ConcurrentHashMap<>(3);
        this.f11716k = new ConcurrentHashMap<>(3);
        this.f11718m = new ConcurrentHashMap<>(3);
        this.f11717l = new ConcurrentHashMap<>(3);
    }

    public static String b(Date date) {
        if (f11706p == null) {
            f11706p = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
        return f11706p.format(date).substring(8, 10);
    }

    public static String c(Date date) {
        if (f11706p == null) {
            f11706p = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
        return f11706p.format(date).substring(11, 13);
    }

    private ConcurrentHashMap<String, Long> d() {
        return this.f11715j;
    }

    private ConcurrentHashMap<String, Long> e() {
        return this.f11718m;
    }

    private e f() {
        if (this.f11721s == null) {
            synchronized (this.f11720r) {
                this.f11721s = new e(this.f11719q);
            }
        }
        return this.f11721s;
    }

    public static b a(Context context) {
        if (f11705o == null) {
            synchronized (b.class) {
                try {
                    if (f11705o == null) {
                        f11705o = new b(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11705o;
    }

    public final void d(bv bvVar) {
        if (bvVar.bv() == null || this.f11719q == null) {
            return;
        }
        f().a(bvVar);
    }

    private ConcurrentHashMap<String, f> b() {
        return this.f11709c;
    }

    private ConcurrentHashMap<String, f> c() {
        return this.f11712f;
    }

    public final void b(int i, long j9, int i4, String str, String str2) {
        Pair<Integer, Integer> pair;
        String str3 = str;
        try {
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(String.valueOf(i4))) {
                a aVar = this.f11725w;
                if (aVar != null) {
                    Map<String, Pair<Integer, Integer>> d2 = aVar.d();
                    if (d2 != null && !d2.isEmpty() && (pair = d2.get(String.valueOf(i4))) != null && ((Integer) pair.first).intValue() > 0 && ((Integer) pair.second).intValue() > 0) {
                        f fVar = this.f11711e.get(String.valueOf(i4));
                        if (fVar == null) {
                            fVar = new f("1", String.valueOf(i4), "network_id", System.currentTimeMillis(), 1);
                            this.f11711e.put(String.valueOf(i4), fVar);
                        } else if (System.currentTimeMillis() - fVar.i() > ((Integer) pair.second).intValue()) {
                            fVar.a(System.currentTimeMillis());
                            fVar.f14101a = 1;
                        } else {
                            fVar.f14101a++;
                        }
                        fVar.toString();
                        this.f11719q.b(String.valueOf(i4), "network_id", fVar.f14101a, fVar.i());
                    }
                    Map<String, Pair<Integer, Integer>> e6 = this.f11725w.e();
                    if (e6 != null && !e6.isEmpty()) {
                        Pair<Integer, Integer> pair2 = e6.get(i4 + "_" + str2);
                        if (pair2 != null && ((Integer) pair2.first).intValue() > 0 && ((Integer) pair2.second).intValue() > 0) {
                            f fVar2 = this.f11713g.get(i4 + "_" + str2);
                            if (fVar2 == null) {
                                fVar2 = new f("1", i4 + "_" + str2, a.C0076a.f13065f, System.currentTimeMillis(), 1);
                                this.f11713g.put(i4 + "_" + str2, fVar2);
                            } else if (System.currentTimeMillis() - fVar2.i() > ((Integer) pair2.second).intValue()) {
                                fVar2.a(System.currentTimeMillis());
                                fVar2.f14101a = 1;
                            } else {
                                fVar2.f14101a++;
                            }
                            fVar2.toString();
                            this.f11719q.b(i4 + "_" + str2, a.C0076a.f13065f, fVar2.f14101a, fVar2.i());
                        }
                    }
                }
                if (i <= 0 || j9 <= 0) {
                    return;
                }
                f fVar3 = this.f11712f.get(str3);
                if (fVar3 == null) {
                    f fVar4 = new f("1", str, a.C0076a.f13067h, System.currentTimeMillis(), 1);
                    str3 = str;
                    this.f11712f.put(str3, fVar4);
                    fVar3 = fVar4;
                } else if (System.currentTimeMillis() - fVar3.i() > j9) {
                    fVar3.a(System.currentTimeMillis());
                    fVar3.f14101a = 1;
                } else {
                    fVar3.f14101a++;
                }
                this.f11719q.b(str3, a.C0076a.f13067h, fVar3.f14101a, fVar3.i());
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void c(bv bvVar) {
        if (bvVar.bv() == null || this.f11719q == null) {
            return;
        }
        f().c(bvVar);
    }

    private com.anythink.core.common.e.a a() {
        return this.f11719q;
    }

    public static String a(Date date) {
        if (f11706p == null) {
            f11706p = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
        return f11706p.format(date).substring(5, 7);
    }

    private void a(String str, String str2) {
        try {
            com.anythink.core.common.v.b.b.a().b(new AnonymousClass1(str, str2), 2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final synchronized void a(JSONObject jSONObject) {
        try {
            if (jSONObject != null) {
                JSONObject optJSONObject = jSONObject.optJSONObject(k.f14435A);
                if (optJSONObject != null) {
                    this.f11722t = b(optJSONObject);
                } else if (this.f11722t != null) {
                    this.f11722t = null;
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject(k.f14436B);
                if (optJSONObject2 != null) {
                    this.f11723u = b(optJSONObject2);
                } else if (this.f11723u != null) {
                    this.f11723u = null;
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject("caps_s");
                if (optJSONObject3 != null) {
                    this.f11724v = b(optJSONObject3);
                } else if (this.f11724v != null) {
                    this.f11724v = null;
                }
                JSONObject optJSONObject4 = jSONObject.optJSONObject("req_pace");
                if (optJSONObject4 != null) {
                    this.f11725w = b(optJSONObject4);
                    return;
                } else {
                    if (this.f11725w != null) {
                        this.f11725w = null;
                    }
                    return;
                }
            }
            if (this.f11722t != null) {
                this.f11722t = null;
            }
            if (this.f11723u != null) {
                this.f11723u = null;
            }
            if (this.f11724v != null) {
                this.f11724v = null;
            }
            if (this.f11725w != null) {
                this.f11725w = null;
            }
        } catch (Throwable unused) {
        }
    }

    public final int a(String str) {
        Pair<Integer, Integer> pair;
        try {
            a aVar = this.f11725w;
            if (aVar != null) {
                if (aVar.a() > 0 && this.f11725w.b() > 0) {
                    String p6 = t.b().p();
                    if (!TextUtils.isEmpty(p6)) {
                        f fVar = this.f11708b.get(p6);
                        if (fVar == null && (fVar = this.f11719q.d(p6, "app")) != null) {
                            this.f11708b.put(p6, fVar);
                        }
                        if (fVar != null && fVar.f14101a >= this.f11725w.a() && System.currentTimeMillis() - fVar.i() <= this.f11725w.b()) {
                            this.f11725w.a();
                            return 9;
                        }
                    }
                }
                Map<String, Pair<Integer, Integer>> c4 = this.f11725w.c();
                if (c4 != null && !c4.isEmpty() && (pair = c4.get(str)) != null && ((Integer) pair.first).intValue() > 0 && ((Integer) pair.second).intValue() > 0) {
                    f fVar2 = this.f11710d.get(str);
                    if (fVar2 == null && (fVar2 = this.f11719q.d(str, "format")) != null) {
                        this.f11710d.put(str, fVar2);
                    }
                    if (fVar2 != null && fVar2.f14101a >= ((Integer) pair.first).intValue() && System.currentTimeMillis() - fVar2.i() <= ((Integer) pair.second).intValue()) {
                        Objects.toString(pair.first);
                        return 10;
                    }
                }
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        return f11704n;
    }

    public final com.anythink.core.common.h.k b(bv bvVar) {
        if (bvVar.bv() == null || this.f11719q == null) {
            return null;
        }
        return f().b(bvVar);
    }

    private static a b(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        if (jSONObject == null) {
            return null;
        }
        try {
            a aVar = new a();
            JSONObject optJSONObject5 = jSONObject.optJSONObject("format");
            if (optJSONObject5 != null) {
                HashMap hashMap = new HashMap();
                Iterator<String> keys = optJSONObject5.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.isEmpty(next) && (optJSONObject4 = optJSONObject5.optJSONObject(next)) != null) {
                        int optInt = optJSONObject4.optInt("max_num");
                        int optInt2 = optJSONObject4.optInt("per_second");
                        if (optInt != 0 || optInt2 != 0) {
                            hashMap.put(next, new Pair(Integer.valueOf(optInt), Integer.valueOf(optInt2)));
                        }
                    }
                }
                if (!hashMap.isEmpty()) {
                    aVar.a(hashMap);
                }
            }
            JSONObject optJSONObject6 = jSONObject.optJSONObject("nw");
            if (optJSONObject6 != null) {
                HashMap hashMap2 = new HashMap();
                Iterator<String> keys2 = optJSONObject6.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    if (!TextUtils.isEmpty(next2) && (optJSONObject3 = optJSONObject6.optJSONObject(next2)) != null) {
                        int optInt3 = optJSONObject3.optInt("max_num");
                        int optInt4 = optJSONObject3.optInt("per_second");
                        if (optInt3 != 0 || optInt4 != 0) {
                            hashMap2.put(next2, new Pair(Integer.valueOf(optInt3), Integer.valueOf(optInt4)));
                        }
                    }
                }
                if (!hashMap2.isEmpty()) {
                    aVar.b(hashMap2);
                }
            }
            JSONObject optJSONObject7 = jSONObject.optJSONObject("nw_format");
            if (optJSONObject7 != null) {
                HashMap hashMap3 = new HashMap();
                Iterator<String> keys3 = optJSONObject7.keys();
                while (keys3.hasNext()) {
                    String next3 = keys3.next();
                    if (!TextUtils.isEmpty(next3) && (optJSONObject2 = optJSONObject7.optJSONObject(next3)) != null) {
                        int optInt5 = optJSONObject2.optInt("max_num");
                        int optInt6 = optJSONObject2.optInt("per_second");
                        if (optInt5 != 0 || optInt6 != 0) {
                            hashMap3.put(next3, new Pair(Integer.valueOf(optInt5), Integer.valueOf(optInt6)));
                        }
                    }
                }
                if (!hashMap3.isEmpty()) {
                    aVar.c(hashMap3);
                }
            }
            JSONObject optJSONObject8 = jSONObject.optJSONObject("global");
            if (optJSONObject8 != null && (optJSONObject = optJSONObject8.optJSONObject("global")) != null) {
                int optInt7 = optJSONObject.optInt("max_num");
                if (optInt7 != 0) {
                    aVar.a(optInt7);
                }
                int optInt8 = optJSONObject.optInt("per_second");
                if (optInt8 != 0) {
                    aVar.b(optInt8);
                }
            }
            return aVar;
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public final int a(int i, long j9, String str) {
        if (i > 0 && j9 > 0) {
            try {
                f fVar = this.f11709c.get(str);
                if (fVar == null && (fVar = this.f11719q.d(str, "placement_id")) != null) {
                    this.f11709c.put(str, fVar);
                }
                if (fVar != null && fVar.f14101a >= i) {
                    if (System.currentTimeMillis() - fVar.i() <= j9) {
                        return 8;
                    }
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
        return f11704n;
    }

    public final void a(int i, long j9, String str, int i4) {
        String str2;
        Pair<Integer, Integer> pair;
        String str3;
        try {
            a aVar = this.f11725w;
            if (aVar != null) {
                if (aVar.a() > 0 && this.f11725w.b() > 0) {
                    String p6 = t.b().p();
                    if (!TextUtils.isEmpty(p6)) {
                        f fVar = this.f11708b.get(p6);
                        if (fVar != null) {
                            if (System.currentTimeMillis() - fVar.i() > this.f11725w.b()) {
                                fVar.a(System.currentTimeMillis());
                                fVar.f14101a = 1;
                            } else {
                                fVar.f14101a++;
                            }
                            str3 = p6;
                        } else {
                            str3 = p6;
                            f fVar2 = new f("1", str3, "app", System.currentTimeMillis(), 1);
                            this.f11708b.put(str3, fVar2);
                            fVar = fVar2;
                        }
                        fVar.toString();
                        this.f11719q.b(str3, "app", fVar.f14101a, fVar.i());
                    }
                }
                Map<String, Pair<Integer, Integer>> c4 = this.f11725w.c();
                if (c4 != null && !c4.isEmpty() && (pair = c4.get(String.valueOf(i4))) != null && ((Integer) pair.first).intValue() > 0 && ((Integer) pair.second).intValue() > 0) {
                    f fVar3 = this.f11710d.get(String.valueOf(i4));
                    if (fVar3 == null) {
                        f fVar4 = new f("1", String.valueOf(i4), "format", System.currentTimeMillis(), 1);
                        this.f11710d.put(String.valueOf(i4), fVar4);
                        fVar3 = fVar4;
                    } else if (System.currentTimeMillis() - fVar3.i() > ((Integer) pair.second).intValue()) {
                        fVar3.a(System.currentTimeMillis());
                        fVar3.f14101a = 1;
                    } else {
                        fVar3.f14101a++;
                    }
                    fVar3.toString();
                    this.f11719q.b(String.valueOf(i4), "format", fVar3.f14101a, fVar3.i());
                }
            }
            if (i <= 0 || j9 <= 0) {
                return;
            }
            f fVar5 = this.f11709c.get(str);
            if (fVar5 != null) {
                if (System.currentTimeMillis() - fVar5.i() > j9) {
                    fVar5.a(System.currentTimeMillis());
                    fVar5.f14101a = 1;
                } else {
                    fVar5.f14101a++;
                }
                str2 = str;
            } else {
                str2 = str;
                f fVar6 = new f("1", str2, "placement_id", System.currentTimeMillis(), 1);
                this.f11709c.put(str2, fVar6);
                fVar5 = fVar6;
            }
            fVar5.toString();
            this.f11719q.b(str2, "placement_id", fVar5.f14101a, fVar5.i());
        } catch (Throwable unused) {
        }
    }

    public final int a(int i, long j9, int i4, String str, String str2) {
        Pair<Integer, Integer> pair;
        try {
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            a aVar = this.f11725w;
            if (aVar != null) {
                Map<String, Pair<Integer, Integer>> d2 = aVar.d();
                if (d2 != null && !d2.isEmpty() && (pair = d2.get(String.valueOf(i4))) != null && ((Integer) pair.first).intValue() > 0 && ((Integer) pair.second).intValue() > 0) {
                    f fVar = this.f11711e.get(String.valueOf(i4));
                    if (fVar == null && (fVar = this.f11719q.d(String.valueOf(i4), "network_id")) != null) {
                        this.f11711e.put(String.valueOf(i4), fVar);
                    }
                    if (fVar != null && fVar.f14101a >= ((Integer) pair.first).intValue() && System.currentTimeMillis() - fVar.i() <= ((Integer) pair.second).intValue()) {
                        Objects.toString(pair.first);
                        return 25;
                    }
                }
                Map<String, Pair<Integer, Integer>> e9 = this.f11725w.e();
                if (e9 != null && !e9.isEmpty()) {
                    Pair<Integer, Integer> pair2 = e9.get(i4 + "_" + str2);
                    if (pair2 != null && ((Integer) pair2.first).intValue() > 0 && ((Integer) pair2.second).intValue() > 0) {
                        f fVar2 = this.f11713g.get(i4 + "_" + str2);
                        if (fVar2 == null) {
                            fVar2 = this.f11719q.d(i4 + "_" + str2, a.C0076a.f13065f);
                            if (fVar2 != null) {
                                this.f11713g.put(i4 + "_" + str2, fVar2);
                            }
                        }
                        if (fVar2 != null && fVar2.f14101a >= ((Integer) pair2.first).intValue() && System.currentTimeMillis() - fVar2.i() <= ((Integer) pair2.second).intValue()) {
                            Objects.toString(pair2.first);
                            return 26;
                        }
                    }
                }
            }
            if (i > 0 && j9 > 0) {
                f fVar3 = this.f11712f.get(str);
                if (fVar3 == null && (fVar3 = this.f11719q.d(str, a.C0076a.f13067h)) != null) {
                    this.f11712f.put(str, fVar3);
                }
                if (fVar3 != null && fVar3.f14101a >= i && System.currentTimeMillis() - fVar3.i() <= j9) {
                    return 18;
                }
            }
            return f11704n;
        }
        return f11704n;
    }

    public final int a(String str, String str2, long j9, long j10) {
        List<f> b9;
        Pair<Integer, Integer> pair;
        List<f> b10;
        List<f> b11;
        List<f> a9;
        Pair<Integer, Integer> pair2;
        List<f> a10;
        List<f> a11;
        try {
            Date date = new Date();
            int parseInt = Integer.parseInt(b(date));
            int parseInt2 = Integer.parseInt(c(date));
            a aVar = this.f11722t;
            if (aVar != null) {
                if (aVar.a() > 0) {
                    String p6 = t.b().p();
                    if (!TextUtils.isEmpty(p6)) {
                        Long l9 = this.f11714h.get("day_".concat(String.valueOf(parseInt)));
                        if (l9 == null && (a11 = this.f11719q.a(p6, "app")) != null && !a11.isEmpty()) {
                            l9 = Long.valueOf(a11.size());
                            this.f11714h.put("day_".concat(String.valueOf(parseInt)), l9);
                        }
                        if (l9 != null && l9.longValue() >= this.f11722t.a()) {
                            this.f11722t.a();
                            return 7;
                        }
                    }
                }
                Map<String, Pair<Integer, Integer>> c4 = this.f11722t.c();
                if (c4 != null && !c4.isEmpty() && (pair2 = c4.get(str2)) != null && ((Integer) pair2.first).intValue() > 0) {
                    Long l10 = this.i.get("day_" + parseInt + "_" + str2);
                    if (l10 == null && (a10 = this.f11719q.a(str2, "format")) != null && !a10.isEmpty()) {
                        l10 = Long.valueOf(a10.size());
                        this.i.put("day_" + parseInt + "_" + str2, l10);
                    }
                    if (l10 != null && l10.longValue() >= ((Integer) pair2.first).intValue()) {
                        Objects.toString(pair2.first);
                        return 8;
                    }
                }
            }
            if (j9 > 0) {
                Long l11 = this.f11715j.get("day_" + parseInt + "_" + str);
                if (l11 == null && (a9 = this.f11719q.a(str, "placement_id")) != null && !a9.isEmpty()) {
                    l11 = Long.valueOf(a9.size());
                    this.f11715j.put("day_" + parseInt + "_" + str, l11);
                }
                if (l11 != null && l11.longValue() >= j9) {
                    return 2;
                }
            }
            a aVar2 = this.f11723u;
            if (aVar2 != null) {
                if (aVar2.a() > 0) {
                    String p9 = t.b().p();
                    if (!TextUtils.isEmpty(p9)) {
                        Long l12 = this.f11714h.get("hour_".concat(String.valueOf(parseInt2)));
                        if (l12 == null && (b11 = this.f11719q.b(p9, "app")) != null && !b11.isEmpty()) {
                            l12 = Long.valueOf(b11.size());
                            this.f11714h.put("hour_".concat(String.valueOf(parseInt2)), l12);
                        }
                        if (l12 != null && l12.longValue() >= this.f11723u.a()) {
                            this.f11723u.a();
                            return 9;
                        }
                    }
                }
                Map<String, Pair<Integer, Integer>> c9 = this.f11723u.c();
                if (c9 != null && !c9.isEmpty() && (pair = c9.get(str2)) != null && ((Integer) pair.first).intValue() > 0) {
                    Long l13 = this.i.get("hour_" + parseInt2 + "_" + str2);
                    if (l13 == null && (b10 = this.f11719q.b(str2, "format")) != null && !b10.isEmpty()) {
                        l13 = Long.valueOf(b10.size());
                        this.i.put("hour_" + parseInt2 + "_" + str2, l13);
                    }
                    if (l13 != null && l13.longValue() >= ((Integer) pair.first).intValue()) {
                        Objects.toString(pair.first);
                        return 10;
                    }
                }
            }
            if (j10 > 0) {
                Long l14 = this.f11715j.get("hour_" + parseInt2 + "_" + str);
                if (l14 == null && (b9 = this.f11719q.b(str, "placement_id")) != null && !b9.isEmpty()) {
                    l14 = Long.valueOf(b9.size());
                    this.f11715j.put("hour_" + parseInt2 + "_" + str, l14);
                }
                if (l14 != null && l14.longValue() >= j10) {
                    return 2;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return f11704n;
    }

    public final int a(String str, String str2, long j9) {
        f c4;
        Pair<Integer, Integer> pair;
        f c9;
        f c10;
        try {
            a aVar = this.f11724v;
            if (aVar != null) {
                if (aVar.b() > 0) {
                    String p6 = t.b().p();
                    if (!TextUtils.isEmpty(p6)) {
                        Long l9 = this.f11714h.get(a.C0076a.f13071m);
                        if (l9 == null && (c10 = this.f11719q.c(p6, "app")) != null) {
                            l9 = Long.valueOf(c10.i());
                            this.f11714h.put(a.C0076a.f13071m, l9);
                        }
                        if (l9 != null && System.currentTimeMillis() - l9.longValue() < this.f11724v.b()) {
                            this.f11724v.b();
                            return 11;
                        }
                    }
                }
                Map<String, Pair<Integer, Integer>> c11 = this.f11724v.c();
                if (c11 != null && !c11.isEmpty() && (pair = c11.get(str2)) != null && ((Integer) pair.second).intValue() > 0) {
                    Long l10 = this.i.get("time_stamp_".concat(String.valueOf(str2)));
                    if (l10 == null && (c9 = this.f11719q.c(str2, "format")) != null) {
                        l10 = Long.valueOf(c9.i());
                        this.i.put("time_stamp_".concat(String.valueOf(str2)), l10);
                    }
                    if (l10 != null && System.currentTimeMillis() - l10.longValue() < ((Integer) pair.second).intValue()) {
                        Objects.toString(pair.second);
                        return 12;
                    }
                }
            }
            if (j9 > 0) {
                Long l11 = this.f11715j.get("time_stamp_".concat(String.valueOf(str)));
                if (l11 == null && (c4 = this.f11719q.c(str, "placement_id")) != null) {
                    l11 = Long.valueOf(c4.i());
                    this.f11715j.put("time_stamp_".concat(String.valueOf(str)), l11);
                }
                if (l11 != null && System.currentTimeMillis() - l11.longValue() < j9) {
                    return 3;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return f11704n;
    }

    public final int a(String str, String str2, String str3, long j9, long j10) {
        long j11;
        List<f> b9;
        Pair<Integer, Integer> pair;
        List<f> b10;
        List<f> a9;
        Pair<Integer, Integer> pair2;
        List<f> a10;
        try {
            Date date = new Date();
            int parseInt = Integer.parseInt(b(date));
            int parseInt2 = Integer.parseInt(c(date));
            a aVar = this.f11722t;
            if (aVar != null) {
                Map<String, Pair<Integer, Integer>> d2 = aVar.d();
                if (d2 != null && !d2.isEmpty() && (pair2 = d2.get(str)) != null && ((Integer) pair2.first).intValue() > 0) {
                    Long l9 = this.f11716k.get("day_" + parseInt + "_" + str);
                    if (l9 == null && (a10 = this.f11719q.a(str, "network_id")) != null && !a10.isEmpty()) {
                        l9 = Long.valueOf(a10.size());
                        this.f11716k.put("day_" + parseInt + "_" + str, l9);
                    }
                    if (l9 != null && l9.longValue() >= ((Integer) pair2.first).intValue()) {
                        Objects.toString(pair2.first);
                        return 8;
                    }
                }
                Map<String, Pair<Integer, Integer>> e6 = this.f11722t.e();
                if (e6 != null && !e6.isEmpty()) {
                    Pair<Integer, Integer> pair3 = e6.get(str + "_" + str3);
                    if (pair3 != null && ((Integer) pair3.first).intValue() > 0) {
                        Long l10 = this.f11717l.get("day_" + parseInt + "_" + str + "_" + str3);
                        if (l10 == null) {
                            List<f> a11 = this.f11719q.a(str + "_" + str3, a.C0076a.f13065f);
                            if (a11 != null && !a11.isEmpty()) {
                                l10 = Long.valueOf(a11.size());
                                this.f11717l.put("day_" + parseInt + "_" + str + "_" + str3, l10);
                            }
                        }
                        if (l10 != null && l10.longValue() >= ((Integer) pair3.first).intValue()) {
                            Objects.toString(pair3.first);
                            return 9;
                        }
                    }
                }
            }
            if (j9 > 0) {
                Long l11 = this.f11718m.get("day_" + parseInt + "_" + str2);
                if (l11 != null || (a9 = this.f11719q.a(str2, a.C0076a.f13067h)) == null || a9.isEmpty()) {
                    j11 = 0;
                } else {
                    int size = a9.size();
                    j11 = 0;
                    l11 = Long.valueOf(size);
                    this.f11718m.put("day_" + parseInt + "_" + str2, l11);
                }
                if (l11 != null && l11.longValue() >= j9) {
                    return 2;
                }
            } else {
                j11 = 0;
            }
            a aVar2 = this.f11723u;
            if (aVar2 != null) {
                Map<String, Pair<Integer, Integer>> d3 = aVar2.d();
                if (d3 != null && !d3.isEmpty() && (pair = d3.get(str)) != null && ((Integer) pair.first).intValue() > 0) {
                    Long l12 = this.f11716k.get("hour_" + parseInt2 + "_" + str);
                    if (l12 == null && (b10 = this.f11719q.b(str, "network_id")) != null && !b10.isEmpty()) {
                        l12 = Long.valueOf(b10.size());
                        this.f11716k.put("hour_" + parseInt2 + "_" + str, l12);
                    }
                    if (l12 != null && l12.longValue() >= ((Integer) pair.first).intValue()) {
                        Objects.toString(pair.first);
                        return 10;
                    }
                }
                Map<String, Pair<Integer, Integer>> e9 = this.f11723u.e();
                if (e9 != null && !e9.isEmpty()) {
                    Pair<Integer, Integer> pair4 = e9.get(str + "_" + str3);
                    if (pair4 != null && ((Integer) pair4.first).intValue() > 0) {
                        Long l13 = this.f11717l.get("hour_" + parseInt2 + "_" + str + "_" + str3);
                        if (l13 == null) {
                            List<f> b11 = this.f11719q.b(str + "_" + str3, a.C0076a.f13065f);
                            if (b11 != null && !b11.isEmpty()) {
                                l13 = Long.valueOf(b11.size());
                                this.f11717l.put("hour_" + parseInt2 + "_" + str + "_" + str3, l13);
                            }
                        }
                        if (l13 != null && l13.longValue() >= ((Integer) pair4.first).intValue()) {
                            Objects.toString(pair4.first);
                            return 11;
                        }
                    }
                }
            }
            if (j10 > j11) {
                Long l14 = this.f11718m.get("hour_" + parseInt2 + "_" + str2);
                if (l14 == null && (b9 = this.f11719q.b(str2, a.C0076a.f13067h)) != null && !b9.isEmpty()) {
                    l14 = Long.valueOf(b9.size());
                    this.f11718m.put("hour_" + parseInt2 + "_" + str2, l14);
                }
                if (l14 != null && l14.longValue() >= j10) {
                    return 2;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return f11704n;
    }

    public final int a(String str, String str2, String str3, long j9) {
        f c4;
        Pair<Integer, Integer> pair;
        f c9;
        try {
            a aVar = this.f11724v;
            if (aVar != null) {
                Map<String, Pair<Integer, Integer>> d2 = aVar.d();
                if (d2 != null && !d2.isEmpty() && (pair = d2.get(str)) != null && ((Integer) pair.second).intValue() > 0) {
                    Long l9 = this.f11716k.get("time_stamp_".concat(String.valueOf(str)));
                    if (l9 == null && (c9 = this.f11719q.c(str, "network_id")) != null) {
                        l9 = Long.valueOf(c9.i());
                        this.f11716k.put("time_stamp_".concat(String.valueOf(str)), l9);
                    }
                    if (l9 != null && System.currentTimeMillis() - l9.longValue() < ((Integer) pair.second).intValue()) {
                        Objects.toString(pair.second);
                        return 12;
                    }
                }
                Map<String, Pair<Integer, Integer>> e6 = this.f11724v.e();
                if (e6 != null && !e6.isEmpty()) {
                    Pair<Integer, Integer> pair2 = e6.get(str + "_" + str3);
                    if (pair2 != null && ((Integer) pair2.second).intValue() > 0) {
                        Long l10 = this.f11717l.get("time_stamp_" + str + "_" + str3);
                        if (l10 == null) {
                            f c10 = this.f11719q.c(str + "_" + str3, a.C0076a.f13065f);
                            if (c10 != null) {
                                l10 = Long.valueOf(c10.i());
                                this.f11717l.put("time_stamp_" + str + "_" + str3, l10);
                            }
                        }
                        if (l10 != null && System.currentTimeMillis() - l10.longValue() < ((Integer) pair2.second).intValue()) {
                            Objects.toString(pair2.second);
                            return 13;
                        }
                    }
                }
            }
            if (j9 > 0) {
                Long l11 = this.f11718m.get("time_stamp_".concat(String.valueOf(str2)));
                if (l11 == null && (c4 = this.f11719q.c(str2, a.C0076a.f13067h)) != null) {
                    l11 = Long.valueOf(c4.i());
                    this.f11715j.put("time_stamp_".concat(String.valueOf(str2)), l11);
                }
                if (l11 != null && System.currentTimeMillis() - l11.longValue() < j9) {
                    return 3;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return f11704n;
    }

    public final void a(int i, String str, String str2, String str3) {
        try {
            String p6 = t.b().p();
            Date date = new Date();
            long currentTimeMillis = System.currentTimeMillis();
            int parseInt = Integer.parseInt(a(date));
            int parseInt2 = Integer.parseInt(b(date));
            int parseInt3 = Integer.parseInt(c(date));
            this.f11719q.a(new f("2", p6, String.valueOf(i), str, i + "_" + str, str2, str3, parseInt, parseInt2, parseInt3, currentTimeMillis));
            a(1, this.f11722t, this.f11714h, "day_".concat(String.valueOf(parseInt2)), currentTimeMillis);
            a(1, this.f11722t, this.i, "day_" + parseInt2 + "_" + str, currentTimeMillis);
            a(1, this.f11722t, this.f11716k, "day_" + parseInt2 + "_" + i, currentTimeMillis);
            a(1, this.f11722t, this.f11717l, "day_" + parseInt2 + "_" + i + "_" + str, currentTimeMillis);
            ConcurrentHashMap<String, Long> concurrentHashMap = this.f11715j;
            StringBuilder sb = new StringBuilder("day_");
            sb.append(parseInt2);
            sb.append("_");
            sb.append(str2);
            a(1, concurrentHashMap, sb.toString(), currentTimeMillis);
            a(1, this.f11718m, "day_" + parseInt2 + "_" + str3, currentTimeMillis);
            a(1, this.f11723u, this.f11714h, "hour_".concat(String.valueOf(parseInt3)), currentTimeMillis);
            a(1, this.f11723u, this.i, "hour_" + parseInt3 + "_" + str, currentTimeMillis);
            a(1, this.f11723u, this.f11716k, "hour_" + parseInt3 + "_" + i, currentTimeMillis);
            a(1, this.f11723u, this.f11717l, "hour_" + parseInt3 + "_" + i + "_" + str, currentTimeMillis);
            ConcurrentHashMap<String, Long> concurrentHashMap2 = this.f11715j;
            StringBuilder sb2 = new StringBuilder("hour_");
            sb2.append(parseInt3);
            sb2.append("_");
            sb2.append(str2);
            a(1, concurrentHashMap2, sb2.toString(), currentTimeMillis);
            a(1, this.f11718m, "hour_" + parseInt3 + "_" + str3, currentTimeMillis);
            a(2, this.f11724v, this.f11714h, a.C0076a.f13071m, currentTimeMillis);
            a(2, this.f11724v, this.i, "time_stamp_".concat(String.valueOf(str)), currentTimeMillis);
            a(2, this.f11724v, this.f11716k, "time_stamp_".concat(String.valueOf(i)), currentTimeMillis);
            a(2, this.f11724v, this.f11717l, "time_stamp_" + i + "_" + str, currentTimeMillis);
            a(2, this.f11715j, "time_stamp_".concat(String.valueOf(str2)), currentTimeMillis);
            a(2, this.f11718m, "time_stamp_".concat(String.valueOf(str3)), currentTimeMillis);
        } catch (Throwable unused) {
        }
    }

    private static void a(int i, a aVar, ConcurrentHashMap<String, Long> concurrentHashMap, String str, long j9) {
        long valueOf;
        Objects.toString(aVar);
        if (concurrentHashMap != null) {
            if (i == 2) {
                concurrentHashMap.put(str, Long.valueOf(j9));
                return;
            }
            Long l9 = concurrentHashMap.get(str);
            if (l9 == null) {
                valueOf = 1L;
            } else {
                valueOf = Long.valueOf(l9.longValue() + 1);
            }
            concurrentHashMap.put(str, valueOf);
        }
    }

    private static void a(int i, ConcurrentHashMap<String, Long> concurrentHashMap, String str, long j9) {
        long valueOf;
        Objects.toString(concurrentHashMap);
        if (concurrentHashMap != null) {
            if (i == 2) {
                concurrentHashMap.put(str, Long.valueOf(j9));
                return;
            }
            Long l9 = concurrentHashMap.get(str);
            if (l9 == null) {
                valueOf = 1L;
            } else {
                valueOf = Long.valueOf(l9.longValue() + 1);
            }
            concurrentHashMap.put(str, valueOf);
        }
    }

    public final void a(bv bvVar) {
        if (bvVar.bv() == null || this.f11719q == null) {
            return;
        }
        f().d(bvVar);
    }
}
