package androidx.room;

import a0.s0;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.logging.Level;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1101f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1102g;

    public /* synthetic */ o(int i7, Object obj) {
        this.f1101f = i7;
        this.f1102g = obj;
    }

    private final void b() {
        v7.a c4;
        long j8;
        while (true) {
            v7.d dVar = (v7.d) this.f1102g;
            synchronized (dVar) {
                c4 = dVar.c();
            }
            if (c4 == null) {
                return;
            }
            v7.c cVar = c4.f9161c;
            r6.k.c(cVar);
            v7.d dVar2 = (v7.d) this.f1102g;
            boolean isLoggable = v7.d.f9172i.isLoggable(Level.FINE);
            if (isLoggable) {
                j8 = System.nanoTime();
                u3.z.d(c4, cVar, "starting");
            } else {
                j8 = -1;
            }
            try {
                v7.d.a(dVar2, c4);
                if (isLoggable) {
                    u3.z.d(c4, cVar, "finished run in ".concat(u3.z.h(System.nanoTime() - j8)));
                }
            } finally {
            }
        }
    }

    public f6.j a() {
        p pVar = (p) this.f1102g;
        f6.j jVar = new f6.j();
        Cursor query$default = u.query$default(pVar.f1104a, new q5.g("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
        while (query$default.moveToNext()) {
            try {
                jVar.add(Integer.valueOf(query$default.getInt(0)));
            } finally {
            }
        }
        query$default.close();
        f6.j k8 = a8.m.k(jVar);
        if (k8.f3436f.isEmpty()) {
            return k8;
        }
        if (((p) this.f1102g).f1111h == null) {
            throw new IllegalStateException("Required value was null.");
        }
        y3.e eVar = ((p) this.f1102g).f1111h;
        if (eVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        eVar.l();
        return k8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set set;
        Object a3;
        Socket d8;
        switch (this.f1101f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Lock closeLock$room_runtime_release = ((p) this.f1102g).f1104a.getCloseLock$room_runtime_release();
                closeLock$room_runtime_release.lock();
                try {
                    try {
                        try {
                        } finally {
                            closeLock$room_runtime_release.unlock();
                        }
                    } catch (SQLiteException e9) {
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e9);
                        set = e6.w.f2828f;
                    }
                } catch (IllegalStateException e10) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                    set = e6.w.f2828f;
                }
                if (((p) this.f1102g).a() && ((p) this.f1102g).f1109f.compareAndSet(true, false) && !((p) this.f1102g).f1104a.inTransaction()) {
                    y3.a b9 = ((z3.g) ((p) this.f1102g).f1104a.getOpenHelper()).b();
                    b9.C();
                    try {
                        set = a();
                        b9.A();
                        if (set.isEmpty()) {
                            return;
                        }
                        p pVar = (p) this.f1102g;
                        synchronized (pVar.f1113j) {
                            Iterator it = pVar.f1113j.iterator();
                            while (true) {
                                h.b bVar = (h.b) it;
                                if (bVar.hasNext()) {
                                    ((n) ((Map.Entry) bVar.next()).getValue()).a(set);
                                }
                            }
                        }
                        return;
                    } finally {
                        b9.d();
                    }
                }
                return;
            case 1:
                j5.n nVar = (j5.n) this.f1102g;
                nVar.D = null;
                nVar.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (!nVar.d() || currentTimeMillis <= nVar.E + 60000) {
                    nVar.b();
                    return;
                } else {
                    nVar.c("connection_idle");
                    return;
                }
            case 2:
                ((l4.j) this.f1102g).h();
                return;
            case 3:
                k4.a aVar = ((l4.j) ((l1.x) this.f1102g).f5847g).f5975d;
                aVar.d(aVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 4:
                throw null;
            case 5:
                l5.i iVar = (l5.i) this.f1102g;
                l5.j jVar = iVar.f6032a;
                s0 s0Var = new s0(jVar.f6045b, jVar.f6044a, jVar.f6046c);
                l5.d dVar = iVar.f6039h;
                c b10 = dVar.b();
                l.i iVar2 = dVar.f6012a;
                h5.b bVar2 = dVar.f6014c;
                b1.b bVar3 = dVar.f6016e;
                if (bVar3 == null) {
                    throw new RuntimeException("Custom run loops are not supported!");
                }
                o5.b bVar4 = (o5.b) bVar3.f1230g;
                b6.d dVar2 = new b6.d(bVar2, 3, bVar4);
                h5.b bVar5 = dVar.f6015d;
                if (bVar3 == null) {
                    throw new RuntimeException("Custom run loops are not supported!");
                }
                b6.d dVar3 = new b6.d(bVar5, 3, bVar4);
                if (bVar3 == null) {
                    throw new RuntimeException("Custom run loops are not supported!");
                }
                String str = dVar.f6018g;
                a5.f fVar = dVar.f6020i;
                fVar.b();
                j5.b bVar6 = new j5.b(iVar2, dVar2, dVar3, bVar4, str, fVar.f501c.f513b, ((Context) dVar.b().f1069g).getApplicationContext().getDir("sslcache", 0).getAbsolutePath());
                b10.getClass();
                j5.n nVar2 = new j5.n(bVar6, s0Var, iVar);
                ((a5.f) b10.f1070h).a(new h5.c(nVar2));
                iVar.f6034c = nVar2;
                dVar.f6014c.a((o5.b) dVar.f6016e.f1230g, new m4.f());
                dVar.f6015d.a((o5.b) dVar.f6016e.f1230g, new j4.i(17));
                iVar.f6034c.m();
                n5.a aVar2 = new n5.a();
                l1.x xVar = new l1.x(4, false);
                xVar.f5847g = t5.k.f8908j;
                iVar.f6035d = xVar;
                iVar.f6036e = new m4.f();
                Object obj = null;
                iVar.f6037f = new b1.b(obj, obj, new o5.i(), 15);
                iVar.f6042k = new l.v(dVar, new n5.a(), new l5.h(iVar, 0));
                iVar.f6043l = new l.v(dVar, aVar2, new l5.h(iVar, 1));
                b1.b bVar7 = iVar.f6040i;
                List<l5.v> list = Collections.EMPTY_LIST;
                HashMap A = t6.a.A(iVar.f6033b);
                long j8 = Long.MIN_VALUE;
                for (l5.v vVar : list) {
                    c cVar = new c(20, iVar, vVar, false);
                    long j9 = vVar.f6081a;
                    l5.f fVar2 = vVar.f6082b;
                    if (j8 >= j9) {
                        throw new IllegalStateException("Write ids were not in order.");
                    }
                    if (vVar.c()) {
                        if (bVar7.v()) {
                            bVar7.d(a0.m.h(j9, "Restoring overwrite with id "), null, new Object[0]);
                        }
                        iVar.f6034c.e("p", fVar2.a(), vVar.b().r(true), null, cVar);
                        t5.s M = t6.a.M(vVar.b(), new c(iVar.f6043l, 21, fVar2), A);
                        l.v vVar2 = iVar.f6043l;
                        t5.s b11 = vVar.b();
                        long j10 = vVar.f6081a;
                        vVar2.getClass();
                        o5.j.b("We shouldn't be persisting non-visible writes.", true);
                        a3 = ((n5.a) vVar2.f5686g).a(new l5.q(vVar2, fVar2, b11, j10, M, 0));
                    } else {
                        if (bVar7.v()) {
                            bVar7.d(a0.m.h(j9, "Restoring merge with id "), null, new Object[0]);
                        }
                        iVar.f6034c.e("m", fVar2.a(), vVar.a().A(), null, cVar);
                        l5.b L = t6.a.L(vVar.a(), iVar.f6043l, fVar2, A);
                        l.v vVar3 = iVar.f6043l;
                        a3 = ((n5.a) vVar3.f5686g).a(new l5.q(vVar3, fVar2, vVar.a(), vVar.f6081a, L, 1));
                    }
                    j8 = j9;
                }
                t5.c cVar2 = l5.c.f6010c;
                Boolean bool = Boolean.FALSE;
                iVar.g(cVar2, bool);
                iVar.g(l5.c.f6011d, bool);
                return;
            case 6:
                ((n3.k) this.f1102g).l();
                throw null;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                s1.r rVar = (s1.r) this.f1102g;
                rVar.removeCallbacks(this);
                MotionEvent motionEvent = rVar.f8388r0;
                if (motionEvent != null) {
                    boolean z8 = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z8) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i7 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i7 = 2;
                    }
                    s1.r rVar2 = (s1.r) this.f1102g;
                    rVar2.F(motionEvent, i7, rVar2.f8390s0, false);
                    return;
                }
                return;
            case 8:
                u5.d dVar4 = (u5.d) this.f1102g;
                try {
                    try {
                        d8 = dVar4.d();
                    } finally {
                        dVar4.a();
                    }
                } catch (u5.e e11) {
                    dVar4.f9066c.w(e11);
                    dVar4.a();
                    return;
                } catch (Throwable th) {
                    dVar4.f9066c.w(new u5.e("error while connecting: " + th.getMessage(), th));
                    dVar4.a();
                    return;
                }
                synchronized (dVar4) {
                    dVar4.f9065b = d8;
                    if (dVar4.f9064a == 5) {
                        try {
                            dVar4.f9065b.close();
                            dVar4.f9065b = null;
                        } catch (IOException e12) {
                            throw new RuntimeException(e12);
                        }
                    } else {
                        DataInputStream dataInputStream = new DataInputStream(d8.getInputStream());
                        OutputStream outputStream = d8.getOutputStream();
                        outputStream.write(dVar4.f9071h.m());
                        byte[] bArr = new byte[1000];
                        ArrayList arrayList = new ArrayList();
                        boolean z9 = false;
                        int i8 = 0;
                        while (!z9) {
                            int read = dataInputStream.read();
                            if (read == -1) {
                                throw new u5.e("Connection closed before handshake was complete");
                            }
                            byte b12 = (byte) read;
                            bArr[i8] = b12;
                            int i9 = i8 + 1;
                            if (b12 == 10 && bArr[i8 - 1] == 13) {
                                String str2 = new String(bArr, u5.d.f9061m);
                                if (str2.trim().equals("")) {
                                    z9 = true;
                                } else {
                                    arrayList.add(str2.trim());
                                }
                                bArr = new byte[1000];
                                i8 = 0;
                            } else {
                                if (i9 == 1000) {
                                    throw new u5.e("Unexpected long line in handshake: " + new String(bArr, u5.d.f9061m));
                                }
                                i8 = i9;
                            }
                        }
                        b1.b bVar8 = dVar4.f9071h;
                        String str3 = (String) arrayList.get(0);
                        bVar8.getClass();
                        b1.b.H(str3);
                        arrayList.remove(0);
                        HashMap hashMap = new HashMap();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj2 = arrayList.get(i10);
                            i10++;
                            String[] split = ((String) obj2).split(": ", 2);
                            String str4 = split[0];
                            Locale locale = Locale.US;
                            hashMap.put(str4.toLowerCase(locale), split[1].toLowerCase(locale));
                        }
                        dVar4.f9071h.getClass();
                        b1.b.G(hashMap);
                        u5.g gVar = dVar4.f9070g;
                        gVar.getClass();
                        gVar.f9086f = Channels.newChannel(outputStream);
                        dVar4.f9069f.f9075a = dataInputStream;
                        dVar4.f9064a = 3;
                        dVar4.f9070g.f9087g.start();
                        c cVar3 = dVar4.f9066c;
                        ((j5.r) cVar3.f1070h).f5118i.execute(new j5.q(cVar3, 0));
                        dVar4.f9069f.c();
                    }
                    dVar4.a();
                    return;
                }
            case q.c.f7259c /* 9 */:
                u5.g gVar2 = (u5.g) this.f1102g;
                while (!gVar2.f9083c && !Thread.interrupted()) {
                    try {
                        gVar2.f9086f.write((ByteBuffer) gVar2.f9081a.take());
                    } catch (IOException e13) {
                        u5.e eVar = new u5.e("IO Exception", e13);
                        u5.d dVar5 = gVar2.f9085e;
                        dVar5.f9066c.w(eVar);
                        if (dVar5.f9064a == 3) {
                            dVar5.a();
                        }
                        dVar5.b();
                        return;
                    } catch (InterruptedException unused) {
                        return;
                    }
                }
                for (int i11 = 0; i11 < gVar2.f9081a.size(); i11++) {
                    gVar2.f9086f.write((ByteBuffer) gVar2.f9081a.take());
                }
                return;
            case q.c.f7261e /* 10 */:
                b();
                return;
            default:
                synchronized (((z4.f) this.f1102g).f10105c) {
                    z4.e eVar2 = (z4.e) ((z4.f) this.f1102g).f10106d;
                    synchronized (eVar2.f10095a) {
                        eVar2.f10100f++;
                        eVar2.f10102h = true;
                        eVar2.c();
                    }
                }
                return;
        }
    }

    public o(l4.h hVar, l.i iVar) {
        this.f1101f = 4;
        this.f1102g = iVar;
    }
}
