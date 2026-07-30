package O2;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z extends Z2.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0369f f2487b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(AbstractC0369f abstractC0369f, Looper looper) {
        super(looper, 2);
        Objects.requireNonNull(abstractC0369f);
        this.f2487b = abstractC0369f;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        u uVar;
        AbstractC0369f abstractC0369f = this.f2487b;
        if (abstractC0369f.f2401U.get() != message.arg1) {
            int i = message.what;
            if ((i == 2 || i == 1 || i == 7) && (uVar = (u) message.obj) != null) {
                synchronized (uVar) {
                    uVar.f2475a = null;
                }
                AbstractC0369f abstractC0369f2 = uVar.f2477c;
                synchronized (abstractC0369f2.J) {
                    abstractC0369f2.J.remove(uVar);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if ((i4 == 1 || i4 == 7 || i4 == 4 || i4 == 5) && !abstractC0369f.d()) {
            u uVar2 = (u) message.obj;
            if (uVar2 != null) {
                synchronized (uVar2) {
                    uVar2.f2475a = null;
                }
                AbstractC0369f abstractC0369f3 = uVar2.f2477c;
                synchronized (abstractC0369f3.J) {
                    abstractC0369f3.J.remove(uVar2);
                }
                return;
            }
            return;
        }
        int i9 = message.what;
        if (i9 == 4) {
            abstractC0369f.f2398R = new L2.b(message.arg2, null, null);
            if (!abstractC0369f.f2399S && !TextUtils.isEmpty(abstractC0369f.v()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(abstractC0369f.v());
                    if (!abstractC0369f.f2399S) {
                        abstractC0369f.z(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            L2.b bVar = abstractC0369f.f2398R;
            if (bVar == null) {
                bVar = new L2.b(8, null, null);
            }
            abstractC0369f.f2389H.a(bVar);
            abstractC0369f.f2405w = bVar.f1712u;
            abstractC0369f.f2406x = System.currentTimeMillis();
            return;
        }
        if (i9 == 5) {
            L2.b bVar2 = abstractC0369f.f2398R;
            if (bVar2 == null) {
                bVar2 = new L2.b(8, null, null);
            }
            abstractC0369f.f2389H.a(bVar2);
            abstractC0369f.f2405w = bVar2.f1712u;
            abstractC0369f.f2406x = System.currentTimeMillis();
            return;
        }
        if (i9 == 3) {
            Object obj = message.obj;
            PendingIntent pendingIntent = obj instanceof PendingIntent ? (PendingIntent) obj : null;
            int i10 = message.arg2;
            abstractC0369f.f2389H.a(new L2.b(i10, pendingIntent, null));
            abstractC0369f.f2405w = i10;
            abstractC0369f.f2406x = System.currentTimeMillis();
            return;
        }
        if (i9 == 6) {
            abstractC0369f.z(5, null);
            InterfaceC0365b interfaceC0365b = abstractC0369f.f2393M;
            if (interfaceC0365b != null) {
                interfaceC0365b.onConnectionSuspended(message.arg2);
            }
            abstractC0369f.f2402n = message.arg2;
            abstractC0369f.f2403u = System.currentTimeMillis();
            abstractC0369f.y(5, 1, null);
            return;
        }
        if (i9 == 2 && !abstractC0369f.j()) {
            u uVar3 = (u) message.obj;
            if (uVar3 != null) {
                synchronized (uVar3) {
                    uVar3.f2475a = null;
                }
                AbstractC0369f abstractC0369f4 = uVar3.f2477c;
                synchronized (abstractC0369f4.J) {
                    abstractC0369f4.J.remove(uVar3);
                }
                return;
            }
            return;
        }
        int i11 = message.what;
        if (i11 != 2 && i11 != 1 && i11 != 7) {
            Log.wtf("GmsClient", D.y.j(i11, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i11).length() + 34)), new Exception());
            return;
        }
        u uVar4 = (u) message.obj;
        synchronized (uVar4) {
            try {
                bool = uVar4.f2475a;
                if (uVar4.f2476b) {
                    String obj2 = uVar4.toString();
                    StringBuilder sb = new StringBuilder(obj2.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(obj2);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            AbstractC0369f abstractC0369f5 = uVar4.f2480f;
            int i12 = uVar4.f2478d;
            if (i12 != 0) {
                abstractC0369f5.z(1, null);
                Bundle bundle = uVar4.f2479e;
                uVar4.b(new L2.b(i12, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!uVar4.a()) {
                abstractC0369f5.z(1, null);
                uVar4.b(new L2.b(8, null, null));
            }
        }
        synchronized (uVar4) {
            uVar4.f2476b = true;
        }
        synchronized (uVar4) {
            uVar4.f2475a = null;
        }
        AbstractC0369f abstractC0369f6 = uVar4.f2477c;
        synchronized (abstractC0369f6.J) {
            abstractC0369f6.J.remove(uVar4);
        }
    }
}
