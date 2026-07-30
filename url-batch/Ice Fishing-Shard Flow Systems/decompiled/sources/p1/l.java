package p1;

import K1.p;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Consumer;
import java.util.function.Supplier;
import y1.ThreadFactoryC1023a;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static l f7190e;

    /* renamed from: a, reason: collision with root package name */
    public int f7191a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7192b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7193c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7194d;

    public l(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f7194d = new j(this);
        this.f7191a = 1;
        this.f7193c = scheduledExecutorService;
        this.f7192b = context.getApplicationContext();
    }

    public static synchronized l b(Context context) {
        l lVar;
        synchronized (l.class) {
            try {
                if (f7190e == null) {
                    f7190e = new l(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC1023a("MessengerIpcClient"))));
                }
                lVar = f7190e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    public Object a() {
        int i2 = this.f7191a;
        ArrayList arrayList = (ArrayList) this.f7192b;
        if (i2 < arrayList.size()) {
            int i5 = this.f7191a;
            this.f7191a = i5 + 1;
            return arrayList.get(i5);
        }
        Object obj = ((Supplier) this.f7193c).get();
        arrayList.add(obj);
        this.f7191a++;
        return obj;
    }

    public synchronized p c(k kVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(kVar.toString()));
            }
            if (!((j) this.f7194d).a(kVar)) {
                j jVar = new j(this);
                this.f7194d = jVar;
                jVar.a(kVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return kVar.f7186b.f1428a;
    }

    public l(Supplier supplier, Consumer consumer) {
        this.f7192b = new ArrayList();
        this.f7193c = supplier;
        this.f7194d = consumer;
    }
}
