package com.ironsource.b;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.aiming.mdt.utils.Constants;
import com.ironsource.b.d.c;
import com.ironsource.b.f.s;
import com.ironsource.b.h.a;
import com.ironsource.b.k;
import com.ironsource.b.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: IronSourceObject.java */
/* loaded from: classes2.dex */
public class m implements o.c {
    private static m I;
    private List<k.a> A;
    private Activity B;
    private Set<k.a> C;
    private Set<k.a> D;
    private n F;
    private int H;
    private boolean J;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList<k.a> f6963b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<b> f6964c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<b> f6965d;
    private ArrayList<b> e;
    private b f;
    private q g;
    private i h;
    private p i;
    private d j;
    private com.ironsource.b.d.d k;
    private com.ironsource.b.f.m l;
    private com.ironsource.b.d.f m;
    private AtomicBoolean n;
    private AtomicBoolean y;

    /* renamed from: a, reason: collision with root package name */
    private final String f6962a = getClass().getName();
    private final Object o = new Object();
    private com.ironsource.b.h.h p = null;
    private String q = null;
    private String r = null;
    private Integer s = null;
    private String t = null;
    private String u = null;
    private String v = null;
    private Map<String, String> w = null;
    private String x = null;
    private boolean z = false;
    private boolean E = true;
    private final String G = "sessionDepth";
    private Boolean K = null;

    /* compiled from: IronSourceObject.java */
    public interface a {
        void a(String str);
    }

    @Override // com.ironsource.b.o.c
    public void e() {
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            if (I == null) {
                I = new m();
            }
            mVar = I;
        }
        return mVar;
    }

    private m() {
        q();
        this.n = new AtomicBoolean();
        this.f6963b = new ArrayList<>();
        this.f6964c = new ArrayList<>();
        this.f6965d = new ArrayList<>();
        this.e = new ArrayList<>();
        this.C = new HashSet();
        this.D = new HashSet();
        this.y = new AtomicBoolean(true);
        this.H = 0;
        this.J = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065 A[Catch: all -> 0x0127, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x0011, B:11:0x0015, B:13:0x0019, B:15:0x002d, B:17:0x002f, B:20:0x0046, B:22:0x0065, B:26:0x0071, B:28:0x0080, B:30:0x0086, B:39:0x008c, B:41:0x0090, B:32:0x009e, B:33:0x00ac, B:37:0x00a9, B:43:0x00bc, B:45:0x00c6, B:46:0x00cf, B:49:0x00e0, B:51:0x00ea, B:52:0x00ef, B:54:0x00f9, B:55:0x0102, B:58:0x0032, B:60:0x003a, B:62:0x0044, B:64:0x0117, B:65:0x011b), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071 A[Catch: all -> 0x0127, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x0011, B:11:0x0015, B:13:0x0019, B:15:0x002d, B:17:0x002f, B:20:0x0046, B:22:0x0065, B:26:0x0071, B:28:0x0080, B:30:0x0086, B:39:0x008c, B:41:0x0090, B:32:0x009e, B:33:0x00ac, B:37:0x00a9, B:43:0x00bc, B:45:0x00c6, B:46:0x00cf, B:49:0x00e0, B:51:0x00ea, B:52:0x00ef, B:54:0x00f9, B:55:0x0102, B:58:0x0032, B:60:0x003a, B:62:0x0044, B:64:0x0117, B:65:0x011b), top: B:2:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void a(Activity activity, String str, boolean z, k.a... aVarArr) {
        if (this.y != null && this.y.compareAndSet(true, false)) {
            if (aVarArr != null && aVarArr.length != 0) {
                for (k.a aVar : aVarArr) {
                    this.C.add(aVar);
                    this.D.add(aVar);
                    if (aVar.equals(k.a.INTERSTITIAL)) {
                        this.J = true;
                    }
                }
                this.k.a(c.a.API, "init(appKey:" + str + ")", 1);
                if (activity != null) {
                    this.k.a(c.a.API, "Init Fail - provided activity is null", 2);
                    return;
                }
                this.B = activity;
                c(activity);
                com.ironsource.b.a.b m = m(str);
                if (m.a()) {
                    this.q = str;
                    if (this.E) {
                        JSONObject a2 = com.ironsource.b.h.g.a(z);
                        if (aVarArr != null) {
                            try {
                                for (k.a aVar2 : aVarArr) {
                                    a2.put(aVar2.toString(), true);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        int i = this.H + 1;
                        this.H = i;
                        a2.put("sessionDepth", i);
                        com.ironsource.b.b.g.c().a(new com.ironsource.a.b(14, a2));
                        this.E = false;
                    }
                    if (this.C.contains(k.a.INTERSTITIAL)) {
                        o.a().a(this.h);
                    }
                    o.a().a(this);
                    o.a().a(activity, str, this.r, aVarArr);
                } else {
                    if (this.C.contains(k.a.REWARDED_VIDEO)) {
                        this.l.b(false);
                    }
                    if (this.C.contains(k.a.OFFERWALL)) {
                        this.l.a(false, m.b());
                    }
                    com.ironsource.b.d.d.c().a(c.a.API, m.b().toString(), 1);
                    return;
                }
            }
            for (k.a aVar3 : k.a.values()) {
                this.C.add(aVar3);
            }
            this.J = true;
            this.k.a(c.a.API, "init(appKey:" + str + ")", 1);
            if (activity != null) {
            }
        } else if (aVarArr != null) {
            a(z, aVarArr);
        } else {
            this.k.a(c.a.API, "Multiple calls to init without ad units are not allowed", 3);
        }
    }

    public synchronized void a(Activity activity, String str, k.a... aVarArr) {
        ArrayList arrayList = new ArrayList();
        if (aVarArr != null) {
            for (k.a aVar : aVarArr) {
                if (!aVar.equals(k.a.BANNER) && !aVar.equals(k.a.OFFERWALL)) {
                    if (aVar.equals(k.a.INTERSTITIAL)) {
                        this.J = true;
                    }
                    arrayList.add(aVar);
                    if (!this.f6963b.contains(aVar)) {
                        this.f6963b.add(aVar);
                        if (aVar.equals(k.a.INTERSTITIAL)) {
                            this.h.r = true;
                        }
                    }
                }
                this.k.a(c.a.API, aVar + " ad unit cannot be initialized in demand only mode", 3);
            }
            if (arrayList.size() > 0) {
                a(activity, str, true, (k.a[]) arrayList.toArray(new k.a[arrayList.size()]));
            }
        }
    }

    private synchronized void a(boolean z, k.a... aVarArr) {
        int i = 0;
        for (k.a aVar : aVarArr) {
            if (aVar.equals(k.a.INTERSTITIAL)) {
                this.J = true;
            }
        }
        if (o.a().b() == o.a.INIT_FAILED) {
            try {
                if (this.l != null) {
                    int length = aVarArr.length;
                    while (i < length) {
                        k.a aVar2 = aVarArr[i];
                        if (!this.C.contains(aVar2)) {
                            a(aVar2, true);
                        }
                        i++;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return;
        }
        if (!this.z) {
            JSONObject a2 = com.ironsource.b.h.g.a(z);
            int length2 = aVarArr.length;
            boolean z2 = false;
            while (i < length2) {
                k.a aVar3 = aVarArr[i];
                if (!this.C.contains(aVar3)) {
                    this.C.add(aVar3);
                    this.D.add(aVar3);
                    try {
                        a2.put(aVar3.toString(), true);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    z2 = true;
                } else {
                    this.k.a(c.a.API, aVar3 + " ad unit has already been initialized", 3);
                    if (z && this.f6963b.contains(aVar3)) {
                        this.f6963b.remove(aVar3);
                    }
                }
                i++;
            }
            if (z2) {
                try {
                    int i2 = this.H + 1;
                    this.H = i2;
                    a2.put("sessionDepth", i2);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                com.ironsource.b.b.g.c().a(new com.ironsource.a.b(14, a2));
            }
            return;
        }
        if (this.A == null) {
            return;
        }
        JSONObject a3 = com.ironsource.b.h.g.a(z);
        boolean z3 = false;
        for (k.a aVar4 : aVarArr) {
            if (!this.C.contains(aVar4)) {
                this.C.add(aVar4);
                this.D.add(aVar4);
                try {
                    a3.put(aVar4.toString(), true);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                if (this.A != null && this.A.contains(aVar4)) {
                    a(aVar4);
                } else {
                    a(aVar4, false);
                }
                z3 = true;
            } else {
                this.k.a(c.a.API, aVar4 + " ad unit has already been initialized", 3);
                if (z && this.f6963b.contains(aVar4)) {
                    this.f6963b.remove(aVar4);
                }
            }
        }
        if (z3) {
            try {
                int i3 = this.H + 1;
                this.H = i3;
                a3.put("sessionDepth", i3);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            com.ironsource.b.b.g.c().a(new com.ironsource.a.b(14, a3));
        }
        return;
    }

    @Override // com.ironsource.b.o.c
    public void a(List<k.a> list, boolean z) {
        try {
            this.A = list;
            this.z = true;
            this.k.a(c.a.API, "onInitSuccess()", 1);
            if (z) {
                JSONObject a2 = com.ironsource.b.h.g.a(false);
                try {
                    a2.put("revived", true);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                com.ironsource.b.b.g.c().a(new com.ironsource.a.b(114, a2));
            }
            com.ironsource.b.b.d.c().b();
            com.ironsource.b.b.g.c().b();
            for (k.a aVar : k.a.values()) {
                if (this.C.contains(aVar)) {
                    if (list.contains(aVar)) {
                        a(aVar);
                    } else {
                        a(aVar, false);
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void a(k.a aVar) {
        switch (aVar) {
            case REWARDED_VIDEO:
                n();
                break;
            case INTERSTITIAL:
                o();
                break;
            case OFFERWALL:
                this.i.a(this.B, j(), k());
                break;
            case BANNER:
                p();
                break;
        }
    }

    private void n() {
        com.ironsource.b.e.o a2;
        com.ironsource.b.e.o a3;
        com.ironsource.b.e.o a4;
        this.g.r = this.f6963b.contains(k.a.REWARDED_VIDEO);
        if (this.g.r) {
            this.k.a(c.a.INTERNAL, "Rewarded Video started in Demand Only mode", 0);
        }
        int a5 = this.p.g().b().a();
        for (int i = 0; i < this.p.f().a().size(); i++) {
            String str = this.p.f().a().get(i);
            if (!TextUtils.isEmpty(str) && (a4 = this.p.e().a(str)) != null) {
                r rVar = new r(a4, a5);
                if (a(rVar)) {
                    rVar.a(this.g);
                    rVar.b(i + 1);
                    this.g.a((c) rVar);
                }
            }
        }
        if (this.g.i.size() > 0) {
            this.g.c(this.p.g().b().d().a());
            this.g.a(this.p.g().b().c());
            String c2 = this.p.c();
            if (!TextUtils.isEmpty(c2) && (a3 = this.p.e().a(c2)) != null) {
                r rVar2 = new r(a3, a5);
                if (a(rVar2)) {
                    rVar2.a(this.g);
                    this.g.b((c) rVar2);
                }
            }
            String d2 = this.p.d();
            if (!TextUtils.isEmpty(d2) && (a2 = this.p.e().a(d2)) != null) {
                r rVar3 = new r(a2, a5);
                if (a(rVar3)) {
                    rVar3.a(this.g);
                    this.g.c((c) rVar3);
                }
            }
            this.g.a(this.B, j(), k());
            return;
        }
        a(k.a.REWARDED_VIDEO, false);
    }

    private void o() {
        com.ironsource.b.e.o a2;
        this.h.r = this.f6963b.contains(k.a.INTERSTITIAL);
        if (this.h.r) {
            this.k.a(c.a.INTERNAL, "Interstitial started in Demand Only mode", 0);
        }
        int c2 = this.p.g().c().c();
        for (int i = 0; i < this.p.f().b().size(); i++) {
            String str = this.p.f().b().get(i);
            if (!TextUtils.isEmpty(str) && (a2 = this.p.e().a(str)) != null) {
                j jVar = new j(a2, c2);
                if (a(jVar)) {
                    jVar.a((com.ironsource.b.f.k) this.h);
                    jVar.b(i + 1);
                    this.h.a((c) jVar);
                }
            }
        }
        if (this.h.i.size() > 0) {
            this.h.a(this.p.g().c().b());
            this.h.a(this.B, j(), k());
        } else {
            a(k.a.INTERSTITIAL, false);
        }
    }

    private void p() {
        com.ironsource.b.e.o a2;
        long b2 = this.p.g().e().b();
        int d2 = this.p.g().e().d();
        for (int i = 0; i < this.p.f().c().size(); i++) {
            String str = this.p.f().c().get(i);
            if (!TextUtils.isEmpty(str) && (a2 = this.p.e().a(str)) != null) {
                e eVar = new e(a2, b2, d2);
                eVar.a(this.j);
                eVar.b(i + 1);
                this.j.a((c) eVar);
            }
        }
        if (this.j.i.size() > 0) {
            this.j.a(this.p.g().e().a());
            this.j.a(this.B, j(), k());
        } else {
            a(k.a.BANNER, false);
        }
    }

    private boolean a(c cVar) {
        return cVar.q() >= 1 && cVar.p() >= 1;
    }

    @Override // com.ironsource.b.o.c
    public void a(String str) {
        try {
            this.k.a(c.a.API, "onInitFailed(reason:" + str + ")", 1);
            if (this.l != null) {
                Iterator<k.a> it = this.C.iterator();
                while (it.hasNext()) {
                    a(it.next(), true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(k.a aVar, boolean z) {
        switch (aVar) {
            case REWARDED_VIDEO:
                if (z || r() || this.D.contains(aVar)) {
                    this.l.b(false);
                    break;
                }
                break;
            case OFFERWALL:
                if (z || t() || this.D.contains(aVar)) {
                    this.l.a(false);
                    break;
                }
                break;
        }
    }

    private void c(Activity activity) {
        if (this.n == null || !this.n.compareAndSet(false, true)) {
            return;
        }
        com.ironsource.b.b.h.a().a(new com.ironsource.b.h.e(activity.getApplicationContext()));
        com.ironsource.b.b.d.c().a(activity.getApplicationContext(), this.F);
        com.ironsource.b.b.g.c().a(activity.getApplicationContext(), this.F);
    }

    synchronized void a(b bVar) {
        if (this.f6964c != null && bVar != null && !this.f6964c.contains(bVar)) {
            this.f6964c.add(bVar);
        }
    }

    synchronized void b(b bVar) {
        if (this.f6965d != null && bVar != null && !this.f6965d.contains(bVar)) {
            this.f6965d.add(bVar);
        }
    }

    synchronized void c(b bVar) {
        if (this.e != null && bVar != null && !this.e.contains(bVar)) {
            this.e.add(bVar);
        }
    }

    synchronized void d(b bVar) {
        this.f = bVar;
    }

    synchronized b b(String str) {
        try {
            if (this.f6964c != null) {
                Iterator<b> it = this.f6964c.iterator();
                while (it.hasNext()) {
                    b next = it.next();
                    if (next.getProviderName().equals(str)) {
                        return next;
                    }
                }
            }
            if (this.f6965d != null) {
                Iterator<b> it2 = this.f6965d.iterator();
                while (it2.hasNext()) {
                    b next2 = it2.next();
                    if (next2.getProviderName().equals(str)) {
                        return next2;
                    }
                }
            }
            if (this.e != null) {
                Iterator<b> it3 = this.e.iterator();
                while (it3.hasNext()) {
                    b next3 = it3.next();
                    if (next3.getProviderName().equals(str)) {
                        return next3;
                    }
                }
            }
            if (this.f != null && this.f.getProviderName().equals(str)) {
                return this.f;
            }
        } catch (Exception e) {
            this.k.a(c.a.INTERNAL, "getExistingAdapter exception: " + e, 1);
        }
        return null;
    }

    private void q() {
        this.k = com.ironsource.b.d.d.b(0);
        this.m = new com.ironsource.b.d.f(null, 1);
        this.k.a(this.m);
        this.l = new com.ironsource.b.f.m();
        this.g = new q();
        this.g.a((s) this.l);
        this.g.a((com.ironsource.b.f.g) this.l);
        this.h = new i();
        this.h.a((com.ironsource.b.f.j) this.l);
        this.h.a((com.ironsource.b.f.p) this.l);
        this.h.a((com.ironsource.b.f.f) this.l);
        this.i = new p();
        this.i.a(this.l);
        this.j = new d();
    }

    public void a(Activity activity) {
        try {
            this.B = activity;
            this.k.a(c.a.API, "onResume()", 1);
            if (this.g != null) {
                this.g.a(activity);
            }
            if (this.h != null) {
                this.h.a(activity);
            }
            if (this.j != null) {
                this.j.a(activity);
            }
        } catch (Throwable th) {
            this.k.a(c.a.API, "onResume()", th);
        }
    }

    public void b(Activity activity) {
        try {
            this.k.a(c.a.API, "onPause()", 1);
            if (this.g != null) {
                this.g.b(activity);
            }
            if (this.h != null) {
                this.h.b(activity);
            }
            if (this.j != null) {
                this.j.b(activity);
            }
        } catch (Throwable th) {
            this.k.a(c.a.API, "onPause()", th);
        }
    }

    public void c(String str) {
        try {
            this.k.a(c.a.INTERNAL, this.f6962a + ":setMediationType(mediationType:" + str + ")", 1);
            if (a(str, 1, 64) && n(str)) {
                this.x = str;
            } else {
                this.k.a(c.a.INTERNAL, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
            }
        } catch (Exception e) {
            this.k.a(c.a.API, this.f6962a + ":setMediationType(mediationType:" + str + ")", e);
        }
    }

    public synchronized Integer b() {
        return this.s;
    }

    public synchronized String c() {
        return this.t;
    }

    synchronized String d() {
        return this.u;
    }

    synchronized String f() {
        return this.v;
    }

    synchronized Map<String, String> g() {
        return this.w;
    }

    public synchronized String h() {
        return this.x;
    }

    public void d(String str) {
        String str2 = "showRewardedVideo(" + str + ")";
        this.k.a(c.a.API, str2, 1);
        try {
            if (this.f6963b.contains(k.a.REWARDED_VIDEO)) {
                this.k.a(c.a.API, "Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", 3);
                return;
            }
            if (!r()) {
                this.l.d(com.ironsource.b.h.d.b("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", "Rewarded Video"));
                return;
            }
            com.ironsource.b.e.k k = k(str);
            if (k != null) {
                JSONObject a2 = com.ironsource.b.h.g.a(false);
                try {
                    a2.put("placement", k.b());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                com.ironsource.b.b.g.c().a(new com.ironsource.a.b(2, a2));
                this.g.a(k);
                this.g.a(k.b());
            }
        } catch (Exception e2) {
            this.k.a(c.a.API, str2, e2);
            this.l.d(com.ironsource.b.h.d.b("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", "Rewarded Video"));
        }
    }

    public boolean i() {
        Throwable th;
        boolean z;
        try {
            if (this.f6963b.contains(k.a.REWARDED_VIDEO)) {
                this.k.a(c.a.API, "Rewarded Video was initialized in demand only mode. Use isISDemandOnlyRewardedVideoAvailable instead", 3);
                return false;
            }
            z = this.g.e();
            try {
                JSONObject a2 = com.ironsource.b.h.g.a(false);
                try {
                    a2.put("status", String.valueOf(z));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                com.ironsource.b.b.g.c().a(new com.ironsource.a.b(18, a2));
                this.k.a(c.a.API, "isRewardedVideoAvailable():" + z, 1);
                return z;
            } catch (Throwable th2) {
                th = th2;
                this.k.a(c.a.API, "isRewardedVideoAvailable():" + z, 1);
                this.k.a(c.a.API, "isRewardedVideoAvailable()", th);
                return false;
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }

    public void a(s sVar) {
        if (sVar == null) {
            this.k.a(c.a.API, "setRewardedVideoListener(RVListener:null)", 1);
        } else {
            this.k.a(c.a.API, "setRewardedVideoListener(RVListener)", 1);
        }
        this.l.a(sVar);
    }

    public void e(String str) {
        String str2 = "showISDemandOnlyRewardedVideo(" + str + ")";
        this.k.a(c.a.API, str2, 1);
        try {
            if (!this.f6963b.contains(k.a.REWARDED_VIDEO)) {
                this.k.a(c.a.API, "Rewarded Video was initialized in mediation mode. Use showRewardedVideo instead", 3);
                return;
            }
            if (!r()) {
                this.l.onRewardedVideoAdShowFailed(str, com.ironsource.b.h.d.b("showISDemandOnlyRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", "Rewarded Video"));
                return;
            }
            com.ironsource.b.e.k b2 = this.p.g().b().b();
            if (b2 != null) {
                a(str, b2.b());
            }
        } catch (Exception e) {
            this.k.a(c.a.API, str2, e);
            this.l.onRewardedVideoAdShowFailed(str, com.ironsource.b.h.d.b("showISDemandOnlyRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", "Rewarded Video"));
        }
    }

    public void a(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append("showISDemandOnlyRewardedVideo(");
        sb.append(str);
        if (str2 == null) {
            str3 = ")";
        } else {
            str3 = " , " + str2 + ")";
        }
        sb.append(str3);
        String sb2 = sb.toString();
        this.k.a(c.a.API, sb2, 1);
        try {
            if (!this.f6963b.contains(k.a.REWARDED_VIDEO)) {
                this.k.a(c.a.API, "Rewarded Video was initialized in mediation mode. Use showRewardedVideo instead", 3);
                return;
            }
            if (!r()) {
                this.l.onRewardedVideoAdShowFailed(str, com.ironsource.b.h.d.b("showISDemandOnlyRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", "Rewarded Video"));
                return;
            }
            com.ironsource.b.e.k k = k(str2);
            if (k != null) {
                JSONObject a2 = com.ironsource.b.h.g.a(true);
                try {
                    a2.put("placement", k.b());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                com.ironsource.b.b.g.c().a(new com.ironsource.a.b(2, a2));
                this.g.a(k);
                this.g.a(str, k.b());
            }
        } catch (Exception e2) {
            this.k.a(c.a.API, sb2, e2);
            this.l.onRewardedVideoAdShowFailed(str, com.ironsource.b.h.d.b("showISDemandOnlyRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", "Rewarded Video"));
        }
    }

    public boolean f(String str) {
        Throwable th;
        boolean z;
        try {
            if (!this.f6963b.contains(k.a.REWARDED_VIDEO)) {
                this.k.a(c.a.API, "Rewarded Video was initialized in mediation mode. Use isRewardedVideoAvailable instead", 3);
                return false;
            }
            z = this.g.b(str);
            try {
                JSONObject a2 = com.ironsource.b.h.g.a(true);
                try {
                    a2.put("status", String.valueOf(z));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                com.ironsource.b.b.g.c().a(new com.ironsource.a.b(18, a2));
                this.k.a(c.a.API, "isISDemandOnlyRewardedVideoAvailable():" + z, 1);
                return z;
            } catch (Throwable th2) {
                th = th2;
                this.k.a(c.a.API, "isISDemandOnlyRewardedVideoAvailable():" + z, 1);
                this.k.a(c.a.API, "isISDemandOnlyRewardedVideoAvailable()", th);
                return false;
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }

    void a(com.ironsource.b.f.g gVar) {
        if (gVar == null) {
            this.k.a(c.a.API, "setISDemandOnlyRewardedVideoListener(ISDemandOnlyRewardedVideoListener:null)", 1);
        } else {
            this.k.a(c.a.API, "setISDemandOnlyRewardedVideoListener(ISDemandOnlyRewardedVideoListener)", 1);
        }
        this.l.a(gVar);
    }

    private boolean r() {
        return (this.p == null || this.p.g() == null || this.p.g().b() == null) ? false : true;
    }

    private com.ironsource.b.e.k k(String str) {
        com.ironsource.b.e.k a2 = this.p.g().b().a(str);
        if (a2 == null) {
            this.k.a(c.a.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
            a2 = this.p.g().b().b();
            if (a2 == null) {
                this.k.a(c.a.API, "Default placement was not found, please make sure you are using the right placements.", 3);
                return null;
            }
        }
        String a3 = a(a2.b(), com.ironsource.b.h.a.b(this.B, a2));
        if (TextUtils.isEmpty(a3)) {
            return a2;
        }
        this.k.a(c.a.API, a3, 1);
        this.l.d(com.ironsource.b.h.d.d("Rewarded Video", a3));
        return null;
    }

    public void g(String str) {
        String str2 = "loadISDemandOnlyInterstitial(" + str + ")";
        this.k.a(c.a.API, str2, 1);
        try {
            if (!this.f6963b.contains(k.a.INTERSTITIAL)) {
                this.k.a(c.a.API, "Interstitial was initialized in mediation mode. Use loadInterstitial instead", 3);
            } else if (!this.J) {
                this.k.a(c.a.API, "init() must be called before loadInterstitial()", 3);
            } else {
                this.h.c(str);
            }
        } catch (Throwable th) {
            this.k.a(c.a.API, str2, th);
        }
    }

    public void h(String str) {
        String str2 = "showISDemandOnlyInterstitial(" + str + ")";
        this.k.a(c.a.API, str2, 1);
        try {
            if (!this.f6963b.contains(k.a.INTERSTITIAL)) {
                this.k.a(c.a.API, "Interstitial was initialized in mediation mode. Use showInterstitial instead", 3);
                return;
            }
            if (!s()) {
                this.l.onInterstitialAdShowFailed(str, com.ironsource.b.h.d.b("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", Constants.ADTYPE_INTERSTITIAL));
                return;
            }
            com.ironsource.b.e.h a2 = this.p.g().c().a();
            if (a2 != null) {
                b(str, a2.b());
            }
        } catch (Exception e) {
            this.k.a(c.a.API, str2, e);
            this.l.onInterstitialAdShowFailed(str, com.ironsource.b.h.d.b("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", Constants.ADTYPE_INTERSTITIAL));
        }
    }

    public void b(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append("showISDemandOnlyInterstitial(");
        sb.append(str);
        if (str2 == null) {
            str3 = ")";
        } else {
            str3 = " , " + str2 + ")";
        }
        sb.append(str3);
        String sb2 = sb.toString();
        this.k.a(c.a.API, sb2, 1);
        try {
            if (!this.f6963b.contains(k.a.INTERSTITIAL)) {
                this.k.a(c.a.API, "Interstitial was initialized in mediation mode. Use showInterstitial instead", 3);
                return;
            }
            if (!s()) {
                this.l.onInterstitialAdShowFailed(str, com.ironsource.b.h.d.b("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", Constants.ADTYPE_INTERSTITIAL));
                return;
            }
            com.ironsource.b.e.h l = l(str2);
            if (l != null) {
                JSONObject a2 = com.ironsource.b.h.g.a(true);
                try {
                    a2.put("placement", l.b());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                com.ironsource.b.b.d.c().a(new com.ironsource.a.b(23, a2));
                this.h.a(l);
                this.h.a(str, l.b());
            }
        } catch (Exception e2) {
            this.k.a(c.a.API, sb2, e2);
            this.l.onInterstitialAdShowFailed(str, com.ironsource.b.h.d.b("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", Constants.ADTYPE_INTERSTITIAL));
        }
    }

    public boolean i(String str) {
        Throwable th;
        boolean z;
        try {
            if (!this.f6963b.contains(k.a.INTERSTITIAL)) {
                this.k.a(c.a.API, "Interstitial was initialized in mediation mode. Use isInterstitialReady instead", 3);
                return false;
            }
            z = this.h.d(str);
            try {
                JSONObject a2 = com.ironsource.b.h.g.a(true);
                try {
                    a2.put("status", String.valueOf(z));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                com.ironsource.b.b.d.c().a(new com.ironsource.a.b(30, a2));
                this.k.a(c.a.API, "isISDemandOnlyInterstitialReady(instanceId: " + str + "):" + z, 1);
                return z;
            } catch (Throwable th2) {
                th = th2;
                this.k.a(c.a.API, "isISDemandOnlyInterstitialReady(instanceId: " + str + "):" + z, 1);
                this.k.a(c.a.API, "isISDemandOnlyInterstitialReady(instanceId: " + str + ")", th);
                return false;
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }

    public void a(com.ironsource.b.f.f fVar) {
        if (fVar == null) {
            this.k.a(c.a.API, "setISDemandOnlyInterstitialListener(ISDemandOnlyInterstitialListener:null)", 1);
        } else {
            this.k.a(c.a.API, "setISDemandOnlyInterstitialListener(ISDemandOnlyInterstitialListener)", 1);
        }
        this.l.a(fVar);
    }

    private boolean s() {
        return (this.p == null || this.p.g() == null || this.p.g().c() == null) ? false : true;
    }

    private com.ironsource.b.e.h l(String str) {
        com.ironsource.b.e.h a2 = this.p.g().c().a(str);
        if (a2 == null) {
            this.k.a(c.a.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
            a2 = this.p.g().c().a();
            if (a2 == null) {
                this.k.a(c.a.API, "Default placement was not found, please make sure you are using the right placements.", 3);
                return null;
            }
        }
        String a3 = a(a2.b(), o(a2.b()));
        if (TextUtils.isEmpty(a3)) {
            return a2;
        }
        this.k.a(c.a.API, a3, 1);
        this.l.c(com.ironsource.b.h.d.d(Constants.ADTYPE_INTERSTITIAL, a3));
        return null;
    }

    private boolean t() {
        return (this.p == null || this.p.g() == null || this.p.g().d() == null) ? false : true;
    }

    private boolean u() {
        return (this.p == null || this.p.g() == null || this.p.g().e() == null) ? false : true;
    }

    com.ironsource.b.h.h a(Context context, String str, a aVar) {
        synchronized (this.o) {
            if (this.p != null) {
                return new com.ironsource.b.h.h(this.p);
            }
            com.ironsource.b.h.h b2 = b(context, str, aVar);
            if (b2 == null || !b2.a()) {
                b2 = a(context, str);
            }
            if (b2 != null) {
                this.p = b2;
                com.ironsource.b.h.g.b(context, b2.toString());
                a(this.p, context);
            }
            com.ironsource.b.b.d.c().b(true);
            com.ironsource.b.b.g.c().b(true);
            return b2;
        }
    }

    private com.ironsource.b.h.h a(Context context, String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(com.ironsource.b.h.g.b(context));
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("appKey");
        String optString2 = jSONObject.optString("userId");
        String optString3 = jSONObject.optString("response");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3) || j() == null || !optString.equals(j()) || !optString2.equals(str)) {
            return null;
        }
        com.ironsource.b.h.h hVar = new com.ironsource.b.h.h(context, optString, optString2, optString3);
        com.ironsource.b.d.b a2 = com.ironsource.b.h.d.a(optString, optString2);
        this.k.a(c.a.INTERNAL, a2.toString(), 1);
        this.k.a(c.a.INTERNAL, a2.toString() + ": " + hVar.toString(), 0);
        return hVar;
    }

    private com.ironsource.b.h.h b(Context context, String str, a aVar) {
        com.ironsource.b.h.h hVar;
        String a2;
        if (!com.ironsource.b.h.g.c(context)) {
            return null;
        }
        try {
            String a3 = a(context);
            if (TextUtils.isEmpty(a3)) {
                a3 = com.ironsource.environment.c.l(context);
                com.ironsource.b.d.d.c().a(c.a.INTERNAL, "using custom identifier", 1);
            }
            a2 = com.ironsource.b.g.a.a(com.ironsource.b.g.c.a(context, j(), str, a3, h(), this.F != null ? this.F.g() : null), aVar);
        } catch (Exception e) {
            e = e;
            hVar = null;
        }
        if (a2 == null) {
            return null;
        }
        if (com.ironsource.b.h.g.a() == 1) {
            String optString = new JSONObject(a2).optString("response", null);
            if (TextUtils.isEmpty(optString)) {
                return null;
            }
            a2 = com.ironsource.b.h.f.b("C38FB23A402222A0C17D34A92F971D1F", optString);
        }
        hVar = new com.ironsource.b.h.h(context, j(), str, a2);
        try {
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            return hVar;
        }
        if (hVar.a()) {
            return hVar;
        }
        return null;
    }

    private void a(com.ironsource.b.h.h hVar, Context context) {
        a(hVar);
        b(hVar, context);
    }

    private void b(com.ironsource.b.h.h hVar, Context context) {
        boolean b2 = r() ? hVar.g().b().d().b() : false;
        boolean b3 = s() ? hVar.g().c().d().b() : false;
        boolean b4 = u() ? hVar.g().e().c().b() : false;
        if (b2) {
            com.ironsource.b.b.g.c().b(hVar.g().b().d().d(), context);
            com.ironsource.b.b.g.c().a(hVar.g().b().d().c(), context);
            com.ironsource.b.b.g.c().b(hVar.g().b().d().f());
            com.ironsource.b.b.g.c().c(hVar.g().b().d().g());
            com.ironsource.b.b.g.c().a(hVar.g().b().d().e());
            com.ironsource.b.b.g.c().a(hVar.g().b().d().h(), context);
            com.ironsource.b.b.g.c().a(hVar.g().a().b());
        } else {
            com.ironsource.b.b.g.c().a(false);
        }
        if (b3) {
            com.ironsource.b.b.d.c().b(hVar.g().c().d().d(), context);
            com.ironsource.b.b.d.c().a(hVar.g().c().d().c(), context);
            com.ironsource.b.b.d.c().b(hVar.g().c().d().f());
            com.ironsource.b.b.d.c().c(hVar.g().c().d().g());
            com.ironsource.b.b.d.c().a(hVar.g().c().d().e());
            com.ironsource.b.b.d.c().a(hVar.g().c().d().h(), context);
            com.ironsource.b.b.d.c().a(hVar.g().a().b());
            return;
        }
        if (b4) {
            com.ironsource.b.e.b c2 = hVar.g().e().c();
            com.ironsource.b.b.d.c().b(c2.d(), context);
            com.ironsource.b.b.d.c().a(c2.c(), context);
            com.ironsource.b.b.d.c().b(c2.f());
            com.ironsource.b.b.d.c().c(c2.g());
            com.ironsource.b.b.d.c().a(c2.e());
            com.ironsource.b.b.d.c().a(c2.h(), context);
            com.ironsource.b.b.d.c().a(hVar.g().a().b());
            return;
        }
        com.ironsource.b.b.d.c().a(false);
    }

    private void a(com.ironsource.b.h.h hVar) {
        this.m.a(hVar.g().a().a().a());
        this.k.a("console", hVar.g().a().a().b());
    }

    synchronized void j(String str) {
        this.r = str;
    }

    public synchronized String j() {
        return this.q;
    }

    public synchronized String k() {
        return this.r;
    }

    private com.ironsource.b.a.b m(String str) {
        com.ironsource.b.a.b bVar = new com.ironsource.b.a.b();
        if (str != null) {
            if (a(str, 5, 10)) {
                if (!n(str)) {
                    bVar.a(com.ironsource.b.h.d.a("appKey", str, "should contain only english characters and numbers"));
                }
            } else {
                bVar.a(com.ironsource.b.h.d.a("appKey", str, "length should be between 5-10 characters"));
            }
        } else {
            bVar.a(new com.ironsource.b.d.b(506, "Init Fail - appKey is missing"));
        }
        return bVar;
    }

    private boolean a(String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }

    private boolean n(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    public String a(Context context) {
        try {
            String[] a2 = com.ironsource.environment.c.a(context);
            return (a2.length <= 0 || a2[0] == null) ? "" : a2[0];
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private a.EnumC0373a o(String str) {
        com.ironsource.b.e.h hVar;
        if (this.p == null || this.p.g() == null || this.p.g().c() == null) {
            return a.EnumC0373a.NOT_CAPPED;
        }
        com.ironsource.b.e.h hVar2 = null;
        try {
            hVar = this.p.g().c().a(str);
        } catch (Exception e) {
            e = e;
        }
        if (hVar == null) {
            try {
                hVar2 = this.p.g().c().a();
                if (hVar2 == null) {
                    this.k.a(c.a.API, "Default placement was not found", 3);
                }
            } catch (Exception e2) {
                hVar2 = hVar;
                e = e2;
                e.printStackTrace();
                hVar = hVar2;
                if (hVar != null) {
                }
            }
            hVar = hVar2;
        }
        if (hVar != null) {
            return a.EnumC0373a.NOT_CAPPED;
        }
        return com.ironsource.b.h.a.b(this.B, hVar);
    }

    String a(String str, a.EnumC0373a enumC0373a) {
        if (enumC0373a == null) {
            return null;
        }
        switch (enumC0373a) {
            case CAPPED_PER_DELIVERY:
                break;
            case CAPPED_PER_COUNT:
                break;
            case CAPPED_PER_PACE:
                break;
        }
        return null;
    }

    com.ironsource.b.h.h l() {
        return this.p;
    }

    public void a(boolean z) {
        this.K = Boolean.valueOf(z);
        com.ironsource.b.d.d.c().a(c.a.API, "setConsent : " + z, 1);
        if (this.g != null) {
            this.g.b(z);
        }
        if (this.h != null) {
            this.h.b(z);
        }
        if (this.j != null) {
            this.j.b(z);
        }
        if (this.f != null) {
            this.k.a(c.a.ADAPTER_API, "Offerwall | setConsent(consent:" + z + ")", 1);
            this.f.setConsent(z);
        }
        com.ironsource.b.b.g.c().a(new com.ironsource.a.b(z ? 40 : 41, com.ironsource.b.h.g.a(false)));
    }

    Boolean m() {
        return this.K;
    }
}
