package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.androidatgoogle.privacy.lock.PrivacyScreenLockActivity;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ath implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ath(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v21, types: [ddb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v25, types: [dis, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v26, types: [dis, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kwu] */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v4, types: [bkd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((AtomicBoolean) this.a).set(true);
                return;
            case 1:
                ?? r6 = this.a;
                if (r6 != 0) {
                    r6.s(null);
                    return;
                }
                return;
            case 2:
                ?? r62 = this.a;
                ((bah) r62).c.a(r62);
                return;
            case 3:
                Process.setThreadPriority(10);
                this.a.run();
                return;
            case 4:
                break;
            case 5:
                Object obj = this.a;
                ((cgp) ((cfz) obj).d).f(new cfu(obj, 3));
                return;
            case 6:
                cml cmlVar = ((coc) ((kee) this.a).a).b;
                cmlVar.l(String.valueOf(cmlVar.getClass().getName()).concat(" disconnecting because it was signed out."));
                return;
            case 7:
                ((coy) this.a).f.b(new clg(1, 4, null, null, null));
                return;
            case 8:
                Object obj2 = this.a;
                synchronized (((dda) obj2).a) {
                    ((dda) obj2).b.a();
                }
                return;
            case 9:
                Activity activity = ((dev) this.a).d;
                if (activity != null) {
                    Intent intent = new Intent(activity, (Class<?>) PrivacyScreenLockActivity.class);
                    intent.putExtra("app_icon_res", R.drawable.privacy_screen_background_app_logo);
                    activity.startActivity(intent);
                    return;
                }
                return;
            case 10:
                this.a.b();
                return;
            case 11:
                if (Build.VERSION.SDK_INT < 31) {
                    Binder.flushPendingCommands();
                }
                this.a.a();
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                dhd.a.set(true);
                this.a.run();
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((dgf) this.a).a.cancel(false);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int i = dhm.e;
                throw ((Throwable) this.a);
            case 15:
                throw ((Throwable) this.a);
            case 16:
                throw ((Throwable) this.a);
            case 17:
                Process.myTid();
                this.a.run();
                return;
            case 18:
                ((dla) this.a).f();
                return;
            case 19:
                ((dlk) this.a).a();
                return;
            default:
                Object obj3 = this.a;
                ((dlk) obj3).i = null;
                gty aC = hoq.aC(55, "GIL:AutoProcessLogBatch");
                try {
                    dkj dkjVar = ((dlk) obj3).a;
                    dln dlnVar = ((dlk) obj3).c;
                    dlnVar.getClass();
                    dkjVar.b(new dli(dlnVar, 2));
                    aC.close();
                    return;
                } finally {
                }
        }
        while (true) {
            Object obj4 = this.a;
            boolean z = ((bcr) obj4).c;
            try {
                ((bcr) obj4).c((bcq) ((bcr) obj4).b.remove());
                bcp bcpVar = ((bcr) obj4).d;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public ath(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
