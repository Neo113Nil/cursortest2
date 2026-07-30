package j4;

import a.AbstractC0169a;
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
import q0.AbstractC0831a;
import s4.l;

/* renamed from: j4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0580i implements s4.f, InterfaceC0581j {

    /* renamed from: d, reason: collision with root package name */
    public final FlutterJNI f5978d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f5979e;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f5980i;

    /* renamed from: l, reason: collision with root package name */
    public final Object f5981l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f5982m;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f5983n;

    /* renamed from: o, reason: collision with root package name */
    public int f5984o;

    /* renamed from: p, reason: collision with root package name */
    public final C0582k f5985p;

    /* renamed from: q, reason: collision with root package name */
    public final WeakHashMap f5986q;

    /* renamed from: r, reason: collision with root package name */
    public final B.f f5987r;

    public C0580i(FlutterJNI flutterJNI) {
        B.f fVar = new B.f(29, false);
        fVar.f152e = (ExecutorService) D0.j.Q().f332l;
        this.f5979e = new HashMap();
        this.f5980i = new HashMap();
        this.f5981l = new Object();
        this.f5982m = new AtomicBoolean(false);
        this.f5983n = new HashMap();
        this.f5984o = 1;
        this.f5985p = new C0582k();
        this.f5986q = new WeakHashMap();
        this.f5978d = flutterJNI;
        this.f5987r = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [j4.c] */
    public final void a(final String str, final C0577f c0577f, final ByteBuffer byteBuffer, final int i2, final long j) {
        InterfaceC0576e interfaceC0576e = c0577f != null ? c0577f.f5971b : null;
        String a7 = A4.a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0831a.a(i2, AbstractC0169a.G(a7));
        } else {
            String G4 = AbstractC0169a.G(a7);
            try {
                if (AbstractC0169a.f3036g == null) {
                    AbstractC0169a.f3036g = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                AbstractC0169a.f3036g.invoke(null, Long.valueOf(AbstractC0169a.f3034e), G4, Integer.valueOf(i2));
            } catch (Exception e7) {
                AbstractC0169a.n("asyncTraceBegin", e7);
            }
        }
        ?? r0 = new Runnable() { // from class: j4.c
            @Override // java.lang.Runnable
            public final void run() {
                long j7 = j;
                FlutterJNI flutterJNI = C0580i.this.f5978d;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String a8 = A4.a.a(sb.toString());
                int i5 = Build.VERSION.SDK_INT;
                int i7 = i2;
                if (i5 >= 29) {
                    AbstractC0831a.b(i7, AbstractC0169a.G(a8));
                } else {
                    String G7 = AbstractC0169a.G(a8);
                    try {
                        if (AbstractC0169a.f3037h == null) {
                            AbstractC0169a.f3037h = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        AbstractC0169a.f3037h.invoke(null, Long.valueOf(AbstractC0169a.f3034e), G7, Integer.valueOf(i7));
                    } catch (Exception e8) {
                        AbstractC0169a.n("asyncTraceEnd", e8);
                    }
                }
                try {
                    A4.a.d("DartMessenger#handleMessageFromDart on " + str2);
                    C0577f c0577f2 = c0577f;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (c0577f2 != null) {
                            try {
                                try {
                                    c0577f2.f5970a.g(byteBuffer2, new C0578g(flutterJNI, i7));
                                } catch (Exception e9) {
                                    Log.e("DartMessenger", "Uncaught exception in binary message listener", e9);
                                    flutterJNI.invokePlatformMessageEmptyResponseCallback(i7);
                                }
                            } catch (Error e10) {
                                Thread currentThread = Thread.currentThread();
                                if (currentThread.getUncaughtExceptionHandler() == null) {
                                    throw e10;
                                }
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e10);
                            }
                        } else {
                            flutterJNI.invokePlatformMessageEmptyResponseCallback(i7);
                        }
                        if (byteBuffer2 != null && byteBuffer2.isDirect()) {
                            byteBuffer2.limit(0);
                        }
                        Trace.endSection();
                    } finally {
                    }
                } finally {
                    flutterJNI.cleanupMessageData(j7);
                }
            }
        };
        InterfaceC0576e interfaceC0576e2 = interfaceC0576e;
        if (interfaceC0576e == null) {
            interfaceC0576e2 = this.f5985p;
        }
        interfaceC0576e2.a(r0);
    }

    @Override // s4.f
    public final q1.h b(l lVar) {
        B.f fVar = this.f5987r;
        fVar.getClass();
        C0579h c0579h = new C0579h((ExecutorService) fVar.f152e);
        q1.h hVar = new q1.h(23);
        this.f5986q.put(hVar, c0579h);
        return hVar;
    }

    @Override // s4.f
    public final void f(String str, ByteBuffer byteBuffer, s4.e eVar) {
        A4.a.d("DartMessenger#send on " + str);
        try {
            int i2 = this.f5984o;
            this.f5984o = i2 + 1;
            if (eVar != null) {
                this.f5983n.put(Integer.valueOf(i2), eVar);
            }
            FlutterJNI flutterJNI = this.f5978d;
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

    @Override // s4.f
    public final void h(String str, s4.d dVar, q1.h hVar) {
        InterfaceC0576e interfaceC0576e;
        if (dVar == null) {
            synchronized (this.f5981l) {
                this.f5979e.remove(str);
            }
            return;
        }
        if (hVar != null) {
            interfaceC0576e = (InterfaceC0576e) this.f5986q.get(hVar);
            if (interfaceC0576e == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            interfaceC0576e = null;
        }
        synchronized (this.f5981l) {
            try {
                this.f5979e.put(str, new C0577f(dVar, interfaceC0576e));
                List<C0575d> list = (List) this.f5980i.remove(str);
                if (list == null) {
                    return;
                }
                for (C0575d c0575d : list) {
                    a(str, (C0577f) this.f5979e.get(str), c0575d.f5967a, c0575d.f5968b, c0575d.f5969c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // s4.f
    public final void k(String str, ByteBuffer byteBuffer) {
        f(str, byteBuffer, null);
    }

    @Override // s4.f
    public final void n(String str, s4.d dVar) {
        h(str, dVar, null);
    }
}
