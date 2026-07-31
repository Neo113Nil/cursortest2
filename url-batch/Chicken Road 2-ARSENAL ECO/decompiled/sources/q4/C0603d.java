package q4;

import K0.h;
import V5.g;
import j5.InterfaceC0438a;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.time.Clock;
import java.time.Instant;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import l4.C0495a;
import l4.C0496b;
import r4.C0618a;
import r4.C0619b;
import u0.AbstractC0676f;
import w4.C0721a;
import w4.C0722b;

/* renamed from: q4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0603d implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5800f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5801g;

    /* renamed from: h, reason: collision with root package name */
    public Object f5802h;

    /* renamed from: i, reason: collision with root package name */
    public Object f5803i;

    /* renamed from: j, reason: collision with root package name */
    public Object f5804j;

    /* renamed from: k, reason: collision with root package name */
    public Object f5805k;

    /* renamed from: l, reason: collision with root package name */
    public Object f5806l;

    public /* synthetic */ C0603d() {
        this.f5800f = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0602c a(C0496b c0496b, int i7) {
        byte[] a7;
        if (((AtomicBoolean) this.f5803i).get()) {
            ((Logger) this.f5801g).fine("Refusing to read from storage after being closed.");
            return null;
        }
        if (i7 > 3) {
            ((Logger) this.f5801g).log(Level.WARNING, "Maximum number of attempts to read buffered data exceeded.");
            return null;
        }
        C0618a c0618a = (C0618a) ((AtomicReference) this.f5806l).get();
        if (c0618a == null) {
            ((Logger) this.f5801g).finer("Obtaining a new readableFile from the folderManager.");
            C0601b c0601b = (C0601b) this.f5802h;
            synchronized (c0601b) {
                c0601b.f5793h = null;
                File a8 = c0601b.a();
                if (a8 != null) {
                    C0618a c0618a2 = new C0618a(a8, Long.parseLong(a8.getName()), c0601b.f5792g);
                    c0601b.f5793h = c0618a2;
                    c0618a = c0618a2;
                } else {
                    c0618a = null;
                }
            }
            ((AtomicReference) this.f5806l).set(c0618a);
            if (c0618a == null) {
                ((Logger) this.f5801g).fine("Unable to get or create readable file.");
                return null;
            }
        }
        ((Logger) this.f5801g).finer("Attempting to read data from " + c0618a);
        synchronized (c0618a) {
            if (!c0618a.f5853k.get()) {
                synchronized (c0618a) {
                    boolean z5 = TimeUnit.NANOSECONDS.toMillis(c0618a.f5851i.a(true)) >= c0618a.f5852j;
                    if (z5) {
                        c0618a.close();
                    } else {
                        a7 = c0618a.f5850h.a();
                        if (a7 == null) {
                            c0618a.a();
                        }
                    }
                }
                if (a7 != null) {
                    try {
                        c0496b.getClass();
                        try {
                            C0721a c0721a = C0722b.f6196i;
                            c0721a.getClass();
                            ArrayList h7 = AbstractC0676f.h((C0722b) c0721a.c(new z3.a(a7.length, a7)));
                            ((AtomicBoolean) this.f5804j).set(true);
                            return new C0602c(this, h7, c0618a);
                        } catch (IOException e4) {
                            e = e4;
                            throw new C0495a(e);
                        } catch (IllegalStateException e7) {
                            e = e7;
                            throw new C0495a(e);
                        }
                    } catch (C0495a unused) {
                        c0618a.a();
                    }
                }
                ((AtomicReference) this.f5806l).set(null);
                return a(c0496b, i7 + 1);
            }
        }
        a7 = null;
        if (a7 != null) {
        }
        ((AtomicReference) this.f5806l).set(null);
        return a(c0496b, i7 + 1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f5800f) {
            case 0:
                ((Logger) this.f5801g).fine("Closing disk buffering storage.");
                if (((AtomicBoolean) this.f5803i).compareAndSet(false, true)) {
                    ((C0601b) this.f5802h).close();
                    ((AtomicReference) this.f5805k).set(null);
                    ((AtomicReference) this.f5806l).set(null);
                    break;
                }
                break;
            default:
                ((h) ((K0.d) ((InterfaceC0438a) this.f5805k).get())).close();
                break;
        }
    }

    public boolean d(g gVar, int i7) {
        Clock systemUTC;
        Instant instant;
        long epochSecond;
        int nano;
        C0619b c0619b;
        if (((AtomicBoolean) this.f5803i).get()) {
            ((Logger) this.f5801g).fine("Refusing to write to storage after being closed.");
            return false;
        }
        if (i7 > 3) {
            ((Logger) this.f5801g).log(Level.WARNING, "Max number of attempts to write buffered data exceeded.");
            return false;
        }
        C0619b c0619b2 = (C0619b) ((AtomicReference) this.f5805k).get();
        if (c0619b2 == null) {
            C0601b c0601b = (C0601b) this.f5802h;
            synchronized (c0601b) {
                try {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    systemUTC = Clock.systemUTC();
                    instant = systemUTC.instant();
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    epochSecond = instant.getEpochSecond();
                    long nanos = timeUnit2.toNanos(epochSecond);
                    nano = instant.getNano();
                    long millis = timeUnit.toMillis(nanos + nano);
                    File[] listFiles = c0601b.f5791f.listFiles();
                    if (listFiles != null) {
                        int i8 = 0;
                        for (File file : listFiles) {
                            if (millis > Long.parseLong(file.getName()) + c0601b.f5792g.f6038c) {
                                C0618a c0618a = c0601b.f5793h;
                                if (c0618a != null && file.equals(c0618a.f5848f)) {
                                    c0601b.f5793h.close();
                                }
                                if (file.delete()) {
                                    i8++;
                                }
                            }
                        }
                        if (i8 == 0) {
                            c0601b.d(listFiles);
                        }
                    }
                    c0619b = new C0619b(new File(c0601b.f5791f, String.valueOf(millis)), millis, c0601b.f5792g);
                    c0601b.f5794i = c0619b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((AtomicReference) this.f5805k).set(c0619b);
            ((Logger) this.f5801g).finer("Created new writableFile: " + c0619b);
            c0619b2 = c0619b;
        }
        synchronized (c0619b2) {
            if (!c0619b2.f5859k.get()) {
                synchronized (c0619b2) {
                    boolean z5 = TimeUnit.NANOSECONDS.toMillis(c0619b2.f5856h.a(true)) >= c0619b2.f5857i;
                    if (z5) {
                        c0619b2.close();
                    } else {
                        int i9 = c0619b2.f5860l + ((G4.d) gVar.f2734g).f858c;
                        c0619b2.f5855g.getClass();
                        if (i9 <= 1048576) {
                            gVar.u(c0619b2.f5858j);
                            c0619b2.f5860l = i9;
                            return true;
                        }
                        c0619b2.close();
                    }
                }
            }
        }
        ((AtomicReference) this.f5805k).set(null);
        return d(gVar, i7 + 1);
    }

    public C0603d(C0601b c0601b) {
        this.f5800f = 0;
        this.f5801g = Logger.getLogger(C0603d.class.getName());
        this.f5803i = new AtomicBoolean(false);
        this.f5804j = new AtomicBoolean(false);
        this.f5805k = new AtomicReference();
        this.f5806l = new AtomicReference();
        this.f5802h = c0601b;
    }
}
