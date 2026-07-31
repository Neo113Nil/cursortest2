package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.yandex.mobile.ads.impl.ez;
import com.yandex.mobile.ads.impl.lq1;
import com.yandex.mobile.ads.impl.q30;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public final class n30 {

    /* renamed from: h, reason: collision with root package name */
    public static final kq1 f29386h = new kq1(1);

    /* renamed from: a, reason: collision with root package name */
    private final b f29387a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArraySet<c> f29388b;

    /* renamed from: c, reason: collision with root package name */
    private int f29389c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f29390d;

    /* renamed from: e, reason: collision with root package name */
    private int f29391e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f29392f;

    /* renamed from: g, reason: collision with root package name */
    private List<l30> f29393g;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final l30 f29394a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f29395b;

        /* renamed from: c, reason: collision with root package name */
        public final List<l30> f29396c;

        public a(l30 l30Var, boolean z4, ArrayList arrayList, Exception exc) {
            this.f29394a = l30Var;
            this.f29395b = z4;
            this.f29396c = arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final HandlerThread f29397a;

        /* renamed from: b, reason: collision with root package name */
        private final qk2 f29398b;

        /* renamed from: c, reason: collision with root package name */
        private final r30 f29399c;

        /* renamed from: d, reason: collision with root package name */
        private final Handler f29400d;

        /* renamed from: e, reason: collision with root package name */
        private final ArrayList<l30> f29401e;

        /* renamed from: f, reason: collision with root package name */
        private final HashMap<String, d> f29402f;

        /* renamed from: g, reason: collision with root package name */
        private int f29403g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f29404h;

        /* renamed from: i, reason: collision with root package name */
        private int f29405i;

        /* renamed from: j, reason: collision with root package name */
        private int f29406j;

        /* renamed from: k, reason: collision with root package name */
        private int f29407k;

        public b(HandlerThread handlerThread, ez ezVar, fz fzVar, Handler handler, boolean z4) {
            super(handlerThread.getLooper());
            this.f29397a = handlerThread;
            this.f29398b = ezVar;
            this.f29399c = fzVar;
            this.f29400d = handler;
            this.f29405i = 3;
            this.f29406j = 5;
            this.f29404h = z4;
            this.f29401e = new ArrayList<>();
            this.f29402f = new HashMap<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int a(l30 l30Var, l30 l30Var2) {
            long j4 = l30Var.f28402c;
            long j5 = l30Var2.f28402c;
            int i4 = u82.f32873a;
            if (j4 < j5) {
                return -1;
            }
            return j4 == j5 ? 0 : 1;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            m30 m30Var = null;
            int i4 = 7;
            r10 = 0;
            int i5 = 0;
            switch (message.what) {
                case 0:
                    this.f29403g = message.arg1;
                    try {
                        ((ez) this.f29398b).b();
                        m30Var = ((ez) this.f29398b).a(0, 1, 2, 5, 7);
                    } catch (IOException e4) {
                        ms0.a("DownloadManager", "Failed to load index.", e4);
                        this.f29401e.clear();
                    } finally {
                        u82.a((Closeable) m30Var);
                    }
                    while (true) {
                        ez.a aVar = (ez.a) m30Var;
                        if (!aVar.a(aVar.b() + 1)) {
                            this.f29400d.obtainMessage(0, new ArrayList(this.f29401e)).sendToTarget();
                            b();
                            i5 = 1;
                            this.f29400d.obtainMessage(1, i5, this.f29402f.size()).sendToTarget();
                            return;
                        }
                        this.f29401e.add(((ez.a) m30Var).a());
                    }
                case 1:
                    this.f29404h = message.arg1 != 0;
                    b();
                    i5 = 1;
                    this.f29400d.obtainMessage(1, i5, this.f29402f.size()).sendToTarget();
                    return;
                case 2:
                    this.f29403g = message.arg1;
                    b();
                    i5 = 1;
                    this.f29400d.obtainMessage(1, i5, this.f29402f.size()).sendToTarget();
                    return;
                case 3:
                    String str = (String) message.obj;
                    int i6 = message.arg1;
                    if (str == null) {
                        for (int i7 = 0; i7 < this.f29401e.size(); i7++) {
                            a(this.f29401e.get(i7), i6);
                        }
                        try {
                            ((ez) this.f29398b).a(i6);
                        } catch (IOException e5) {
                            ms0.a("DownloadManager", "Failed to set manual stop reason", e5);
                        }
                    } else {
                        l30 a4 = a(str, false);
                        if (a4 != null) {
                            a(a4, i6);
                        } else {
                            try {
                                ((ez) this.f29398b).a(i6, str);
                            } catch (IOException e6) {
                                ms0.a("DownloadManager", "Failed to set manual stop reason: ".concat(str), e6);
                            }
                        }
                    }
                    b();
                    i5 = 1;
                    this.f29400d.obtainMessage(1, i5, this.f29402f.size()).sendToTarget();
                    return;
                case 4:
                    this.f29405i = message.arg1;
                    b();
                    i5 = 1;
                    this.f29400d.obtainMessage(1, i5, this.f29402f.size()).sendToTarget();
                    return;
                case 5:
                    this.f29406j = message.arg1;
                    i5 = 1;
                    this.f29400d.obtainMessage(1, i5, this.f29402f.size()).sendToTarget();
                    return;
                case 6:
                    p30 p30Var = (p30) message.obj;
                    int i8 = message.arg1;
                    l30 a5 = a(p30Var.f30307b, true);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (a5 != null) {
                        int i9 = a5.f28401b;
                        long j4 = (i9 == 5 || i9 == 3 || i9 == 4) ? currentTimeMillis : a5.f28402c;
                        if (i9 != 5 && i9 != 7) {
                            i4 = i8 != 0 ? 1 : 0;
                        }
                        a(new l30(a5.f28400a.a(p30Var), i4, j4, currentTimeMillis, -1L, i8, 0, new o30()));
                    } else {
                        a(new l30(p30Var, i8 != 0 ? 1 : 0, currentTimeMillis, currentTimeMillis, -1L, i8, 0, new o30()));
                    }
                    b();
                    i5 = 1;
                    this.f29400d.obtainMessage(1, i5, this.f29402f.size()).sendToTarget();
                    return;
                case 7:
                    String str2 = (String) message.obj;
                    l30 a6 = a(str2, true);
                    if (a6 == null) {
                        ms0.b("DownloadManager", "Failed to remove nonexistent download: " + str2);
                    } else {
                        a(a6, 5, 0);
                        b();
                    }
                    i5 = 1;
                    this.f29400d.obtainMessage(1, i5, this.f29402f.size()).sendToTarget();
                    return;
                case 8:
                    a();
                    i5 = 1;
                    this.f29400d.obtainMessage(1, i5, this.f29402f.size()).sendToTarget();
                    return;
                case 9:
                    d dVar = (d) message.obj;
                    String str3 = dVar.f29408b.f30307b;
                    this.f29402f.remove(str3);
                    boolean z4 = dVar.f29411e;
                    if (!z4) {
                        int i10 = this.f29407k - 1;
                        this.f29407k = i10;
                        if (i10 == 0) {
                            removeMessages(11);
                        }
                    }
                    if (dVar.f29414h) {
                        b();
                    } else {
                        Exception exc = dVar.f29415i;
                        if (exc != null) {
                            ms0.a("DownloadManager", "Task failed: " + dVar.f29408b + ", " + z4, exc);
                        }
                        l30 a7 = a(str3, false);
                        a7.getClass();
                        int i11 = a7.f28401b;
                        if (i11 != 2) {
                            if (i11 != 5 && i11 != 7) {
                                throw new IllegalStateException();
                            }
                            if (!z4) {
                                throw new IllegalStateException();
                            }
                            if (i11 == 7) {
                                int i12 = a7.f28405f;
                                a(a7, i12 == 0 ? 0 : 1, i12);
                                b();
                            } else {
                                this.f29401e.remove(a(a7.f28400a.f30307b));
                                try {
                                    ((ez) this.f29398b).c(a7.f28400a.f30307b);
                                } catch (IOException unused) {
                                    ms0.b("DownloadManager", "Failed to remove from database");
                                }
                                this.f29400d.obtainMessage(2, new a(a7, true, new ArrayList(this.f29401e), null)).sendToTarget();
                            }
                        } else {
                            if (z4) {
                                throw new IllegalStateException();
                            }
                            l30 l30Var = new l30(a7.f28400a, exc == null ? 3 : 4, a7.f28402c, System.currentTimeMillis(), a7.f28404e, a7.f28405f, exc == null ? 0 : 1, a7.f28407h);
                            this.f29401e.remove(a(l30Var.f28400a.f30307b));
                            try {
                                ((ez) this.f29398b).a(l30Var);
                            } catch (IOException e7) {
                                ms0.a("DownloadManager", "Failed to update index.", e7);
                            }
                            this.f29400d.obtainMessage(2, new a(l30Var, false, new ArrayList(this.f29401e), exc)).sendToTarget();
                        }
                        b();
                    }
                    this.f29400d.obtainMessage(1, i5, this.f29402f.size()).sendToTarget();
                    return;
                case 10:
                    d dVar2 = (d) message.obj;
                    int i13 = message.arg1;
                    int i14 = message.arg2;
                    int i15 = u82.f32873a;
                    long j5 = ((i13 & 4294967295L) << 32) | (4294967295L & i14);
                    l30 a8 = a(dVar2.f29408b.f30307b, false);
                    a8.getClass();
                    if (j5 == a8.f28404e || j5 == -1) {
                        return;
                    }
                    a(new l30(a8.f28400a, a8.f28401b, a8.f28402c, System.currentTimeMillis(), j5, a8.f28405f, a8.f28406g, a8.f28407h));
                    return;
                case 11:
                    for (int i16 = 0; i16 < this.f29401e.size(); i16++) {
                        l30 l30Var2 = this.f29401e.get(i16);
                        if (l30Var2.f28401b == 2) {
                            try {
                                ((ez) this.f29398b).a(l30Var2);
                            } catch (IOException e8) {
                                ms0.a("DownloadManager", "Failed to update index.", e8);
                            }
                        }
                    }
                    sendEmptyMessageDelayed(11, 5000L);
                    return;
                case 12:
                    Iterator<d> it = this.f29402f.values().iterator();
                    while (it.hasNext()) {
                        it.next().a(true);
                    }
                    try {
                        ((ez) this.f29398b).b();
                    } catch (IOException e9) {
                        ms0.a("DownloadManager", "Failed to update index.", e9);
                    }
                    this.f29401e.clear();
                    this.f29397a.quit();
                    synchronized (this) {
                        notifyAll();
                    }
                    return;
                default:
                    throw new IllegalStateException();
            }
        }

        private l30 a(String str, boolean z4) {
            int a4 = a(str);
            if (a4 != -1) {
                return this.f29401e.get(a4);
            }
            if (!z4) {
                return null;
            }
            try {
                return ((ez) this.f29398b).b(str);
            } catch (IOException e4) {
                ms0.a("DownloadManager", "Failed to load download: " + str, e4);
                return null;
            }
        }

        private void b() {
            int i4 = 0;
            for (int i5 = 0; i5 < this.f29401e.size(); i5++) {
                l30 l30Var = this.f29401e.get(i5);
                d dVar = this.f29402f.get(l30Var.f28400a.f30307b);
                int i6 = l30Var.f28401b;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            dVar.getClass();
                            if (dVar.f29411e) {
                                throw new IllegalStateException();
                            }
                            if (this.f29404h || this.f29403g != 0 || i4 >= this.f29405i) {
                                a(l30Var, 0, 0);
                                dVar.a(false);
                            }
                        } else {
                            if (i6 != 5 && i6 != 7) {
                                throw new IllegalStateException();
                            }
                            if (dVar == null) {
                                d dVar2 = new d(l30Var.f28400a, ((fz) this.f29399c).a(l30Var.f28400a), l30Var.f28407h, true, this.f29406j, this);
                                this.f29402f.put(l30Var.f28400a.f30307b, dVar2);
                                dVar2.start();
                            } else if (!dVar.f29411e) {
                                dVar.a(false);
                            }
                        }
                    } else if (dVar != null) {
                        if (dVar.f29411e) {
                            throw new IllegalStateException();
                        }
                        dVar.a(false);
                    }
                } else if (dVar != null) {
                    if (dVar.f29411e) {
                        throw new IllegalStateException();
                    }
                    dVar.a(false);
                } else if (this.f29404h || this.f29403g != 0 || this.f29407k >= this.f29405i) {
                    dVar = null;
                } else {
                    l30 a4 = a(l30Var, 2, 0);
                    d dVar3 = new d(a4.f28400a, ((fz) this.f29399c).a(a4.f28400a), a4.f28407h, false, this.f29406j, this);
                    this.f29402f.put(a4.f28400a.f30307b, dVar3);
                    int i7 = this.f29407k;
                    this.f29407k = i7 + 1;
                    if (i7 == 0) {
                        sendEmptyMessageDelayed(11, 5000L);
                    }
                    dVar3.start();
                    dVar = dVar3;
                }
                if (dVar != null && !dVar.f29411e) {
                    i4++;
                }
            }
        }

        private int a(String str) {
            for (int i4 = 0; i4 < this.f29401e.size(); i4++) {
                if (this.f29401e.get(i4).f28400a.f30307b.equals(str)) {
                    return i4;
                }
            }
            return -1;
        }

        private l30 a(l30 l30Var) {
            int i4 = l30Var.f28401b;
            if (i4 != 3 && i4 != 4) {
                int a4 = a(l30Var.f28400a.f30307b);
                if (a4 == -1) {
                    this.f29401e.add(l30Var);
                    Collections.sort(this.f29401e, new Ka());
                } else {
                    boolean z4 = l30Var.f28402c != this.f29401e.get(a4).f28402c;
                    this.f29401e.set(a4, l30Var);
                    if (z4) {
                        Collections.sort(this.f29401e, new Ka());
                    }
                }
                try {
                    ((ez) this.f29398b).a(l30Var);
                } catch (IOException e4) {
                    ms0.a("DownloadManager", "Failed to update index.", e4);
                }
                this.f29400d.obtainMessage(2, new a(l30Var, false, new ArrayList(this.f29401e), null)).sendToTarget();
                return l30Var;
            }
            throw new IllegalStateException();
        }

        private l30 a(l30 l30Var, int i4, int i5) {
            if (i4 != 3 && i4 != 4) {
                return a(new l30(l30Var.f28400a, i4, l30Var.f28402c, System.currentTimeMillis(), l30Var.f28404e, i5, 0, l30Var.f28407h));
            }
            throw new IllegalStateException();
        }

        private void a() {
            ArrayList arrayList = new ArrayList();
            try {
                m30 a4 = ((ez) this.f29398b).a(3, 4);
                while (true) {
                    try {
                        ez.a aVar = (ez.a) a4;
                        if (!aVar.a(aVar.b() + 1)) {
                            break;
                        } else {
                            arrayList.add(((ez.a) a4).a());
                        }
                    } finally {
                    }
                }
                ((ez.a) a4).close();
            } catch (IOException unused) {
                ms0.b("DownloadManager", "Failed to load downloads.");
            }
            for (int i4 = 0; i4 < this.f29401e.size(); i4++) {
                ArrayList<l30> arrayList2 = this.f29401e;
                l30 l30Var = arrayList2.get(i4);
                arrayList2.set(i4, new l30(l30Var.f28400a, 5, l30Var.f28402c, System.currentTimeMillis(), l30Var.f28404e, 0, 0, l30Var.f28407h));
            }
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ArrayList<l30> arrayList3 = this.f29401e;
                l30 l30Var2 = (l30) arrayList.get(i5);
                arrayList3.add(new l30(l30Var2.f28400a, 5, l30Var2.f28402c, System.currentTimeMillis(), l30Var2.f28404e, 0, 0, l30Var2.f28407h));
            }
            Collections.sort(this.f29401e, new Ka());
            try {
                ((ez) this.f29398b).c();
            } catch (IOException e4) {
                ms0.a("DownloadManager", "Failed to update index.", e4);
            }
            ArrayList arrayList4 = new ArrayList(this.f29401e);
            for (int i6 = 0; i6 < this.f29401e.size(); i6++) {
                this.f29400d.obtainMessage(2, new a(this.f29401e.get(i6), false, arrayList4, null)).sendToTarget();
            }
            b();
        }

        private void a(l30 l30Var, int i4) {
            if (i4 == 0) {
                if (l30Var.f28401b == 1) {
                    a(l30Var, 0, 0);
                }
            } else if (i4 != l30Var.f28405f) {
                int i5 = l30Var.f28401b;
                if (i5 == 0 || i5 == 2) {
                    i5 = 1;
                }
                a(new l30(l30Var.f28400a, i5, l30Var.f28402c, System.currentTimeMillis(), l30Var.f28404e, i4, 0, l30Var.f28407h));
            }
        }
    }

    public interface c {
        default void a(n30 n30Var, l30 l30Var) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class d extends Thread implements q30.a {

        /* renamed from: b, reason: collision with root package name */
        private final p30 f29408b;

        /* renamed from: c, reason: collision with root package name */
        private final q30 f29409c;

        /* renamed from: d, reason: collision with root package name */
        private final o30 f29410d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f29411e;

        /* renamed from: f, reason: collision with root package name */
        private final int f29412f;

        /* renamed from: g, reason: collision with root package name */
        private volatile b f29413g;

        /* renamed from: h, reason: collision with root package name */
        private volatile boolean f29414h;

        /* renamed from: i, reason: collision with root package name */
        private Exception f29415i;

        /* renamed from: j, reason: collision with root package name */
        private long f29416j;

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.f29411e) {
                    this.f29409c.remove();
                } else {
                    long j4 = -1;
                    int i4 = 0;
                    while (!this.f29414h) {
                        try {
                            this.f29409c.a(this);
                            break;
                        } catch (IOException e4) {
                            if (!this.f29414h) {
                                long j5 = this.f29410d.f29891a;
                                if (j5 != j4) {
                                    i4 = 0;
                                    j4 = j5;
                                }
                                int i5 = i4 + 1;
                                if (i5 > this.f29412f) {
                                    throw e4;
                                }
                                Thread.sleep(Math.min(i4 * 1000, 5000));
                                i4 = i5;
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e5) {
                this.f29415i = e5;
            }
            b bVar = this.f29413g;
            if (bVar != null) {
                bVar.obtainMessage(9, this).sendToTarget();
            }
        }

        private d(p30 p30Var, q30 q30Var, o30 o30Var, boolean z4, int i4, b bVar) {
            this.f29408b = p30Var;
            this.f29409c = q30Var;
            this.f29410d = o30Var;
            this.f29411e = z4;
            this.f29412f = i4;
            this.f29413g = bVar;
            this.f29416j = -1L;
        }

        public final void a(boolean z4) {
            if (z4) {
                this.f29413g = null;
            }
            if (this.f29414h) {
                return;
            }
            this.f29414h = true;
            this.f29409c.cancel();
            interrupt();
        }

        public final void a(long j4, long j5, float f4) {
            this.f29410d.f29891a = j5;
            this.f29410d.f29892b = f4;
            if (j4 != this.f29416j) {
                this.f29416j = j4;
                b bVar = this.f29413g;
                if (bVar != null) {
                    bVar.obtainMessage(10, (int) (j4 >> 32), (int) j4, this).sendToTarget();
                }
            }
        }
    }

    public n30(Context context, ez ezVar, fz fzVar) {
        context.getApplicationContext();
        this.f29390d = true;
        this.f29393g = Collections.EMPTY_LIST;
        this.f29388b = new CopyOnWriteArraySet<>();
        Handler b4 = u82.b(new Handler.Callback() { // from class: com.yandex.mobile.ads.impl.Ia
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean a4;
                a4 = n30.this.a(message);
                return a4;
            }
        });
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        b bVar = new b(handlerThread, ezVar, fzVar, b4, this.f29390d);
        this.f29387a = bVar;
        int c4 = new lq1(context, new lq1.b() { // from class: com.yandex.mobile.ads.impl.Ja
            @Override // com.yandex.mobile.ads.impl.lq1.b
            public final void a(lq1 lq1Var, int i4) {
                n30.this.a(lq1Var, i4);
            }
        }).c();
        this.f29391e = c4;
        this.f29389c = 1;
        bVar.obtainMessage(0, c4, 0).sendToTarget();
    }

    private boolean b() {
        boolean z4;
        if (!this.f29390d && this.f29391e != 0) {
            for (int i4 = 0; i4 < this.f29393g.size(); i4++) {
                if (this.f29393g.get(i4).f28401b == 0) {
                    z4 = true;
                    break;
                }
            }
        }
        z4 = false;
        boolean z5 = this.f29392f != z4;
        this.f29392f = z4;
        return z5;
    }

    public final void a(p30 p30Var) {
        this.f29389c++;
        this.f29387a.obtainMessage(6, 0, 0, p30Var).sendToTarget();
    }

    public final void a(fj2 fj2Var) {
        this.f29388b.add(fj2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Message message) {
        int i4 = message.what;
        if (i4 == 0) {
            this.f29393g = Collections.unmodifiableList((List) message.obj);
            boolean b4 = b();
            Iterator<c> it = this.f29388b.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
            if (b4) {
                Iterator<c> it2 = this.f29388b.iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                }
            }
        } else if (i4 == 1) {
            int i5 = message.arg1;
            int i6 = message.arg2;
            int i7 = this.f29389c - i5;
            this.f29389c = i7;
            if (i6 == 0 && i7 == 0) {
                Iterator<c> it3 = this.f29388b.iterator();
                while (it3.hasNext()) {
                    it3.next().getClass();
                }
            }
        } else if (i4 == 2) {
            a aVar = (a) message.obj;
            this.f29393g = Collections.unmodifiableList(aVar.f29396c);
            l30 l30Var = aVar.f29394a;
            boolean b5 = b();
            if (aVar.f29395b) {
                Iterator<c> it4 = this.f29388b.iterator();
                while (it4.hasNext()) {
                    it4.next().getClass();
                }
            } else {
                Iterator<c> it5 = this.f29388b.iterator();
                while (it5.hasNext()) {
                    it5.next().a(this, l30Var);
                }
            }
            if (b5) {
                Iterator<c> it6 = this.f29388b.iterator();
                while (it6.hasNext()) {
                    it6.next().getClass();
                }
            }
        } else {
            throw new IllegalStateException();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(lq1 lq1Var, int i4) {
        lq1Var.getClass();
        if (this.f29391e != i4) {
            this.f29391e = i4;
            this.f29389c++;
            this.f29387a.obtainMessage(2, i4, 0).sendToTarget();
        }
        boolean b4 = b();
        Iterator<c> it = this.f29388b.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        if (b4) {
            Iterator<c> it2 = this.f29388b.iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
            }
        }
    }

    public final void a(String str) {
        this.f29389c++;
        this.f29387a.obtainMessage(7, str).sendToTarget();
    }

    public final void a(c cVar) {
        this.f29388b.remove(cVar);
    }

    public final void a() {
        if (this.f29390d) {
            this.f29390d = false;
            this.f29389c++;
            this.f29387a.obtainMessage(1, 0, 0).sendToTarget();
            boolean b4 = b();
            Iterator<c> it = this.f29388b.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
            if (b4) {
                Iterator<c> it2 = this.f29388b.iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                }
            }
        }
    }
}
