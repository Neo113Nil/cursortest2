package Q0;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import u0.C0689s;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1988f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m f1989g;

    public /* synthetic */ k(m mVar, int i7) {
        this.f1988f = i7;
        this.f1989g = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1988f) {
            case 0:
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                m mVar = this.f1989g;
                synchronized (mVar) {
                    if (mVar.f1992a == 1) {
                        mVar.a("Timed out while binding");
                    }
                }
                return;
            default:
                this.f1989g.a("Service disconnected");
                return;
        }
        while (true) {
            m mVar2 = this.f1989g;
            synchronized (mVar2) {
                try {
                    if (mVar2.f1992a != 2) {
                        return;
                    }
                    if (mVar2.f1995d.isEmpty()) {
                        mVar2.c();
                        return;
                    }
                    n nVar = (n) mVar2.f1995d.poll();
                    mVar2.f1996e.put(nVar.f1998a, nVar);
                    ((ScheduledExecutorService) mVar2.f1997f.f2006c).schedule(new A.a(mVar2, 6, nVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(nVar)));
                    }
                    o oVar = mVar2.f1997f;
                    Messenger messenger = mVar2.f1993b;
                    int i7 = nVar.f2000c;
                    Context context = (Context) oVar.f2005b;
                    Message obtain = Message.obtain();
                    obtain.what = i7;
                    obtain.arg1 = nVar.f1998a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", nVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", nVar.f2001d);
                    obtain.setData(bundle);
                    try {
                        C0689s c0689s = mVar2.f1994c;
                        Messenger messenger2 = (Messenger) c0689s.f6034f;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            g gVar = (g) c0689s.f6035g;
                            if (gVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = gVar.f1979f;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        }
                    } catch (RemoteException e4) {
                        mVar2.a(e4.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
