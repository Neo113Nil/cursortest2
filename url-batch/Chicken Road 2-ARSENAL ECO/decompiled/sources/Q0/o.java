package Q0;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static o f2003e;

    /* renamed from: a, reason: collision with root package name */
    public int f2004a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2005b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2006c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2007d;

    public o(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f2007d = new m(this);
        this.f2004a = 1;
        this.f2006c = scheduledExecutorService;
        this.f2005b = context.getApplicationContext();
    }

    public static synchronized o b(Context context) {
        o oVar;
        synchronized (o.class) {
            try {
                if (f2003e == null) {
                    f2003e = new o(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new Z0.a("MessengerIpcClient"))));
                }
                oVar = f2003e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }

    public Object a() {
        int i7 = this.f2004a;
        ArrayList arrayList = (ArrayList) this.f2005b;
        if (i7 < arrayList.size()) {
            int i8 = this.f2004a;
            this.f2004a = i8 + 1;
            return arrayList.get(i8);
        }
        Object obj = ((Supplier) this.f2006c).get();
        arrayList.add(obj);
        this.f2004a++;
        return obj;
    }

    public synchronized k1.n c(n nVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(nVar.toString()));
            }
            if (!((m) this.f2007d).d(nVar)) {
                m mVar = new m(this);
                this.f2007d = mVar;
                mVar.d(nVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return nVar.f1999b.f5157a;
    }

    public o(Supplier supplier, Consumer consumer) {
        this.f2005b = new ArrayList();
        this.f2006c = supplier;
        this.f2007d = consumer;
    }
}
