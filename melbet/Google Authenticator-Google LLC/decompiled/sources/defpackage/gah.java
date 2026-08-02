package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import android.util.SparseArray;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gah extends Service {
    private hvi a = hnu.aJ(null);
    private int b = -1;

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = ((gag) imq.a(getApplicationContext(), gag.class)).f().e.entrySet().iterator();
        while (it.hasNext()) {
            printWriter.println((String) ((Map.Entry) it.next()).getValue());
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        long j;
        if (this.a.isDone()) {
            return;
        }
        gak f = ((gag) imq.a(getApplicationContext(), gag.class)).f();
        int i = this.b;
        AtomicLong atomicLong = f.c;
        int a = gak.a(atomicLong.get());
        if (i == a) {
            do {
                j = atomicLong.get();
                if (gak.a(j) != a) {
                    return;
                }
            } while (!atomicLong.compareAndSet(j, gak.a(r6 + 1)));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        hvi aJ;
        if ((i & 2) == 0 && intent != null) {
            gak f = ((gag) imq.a(iwe.a(getApplicationContext()), gag.class)).f();
            hoq.C(intent.hasExtra("EXTRA_FUTURE_INDEX"), "Intent missing extra %s", intent);
            hoq.C(intent.hasExtra("EXTRA_PROCESS_UUID"), "Intent missing extra %s", intent);
            hoq.C(intent.hasExtra("EXTRA_PROCESS_UUID2"), "Intent missing extra %s", intent);
            UUID uuid = f.h;
            long longExtra = intent.getLongExtra("EXTRA_PROCESS_UUID", -1L);
            long longExtra2 = intent.getLongExtra("EXTRA_PROCESS_UUID2", -1L);
            if (uuid.getMostSignificantBits() == longExtra && uuid.getLeastSignificantBits() == longExtra2) {
                int intExtra = intent.getIntExtra("EXTRA_FUTURE_INDEX", -1);
                synchronized (f.d) {
                    SparseArray sparseArray = f.f;
                    aJ = (hvw) sparseArray.get(intExtra);
                    aJ.getClass();
                    if (aJ != gak.b) {
                        f.g.put(intExtra, aJ);
                    }
                    sparseArray.remove(intExtra);
                }
            } else {
                ((hkf) ((hkf) gak.a.e()).i("com/google/apps/tiktok/concurrent/AndroidFuturesServiceCounter", "onStartCommand", 224, "AndroidFuturesServiceCounter.java")).v("Stopping service immediately, intent delivered from previous process. Old PID was %d but current PID is %d", intent.getIntExtra("EXTRA_PROCESS_PID", -1), Process.myPid());
                aJ = hnu.aJ(null);
            }
            this.a = aJ;
            this.b = intent.getIntExtra("EXTRA_FUTURE_INDEX", -1);
        }
        this.a.c(new vz(this, i2, 4), huf.a);
        return 2;
    }
}
