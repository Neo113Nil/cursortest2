package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.firebase.messaging.Constants;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class fi3 implements Runnable {
    public final /* synthetic */ int m = 3;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public fi3(jm3 jm3Var, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.o = atomicReference;
        this.p = str;
        this.q = str2;
        this.n = z;
        Objects.requireNonNull(jm3Var);
        this.r = jm3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0153 A[Catch: RuntimeException -> 0x00e2, TryCatch #0 {RuntimeException -> 0x00e2, blocks: (B:34:0x0106, B:36:0x0111, B:39:0x011e, B:41:0x0124, B:42:0x013e, B:43:0x014b, B:47:0x0153, B:50:0x016a, B:51:0x0179, B:53:0x0171, B:54:0x018f, B:56:0x0195, B:58:0x019b, B:60:0x01a1, B:62:0x01a9, B:64:0x01b1, B:66:0x01b9, B:68:0x01bf, B:71:0x01d1, B:80:0x0099, B:82:0x00a1, B:84:0x00a7, B:86:0x00ad, B:88:0x00b3, B:90:0x00bb, B:92:0x00c3, B:94:0x00cb, B:96:0x00d3, B:97:0x00e9, B:99:0x00f7), top: B:79:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0148  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        cg3 cg3Var;
        zq3 zq3Var;
        vh3 vh3Var;
        Bundle w0;
        String str;
        CharSequence charSequence;
        int i = this.m;
        boolean z = this.n;
        Object obj = this.q;
        Object obj2 = this.p;
        Object obj3 = this.o;
        Object obj4 = this.r;
        switch (i) {
            case 0:
                ((dv) obj3).zza((Intent) obj2, (Context) obj, z, (BroadcastReceiver.PendingResult) obj4);
                break;
            case 1:
                jo3 p = ((AppMeasurementDynamiteService) obj4).g.p();
                p.v();
                p.x();
                p.K(new fn3(p, (String) obj2, (String) obj, p.M(false), this.n, (je3) obj3));
                break;
            case 2:
                jo3 p2 = ((pj3) ((jm3) obj4).m).p();
                p2.v();
                p2.x();
                p2.K(new fn3(p2, (AtomicReference) obj3, (String) obj2, (String) obj, p2.M(false), this.n));
                break;
            case 3:
                cg3 cg3Var2 = (cg3) obj4;
                jm3 jm3Var = (jm3) cg3Var2.n;
                jm3Var.v();
                pj3 pj3Var = (pj3) jm3Var.m;
                ti3 ti3Var = jm3Var.D;
                String str2 = (String) obj;
                Uri uri = (Uri) obj3;
                try {
                    zq3Var = pj3Var.u;
                    vh3Var = pj3Var.r;
                    pj3.k(zq3Var);
                } catch (RuntimeException e) {
                    e = e;
                    cg3Var = cg3Var2;
                }
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        if (!str2.contains("gclid")) {
                            cg3Var = cg3Var2;
                            try {
                                if (!str2.contains("gbraid") && !str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_id") && !str2.contains("dclid") && !str2.contains("srsltid") && !str2.contains("sfmc_id")) {
                                    vh3 vh3Var2 = ((pj3) zq3Var.m).r;
                                    pj3.m(vh3Var2);
                                    vh3Var2.y.b("Activity created with data 'referrer' without required params");
                                }
                            } catch (RuntimeException e2) {
                                e = e2;
                                cg3Var2 = cg3Var;
                                vh3 vh3Var3 = ((pj3) ((jm3) cg3Var2.n).m).r;
                                pj3.m(vh3Var3);
                                vh3Var3.r.c(e, "Throwable caught in handleReferrerForOnActivityCreated");
                                return;
                            }
                        }
                        w0 = zq3Var.w0(Uri.parse("https://google.com/search?".concat(str2)));
                        if (w0 != null) {
                            w0.putString("_cis", "referrer");
                        }
                        String str3 = (String) obj2;
                        if (!z) {
                            str = "Activity created with data 'referrer' without required params";
                            zq3 zq3Var2 = pj3Var.u;
                            pj3.k(zq3Var2);
                            Bundle w02 = zq3Var2.w0(uri);
                            if (w02 != null) {
                                w02.putString("_cis", SDKConstants.PARAM_INTENT);
                                if (w02.containsKey("gclid") || w0 == null || !w0.containsKey("gclid")) {
                                    charSequence = "utm_medium";
                                } else {
                                    charSequence = "utm_medium";
                                    w02.putString("_cer", "gclid=" + w0.getString("gclid"));
                                }
                                jm3Var.D(str3, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, w02);
                                ti3Var.c(w02, str3);
                                if (!TextUtils.isEmpty(str2)) {
                                    pj3.m(vh3Var);
                                    g10 g10Var = vh3Var.y;
                                    g10Var.c(str2, "Activity created with referrer");
                                    if (!pj3Var.p.G(null, ug3.G0)) {
                                        if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains(charSequence) && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                                            pj3.m(vh3Var);
                                            g10Var.b(str);
                                            break;
                                        } else if (!TextUtils.isEmpty(str2)) {
                                            pj3Var.w.getClass();
                                            jm3Var.G("auto", "_ldl", str2, true, System.currentTimeMillis());
                                            break;
                                        }
                                    } else {
                                        if (w0 != null) {
                                            jm3Var.D(str3, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, w0);
                                            ti3Var.c(w0, str3);
                                        } else {
                                            pj3.m(vh3Var);
                                            g10Var.c(str2, "Referrer does not contain valid parameters");
                                        }
                                        pj3Var.w.getClass();
                                        jm3Var.G("auto", "_ldl", null, true, System.currentTimeMillis());
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        } else {
                            str = "Activity created with data 'referrer' without required params";
                        }
                        charSequence = "utm_medium";
                        if (!TextUtils.isEmpty(str2)) {
                        }
                    }
                    w0 = null;
                    String str32 = (String) obj2;
                    if (!z) {
                    }
                    charSequence = "utm_medium";
                    if (!TextUtils.isEmpty(str2)) {
                    }
                } catch (RuntimeException e3) {
                    e = e3;
                    vh3 vh3Var32 = ((pj3) ((jm3) cg3Var2.n).m).r;
                    pj3.m(vh3Var32);
                    vh3Var32.r.c(e, "Throwable caught in handleReferrerForOnActivityCreated");
                    return;
                }
                break;
            default:
                jo3 jo3Var = (jo3) obj4;
                yg3 yg3Var = jo3Var.p;
                pj3 pj3Var2 = (pj3) jo3Var.m;
                if (yg3Var == null) {
                    vh3 vh3Var4 = pj3Var2.r;
                    pj3.m(vh3Var4);
                    vh3Var4.r.b("Failed to send default event parameters to service");
                    break;
                } else {
                    cs3 cs3Var = (cs3) obj3;
                    if (pj3Var2.p.G(null, ug3.b1)) {
                        jo3Var.O(yg3Var, z ? null : (jd3) obj2, cs3Var);
                        break;
                    } else {
                        try {
                            yg3Var.g((Bundle) obj, cs3Var);
                            jo3Var.J();
                            break;
                        } catch (RemoteException e4) {
                            vh3 vh3Var5 = pj3Var2.r;
                            pj3.m(vh3Var5);
                            vh3Var5.r.c(e4, "Failed to send default event parameters to service");
                        }
                    }
                }
        }
    }

    public fi3(AppMeasurementDynamiteService appMeasurementDynamiteService, je3 je3Var, String str, String str2, boolean z) {
        this.o = je3Var;
        this.p = str;
        this.q = str2;
        this.n = z;
        this.r = appMeasurementDynamiteService;
    }

    public fi3(cg3 cg3Var, boolean z, Uri uri, String str, String str2) {
        this.n = z;
        this.o = uri;
        this.p = str;
        this.q = str2;
        this.r = cg3Var;
    }

    public /* synthetic */ fi3(dv dvVar, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.o = dvVar;
        this.p = intent;
        this.q = context;
        this.n = z;
        this.r = pendingResult;
    }

    public fi3(jo3 jo3Var, cs3 cs3Var, boolean z, jd3 jd3Var, Bundle bundle) {
        this.o = cs3Var;
        this.n = z;
        this.p = jd3Var;
        this.q = bundle;
        Objects.requireNonNull(jo3Var);
        this.r = jo3Var;
    }
}
