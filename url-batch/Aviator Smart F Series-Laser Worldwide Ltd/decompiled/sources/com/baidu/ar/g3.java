package com.baidu.ar;

import android.os.Looper;
import android.text.TextUtils;
import com.baidu.ar.arplay.core.renderer.OnNeedCacheFrameListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class g3 {

    /* renamed from: a, reason: collision with root package name */
    public f3 f2314a;

    /* renamed from: b, reason: collision with root package name */
    public e3 f2315b;

    /* renamed from: f, reason: collision with root package name */
    public com.baidu.ar.arrender.a f2319f;

    /* renamed from: g, reason: collision with root package name */
    public OnNeedCacheFrameListener f2320g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2322i;

    /* renamed from: c, reason: collision with root package name */
    public ConcurrentHashMap<String, e3> f2316c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public List<t5> f2317d = Collections.synchronizedList(new ArrayList());

    /* renamed from: e, reason: collision with root package name */
    public ConcurrentHashMap<String, e3> f2318e = new ConcurrentHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    public long f2321h = 0;

    public class a implements OnNeedCacheFrameListener {
        public a() {
        }

        @Override // com.baidu.ar.arplay.core.renderer.OnNeedCacheFrameListener
        public boolean isNeedCacheFrame(long j8) {
            if (g3.this.f2314a == null) {
                return false;
            }
            if (g3.this.f2321h != j8) {
                g3 g3Var = g3.this;
                g3Var.f2322i = g3Var.f2314a.a();
            }
            g3.this.f2321h = j8;
            return g3.this.f2322i;
        }
    }

    public class b implements e3 {
        public b() {
        }

        @Override // com.baidu.ar.e3
        public void a(b3 b3Var) {
            g3.this.a(b3Var);
            if (g3.this.f2319f != null) {
                g3.this.f2319f.setSyncFrameTimestamp(b3Var.c());
            }
        }

        @Override // com.baidu.ar.e3
        public void b(kb kbVar) {
            h.a("DetectorManager", "mSyncDetectorGroup onRelease result = " + kbVar.b());
            g3.this.a(kbVar);
        }

        @Override // com.baidu.ar.e3
        public void a(kb kbVar) {
            h.a("DetectorManager", "mSyncDetectorGroup onSetup result = " + kbVar.b());
            g3.this.b(kbVar);
        }
    }

    public g3(com.baidu.ar.arrender.a aVar, Looper looper) {
        this.f2319f = aVar;
        a aVar2 = new a();
        this.f2320g = aVar2;
        this.f2319f.setCacheFrameListener(aVar2);
        this.f2314a = new f3(looper);
        b bVar = new b();
        this.f2315b = bVar;
        this.f2314a.a(bVar);
    }

    public synchronized void b() {
        try {
            List<t5> list = this.f2317d;
            if (list != null) {
                Iterator<t5> it = list.iterator();
                while (it.hasNext()) {
                    it.next().release();
                }
                this.f2317d.clear();
                this.f2317d = null;
            }
            f3 f3Var = this.f2314a;
            if (f3Var != null) {
                f3Var.release();
                com.baidu.ar.arrender.a aVar = this.f2319f;
                if (aVar != null) {
                    aVar.enableSyncRender(false);
                }
                this.f2314a = null;
            }
            ConcurrentHashMap<String, e3> concurrentHashMap = this.f2316c;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
                this.f2316c = null;
            }
            ConcurrentHashMap<String, e3> concurrentHashMap2 = this.f2318e;
            if (concurrentHashMap2 != null) {
                concurrentHashMap2.clear();
                this.f2318e = null;
            }
            this.f2315b = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void a() {
        b();
        this.f2319f = null;
        this.f2320g = null;
    }

    public final synchronized void a(b3 b3Var) {
        ConcurrentHashMap<String, e3> concurrentHashMap;
        if (b3Var != null) {
            if (b3Var instanceof c3) {
                Iterator<b3> it = ((c3) b3Var).d().iterator();
                while (it.hasNext()) {
                    b3 next = it.next();
                    if (next != null && !TextUtils.isEmpty(next.a()) && (concurrentHashMap = this.f2316c) != null && concurrentHashMap.get(next.a()) != null) {
                        this.f2316c.get(next.a()).a(next);
                    }
                }
            }
        }
    }

    public final synchronized void b(kb kbVar) {
        if (kbVar != null) {
            if (kbVar.a() != "DetectorGroup") {
                ConcurrentHashMap<String, e3> concurrentHashMap = this.f2316c;
                if (concurrentHashMap != null && concurrentHashMap.get(kbVar.a()) != null) {
                    this.f2316c.get(kbVar.a()).a(kbVar);
                }
            }
        }
    }

    public final synchronized void a(kb kbVar) {
        if (kbVar != null) {
            if (kbVar.a() != "DetectorGroup") {
                ConcurrentHashMap<String, e3> concurrentHashMap = this.f2316c;
                if (concurrentHashMap != null && concurrentHashMap.get(kbVar.a()) != null) {
                    this.f2316c.get(kbVar.a()).b(kbVar);
                }
            }
        }
    }

    public synchronized void a(o4 o4Var) {
        if (o4Var != null) {
            try {
                if (!TextUtils.isEmpty(o4Var.getName())) {
                    if (o4Var.d() && this.f2317d.contains(o4Var)) {
                        if (this.f2314a.b()) {
                            this.f2319f.enableSyncRender(true);
                        }
                        this.f2317d.remove(o4Var);
                        this.f2314a.b(o4Var, this.f2318e.get(o4Var.getName()));
                        e3 remove = this.f2318e.remove(o4Var.getName());
                        if (remove != null) {
                            this.f2316c.put(o4Var.getName(), remove);
                        }
                    } else if (!o4Var.d() && this.f2314a.a(o4Var)) {
                        this.f2314a.c(o4Var);
                        this.f2317d.add(o4Var);
                        o4Var.d(this.f2316c.get(o4Var.getName()));
                        e3 remove2 = this.f2316c.remove(o4Var.getName());
                        if (remove2 != null) {
                            this.f2318e.put(o4Var.getName(), remove2);
                        }
                        if (this.f2314a.b()) {
                            this.f2319f.enableSyncRender(false);
                        }
                    }
                }
            } finally {
            }
        }
    }

    public synchronized void a(t5 t5Var) {
        if (t5Var == null) {
            h.b("DetectorManager", "handleRemoveDetector detector is NULLLLL!!!");
            return;
        }
        List<t5> list = this.f2317d;
        if (list == null || !list.contains(t5Var)) {
            f3 f3Var = this.f2314a;
            if (f3Var != null && f3Var.a(t5Var)) {
                this.f2314a.b(t5Var);
                if (this.f2314a.b()) {
                    this.f2319f.enableSyncRender(false);
                }
            }
        } else {
            t5Var.release();
            this.f2317d.remove(t5Var);
        }
    }

    public synchronized void a(t5 t5Var, e3 e3Var) {
        ConcurrentHashMap<String, e3> concurrentHashMap;
        String name;
        if (t5Var == null) {
            return;
        }
        try {
            if ((t5Var instanceof o4) && ((o4) t5Var).d()) {
                if (this.f2314a.b()) {
                    this.f2319f.enableSyncRender(true);
                }
                if (!this.f2314a.a(t5Var)) {
                    this.f2314a.a(t5Var, e3Var);
                    concurrentHashMap = this.f2316c;
                    name = t5Var.getName();
                    concurrentHashMap.put(name, e3Var);
                }
                return;
            }
            List<t5> list = this.f2317d;
            if (list != null && !list.contains(t5Var)) {
                t5Var.a(e3Var);
                this.f2317d.add(t5Var);
                concurrentHashMap = this.f2318e;
                name = t5Var.getName();
                concurrentHashMap.put(name, e3Var);
            }
            return;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }
}
