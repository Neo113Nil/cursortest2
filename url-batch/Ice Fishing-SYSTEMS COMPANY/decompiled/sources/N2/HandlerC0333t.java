package N2;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: N2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC0333t extends Z2.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2107b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2108c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC0333t(Object obj, Looper looper, int i) {
        super(looper, 0, false);
        this.f2107b = i;
        this.f2108c = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ReentrantLock reentrantLock;
        switch (this.f2107b) {
            case 0:
                int i = message.what;
                v vVar = (v) this.f2108c;
                if (i == 1) {
                    ReentrantLock reentrantLock2 = vVar.f2125u;
                    reentrantLock2.lock();
                    try {
                        if (vVar.d()) {
                            vVar.f();
                        }
                        return;
                    } finally {
                        reentrantLock2.unlock();
                    }
                }
                if (i == 2) {
                    v.c(vVar);
                    return;
                }
                StringBuilder sb = new StringBuilder(31);
                sb.append("Unknown message id: ");
                sb.append(i);
                Log.w("GoogleApiClientImpl", sb.toString());
                return;
            default:
                int i4 = message.what;
                if (i4 != 1) {
                    if (i4 == 2) {
                        throw ((RuntimeException) message.obj);
                    }
                    StringBuilder sb2 = new StringBuilder(31);
                    sb2.append("Unknown message id: ");
                    sb2.append(i4);
                    Log.w("GACStateManager", sb2.toString());
                    return;
                }
                x xVar = (x) message.obj;
                y yVar = (y) this.f2108c;
                xVar.getClass();
                yVar.f2139n.lock();
                try {
                    if (yVar.f2135D != xVar.f2131a) {
                        reentrantLock = yVar.f2139n;
                    } else {
                        xVar.a();
                        reentrantLock = yVar.f2139n;
                    }
                    reentrantLock.unlock();
                    return;
                } catch (Throwable th) {
                    yVar.f2139n.unlock();
                    throw th;
                }
        }
    }
}
