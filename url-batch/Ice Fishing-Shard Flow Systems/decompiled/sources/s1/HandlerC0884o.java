package s1;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: s1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC0884o extends C1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7695b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC0884o(Object obj, Looper looper, int i2) {
        super(looper, 0);
        this.f7694a = i2;
        this.f7695b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.f7694a) {
            case 0:
                C0885p c0885p = (C0885p) this.f7695b;
                int i2 = message.what;
                if (i2 == 1) {
                    ReentrantLock reentrantLock = c0885p.f7702e;
                    reentrantLock.lock();
                    try {
                        if (c0885p.c()) {
                            c0885p.f();
                        }
                        return;
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                if (i2 == 2) {
                    c0885p.d();
                    return;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 20);
                sb.append("Unknown message id: ");
                sb.append(i2);
                Log.w("GoogleApiClientImpl", sb.toString());
                return;
            default:
                int i5 = message.what;
                if (i5 != 1) {
                    if (i5 == 2) {
                        throw ((RuntimeException) message.obj);
                    }
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 20);
                    sb2.append("Unknown message id: ");
                    sb2.append(i5);
                    Log.w("GACStateManager", sb2.toString());
                    return;
                }
                AbstractC0887r abstractC0887r = (AbstractC0887r) message.obj;
                C0888s c0888s = (C0888s) this.f7695b;
                abstractC0887r.getClass();
                c0888s.f7720e.lock();
                try {
                    if (c0888s.f7729o == abstractC0887r.f7719a) {
                        abstractC0887r.a();
                    }
                    return;
                } finally {
                    c0888s.f7720e.unlock();
                }
        }
    }
}
