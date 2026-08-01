package c7;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.z5;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f0 extends z5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f1902a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(f fVar, Looper looper) {
        super(looper, 3);
        this.f1902a = fVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        x xVar;
        f fVar = this.f1902a;
        int i3 = fVar.C.get();
        int i10 = message.arg1;
        int i11 = message.what;
        if (i3 != i10) {
            if ((i11 == 2 || i11 == 1 || i11 == 7) && (xVar = (x) message.obj) != null) {
                synchronized (xVar) {
                    xVar.f1999a = null;
                }
                f fVar2 = xVar.f2001c;
                synchronized (fVar2.f1892q) {
                    fVar2.f1892q.remove(xVar);
                }
                return;
            }
            return;
        }
        if ((i11 == 1 || i11 == 7 || i11 == 4 || i11 == 5) && !fVar.r()) {
            x xVar2 = (x) message.obj;
            if (xVar2 != null) {
                synchronized (xVar2) {
                    xVar2.f1999a = null;
                }
                f fVar3 = xVar2.f2001c;
                synchronized (fVar3.f1892q) {
                    fVar3.f1892q.remove(xVar2);
                }
                return;
            }
            return;
        }
        int i12 = message.what;
        if (i12 == 4) {
            fVar.f1901z = new z6.b(message.arg2, null, null);
            if (!fVar.A && !TextUtils.isEmpty(fVar.n()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(fVar.n());
                    if (!fVar.A) {
                        fVar.u(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            z6.b bVar = fVar.f1901z;
            if (bVar == null) {
                bVar = new z6.b(8, null, null);
            }
            fVar.f1890o.a(bVar);
            fVar.f1881d = bVar.f10867e;
            fVar.f1882e = System.currentTimeMillis();
            return;
        }
        if (i12 == 5) {
            z6.b bVar2 = fVar.f1901z;
            if (bVar2 == null) {
                bVar2 = new z6.b(8, null, null);
            }
            fVar.f1890o.a(bVar2);
            fVar.f1881d = bVar2.f10867e;
            fVar.f1882e = System.currentTimeMillis();
            return;
        }
        if (i12 == 3) {
            Object obj = message.obj;
            PendingIntent pendingIntent = obj instanceof PendingIntent ? (PendingIntent) obj : null;
            int i13 = message.arg2;
            fVar.f1890o.a(new z6.b(i13, pendingIntent, null));
            fVar.f1881d = i13;
            fVar.f1882e = System.currentTimeMillis();
            return;
        }
        if (i12 == 6) {
            fVar.u(5, null);
            b bVar3 = fVar.f1895t;
            if (bVar3 != null) {
                bVar3.onConnectionSuspended(message.arg2);
            }
            fVar.f1878a = message.arg2;
            fVar.f1879b = System.currentTimeMillis();
            fVar.t(5, 1, null);
            return;
        }
        if (i12 == 2 && !fVar.q()) {
            x xVar3 = (x) message.obj;
            if (xVar3 != null) {
                synchronized (xVar3) {
                    xVar3.f1999a = null;
                }
                f fVar4 = xVar3.f2001c;
                synchronized (fVar4.f1892q) {
                    fVar4.f1892q.remove(xVar3);
                }
                return;
            }
            return;
        }
        int i14 = message.what;
        if (i14 != 2 && i14 != 1 && i14 != 7) {
            Log.wtf("GmsClient", v4.a.n(new StringBuilder(String.valueOf(i14).length() + 34), "Don't know how to handle message: ", i14), new Exception());
            return;
        }
        x xVar4 = (x) message.obj;
        synchronized (xVar4) {
            try {
                bool = xVar4.f1999a;
                if (xVar4.f2000b) {
                    String obj2 = xVar4.toString();
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
            f fVar5 = xVar4.f2004f;
            int i15 = xVar4.f2002d;
            if (i15 != 0) {
                fVar5.u(1, null);
                Bundle bundle = xVar4.f2003e;
                xVar4.b(new z6.b(i15, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!xVar4.a()) {
                fVar5.u(1, null);
                xVar4.b(new z6.b(8, null, null));
            }
        }
        synchronized (xVar4) {
            xVar4.f2000b = true;
        }
        synchronized (xVar4) {
            xVar4.f1999a = null;
        }
        f fVar6 = xVar4.f2001c;
        synchronized (fVar6.f1892q) {
            fVar6.f1892q.remove(xVar4);
        }
    }
}
