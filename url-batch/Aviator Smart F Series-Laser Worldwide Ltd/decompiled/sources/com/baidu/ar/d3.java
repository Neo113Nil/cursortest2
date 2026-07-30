package com.baidu.ar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class d3 {

    /* renamed from: a, reason: collision with root package name */
    public Looper f2029a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f2030b;

    /* renamed from: g, reason: collision with root package name */
    public List<t5> f2035g;

    /* renamed from: h, reason: collision with root package name */
    public e3 f2036h;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<c3> f2032d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public HashMap<String, Boolean> f2033e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    public HashMap<String, Boolean> f2034f = new HashMap<>();

    /* renamed from: i, reason: collision with root package name */
    public long f2037i = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2031c = com.crrepa.band.my.device.customkey.util.c.MAX_GOAL_TIME;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1001:
                    d3.this.b((kb) message.obj);
                    break;
                case 1002:
                    d3.this.c((b3) message.obj);
                    break;
                case 1003:
                    d3.this.a((kb) message.obj);
                    break;
                case 1004:
                    d3.this.b();
                    break;
            }
        }
    }

    public d3(Looper looper) {
        this.f2029a = looper;
    }

    public final c3 a(b3 b3Var) {
        Iterator<c3> it = this.f2032d.iterator();
        while (it.hasNext()) {
            c3 next = it.next();
            if (next.c() == b3Var.c()) {
                next.a(b3Var);
                return next;
            }
        }
        return null;
    }

    public final c3 b(b3 b3Var) {
        if (this.f2032d.size() >= this.f2031c) {
            h.b("DetectResultSync", "add2NewDetectResultGroup detectResult list for sync is fulllll!!!");
            return null;
        }
        c3 c3Var = new c3();
        c3Var.a(b3Var.c());
        c3Var.a(b3Var);
        this.f2032d.add(c3Var);
        return c3Var;
    }

    public void c() {
        Handler handler = this.f2030b;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(1004));
        }
    }

    public synchronized void d(kb kbVar) {
        h.a("DetectResultSync", "DetectorGroup onDetectorSetup result = " + kbVar.a());
        Handler handler = this.f2030b;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(1001, kbVar));
        }
    }

    public synchronized void e(b3 b3Var) {
        Handler handler = this.f2030b;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(1002, b3Var));
        }
    }

    public final void a() {
        List<t5> list = this.f2035g;
        if (list != null) {
            list.clear();
        }
        ArrayList<c3> arrayList = this.f2032d;
        if (arrayList != null) {
            arrayList.clear();
        }
        HashMap<String, Boolean> hashMap = this.f2033e;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, Boolean> hashMap2 = this.f2034f;
        if (hashMap2 != null) {
            hashMap2.clear();
        }
    }

    public final void b() {
        a();
        this.f2030b.removeCallbacksAndMessages(null);
        this.f2030b = null;
    }

    public final void c(b3 b3Var) {
        HashMap<String, Boolean> hashMap;
        if (this.f2032d == null || (hashMap = this.f2033e) == null || hashMap.isEmpty()) {
            return;
        }
        c3 a8 = a(b3Var);
        if (a8 == null) {
            a8 = b(b3Var);
        }
        a(a8);
    }

    public synchronized boolean d(b3 b3Var) {
        if (this.f2032d.size() != 0) {
            if (this.f2032d.get(0).c() < b3Var.c()) {
                return false;
            }
        }
        return true;
    }

    public final void a(c3 c3Var) {
        ArrayList<c3> arrayList;
        List<t5> list;
        if (c3Var == null || (arrayList = this.f2032d) == null || arrayList.size() == 0 || (list = this.f2035g) == null || list.size() == 0 || this.f2036h == null) {
            return;
        }
        Iterator<t5> it = this.f2035g.iterator();
        while (it.hasNext()) {
            if (!c3Var.b(it.next().getName())) {
                return;
            }
        }
        if (c3Var.c() != this.f2037i) {
            this.f2036h.a(c3Var);
            this.f2037i = c3Var.c();
            ArrayList<c3> arrayList2 = this.f2032d;
            arrayList2.subList(0, arrayList2.indexOf(c3Var)).clear();
        }
    }

    public synchronized void c(kb kbVar) {
        h.a("DetectResultSync", "DetectorGroup onDetectorRelease result = " + kbVar.a());
        Handler handler = this.f2030b;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(1003, kbVar));
        }
    }

    public final void b(kb kbVar) {
        this.f2033e.put(kbVar.a(), Boolean.valueOf(kbVar.b()));
        Iterator<t5> it = this.f2035g.iterator();
        boolean z7 = true;
        boolean z8 = true;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            t5 next = it.next();
            if (this.f2033e.get(next.getName()) == null) {
                z7 = false;
                break;
            } else if (!this.f2033e.get(next.getName()).booleanValue()) {
                z8 = false;
            }
        }
        e3 e3Var = this.f2036h;
        if (e3Var != null) {
            e3Var.a(kbVar);
            if (z7) {
                this.f2036h.a(new kb("DetectorGroup", z8));
            }
        }
    }

    public final void a(kb kbVar) {
        this.f2034f.put(kbVar.a(), Boolean.valueOf(kbVar.b()));
        Iterator<t5> it = this.f2035g.iterator();
        boolean z7 = true;
        boolean z8 = true;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            t5 next = it.next();
            if (this.f2034f.get(next.getName()) == null) {
                z7 = false;
                break;
            } else if (!this.f2034f.get(next.getName()).booleanValue()) {
                z8 = false;
            }
        }
        e3 e3Var = this.f2036h;
        if (e3Var != null) {
            e3Var.b(kbVar);
            if (z7) {
                this.f2036h.b(new kb("DetectorGroup", z8));
                a();
            }
        }
    }

    public void a(List<t5> list, e3 e3Var) {
        this.f2035g = list;
        this.f2036h = e3Var;
        if (this.f2030b != null || this.f2029a == null) {
            return;
        }
        this.f2030b = new a(this.f2029a);
    }
}
