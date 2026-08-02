package G1;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class i implements P1.f, j {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f555a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f556b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f557c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f558d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f559e;
    public final HashMap f;

    /* renamed from: g, reason: collision with root package name */
    public int f560g;

    /* renamed from: h, reason: collision with root package name */
    public final k f561h;

    /* renamed from: i, reason: collision with root package name */
    public final WeakHashMap f562i;

    /* renamed from: j, reason: collision with root package name */
    public final C0.e f563j;

    public i(FlutterJNI flutterJNI) {
        C0.e eVar = new C0.e(5);
        eVar.f201b = (ExecutorService) A0.f.H().f25d;
        this.f556b = new HashMap();
        this.f557c = new HashMap();
        this.f558d = new Object();
        this.f559e = new AtomicBoolean(false);
        this.f = new HashMap();
        this.f560g = 1;
        this.f561h = new k();
        this.f562i = new WeakHashMap();
        this.f555a = flutterJNI;
        this.f563j = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [G1.c] */
    public final void a(final String str, final f fVar, final ByteBuffer byteBuffer, final int i3, final long j3) {
        e eVar = fVar != null ? fVar.f548b : null;
        String a3 = Z1.a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            X.a.a(i3, S0.a.N(a3));
        } else {
            String N2 = S0.a.N(a3);
            try {
                if (S0.a.f == null) {
                    S0.a.f = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                S0.a.f.invoke(null, Long.valueOf(S0.a.f1329d), N2, Integer.valueOf(i3));
            } catch (Exception e3) {
                S0.a.r("asyncTraceBegin", e3);
            }
        }
        ?? r02 = new Runnable() { // from class: G1.c
            @Override // java.lang.Runnable
            public final void run() {
                long j4 = j3;
                FlutterJNI flutterJNI = i.this.f555a;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String a4 = Z1.a.a(sb.toString());
                int i4 = Build.VERSION.SDK_INT;
                int i5 = i3;
                if (i4 >= 29) {
                    X.a.b(i5, S0.a.N(a4));
                } else {
                    String N3 = S0.a.N(a4);
                    try {
                        if (S0.a.f1331g == null) {
                            S0.a.f1331g = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        S0.a.f1331g.invoke(null, Long.valueOf(S0.a.f1329d), N3, Integer.valueOf(i5));
                    } catch (Exception e4) {
                        S0.a.r("asyncTraceEnd", e4);
                    }
                }
                try {
                    Z1.a.b("DartMessenger#handleMessageFromDart on " + str2);
                    f fVar2 = fVar;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (fVar2 != null) {
                            try {
                                try {
                                    fVar2.f547a.d(byteBuffer2, new g(flutterJNI, i5));
                                } catch (Exception e5) {
                                    Log.e("DartMessenger", "Uncaught exception in binary message listener", e5);
                                    flutterJNI.invokePlatformMessageEmptyResponseCallback(i5);
                                }
                            } catch (Error e6) {
                                Thread currentThread = Thread.currentThread();
                                if (currentThread.getUncaughtExceptionHandler() == null) {
                                    throw e6;
                                }
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e6);
                            }
                        } else {
                            flutterJNI.invokePlatformMessageEmptyResponseCallback(i5);
                        }
                        if (byteBuffer2 != null && byteBuffer2.isDirect()) {
                            byteBuffer2.limit(0);
                        }
                        Trace.endSection();
                    } finally {
                    }
                } finally {
                    flutterJNI.cleanupMessageData(j4);
                }
            }
        };
        e eVar2 = eVar;
        if (eVar == null) {
            eVar2 = this.f561h;
        }
        eVar2.a(r02);
    }

    @Override // P1.f
    public final void b(String str, P1.d dVar) {
        d(str, dVar, null);
    }

    @Override // P1.f
    public final void d(String str, P1.d dVar, K0.j jVar) {
        e eVar;
        if (dVar == null) {
            synchronized (this.f558d) {
                this.f556b.remove(str);
            }
            return;
        }
        if (jVar != null) {
            eVar = (e) this.f562i.get(jVar);
            if (eVar == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            eVar = null;
        }
        synchronized (this.f558d) {
            try {
                this.f556b.put(str, new f(dVar, eVar));
                List<d> list = (List) this.f557c.remove(str);
                if (list == null) {
                    return;
                }
                for (d dVar2 : list) {
                    a(str, (f) this.f556b.get(str), dVar2.f544a, dVar2.f545b, dVar2.f546c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // P1.f
    public final K0.j e(P1.j jVar) {
        C0.e eVar = this.f563j;
        eVar.getClass();
        h hVar = new h((ExecutorService) eVar.f201b);
        K0.j jVar2 = new K0.j(6);
        this.f562i.put(jVar2, hVar);
        return jVar2;
    }

    @Override // P1.f
    public final void k(String str, ByteBuffer byteBuffer) {
        q(str, byteBuffer, null);
    }

    @Override // P1.f
    public final void q(String str, ByteBuffer byteBuffer, P1.e eVar) {
        Z1.a.b("DartMessenger#send on " + str);
        try {
            int i3 = this.f560g;
            this.f560g = i3 + 1;
            if (eVar != null) {
                this.f.put(Integer.valueOf(i3), eVar);
            }
            FlutterJNI flutterJNI = this.f555a;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i3);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i3);
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
