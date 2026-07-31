package m0;

import B0.C0000a;
import B0.C0008i;
import B0.E;
import a.AbstractC0086a;
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
import v0.C0244i;
import v0.InterfaceC0239d;
import v0.InterfaceC0240e;
import v0.InterfaceC0241f;

/* loaded from: classes.dex */
public final class i implements InterfaceC0241f, j {

    /* renamed from: e, reason: collision with root package name */
    public final FlutterJNI f2880e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f2881f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f2882g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f2883h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f2884i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f2885j;

    /* renamed from: k, reason: collision with root package name */
    public int f2886k;

    /* renamed from: l, reason: collision with root package name */
    public final k f2887l;

    /* renamed from: m, reason: collision with root package name */
    public final WeakHashMap f2888m;

    /* renamed from: n, reason: collision with root package name */
    public final E f2889n;

    public i(FlutterJNI flutterJNI) {
        E e2 = new E(29, false);
        e2.f20f = (ExecutorService) C0008i.A().f86h;
        this.f2881f = new HashMap();
        this.f2882g = new HashMap();
        this.f2883h = new Object();
        this.f2884i = new AtomicBoolean(false);
        this.f2885j = new HashMap();
        this.f2886k = 1;
        this.f2887l = new k();
        this.f2888m = new WeakHashMap();
        this.f2880e = flutterJNI;
        this.f2889n = e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [m0.c] */
    public final void a(final String str, final f fVar, final ByteBuffer byteBuffer, final int i2, final long j2) {
        e eVar = fVar != null ? fVar.f2873b : null;
        String a2 = C0.a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            P.a.a(AbstractC0086a.J(a2), i2);
        } else {
            String J2 = AbstractC0086a.J(a2);
            try {
                if (AbstractC0086a.f1137c == null) {
                    AbstractC0086a.f1137c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                AbstractC0086a.f1137c.invoke(null, Long.valueOf(AbstractC0086a.f1135a), J2, Integer.valueOf(i2));
            } catch (Exception e2) {
                AbstractC0086a.u("asyncTraceBegin", e2);
            }
        }
        ?? r02 = new Runnable() { // from class: m0.c
            @Override // java.lang.Runnable
            public final void run() {
                long j3 = j2;
                FlutterJNI flutterJNI = i.this.f2880e;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String a3 = C0.a.a(sb.toString());
                int i3 = Build.VERSION.SDK_INT;
                int i4 = i2;
                if (i3 >= 29) {
                    P.a.b(AbstractC0086a.J(a3), i4);
                } else {
                    String J3 = AbstractC0086a.J(a3);
                    try {
                        if (AbstractC0086a.f1138d == null) {
                            AbstractC0086a.f1138d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        AbstractC0086a.f1138d.invoke(null, Long.valueOf(AbstractC0086a.f1135a), J3, Integer.valueOf(i4));
                    } catch (Exception e3) {
                        AbstractC0086a.u("asyncTraceEnd", e3);
                    }
                }
                try {
                    C0.a.b("DartMessenger#handleMessageFromDart on " + str2);
                    f fVar2 = fVar;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (fVar2 != null) {
                            try {
                                try {
                                    fVar2.f2872a.p(byteBuffer2, new g(flutterJNI, i4));
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
            eVar2 = this.f2887l;
        }
        eVar2.a(r02);
    }

    @Override // v0.InterfaceC0241f
    public final void e(String str, ByteBuffer byteBuffer, InterfaceC0240e interfaceC0240e) {
        C0.a.b("DartMessenger#send on " + str);
        try {
            int i2 = this.f2886k;
            this.f2886k = i2 + 1;
            if (interfaceC0240e != null) {
                this.f2885j.put(Integer.valueOf(i2), interfaceC0240e);
            }
            FlutterJNI flutterJNI = this.f2880e;
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

    @Override // v0.InterfaceC0241f
    public final C0000a g(C0244i c0244i) {
        E e2 = this.f2889n;
        e2.getClass();
        h hVar = new h((ExecutorService) e2.f20f);
        C0000a c0000a = new C0000a(26);
        this.f2888m.put(c0000a, hVar);
        return c0000a;
    }

    @Override // v0.InterfaceC0241f
    public final void h(String str, InterfaceC0239d interfaceC0239d) {
        v(str, interfaceC0239d, null);
    }

    @Override // v0.InterfaceC0241f
    public final void v(String str, InterfaceC0239d interfaceC0239d, C0000a c0000a) {
        e eVar;
        if (interfaceC0239d == null) {
            synchronized (this.f2883h) {
                this.f2881f.remove(str);
            }
            return;
        }
        if (c0000a != null) {
            eVar = (e) this.f2888m.get(c0000a);
            if (eVar == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            eVar = null;
        }
        synchronized (this.f2883h) {
            try {
                this.f2881f.put(str, new f(interfaceC0239d, eVar));
                List<d> list = (List) this.f2882g.remove(str);
                if (list == null) {
                    return;
                }
                for (d dVar : list) {
                    a(str, (f) this.f2881f.get(str), dVar.f2869a, dVar.f2870b, dVar.f2871c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
