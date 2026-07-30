package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class x21 implements Runnable {
    public final /* synthetic */ int d = 1;
    public Object e;
    public Object g;
    public Object h;

    public /* synthetic */ x21(Context context, qh qhVar, CountDownLatch countDownLatch) {
        this.e = context;
        this.g = qhVar;
        this.h = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        zu1 l;
        Object obj = null;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                try {
                    obj = ((j20) this.e).call();
                } catch (Exception unused) {
                }
                ((Handler) this.h).post(new lf((i20) this.g, 3, obj));
                return;
            default:
                qh qhVar = (qh) this.g;
                Intent intent = qhVar.d;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    l = t80.p(null);
                } else {
                    Bundle bundle = new Bundle();
                    Intent intent2 = qhVar.d;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle.putString("google.message_id", stringExtra2);
                    Intent intent3 = qhVar.d;
                    Integer valueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (valueOf != null) {
                        bundle.putInt("google.product_id", valueOf.intValue());
                    }
                    Context context = (Context) this.e;
                    bundle.putBoolean("supports_message_handled", true);
                    xu1 k = xu1.k(context);
                    synchronized (k) {
                        i = k.a;
                        k.a = i + 1;
                    }
                    l = k.l(new vu1(i, 2, bundle, 0));
                }
                l.b(du1.e, new mt1((CountDownLatch) this.h));
                return;
        }
    }
}
