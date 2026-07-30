package com.anythink.core.b;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h;
import com.anythink.core.common.h.a;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.al;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.h.aw;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.bw;
import com.anythink.core.common.h.n;
import com.anythink.core.common.j;
import com.anythink.core.common.v.aj;
import com.anythink.core.common.v.ak;
import com.anythink.core.common.v.l;
import com.anythink.core.common.v.p;
import com.anythink.core.common.v.q;
import com.anythink.core.common.w.a.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class b extends com.anythink.core.common.v.b implements j.b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11844a = "b";

    /* renamed from: d, reason: collision with root package name */
    protected com.anythink.core.common.h f11847d;

    /* renamed from: e, reason: collision with root package name */
    protected long f11848e;

    /* renamed from: g, reason: collision with root package name */
    private String f11850g;

    /* renamed from: h, reason: collision with root package name */
    private j.a f11851h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private long f11852j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f11853k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.core.common.h.a f11854l;

    /* renamed from: m, reason: collision with root package name */
    private Map<Integer, d> f11855m;

    /* renamed from: n, reason: collision with root package name */
    private long f11856n;

    /* renamed from: o, reason: collision with root package name */
    private List<bv> f11857o;

    /* renamed from: q, reason: collision with root package name */
    private com.anythink.core.common.t.b f11859q;

    /* renamed from: b, reason: collision with root package name */
    Map<String, n> f11845b = new ConcurrentHashMap(3);

    /* renamed from: c, reason: collision with root package name */
    com.anythink.core.common.t.b f11846c = new com.anythink.core.common.t.b() { // from class: com.anythink.core.b.b.1
        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.b.b.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.c();
                }
            });
        }
    };

    /* renamed from: p, reason: collision with root package name */
    private boolean f11858p = false;

    /* renamed from: f, reason: collision with root package name */
    h.b f11849f = new h.b() { // from class: com.anythink.core.b.b.3
        @Override // com.anythink.core.common.h.b
        public final void a(d dVar, int i) {
            b.a(b.this, dVar, i);
        }
    };

    /* renamed from: com.anythink.core.b.b$4, reason: invalid class name */
    public class AnonymousClass4 implements com.anythink.core.b.b.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11866a;

        public AnonymousClass4(int i) {
            this.f11866a = i;
        }

        @Override // com.anythink.core.b.b.b
        public final void a(bv bvVar, ATBaseAdAdapter aTBaseAdAdapter) {
            b.a(b.this, bvVar, aTBaseAdAdapter);
        }

        @Override // com.anythink.core.b.b.b
        public final void a(List<bv> list, List<bv> list2) {
            b.this.b(Integer.valueOf(this.f11866a), list, list2);
            com.anythink.core.common.h hVar = b.this.f11847d;
            if (hVar != null) {
                hVar.b();
            }
        }
    }

    /* renamed from: com.anythink.core.b.b$5, reason: invalid class name */
    public class AnonymousClass5 implements com.anythink.core.common.t.b {
        public AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.b.b.5.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.d();
                }
            });
        }
    }

    /* renamed from: com.anythink.core.b.b$7, reason: invalid class name */
    public class AnonymousClass7 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ bv f11871a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f11872b;

        public AnonymousClass7(bv bvVar, n nVar) {
            this.f11871a = bvVar;
            this.f11872b = nVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AdError errorCode = ErrorCode.getErrorCode(ErrorCode.adSourceBidError, "", this.f11871a.F());
            if (b.this.f11854l.f13485c.f13705d != null) {
                if (this.f11872b != null) {
                    b.this.f11854l.f13485c.f13705d.onAdSourceBiddingFail(this.f11872b, errorCode);
                }
                b.this.f11845b.remove(this.f11871a.z());
            }
            b.this.a(this.f11872b, errorCode, a.b.f17143c, this.f11871a);
        }
    }

    /* renamed from: com.anythink.core.b.b$8, reason: invalid class name */
    public class AnonymousClass8 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f11874a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ bv f11875b;

        public AnonymousClass8(n nVar, bv bvVar) {
            this.f11874a = nVar;
            this.f11875b = bvVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (b.this.f11854l.f13485c.f13705d != null) {
                n nVar = this.f11874a;
                if (nVar != null) {
                    aj.a(nVar, this.f11875b, 0, false);
                    b.this.f11854l.f13485c.f13705d.onAdSourceBiddingFilled(this.f11874a);
                }
                b.this.f11845b.remove(this.f11875b.z());
            }
        }
    }

    public b(com.anythink.core.common.h.a aVar) {
        this.f11854l = aVar;
        this.f11850g = aVar.f13487e;
        this.i = aVar.f13486d;
        this.f11852j = aVar.f13489g;
        this.f11847d = aVar.f13483F;
        List<bv> list = aVar.f13491j;
        int size = list.size();
        List<bv> a9 = aVar.f13506y.a();
        if (a9.size() > 0) {
            this.f11854l.f13507z = a9.size() + size;
        } else {
            this.f11854l.f13507z = size;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<bv> list2 = null;
        List<bv> list3 = null;
        List<bv> list4 = null;
        List<bv> list5 = null;
        for (int i = 0; i < size; i++) {
            bv bvVar = list.get(i);
            if (bvVar.q() == 1 || bvVar.q() == 3) {
                if (this.f11854l.f13482E == 1 && bvVar.q() == 3) {
                    list2 = list2 == null ? new ArrayList<>() : list2;
                    list2.add(bvVar);
                } else {
                    arrayList.add(bvVar);
                }
            } else if (bvVar.q() == 2) {
                list3 = list3 == null ? new ArrayList<>(size) : list3;
                list3.add(bvVar);
            } else if (bvVar.q() == 5) {
                list4 = list4 == null ? new ArrayList<>(size) : list4;
                list4.add(bvVar);
            } else if (bvVar.q() == 6) {
                list5 = list5 == null ? new ArrayList<>(size) : list5;
                list5.add(bvVar);
            } else if (bvVar.q() == 7) {
                arrayList2.add(bvVar);
            }
        }
        this.f11855m = new HashMap(5);
        if (arrayList.size() > 0 || arrayList2.size() > 0) {
            this.f11855m.put(1, new c(aVar.a(arrayList, arrayList2), list));
        }
        if (list2 != null && list2.size() > 0) {
            this.f11855m.put(3, new c(aVar.a(list2, null), list));
        }
        if (list3 != null && list3.size() > 0) {
            this.f11855m.put(2, new a(aVar.a(list3)));
        }
        if (list4 != null && list4.size() > 0) {
            this.f11855m.put(5, new h(aVar.b(list4)));
        }
        if (list5 == null || list5.size() <= 0) {
            return;
        }
        this.f11855m.put(6, new g(aVar.c(list5)));
    }

    private void e() {
        boolean z8 = this.f11854l.f13481D > 0;
        this.f11858p = z8;
        if (z8) {
            this.f11857o = Collections.synchronizedList(new ArrayList());
            this.f11859q = new AnonymousClass5();
            com.anythink.core.common.t.d.a().a(this.f11859q, this.f11854l.f13481D, false);
        }
    }

    private void b(long j9) {
        com.anythink.core.common.h.a aVar = this.f11854l;
        this.f11848e = aVar.i;
        ar arVar = aVar.f13485c;
        if (arVar.f13710j) {
            int i = arVar.f13709h;
            int bw = aVar.f13495n.a().bw();
            if (bw > 0 && i > bw) {
                this.f11848e = i - bw;
            }
        }
        if (this.f11848e <= 0) {
            this.f11848e = com.anythink.basead.exoplayer.i.a.f8040f;
        }
        this.f11848e += j9;
        com.anythink.core.common.t.d.a().a(this.f11846c, this.f11848e, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c() {
        try {
            j.a aVar = this.f11851h;
            if (aVar != null) {
                aVar.a(this.i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        try {
            if (this.f11858p) {
                this.f11858p = false;
                List<bv> list = this.f11857o;
                if (list != null && list.size() != 0) {
                    Objects.toString(this.f11857o);
                    ArrayList arrayList = new ArrayList(this.f11857o);
                    this.f11857o.clear();
                    j.a aVar = this.f11851h;
                    if (aVar != null) {
                        aVar.a(this.i, arrayList, new ArrayList(1), false);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.core.common.j.b
    public final void a(boolean z8) {
        this.f11853k = z8;
    }

    @Override // com.anythink.core.common.j.b
    public final void a(j.a aVar) {
        this.f11851h = aVar;
        com.anythink.core.common.h hVar = this.f11847d;
        long c4 = hVar == null ? 0L : hVar.c();
        a(this.f11852j + c4);
        com.anythink.core.common.h.a aVar2 = this.f11854l;
        this.f11848e = aVar2.i;
        ar arVar = aVar2.f13485c;
        if (arVar.f13710j) {
            int i = arVar.f13709h;
            int bw = aVar2.f13495n.a().bw();
            if (bw > 0 && i > bw) {
                this.f11848e = i - bw;
            }
        }
        if (this.f11848e <= 0) {
            this.f11848e = com.anythink.basead.exoplayer.i.a.f8040f;
        }
        this.f11848e += c4;
        com.anythink.core.common.t.d.a().a(this.f11846c, this.f11848e, false);
        boolean z8 = this.f11854l.f13481D > 0;
        this.f11858p = z8;
        if (z8) {
            this.f11857o = Collections.synchronizedList(new ArrayList());
            this.f11859q = new AnonymousClass5();
            com.anythink.core.common.t.d.a().a(this.f11859q, this.f11854l.f13481D, false);
        }
        this.f11856n = System.currentTimeMillis();
        HashMap hashMap = new HashMap(this.f11855m);
        com.anythink.core.common.h hVar2 = this.f11847d;
        if (hVar2 != null) {
            hVar2.a(this.f11849f);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            final Integer num = (Integer) entry.getKey();
            final d dVar = (d) entry.getValue();
            com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.b.b.2
                @Override // java.lang.Runnable
                public final void run() {
                    d dVar2 = dVar;
                    if (dVar2 != null) {
                        dVar2.a(b.this.f11848e);
                        dVar.a(b.this.f11853k);
                        b bVar = b.this;
                        com.anythink.core.common.h hVar3 = bVar.f11847d;
                        if (hVar3 == null) {
                            b.a(bVar, dVar, num.intValue());
                            return;
                        }
                        d dVar3 = dVar;
                        int intValue = num.intValue();
                        if (dVar3 != null) {
                            hVar3.new a(dVar3, intValue);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(Integer num, List<bv> list, List<bv> list2) {
        a(num, list, list2);
    }

    @Override // com.anythink.core.common.v.b
    public final void b() {
        HashMap hashMap;
        synchronized (this) {
            hashMap = new HashMap(this.f11855m);
        }
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            d dVar = (d) ((Map.Entry) it.next()).getValue();
            if (dVar != null) {
                dVar.a();
            }
        }
    }

    private void b(bv bvVar) {
        n nVar = this.f11845b.get(bvVar.z());
        if (nVar != null) {
            com.anythink.core.common.v.b.b.a().a(new AnonymousClass8(nVar, bvVar));
        }
        com.anythink.core.common.v.d.a().a(nVar, bvVar, 2);
    }

    private void a(d dVar, int i) {
        dVar.a(new AnonymousClass4(i));
    }

    private boolean a(Integer num) {
        d dVar = this.f11855m.get(num);
        if (dVar != null && dVar.c()) {
            this.f11855m.remove(num);
        }
        boolean z8 = false;
        if (this.f11855m.size() == 0) {
            a();
            com.anythink.core.common.t.d.a().b(this.f11846c);
            this.f11858p = false;
            z8 = true;
            if (this.f11859q != null) {
                com.anythink.core.common.t.d.a().b(this.f11859q);
            }
        }
        return z8;
    }

    private void a(String str, bv bvVar, boolean z8) {
        bv bvVar2;
        Throwable th;
        String str2;
        if (bvVar.r() == 2) {
            bw a9 = com.anythink.core.common.a.a().a(str, bvVar);
            ad R8 = bvVar.R();
            int i = 0;
            com.anythink.core.common.h.c cVar = null;
            if (a9 != null) {
                com.anythink.core.common.h.j a10 = a9.a((ad) null);
                cVar = a10.b();
                i = a10.d();
            }
            if (cVar != null) {
                bvVar.ay();
            }
            bvVar.toString();
            if (cVar == null || i < bvVar.ay()) {
                return;
            }
            try {
                double a11 = p.a(cVar.e().getUnitGroupInfo());
                if (l.a(bvVar, cVar.e().getUnitGroupInfo()) < 0) {
                    bvVar.a(bvVar, 2, bvVar.t(), 1);
                    return;
                }
                try {
                    bv unitGroupInfo = cVar.e().getUnitGroupInfo();
                    if (unitGroupInfo.R() != null) {
                        try {
                            str2 = unitGroupInfo.R().token;
                        } catch (Throwable th2) {
                            th = th2;
                            bvVar2 = bvVar;
                            th.printStackTrace();
                            bvVar2.a(cVar.e().getUnitGroupInfo(), 1, bvVar2.t(), z8 ? 1 : 0);
                        }
                    } else {
                        str2 = "";
                    }
                    if (R8 == null || TextUtils.equals(R8.token, str2)) {
                        bvVar2 = bvVar;
                    } else {
                        bvVar2 = bvVar;
                        try {
                            com.anythink.core.b.d.c.a(R8, new aw(2, bvVar2, this.f11854l.f13500s, a11), true, 26);
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            th.printStackTrace();
                            bvVar2.a(cVar.e().getUnitGroupInfo(), 1, bvVar2.t(), z8 ? 1 : 0);
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bvVar2 = bvVar;
                }
                bvVar2.a(cVar.e().getUnitGroupInfo(), 1, bvVar2.t(), z8 ? 1 : 0);
            } catch (Exception unused) {
            }
        }
    }

    private void a(bv bvVar, ATBaseAdAdapter aTBaseAdAdapter) {
        n nVar;
        try {
            nVar = this.f11854l.f13500s.af();
            try {
                aj.a(nVar, bvVar, 0, false);
                nVar.m(ak.a(bvVar, (ATBaseAdAdapter) null));
                this.f11845b.put(bvVar.z(), nVar);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            nVar = null;
        }
        if (bvVar.q() != 7 && aTBaseAdAdapter != null) {
            try {
                if (this.f11854l.f13485c.f13705d != null) {
                    aj.a(nVar);
                    this.f11854l.f13485c.f13705d.onAdSourceBiddingAttempt(nVar);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        a(nVar, (AdError) null, a.b.f17141a, bvVar);
        com.anythink.core.common.v.d.a().a(nVar, bvVar, 1);
    }

    private void a(bv bvVar) {
        n nVar = this.f11845b.get(bvVar.z());
        if (nVar != null) {
            com.anythink.core.common.v.b.b.a().a(new AnonymousClass7(bvVar, nVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(n nVar, AdError adError, int i, bv bvVar) {
        String str;
        String str2;
        if (nVar == null) {
            return;
        }
        com.anythink.core.common.w.a.b.d dVar = (com.anythink.core.common.w.a.b.d) com.anythink.core.common.w.a.a.d.a(nVar.aI(), com.anythink.core.common.w.a.b.d.class);
        if (dVar != null) {
            if (adError != null) {
                str = adError.getPlatformCode();
                str2 = adError.getPlatformMSG();
            } else {
                str = "";
                str2 = "";
            }
            al a9 = al.a(nVar, str, str2, i);
            a9.a(adError != null);
            dVar.a(a9);
        }
        bvVar.z();
        com.anythink.core.common.h.a aVar = this.f11854l;
        Context g9 = aVar != null ? aVar.f13484b : t.b().g();
        com.anythink.core.a.c.a();
        if (i == a.b.f17141a) {
            com.anythink.core.a.c.a(g9, bvVar, nVar.aI());
        } else if (i == a.b.f17143c) {
            com.anythink.core.a.c.b(g9, bvVar, nVar.aI());
        }
    }

    private synchronized void a(Integer num, List<bv> list, List<bv> list2) {
        boolean z8;
        try {
            d dVar = this.f11855m.get(num);
            if (dVar != null && dVar.c()) {
                this.f11855m.remove(num);
            }
            if (this.f11855m.size() == 0) {
                a();
                com.anythink.core.common.t.d.a().b(this.f11846c);
                this.f11858p = false;
                if (this.f11859q != null) {
                    com.anythink.core.common.t.d.a().b(this.f11859q);
                }
                z8 = true;
            } else {
                z8 = false;
            }
            int size = list != null ? list.size() : 0;
            int size2 = list2 != null ? list2.size() : 0;
            if (size > 0 || size2 > 0) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (size > 0) {
                    for (int i = 0; i < size; i++) {
                        bv bvVar = list.get(i);
                        a(this.f11850g, bvVar, true);
                        arrayList.add(bvVar);
                        arrayList3.add(bvVar);
                        n nVar = this.f11845b.get(bvVar.z());
                        if (nVar != null) {
                            com.anythink.core.common.v.b.b.a().a(new AnonymousClass8(nVar, bvVar));
                        }
                        com.anythink.core.common.v.d.a().a(nVar, bvVar, 2);
                    }
                    list.clear();
                }
                if (size2 > 0) {
                    for (int i4 = 0; i4 < size2; i4++) {
                        bv bvVar2 = list2.get(i4);
                        if (bvVar2 == null) {
                            try {
                                com.anythink.core.common.u.e.b("Bid Fail AdSource Object is null, currentSize:" + list2.size() + "\n" + q.a(new Throwable().getStackTrace()), "Bidding inner error", t.b().r());
                            } catch (Throwable unused) {
                            }
                        }
                        a(this.f11850g, bvVar2, false);
                        if (p.a(bvVar2) > 0.0d && !TextUtils.isEmpty(bvVar2.E())) {
                            arrayList.add(bvVar2);
                        } else {
                            arrayList2.add(bvVar2);
                        }
                        arrayList3.add(bvVar2);
                        n nVar2 = this.f11845b.get(bvVar2.z());
                        if (nVar2 != null) {
                            com.anythink.core.common.v.b.b.a().a(new AnonymousClass7(bvVar2, nVar2));
                        }
                    }
                    list2.clear();
                }
                n af = this.f11854l.f13500s.af();
                long j9 = this.f11856n;
                com.anythink.core.common.h.a aVar = this.f11854l;
                com.anythink.core.b.d.c.a(af, arrayList3, j9, aVar.f13501t, aVar.f13488f);
                if (this.f11858p) {
                    if (arrayList.size() > 0) {
                        List<bv> list3 = this.f11857o;
                        if (list3 != null) {
                            list3.addAll(arrayList);
                        }
                        arrayList.toString();
                        arrayList.clear();
                    }
                    if (arrayList.size() == 0 && arrayList2.size() == 0) {
                        return;
                    }
                }
                if (z8) {
                    List<bv> list4 = this.f11857o;
                    if (list4 != null && list4.size() > 0) {
                        arrayList.addAll(0, this.f11857o);
                        this.f11857o.clear();
                    }
                    com.anythink.core.common.h hVar = this.f11847d;
                    if (hVar != null) {
                        hVar.a();
                    }
                }
                if (arrayList.size() > 1) {
                    Collections.sort(arrayList, new Comparator<bv>() { // from class: com.anythink.core.b.b.6
                        private static int a(bv bvVar3, bv bvVar4) {
                            return l.a(bvVar3, bvVar4);
                        }

                        @Override // java.util.Comparator
                        public final /* synthetic */ int compare(bv bvVar3, bv bvVar4) {
                            return l.a(bvVar3, bvVar4);
                        }
                    });
                }
                j.a aVar2 = this.f11851h;
                if (aVar2 != null) {
                    aVar2.a(this.i, arrayList, arrayList2, z8);
                }
                if (z8) {
                    this.f11851h = null;
                }
            }
        } finally {
        }
    }

    public static /* synthetic */ void a(b bVar, d dVar, int i) {
        dVar.a(bVar.new AnonymousClass4(i));
    }

    public static /* synthetic */ void a(b bVar, bv bvVar, ATBaseAdAdapter aTBaseAdAdapter) {
        n nVar;
        try {
            nVar = bVar.f11854l.f13500s.af();
            try {
                aj.a(nVar, bvVar, 0, false);
                nVar.m(ak.a(bvVar, (ATBaseAdAdapter) null));
                bVar.f11845b.put(bvVar.z(), nVar);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            nVar = null;
        }
        if (bvVar.q() != 7 && aTBaseAdAdapter != null) {
            try {
                if (bVar.f11854l.f13485c.f13705d != null) {
                    aj.a(nVar);
                    bVar.f11854l.f13485c.f13705d.onAdSourceBiddingAttempt(nVar);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        bVar.a(nVar, (AdError) null, a.b.f17141a, bvVar);
        com.anythink.core.common.v.d.a().a(nVar, bvVar, 1);
    }
}
