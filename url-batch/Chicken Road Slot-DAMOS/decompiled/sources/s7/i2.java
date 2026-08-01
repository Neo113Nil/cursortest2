package s7;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.f6;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i2 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8735d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8736e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f8737i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f8738r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f8739s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f8740t;

    public i2(q2 q2Var, AtomicReference atomicReference, String str, String str2, boolean z10) {
        this.f8739s = atomicReference;
        this.f8736e = str;
        this.f8737i = str2;
        this.f8738r = z10;
        Objects.requireNonNull(q2Var);
        this.f8740t = q2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010b A[Catch: RuntimeException -> 0x00e5, TRY_ENTER, TryCatch #1 {RuntimeException -> 0x00e5, blocks: (B:33:0x010b, B:35:0x0116, B:38:0x0123, B:40:0x0129, B:41:0x0143, B:42:0x014c, B:44:0x0152, B:47:0x016b, B:48:0x017a, B:50:0x0172, B:51:0x018d, B:53:0x0193, B:55:0x0199, B:57:0x019f, B:59:0x01a5, B:61:0x01ad, B:63:0x01b5, B:65:0x01bb, B:68:0x01cd, B:74:0x0094, B:76:0x009a, B:78:0x00a4, B:80:0x00aa, B:82:0x00b0, B:84:0x00b6, B:86:0x00be, B:88:0x00c6, B:90:0x00ce, B:92:0x00d6, B:93:0x00ec, B:95:0x00fa), top: B:73:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0152 A[Catch: RuntimeException -> 0x00e5, TryCatch #1 {RuntimeException -> 0x00e5, blocks: (B:33:0x010b, B:35:0x0116, B:38:0x0123, B:40:0x0129, B:41:0x0143, B:42:0x014c, B:44:0x0152, B:47:0x016b, B:48:0x017a, B:50:0x0172, B:51:0x018d, B:53:0x0193, B:55:0x0199, B:57:0x019f, B:59:0x01a5, B:61:0x01ad, B:63:0x01b5, B:65:0x01bb, B:68:0x01cd, B:74:0x0094, B:76:0x009a, B:78:0x00a4, B:80:0x00aa, B:82:0x00b0, B:84:0x00b6, B:86:0x00be, B:88:0x00c6, B:90:0x00ce, B:92:0x00d6, B:93:0x00ec, B:95:0x00fa), top: B:73:0x0094 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        com.google.firebase.messaging.k kVar;
        v0 v0Var;
        Bundle t02;
        String str;
        switch (this.f8735d) {
            case 0:
                l3 o6 = ((AppMeasurementDynamiteService) this.f8740t).f3062d.o();
                f6 f6Var = (f6) this.f8739s;
                String str2 = (String) this.f8736e;
                String str3 = (String) this.f8737i;
                o6.s();
                o6.t();
                o6.G(new c3(o6, str2, str3, o6.I(false), this.f8738r, f6Var));
                break;
            case 1:
                String str4 = (String) this.f8736e;
                String str5 = (String) this.f8737i;
                l3 o10 = ((q1) ((q2) this.f8740t).f1478d).o();
                AtomicReference atomicReference = (AtomicReference) this.f8739s;
                o10.s();
                o10.t();
                o10.G(new c3(o10, atomicReference, str4, str5, o10.I(false), this.f8738r));
                break;
            case 2:
                com.google.firebase.messaging.k kVar2 = (com.google.firebase.messaging.k) this.f8740t;
                q2 q2Var = (q2) kVar2.f3153e;
                q2Var.s();
                q1 q1Var = (q1) q2Var.f1478d;
                h1 h1Var = q2Var.E;
                String str6 = (String) this.f8737i;
                Uri uri = (Uri) this.f8739s;
                try {
                    p4 p4Var = q1Var.f8940w;
                    v0 v0Var2 = q1Var.f8937t;
                    q1.j(p4Var);
                    try {
                        kVar = kVar2;
                        if (TextUtils.isEmpty(str6)) {
                            v0Var = v0Var2;
                        } else {
                            try {
                                if (str6.contains("gclid")) {
                                    v0Var = v0Var2;
                                } else {
                                    v0Var = v0Var2;
                                    if (!str6.contains("gbraid") && !str6.contains("utm_campaign") && !str6.contains("utm_source") && !str6.contains("utm_medium") && !str6.contains("utm_id") && !str6.contains("dclid") && !str6.contains("srsltid") && !str6.contains("sfmc_id")) {
                                        v0 v0Var3 = ((q1) p4Var.f1478d).f8937t;
                                        q1.l(v0Var3);
                                        v0Var3.A.a("Activity created with data 'referrer' without required params");
                                    }
                                }
                                t02 = p4Var.t0(Uri.parse("https://google.com/search?".concat(str6)));
                                if (t02 != null) {
                                    t02.putString("_cis", "referrer");
                                }
                                String str7 = (String) this.f8736e;
                                if (this.f8738r) {
                                    p4 p4Var2 = q1Var.f8940w;
                                    q1.j(p4Var2);
                                    Bundle t03 = p4Var2.t0(uri);
                                    if (t03 != null) {
                                        t03.putString("_cis", "intent");
                                        if (t03.containsKey("gclid") || t02 == null || !t02.containsKey("gclid")) {
                                            str = "Activity created with data 'referrer' without required params";
                                        } else {
                                            str = "Activity created with data 'referrer' without required params";
                                            t03.putString("_cer", "gclid=" + t02.getString("gclid"));
                                        }
                                        q2Var.z(str7, "_cmp", t03);
                                        h1Var.c(str7, t03);
                                        if (!TextUtils.isEmpty(str6)) {
                                            q1.l(v0Var);
                                            v0 v0Var4 = v0Var;
                                            t0 t0Var = v0Var4.A;
                                            t0Var.b(str6, "Activity created with referrer");
                                            if (!q1Var.f8935r.D(null, e0.G0)) {
                                                if (!str6.contains("gclid") || (!str6.contains("utm_campaign") && !str6.contains("utm_source") && !str6.contains("utm_medium") && !str6.contains("utm_term") && !str6.contains("utm_content"))) {
                                                    q1.l(v0Var4);
                                                    t0Var.a(str);
                                                    break;
                                                } else if (!TextUtils.isEmpty(str6)) {
                                                    q1Var.f8942y.getClass();
                                                    q2Var.C("auto", "_ldl", str6, true, System.currentTimeMillis());
                                                    break;
                                                }
                                            } else {
                                                if (t02 != null) {
                                                    q2Var.z(str7, "_cmp", t02);
                                                    h1Var.c(str7, t02);
                                                } else {
                                                    q1.l(v0Var4);
                                                    t0Var.b(str6, "Referrer does not contain valid parameters");
                                                }
                                                q1Var.f8942y.getClass();
                                                q2Var.C("auto", "_ldl", null, true, System.currentTimeMillis());
                                                break;
                                            }
                                        }
                                    }
                                }
                                str = "Activity created with data 'referrer' without required params";
                                if (!TextUtils.isEmpty(str6)) {
                                }
                            } catch (RuntimeException e2) {
                                e = e2;
                                kVar2 = kVar;
                                v0 v0Var5 = ((q1) ((q2) kVar2.f3153e).f1478d).f8937t;
                                q1.l(v0Var5);
                                v0Var5.f9050t.b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                                return;
                            }
                        }
                        t02 = null;
                        String str72 = (String) this.f8736e;
                        if (this.f8738r) {
                        }
                        str = "Activity created with data 'referrer' without required params";
                        if (!TextUtils.isEmpty(str6)) {
                        }
                    } catch (RuntimeException e9) {
                        e = e9;
                        v0 v0Var52 = ((q1) ((q2) kVar2.f3153e).f1478d).f8937t;
                        q1.l(v0Var52);
                        v0Var52.f9050t.b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                        return;
                    }
                } catch (RuntimeException e10) {
                    e = e10;
                    kVar = kVar2;
                }
                break;
            default:
                l3 l3Var = (l3) this.f8740t;
                h0 h0Var = l3Var.f8813r;
                q1 q1Var2 = (q1) l3Var.f1478d;
                if (h0Var == null) {
                    v0 v0Var6 = q1Var2.f8937t;
                    q1.l(v0Var6);
                    v0Var6.f9050t.a("Failed to send default event parameters to service");
                    break;
                } else {
                    boolean D = q1Var2.f8935r.D(null, e0.W0);
                    r4 r4Var = (r4) this.f8739s;
                    if (D) {
                        l3Var.K(h0Var, this.f8738r ? null : (t) this.f8736e, r4Var);
                        break;
                    } else {
                        try {
                            h0Var.g((Bundle) this.f8737i, r4Var);
                            l3Var.F();
                            break;
                        } catch (RemoteException e11) {
                            v0 v0Var7 = q1Var2.f8937t;
                            q1.l(v0Var7);
                            v0Var7.f9050t.b(e11, "Failed to send default event parameters to service");
                        }
                    }
                }
        }
    }

    public i2(com.google.firebase.messaging.k kVar, boolean z10, Uri uri, String str, String str2) {
        this.f8738r = z10;
        this.f8739s = uri;
        this.f8736e = str;
        this.f8737i = str2;
        this.f8740t = kVar;
    }

    public i2(AppMeasurementDynamiteService appMeasurementDynamiteService, f6 f6Var, String str, String str2, boolean z10) {
        this.f8739s = f6Var;
        this.f8736e = str;
        this.f8737i = str2;
        this.f8738r = z10;
        this.f8740t = appMeasurementDynamiteService;
    }

    public i2(l3 l3Var, r4 r4Var, boolean z10, t tVar, Bundle bundle) {
        this.f8739s = r4Var;
        this.f8738r = z10;
        this.f8736e = tVar;
        this.f8737i = bundle;
        Objects.requireNonNull(l3Var);
        this.f8740t = l3Var;
    }
}
