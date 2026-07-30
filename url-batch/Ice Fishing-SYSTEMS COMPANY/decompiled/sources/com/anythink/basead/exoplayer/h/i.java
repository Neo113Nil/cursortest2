package com.anythink.basead.exoplayer.h;

import android.os.Handler;
import android.os.Looper;
import com.anythink.basead.exoplayer.ae;
import com.anythink.basead.exoplayer.h.aa;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i extends com.anythink.basead.exoplayer.h.f<e> implements x.b {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7791a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f7792b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f7793c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f7794d = 3;

    /* renamed from: e, reason: collision with root package name */
    private static final int f7795e = 4;

    /* renamed from: f, reason: collision with root package name */
    private static final int f7796f = 5;

    /* renamed from: g, reason: collision with root package name */
    private static final int f7797g = 6;

    /* renamed from: h, reason: collision with root package name */
    private final List<e> f7798h;
    private final List<e> i;

    /* renamed from: j, reason: collision with root package name */
    private final e f7799j;

    /* renamed from: k, reason: collision with root package name */
    private final Map<r, e> f7800k;

    /* renamed from: l, reason: collision with root package name */
    private final List<d> f7801l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f7802m;

    /* renamed from: n, reason: collision with root package name */
    private final ae.b f7803n;

    /* renamed from: o, reason: collision with root package name */
    private com.anythink.basead.exoplayer.h f7804o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f7805p;

    /* renamed from: q, reason: collision with root package name */
    private aa f7806q;

    /* renamed from: r, reason: collision with root package name */
    private int f7807r;

    /* renamed from: s, reason: collision with root package name */
    private int f7808s;

    public static final class a extends com.anythink.basead.exoplayer.h.a {

        /* renamed from: b, reason: collision with root package name */
        private final int f7809b;

        /* renamed from: c, reason: collision with root package name */
        private final int f7810c;

        /* renamed from: d, reason: collision with root package name */
        private final int[] f7811d;

        /* renamed from: e, reason: collision with root package name */
        private final int[] f7812e;

        /* renamed from: f, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.ae[] f7813f;

        /* renamed from: g, reason: collision with root package name */
        private final Object[] f7814g;

        /* renamed from: h, reason: collision with root package name */
        private final HashMap<Object, Integer> f7815h;

        public a(Collection<e> collection, int i, int i4, aa aaVar, boolean z8) {
            super(z8, aaVar);
            this.f7809b = i;
            this.f7810c = i4;
            int size = collection.size();
            this.f7811d = new int[size];
            this.f7812e = new int[size];
            this.f7813f = new com.anythink.basead.exoplayer.ae[size];
            this.f7814g = new Object[size];
            this.f7815h = new HashMap<>();
            int i9 = 0;
            for (e eVar : collection) {
                this.f7813f[i9] = eVar.f7824c;
                this.f7811d[i9] = eVar.f7827f;
                this.f7812e[i9] = eVar.f7826e;
                Object[] objArr = this.f7814g;
                Object obj = eVar.f7823b;
                objArr[i9] = obj;
                this.f7815h.put(obj, Integer.valueOf(i9));
                i9++;
            }
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int a(int i) {
            return com.anythink.basead.exoplayer.k.af.a(this.f7811d, i + 1);
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int b(int i) {
            return com.anythink.basead.exoplayer.k.af.a(this.f7812e, i + 1);
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final com.anythink.basead.exoplayer.ae c(int i) {
            return this.f7813f[i];
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int d(int i) {
            return this.f7811d[i];
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int e(int i) {
            return this.f7812e[i];
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final Object f(int i) {
            return this.f7814g[i];
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int b(Object obj) {
            Integer num = this.f7815h.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final int c() {
            return this.f7810c;
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final int b() {
            return this.f7809b;
        }
    }

    public static final class b extends p {

        /* renamed from: c, reason: collision with root package name */
        private static final Object f7816c = new Object();

        /* renamed from: d, reason: collision with root package name */
        private static final ae.a f7817d = new ae.a();

        /* renamed from: e, reason: collision with root package name */
        private static final c f7818e = new c(0);

        /* renamed from: f, reason: collision with root package name */
        private final Object f7819f;

        public b() {
            this(f7818e, null);
        }

        public final b a(com.anythink.basead.exoplayer.ae aeVar) {
            return new b(aeVar, (this.f7819f != null || aeVar.c() <= 0) ? this.f7819f : aeVar.a(0, f7817d, true).f6500b);
        }

        public final com.anythink.basead.exoplayer.ae d() {
            return this.f7916b;
        }

        private b(com.anythink.basead.exoplayer.ae aeVar, Object obj) {
            super(aeVar);
            this.f7819f = obj;
        }

        @Override // com.anythink.basead.exoplayer.h.p, com.anythink.basead.exoplayer.ae
        public final ae.a a(int i, ae.a aVar, boolean z8) {
            this.f7916b.a(i, aVar, z8);
            if (com.anythink.basead.exoplayer.k.af.a(aVar.f6500b, this.f7819f)) {
                aVar.f6500b = f7816c;
            }
            return aVar;
        }

        @Override // com.anythink.basead.exoplayer.h.p, com.anythink.basead.exoplayer.ae
        public final int a(Object obj) {
            com.anythink.basead.exoplayer.ae aeVar = this.f7916b;
            if (f7816c.equals(obj)) {
                obj = this.f7819f;
            }
            return aeVar.a(obj);
        }
    }

    public static final class c extends com.anythink.basead.exoplayer.ae {
        private c() {
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final int a(Object obj) {
            return obj == null ? 0 : -1;
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final int b() {
            return 1;
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final int c() {
            return 1;
        }

        public /* synthetic */ c(byte b9) {
            this();
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final ae.b a(int i, ae.b bVar, boolean z8, long j9) {
            return bVar.a(null, com.anythink.basead.exoplayer.b.f6539b, com.anythink.basead.exoplayer.b.f6539b, false, true, j9 > 0 ? com.anythink.basead.exoplayer.b.f6539b : 0L, com.anythink.basead.exoplayer.b.f6539b, 0L);
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final ae.a a(int i, ae.a aVar, boolean z8) {
            return aVar.a(null, null, com.anythink.basead.exoplayer.b.f6539b, 0L);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f7820a;

        /* renamed from: b, reason: collision with root package name */
        public final Runnable f7821b;

        public d(Runnable runnable) {
            this.f7821b = runnable;
            this.f7820a = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        }

        private void a() {
            this.f7820a.post(this.f7821b);
        }
    }

    public static final class f<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f7830a;

        /* renamed from: b, reason: collision with root package name */
        public final T f7831b;

        /* renamed from: c, reason: collision with root package name */
        public final d f7832c;

        public f(int i, T t9, Runnable runnable) {
            this.f7830a = i;
            this.f7832c = runnable != null ? new d(runnable) : null;
            this.f7831b = t9;
        }
    }

    public i() {
        this(false, (aa) new aa.a());
    }

    private s b(int i) {
        return this.f7798h.get(i).f7822a;
    }

    private void c(int i) {
        e remove = this.i.remove(i);
        b bVar = remove.f7824c;
        a(i, -1, -bVar.b(), -bVar.c());
        remove.f7829h = true;
        if (remove.i.isEmpty()) {
            a((i) remove);
        }
    }

    private int d() {
        return this.f7798h.size();
    }

    private void e() {
        this.f7805p = false;
        List arrayList = this.f7801l.isEmpty() ? Collections.EMPTY_LIST : new ArrayList(this.f7801l);
        this.f7801l.clear();
        a(new a(this.i, this.f7807r, this.f7808s, this.f7806q, this.f7802m), (Object) null);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f7804o.a((x.b) this).a(6).a(arrayList).i();
    }

    private void f() {
        for (int size = this.i.size() - 1; size >= 0; size--) {
            c(size);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.f
    public final /* bridge */ /* synthetic */ int a(e eVar, int i) {
        return i + eVar.f7826e;
    }

    private i(boolean z8) {
        this(z8, new aa.a());
    }

    private void b(int i, Collection<e> collection) {
        Iterator<e> it = collection.iterator();
        while (it.hasNext()) {
            a(i, it.next());
            i++;
        }
    }

    private int d(int i) {
        e eVar = this.f7799j;
        eVar.f7827f = i;
        int binarySearch = Collections.binarySearch(this.i, eVar);
        if (binarySearch < 0) {
            return (-binarySearch) - 2;
        }
        while (binarySearch < this.i.size() - 1) {
            int i4 = binarySearch + 1;
            if (this.i.get(i4).f7827f != i) {
                break;
            }
            binarySearch = i4;
        }
        return binarySearch;
    }

    private i(boolean z8, aa aaVar) {
        this(z8, aaVar, new s[0]);
    }

    @Override // com.anythink.basead.exoplayer.h.f
    public final /* synthetic */ s.a a(e eVar, s.a aVar) {
        e eVar2 = eVar;
        for (int i = 0; i < eVar2.i.size(); i++) {
            if (eVar2.i.get(i).f7834b.f7927d == aVar.f7927d) {
                return aVar.a(aVar.f7924a + eVar2.f7827f);
            }
        }
        return null;
    }

    private i(s... sVarArr) {
        this(sVarArr, (byte) 0);
    }

    private void b(e eVar, com.anythink.basead.exoplayer.ae aeVar) {
        if (eVar != null) {
            b bVar = eVar.f7824c;
            if (bVar.d() == aeVar) {
                return;
            }
            int b9 = aeVar.b() - bVar.b();
            int c4 = aeVar.c() - bVar.c();
            if (b9 != 0 || c4 != 0) {
                a(eVar.f7825d + 1, 0, b9, c4);
            }
            eVar.f7824c = bVar.a(aeVar);
            if (!eVar.f7828g && !aeVar.a()) {
                aeVar.a(0, this.f7803n, false);
                ae.b bVar2 = this.f7803n;
                long j9 = bVar2.f6513j + bVar2.f6512h;
                for (int i = 0; i < eVar.i.size(); i++) {
                    l lVar = eVar.i.get(i);
                    lVar.d(j9);
                    lVar.f();
                }
                eVar.f7828g = true;
            }
            a((d) null);
            return;
        }
        throw new IllegalArgumentException();
    }

    private i(s[] sVarArr, byte b9) {
        this(false, new aa.a(), sVarArr);
    }

    public static final class e implements Comparable<e> {

        /* renamed from: a, reason: collision with root package name */
        public final s f7822a;

        /* renamed from: d, reason: collision with root package name */
        public int f7825d;

        /* renamed from: e, reason: collision with root package name */
        public int f7826e;

        /* renamed from: f, reason: collision with root package name */
        public int f7827f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f7828g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f7829h;

        /* renamed from: c, reason: collision with root package name */
        public b f7824c = new b();
        public List<l> i = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f7823b = new Object();

        public e(s sVar) {
            this.f7822a = sVar;
        }

        public final void a(int i, int i4, int i9) {
            this.f7825d = i;
            this.f7826e = i4;
            this.f7827f = i9;
            this.f7828g = false;
            this.f7829h = false;
            this.i.clear();
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(e eVar) {
            return this.f7827f - eVar.f7827f;
        }

        private int a(e eVar) {
            return this.f7827f - eVar.f7827f;
        }
    }

    private i(boolean z8, aa aaVar, s... sVarArr) {
        for (s sVar : sVarArr) {
            C0544a.a(sVar);
        }
        this.f7806q = aaVar.a() > 0 ? aaVar.d() : aaVar;
        this.f7800k = new IdentityHashMap();
        ArrayList arrayList = new ArrayList();
        this.f7798h = arrayList;
        this.i = new ArrayList();
        this.f7801l = new ArrayList();
        this.f7799j = new e(null);
        this.f7802m = z8;
        this.f7803n = new ae.b();
        a(arrayList.size(), Arrays.asList(sVarArr), (Runnable) null);
    }

    @Override // com.anythink.basead.exoplayer.h.f
    public final /* synthetic */ void a(e eVar, s sVar, com.anythink.basead.exoplayer.ae aeVar, Object obj) {
        e eVar2 = eVar;
        if (eVar2 != null) {
            b bVar = eVar2.f7824c;
            if (bVar.d() != aeVar) {
                int b9 = aeVar.b() - bVar.b();
                int c4 = aeVar.c() - bVar.c();
                if (b9 != 0 || c4 != 0) {
                    a(eVar2.f7825d + 1, 0, b9, c4);
                }
                eVar2.f7824c = bVar.a(aeVar);
                if (!eVar2.f7828g && !aeVar.a()) {
                    aeVar.a(0, this.f7803n, false);
                    ae.b bVar2 = this.f7803n;
                    long j9 = bVar2.f6513j + bVar2.f6512h;
                    for (int i = 0; i < eVar2.i.size(); i++) {
                        l lVar = eVar2.i.get(i);
                        lVar.d(j9);
                        lVar.f();
                    }
                    eVar2.f7828g = true;
                }
                a((d) null);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    private void c() {
        this.f7798h.clear();
        com.anythink.basead.exoplayer.h hVar = this.f7804o;
        if (hVar != null) {
            hVar.a((x.b) this).a(4).a((Object) null).i();
        }
    }

    private void b(int i, int i4) {
        int min = Math.min(i, i4);
        int max = Math.max(i, i4);
        int i9 = this.i.get(min).f7826e;
        int i10 = this.i.get(min).f7827f;
        List<e> list = this.i;
        list.add(i4, list.remove(i));
        while (min <= max) {
            e eVar = this.i.get(min);
            eVar.f7826e = i9;
            eVar.f7827f = i10;
            i9 += eVar.f7824c.b();
            i10 += eVar.f7824c.c();
            min++;
        }
    }

    private void a(s sVar) {
        a(this.f7798h.size(), sVar, (Runnable) null);
    }

    private void a(s sVar, Runnable runnable) {
        a(this.f7798h.size(), sVar, runnable);
    }

    private void a(int i, s sVar) {
        a(i, sVar, (Runnable) null);
    }

    private void a(int i, s sVar, Runnable runnable) {
        C0544a.a(sVar);
        e eVar = new e(sVar);
        this.f7798h.add(i, eVar);
        com.anythink.basead.exoplayer.h hVar = this.f7804o;
        if (hVar != null) {
            hVar.a((x.b) this).a(0).a(new f(i, eVar, runnable)).i();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    private void a(Collection<s> collection) {
        a(this.f7798h.size(), collection, (Runnable) null);
    }

    private void a(Collection<s> collection, Runnable runnable) {
        a(this.f7798h.size(), collection, runnable);
    }

    private void a(int i, Collection<s> collection) {
        a(i, collection, (Runnable) null);
    }

    private void a(int i, Collection<s> collection, Runnable runnable) {
        Iterator<s> it = collection.iterator();
        while (it.hasNext()) {
            C0544a.a(it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<s> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new e(it2.next()));
        }
        this.f7798h.addAll(i, arrayList);
        if (this.f7804o != null && !collection.isEmpty()) {
            this.f7804o.a((x.b) this).a(1).a(new f(i, arrayList, runnable)).i();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    private void a(int i, Runnable runnable) {
        this.f7798h.remove(i);
        com.anythink.basead.exoplayer.h hVar = this.f7804o;
        if (hVar != null) {
            hVar.a((x.b) this).a(2).a(new f(i, null, runnable)).i();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    private void a(int i, int i4, Runnable runnable) {
        if (i == i4) {
            return;
        }
        List<e> list = this.f7798h;
        list.add(i4, list.remove(i));
        com.anythink.basead.exoplayer.h hVar = this.f7804o;
        if (hVar != null) {
            hVar.a((x.b) this).a(3).a(new f(i, Integer.valueOf(i4), runnable)).i();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    private void a(Runnable runnable) {
        this.f7798h.clear();
        com.anythink.basead.exoplayer.h hVar = this.f7804o;
        if (hVar != null) {
            hVar.a((x.b) this).a(4).a(runnable != null ? new d(runnable) : null).i();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a(com.anythink.basead.exoplayer.h hVar, boolean z8) {
        super.a(hVar, z8);
        this.f7804o = hVar;
        if (this.f7798h.isEmpty()) {
            e();
            return;
        }
        this.f7806q = this.f7806q.a(0, this.f7798h.size());
        b(0, this.f7798h);
        a((d) null);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.basead.exoplayer.j.b bVar) {
        int i;
        int i4 = aVar.f7924a;
        e eVar = this.f7799j;
        eVar.f7827f = i4;
        int binarySearch = Collections.binarySearch(this.i, eVar);
        if (binarySearch < 0) {
            i = (-binarySearch) - 2;
        } else {
            while (binarySearch < this.i.size() - 1) {
                int i9 = binarySearch + 1;
                if (this.i.get(i9).f7827f != i4) {
                    break;
                }
                binarySearch = i9;
            }
            i = binarySearch;
        }
        e eVar2 = this.i.get(i);
        l lVar = new l(eVar2.f7822a, aVar.a(aVar.f7924a - eVar2.f7827f), bVar);
        this.f7800k.put(lVar, eVar2);
        eVar2.i.add(lVar);
        if (eVar2.f7828g) {
            lVar.f();
        }
        return lVar;
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(r rVar) {
        e remove = this.f7800k.remove(rVar);
        ((l) rVar).g();
        remove.i.remove(rVar);
        if (remove.i.isEmpty() && remove.f7829h) {
            a((i) remove);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a() {
        super.a();
        this.i.clear();
        this.f7804o = null;
        this.f7806q = this.f7806q.d();
        this.f7807r = 0;
        this.f7808s = 0;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static s.a a2(e eVar, s.a aVar) {
        for (int i = 0; i < eVar.i.size(); i++) {
            if (eVar.i.get(i).f7834b.f7927d == aVar.f7927d) {
                return aVar.a(aVar.f7924a + eVar.f7827f);
            }
        }
        return null;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static int a2(e eVar, int i) {
        return i + eVar.f7826e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.anythink.basead.exoplayer.x.b
    public final void a(int i, Object obj) {
        switch (i) {
            case 0:
                f fVar = (f) obj;
                this.f7806q = this.f7806q.a(fVar.f7830a, 1);
                a(fVar.f7830a, (e) fVar.f7831b);
                a(fVar.f7832c);
                return;
            case 1:
                f fVar2 = (f) obj;
                this.f7806q = this.f7806q.a(fVar2.f7830a, ((Collection) fVar2.f7831b).size());
                b(fVar2.f7830a, (Collection<e>) fVar2.f7831b);
                a(fVar2.f7832c);
                return;
            case 2:
                f fVar3 = (f) obj;
                this.f7806q = this.f7806q.c(fVar3.f7830a);
                c(fVar3.f7830a);
                a(fVar3.f7832c);
                return;
            case 3:
                f fVar4 = (f) obj;
                aa c4 = this.f7806q.c(fVar4.f7830a);
                this.f7806q = c4;
                this.f7806q = c4.a(((Integer) fVar4.f7831b).intValue(), 1);
                int i4 = fVar4.f7830a;
                int intValue = ((Integer) fVar4.f7831b).intValue();
                int min = Math.min(i4, intValue);
                int max = Math.max(i4, intValue);
                int i9 = this.i.get(min).f7826e;
                int i10 = this.i.get(min).f7827f;
                List<e> list = this.i;
                list.add(intValue, list.remove(i4));
                while (min <= max) {
                    e eVar = this.i.get(min);
                    eVar.f7826e = i9;
                    eVar.f7827f = i10;
                    i9 += eVar.f7824c.b();
                    i10 += eVar.f7824c.c();
                    min++;
                }
                a(fVar4.f7832c);
                return;
            case 4:
                for (int size = this.i.size() - 1; size >= 0; size--) {
                    c(size);
                }
                a((d) obj);
                return;
            case 5:
                e();
                return;
            case 6:
                List list2 = (List) obj;
                for (int i11 = 0; i11 < list2.size(); i11++) {
                    d dVar = (d) list2.get(i11);
                    dVar.f7820a.post(dVar.f7821b);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    private void a(d dVar) {
        if (!this.f7805p) {
            this.f7804o.a((x.b) this).a(5).i();
            this.f7805p = true;
        }
        if (dVar != null) {
            this.f7801l.add(dVar);
        }
    }

    private void a(int i, e eVar) {
        if (i > 0) {
            e eVar2 = this.i.get(i - 1);
            eVar.a(i, eVar2.f7824c.b() + eVar2.f7826e, eVar2.f7824c.c() + eVar2.f7827f);
        } else {
            eVar.a(i, 0, 0);
        }
        a(i, 1, eVar.f7824c.b(), eVar.f7824c.c());
        this.i.add(i, eVar);
        a((i) eVar, eVar.f7822a);
    }

    private void a(int i, int i4, int i9, int i10) {
        this.f7807r += i9;
        this.f7808s += i10;
        while (i < this.i.size()) {
            this.i.get(i).f7825d += i4;
            this.i.get(i).f7826e += i9;
            this.i.get(i).f7827f += i10;
            i++;
        }
    }

    private void a(int i) {
        this.f7798h.remove(i);
        com.anythink.basead.exoplayer.h hVar = this.f7804o;
        if (hVar != null) {
            hVar.a((x.b) this).a(2).a(new f(i, null, null)).i();
        }
    }

    private void a(int i, int i4) {
        if (i != i4) {
            List<e> list = this.f7798h;
            list.add(i4, list.remove(i));
            com.anythink.basead.exoplayer.h hVar = this.f7804o;
            if (hVar != null) {
                hVar.a((x.b) this).a(3).a(new f(i, Integer.valueOf(i4), null)).i();
            }
        }
    }

    private void a(e eVar, com.anythink.basead.exoplayer.ae aeVar) {
        if (eVar != null) {
            b bVar = eVar.f7824c;
            if (bVar.d() != aeVar) {
                int b9 = aeVar.b() - bVar.b();
                int c4 = aeVar.c() - bVar.c();
                if (b9 != 0 || c4 != 0) {
                    a(eVar.f7825d + 1, 0, b9, c4);
                }
                eVar.f7824c = bVar.a(aeVar);
                if (!eVar.f7828g && !aeVar.a()) {
                    aeVar.a(0, this.f7803n, false);
                    ae.b bVar2 = this.f7803n;
                    long j9 = bVar2.f6513j + bVar2.f6512h;
                    for (int i = 0; i < eVar.i.size(); i++) {
                        l lVar = eVar.i.get(i);
                        lVar.d(j9);
                        lVar.f();
                    }
                    eVar.f7828g = true;
                }
                a((d) null);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}
