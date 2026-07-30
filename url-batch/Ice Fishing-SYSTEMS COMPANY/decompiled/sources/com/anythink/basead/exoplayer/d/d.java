package com.anythink.basead.exoplayer.d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.basead.exoplayer.d.b;
import com.anythink.basead.exoplayer.d.c;
import com.anythink.basead.exoplayer.d.e;
import com.anythink.basead.exoplayer.d.f;
import com.anythink.basead.exoplayer.d.i;
import com.anythink.basead.exoplayer.d.j;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.k.af;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class d<T extends i> implements b.c<T>, g<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6980a = "PRCustomData";

    /* renamed from: b, reason: collision with root package name */
    public static final int f6981b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6982c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6983d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6984e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f6985f = 3;

    /* renamed from: h, reason: collision with root package name */
    private static final String f6986h = "DefaultDrmSessionMgr";

    /* renamed from: g, reason: collision with root package name */
    volatile d<T>.c f6987g;
    private final UUID i;

    /* renamed from: j, reason: collision with root package name */
    private final j<T> f6988j;

    /* renamed from: k, reason: collision with root package name */
    private final n f6989k;

    /* renamed from: l, reason: collision with root package name */
    private final HashMap<String, String> f6990l;

    /* renamed from: m, reason: collision with root package name */
    private final c.a f6991m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f6992n;

    /* renamed from: o, reason: collision with root package name */
    private final int f6993o;

    /* renamed from: p, reason: collision with root package name */
    private final List<com.anythink.basead.exoplayer.d.b<T>> f6994p;

    /* renamed from: q, reason: collision with root package name */
    private final List<com.anythink.basead.exoplayer.d.b<T>> f6995q;

    /* renamed from: r, reason: collision with root package name */
    private Looper f6996r;

    /* renamed from: s, reason: collision with root package name */
    private int f6997s;

    /* renamed from: t, reason: collision with root package name */
    private byte[] f6998t;

    @Deprecated
    public interface a extends com.anythink.basead.exoplayer.d.c {
    }

    public class b implements j.f<T> {
        private b() {
        }

        @Override // com.anythink.basead.exoplayer.d.j.f
        public final void a(byte[] bArr, int i) {
            if (d.this.f6997s == 0) {
                d.this.f6987g.obtainMessage(i, bArr).sendToTarget();
            }
        }

        public /* synthetic */ b(d dVar, byte b9) {
            this();
        }
    }

    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            for (com.anythink.basead.exoplayer.d.b bVar : d.this.f6994p) {
                if (bVar.b(bArr)) {
                    bVar.a(message.what);
                    return;
                }
            }
        }
    }

    /* renamed from: com.anythink.basead.exoplayer.d.d$d, reason: collision with other inner class name */
    public static final class C0019d extends Exception {
        public /* synthetic */ C0019d(UUID uuid, byte b9) {
            this(uuid);
        }

        private C0019d(UUID uuid) {
            super("Media does not support uuid: ".concat(String.valueOf(uuid)));
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    @Deprecated
    private d(UUID uuid, j<T> jVar, n nVar, HashMap<String, String> hashMap, Handler handler, com.anythink.basead.exoplayer.d.c cVar) {
        this(uuid, jVar, nVar, hashMap);
        if (handler == null || cVar == null) {
            return;
        }
        a(handler, cVar);
    }

    private static d<k> a(n nVar, HashMap<String, String> hashMap) {
        return a(com.anythink.basead.exoplayer.b.bk, nVar, hashMap);
    }

    private byte[] b(String str) {
        return this.f6988j.b(str);
    }

    private d(UUID uuid, j<T> jVar, n nVar, HashMap<String, String> hashMap) {
        this(uuid, (j) jVar, nVar, hashMap, false, 3);
    }

    private static d<k> a(n nVar, String str) {
        HashMap hashMap;
        if (TextUtils.isEmpty(str)) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            hashMap.put(f6980a, str);
        }
        return a(com.anythink.basead.exoplayer.b.bl, nVar, (HashMap<String, String>) hashMap);
    }

    @Deprecated
    private d(UUID uuid, j<T> jVar, n nVar, HashMap<String, String> hashMap, Handler handler, com.anythink.basead.exoplayer.d.c cVar, boolean z8) {
        this(uuid, jVar, nVar, hashMap, z8);
        if (handler == null || cVar == null) {
            return;
        }
        a(handler, cVar);
    }

    private d(UUID uuid, j<T> jVar, n nVar, HashMap<String, String> hashMap, boolean z8) {
        this(uuid, jVar, nVar, hashMap, z8, 3);
    }

    @Deprecated
    private d(UUID uuid, j<T> jVar, n nVar, HashMap<String, String> hashMap, Handler handler, com.anythink.basead.exoplayer.d.c cVar, boolean z8, int i) {
        this(uuid, jVar, nVar, hashMap, z8, i);
        if (handler == null || cVar == null) {
            return;
        }
        a(handler, cVar);
    }

    @Deprecated
    private static d<k> a(UUID uuid, n nVar, HashMap<String, String> hashMap, Handler handler, com.anythink.basead.exoplayer.d.c cVar) {
        d<k> a9 = a(uuid, nVar, hashMap);
        if (handler != null && cVar != null) {
            a9.a(handler, cVar);
        }
        return a9;
    }

    private d(UUID uuid, j<T> jVar, n nVar, HashMap<String, String> hashMap, boolean z8, int i) {
        C0544a.a(uuid);
        C0544a.a(jVar);
        C0544a.a(!com.anythink.basead.exoplayer.b.bi.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.i = uuid;
        this.f6988j = jVar;
        this.f6989k = nVar;
        this.f6990l = hashMap;
        this.f6991m = new c.a();
        this.f6992n = z8;
        this.f6993o = i;
        byte b9 = 0;
        this.f6997s = 0;
        this.f6994p = new ArrayList();
        this.f6995q = new ArrayList();
        if (z8) {
            jVar.a("sessionSharing", "enable");
        }
        jVar.a(new b(this, b9));
    }

    private static d<k> a(UUID uuid, n nVar, HashMap<String, String> hashMap) {
        return new d<>(uuid, (j) l.a(uuid), nVar, hashMap, false, 3);
    }

    public final void a(Handler handler, com.anythink.basead.exoplayer.d.c cVar) {
        this.f6991m.a(handler, cVar);
    }

    private void a(com.anythink.basead.exoplayer.d.c cVar) {
        this.f6991m.a(cVar);
    }

    private String a(String str) {
        return this.f6988j.a(str);
    }

    private void a(String str, String str2) {
        this.f6988j.a(str, str2);
    }

    private void a(String str, byte[] bArr) {
        this.f6988j.a(str, bArr);
    }

    private void a(int i, byte[] bArr) {
        C0544a.b(this.f6994p.isEmpty());
        if (i == 1 || i == 3) {
            C0544a.a(bArr);
        }
        this.f6997s = i;
        this.f6998t = bArr;
    }

    @Override // com.anythink.basead.exoplayer.d.g
    public final boolean a(com.anythink.basead.exoplayer.d.e eVar) {
        if (this.f6998t != null) {
            return true;
        }
        if (a(eVar, this.i, true) == null) {
            if (eVar.f7002b != 1 || !eVar.a(0).a(com.anythink.basead.exoplayer.b.bi)) {
                return false;
            }
            Log.w(f6986h, "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.i);
        }
        String str = eVar.f7001a;
        if (str == null || com.anythink.basead.exoplayer.b.bd.equals(str)) {
            return true;
        }
        return !(com.anythink.basead.exoplayer.b.be.equals(str) || com.anythink.basead.exoplayer.b.bg.equals(str) || com.anythink.basead.exoplayer.b.bf.equals(str)) || af.f8503a >= 25;
    }

    @Override // com.anythink.basead.exoplayer.d.g
    public final f<T> a(Looper looper, com.anythink.basead.exoplayer.d.e eVar) {
        e.a aVar;
        Looper looper2 = this.f6996r;
        byte b9 = 0;
        C0544a.b(looper2 == null || looper2 == looper);
        if (this.f6994p.isEmpty()) {
            this.f6996r = looper;
            if (this.f6987g == null) {
                this.f6987g = new c(looper);
            }
        }
        com.anythink.basead.exoplayer.d.b<T> bVar = null;
        if (this.f6998t == null) {
            e.a a9 = a(eVar, this.i, false);
            if (a9 == null) {
                C0019d c0019d = new C0019d(this.i, b9);
                this.f6991m.a(c0019d);
                return new h(new f.a(c0019d));
            }
            aVar = a9;
        } else {
            aVar = null;
        }
        if (!this.f6992n) {
            if (!this.f6994p.isEmpty()) {
                bVar = this.f6994p.get(0);
            }
        } else {
            byte[] bArr = aVar != null ? aVar.f7007c : null;
            Iterator<com.anythink.basead.exoplayer.d.b<T>> it = this.f6994p.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.anythink.basead.exoplayer.d.b<T> next = it.next();
                if (next.a(bArr)) {
                    bVar = next;
                    break;
                }
            }
        }
        if (bVar == null) {
            com.anythink.basead.exoplayer.d.b<T> bVar2 = new com.anythink.basead.exoplayer.d.b<>(this.i, this.f6988j, this, aVar, this.f6997s, this.f6998t, this.f6990l, this.f6989k, looper, this.f6991m, this.f6993o);
            this.f6994p.add(bVar2);
            bVar = bVar2;
        }
        bVar.a();
        return bVar;
    }

    @Override // com.anythink.basead.exoplayer.d.g
    public final void a(f<T> fVar) {
        if (fVar instanceof h) {
            return;
        }
        com.anythink.basead.exoplayer.d.b<T> bVar = (com.anythink.basead.exoplayer.d.b) fVar;
        if (bVar.b()) {
            this.f6994p.remove(bVar);
            if (this.f6995q.size() > 1 && this.f6995q.get(0) == bVar) {
                this.f6995q.get(1).c();
            }
            this.f6995q.remove(bVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.d.b.c
    public final void a(com.anythink.basead.exoplayer.d.b<T> bVar) {
        this.f6995q.add(bVar);
        if (this.f6995q.size() == 1) {
            bVar.c();
        }
    }

    @Override // com.anythink.basead.exoplayer.d.b.c
    public final void a() {
        Iterator<com.anythink.basead.exoplayer.d.b<T>> it = this.f6995q.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        this.f6995q.clear();
    }

    @Override // com.anythink.basead.exoplayer.d.b.c
    public final void a(Exception exc) {
        Iterator<com.anythink.basead.exoplayer.d.b<T>> it = this.f6995q.iterator();
        while (it.hasNext()) {
            it.next().a(exc);
        }
        this.f6995q.clear();
    }

    private static e.a a(com.anythink.basead.exoplayer.d.e eVar, UUID uuid, boolean z8) {
        ArrayList arrayList = new ArrayList(eVar.f7002b);
        for (int i = 0; i < eVar.f7002b; i++) {
            e.a a9 = eVar.a(i);
            if ((a9.a(uuid) || (com.anythink.basead.exoplayer.b.bj.equals(uuid) && a9.a(com.anythink.basead.exoplayer.b.bi))) && (a9.f7007c != null || z8)) {
                arrayList.add(a9);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (com.anythink.basead.exoplayer.b.bk.equals(uuid)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                e.a aVar = (e.a) arrayList.get(i4);
                int b9 = aVar.a() ? com.anythink.basead.exoplayer.e.a.h.b(aVar.f7007c) : -1;
                int i9 = af.f8503a;
                if ((i9 < 23 && b9 == 0) || (i9 >= 23 && b9 == 1)) {
                    return aVar;
                }
            }
        }
        return (e.a) arrayList.get(0);
    }

    @Deprecated
    private static d<k> a(n nVar, HashMap<String, String> hashMap, Handler handler, com.anythink.basead.exoplayer.d.c cVar) {
        d<k> a9 = a(com.anythink.basead.exoplayer.b.bk, nVar, hashMap);
        if (handler != null && cVar != null) {
            a9.a(handler, cVar);
        }
        return a9;
    }

    @Deprecated
    private static d<k> a(n nVar, String str, Handler handler, com.anythink.basead.exoplayer.d.c cVar) {
        HashMap hashMap;
        if (TextUtils.isEmpty(str)) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            hashMap.put(f6980a, str);
        }
        d<k> a9 = a(com.anythink.basead.exoplayer.b.bl, nVar, (HashMap<String, String>) hashMap);
        if (handler != null && cVar != null) {
            a9.a(handler, cVar);
        }
        return a9;
    }
}
