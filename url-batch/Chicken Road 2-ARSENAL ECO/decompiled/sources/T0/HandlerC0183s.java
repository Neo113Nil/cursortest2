package T0;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: T0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC0183s extends c1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2341b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC0183s(Object obj, Looper looper, int i7) {
        super(looper);
        this.f2340a = i7;
        this.f2341b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Lock lock;
        switch (this.f2340a) {
            case 0:
                u uVar = (u) this.f2341b;
                int i7 = message.what;
                if (i7 == 1) {
                    ReentrantLock reentrantLock = uVar.f2345g;
                    reentrantLock.lock();
                    try {
                        if (uVar.f()) {
                            uVar.h();
                        }
                        return;
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                if (i7 == 2) {
                    u.e(uVar);
                    return;
                }
                StringBuilder sb = new StringBuilder(31);
                sb.append("Unknown message id: ");
                sb.append(i7);
                Log.w("GoogleApiClientImpl", sb.toString());
                return;
            default:
                int i8 = message.what;
                if (i8 != 1) {
                    if (i8 == 2) {
                        throw ((RuntimeException) message.obj);
                    }
                    StringBuilder sb2 = new StringBuilder(31);
                    sb2.append("Unknown message id: ");
                    sb2.append(i8);
                    Log.w("GACStateManager", sb2.toString());
                    return;
                }
                w wVar = (w) message.obj;
                x xVar = (x) this.f2341b;
                wVar.getClass();
                xVar.f2365d.lock();
                try {
                    if (xVar.f2375n != wVar.f2364a) {
                        lock = xVar.f2365d;
                    } else {
                        wVar.a();
                        lock = xVar.f2365d;
                    }
                    lock.unlock();
                    return;
                } catch (Throwable th) {
                    xVar.f2365d.unlock();
                    throw th;
                }
        }
    }
}
