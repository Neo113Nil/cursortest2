package b7;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.measurement.z5;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t extends z5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1360b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, Looper looper, int i3) {
        super(looper, 1);
        this.f1359a = i3;
        this.f1360b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.f1359a) {
            case 0:
                v vVar = (v) this.f1360b;
                int i3 = message.what;
                if (i3 == 1) {
                    ReentrantLock reentrantLock = vVar.f1366b;
                    reentrantLock.lock();
                    try {
                        if (vVar.f()) {
                            vVar.i();
                        }
                        return;
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                if (i3 == 2) {
                    vVar.g();
                    return;
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 20);
                sb2.append("Unknown message id: ");
                sb2.append(i3);
                Log.w("GoogleApiClientImpl", sb2.toString());
                return;
            default:
                int i10 = message.what;
                if (i10 != 1) {
                    if (i10 == 2) {
                        throw ((RuntimeException) message.obj);
                    }
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 20);
                    sb3.append("Unknown message id: ");
                    sb3.append(i10);
                    Log.w("GACStateManager", sb3.toString());
                    return;
                }
                x xVar = (x) message.obj;
                y yVar = (y) this.f1360b;
                xVar.getClass();
                yVar.f1397d.lock();
                try {
                    if (yVar.f1405n == xVar.f1396a) {
                        xVar.a();
                    }
                    return;
                } finally {
                    yVar.f1397d.unlock();
                }
        }
    }
}
