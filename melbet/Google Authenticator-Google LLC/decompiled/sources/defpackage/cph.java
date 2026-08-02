package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cph extends gbg {
    final /* synthetic */ cpo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cph(cpo cpoVar, Looper looper) {
        super(looper, (byte[]) null);
        this.a = cpoVar;
    }

    private static final void a(Message message) {
        cpi cpiVar = (cpi) message.obj;
        if (cpiVar != null) {
            cpiVar.e();
        }
    }

    private static final boolean b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [cnx, java.lang.Object] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        cpo cpoVar = this.a;
        if (cpoVar.o.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !cpoVar.n()) {
            a(message);
            return;
        }
        if (message.what == 4) {
            cpoVar.l = new clg(1, message.arg2, null, null, null);
            if (!cpoVar.m && !TextUtils.isEmpty(cpoVar.c()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(cpoVar.c());
                    this.a.H(3, null);
                    return;
                } catch (ClassNotFoundException unused) {
                }
            }
            cpo cpoVar2 = this.a;
            clg clgVar = cpoVar2.l;
            if (clgVar == null) {
                clgVar = new clg(1, 8, null, null, null);
            }
            cpoVar2.f.a(clgVar);
            System.currentTimeMillis();
            return;
        }
        if (message.what == 5) {
            cpo cpoVar3 = this.a;
            clg clgVar2 = cpoVar3.l;
            if (clgVar2 == null) {
                clgVar2 = new clg(1, 8, null, null, null);
            }
            cpoVar3.f.a(clgVar2);
            System.currentTimeMillis();
            return;
        }
        if (message.what == 3) {
            this.a.f.a(new clg(1, message.arg2, message.obj instanceof PendingIntent ? (PendingIntent) message.obj : null, null, null));
            System.currentTimeMillis();
            return;
        }
        if (message.what == 6) {
            cpo cpoVar4 = this.a;
            cpoVar4.H(5, null);
            kee keeVar = cpoVar4.s;
            if (keeVar != null) {
                keeVar.a.b(message.arg2);
            }
            int i = message.arg2;
            System.currentTimeMillis();
            cpoVar4.F(5, 1, null);
            return;
        }
        if (message.what == 2 && !this.a.m()) {
            a(message);
            return;
        }
        if (!b(message)) {
            Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
            return;
        }
        cpi cpiVar = (cpi) message.obj;
        synchronized (cpiVar) {
            obj = cpiVar.d;
            if (cpiVar.e) {
                Log.w("GmsClient", a.aa(cpiVar, "Callback proxy ", " being reused. This is not safe."));
            }
        }
        if (obj != null) {
            cpiVar.c();
        }
        synchronized (cpiVar) {
            cpiVar.e = true;
        }
        cpiVar.e();
    }
}
