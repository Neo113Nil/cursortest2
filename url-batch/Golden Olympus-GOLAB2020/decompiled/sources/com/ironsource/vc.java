package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class vc extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, qo> f20025a;

    public vc(Looper looper) {
        super(looper);
        this.f20025a = new ConcurrentHashMap<>();
    }

    void a(String str, qo qoVar) {
        if (str == null || qoVar == null) {
            return;
        }
        this.f20025a.put(str, qoVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            oh ohVar = (oh) message.obj;
            String path = ohVar.getPath();
            qo qoVar = this.f20025a.get(path);
            if (qoVar == null) {
                return;
            }
            if (a(message.what)) {
                qoVar.a(ohVar);
            } else {
                int i4 = message.what;
                qoVar.a(ohVar, new gh(i4, nv.a(i4)));
            }
            this.f20025a.remove(path);
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    private boolean a(int i4) {
        return i4 == 1016 || i4 == 1015;
    }
}
