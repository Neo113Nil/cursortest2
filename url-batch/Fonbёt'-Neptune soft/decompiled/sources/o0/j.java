package o0;

import B0.C0023a;
import B0.C0031i;
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
import w0.InterfaceC0318d;
import w0.InterfaceC0319e;
import w0.InterfaceC0320f;

/* loaded from: classes.dex */
public final class j implements InterfaceC0320f, k {

    /* renamed from: e, reason: collision with root package name */
    public final FlutterJNI f3352e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f3353f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f3354g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f3355h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f3356i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f3357j;

    /* renamed from: k, reason: collision with root package name */
    public int f3358k;

    /* renamed from: l, reason: collision with root package name */
    public final l f3359l;

    /* renamed from: m, reason: collision with root package name */
    public final WeakHashMap f3360m;

    /* renamed from: n, reason: collision with root package name */
    public final n0.d f3361n;

    public j(FlutterJNI flutterJNI) {
        n0.d dVar = new n0.d(3);
        dVar.f3284f = (ExecutorService) C0031i.G().f156h;
        this.f3353f = new HashMap();
        this.f3354g = new HashMap();
        this.f3355h = new Object();
        this.f3356i = new AtomicBoolean(false);
        this.f3357j = new HashMap();
        this.f3358k = 1;
        this.f3359l = new l();
        this.f3360m = new WeakHashMap();
        this.f3352e = flutterJNI;
        this.f3361n = dVar;
    }

    @Override // w0.InterfaceC0320f
    public final void a(String str, InterfaceC0318d interfaceC0318d, C0023a c0023a) {
        e eVar;
        if (interfaceC0318d == null) {
            synchronized (this.f3355h) {
                this.f3353f.remove(str);
            }
            return;
        }
        if (c0023a != null) {
            eVar = (e) this.f3360m.get(c0023a);
            if (eVar == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            eVar = null;
        }
        synchronized (this.f3355h) {
            try {
                this.f3353f.put(str, new f(interfaceC0318d, eVar));
                List<d> list = (List) this.f3354g.remove(str);
                if (list == null) {
                    return;
                }
                for (d dVar : list) {
                    d(str, (f) this.f3353f.get(str), dVar.f3339a, dVar.f3340b, dVar.f3341c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // w0.InterfaceC0320f
    public final C0023a b() {
        n0.d dVar = this.f3361n;
        dVar.getClass();
        i iVar = new i((ExecutorService) dVar.f3284f);
        C0023a c0023a = new C0023a(27);
        this.f3360m.put(c0023a, iVar);
        return c0023a;
    }

    @Override // w0.InterfaceC0320f
    public final void c(String str, ByteBuffer byteBuffer, InterfaceC0319e interfaceC0319e) {
        E0.a.b("DartMessenger#send on " + str);
        try {
            int i2 = this.f3358k;
            this.f3358k = i2 + 1;
            if (interfaceC0319e != null) {
                this.f3357j.put(Integer.valueOf(i2), interfaceC0319e);
            }
            FlutterJNI flutterJNI = this.f3352e;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i2);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i2);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [o0.c] */
    public final void d(final String str, final f fVar, final ByteBuffer byteBuffer, final int i2, final long j2) {
        e eVar = fVar != null ? fVar.f3343b : null;
        String a2 = E0.a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            R.a.a(i1.a.H(a2), i2);
        } else {
            String H2 = i1.a.H(a2);
            try {
                if (i1.a.f2495g == null) {
                    i1.a.f2495g = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                i1.a.f2495g.invoke(null, Long.valueOf(i1.a.f2493e), H2, Integer.valueOf(i2));
            } catch (Exception e2) {
                i1.a.s("asyncTraceBegin", e2);
            }
        }
        ?? r02 = new Runnable() { // from class: o0.c
            @Override // java.lang.Runnable
            public final void run() {
                long j3 = j2;
                FlutterJNI flutterJNI = j.this.f3352e;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String a3 = E0.a.a(sb.toString());
                int i3 = Build.VERSION.SDK_INT;
                int i4 = i2;
                if (i3 >= 29) {
                    R.a.b(i1.a.H(a3), i4);
                } else {
                    String H3 = i1.a.H(a3);
                    try {
                        if (i1.a.f2496h == null) {
                            i1.a.f2496h = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        i1.a.f2496h.invoke(null, Long.valueOf(i1.a.f2493e), H3, Integer.valueOf(i4));
                    } catch (Exception e3) {
                        i1.a.s("asyncTraceEnd", e3);
                    }
                }
                try {
                    E0.a.b("DartMessenger#handleMessageFromDart on " + str2);
                    f fVar2 = fVar;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (fVar2 != null) {
                            try {
                                try {
                                    fVar2.f3342a.d(byteBuffer2, new g(flutterJNI, i4));
                                } catch (Error e4) {
                                    Thread currentThread = Thread.currentThread();
                                    if (currentThread.getUncaughtExceptionHandler() == null) {
                                        throw e4;
                                    }
                                    currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e4);
                                }
                            } catch (Exception e5) {
                                Log.e("DartMessenger", "Uncaught exception in binary message listener", e5);
                                flutterJNI.invokePlatformMessageEmptyResponseCallback(i4);
                            }
                        } else {
                            flutterJNI.invokePlatformMessageEmptyResponseCallback(i4);
                        }
                        if (byteBuffer2 != null && byteBuffer2.isDirect()) {
                            byteBuffer2.limit(0);
                        }
                        Trace.endSection();
                    } finally {
                    }
                } finally {
                    flutterJNI.cleanupMessageData(j3);
                }
            }
        };
        e eVar2 = eVar;
        if (eVar == null) {
            eVar2 = this.f3359l;
        }
        eVar2.a(r02);
    }

    public final C0023a e(w0.i iVar) {
        n0.d dVar = this.f3361n;
        dVar.getClass();
        i iVar2 = new i((ExecutorService) dVar.f3284f);
        C0023a c0023a = new C0023a(27);
        this.f3360m.put(c0023a, iVar2);
        return c0023a;
    }

    @Override // w0.InterfaceC0320f
    public final void f(String str, InterfaceC0318d interfaceC0318d) {
        a(str, interfaceC0318d, null);
    }
}
