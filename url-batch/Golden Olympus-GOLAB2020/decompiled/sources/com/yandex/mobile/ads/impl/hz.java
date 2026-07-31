package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.yandex.mobile.ads.impl.b60;
import com.yandex.mobile.ads.impl.gz;
import com.yandex.mobile.ads.impl.hz;
import com.yandex.mobile.ads.impl.u30;
import com.yandex.mobile.ads.impl.v30;
import com.yandex.mobile.ads.impl.w30;
import com.yandex.mobile.ads.impl.x30;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class hz implements x30 {

    /* renamed from: b, reason: collision with root package name */
    private final UUID f26987b;

    /* renamed from: c, reason: collision with root package name */
    private final b60.c f26988c;

    /* renamed from: d, reason: collision with root package name */
    private final jv0 f26989d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, String> f26990e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f26991f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f26992g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f26993h;

    /* renamed from: i, reason: collision with root package name */
    private final f f26994i;

    /* renamed from: j, reason: collision with root package name */
    private final lr0 f26995j;

    /* renamed from: k, reason: collision with root package name */
    private final g f26996k;

    /* renamed from: l, reason: collision with root package name */
    private final long f26997l;

    /* renamed from: m, reason: collision with root package name */
    private final ArrayList f26998m;

    /* renamed from: n, reason: collision with root package name */
    private final Set<e> f26999n;

    /* renamed from: o, reason: collision with root package name */
    private final Set<gz> f27000o;

    /* renamed from: p, reason: collision with root package name */
    private int f27001p;

    /* renamed from: q, reason: collision with root package name */
    private b60 f27002q;

    /* renamed from: r, reason: collision with root package name */
    private gz f27003r;

    /* renamed from: s, reason: collision with root package name */
    private gz f27004s;

    /* renamed from: t, reason: collision with root package name */
    private Looper f27005t;

    /* renamed from: u, reason: collision with root package name */
    private Handler f27006u;

    /* renamed from: v, reason: collision with root package name */
    private int f27007v;

    /* renamed from: w, reason: collision with root package name */
    private byte[] f27008w;

    /* renamed from: x, reason: collision with root package name */
    private ei1 f27009x;

    /* renamed from: y, reason: collision with root package name */
    volatile c f27010y;

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private boolean f27014d;

        /* renamed from: f, reason: collision with root package name */
        private boolean f27016f;

        /* renamed from: a, reason: collision with root package name */
        private final HashMap<String, String> f27011a = new HashMap<>();

        /* renamed from: b, reason: collision with root package name */
        private UUID f27012b = C1813am.f23361d;

        /* renamed from: c, reason: collision with root package name */
        private b60.c f27013c = hc0.f26703e;

        /* renamed from: g, reason: collision with root package name */
        private sz f27017g = new sz();

        /* renamed from: e, reason: collision with root package name */
        private int[] f27015e = new int[0];

        /* renamed from: h, reason: collision with root package name */
        private long f27018h = 300000;

        public final a a(boolean z4) {
            this.f27014d = z4;
            return this;
        }

        public final a b(boolean z4) {
            this.f27016f = z4;
            return this;
        }

        public final a a(int... iArr) {
            for (int i4 : iArr) {
                if (i4 != 2 && i4 != 1) {
                    throw new IllegalArgumentException();
                }
            }
            this.f27015e = (int[]) iArr.clone();
            return this;
        }

        public final a a(UUID uuid, b60.c cVar) {
            uuid.getClass();
            this.f27012b = uuid;
            cVar.getClass();
            this.f27013c = cVar;
            return this;
        }

        public final hz a(eh0 eh0Var) {
            return new hz(this.f27012b, this.f27013c, eh0Var, this.f27011a, this.f27014d, this.f27015e, this.f27016f, this.f27017g, this.f27018h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class b implements b60.b {
        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            ArrayList arrayList = hz.this.f26998m;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                gz gzVar = (gz) obj;
                if (gzVar.a(bArr)) {
                    gzVar.a(message.what);
                    return;
                }
            }
        }
    }

    public static final class d extends Exception {
        private d(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class e implements x30.b {

        /* renamed from: b, reason: collision with root package name */
        private final w30.a f27021b;

        /* renamed from: c, reason: collision with root package name */
        private v30 f27022c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f27023d;

        public e(w30.a aVar) {
            this.f27021b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(yb0 yb0Var) {
            hz hzVar = hz.this;
            if (hzVar.f27001p == 0 || this.f27023d) {
                return;
            }
            Looper looper = hzVar.f27005t;
            looper.getClass();
            this.f27022c = hzVar.a(looper, this.f27021b, yb0Var, false);
            hz.this.f26999n.add(this);
        }

        @Override // com.yandex.mobile.ads.impl.x30.b
        public final void release() {
            Handler handler = hz.this.f27006u;
            handler.getClass();
            u82.a(handler, new Runnable() { // from class: com.yandex.mobile.ads.impl.R6
                @Override // java.lang.Runnable
                public final void run() {
                    hz.e.this.a();
                }
            });
        }

        public final void a(final yb0 yb0Var) {
            Handler handler = hz.this.f27006u;
            handler.getClass();
            handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.Q6
                @Override // java.lang.Runnable
                public final void run() {
                    hz.e.this.b(yb0Var);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            if (this.f27023d) {
                return;
            }
            v30 v30Var = this.f27022c;
            if (v30Var != null) {
                v30Var.a(this.f27021b);
            }
            hz.this.f26999n.remove(this);
            this.f27023d = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class f implements gz.a {

        /* renamed from: a, reason: collision with root package name */
        private final HashSet f27025a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        private gz f27026b;

        /* JADX WARN: Multi-variable type inference failed */
        public final void a() {
            this.f27026b = null;
            sj0 a4 = sj0.a((Collection) this.f27025a);
            this.f27025a.clear();
            y72 listIterator = a4.listIterator(0);
            while (listIterator.hasNext()) {
                ((gz) listIterator.next()).b();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Exception exc, boolean z4) {
            this.f27026b = null;
            sj0 a4 = sj0.a((Collection) this.f27025a);
            this.f27025a.clear();
            y72 listIterator = a4.listIterator(0);
            while (listIterator.hasNext()) {
                ((gz) listIterator.next()).a(exc, z4);
            }
        }

        public final void a(gz gzVar) {
            this.f27025a.add(gzVar);
            if (this.f27026b != null) {
                return;
            }
            this.f27026b = gzVar;
            gzVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class g implements gz.b {
        public final void b(gz gzVar) {
            hz hzVar = hz.this;
            if (hzVar.f26997l != -9223372036854775807L) {
                hzVar.f27000o.remove(gzVar);
                Handler handler = hz.this.f27006u;
                handler.getClass();
                handler.removeCallbacksAndMessages(gzVar);
            }
        }

        private g() {
        }

        public final void a(final gz gzVar, int i4) {
            hz hzVar;
            if (i4 == 1) {
                hz hzVar2 = hz.this;
                if (hzVar2.f27001p > 0 && hzVar2.f26997l != -9223372036854775807L) {
                    hzVar2.f27000o.add(gzVar);
                    Handler handler = hz.this.f27006u;
                    handler.getClass();
                    handler.postAtTime(new Runnable() { // from class: com.yandex.mobile.ads.impl.S6
                        @Override // java.lang.Runnable
                        public final void run() {
                            gz.this.a((w30.a) null);
                        }
                    }, gzVar, SystemClock.uptimeMillis() + hz.this.f26997l);
                    hzVar = hz.this;
                    if (hzVar.f27002q == null && hzVar.f27001p == 0 && hzVar.f26998m.isEmpty() && hzVar.f26999n.isEmpty()) {
                        b60 b60Var = hzVar.f27002q;
                        b60Var.getClass();
                        b60Var.release();
                        hzVar.f27002q = null;
                        return;
                    }
                    return;
                }
            }
            if (i4 == 0) {
                hz.this.f26998m.remove(gzVar);
                hz hzVar3 = hz.this;
                if (hzVar3.f27003r == gzVar) {
                    hzVar3.f27003r = null;
                }
                if (hzVar3.f27004s == gzVar) {
                    hzVar3.f27004s = null;
                }
                f fVar = hzVar3.f26994i;
                fVar.f27025a.remove(gzVar);
                if (fVar.f27026b == gzVar) {
                    fVar.f27026b = null;
                    if (!fVar.f27025a.isEmpty()) {
                        gz gzVar2 = (gz) fVar.f27025a.iterator().next();
                        fVar.f27026b = gzVar2;
                        gzVar2.d();
                    }
                }
                hz hzVar4 = hz.this;
                if (hzVar4.f26997l != -9223372036854775807L) {
                    Handler handler2 = hzVar4.f27006u;
                    handler2.getClass();
                    handler2.removeCallbacksAndMessages(gzVar);
                    hz.this.f27000o.remove(gzVar);
                }
            }
            hzVar = hz.this;
            if (hzVar.f27002q == null) {
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.x30
    public final void prepare() {
        int i4 = this.f27001p;
        this.f27001p = i4 + 1;
        if (i4 != 0) {
            return;
        }
        if (this.f27002q == null) {
            b60 a4 = this.f26988c.a(this.f26987b);
            this.f27002q = a4;
            a4.a(new b());
        } else if (this.f26997l != -9223372036854775807L) {
            for (int i5 = 0; i5 < this.f26998m.size(); i5++) {
                ((gz) this.f26998m.get(i5)).b(null);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.x30
    public final void release() {
        int i4 = this.f27001p - 1;
        this.f27001p = i4;
        if (i4 != 0) {
            return;
        }
        if (this.f26997l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f26998m);
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((gz) arrayList.get(i5)).a((w30.a) null);
            }
        }
        Iterator it = uj0.a(this.f26999n).iterator();
        while (it.hasNext()) {
            ((e) it.next()).release();
        }
        if (this.f27002q != null && this.f27001p == 0 && this.f26998m.isEmpty() && this.f26999n.isEmpty()) {
            b60 b60Var = this.f27002q;
            b60Var.getClass();
            b60Var.release();
            this.f27002q = null;
        }
    }

    private hz(UUID uuid, b60.c cVar, eh0 eh0Var, HashMap hashMap, boolean z4, int[] iArr, boolean z5, sz szVar, long j4) {
        C2253tf.a(uuid);
        C2253tf.a("Use C.CLEARKEY_UUID instead", !C1813am.f23359b.equals(uuid));
        this.f26987b = uuid;
        this.f26988c = cVar;
        this.f26989d = eh0Var;
        this.f26990e = hashMap;
        this.f26991f = z4;
        this.f26992g = iArr;
        this.f26993h = z5;
        this.f26995j = szVar;
        this.f26994i = new f();
        this.f26996k = new g();
        this.f27007v = 0;
        this.f26998m = new ArrayList();
        this.f26999n = lx1.a();
        this.f27000o = lx1.a();
        this.f26997l = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public v30 a(Looper looper, w30.a aVar, yb0 yb0Var, boolean z4) {
        ArrayList arrayList;
        if (this.f27010y == null) {
            this.f27010y = new c(looper);
        }
        u30 u30Var = yb0Var.f34994p;
        int i4 = 0;
        gz gzVar = null;
        Object[] objArr = 0;
        if (u30Var == null) {
            int c4 = i01.c(yb0Var.f34991m);
            b60 b60Var = this.f27002q;
            b60Var.getClass();
            if (b60Var.b() != 2 || !gc0.f26108d) {
                int[] iArr = this.f26992g;
                while (true) {
                    if (i4 >= iArr.length) {
                        break;
                    }
                    if (iArr[i4] != c4) {
                        i4++;
                    } else if (i4 != -1 && b60Var.b() != 1) {
                        gz gzVar2 = this.f27003r;
                        if (gzVar2 == null) {
                            gz a4 = a(sj0.h(), true, (w30.a) null, z4);
                            this.f26998m.add(a4);
                            this.f27003r = a4;
                        } else {
                            gzVar2.b(null);
                        }
                        return this.f27003r;
                    }
                }
            }
            return null;
        }
        if (this.f27008w == null) {
            arrayList = a(u30Var, this.f26987b, false);
            if (arrayList.isEmpty()) {
                d dVar = new d(this.f26987b);
                ms0.a("DefaultDrmSessionMgr", "DRM error", dVar);
                if (aVar != null) {
                    aVar.a(dVar);
                }
                return new k50(new v30.a(dVar, AuthCode.StatusCode.CERT_FINGERPRINT_ERROR));
            }
        } else {
            arrayList = null;
        }
        if (this.f26991f) {
            ArrayList arrayList2 = this.f26998m;
            int size = arrayList2.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    break;
                }
                Object obj = arrayList2.get(i5);
                i5++;
                gz gzVar3 = (gz) obj;
                if (u82.a(gzVar3.f26365a, arrayList)) {
                    gzVar = gzVar3;
                    break;
                }
            }
        } else {
            gzVar = this.f27004s;
        }
        if (gzVar != null) {
            gzVar.b(aVar);
            return gzVar;
        }
        gz a5 = a((List<u30.b>) arrayList, false, aVar, z4);
        if (!this.f26991f) {
            this.f27004s = a5;
        }
        this.f26998m.add(a5);
        return a5;
    }

    @Override // com.yandex.mobile.ads.impl.x30
    public final v30 b(w30.a aVar, yb0 yb0Var) {
        if (this.f27001p <= 0) {
            throw new IllegalStateException();
        }
        Looper looper = this.f27005t;
        if (looper != null) {
            return a(looper, aVar, yb0Var, true);
        }
        throw new IllegalStateException();
    }

    private gz a(List<u30.b> list, boolean z4, w30.a aVar) {
        this.f27002q.getClass();
        boolean z5 = this.f26993h | z4;
        UUID uuid = this.f26987b;
        b60 b60Var = this.f27002q;
        f fVar = this.f26994i;
        g gVar = this.f26996k;
        int i4 = this.f27007v;
        byte[] bArr = this.f27008w;
        HashMap<String, String> hashMap = this.f26990e;
        jv0 jv0Var = this.f26989d;
        Looper looper = this.f27005t;
        looper.getClass();
        lr0 lr0Var = this.f26995j;
        ei1 ei1Var = this.f27009x;
        ei1Var.getClass();
        gz gzVar = new gz(uuid, b60Var, fVar, gVar, list, i4, z5, z4, bArr, hashMap, jv0Var, looper, lr0Var, ei1Var);
        gzVar.b(aVar);
        if (this.f26997l != -9223372036854775807L) {
            gzVar.b(null);
        }
        return gzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if ((r1.getCause() instanceof android.media.ResourceBusyException) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if ((r1.getCause() instanceof android.media.ResourceBusyException) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private gz a(List<u30.b> list, boolean z4, w30.a aVar, boolean z5) {
        gz a4 = a(list, z4, aVar);
        if (a4.getState() == 1) {
            if (u82.f32873a >= 19) {
                v30.a error = a4.getError();
                error.getClass();
            }
            if (!this.f27000o.isEmpty()) {
                Iterator it = uj0.a(this.f27000o).iterator();
                while (it.hasNext()) {
                    ((v30) it.next()).a(null);
                }
                a4.a(aVar);
                if (this.f26997l != -9223372036854775807L) {
                    a4.a((w30.a) null);
                }
                a4 = a(list, z4, aVar);
            }
        }
        if (a4.getState() == 1) {
            if (u82.f32873a >= 19) {
                v30.a error2 = a4.getError();
                error2.getClass();
            }
            if (z5 && !this.f26999n.isEmpty()) {
                Iterator it2 = uj0.a(this.f26999n).iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).release();
                }
                if (!this.f27000o.isEmpty()) {
                    Iterator it3 = uj0.a(this.f27000o).iterator();
                    while (it3.hasNext()) {
                        ((v30) it3.next()).a(null);
                    }
                }
                a4.a(aVar);
                if (this.f26997l != -9223372036854775807L) {
                    a4.a((w30.a) null);
                }
                return a(list, z4, aVar);
            }
        }
        return a4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        return 0;
     */
    @Override // com.yandex.mobile.ads.impl.x30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(yb0 yb0Var) {
        b60 b60Var = this.f27002q;
        b60Var.getClass();
        int b4 = b60Var.b();
        u30 u30Var = yb0Var.f34994p;
        if (u30Var == null) {
            int c4 = i01.c(yb0Var.f34991m);
            int[] iArr = this.f26992g;
            int i4 = 0;
            while (true) {
                if (i4 >= iArr.length) {
                    break;
                }
                if (iArr[i4] != c4) {
                    i4++;
                } else if (i4 != -1) {
                }
            }
        } else if (this.f27008w == null) {
            if (a(u30Var, this.f26987b, true).isEmpty()) {
                if (u30Var.f32801e == 1) {
                    u30.b a4 = u30Var.a(0);
                    UUID uuid = C1813am.f23359b;
                    a4.getClass();
                    if (C1813am.f23358a.equals(a4.f32803c) || uuid.equals(a4.f32803c)) {
                        ms0.d("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f26987b);
                    }
                }
                return 1;
            }
            String str = u30Var.f32800d;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : u82.f32873a < 25)) {
                return 1;
            }
        }
        return b4;
    }

    @Override // com.yandex.mobile.ads.impl.x30
    public final x30.b a(w30.a aVar, yb0 yb0Var) {
        if (this.f27001p > 0) {
            if (this.f27005t != null) {
                e eVar = new e(aVar);
                eVar.a(yb0Var);
                return eVar;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public final void a(byte[] bArr) {
        if (this.f26998m.isEmpty()) {
            this.f27007v = 0;
            this.f27008w = bArr;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.x30
    public final void a(Looper looper, ei1 ei1Var) {
        synchronized (this) {
            try {
                Looper looper2 = this.f27005t;
                if (looper2 == null) {
                    this.f27005t = looper;
                    this.f27006u = new Handler(looper);
                } else if (looper2 == looper) {
                    this.f27006u.getClass();
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f27009x = ei1Var;
    }

    private static ArrayList a(u30 u30Var, UUID uuid, boolean z4) {
        ArrayList arrayList = new ArrayList(u30Var.f32801e);
        for (int i4 = 0; i4 < u30Var.f32801e; i4++) {
            u30.b a4 = u30Var.a(i4);
            a4.getClass();
            UUID uuid2 = C1813am.f23358a;
            if (!uuid2.equals(a4.f32803c) && !uuid.equals(a4.f32803c)) {
                if (C1813am.f23360c.equals(uuid)) {
                    UUID uuid3 = C1813am.f23359b;
                    if (!uuid2.equals(a4.f32803c) && !uuid3.equals(a4.f32803c)) {
                    }
                }
            }
            if (a4.f32806f != null || z4) {
                arrayList.add(a4);
            }
        }
        return arrayList;
    }
}
