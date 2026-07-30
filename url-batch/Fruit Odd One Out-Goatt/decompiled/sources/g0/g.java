package g0;

import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.util.Log;
import androidx.lifecycle.n;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class g implements n0.e, h {

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f354b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f355c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f356d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f357e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f358f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f359g;

    /* renamed from: h, reason: collision with root package name */
    public int f360h;

    /* renamed from: i, reason: collision with root package name */
    public final n f361i;

    public g(FlutterJNI flutterJNI) {
        c0.a.y().getClass();
        this.f355c = new HashMap();
        this.f356d = new HashMap();
        this.f357e = new Object();
        this.f358f = new AtomicBoolean(false);
        this.f359g = new HashMap();
        this.f360h = 1;
        this.f361i = new n();
        new WeakHashMap();
        this.f354b = flutterJNI;
    }

    public final void a(final String str, final e eVar, final ByteBuffer byteBuffer, final int i2, final long j2) {
        n nVar = eVar != null ? eVar.f350b : null;
        String a2 = s0.a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            q.a.a(a.a.D(a2), i2);
        } else {
            String D = a.a.D(a2);
            try {
                if (a.a.f2d == null) {
                    a.a.f2d = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                a.a.f2d.invoke(null, Long.valueOf(a.a.f0b), D, Integer.valueOf(i2));
            } catch (Exception e2) {
                a.a.l("asyncTraceBegin", e2);
            }
        }
        Runnable runnable = new Runnable() { // from class: g0.c
            @Override // java.lang.Runnable
            public final void run() {
                long j3 = j2;
                FlutterJNI flutterJNI = g.this.f354b;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String a3 = s0.a.a(sb.toString());
                int i3 = Build.VERSION.SDK_INT;
                int i4 = i2;
                if (i3 >= 29) {
                    q.a.b(a.a.D(a3), i4);
                } else {
                    String D2 = a.a.D(a3);
                    try {
                        if (a.a.f3e == null) {
                            a.a.f3e = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        a.a.f3e.invoke(null, Long.valueOf(a.a.f0b), D2, Integer.valueOf(i4));
                    } catch (Exception e3) {
                        a.a.l("asyncTraceEnd", e3);
                    }
                }
                try {
                    s0.a.b("DartMessenger#handleMessageFromDart on " + str2);
                    e eVar2 = eVar;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (eVar2 != null) {
                            try {
                                try {
                                    eVar2.f349a.n(byteBuffer2, new f(flutterJNI, i4));
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
        if (nVar == null) {
            nVar = this.f361i;
        }
        ((Handler) nVar.f40c).post(runnable);
    }

    public final void b(String str, n0.c cVar) {
        Object obj = this.f357e;
        if (cVar == null) {
            synchronized (obj) {
                this.f355c.remove(str);
            }
            return;
        }
        synchronized (obj) {
            try {
                this.f355c.put(str, new e(cVar, null));
                List<d> list = (List) this.f356d.remove(str);
                if (list == null) {
                    return;
                }
                for (d dVar : list) {
                    a(str, (e) this.f355c.get(str), dVar.f346a, dVar.f347b, dVar.f348c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n0.e
    public final void h(String str, n0.c cVar) {
        b(str, cVar);
    }

    @Override // n0.e
    public final void k(String str, ByteBuffer byteBuffer, n0.d dVar) {
        s0.a.b("DartMessenger#send on ".concat(str));
        try {
            int i2 = this.f360h;
            this.f360h = i2 + 1;
            if (dVar != null) {
                this.f359g.put(Integer.valueOf(i2), dVar);
            }
            FlutterJNI flutterJNI = this.f354b;
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
