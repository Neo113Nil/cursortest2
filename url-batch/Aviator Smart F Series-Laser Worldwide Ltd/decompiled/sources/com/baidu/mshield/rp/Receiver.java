package com.baidu.mshield.rp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.artillery.ctc.uitls.TimeConstants;
import com.baidu.mshield.utility.b;

/* loaded from: classes2.dex */
public class Receiver extends BroadcastReceiver {

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f8340a;

        public a(Receiver receiver, Context context) {
            this.f8340a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.baidu.mshield.sharedpreferences.a a8 = com.baidu.mshield.sharedpreferences.a.a(this.f8340a);
            com.baidu.mshield.utility.a.a(this.f8340a, a8.J() * TimeConstants.HOUR);
            a8.b(System.currentTimeMillis());
        }
    }

    public void a(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            new Thread(new a(this, context)).start();
            b.a(context).d();
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action) && action.equals("com.b.r.p")) {
                a(context, intent);
            }
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
    }
}
