package e2;

import A.AbstractC0017m;
import A.V;
import B1.C0097d;
import G1.y;
import f2.C0632a;
import j2.AbstractC0720j;
import j2.C0712b;
import j2.C0716f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import l2.C0821a;
import o2.s;
import y.t;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: F, reason: collision with root package name */
    public static long f6207F;

    /* renamed from: E, reason: collision with root package name */
    public long f6211E;

    /* renamed from: a, reason: collision with root package name */
    public final g2.h f6212a;

    /* renamed from: b, reason: collision with root package name */
    public final V f6213b;

    /* renamed from: c, reason: collision with root package name */
    public String f6214c;

    /* renamed from: f, reason: collision with root package name */
    public long f6217f;

    /* renamed from: g, reason: collision with root package name */
    public C0559a f6218g;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f6222k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f6223l;

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f6224m;

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f6225n;

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f6226o;

    /* renamed from: p, reason: collision with root package name */
    public String f6227p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6228q;

    /* renamed from: r, reason: collision with root package name */
    public String f6229r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6230s;

    /* renamed from: t, reason: collision with root package name */
    public final C0560b f6231t;

    /* renamed from: u, reason: collision with root package name */
    public final Z1.q f6232u;

    /* renamed from: v, reason: collision with root package name */
    public final Z1.q f6233v;

    /* renamed from: w, reason: collision with root package name */
    public final C0712b f6234w;

    /* renamed from: x, reason: collision with root package name */
    public final C0097d f6235x;

    /* renamed from: y, reason: collision with root package name */
    public final C0632a f6236y;

    /* renamed from: z, reason: collision with root package name */
    public String f6237z;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f6215d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public boolean f6216e = true;

    /* renamed from: h, reason: collision with root package name */
    public EnumC0568j f6219h = EnumC0568j.f6191d;

    /* renamed from: i, reason: collision with root package name */
    public long f6220i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f6221j = 0;

    /* renamed from: A, reason: collision with root package name */
    public long f6208A = 0;
    public int B = 0;

    /* renamed from: C, reason: collision with root package name */
    public int f6209C = 0;

    /* renamed from: D, reason: collision with root package name */
    public ScheduledFuture f6210D = null;

    public n(C0560b c0560b, V v4, g2.h hVar) {
        this.f6212a = hVar;
        this.f6231t = c0560b;
        C0712b c0712b = c0560b.f6170a;
        this.f6234w = c0712b;
        this.f6232u = c0560b.f6171b;
        this.f6233v = c0560b.f6172c;
        this.f6213b = v4;
        this.f6226o = new HashMap();
        this.f6222k = new HashMap();
        this.f6224m = new HashMap();
        this.f6225n = new ConcurrentHashMap();
        this.f6223l = new ArrayList();
        y yVar = c0560b.f6173d;
        this.f6236y = new C0632a(c0712b, new C0097d(yVar, "ConnectionRetryHelper", (Object) null, 18));
        long j4 = f6207F;
        f6207F = 1 + j4;
        this.f6235x = new C0097d(yVar, "PersistentConnection", AbstractC0017m.i("pc_", j4), 18);
        this.f6237z = null;
        b();
    }

    public final boolean a() {
        EnumC0568j enumC0568j = this.f6219h;
        return enumC0568j == EnumC0568j.f6194j || enumC0568j == EnumC0568j.f6195k;
    }

    public final void b() {
        if (!d()) {
            if (this.f6215d.contains("connection_idle")) {
                M1.a.F(!d(), "", new Object[0]);
                h("connection_idle");
                return;
            }
            return;
        }
        ScheduledFuture scheduledFuture = this.f6210D;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f6210D = this.f6234w.schedule(new G1.j(3, this), 60000L, TimeUnit.MILLISECONDS);
    }

    public final void c(String str) {
        C0097d c0097d = this.f6235x;
        if (c0097d.y()) {
            c0097d.d("Connection interrupted for: ".concat(str), null, new Object[0]);
        }
        this.f6215d.add(str);
        C0559a c0559a = this.f6218g;
        C0632a c0632a = this.f6236y;
        if (c0559a != null) {
            c0559a.c(2);
            this.f6218g = null;
        } else {
            ScheduledFuture scheduledFuture = c0632a.f6652h;
            C0097d c0097d2 = c0632a.f6646b;
            if (scheduledFuture != null) {
                c0097d2.d("Cancelling existing retry attempt", null, new Object[0]);
                c0632a.f6652h.cancel(false);
                c0632a.f6652h = null;
            } else {
                c0097d2.d("No existing retry attempt to cancel", null, new Object[0]);
            }
            c0632a.f6653i = 0L;
            this.f6219h = EnumC0568j.f6191d;
        }
        c0632a.f6654j = true;
        c0632a.f6653i = 0L;
    }

    public final boolean d() {
        return this.f6226o.isEmpty() && this.f6225n.isEmpty() && this.f6222k.isEmpty() && this.f6224m.isEmpty();
    }

    public final void e(String str, ArrayList arrayList, Object obj, String str2, t tVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("p", M1.a.M(arrayList));
        hashMap.put("d", obj);
        if (str2 != null) {
            hashMap.put("h", str2);
        }
        long j4 = this.f6220i;
        this.f6220i = 1 + j4;
        HashMap hashMap2 = this.f6224m;
        Long valueOf = Long.valueOf(j4);
        l lVar = new l();
        lVar.f6201a = str;
        lVar.f6202b = hashMap;
        lVar.f6203c = tVar;
        hashMap2.put(valueOf, lVar);
        if (this.f6219h == EnumC0568j.f6195k) {
            k(j4);
        }
        this.f6211E = System.currentTimeMillis();
        b();
    }

    public final k f(m mVar) {
        C0097d c0097d = this.f6235x;
        if (c0097d.y()) {
            c0097d.d("removing query " + mVar, null, new Object[0]);
        }
        HashMap hashMap = this.f6226o;
        if (hashMap.containsKey(mVar)) {
            k kVar = (k) hashMap.get(mVar);
            hashMap.remove(mVar);
            b();
            return kVar;
        }
        if (c0097d.y()) {
            c0097d.d("Trying to remove listener for QuerySpec " + mVar + " but no listener exists.", null, new Object[0]);
        }
        return null;
    }

    public final void g() {
        EnumC0568j enumC0568j = this.f6219h;
        EnumC0568j enumC0568j2 = EnumC0568j.f6195k;
        M1.a.F(enumC0568j == enumC0568j2, "Should be connected if we're restoring state, but we are: %s", enumC0568j);
        C0097d c0097d = this.f6235x;
        if (c0097d.y()) {
            c0097d.d("Restoring outstanding listens", null, new Object[0]);
        }
        for (k kVar : this.f6226o.values()) {
            if (c0097d.y()) {
                c0097d.d("Restoring listen " + kVar.f6198b, null, new Object[0]);
            }
            j(kVar);
        }
        if (c0097d.y()) {
            c0097d.d("Restoring writes.", null, new Object[0]);
        }
        ArrayList arrayList = new ArrayList(this.f6224m.keySet());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k(((Long) it.next()).longValue());
        }
        ArrayList arrayList2 = this.f6223l;
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        arrayList2.clear();
        if (c0097d.y()) {
            c0097d.d("Restoring reads.", null, new Object[0]);
        }
        ConcurrentHashMap concurrentHashMap = this.f6225n;
        ArrayList arrayList3 = new ArrayList(concurrentHashMap.keySet());
        Collections.sort(arrayList3);
        Iterator it3 = arrayList3.iterator();
        if (it3.hasNext()) {
            Long l4 = (Long) it3.next();
            M1.a.F(this.f6219h == enumC0568j2, "sendGet called when we can't send gets", new Object[0]);
            concurrentHashMap.get(l4).getClass();
            throw new ClassCastException();
        }
    }

    public final void h(String str) {
        C0097d c0097d = this.f6235x;
        if (c0097d.y()) {
            c0097d.d("Connection no longer interrupted for: ".concat(str), null, new Object[0]);
        }
        this.f6215d.remove(str);
        if (this.f6215d.size() == 0 && this.f6219h == EnumC0568j.f6191d) {
            m();
        }
    }

    public final void i() {
        if (this.f6229r == null) {
            g();
            return;
        }
        M1.a.F(a(), "Must be connected to send auth, but was: %s", this.f6219h);
        C0097d c0097d = this.f6235x;
        if (c0097d.y()) {
            c0097d.d("Sending app check.", null, new Object[0]);
        }
        InterfaceC0567i interfaceC0567i = new InterfaceC0567i() { // from class: e2.d
            @Override // e2.InterfaceC0567i
            public final void a(Map map) {
                n nVar = n.this;
                nVar.getClass();
                String str = (String) map.get("s");
                if (str.equals("ok")) {
                    nVar.f6209C = 0;
                } else {
                    nVar.f6229r = null;
                    nVar.f6230s = true;
                    nVar.f6235x.d("App check failed: " + str + " (" + ((String) map.get("d")) + ")", null, new Object[0]);
                }
                nVar.g();
            }
        };
        HashMap hashMap = new HashMap();
        M1.a.F(this.f6229r != null, "App check token must be set!", new Object[0]);
        hashMap.put("token", this.f6229r);
        l("appcheck", true, hashMap, interfaceC0567i);
    }

    public final void j(k kVar) {
        l2.g gVar;
        HashMap hashMap = new HashMap();
        hashMap.put("p", M1.a.M(kVar.f6198b.f6205a));
        Long l4 = kVar.f6200d;
        if (l4 != null) {
            hashMap.put("q", kVar.f6198b.f6206b);
            hashMap.put("t", l4);
        }
        l2.j jVar = (l2.j) kVar.f6199c.f6771a;
        hashMap.put("h", ((C0821a) jVar.f7988c.f7977c).f7962a.f8941d.A());
        if (M1.a.B(((C0821a) jVar.f7988c.f7977c).f7962a.f8941d) > 1024) {
            s sVar = ((C0821a) jVar.f7988c.f7977c).f7962a.f8941d;
            C0716f c0716f = new C0716f();
            c0716f.f7161d = Math.max(512L, (long) Math.sqrt(M1.a.B(sVar) * 100));
            if (sVar.isEmpty()) {
                gVar = new l2.g(Collections.emptyList(), Collections.singletonList(""));
            } else {
                o2.h hVar = new o2.h(c0716f);
                l2.g.l(sVar, hVar);
                AbstractC0720j.b("Can't finish hashing in the middle processing a child", hVar.f8932d == 0);
                if (hVar.f8929a != null) {
                    hVar.b();
                }
                ArrayList arrayList = hVar.f8935g;
                arrayList.add("");
                gVar = new l2.g(hVar.f8934f, arrayList);
            }
            List unmodifiableList = Collections.unmodifiableList((List) gVar.f7976b);
            ArrayList arrayList2 = new ArrayList(unmodifiableList.size());
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((g2.e) it.next()).e());
            }
            List unmodifiableList2 = Collections.unmodifiableList((List) gVar.f7977c);
            if (arrayList2.size() != unmodifiableList2.size() - 1) {
                throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = Collections.unmodifiableList(arrayList2).iterator();
            while (it2.hasNext()) {
                arrayList3.add(M1.a.M((List) it2.next()));
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("hs", Collections.unmodifiableList(unmodifiableList2));
            hashMap2.put("ps", arrayList3);
            hashMap.put("ch", hashMap2);
        }
        l("q", false, hashMap, new C0566h(this, kVar));
    }

    public final void k(long j4) {
        M1.a.F(this.f6219h == EnumC0568j.f6195k, "sendPut called when we can't send writes (we're disconnected or writes are paused).", new Object[0]);
        l lVar = (l) this.f6224m.get(Long.valueOf(j4));
        t tVar = lVar.f6203c;
        lVar.f6204d = true;
        String str = lVar.f6201a;
        l(str, false, lVar.f6202b, new C0565g(this, str, j4, lVar, tVar));
    }

    public final void l(String str, boolean z4, HashMap hashMap, InterfaceC0567i interfaceC0567i) {
        String[] strArr;
        long j4 = this.f6221j;
        this.f6221j = 1 + j4;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("r", Long.valueOf(j4));
        hashMap2.put("a", str);
        hashMap2.put("b", hashMap);
        C0559a c0559a = this.f6218g;
        c0559a.getClass();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("t", "d");
        hashMap3.put("d", hashMap2);
        int i2 = c0559a.f6165b;
        C0097d c0097d = (C0097d) c0559a.f6169f;
        if (i2 != 2) {
            c0097d.d("Tried to send on an unconnected connection", null, new Object[0]);
        } else {
            if (z4) {
                c0097d.d("Sending data (contents hidden)", null, new Object[0]);
            } else {
                c0097d.d("Sending data: %s", null, hashMap3);
            }
            r rVar = (r) c0559a.f6167d;
            rVar.e();
            try {
                String u4 = m3.o.u(hashMap3);
                if (u4.length() <= 16384) {
                    strArr = new String[]{u4};
                } else {
                    ArrayList arrayList = new ArrayList();
                    int i4 = 0;
                    while (i4 < u4.length()) {
                        int i5 = i4 + 16384;
                        arrayList.add(u4.substring(i4, Math.min(i5, u4.length())));
                        i4 = i5;
                    }
                    strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
                if (strArr.length > 1) {
                    rVar.f6246a.t("" + strArr.length);
                }
                for (String str2 : strArr) {
                    rVar.f6246a.t(str2);
                }
            } catch (IOException e4) {
                rVar.f6255j.i("Failed to serialize message: " + hashMap3.toString(), e4);
                rVar.f();
            }
        }
        this.f6222k.put(Long.valueOf(j4), interfaceC0567i);
    }

    public final void m() {
        if (this.f6215d.size() == 0) {
            EnumC0568j enumC0568j = this.f6219h;
            M1.a.F(enumC0568j == EnumC0568j.f6191d, "Not in disconnected state: %s", enumC0568j);
            boolean z4 = this.f6228q;
            boolean z5 = this.f6230s;
            this.f6235x.d("Scheduling connection attempt", null, new Object[0]);
            this.f6228q = false;
            this.f6230s = false;
            C.t tVar = new C.t(this, z4, z5);
            C0632a c0632a = this.f6236y;
            c0632a.getClass();
            G1.n nVar = new G1.n(c0632a, 12, tVar);
            ScheduledFuture scheduledFuture = c0632a.f6652h;
            C0097d c0097d = c0632a.f6646b;
            if (scheduledFuture != null) {
                c0097d.d("Cancelling previous scheduled retry", null, new Object[0]);
                c0632a.f6652h.cancel(false);
                c0632a.f6652h = null;
            }
            long j4 = 0;
            if (!c0632a.f6654j) {
                long j5 = c0632a.f6653i;
                if (j5 == 0) {
                    c0632a.f6653i = c0632a.f6647c;
                } else {
                    c0632a.f6653i = Math.min((long) (j5 * c0632a.f6650f), c0632a.f6648d);
                }
                double d4 = c0632a.f6649e;
                double d5 = c0632a.f6653i;
                j4 = (long) ((c0632a.f6651g.nextDouble() * d4 * d5) + ((1.0d - d4) * d5));
            }
            c0632a.f6654j = false;
            c0097d.d("Scheduling retry in %dms", null, Long.valueOf(j4));
            c0632a.f6652h = c0632a.f6645a.schedule(nVar, j4, TimeUnit.MILLISECONDS);
        }
    }
}
