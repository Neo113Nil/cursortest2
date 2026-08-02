package defpackage;

import android.os.Process;
import android.os.StrictMode;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dit implements dis {
    private final Map b = new ConcurrentHashMap();
    private final dio c;
    private final AtomicInteger d;
    private final AtomicInteger e;
    private volatile dim f;

    public dit(dio dioVar) {
        new ConcurrentHashMap();
        this.d = new AtomicInteger();
        this.e = new AtomicInteger();
        this.c = dioVar;
        this.f = dim.a;
    }

    @Override // defpackage.dis
    public final void a() {
        this.e.getAndIncrement();
    }

    @Override // defpackage.dis
    public final void b() {
        this.d.getAndIncrement();
    }

    @Override // defpackage.dis
    public final void c(long j) {
        din dinVar = (din) this.b.remove(Long.valueOf(j));
        if (dinVar != null) {
            int i = dinVar.a;
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                dim a = dil.a(new File(String.format(Locale.US, "/proc/self/task/%d/schedstat", Integer.valueOf(i))));
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                if (a != dim.a) {
                    dim dimVar = this.f;
                    this.f = new dim(dimVar.b + a.b, dimVar.c + a.c, dimVar.d + a.d);
                }
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th;
            }
        }
    }

    @Override // defpackage.dis
    public final void d(long j) {
        Map map = this.b;
        Long valueOf = Long.valueOf(j);
        if (map.containsKey(valueOf)) {
            return;
        }
        map.put(valueOf, new din(Process.myTid(), j, Thread.currentThread().getName(), this.c.a));
    }
}
