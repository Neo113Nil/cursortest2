package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import java.util.HashMap;
import s2.BinderC4996d;

/* renamed from: com.google.android.gms.internal.ads.Zp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2902Zp implements DialogInterface.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29066n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f29067u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f29068v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f29069w;

    public /* synthetic */ DialogInterfaceOnClickListenerC2902Zp(BinderC2949aq binderC2949aq, Activity activity, BinderC4996d binderC4996d, int i) {
        this.f29066n = i;
        this.f29067u = binderC2949aq;
        this.f29068v = activity;
        this.f29069w = binderC4996d;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f29066n) {
            case 0:
                BinderC2949aq binderC2949aq = (BinderC2949aq) this.f29067u;
                binderC2949aq.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("dialog_action", "confirm");
                binderC2949aq.M3(binderC2949aq.f29335y, "rtsdc", hashMap);
                W3.e eVar = p2.j.f39798C.f39806f;
                Activity activity = (Activity) this.f29068v;
                activity.startActivity(eVar.C(activity));
                binderC2949aq.K3();
                BinderC4996d binderC4996d = (BinderC4996d) this.f29069w;
                if (binderC4996d != null) {
                    binderC4996d.z();
                    break;
                }
                break;
            case 1:
                BinderC2949aq binderC2949aq2 = (BinderC2949aq) this.f29067u;
                binderC2949aq2.getClass();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("dialog_action", "confirm");
                binderC2949aq2.M3(binderC2949aq2.f29335y, "dialog_click", hashMap2);
                binderC2949aq2.J3((Activity) this.f29068v, (BinderC4996d) this.f29069w);
                break;
            default:
                C2873Yd c2873Yd = (C2873Yd) this.f29069w;
                DownloadManager downloadManager = (DownloadManager) c2873Yd.f28839w.getSystemService("download");
                try {
                    String str = (String) this.f29067u;
                    String str2 = (String) this.f29068v;
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
                    t2.G g9 = p2.j.f39798C.f39803c;
                    request.allowScanningByMediaScanner();
                    request.setNotificationVisibility(1);
                    downloadManager.enqueue(request);
                    break;
                } catch (IllegalStateException unused) {
                    c2873Yd.t("Could not store picture.");
                }
        }
    }

    public DialogInterfaceOnClickListenerC2902Zp(C2873Yd c2873Yd, String str, String str2) {
        this.f29066n = 2;
        this.f29067u = str;
        this.f29068v = str2;
        this.f29069w = c2873Yd;
    }
}
