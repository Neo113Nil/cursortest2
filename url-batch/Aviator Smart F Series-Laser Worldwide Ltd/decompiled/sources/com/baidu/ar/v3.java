package com.baidu.ar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.baidu.ar.bean.ARConfig;
import com.baidu.ar.constants.ARConfigKey;
import com.baidu.ar.statistic.StatisticApiImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class v3 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public u3 f3449a;

    /* renamed from: b, reason: collision with root package name */
    public Map<String, String> f3450b;

    public v3(Looper looper, u3 u3Var) {
        super(looper);
        this.f3449a = u3Var;
        this.f3450b = new HashMap();
    }

    public void a(int i8, Object obj) {
        if (obj instanceof t3) {
            t3 t3Var = (t3) obj;
            if (!TextUtils.isEmpty(ARConfig.getARKey())) {
                t3Var.a("ar_key", ARConfig.getARKey());
            }
            t3Var.a(ARConfigKey.AR_ID, ARConfig.getARId());
            t3Var.a(ARConfigKey.AR_FROM, ARConfig.getArFrom());
            t3Var.a("ar_type", String.valueOf(ARConfig.getARType()));
            if (!this.f3450b.isEmpty()) {
                t3Var.a(this.f3450b);
            }
        }
        Message obtainMessage = obtainMessage();
        obtainMessage.what = i8;
        obtainMessage.obj = obj;
        sendMessage(obtainMessage);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        int i8 = message.what;
        if (i8 == 20) {
            this.f3449a.f((t3) message.obj);
        }
        if (i8 == 21) {
            this.f3449a.a((List<String>) message.obj);
            return;
        }
        switch (i8) {
            case 1:
                this.f3449a.c();
                break;
            case 2:
                this.f3449a.a((t3) message.obj);
                break;
            case 3:
                this.f3449a.e((t3) message.obj);
                break;
            case 4:
                this.f3449a.d((t3) message.obj);
                break;
            case 5:
                this.f3449a.c((t3) message.obj);
                break;
            case 6:
                this.f3449a.b((t3) message.obj);
                break;
            default:
                switch (i8) {
                    case 97:
                        this.f3449a.a(((Long) message.obj).longValue());
                        break;
                    case 98:
                        this.f3449a.b(((Long) message.obj).longValue());
                        break;
                    case 99:
                        this.f3449a.a();
                        StatisticApiImpl statisticApiImpl = (StatisticApiImpl) message.obj;
                        if (statisticApiImpl != null) {
                            statisticApiImpl.doRelease();
                        }
                        message.obj = null;
                        break;
                }
        }
    }

    public void a(String str, String str2) {
        this.f3450b.put(str, str2);
    }

    public void a(Map<String, String> map) {
        if (map != null) {
            this.f3450b.putAll(map);
        }
    }
}
