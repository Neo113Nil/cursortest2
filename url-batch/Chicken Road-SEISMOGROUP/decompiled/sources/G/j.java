package G;

import a.AbstractC0016a;
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
import o.AbstractC0083a;

/* loaded from: classes.dex */
public final class j implements N.f, k {

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f300b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f301c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f302d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f303e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f304f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f305g;

    /* renamed from: h, reason: collision with root package name */
    public int f306h;

    /* renamed from: i, reason: collision with root package name */
    public final l f307i;

    /* renamed from: j, reason: collision with root package name */
    public final WeakHashMap f308j;

    /* renamed from: k, reason: collision with root package name */
    public final B.k f309k;

    public j(FlutterJNI flutterJNI) {
        B.k kVar = new B.k();
        kVar.f44c = (ExecutorService) D.b.e().f101c;
        this.f301c = new HashMap();
        this.f302d = new HashMap();
        this.f303e = new Object();
        this.f304f = new AtomicBoolean(false);
        this.f305g = new HashMap();
        this.f306h = 1;
        this.f307i = new l();
        this.f308j = new WeakHashMap();
        this.f300b = flutterJNI;
        this.f309k = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [G.c] */
    public final void a(final String str, final f fVar, final ByteBuffer byteBuffer, final int i2, final long j2) {
        e eVar = fVar != null ? fVar.f291b : null;
        String a2 = T.a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0083a.a(AbstractC0016a.E(a2), i2);
        } else {
            String E2 = AbstractC0016a.E(a2);
            try {
                if (AbstractC0016a.f462e == null) {
                    AbstractC0016a.f462e = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                AbstractC0016a.f462e.invoke(null, Long.valueOf(AbstractC0016a.f460c), E2, Integer.valueOf(i2));
            } catch (Exception e2) {
                AbstractC0016a.r("asyncTraceBegin", e2);
            }
        }
        ?? r0 = new Runnable() { // from class: G.c
            @Override // java.lang.Runnable
            public final void run() {
                long j3 = j2;
                FlutterJNI flutterJNI = j.this.f300b;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String a3 = T.a.a(sb.toString());
                int i3 = Build.VERSION.SDK_INT;
                int i4 = i2;
                if (i3 >= 29) {
                    AbstractC0083a.b(AbstractC0016a.E(a3), i4);
                } else {
                    String E3 = AbstractC0016a.E(a3);
                    try {
                        if (AbstractC0016a.f463f == null) {
                            AbstractC0016a.f463f = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        AbstractC0016a.f463f.invoke(null, Long.valueOf(AbstractC0016a.f460c), E3, Integer.valueOf(i4));
                    } catch (Exception e3) {
                        AbstractC0016a.r("asyncTraceEnd", e3);
                    }
                }
                try {
                    T.a.b("DartMessenger#handleMessageFromDart on " + str2);
                    f fVar2 = fVar;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (fVar2 != null) {
                            try {
                                try {
                                    fVar2.f290a.a(byteBuffer2, new g(flutterJNI, i4));
                                } catch (Exception e4) {
                                    Log.e("DartMessenger", "Uncaught exception in binary message listener", e4);
                                    flutterJNI.invokePlatformMessageEmptyResponseCallback(i4);
                                }
                            } catch (Error e5) {
                                Thread currentThread = Thread.currentThread();
                                if (currentThread.getUncaughtExceptionHandler() == null) {
                                    throw e5;
                                }
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e5);
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
            eVar2 = this.f307i;
        }
        eVar2.a(r0);
    }

    @Override // N.f
    public final void d(String str, N.d dVar) {
        h(str, dVar, null);
    }

    @Override // N.f
    public final A.b e(N.h hVar) {
        B.k kVar = this.f309k;
        kVar.getClass();
        i iVar = new i((ExecutorService) kVar.f44c);
        A.b bVar = new A.b(3);
        this.f308j.put(bVar, iVar);
        return bVar;
    }

    @Override // N.f
    public final void h(String str, N.d dVar, A.b bVar) {
        e eVar;
        if (dVar == null) {
            synchronized (this.f303e) {
                this.f301c.remove(str);
            }
            return;
        }
        if (bVar != null) {
            eVar = (e) this.f308j.get(bVar);
            if (eVar == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            eVar = null;
        }
        synchronized (this.f303e) {
            try {
                this.f301c.put(str, new f(dVar, eVar));
                List<d> list = (List) this.f302d.remove(str);
                if (list == null) {
                    return;
                }
                for (d dVar2 : list) {
                    a(str, (f) this.f301c.get(str), dVar2.f287a, dVar2.f288b, dVar2.f289c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // N.f
    public final void i(String str, ByteBuffer byteBuffer, N.e eVar) {
        T.a.b("DartMessenger#send on " + str);
        try {
            int i2 = this.f306h;
            this.f306h = i2 + 1;
            if (eVar != null) {
                this.f305g.put(Integer.valueOf(i2), eVar);
            }
            FlutterJNI flutterJNI = this.f300b;
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
}
