package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.yandex.mobile.ads.impl.b60;
import com.yandex.mobile.ads.impl.hz;
import com.yandex.mobile.ads.impl.lr0;
import com.yandex.mobile.ads.impl.u30;
import com.yandex.mobile.ads.impl.v30;
import com.yandex.mobile.ads.impl.w30;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
final class gz implements v30 {

    /* renamed from: a, reason: collision with root package name */
    public final List<u30.b> f26365a;

    /* renamed from: b, reason: collision with root package name */
    private final b60 f26366b;

    /* renamed from: c, reason: collision with root package name */
    private final a f26367c;

    /* renamed from: d, reason: collision with root package name */
    private final b f26368d;

    /* renamed from: e, reason: collision with root package name */
    private final int f26369e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f26370f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f26371g;

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<String, String> f26372h;

    /* renamed from: i, reason: collision with root package name */
    private final es<w30.a> f26373i;

    /* renamed from: j, reason: collision with root package name */
    private final lr0 f26374j;

    /* renamed from: k, reason: collision with root package name */
    private final ei1 f26375k;

    /* renamed from: l, reason: collision with root package name */
    final jv0 f26376l;

    /* renamed from: m, reason: collision with root package name */
    final UUID f26377m;

    /* renamed from: n, reason: collision with root package name */
    final e f26378n;

    /* renamed from: o, reason: collision with root package name */
    private int f26379o;

    /* renamed from: p, reason: collision with root package name */
    private int f26380p;

    /* renamed from: q, reason: collision with root package name */
    private HandlerThread f26381q;

    /* renamed from: r, reason: collision with root package name */
    private c f26382r;

    /* renamed from: s, reason: collision with root package name */
    private su f26383s;

    /* renamed from: t, reason: collision with root package name */
    private v30.a f26384t;

    /* renamed from: u, reason: collision with root package name */
    private byte[] f26385u;

    /* renamed from: v, reason: collision with root package name */
    private byte[] f26386v;

    /* renamed from: w, reason: collision with root package name */
    private b60.a f26387w;

    /* renamed from: x, reason: collision with root package name */
    private b60.d f26388x;

    public interface a {
    }

    public interface b {
    }

    @SuppressLint({"HandlerLeak"})
    private class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private boolean f26389a;

        public c(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Throwable th;
            d dVar = (d) message.obj;
            try {
                int i4 = message.what;
                if (i4 == 0) {
                    th = ((eh0) gz.this.f26376l).a((b60.d) dVar.f26393c);
                } else {
                    if (i4 != 1) {
                        throw new RuntimeException();
                    }
                    gz gzVar = gz.this;
                    th = ((eh0) gzVar.f26376l).a(gzVar.f26377m, (b60.a) dVar.f26393c);
                }
            } catch (kv0 e4) {
                boolean a4 = a(message, e4);
                th = e4;
                if (a4) {
                    return;
                }
            } catch (Exception e5) {
                ms0.b("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e5);
                th = e5;
            }
            lr0 lr0Var = gz.this.f26374j;
            long j4 = dVar.f26391a;
            lr0Var.getClass();
            synchronized (this) {
                try {
                    if (!this.f26389a) {
                        gz.this.f26378n.obtainMessage(message.what, Pair.create(dVar.f26393c, th)).sendToTarget();
                    }
                } finally {
                }
            }
        }

        private boolean a(Message message, kv0 kv0Var) {
            d dVar = (d) message.obj;
            if (!dVar.f26392b) {
                return false;
            }
            int i4 = dVar.f26394d + 1;
            dVar.f26394d = i4;
            if (i4 > gz.this.f26374j.a(3)) {
                return false;
            }
            SystemClock.elapsedRealtime();
            SystemClock.elapsedRealtime();
            long a4 = gz.this.f26374j.a(new lr0.a(kv0Var.getCause() instanceof IOException ? (IOException) kv0Var.getCause() : new f(kv0Var.getCause()), dVar.f26394d));
            if (a4 == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f26389a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), a4);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f26391a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f26392b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f26393c;

        /* renamed from: d, reason: collision with root package name */
        public int f26394d;

        public d(long j4, boolean z4, long j5, Object obj) {
            this.f26391a = j4;
            this.f26392b = z4;
            this.f26393c = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i4 = message.what;
            if (i4 != 0) {
                if (i4 != 1) {
                    return;
                }
                gz.this.a(obj, obj2);
                return;
            }
            gz gzVar = gz.this;
            if (obj == gzVar.f26388x) {
                if (gzVar.f26379o == 2 || gzVar.a()) {
                    gzVar.f26388x = null;
                    if (obj2 instanceof Exception) {
                        ((hz.f) gzVar.f26367c).a((Exception) obj2, false);
                        return;
                    }
                    try {
                        gzVar.f26366b.c((byte[]) obj2);
                        ((hz.f) gzVar.f26367c).a();
                    } catch (Exception e4) {
                        ((hz.f) gzVar.f26367c).a(e4, true);
                    }
                }
            }
        }
    }

    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public gz(UUID uuid, b60 b60Var, a aVar, b bVar, List<u30.b> list, int i4, boolean z4, boolean z5, byte[] bArr, HashMap<String, String> hashMap, jv0 jv0Var, Looper looper, lr0 lr0Var, ei1 ei1Var) {
        if (i4 == 1 || i4 == 3) {
            C2253tf.a(bArr);
        }
        this.f26377m = uuid;
        this.f26367c = aVar;
        this.f26368d = bVar;
        this.f26366b = b60Var;
        this.f26369e = i4;
        this.f26370f = z4;
        this.f26371g = z5;
        if (bArr != null) {
            this.f26386v = bArr;
            this.f26365a = null;
        } else {
            this.f26365a = Collections.unmodifiableList((List) C2253tf.a(list));
        }
        this.f26372h = hashMap;
        this.f26376l = jv0Var;
        this.f26373i = new es<>();
        this.f26374j = lr0Var;
        this.f26375k = ei1Var;
        this.f26379o = 2;
        this.f26378n = new e(looper);
    }

    private void a(lr<w30.a> lrVar) {
        Iterator<w30.a> it = this.f26373i.a().iterator();
        while (it.hasNext()) {
            lrVar.accept(it.next());
        }
    }

    @Override // com.yandex.mobile.ads.impl.v30
    public final su getCryptoConfig() {
        return this.f26383s;
    }

    @Override // com.yandex.mobile.ads.impl.v30
    public final v30.a getError() {
        if (this.f26379o == 1) {
            return this.f26384t;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.v30
    public final UUID getSchemeUuid() {
        return this.f26377m;
    }

    @Override // com.yandex.mobile.ads.impl.v30
    public final int getState() {
        return this.f26379o;
    }

    @Override // com.yandex.mobile.ads.impl.v30
    public final boolean playClearSamplesWithoutKeys() {
        return this.f26370f;
    }

    @Override // com.yandex.mobile.ads.impl.v30
    public final Map<String, String> queryKeyStatus() {
        byte[] bArr = this.f26385u;
        if (bArr == null) {
            return null;
        }
        return this.f26366b.a(bArr);
    }

    @Override // com.yandex.mobile.ads.impl.v30
    public final boolean requiresSecureDecoder(String str) {
        b60 b60Var = this.f26366b;
        byte[] bArr = this.f26385u;
        if (bArr != null) {
            return b60Var.a(str, bArr);
        }
        throw new IllegalStateException();
    }

    private boolean c() {
        if (a()) {
            return true;
        }
        try {
            byte[] c4 = this.f26366b.c();
            this.f26385u = c4;
            this.f26366b.a(c4, this.f26375k);
            this.f26383s = this.f26366b.d(this.f26385u);
            final int i4 = 3;
            this.f26379o = 3;
            a(new lr() { // from class: com.yandex.mobile.ads.impl.W3
                @Override // com.yandex.mobile.ads.impl.lr
                public final void accept(Object obj) {
                    ((w30.a) obj).a(i4);
                }
            });
            this.f26385u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            ((hz.f) this.f26367c).a(this);
            return false;
        } catch (Exception e4) {
            a(1, e4);
            return false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.v30
    public final void b(w30.a aVar) {
        if (this.f26380p < 0) {
            ms0.b("DefaultDrmSession", "Session reference count less than zero: " + this.f26380p);
            this.f26380p = 0;
        }
        if (aVar != null) {
            this.f26373i.a(aVar);
        }
        int i4 = this.f26380p + 1;
        this.f26380p = i4;
        if (i4 == 1) {
            if (this.f26379o != 2) {
                throw new IllegalStateException();
            }
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f26381q = handlerThread;
            handlerThread.start();
            this.f26382r = new c(this.f26381q.getLooper());
            if (c()) {
                a(true);
            }
        } else if (aVar != null && a() && this.f26373i.b(aVar) == 1) {
            aVar.a(this.f26379o);
        }
        ((hz.g) this.f26368d).b(this);
    }

    public final void d() {
        b60.d a4 = this.f26366b.a();
        this.f26388x = a4;
        c cVar = this.f26382r;
        int i4 = u82.f32873a;
        a4.getClass();
        cVar.getClass();
        cVar.obtainMessage(0, new d(mr0.a(), true, SystemClock.elapsedRealtime(), a4)).sendToTarget();
    }

    private void a(boolean z4) {
        long min;
        if (this.f26371g) {
            return;
        }
        byte[] bArr = this.f26385u;
        int i4 = u82.f32873a;
        int i5 = this.f26369e;
        if (i5 != 0 && i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    return;
                }
                this.f26386v.getClass();
                this.f26385u.getClass();
                a(this.f26386v, 3, z4);
                return;
            }
            byte[] bArr2 = this.f26386v;
            if (bArr2 != null) {
                try {
                    this.f26366b.a(bArr, bArr2);
                } catch (Exception e4) {
                    a(1, e4);
                    return;
                }
            }
            a(bArr, 2, z4);
            return;
        }
        byte[] bArr3 = this.f26386v;
        if (bArr3 == null) {
            a(bArr, 1, z4);
            return;
        }
        if (this.f26379o != 4) {
            try {
                this.f26366b.a(bArr, bArr3);
            } catch (Exception e5) {
                a(1, e5);
                return;
            }
        }
        if (C1813am.f23361d.equals(this.f26377m)) {
            Pair<Long, Long> a4 = wj2.a(this);
            a4.getClass();
            min = Math.min(((Long) a4.first).longValue(), ((Long) a4.second).longValue());
        } else {
            min = Long.MAX_VALUE;
        }
        if (this.f26369e == 0 && min <= 60) {
            ms0.a("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + min);
            a(bArr, 2, z4);
            return;
        }
        if (min <= 0) {
            a(2, new iq0());
        } else {
            this.f26379o = 4;
            a(new lr() { // from class: com.yandex.mobile.ads.impl.X3
                @Override // com.yandex.mobile.ads.impl.lr
                public final void accept(Object obj) {
                    ((w30.a) obj).c();
                }
            });
        }
    }

    public final void b() {
        if (c()) {
            a(true);
        }
    }

    public final boolean a(byte[] bArr) {
        return Arrays.equals(this.f26385u, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        int i4 = this.f26379o;
        return i4 == 3 || i4 == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj, Object obj2) {
        if (obj == this.f26387w && a()) {
            this.f26387w = null;
            if (obj2 instanceof Exception) {
                Exception exc = (Exception) obj2;
                if (exc instanceof NotProvisionedException) {
                    ((hz.f) this.f26367c).a(this);
                    return;
                } else {
                    a(2, exc);
                    return;
                }
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f26369e == 3) {
                    b60 b60Var = this.f26366b;
                    byte[] bArr2 = this.f26386v;
                    int i4 = u82.f32873a;
                    b60Var.b(bArr2, bArr);
                    a(new lr() { // from class: com.yandex.mobile.ads.impl.U3
                        @Override // com.yandex.mobile.ads.impl.lr
                        public final void accept(Object obj3) {
                            ((w30.a) obj3).b();
                        }
                    });
                    return;
                }
                byte[] b4 = this.f26366b.b(this.f26385u, bArr);
                int i5 = this.f26369e;
                if ((i5 == 2 || (i5 == 0 && this.f26386v != null)) && b4 != null && b4.length != 0) {
                    this.f26386v = b4;
                }
                this.f26379o = 4;
                a(new lr() { // from class: com.yandex.mobile.ads.impl.V3
                    @Override // com.yandex.mobile.ads.impl.lr
                    public final void accept(Object obj3) {
                        ((w30.a) obj3).a();
                    }
                });
            } catch (Exception e4) {
                if (e4 instanceof NotProvisionedException) {
                    ((hz.f) this.f26367c).a(this);
                } else {
                    a(1, e4);
                }
            }
        }
    }

    public final void a(int i4) {
        if (i4 == 2 && this.f26369e == 0 && this.f26379o == 4) {
            int i5 = u82.f32873a;
            a(false);
        }
    }

    public final void a(Exception exc, boolean z4) {
        a(z4 ? 1 : 3, exc);
    }

    private void a(byte[] bArr, int i4, boolean z4) {
        try {
            b60.a a4 = this.f26366b.a(bArr, this.f26365a, i4, this.f26372h);
            this.f26387w = a4;
            c cVar = this.f26382r;
            int i5 = u82.f32873a;
            a4.getClass();
            cVar.getClass();
            cVar.obtainMessage(1, new d(mr0.a(), z4, SystemClock.elapsedRealtime(), a4)).sendToTarget();
        } catch (Exception e4) {
            if (e4 instanceof NotProvisionedException) {
                ((hz.f) this.f26367c).a(this);
            } else {
                a(1, e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.v30
    public final void a(w30.a aVar) {
        int i4 = this.f26380p;
        if (i4 <= 0) {
            ms0.b("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i5 = i4 - 1;
        this.f26380p = i5;
        if (i5 == 0) {
            this.f26379o = 0;
            e eVar = this.f26378n;
            int i6 = u82.f32873a;
            eVar.removeCallbacksAndMessages(null);
            c cVar = this.f26382r;
            synchronized (cVar) {
                cVar.removeCallbacksAndMessages(null);
                cVar.f26389a = true;
            }
            this.f26382r = null;
            this.f26381q.quit();
            this.f26381q = null;
            this.f26383s = null;
            this.f26384t = null;
            this.f26387w = null;
            this.f26388x = null;
            byte[] bArr = this.f26385u;
            if (bArr != null) {
                this.f26366b.b(bArr);
                this.f26385u = null;
            }
        }
        if (aVar != null) {
            this.f26373i.c(aVar);
            if (this.f26373i.b(aVar) == 0) {
                aVar.d();
            }
        }
        ((hz.g) this.f26368d).a(this, this.f26380p);
    }

    private void a(int i4, final Exception exc) {
        int i5;
        int i6 = u82.f32873a;
        if (i6 >= 21 && a40.a(exc)) {
            i5 = a40.b(exc);
        } else {
            if (i6 < 23 || !b40.a(exc)) {
                if (i6 < 18 || !z30.b(exc)) {
                    if (i6 >= 18 && z30.a(exc)) {
                        i5 = 6007;
                    } else if (exc instanceof a82) {
                        i5 = AuthCode.StatusCode.WAITING_CONNECT;
                    } else if (exc instanceof hz.d) {
                        i5 = AuthCode.StatusCode.CERT_FINGERPRINT_ERROR;
                    } else if (exc instanceof iq0) {
                        i5 = 6008;
                    } else if (i4 != 1) {
                        if (i4 == 2) {
                            i5 = AuthCode.StatusCode.PERMISSION_NOT_EXIST;
                        } else if (i4 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i5 = AuthCode.StatusCode.AUTH_INFO_NOT_EXIST;
            }
            i5 = AuthCode.StatusCode.PERMISSION_EXPIRED;
        }
        this.f26384t = new v30.a(exc, i5);
        ms0.a("DefaultDrmSession", "DRM session error", exc);
        a(new lr() { // from class: com.yandex.mobile.ads.impl.Y3
            @Override // com.yandex.mobile.ads.impl.lr
            public final void accept(Object obj) {
                ((w30.a) obj).a(exc);
            }
        });
        if (this.f26379o != 4) {
            this.f26379o = 1;
        }
    }
}
