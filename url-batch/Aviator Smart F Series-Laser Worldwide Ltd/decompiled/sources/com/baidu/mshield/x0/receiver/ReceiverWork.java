package com.baidu.mshield.x0.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.baidu.mshield.x0.EngineImpl;
import com.baidu.mshield.x0.d.d;
import com.baidu.mshield.x0.d.h.b;
import java.util.List;

/* loaded from: classes2.dex */
public class ReceiverWork extends BroadcastReceiver {

    public class a extends b {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f8498b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Intent f8499c;

        public a(ReceiverWork receiverWork, Context context, Intent intent) {
            this.f8498b = context;
            this.f8499c = intent;
        }

        @Override // com.baidu.mshield.x0.d.h.b
        public void b() {
            ReceiverWork.b(this.f8498b, this.f8499c);
            ReceiverWork.a(this.f8498b, this.f8499c);
        }
    }

    public static void a(Context context, Intent intent) {
        try {
            if (EngineImpl.isUnload || intent == null || !"com.baidu.mshield.x0.alarm.action".equals(intent.getAction())) {
                return;
            }
            long b8 = com.baidu.mshield.x0.d.b.b(context) * 60000;
            new com.baidu.mshield.x0.l.a(context).e(System.currentTimeMillis() + b8);
            com.baidu.mshield.x0.d.b.a(context, b8);
            List<com.baidu.mshield.x0.d.a> a8 = com.baidu.mshield.x0.f.a.a(context).a();
            long currentTimeMillis = System.currentTimeMillis() + 300000;
            for (com.baidu.mshield.x0.d.a aVar : a8) {
                com.baidu.mshield.b.c.a.b("rec t:" + d.a(aVar.f8426c, cn.hutool.core.date.d.NORM_DATETIME_PATTERN) + " ac:" + aVar.f8424a);
                if (currentTimeMillis >= aVar.f8426c) {
                    com.baidu.mshield.x0.k.a.a(context, aVar.f8424a);
                }
            }
        } catch (Throwable th) {
            d.a(th);
        }
    }

    public static void b(Context context, Intent intent) {
        if (EngineImpl.isUnload) {
            return;
        }
        com.baidu.mshield.x0.k.a.a(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com.baidu.mshield.x0.d.h.d.b().a(new a(this, context, intent));
    }
}
