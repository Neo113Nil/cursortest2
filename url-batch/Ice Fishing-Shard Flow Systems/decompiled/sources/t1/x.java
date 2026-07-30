package t1;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes.dex */
public final class x extends C1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f8006a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.google.android.gms.common.internal.a aVar, Looper looper) {
        super(looper, 2);
        this.f8006a = aVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        s sVar;
        com.google.android.gms.common.internal.a aVar = this.f8006a;
        if (aVar.f4375B.get() != message.arg1) {
            int i2 = message.what;
            if ((i2 == 2 || i2 == 1 || i2 == 7) && (sVar = (s) message.obj) != null) {
                synchronized (sVar) {
                    sVar.f7994a = null;
                }
                com.google.android.gms.common.internal.a aVar2 = sVar.f7996c;
                synchronized (aVar2.f4391p) {
                    aVar2.f4391p.remove(sVar);
                }
                return;
            }
            return;
        }
        int i5 = message.what;
        if ((i5 == 1 || i5 == 7 || i5 == 4 || i5 == 5) && !aVar.n()) {
            s sVar2 = (s) message.obj;
            if (sVar2 != null) {
                synchronized (sVar2) {
                    sVar2.f7994a = null;
                }
                com.google.android.gms.common.internal.a aVar3 = sVar2.f7996c;
                synchronized (aVar3.f4391p) {
                    aVar3.f4391p.remove(sVar2);
                }
                return;
            }
            return;
        }
        int i7 = message.what;
        if (i7 == 4) {
            aVar.f4400y = new q1.b(message.arg2, null, null);
            if (!aVar.f4401z && !TextUtils.isEmpty(aVar.j()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(aVar.j());
                    if (!aVar.f4401z) {
                        aVar.p(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            q1.b bVar = aVar.f4400y;
            if (bVar == null) {
                bVar = new q1.b(8, null, null);
            }
            aVar.f4389n.a(bVar);
            aVar.f4380d = bVar.f7311e;
            aVar.f4381e = System.currentTimeMillis();
            return;
        }
        if (i7 == 5) {
            q1.b bVar2 = aVar.f4400y;
            if (bVar2 == null) {
                bVar2 = new q1.b(8, null, null);
            }
            aVar.f4389n.a(bVar2);
            aVar.f4380d = bVar2.f7311e;
            aVar.f4381e = System.currentTimeMillis();
            return;
        }
        if (i7 == 3) {
            Object obj = message.obj;
            PendingIntent pendingIntent = obj instanceof PendingIntent ? (PendingIntent) obj : null;
            int i8 = message.arg2;
            aVar.f4389n.a(new q1.b(i8, pendingIntent, null));
            aVar.f4380d = i8;
            aVar.f4381e = System.currentTimeMillis();
            return;
        }
        if (i7 == 6) {
            aVar.p(5, null);
            C0921h c0921h = aVar.f4394s;
            if (c0921h != null) {
                ((r1.k) c0921h.f7958a).onConnectionSuspended(message.arg2);
            }
            aVar.f4377a = message.arg2;
            aVar.f4378b = System.currentTimeMillis();
            aVar.o(5, 1, null);
            return;
        }
        if (i7 == 2 && !aVar.m()) {
            s sVar3 = (s) message.obj;
            if (sVar3 != null) {
                synchronized (sVar3) {
                    sVar3.f7994a = null;
                }
                com.google.android.gms.common.internal.a aVar4 = sVar3.f7996c;
                synchronized (aVar4.f4391p) {
                    aVar4.f4391p.remove(sVar3);
                }
                return;
            }
            return;
        }
        int i9 = message.what;
        if (i9 != 2 && i9 != 1 && i9 != 7) {
            StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 34);
            sb.append("Don't know how to handle message: ");
            sb.append(i9);
            Log.wtf("GmsClient", sb.toString(), new Exception());
            return;
        }
        s sVar4 = (s) message.obj;
        synchronized (sVar4) {
            try {
                bool = sVar4.f7994a;
                if (sVar4.f7995b) {
                    String obj2 = sVar4.toString();
                    StringBuilder sb2 = new StringBuilder(obj2.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(obj2);
                    sb2.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb2.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            com.google.android.gms.common.internal.a aVar5 = sVar4.f7999f;
            int i10 = sVar4.f7997d;
            if (i10 != 0) {
                aVar5.p(1, null);
                Bundle bundle = sVar4.f7998e;
                sVar4.b(new q1.b(i10, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!sVar4.a()) {
                aVar5.p(1, null);
                sVar4.b(new q1.b(8, null, null));
            }
        }
        synchronized (sVar4) {
            sVar4.f7995b = true;
        }
        synchronized (sVar4) {
            sVar4.f7994a = null;
        }
        com.google.android.gms.common.internal.a aVar6 = sVar4.f7996c;
        synchronized (aVar6.f4391p) {
            aVar6.f4391p.remove(sVar4);
        }
    }
}
