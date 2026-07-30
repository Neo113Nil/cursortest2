package e0;

import L.C0026b;
import a.AbstractC0069a;
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
import n0.InterfaceC0212d;
import t0.AbstractC0236a;

/* renamed from: e0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121i implements n0.f, InterfaceC0122j {

    /* renamed from: e, reason: collision with root package name */
    public final FlutterJNI f1874e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f1875f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f1876g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1877h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f1878i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f1879j;

    /* renamed from: k, reason: collision with root package name */
    public int f1880k;

    /* renamed from: l, reason: collision with root package name */
    public final C0123k f1881l;

    /* renamed from: m, reason: collision with root package name */
    public final WeakHashMap f1882m;

    /* renamed from: n, reason: collision with root package name */
    public final A.j f1883n;

    public C0121i(FlutterJNI flutterJNI) {
        A.j jVar = new A.j(18, false);
        jVar.f30f = (ExecutorService) C0026b.C().f522h;
        this.f1875f = new HashMap();
        this.f1876g = new HashMap();
        this.f1877h = new Object();
        this.f1878i = new AtomicBoolean(false);
        this.f1879j = new HashMap();
        this.f1880k = 1;
        this.f1881l = new C0123k();
        this.f1882m = new WeakHashMap();
        this.f1874e = flutterJNI;
        this.f1883n = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [e0.c] */
    public final void a(final String str, final C0118f c0118f, final ByteBuffer byteBuffer, final int i2, final long j2) {
        InterfaceC0117e interfaceC0117e = c0118f != null ? c0118f.f1867b : null;
        String a2 = AbstractC0236a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            N.a.a(AbstractC0069a.K(a2), i2);
        } else {
            String K2 = AbstractC0069a.K(a2);
            try {
                if (AbstractC0069a.f1084g == null) {
                    AbstractC0069a.f1084g = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                AbstractC0069a.f1084g.invoke(null, Long.valueOf(AbstractC0069a.f1082e), K2, Integer.valueOf(i2));
            } catch (Exception e2) {
                AbstractC0069a.r("asyncTraceBegin", e2);
            }
        }
        ?? r02 = new Runnable() { // from class: e0.c
            @Override // java.lang.Runnable
            public final void run() {
                long j3 = j2;
                FlutterJNI flutterJNI = C0121i.this.f1874e;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String a3 = AbstractC0236a.a(sb.toString());
                int i3 = Build.VERSION.SDK_INT;
                int i4 = i2;
                if (i3 >= 29) {
                    N.a.b(AbstractC0069a.K(a3), i4);
                } else {
                    String K3 = AbstractC0069a.K(a3);
                    try {
                        if (AbstractC0069a.f1085h == null) {
                            AbstractC0069a.f1085h = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        AbstractC0069a.f1085h.invoke(null, Long.valueOf(AbstractC0069a.f1082e), K3, Integer.valueOf(i4));
                    } catch (Exception e3) {
                        AbstractC0069a.r("asyncTraceEnd", e3);
                    }
                }
                try {
                    AbstractC0236a.b("DartMessenger#handleMessageFromDart on " + str2);
                    C0118f c0118f2 = c0118f;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (c0118f2 != null) {
                            try {
                                try {
                                    c0118f2.f1866a.p(byteBuffer2, new C0119g(flutterJNI, i4));
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
        InterfaceC0117e interfaceC0117e2 = interfaceC0117e;
        if (interfaceC0117e == null) {
            interfaceC0117e2 = this.f1881l;
        }
        interfaceC0117e2.a(r02);
    }

    @Override // n0.f
    public final void b(String str, InterfaceC0212d interfaceC0212d, E.a aVar) {
        InterfaceC0117e interfaceC0117e;
        if (interfaceC0212d == null) {
            synchronized (this.f1877h) {
                this.f1875f.remove(str);
            }
            return;
        }
        if (aVar != null) {
            interfaceC0117e = (InterfaceC0117e) this.f1882m.get(aVar);
            if (interfaceC0117e == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            interfaceC0117e = null;
        }
        synchronized (this.f1877h) {
            try {
                this.f1875f.put(str, new C0118f(interfaceC0212d, interfaceC0117e));
                List<C0116d> list = (List) this.f1876g.remove(str);
                if (list == null) {
                    return;
                }
                for (C0116d c0116d : list) {
                    a(str, (C0118f) this.f1875f.get(str), c0116d.f1863a, c0116d.f1864b, c0116d.f1865c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n0.f
    public final void c(String str, InterfaceC0212d interfaceC0212d) {
        b(str, interfaceC0212d, null);
    }

    @Override // n0.f
    public final void l(String str, ByteBuffer byteBuffer, n0.e eVar) {
        AbstractC0236a.b("DartMessenger#send on " + str);
        try {
            int i2 = this.f1880k;
            this.f1880k = i2 + 1;
            if (eVar != null) {
                this.f1879j.put(Integer.valueOf(i2), eVar);
            }
            FlutterJNI flutterJNI = this.f1874e;
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

    @Override // n0.f
    public final E.a o(n0.i iVar) {
        A.j jVar = this.f1883n;
        jVar.getClass();
        C0120h c0120h = new C0120h((ExecutorService) jVar.f30f);
        E.a aVar = new E.a(16);
        this.f1882m.put(aVar, c0120h);
        return aVar;
    }
}
