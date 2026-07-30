package com.anythink.basead.exoplayer.d;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.anythink.basead.exoplayer.d.c;
import com.anythink.basead.exoplayer.d.e;
import com.anythink.basead.exoplayer.d.f;
import com.anythink.basead.exoplayer.d.i;
import com.anythink.basead.exoplayer.d.j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
final class b<T extends i> implements f<T> {
    private static final String i = "DefaultDrmSession";

    /* renamed from: j, reason: collision with root package name */
    private static final int f6943j = 0;

    /* renamed from: k, reason: collision with root package name */
    private static final int f6944k = 1;

    /* renamed from: l, reason: collision with root package name */
    private static final int f6945l = 60;

    /* renamed from: A, reason: collision with root package name */
    private byte[] f6946A;

    /* renamed from: B, reason: collision with root package name */
    private Object f6947B;

    /* renamed from: C, reason: collision with root package name */
    private Object f6948C;

    /* renamed from: a, reason: collision with root package name */
    final n f6949a;

    /* renamed from: b, reason: collision with root package name */
    final UUID f6950b;

    /* renamed from: c, reason: collision with root package name */
    final b<T>.HandlerC0017b f6951c;

    /* renamed from: m, reason: collision with root package name */
    private final j<T> f6952m;

    /* renamed from: n, reason: collision with root package name */
    private final c<T> f6953n;

    /* renamed from: o, reason: collision with root package name */
    private final e.a f6954o;

    /* renamed from: p, reason: collision with root package name */
    private final int f6955p;

    /* renamed from: q, reason: collision with root package name */
    private final HashMap<String, String> f6956q;

    /* renamed from: r, reason: collision with root package name */
    private final c.a f6957r;

    /* renamed from: s, reason: collision with root package name */
    private final int f6958s;

    /* renamed from: t, reason: collision with root package name */
    private int f6959t;

    /* renamed from: u, reason: collision with root package name */
    private int f6960u;

    /* renamed from: v, reason: collision with root package name */
    private HandlerThread f6961v;

    /* renamed from: w, reason: collision with root package name */
    private b<T>.a f6962w;

    /* renamed from: x, reason: collision with root package name */
    private T f6963x;

    /* renamed from: y, reason: collision with root package name */
    private f.a f6964y;

    /* renamed from: z, reason: collision with root package name */
    private byte[] f6965z;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(int i, Object obj, boolean z8) {
            obtainMessage(i, z8 ? 1 : 0, 0, obj).sendToTarget();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object obj;
            int i;
            int i4;
            Object obj2 = message.obj;
            try {
                int i9 = message.what;
                if (i9 == 0) {
                    obj = b.this.f6949a.a();
                } else {
                    if (i9 != 1) {
                        throw new RuntimeException();
                    }
                    Object obj3 = ((Pair) obj2).first;
                    obj = b.this.f6949a.b();
                }
            } catch (Exception e6) {
                if (message.arg1 == 1 && (i4 = (i = message.arg2) + 1) <= b.this.f6958s) {
                    Message obtain = Message.obtain(message);
                    obtain.arg2 = i4;
                    sendMessageDelayed(obtain, Math.min(i * 1000, 5000));
                    return;
                }
                obj = e6;
            }
            b.this.f6951c.obtainMessage(message.what, Pair.create(obj2, obj)).sendToTarget();
        }

        private boolean a(Message message) {
            int i;
            int i4;
            if (message.arg1 != 1 || (i4 = (i = message.arg2) + 1) > b.this.f6958s) {
                return false;
            }
            Message obtain = Message.obtain(message);
            obtain.arg2 = i4;
            sendMessageDelayed(obtain, Math.min(i * 1000, 5000));
            return true;
        }

        private static long a(int i) {
            return Math.min((i - 1) * 1000, 5000);
        }
    }

    /* renamed from: com.anythink.basead.exoplayer.d.b$b, reason: collision with other inner class name */
    public class HandlerC0017b extends Handler {
        public HandlerC0017b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                b.a(b.this, obj, obj2);
            } else {
                if (i != 1) {
                    return;
                }
                b.b(b.this, obj, obj2);
            }
        }
    }

    public interface c<T extends i> {
        void a();

        void a(b<T> bVar);

        void a(Exception exc);
    }

    public b(UUID uuid, j<T> jVar, c<T> cVar, e.a aVar, int i4, byte[] bArr, HashMap<String, String> hashMap, n nVar, Looper looper, c.a aVar2, int i9) {
        this.f6950b = uuid;
        this.f6953n = cVar;
        this.f6952m = jVar;
        this.f6955p = i4;
        this.f6946A = bArr;
        this.f6954o = bArr != null ? null : aVar;
        this.f6956q = hashMap;
        this.f6949a = nVar;
        this.f6958s = i9;
        this.f6957r = aVar2;
        this.f6959t = 2;
        this.f6951c = new HandlerC0017b(looper);
        HandlerThread handlerThread = new HandlerThread("DrmRequestHandler");
        this.f6961v = handlerThread;
        handlerThread.start();
        this.f6962w = new a(this.f6961v.getLooper());
    }

    private boolean j() {
        if (n()) {
            return true;
        }
        try {
            byte[] a9 = this.f6952m.a();
            this.f6965z = a9;
            this.f6963x = this.f6952m.d(a9);
            this.f6959t = 3;
            return true;
        } catch (Exception e6) {
            c(e6);
            return false;
        }
    }

    private boolean k() {
        try {
            this.f6952m.b(this.f6965z, this.f6946A);
            return true;
        } catch (Exception e6) {
            Log.e(i, "Error trying to restore Widevine keys.", e6);
            c(e6);
            return false;
        }
    }

    private long l() {
        if (!com.anythink.basead.exoplayer.b.bk.equals(this.f6950b)) {
            return Long.MAX_VALUE;
        }
        Pair<Long, Long> a9 = p.a(this);
        return Math.min(((Long) a9.first).longValue(), ((Long) a9.second).longValue());
    }

    private void m() {
        if (this.f6959t == 4) {
            this.f6959t = 3;
            c(new m());
        }
    }

    private boolean n() {
        int i4 = this.f6959t;
        return i4 == 3 || i4 == 4;
    }

    public final boolean b() {
        int i4 = this.f6960u - 1;
        this.f6960u = i4;
        if (i4 != 0) {
            return false;
        }
        this.f6959t = 0;
        this.f6951c.removeCallbacksAndMessages(null);
        this.f6962w.removeCallbacksAndMessages(null);
        this.f6962w = null;
        this.f6961v.quit();
        this.f6961v = null;
        this.f6963x = null;
        this.f6964y = null;
        this.f6947B = null;
        this.f6948C = null;
        byte[] bArr = this.f6965z;
        if (bArr != null) {
            this.f6952m.a(bArr);
            this.f6965z = null;
        }
        return true;
    }

    public final void c() {
        j.h b9 = this.f6952m.b();
        this.f6948C = b9;
        this.f6962w.a(0, b9, true);
    }

    public final void d() {
        if (j()) {
            a(true);
        }
    }

    @Override // com.anythink.basead.exoplayer.d.f
    public final int e() {
        return this.f6959t;
    }

    @Override // com.anythink.basead.exoplayer.d.f
    public final f.a f() {
        if (this.f6959t == 1) {
            return this.f6964y;
        }
        return null;
    }

    @Override // com.anythink.basead.exoplayer.d.f
    public final T g() {
        return this.f6963x;
    }

    @Override // com.anythink.basead.exoplayer.d.f
    public final Map<String, String> h() {
        byte[] bArr = this.f6965z;
        if (bArr == null) {
            return null;
        }
        return this.f6952m.c(bArr);
    }

    @Override // com.anythink.basead.exoplayer.d.f
    public final byte[] i() {
        return this.f6946A;
    }

    public final void a() {
        int i4 = this.f6960u + 1;
        this.f6960u = i4;
        if (i4 == 1 && this.f6959t != 1 && j()) {
            a(true);
        }
    }

    private void c(Exception exc) {
        this.f6964y = new f.a(exc);
        this.f6957r.a(exc);
        if (this.f6959t != 4) {
            this.f6959t = 1;
        }
    }

    public final boolean a(byte[] bArr) {
        e.a aVar = this.f6954o;
        return Arrays.equals(aVar != null ? aVar.f7007c : null, bArr);
    }

    public final void a(int i4) {
        if (n()) {
            if (i4 == 1) {
                this.f6959t = 3;
                this.f6953n.a(this);
            } else {
                if (i4 != 2) {
                    if (i4 == 3 && this.f6959t == 4) {
                        this.f6959t = 3;
                        c(new m());
                        return;
                    }
                    return;
                }
                a(false);
            }
        }
    }

    public final void a(Exception exc) {
        c(exc);
    }

    private void a(Object obj, Object obj2) {
        if (obj == this.f6948C) {
            if (this.f6959t == 2 || n()) {
                this.f6948C = null;
                if (obj2 instanceof Exception) {
                    this.f6953n.a((Exception) obj2);
                    return;
                }
                try {
                    this.f6952m.b((byte[]) obj2);
                    this.f6953n.a();
                } catch (Exception e6) {
                    this.f6953n.a(e6);
                }
            }
        }
    }

    public final boolean b(byte[] bArr) {
        return Arrays.equals(this.f6965z, bArr);
    }

    private void b(Object obj, Object obj2) {
        if (obj == this.f6947B && n()) {
            this.f6947B = null;
            if (obj2 instanceof Exception) {
                b((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f6955p == 3) {
                    this.f6952m.a(this.f6946A, bArr);
                    this.f6957r.c();
                    return;
                }
                byte[] a9 = this.f6952m.a(this.f6965z, bArr);
                int i4 = this.f6955p;
                if ((i4 == 2 || (i4 == 0 && this.f6946A != null)) && a9 != null && a9.length != 0) {
                    this.f6946A = a9;
                }
                this.f6959t = 4;
                this.f6957r.a();
            } catch (Exception e6) {
                b(e6);
            }
        }
    }

    private void a(boolean z8) {
        int i4 = this.f6955p;
        if (i4 != 0 && i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3 && k()) {
                    a(3, z8);
                    return;
                }
                return;
            }
            if (this.f6946A == null) {
                a(2, z8);
                return;
            } else {
                if (k()) {
                    a(2, z8);
                    return;
                }
                return;
            }
        }
        if (this.f6946A == null) {
            a(1, z8);
            return;
        }
        if (this.f6959t == 4 || k()) {
            long l9 = l();
            if (this.f6955p == 0 && l9 <= 60) {
                Log.d(i, "Offline license has expired or will expire soon. Remaining seconds: ".concat(String.valueOf(l9)));
                a(2, z8);
            } else if (l9 <= 0) {
                c(new m());
            } else {
                this.f6959t = 4;
                this.f6957r.b();
            }
        }
    }

    private void b(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.f6953n.a(this);
        } else {
            c(exc);
        }
    }

    public static /* synthetic */ void b(b bVar, Object obj, Object obj2) {
        if (obj == bVar.f6947B && bVar.n()) {
            bVar.f6947B = null;
            if (obj2 instanceof Exception) {
                bVar.b((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (bVar.f6955p == 3) {
                    bVar.f6952m.a(bVar.f6946A, bArr);
                    bVar.f6957r.c();
                    return;
                }
                byte[] a9 = bVar.f6952m.a(bVar.f6965z, bArr);
                int i4 = bVar.f6955p;
                if ((i4 == 2 || (i4 == 0 && bVar.f6946A != null)) && a9 != null && a9.length != 0) {
                    bVar.f6946A = a9;
                }
                bVar.f6959t = 4;
                bVar.f6957r.a();
            } catch (Exception e6) {
                bVar.b(e6);
            }
        }
    }

    private void a(int i4, boolean z8) {
        String str;
        byte[] bArr;
        String str2;
        byte[] bArr2 = i4 == 3 ? this.f6946A : this.f6965z;
        e.a aVar = this.f6954o;
        if (aVar != null) {
            byte[] bArr3 = aVar.f7007c;
            String str3 = aVar.f7006b;
            str = aVar.f7005a;
            str2 = str3;
            bArr = bArr3;
        } else {
            str = null;
            bArr = null;
            str2 = null;
        }
        try {
            Pair create = Pair.create(this.f6952m.a(bArr2, bArr, str2, i4, this.f6956q), str);
            this.f6947B = create;
            this.f6962w.a(1, create, z8);
        } catch (Exception e6) {
            b(e6);
        }
    }

    public static /* synthetic */ void a(b bVar, Object obj, Object obj2) {
        if (obj == bVar.f6948C) {
            if (bVar.f6959t == 2 || bVar.n()) {
                bVar.f6948C = null;
                if (obj2 instanceof Exception) {
                    bVar.f6953n.a((Exception) obj2);
                    return;
                }
                try {
                    bVar.f6952m.b((byte[]) obj2);
                    bVar.f6953n.a();
                } catch (Exception e6) {
                    bVar.f6953n.a(e6);
                }
            }
        }
    }
}
