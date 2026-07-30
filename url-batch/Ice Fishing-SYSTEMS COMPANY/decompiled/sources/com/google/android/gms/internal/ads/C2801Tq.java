package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Tq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2801Tq {

    /* renamed from: c, reason: collision with root package name */
    public final ZD f27843c;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC3005br f27846f;

    /* renamed from: h, reason: collision with root package name */
    public final String f27848h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final C2950ar f27849j;

    /* renamed from: k, reason: collision with root package name */
    public Ut f27850k;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f27841a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f27842b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f27844d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f27845e = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public int f27847g = Integer.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public boolean f27851l = false;

    public C2801Tq(C2953au c2953au, C2950ar c2950ar, ZD zd) {
        int i = 0;
        this.i = ((Wt) c2953au.f29349b.f24454v).f28506r;
        this.f27849j = c2950ar;
        this.f27843c = zd;
        this.f27848h = C3113dr.a(c2953au);
        C2518Df c2518Df = c2953au.f29349b;
        while (true) {
            List list = (List) c2518Df.f24453u;
            if (i >= list.size()) {
                this.f27842b.addAll(list);
                return;
            } else {
                this.f27841a.put((Ut) list.get(i), Integer.valueOf(i));
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r2.f28180v0 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r6.f27851l = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r4.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        r6.f27844d.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        return (com.google.android.gms.internal.ads.Ut) r1.remove(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Ut a() {
        try {
            if (d()) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.f27842b;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    Ut ut = (Ut) arrayList.get(i);
                    String str = ut.f28176t0;
                    HashSet hashSet = this.f27845e;
                    if (!hashSet.contains(str)) {
                        break;
                    }
                    i++;
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005f A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0002, B:5:0x0009, B:8:0x0010, B:10:0x0013, B:14:0x001a, B:16:0x0024, B:17:0x002c, B:19:0x0030, B:22:0x0037, B:24:0x003b, B:25:0x0042, B:26:0x0048, B:33:0x0057, B:36:0x005f, B:42:0x005b, B:47:0x0067, B:52:0x006a, B:7:0x000a, B:29:0x004a, B:31:0x0050), top: B:3:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0064 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void b(InterfaceC3005br interfaceC3005br, Ut ut) {
        boolean z8;
        z8 = false;
        this.f27851l = false;
        this.f27844d.remove(ut);
        synchronized (this) {
        }
        if (this.f27843c.isDone()) {
            interfaceC3005br.m();
            return;
        }
        Integer num = (Integer) this.f27841a.get(ut);
        int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        if (intValue > this.f27847g) {
            this.f27849j.c(ut);
            return;
        }
        if (this.f27846f != null) {
            this.f27849j.c(this.f27850k);
        }
        this.f27847g = intValue;
        this.f27846f = interfaceC3005br;
        this.f27850k = ut;
        synchronized (this) {
            try {
                if (!e(true)) {
                    if (!f()) {
                        if (z8) {
                            g();
                            return;
                        }
                        return;
                    }
                }
                z8 = true;
                if (z8) {
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0002, B:5:0x0010, B:8:0x0017, B:10:0x001a, B:17:0x0029, B:20:0x0031, B:25:0x002d, B:30:0x0039, B:36:0x003e, B:13:0x001c, B:15:0x0022, B:7:0x0011), top: B:3:0x0002, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void c(Ut ut) {
        boolean z8;
        z8 = false;
        this.f27851l = false;
        this.f27844d.remove(ut);
        this.f27845e.remove(ut.f28176t0);
        synchronized (this) {
        }
        if (!this.f27843c.isDone()) {
            synchronized (this) {
                try {
                    if (!e(true)) {
                        if (!f()) {
                            if (!z8) {
                                g();
                            }
                        }
                    }
                    z8 = true;
                    if (!z8) {
                    }
                } finally {
                }
            }
        }
    }

    public final synchronized boolean d() {
        if (this.f27851l) {
            return false;
        }
        ArrayList arrayList = this.f27842b;
        if (!arrayList.isEmpty() && ((Ut) arrayList.get(0)).f28180v0 && !this.f27844d.isEmpty()) {
            return false;
        }
        synchronized (this) {
            if (!this.f27843c.isDone()) {
                ArrayList arrayList2 = this.f27844d;
                if (arrayList2.size() < this.i && e(false)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final synchronized boolean e(boolean z8) {
        try {
            Iterator it = this.f27842b.iterator();
            while (it.hasNext()) {
                Ut ut = (Ut) it.next();
                Integer num = (Integer) this.f27841a.get(ut);
                int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                if (z8 || !this.f27845e.contains(ut.f28176t0)) {
                    int i = this.f27847g;
                    if (intValue < i) {
                        return true;
                    }
                    if (intValue > i) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean f() {
        try {
            Iterator it = this.f27844d.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) this.f27841a.get((Ut) it.next());
                if ((num != null ? num.intValue() : Integer.MAX_VALUE) < this.f27847g) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g() {
        C2950ar c2950ar = this.f27849j;
        Ut ut = this.f27850k;
        synchronized (c2950ar) {
            try {
                c2950ar.f29337a.getClass();
                c2950ar.f29344h = SystemClock.elapsedRealtime() - c2950ar.i;
                if (ut != null) {
                    c2950ar.f29342f.a(ut);
                }
                c2950ar.f29343g = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        InterfaceC3005br interfaceC3005br = this.f27846f;
        if (interfaceC3005br != null) {
            this.f27843c.d(interfaceC3005br);
        } else {
            this.f27843c.e(new C3059cr(3, this.f27848h));
        }
    }
}
