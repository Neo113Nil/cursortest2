package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cqn implements Handler.Callback {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public cqn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.b != 0) {
            if (message.what == 1) {
                ((bjn) this.a).f((blk) message.obj);
                return true;
            }
            if (message.what != 2) {
                return false;
            }
            ((bjn) this.a).c.f((blk) message.obj);
            return false;
        }
        int i = message.what;
        if (i == 0) {
            HashMap hashMap = ((cqj) this.a).b;
            synchronized (hashMap) {
                cqi cqiVar = (cqi) message.obj;
                cqm cqmVar = (cqm) hashMap.get(cqiVar);
                if (cqmVar != null && cqmVar.b()) {
                    if (cqmVar.c) {
                        cqj cqjVar = cqmVar.g;
                        cqjVar.d.removeMessages(1, cqmVar.e);
                        try {
                            csi.a(cqjVar.c, cqmVar);
                            cqmVar.c = false;
                            cqmVar.b = 2;
                        } catch (Throwable th) {
                            cqmVar.c = false;
                            cqmVar.b = 2;
                            throw th;
                        }
                    }
                    hashMap.remove(cqiVar);
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        HashMap hashMap2 = ((cqj) this.a).b;
        synchronized (hashMap2) {
            if (message.obj instanceof cqk) {
                cqi cqiVar2 = ((cqk) message.obj).a;
                throw null;
            }
            cqi cqiVar3 = (cqi) message.obj;
            cqm cqmVar2 = (cqm) hashMap2.get(cqiVar3);
            if (cqmVar2 != null && cqmVar2.b == 3) {
                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(cqiVar3), new Exception());
                ComponentName componentName = cqmVar2.f;
                if (componentName == null) {
                    componentName = cqiVar3.c;
                }
                if (componentName == null) {
                    String str = cqiVar3.b;
                    oy.at(str);
                    componentName = new ComponentName(str, "unknown");
                }
                cqmVar2.onServiceDisconnected(componentName);
            }
        }
        return true;
    }
}
