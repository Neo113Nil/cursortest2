package com.baidu.xclient.gdid.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.baidu.xclient.gdid.d;

/* loaded from: classes2.dex */
public class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static String f10746a = "action_tir_mshield";

    /* renamed from: b, reason: collision with root package name */
    public boolean f10747b = true;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Intent f10748a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f10749b;

        public a(Intent intent, Context context) {
            this.f10748a = intent;
            this.f10749b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Intent intent = this.f10748a;
                if (intent == null) {
                    return;
                }
                String action = intent.getAction();
                if (b.f10746a.equals(action)) {
                    d.a().a(false, true);
                    return;
                }
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    if (b.this.f10747b) {
                        b.this.f10747b = false;
                    } else if (com.baidu.xclient.gdid.k.d.a(this.f10749b)) {
                        d.a().a(false, false);
                    }
                }
            } catch (Throwable th) {
                com.baidu.xclient.gdid.k.d.a(th);
            }
        }
    }

    public final void a(Context context, Intent intent) {
        com.baidu.xclient.gdid.k.b.b().a(new a(intent, context));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            a(context, intent);
        } catch (Throwable th) {
            com.baidu.xclient.gdid.k.d.a(th);
        }
    }
}
