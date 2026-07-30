package defpackage;

import android.app.job.JobParameters;
import android.os.Process;
import android.os.StrictMode;
import android.util.LongSparseArray;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class x4 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ x4(Object obj, int i, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dd0 dd0Var;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                uq1.B((z4) this.e, (LongSparseArray) this.g);
                return;
            case 1:
                ct0 ct0Var = (ct0) this.e;
                p01 p01Var = (p01) this.g;
                if (ct0Var.b != ct0.d) {
                    dd0.j("provide() can be called only once.");
                    return;
                }
                synchronized (ct0Var) {
                    dd0Var = ct0Var.a;
                    ct0Var.a = null;
                    ct0Var.b = p01Var;
                }
                dd0Var.getClass();
                return;
            case 2:
                ag0 ag0Var = (ag0) this.e;
                p01 p01Var2 = (p01) this.g;
                synchronized (ag0Var) {
                    try {
                        if (ag0Var.b == null) {
                            ag0Var.a.add(p01Var2);
                        } else {
                            ag0Var.b.add(p01Var2.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 3:
                fo foVar = (fo) this.e;
                Runnable runnable = (Runnable) this.g;
                Process.setThreadPriority(foVar.c);
                StrictMode.ThreadPolicy threadPolicy = foVar.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 4:
                Callable callable = (Callable) this.e;
                s40 s40Var = (s40) this.g;
                try {
                    Object call = callable.call();
                    hr hrVar = (hr) s40Var.e;
                    if (call == null) {
                        call = s0.k;
                    }
                    if (s0.j.t(hrVar, null, call)) {
                        s0.c(hrVar);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    s40Var.z(e);
                    return;
                }
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.e;
                ng1 ng1Var = (ng1) this.g;
                try {
                    ng1Var.a(firebaseMessaging.a());
                    return;
                } catch (Exception e2) {
                    ng1Var.a.l(e2);
                    return;
                }
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                b70 b70Var = (b70) this.e;
                ng1 ng1Var2 = (ng1) this.g;
                try {
                    ng1Var2.a(b70Var.a());
                    return;
                } catch (Exception e3) {
                    ng1Var2.a.l(e3);
                    return;
                }
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.e;
                JobParameters jobParameters = (JobParameters) this.g;
                int i = JobInfoSchedulerService.d;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                final WebView webView = (WebView) this.e;
                final lo1 lo1Var = (lo1) this.g;
                webView.requestLayout();
                webView.invalidate();
                webView.evaluateJavascript("(function() {\n  window.dispatchEvent(new Event('resize'));\n  if (window.visualViewport) window.visualViewport.dispatchEvent(new Event('resize'));\n})();", new ValueCallback() { // from class: eo1
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        webView.postDelayed(new e4(10, lo1Var), 120L);
                    }
                });
                return;
            default:
                WebView webView2 = (WebView) this.e;
                ao0 ao0Var = (ao0) this.g;
                webView2.stopLoading();
                webView2.loadUrl((String) ao0Var.getValue());
                return;
        }
    }
}
