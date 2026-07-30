package j5;

import a0.s0;
import androidx.lifecycle.c0;
import b3.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import t5.s;
import u3.t;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n {
    public static long F;
    public long E;

    /* renamed from: a, reason: collision with root package name */
    public final l5.i f5076a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f5077b;

    /* renamed from: c, reason: collision with root package name */
    public String f5078c;

    /* renamed from: f, reason: collision with root package name */
    public long f5081f;

    /* renamed from: g, reason: collision with root package name */
    public a f5082g;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f5086k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f5087l;

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f5088m;

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f5089n;

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f5090o;

    /* renamed from: p, reason: collision with root package name */
    public String f5091p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5092q;

    /* renamed from: r, reason: collision with root package name */
    public String f5093r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5094s;

    /* renamed from: t, reason: collision with root package name */
    public final b f5095t;

    /* renamed from: u, reason: collision with root package name */
    public final b6.d f5096u;

    /* renamed from: v, reason: collision with root package name */
    public final b6.d f5097v;

    /* renamed from: w, reason: collision with root package name */
    public final ScheduledExecutorService f5098w;

    /* renamed from: x, reason: collision with root package name */
    public final b1.b f5099x;

    /* renamed from: y, reason: collision with root package name */
    public final k5.a f5100y;

    /* renamed from: z, reason: collision with root package name */
    public String f5101z;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f5079d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public boolean f5080e = true;

    /* renamed from: h, reason: collision with root package name */
    public j f5083h = j.f5060f;

    /* renamed from: i, reason: collision with root package name */
    public long f5084i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f5085j = 0;
    public long A = 0;
    public int B = 0;
    public int C = 0;
    public ScheduledFuture D = null;

    public n(b bVar, s0 s0Var, l5.i iVar) {
        this.f5076a = iVar;
        this.f5095t = bVar;
        ScheduledExecutorService scheduledExecutorService = bVar.f5039a;
        this.f5098w = scheduledExecutorService;
        this.f5096u = bVar.f5040b;
        this.f5097v = bVar.f5041c;
        this.f5077b = s0Var;
        this.f5090o = new HashMap();
        this.f5086k = new HashMap();
        this.f5088m = new HashMap();
        this.f5089n = new ConcurrentHashMap();
        this.f5087l = new ArrayList();
        l.i iVar2 = bVar.f5042d;
        this.f5100y = new k5.a(scheduledExecutorService, new b1.b(iVar2, "ConnectionRetryHelper", (Object) null, 22));
        long j8 = F;
        F = 1 + j8;
        this.f5099x = new b1.b(iVar2, "PersistentConnection", a0.m.h(j8, "pc_"), 22);
        this.f5101z = null;
        b();
    }

    public final boolean a() {
        j jVar = this.f5083h;
        return jVar == j.f5063i || jVar == j.f5064j;
    }

    public final void b() {
        if (!d()) {
            if (this.f5079d.contains("connection_idle")) {
                a.a.z(!d(), "", new Object[0]);
                h("connection_idle");
                return;
            }
            return;
        }
        ScheduledFuture scheduledFuture = this.D;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.D = this.f5098w.schedule(new androidx.room.o(1, this), 60000L, TimeUnit.MILLISECONDS);
    }

    public final void c(String str) {
        b1.b bVar = this.f5099x;
        if (bVar.v()) {
            bVar.d("Connection interrupted for: ".concat(str), null, new Object[0]);
        }
        this.f5079d.add(str);
        a aVar = this.f5082g;
        k5.a aVar2 = this.f5100y;
        if (aVar != null) {
            aVar.c(2);
            this.f5082g = null;
        } else {
            b1.b bVar2 = aVar2.f5360b;
            if (aVar2.f5366h != null) {
                bVar2.d("Cancelling existing retry attempt", null, new Object[0]);
                aVar2.f5366h.cancel(false);
                aVar2.f5366h = null;
            } else {
                bVar2.d("No existing retry attempt to cancel", null, new Object[0]);
            }
            aVar2.f5367i = 0L;
            this.f5083h = j.f5060f;
        }
        aVar2.f5368j = true;
        aVar2.f5367i = 0L;
    }

    public final boolean d() {
        return this.f5090o.isEmpty() && this.f5089n.isEmpty() && this.f5086k.isEmpty() && this.f5088m.isEmpty();
    }

    public final void e(String str, ArrayList arrayList, Object obj, String str2, androidx.room.c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("p", a.a.D(arrayList));
        hashMap.put("d", obj);
        if (str2 != null) {
            hashMap.put("h", str2);
        }
        long j8 = this.f5084i;
        this.f5084i = 1 + j8;
        Long valueOf = Long.valueOf(j8);
        l lVar = new l();
        lVar.f5070a = str;
        lVar.f5071b = hashMap;
        lVar.f5072c = cVar;
        this.f5088m.put(valueOf, lVar);
        if (this.f5083h == j.f5064j) {
            k(j8);
        }
        this.E = System.currentTimeMillis();
        b();
    }

    public final k f(m mVar) {
        b1.b bVar = this.f5099x;
        if (bVar.v()) {
            bVar.d("removing query " + mVar, null, new Object[0]);
        }
        HashMap hashMap = this.f5090o;
        if (hashMap.containsKey(mVar)) {
            k kVar = (k) hashMap.get(mVar);
            hashMap.remove(mVar);
            b();
            return kVar;
        }
        if (bVar.v()) {
            bVar.d("Trying to remove listener for QuerySpec " + mVar + " but no listener exists.", null, new Object[0]);
        }
        return null;
    }

    public final void g() {
        j jVar = this.f5083h;
        j jVar2 = j.f5064j;
        a.a.z(jVar == jVar2, "Should be connected if we're restoring state, but we are: %s", jVar);
        b1.b bVar = this.f5099x;
        if (bVar.v()) {
            bVar.d("Restoring outstanding listens", null, new Object[0]);
        }
        for (k kVar : this.f5090o.values()) {
            if (bVar.v()) {
                bVar.d("Restoring listen " + kVar.f5067b, null, new Object[0]);
            }
            j(kVar);
        }
        if (bVar.v()) {
            bVar.d("Restoring writes.", null, new Object[0]);
        }
        ArrayList arrayList = new ArrayList(this.f5088m.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            k(((Long) obj).longValue());
        }
        ArrayList arrayList2 = this.f5087l;
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        arrayList2.clear();
        if (bVar.v()) {
            bVar.d("Restoring reads.", null, new Object[0]);
        }
        ConcurrentHashMap concurrentHashMap = this.f5089n;
        ArrayList arrayList3 = new ArrayList(concurrentHashMap.keySet());
        Collections.sort(arrayList3);
        Iterator it2 = arrayList3.iterator();
        if (it2.hasNext()) {
            Long l8 = (Long) it2.next();
            a.a.z(this.f5083h == jVar2, "sendGet called when we can't send gets", new Object[0]);
            concurrentHashMap.get(l8).getClass();
            throw new ClassCastException();
        }
    }

    public final void h(String str) {
        b1.b bVar = this.f5099x;
        if (bVar.v()) {
            bVar.d("Connection no longer interrupted for: ".concat(str), null, new Object[0]);
        }
        HashSet hashSet = this.f5079d;
        hashSet.remove(str);
        if (hashSet.size() == 0 && this.f5083h == j.f5060f) {
            m();
        }
    }

    public final void i() {
        if (this.f5093r == null) {
            g();
            return;
        }
        a.a.z(a(), "Must be connected to send auth, but was: %s", this.f5083h);
        b1.b bVar = this.f5099x;
        if (bVar.v()) {
            bVar.d("Sending app check.", null, new Object[0]);
        }
        i iVar = new i() { // from class: j5.d
            @Override // j5.i
            public final void a(Map map) {
                String str = (String) map.get("s");
                boolean equals = str.equals("ok");
                n nVar = n.this;
                if (equals) {
                    nVar.C = 0;
                } else {
                    nVar.f5093r = null;
                    nVar.f5094s = true;
                    String str2 = (String) map.get("d");
                    nVar.f5099x.d("App check failed: " + str + " (" + str2 + ")", null, new Object[0]);
                }
                nVar.g();
            }
        };
        HashMap hashMap = new HashMap();
        a.a.z(this.f5093r != null, "App check token must be set!", new Object[0]);
        hashMap.put("token", this.f5093r);
        l("appcheck", true, hashMap, iVar);
    }

    public final void j(k kVar) {
        q5.g gVar;
        HashMap hashMap = new HashMap();
        hashMap.put("p", a.a.D(kVar.f5067b.f5074a));
        Long l8 = kVar.f5069d;
        if (l8 != null) {
            hashMap.put("q", kVar.f5067b.f5075b);
            hashMap.put("t", l8);
        }
        q5.j jVar = (q5.j) kVar.f5068c.f6092a;
        hashMap.put("h", ((q5.a) jVar.f7539c.f7528h).f7513a.f8910f.v());
        if (j1.c.T(((q5.a) jVar.f7539c.f7528h).f7513a.f8910f) > 1024) {
            s sVar = ((q5.a) jVar.f7539c.f7528h).f7513a.f8910f;
            o5.f fVar = new o5.f();
            fVar.f6848f = Math.max(512L, (long) Math.sqrt(j1.c.T(sVar) * 100));
            if (sVar.isEmpty()) {
                gVar = new q5.g(Collections.EMPTY_LIST, Collections.singletonList(""));
            } else {
                t5.h hVar = new t5.h(fVar);
                q5.g.n(sVar, hVar);
                o5.j.b("Can't finish hashing in the middle processing a child", hVar.f8901d == 0);
                if (hVar.f8898a != null) {
                    hVar.b();
                }
                ArrayList arrayList = hVar.f8904g;
                arrayList.add("");
                gVar = new q5.g(hVar.f8903f, arrayList);
            }
            List unmodifiableList = Collections.unmodifiableList((List) gVar.f7527g);
            ArrayList arrayList2 = new ArrayList(unmodifiableList.size());
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((l5.f) it.next()).a());
            }
            List unmodifiableList2 = Collections.unmodifiableList((List) gVar.f7528h);
            if (arrayList2.size() != unmodifiableList2.size() - 1) {
                throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = Collections.unmodifiableList(arrayList2).iterator();
            while (it2.hasNext()) {
                arrayList3.add(a.a.D((List) it2.next()));
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("hs", Collections.unmodifiableList(unmodifiableList2));
            hashMap2.put("ps", arrayList3);
            hashMap.put("ch", hashMap2);
        }
        l("q", false, hashMap, new h(this, kVar));
    }

    public final void k(long j8) {
        a.a.z(this.f5083h == j.f5064j, "sendPut called when we can't send writes (we're disconnected or writes are paused).", new Object[0]);
        l lVar = (l) this.f5088m.get(Long.valueOf(j8));
        androidx.room.c cVar = lVar.f5072c;
        String str = lVar.f5070a;
        lVar.f5073d = true;
        l(str, false, lVar.f5071b, new g(this, str, j8, lVar, cVar));
    }

    public final void l(String str, boolean z8, HashMap hashMap, i iVar) {
        String[] strArr;
        long j8 = this.f5085j;
        this.f5085j = 1 + j8;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("r", Long.valueOf(j8));
        hashMap2.put("a", str);
        hashMap2.put("b", hashMap);
        a aVar = this.f5082g;
        aVar.getClass();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("t", "d");
        hashMap3.put("d", hashMap2);
        b1.b bVar = (b1.b) aVar.f5038f;
        if (aVar.f5034b != 2) {
            bVar.d("Tried to send on an unconnected connection", null, new Object[0]);
        } else {
            if (z8) {
                bVar.d("Sending data (contents hidden)", null, new Object[0]);
            } else {
                bVar.d("Sending data: %s", null, hashMap3);
            }
            r rVar = (r) aVar.f5036d;
            rVar.e();
            try {
                String m8 = t.m(hashMap3);
                if (m8.length() <= 16384) {
                    strArr = new String[]{m8};
                } else {
                    ArrayList arrayList = new ArrayList();
                    int i7 = 0;
                    while (i7 < m8.length()) {
                        int i8 = i7 + 16384;
                        arrayList.add(m8.substring(i7, Math.min(i8, m8.length())));
                        i7 = i8;
                    }
                    strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
                if (strArr.length > 1) {
                    rVar.f5110a.y("" + strArr.length);
                }
                for (String str2 : strArr) {
                    rVar.f5110a.y(str2);
                }
            } catch (IOException e9) {
                rVar.f5119j.i("Failed to serialize message: " + hashMap3.toString(), e9);
                rVar.f();
            }
        }
        this.f5086k.put(Long.valueOf(j8), iVar);
    }

    public final void m() {
        if (this.f5079d.size() == 0) {
            j jVar = this.f5083h;
            a.a.z(jVar == j.f5060f, "Not in disconnected state: %s", jVar);
            boolean z8 = this.f5092q;
            boolean z9 = this.f5094s;
            this.f5099x.d("Scheduling connection attempt", null, new Object[0]);
            this.f5092q = false;
            this.f5094s = false;
            c0 c0Var = new c0(this, z8, z9);
            k5.a aVar = this.f5100y;
            b1.b bVar = aVar.f5360b;
            z zVar = new z(7, (Object) aVar, (Object) c0Var, false);
            if (aVar.f5366h != null) {
                bVar.d("Cancelling previous scheduled retry", null, new Object[0]);
                aVar.f5366h.cancel(false);
                aVar.f5366h = null;
            }
            long j8 = 0;
            if (!aVar.f5368j) {
                long j9 = aVar.f5367i;
                if (j9 == 0) {
                    aVar.f5367i = aVar.f5361c;
                } else {
                    aVar.f5367i = Math.min((long) (j9 * aVar.f5364f), aVar.f5362d);
                }
                double d8 = aVar.f5363e;
                double d9 = aVar.f5367i;
                j8 = (long) ((aVar.f5365g.nextDouble() * d8 * d9) + ((1.0d - d8) * d9));
            }
            aVar.f5368j = false;
            bVar.d("Scheduling retry in %dms", null, Long.valueOf(j8));
            aVar.f5366h = aVar.f5359a.schedule(zVar, j8, TimeUnit.MILLISECONDS);
        }
    }
}
