package X4;

import B.f;
import O6.g;
import d5.C0366b;
import h1.h;
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
import n5.C0761c;

/* loaded from: classes.dex */
public final class d implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2873d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2874e;

    /* renamed from: i, reason: collision with root package name */
    public Object f2875i;

    /* renamed from: l, reason: collision with root package name */
    public Object f2876l;

    /* renamed from: m, reason: collision with root package name */
    public Object f2877m;

    /* renamed from: n, reason: collision with root package name */
    public Object f2878n;

    /* renamed from: o, reason: collision with root package name */
    public Object f2879o;

    public /* synthetic */ d() {
        this.f2873d = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c a(S4.b bVar, int i2) {
        byte[] a7;
        if (((AtomicBoolean) this.f2876l).get()) {
            ((Logger) this.f2874e).fine("Refusing to read from storage after being closed.");
            return null;
        }
        if (i2 > 3) {
            ((Logger) this.f2874e).log(Level.WARNING, "Maximum number of attempts to read buffered data exceeded.");
            return null;
        }
        Y4.a aVar = (Y4.a) ((AtomicReference) this.f2879o).get();
        if (aVar == null) {
            ((Logger) this.f2874e).finer("Obtaining a new readableFile from the folderManager.");
            b bVar2 = (b) this.f2875i;
            synchronized (bVar2) {
                bVar2.f2866i = null;
                File a8 = bVar2.a();
                if (a8 != null) {
                    Y4.a aVar2 = new Y4.a(a8, Long.parseLong(a8.getName()), bVar2.f2865e);
                    bVar2.f2866i = aVar2;
                    aVar = aVar2;
                } else {
                    aVar = null;
                }
            }
            ((AtomicReference) this.f2879o).set(aVar);
            if (aVar == null) {
                ((Logger) this.f2874e).fine("Unable to get or create readable file.");
                return null;
            }
        }
        ((Logger) this.f2874e).finer("Attempting to read data from " + aVar);
        synchronized (aVar) {
            if (!aVar.f2916n.get()) {
                synchronized (aVar) {
                    boolean z7 = TimeUnit.NANOSECONDS.toMillis(aVar.f2914l.a(true)) >= aVar.f2915m;
                    if (z7) {
                        aVar.close();
                    } else {
                        a7 = aVar.f2913i.a();
                        if (a7 == null) {
                            aVar.a();
                        }
                    }
                }
                if (a7 != null) {
                    try {
                        bVar.getClass();
                        try {
                            ArrayList H7 = g.H((C0366b) C0366b.f4662l.d(a7));
                            ((AtomicBoolean) this.f2877m).set(true);
                            return new c(this, H7, aVar);
                        } catch (IOException e7) {
                            e = e7;
                            throw new S4.a(e);
                        } catch (IllegalStateException e8) {
                            e = e8;
                            throw new S4.a(e);
                        }
                    } catch (S4.a unused) {
                        aVar.a();
                    }
                }
                ((AtomicReference) this.f2879o).set(null);
                return a(bVar, i2 + 1);
            }
        }
        a7 = null;
        if (a7 != null) {
        }
        ((AtomicReference) this.f2879o).set(null);
        return a(bVar, i2 + 1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f2873d) {
            case 0:
                ((Logger) this.f2874e).fine("Closing disk buffering storage.");
                if (((AtomicBoolean) this.f2876l).compareAndSet(false, true)) {
                    ((b) this.f2875i).close();
                    ((AtomicReference) this.f2878n).set(null);
                    ((AtomicReference) this.f2879o).set(null);
                    break;
                }
                break;
            default:
                ((h) ((h1.d) ((Q5.a) this.f2878n).get())).close();
                break;
        }
    }

    public boolean d(f fVar, int i2) {
        Clock systemUTC;
        Instant instant;
        long epochSecond;
        int nano;
        Y4.b bVar;
        if (((AtomicBoolean) this.f2876l).get()) {
            ((Logger) this.f2874e).fine("Refusing to write to storage after being closed.");
            return false;
        }
        if (i2 > 3) {
            ((Logger) this.f2874e).log(Level.WARNING, "Max number of attempts to write buffered data exceeded.");
            return false;
        }
        Y4.b bVar2 = (Y4.b) ((AtomicReference) this.f2878n).get();
        if (bVar2 == null) {
            b bVar3 = (b) this.f2875i;
            synchronized (bVar3) {
                try {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    systemUTC = Clock.systemUTC();
                    instant = systemUTC.instant();
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    epochSecond = instant.getEpochSecond();
                    long nanos = timeUnit2.toNanos(epochSecond);
                    nano = instant.getNano();
                    long millis = timeUnit.toMillis(nanos + nano);
                    File[] listFiles = bVar3.f2864d.listFiles();
                    if (listFiles != null) {
                        int i5 = 0;
                        for (File file : listFiles) {
                            if (millis > Long.parseLong(file.getName()) + bVar3.f2865e.f4159c) {
                                Y4.a aVar = bVar3.f2866i;
                                if (aVar != null && file.equals(aVar.f2911d)) {
                                    bVar3.f2866i.close();
                                }
                                if (file.delete()) {
                                    i5++;
                                }
                            }
                        }
                        if (i5 == 0) {
                            bVar3.d(listFiles);
                        }
                    }
                    bVar = new Y4.b(new File(bVar3.f2864d, String.valueOf(millis)), millis, bVar3.f2865e);
                    bVar3.f2867l = bVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((AtomicReference) this.f2878n).set(bVar);
            ((Logger) this.f2874e).finer("Created new writableFile: " + bVar);
            bVar2 = bVar;
        }
        synchronized (bVar2) {
            if (!bVar2.f2922n.get()) {
                synchronized (bVar2) {
                    boolean z7 = TimeUnit.NANOSECONDS.toMillis(bVar2.f2919i.a(true)) >= bVar2.f2920l;
                    if (z7) {
                        bVar2.close();
                    } else {
                        int i7 = bVar2.f2923o + ((C0761c) fVar.f152e).f7002c;
                        bVar2.f2918e.getClass();
                        if (i7 <= 1048576) {
                            fVar.x(bVar2.f2921m);
                            bVar2.f2923o = i7;
                            return true;
                        }
                        bVar2.close();
                    }
                }
            }
        }
        ((AtomicReference) this.f2878n).set(null);
        return d(fVar, i2 + 1);
    }

    public d(b bVar) {
        this.f2873d = 0;
        this.f2874e = Logger.getLogger(d.class.getName());
        this.f2876l = new AtomicBoolean(false);
        this.f2877m = new AtomicBoolean(false);
        this.f2878n = new AtomicReference();
        this.f2879o = new AtomicReference();
        this.f2875i = bVar;
    }
}
