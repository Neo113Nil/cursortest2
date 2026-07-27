package y2;

import a.AbstractC0169a;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import f0.AbstractC0415a;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: y2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1564i implements H2.f, InterfaceC1565j {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f12369a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f12370b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f12371c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12372d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f12373e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f12374f;

    /* renamed from: g, reason: collision with root package name */
    public int f12375g;

    /* renamed from: h, reason: collision with root package name */
    public final C1566k f12376h;

    /* renamed from: i, reason: collision with root package name */
    public final WeakHashMap f12377i;

    /* renamed from: j, reason: collision with root package name */
    public final U.e f12378j;

    public C1564i(FlutterJNI flutterJNI) {
        U.e eVar = new U.e();
        eVar.f3053a = (ExecutorService) B4.i.K().f313d;
        this.f12370b = new HashMap();
        this.f12371c = new HashMap();
        this.f12372d = new Object();
        this.f12373e = new AtomicBoolean(false);
        this.f12374f = new HashMap();
        this.f12375g = 1;
        this.f12376h = new C1566k();
        this.f12377i = new WeakHashMap();
        this.f12369a = flutterJNI;
        this.f12378j = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [y2.c] */
    public final void a(final String str, final C1561f c1561f, final ByteBuffer byteBuffer, final int i2, final long j2) {
        InterfaceC1560e interfaceC1560e = c1561f != null ? c1561f.f12362b : null;
        String a6 = O2.a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0415a.a(i2, AbstractC0169a.I(a6));
        } else {
            String I5 = AbstractC0169a.I(a6);
            try {
                if (AbstractC0169a.f3818e == null) {
                    AbstractC0169a.f3818e = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                AbstractC0169a.f3818e.invoke(null, Long.valueOf(AbstractC0169a.f3816c), I5, Integer.valueOf(i2));
            } catch (Exception e3) {
                AbstractC0169a.t("asyncTraceBegin", e3);
            }
        }
        ?? r0 = new Runnable() { // from class: y2.c
            @Override // java.lang.Runnable
            public final void run() {
                long j6 = j2;
                FlutterJNI flutterJNI = C1564i.this.f12369a;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String a7 = O2.a.a(sb.toString());
                int i3 = Build.VERSION.SDK_INT;
                int i6 = i2;
                if (i3 >= 29) {
                    AbstractC0415a.b(i6, AbstractC0169a.I(a7));
                } else {
                    String I6 = AbstractC0169a.I(a7);
                    try {
                        if (AbstractC0169a.f3819f == null) {
                            AbstractC0169a.f3819f = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        AbstractC0169a.f3819f.invoke(null, Long.valueOf(AbstractC0169a.f3816c), I6, Integer.valueOf(i6));
                    } catch (Exception e6) {
                        AbstractC0169a.t("asyncTraceEnd", e6);
                    }
                }
                try {
                    O2.a.b("DartMessenger#handleMessageFromDart on " + str2);
                    C1561f c1561f2 = c1561f;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (c1561f2 != null) {
                            try {
                                try {
                                    c1561f2.f12361a.l(byteBuffer2, new C1562g(flutterJNI, i6));
                                } catch (Exception e7) {
                                    Log.e("DartMessenger", "Uncaught exception in binary message listener", e7);
                                    flutterJNI.invokePlatformMessageEmptyResponseCallback(i6);
                                }
                            } catch (Error e8) {
                                Thread currentThread = Thread.currentThread();
                                if (currentThread.getUncaughtExceptionHandler() == null) {
                                    throw e8;
                                }
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e8);
                            }
                        } else {
                            flutterJNI.invokePlatformMessageEmptyResponseCallback(i6);
                        }
                        if (byteBuffer2 != null && byteBuffer2.isDirect()) {
                            byteBuffer2.limit(0);
                        }
                        Trace.endSection();
                    } finally {
                    }
                } finally {
                    flutterJNI.cleanupMessageData(j6);
                }
            }
        };
        InterfaceC1560e interfaceC1560e2 = interfaceC1560e;
        if (interfaceC1560e == null) {
            interfaceC1560e2 = this.f12376h;
        }
        interfaceC1560e2.a(r0);
    }

    @Override // H2.f
    public final s0.k d(H2.j jVar) {
        U.e eVar = this.f12378j;
        eVar.getClass();
        C1563h c1563h = new C1563h((ExecutorService) eVar.f3053a);
        s0.k kVar = new s0.k();
        this.f12377i.put(kVar, c1563h);
        return kVar;
    }

    @Override // H2.f
    public final void i(String str, H2.d dVar) {
        u(str, dVar, null);
    }

    @Override // H2.f
    public final void o(String str, ByteBuffer byteBuffer) {
        w(str, byteBuffer, null);
    }

    @Override // H2.f
    public final void u(String str, H2.d dVar, s0.k kVar) {
        InterfaceC1560e interfaceC1560e;
        if (dVar == null) {
            synchronized (this.f12372d) {
                this.f12370b.remove(str);
            }
            return;
        }
        if (kVar != null) {
            interfaceC1560e = (InterfaceC1560e) this.f12377i.get(kVar);
            if (interfaceC1560e == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            interfaceC1560e = null;
        }
        synchronized (this.f12372d) {
            try {
                this.f12370b.put(str, new C1561f(dVar, interfaceC1560e));
                List<C1559d> list = (List) this.f12371c.remove(str);
                if (list == null) {
                    return;
                }
                for (C1559d c1559d : list) {
                    a(str, (C1561f) this.f12370b.get(str), c1559d.f12358a, c1559d.f12359b, c1559d.f12360c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H2.f
    public final void w(String str, ByteBuffer byteBuffer, H2.e eVar) {
        O2.a.b("DartMessenger#send on " + str);
        try {
            int i2 = this.f12375g;
            this.f12375g = i2 + 1;
            if (eVar != null) {
                this.f12374f.put(Integer.valueOf(i2), eVar);
            }
            FlutterJNI flutterJNI = this.f12369a;
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
