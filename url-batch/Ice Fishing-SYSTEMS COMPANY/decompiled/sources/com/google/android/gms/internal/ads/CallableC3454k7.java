package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.StatFs;
import android.os.ext.SdkExtensions;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.CookieManager;
import android.widget.FrameLayout;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import q2.C4907p;
import t2.C5067a;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.k7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC3454k7 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32263b;

    public /* synthetic */ CallableC3454k7(int i, Object obj) {
        this.f32262a = i;
        this.f32263b = obj;
    }

    private final Object a() {
        q2.r rVar;
        String str;
        boolean z8;
        C2748Qo c2748Qo = (C2748Qo) ((C3278gs) this.f32263b).f31113c;
        synchronized (c2748Qo) {
            C3151ea c3151ea = AbstractC3368ia.ka;
            rVar = q2.r.f40116e;
            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && c2748Qo.f()) {
                long j9 = c2748Qo.f27232q;
                p2.j.f39798C.f39810k.getClass();
                if (j9 < System.currentTimeMillis() / 1000) {
                    c2748Qo.f27230o = "{}";
                    c2748Qo.f27232q = Long.MAX_VALUE;
                    str = "";
                } else if (!c2748Qo.f27230o.equals("{}")) {
                    str = c2748Qo.f27230o;
                }
            }
            str = "";
        }
        synchronized (c2748Qo) {
            z8 = c2748Qo.f27234s;
        }
        return new Cs(str, z8, p2.j.f39798C.f39814o.g(), c2748Qo.f27231p != null, c2748Qo.f27238w < ((Long) rVar.f40119c.a(AbstractC3368ia.Fa)).longValue());
    }

    private final Object b() {
        HashMap hashMap;
        C3758po c3758po = (C3758po) ((C3278gs) this.f32263b).f31113c;
        synchronized (c3758po) {
            hashMap = new HashMap();
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.H8)).booleanValue()) {
                c3758po.b();
                for (Map.Entry entry : c3758po.f33511a.entrySet()) {
                    hashMap.put((C3704oo) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
                }
            }
        }
        return new Fs(hashMap, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        if (((java.lang.Boolean) q2.r.f40116e.f40119c.a(com.google.android.gms.internal.ads.AbstractC3368ia.f31565U3)).booleanValue() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
    
        r9 = com.google.android.gms.internal.ads.Tx.f(r0);
        r11 = ((java.lang.Long) q2.r.f40116e.f40119c.a(com.google.android.gms.internal.ads.AbstractC3368ia.f31664f4)).longValue();
        r14 = p2.j.f39798C.f39808h.g().t();
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008b, code lost:
    
        monitor-enter(com.google.android.gms.internal.ads.Tx.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008e, code lost:
    
        r5 = r9.a(null, r11, null, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.Tx.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d7, code lost:
    
        if (((java.lang.Boolean) r6.f40119c.a(com.google.android.gms.internal.ads.AbstractC3368ia.f31573V3)).booleanValue() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00eb, code lost:
    
        r9 = com.google.android.gms.internal.ads.Ux.f(r0);
        r0 = com.google.android.gms.internal.ads.Rx.g(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0107, code lost:
    
        if (((u2.C5107a) r1.f27261e).f41219v < ((java.lang.Integer) r6.f40119c.a(com.google.android.gms.internal.ads.AbstractC3368ia.f31628b4)).intValue()) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0109, code lost:
    
        r11 = ((java.lang.Long) r6.f40119c.a(com.google.android.gms.internal.ads.AbstractC3368ia.f31673g4)).longValue();
        r14 = p2.j.f39798C.f39808h.g().t();
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0128, code lost:
    
        monitor-enter(com.google.android.gms.internal.ads.Ux.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0129, code lost:
    
        r5 = r9.f27655g;
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0130, code lost:
    
        monitor-enter(com.google.android.gms.internal.ads.Rx.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0131, code lost:
    
        r5 = ((android.content.SharedPreferences) ((com.google.android.gms.internal.ads.C2593Hm) r5.f27448u).f25416u).getBoolean("paidv2_publisher_option", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013f, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.Rx.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0140, code lost:
    
        if (r5 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0142, code lost:
    
        r5 = new com.google.android.gms.internal.ads.C3288h1(5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0148, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.Ux.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0149, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0155, code lost:
    
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015a, code lost:
    
        monitor-enter(com.google.android.gms.internal.ads.Rx.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x015b, code lost:
    
        r6 = ((android.content.SharedPreferences) ((com.google.android.gms.internal.ads.C2593Hm) r0.f27448u).f25416u).getBoolean("paidv2_publisher_option", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0169, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.Rx.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0174, code lost:
    
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0179, code lost:
    
        monitor-enter(com.google.android.gms.internal.ads.Rx.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x017a, code lost:
    
        r4 = ((android.content.SharedPreferences) ((com.google.android.gms.internal.ads.C2593Hm) r0.f27448u).f25416u).getBoolean("paidv2_user_option", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0188, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.Rx.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0189, code lost:
    
        r5 = r3;
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014d, code lost:
    
        r5 = r9.a(null, r11, null, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0153, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.Ux.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0172, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0173, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e9, code lost:
    
        if (((java.lang.Boolean) r6.f40119c.a(com.google.android.gms.internal.ads.AbstractC3368ia.f31591X3)).booleanValue() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0064, code lost:
    
        if (((java.lang.Boolean) q2.r.f40116e.f40119c.a(com.google.android.gms.internal.ads.AbstractC3368ia.f31582W3)).booleanValue() != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object c() {
        Qr qr = (Qr) this.f32263b;
        qr.getClass();
        try {
            Context context = (Context) qr.f27259c;
            boolean a9 = ((C3226fu) qr.f27258b).a();
            C3288h1 c3288h1 = new C3288h1(5);
            C3288h1 c3288h12 = new C3288h1(5);
            if (a9) {
                if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31599Y3)).booleanValue()) {
                    return new Hs(true);
                }
            }
            if (!a9) {
            }
            if (a9) {
            }
            C3151ea c3151ea = AbstractC3368ia.c4;
            q2.r rVar = q2.r.f40116e;
            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                if (((C5107a) qr.f27261e).f41219v < ((Integer) rVar.f40119c.a(AbstractC3368ia.f31628b4)).intValue()) {
                    Ux.f(context).g();
                }
            }
            if (!a9) {
            }
            if (a9) {
            }
            C3288h1 c3288h13 = c3288h12;
            boolean z8 = true;
            boolean z9 = true;
            return new Hs(c3288h1, c3288h13, z8, z9, a9);
        } catch (IOException e6) {
            p2.j.f39798C.f39808h.d("PerAppIdSignal", e6);
            return new Hs(((C3226fu) qr.f27258b).a());
        }
    }

    private final Object d() {
        Qr qr = (Qr) this.f32263b;
        Context context = (Context) qr.f27259c;
        boolean f6 = U2.c.a(context).f();
        t2.G g9 = p2.j.f39798C.f39803c;
        boolean f9 = t2.G.f(context);
        String str = ((C5107a) qr.f27258b).f41217n;
        int myUid = Process.myUid();
        boolean z8 = myUid == 0 || myUid == 1000;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return new Os(f6, f9, str, z8, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, W2.c.d(context, false), W2.c.a(context), (String) qr.f27261e);
    }

    private final Object e() {
        C3169es c3169es = (C3169es) this.f32263b;
        c3169es.getClass();
        return new C3060cs(3, com.bumptech.glide.h.F(c3169es.f30524c, (String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31611Z6)));
    }

    private final Object f() {
        Context context = ((C3169es) this.f32263b).f30524c;
        return new Ss(AbstractC3194fG.A(context, "init_without_write"), AbstractC3194fG.A(context, "crash_without_write"));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:3|(2:6|4)|7|8|(3:71|72|(24:74|75|76|77|78|12|13|(20:15|16|17|18|19|20|(1:22)(3:59|(1:61)|62)|23|(3:26|(3:29|(11:32|33|34|(1:56)(1:38)|39|(2:41|(1:43)(1:54))(1:55)|44|(1:46)(1:53)|(1:48)(1:52)|49|50)(1:31)|27)|57)|58|34|(1:36)|56|39|(0)(0)|44|(0)(0)|(0)(0)|49|50)|67|20|(0)(0)|23|(3:26|(1:27)|57)|58|34|(0)|56|39|(0)(0)|44|(0)(0)|(0)(0)|49|50))|10|11|12|13|(0)|67|20|(0)(0)|23|(0)|58|34|(0)|56|39|(0)(0)|44|(0)(0)|(0)(0)|49|50) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0117, code lost:
    
        r22 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e5 A[Catch: Exception -> 0x0117, TRY_LEAVE, TryCatch #10 {Exception -> 0x0117, blocks: (B:13:0x00d7, B:15:0x00e5), top: B:12:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x017e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:285:0x0684 -> B:273:0x0690). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        long j9;
        String str;
        byte[] bArr;
        AbstractC4000uE abstractC4000uE;
        Bundle bundle;
        InterfaceC3531ld interfaceC3531ld;
        int i;
        int i4;
        int extensionVersion;
        int extensionVersion2;
        boolean z8;
        int i9;
        int i10;
        boolean z9;
        int intExtra;
        boolean z10;
        int intExtra2;
        JSONObject jSONObject;
        String str2;
        String str3;
        Bundle bundle2;
        Boolean bool;
        FrameLayout frameLayout;
        ActivityInfo activityInfo;
        int i11;
        int i12;
        PackageInfo e6;
        String sb;
        String str4;
        C3151ea c3151ea;
        q2.r rVar;
        String str5;
        String str6;
        List<ResolveInfo> queryIntentActivities;
        boolean z11;
        int i13;
        PackageInfo e9;
        int i14 = 2;
        int i15 = 3;
        int i16 = 0;
        switch (this.f32262a) {
            case 0:
                Context context = (Context) this.f32263b;
                try {
                    return PA.h(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                } catch (Throwable unused) {
                    return null;
                }
            case 1:
                Context context2 = ((C2892Zf) this.f32263b).f29016e;
                int i17 = AbstractC2789Te.f27792a;
                Context applicationContext = context2.getApplicationContext();
                if (applicationContext != null) {
                    context2 = applicationContext;
                }
                ArrayList arrayList = new ArrayList();
                try {
                    PackageInfo e10 = U2.c.a(context2).e(4096, context2.getApplicationInfo().packageName);
                    if (e10.requestedPermissions != null && e10.requestedPermissionsFlags != null) {
                        while (true) {
                            String[] strArr = e10.requestedPermissions;
                            if (i16 < strArr.length) {
                                if ((e10.requestedPermissionsFlags[i16] & 2) != 0) {
                                    arrayList.add(strArr[i16]);
                                }
                                i16++;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                return arrayList;
            case 2:
                C2638Kg c2638Kg = (C2638Kg) this.f32263b;
                return Boolean.valueOf(c2638Kg.f25998w.d(c2638Kg.f25999x, c2638Kg.f26000y, c2638Kg));
            case 3:
                C2995bh c2995bh = (C2995bh) this.f32263b;
                c2995bh.getClass();
                Q8 q82 = p2.j.f39798C.f39809j;
                U8 u82 = c2995bh.f29540G;
                synchronized (q82.f27121v) {
                    try {
                        j9 = -2;
                        if (((V8) q82.f27124y) != null) {
                            if (((T8) q82.f27122w).A()) {
                                try {
                                    V8 v82 = (V8) q82.f27124y;
                                    Parcel A02 = v82.A0();
                                    AbstractC3241g8.c(A02, u82);
                                    Parcel D02 = v82.D0(A02, 3);
                                    long readLong = D02.readLong();
                                    D02.recycle();
                                    j9 = readLong;
                                } catch (RemoteException e11) {
                                    int i18 = t2.C.f40822b;
                                    u2.i.d("Unable to call into cache service.", e11);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return Long.valueOf(j9);
            case 4:
                CookieManager cookieManager = (CookieManager) this.f32263b;
                return cookieManager == null ? "" : cookieManager.getCookie((String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31808v1));
            case 5:
                return ((C2715Op) this.f32263b).getWritableDatabase();
            case 6:
                return ((C2834Vp) this.f32263b).getWritableDatabase();
            case 7:
                Qr qr = (Qr) this.f32263b;
                qr.getClass();
                ArrayList arrayList2 = new ArrayList();
                View view = (ViewGroup) qr.f27261e;
                while (view != null) {
                    Object parent = view.getParent();
                    if (parent != null) {
                        int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("type", parent.getClass().getName());
                        bundle3.putInt("index_of_child", indexOfChild);
                        arrayList2.add(bundle3);
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                    }
                    return new Rr((Context) qr.f27259c, ((C3226fu) qr.f27258b).f30903f, arrayList2, i16);
                }
                return new Rr((Context) qr.f27259c, ((C3226fu) qr.f27258b).f30903f, arrayList2, i16);
            case 8:
                Ur ur = (Ur) this.f32263b;
                ur.getClass();
                C3151ea c3151ea2 = AbstractC3368ia.f31577V7;
                q2.r rVar2 = q2.r.f40116e;
                if (((Boolean) rVar2.f40119c.a(c3151ea2)).booleanValue()) {
                    if ((((Boolean) rVar2.f40119c.a(AbstractC3368ia.f31595X7)).booleanValue() ? Arrays.asList(((String) rVar2.f40119c.a(AbstractC3368ia.f31603Y7)).split(",")) : Arrays.asList(((String) rVar2.f40119c.a(AbstractC3368ia.f31586W7)).split(","))).contains(K3.b.I(K3.b.J(ur.f28100c.f30901d)))) {
                        try {
                            C3409jG c3409jG = C3409jG.f32096b;
                            synchronized (c3409jG) {
                                HashMap hashMap = c3409jG.f32097a;
                                if (!hashMap.containsKey("AES128_GCM")) {
                                    throw new GeneralSecurityException("Name AES128_GCM does not exist");
                                }
                                abstractC4000uE = (AbstractC4000uE) hashMap.get("AES128_GCM");
                            }
                            if (abstractC4000uE == null) {
                                try {
                                    abstractC4000uE = AbstractC4161xD.h(((CG) C3517lG.f32558b.h(null)).f24159b.b());
                                } catch (GeneralSecurityException e12) {
                                    throw new B0.c("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e12);
                                }
                            }
                            C2593Hm y6 = C2593Hm.y(abstractC4000uE);
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    y6.h().c(byteArrayOutputStream);
                                    byteArrayOutputStream.close();
                                    bArr = byteArrayOutputStream.toByteArray();
                                } catch (Throwable th) {
                                    byteArrayOutputStream.close();
                                    throw th;
                                }
                            } catch (IOException unused3) {
                                throw new GeneralSecurityException("Serialize keyset failed");
                            }
                        } catch (GeneralSecurityException e13) {
                            t2.C.k("Failed to generate key".concat(e13.toString()));
                            p2.j.f39798C.f39808h.d("CryptoUtils.generateKey", e13);
                            bArr = new byte[0];
                        }
                        str = Base64.encodeToString(bArr, 11);
                        return new Vr(str, i16);
                    }
                }
                str = null;
                return new Vr(str, i16);
            case 9:
                Qr qr2 = (Qr) this.f32263b;
                qr2.getClass();
                List<String> asList = Arrays.asList(((String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31597Y1)).split(";"));
                Bundle bundle4 = new Bundle();
                for (String str7 : asList) {
                    try {
                        C3656nu a9 = ((C2781Sn) qr2.f27259c).a(str7, new JSONObject());
                        a9.a();
                        boolean z12 = ((C2527Do) qr2.f27258b).f24556b;
                        bundle = new Bundle();
                        boolean booleanValue = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.cd)).booleanValue();
                        interfaceC3531ld = a9.f33064a;
                        if (!booleanValue || z12) {
                            try {
                                C2754Rd n02 = interfaceC3531ld.n0();
                                if (n02 != null) {
                                    try {
                                        bundle.putString(com.anythink.expressad.foundation.g.a.bs, n02.toString());
                                    } catch (C3334hu unused4) {
                                    }
                                }
                            } catch (Throwable th2) {
                                throw new C3334hu(th2);
                                break;
                            }
                        }
                    } catch (C3334hu unused5) {
                    }
                    try {
                        C2754Rd K8 = interfaceC3531ld.K();
                        if (K8 != null) {
                            try {
                                bundle.putString("adapter_version", K8.toString());
                            } catch (C3334hu unused6) {
                            }
                        }
                        bundle4.putBundle(str7, bundle);
                    } catch (Throwable th3) {
                        throw new C3334hu(th3);
                        break;
                    }
                }
                C3060cs c3060cs = new C3060cs(0, bundle4);
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.cd)).booleanValue()) {
                    ((C3114ds) qr2.f27261e).f30251b = c3060cs;
                }
                return c3060cs;
            case 10:
                ContentResolver contentResolver = (ContentResolver) this.f32263b;
                return new C3224fs(i16, Settings.Secure.getString(contentResolver, "advertising_id"), Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 0) == 1);
            case 11:
                Wr wr = (Wr) this.f32263b;
                return new C3224fs(i14, ((C3226fu) wr.f28481c).f30907k, ((C2994bg) wr.f28482d).f29533z);
            case 12:
                C5107a c5107a = (C5107a) ((C3278gs) this.f32263b).f31113c;
                C3151ea c3151ea3 = AbstractC3368ia.vb;
                SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = q2.r.f40116e.f40119c;
                if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea3)).booleanValue()) {
                    return new C3600ms(0, null);
                }
                t2.G g9 = p2.j.f39798C.f39803c;
                try {
                    i4 = Build.VERSION.SDK_INT;
                } catch (Exception e14) {
                    p2.j.f39798C.f39808h.d("AdUtil.getAdServicesExtensionVersion", e14);
                }
                if (i4 >= 30) {
                    extensionVersion2 = SdkExtensions.getExtensionVersion(30);
                    if (extensionVersion2 > 3) {
                        i = SdkExtensions.getExtensionVersion(1000000);
                        return new C3600ms(0, Integer.valueOf(i));
                    }
                }
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.yb)).booleanValue() && c5107a.f41219v >= ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.xb)).intValue() && i4 >= 31) {
                    extensionVersion = SdkExtensions.getExtensionVersion(31);
                    if (extensionVersion >= 9) {
                        i = SdkExtensions.getExtensionVersion(31);
                        return new C3600ms(0, Integer.valueOf(i));
                    }
                }
                i = 0;
                return new C3600ms(0, Integer.valueOf(i));
            case 13:
                AudioManager audioManager = (AudioManager) ((C3169es) this.f32263b).f30524c.getSystemService(com.anythink.basead.exoplayer.k.o.f8602b);
                p2.j jVar = p2.j.f39798C;
                float a10 = jVar.i.a();
                C5067a c5067a = jVar.i;
                synchronized (c5067a) {
                    z8 = c5067a.f40873a;
                }
                if (audioManager == null) {
                    return new C3654ns(-1, false, false, -1, -1, -1, -1, -1, a10, z8, true);
                }
                int mode = audioManager.getMode();
                boolean isMusicActive = audioManager.isMusicActive();
                boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
                int streamVolume = audioManager.getStreamVolume(3);
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.sc)).booleanValue()) {
                    i9 = jVar.f39806f.E(audioManager);
                    i10 = audioManager.getStreamMaxVolume(3);
                } else {
                    i9 = -1;
                    i10 = -1;
                }
                return new C3654ns(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i9, i10, audioManager.getRingerMode(), audioManager.getStreamVolume(2), a10, z8, false);
            case 14:
                C3169es c3169es = (C3169es) this.f32263b;
                c3169es.getClass();
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.wd)).booleanValue()) {
                    BatteryManager batteryManager = (BatteryManager) c3169es.f30524c.getSystemService("batterymanager");
                    r9 = batteryManager != null ? batteryManager.getIntProperty(4) / 100.0d : -1.0d;
                    if (batteryManager != null) {
                        z10 = batteryManager.isCharging();
                        return new C3708os(z10, r9);
                    }
                    Intent b9 = c3169es.b();
                    z9 = b9 != null && ((intExtra2 = b9.getIntExtra("status", -1)) == 2 || intExtra2 == 5);
                } else {
                    Intent b10 = c3169es.b();
                    z9 = b10 != null && ((intExtra = b10.getIntExtra("status", -1)) == 2 || intExtra == 5);
                    if (b10 != null) {
                        r9 = b10.getIntExtra("level", -1) / b10.getIntExtra("scale", -1);
                    }
                }
                z10 = z9;
                return new C3708os(z10, r9);
            case 15:
                Qr qr3 = (Qr) this.f32263b;
                C3226fu c3226fu = (C3226fu) qr3.f27258b;
                C2815Un c2815Un = (C2815Un) qr3.f27259c;
                c2815Un.getClass();
                C3151ea c3151ea4 = AbstractC3368ia.f31566U4;
                q2.r rVar3 = q2.r.f40116e;
                boolean booleanValue2 = ((Boolean) rVar3.f40119c.a(c3151ea4)).booleanValue();
                SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2 = rVar3.f40119c;
                if (booleanValue2 && (str2 = c3226fu.f30904g) != null && (str3 = (String) qr3.f27261e) != null) {
                    if (!c2815Un.f28082d) {
                        c2815Un.a();
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2.a(AbstractC3368ia.f31574V4)).booleanValue() && !c2815Un.f28084f.getAndSet(true)) {
                            p2.j.f39798C.f39808h.g().f40832c.add(new RunnableC2798Tn(c2815Un, 0));
                        }
                    }
                    Map map = (Map) c2815Un.f28079a.get(str3);
                    if (map != null) {
                        JSONObject jSONObject2 = (JSONObject) map.get(str2);
                        if (jSONObject2 != null) {
                            jSONObject = jSONObject2;
                        } else {
                            String j10 = PA.j(c2815Un.f28083e, str2, str3);
                            if (j10 != null) {
                                jSONObject = (JSONObject) map.get(j10);
                            }
                        }
                        return new C4031us(i16, jSONObject, ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2.a(AbstractC3368ia.f31583W4)).booleanValue() ? null : c2815Un.f28080b);
                    }
                }
                jSONObject = null;
                return new C4031us(i16, jSONObject, ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2.a(AbstractC3368ia.f31583W4)).booleanValue() ? null : c2815Un.f28080b);
            case 16:
                C3169es c3169es2 = (C3169es) this.f32263b;
                c3169es2.getClass();
                t2.G g10 = p2.j.f39798C.f39803c;
                C3151ea c3151ea5 = AbstractC3368ia.f31585W6;
                q2.r rVar4 = q2.r.f40116e;
                boolean booleanValue3 = ((Boolean) rVar4.f40119c.a(c3151ea5)).booleanValue();
                Context context3 = c3169es2.f30524c;
                String string = !booleanValue3 ? "" : context3.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
                C3151ea c3151ea6 = AbstractC3368ia.f31602Y6;
                SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga3 = rVar4.f40119c;
                String string2 = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga3.a(c3151ea6)).booleanValue() ? context3.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga3.a(AbstractC3368ia.f31594X6)).booleanValue()) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context3);
                    bundle2 = new Bundle();
                    if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                        bundle2.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
                    }
                    String[] strArr2 = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
                    while (i16 < 4) {
                        String str8 = strArr2[i16];
                        if (defaultSharedPreferences.contains(str8)) {
                            bundle2.putString(str8, defaultSharedPreferences.getString(str8, null));
                        }
                        i16++;
                    }
                } else {
                    bundle2 = null;
                }
                return new C4301zs(string, string2, bundle2);
            case 17:
                C3169es c3169es3 = (C3169es) this.f32263b;
                c3169es3.getClass();
                t2.G g11 = p2.j.f39798C.f39803c;
                Object systemService = c3169es3.f30524c.getSystemService("display");
                return new C3600ms(1, systemService instanceof DisplayManager ? Integer.valueOf(((DisplayManager) systemService).getDisplays().length) : null);
            case 18:
                return new Pr(2, "requester_type_2".equals(K3.b.J(((Ur) this.f32263b).f28100c.f30901d)));
            case 19:
                Qr qr4 = (Qr) this.f32263b;
                qr4.getClass();
                C3151ea c3151ea7 = AbstractC3368ia.f31516O6;
                q2.r rVar5 = q2.r.f40116e;
                boolean booleanValue4 = ((Boolean) rVar5.f40119c.a(c3151ea7)).booleanValue();
                Set set = (Set) qr4.f27261e;
                if (booleanValue4 && (frameLayout = (FrameLayout) qr4.f27258b) != null && set.contains(com.anythink.expressad.foundation.g.a.f.f19281e)) {
                    return new Bs(Boolean.valueOf(frameLayout.isHardwareAccelerated()), 0);
                }
                if (((Boolean) rVar5.f40119c.a(AbstractC3368ia.f31524P6)).booleanValue() && set.contains(com.anythink.expressad.foundation.g.a.f.f19277a)) {
                    Context context4 = (Context) qr4.f27259c;
                    if (context4 instanceof Activity) {
                        Activity activity = (Activity) context4;
                        Window window = activity.getWindow();
                        if (window == null || (window.getAttributes().flags & com.anythink.basead.exoplayer.b.bc) == 0) {
                            try {
                                bool = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                            } catch (PackageManager.NameNotFoundException unused7) {
                                bool = null;
                            }
                        } else {
                            bool = Boolean.TRUE;
                        }
                        return new Bs(bool, 0);
                    }
                }
                return new Bs(null, 0);
            case 20:
                return a();
            case 21:
                Qr qr5 = (Qr) this.f32263b;
                return new Rr((C3226fu) qr5.f27258b, (PackageInfo) qr5.f27259c, (t2.E) qr5.f27261e, 1);
            case 22:
                ((C3923ss) this.f32263b).getClass();
                C3151ea c3151ea8 = AbstractC3368ia.f31685h6;
                q2.r rVar6 = q2.r.f40116e;
                if (!((Boolean) rVar6.f40119c.a(c3151ea8)).booleanValue()) {
                    return new Vr(null, i15);
                }
                if (!((Boolean) rVar6.f40119c.a(AbstractC3368ia.q6)).booleanValue()) {
                    p2.j.f39798C.f39823x.getClass();
                    return new Vr(C3431jl.g(), i15);
                }
                if (C3923ss.f34321c == null) {
                    p2.j.f39798C.f39823x.getClass();
                    C3923ss.f34321c = C3431jl.g();
                }
                return new Vr(C3923ss.f34321c, i15);
            case 23:
                return b();
            case 24:
                return c();
            case 25:
                Wr wr2 = (Wr) this.f32263b;
                C2569Gf c2569Gf = (C2569Gf) wr2.f28480b;
                Context context5 = (Context) wr2.f28482d;
                if (!c2569Gf.a(context5)) {
                    return new Ns(null, null, null, null, null);
                }
                String b11 = c2569Gf.b(context5);
                String str9 = b11 == null ? "" : b11;
                String c4 = c2569Gf.c(context5);
                String str10 = c4 == null ? "" : c4;
                String d2 = c2569Gf.d(context5);
                String str11 = d2 == null ? "" : d2;
                String str12 = true != c2569Gf.a(context5) ? null : "fa";
                return new Ns(str9, str10, str11, str12 == null ? "" : str12, "TIME_OUT".equals(str10) ? (Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31535R0) : null);
            case 26:
                return d();
            case 27:
                return e();
            case 28:
                return f();
            default:
                Qr qr6 = (Qr) this.f32263b;
                Context context6 = (Context) qr6.f27259c;
                PackageManager packageManager = context6.getPackageManager();
                Locale locale = Locale.getDefault();
                ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=donuts")), com.anythink.basead.exoplayer.b.aX);
                ResolveInfo resolveActivity2 = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com")), com.anythink.basead.exoplayer.b.aX);
                String country = locale.getCountry();
                t2.G g12 = p2.j.f39798C.f39803c;
                u2.d dVar = C4907p.f40108g.f40109a;
                boolean r9 = u2.d.r();
                boolean h9 = S2.b.h(context6);
                boolean k6 = S2.b.k(context6);
                String language = locale.getLanguage();
                ArrayList arrayList3 = new ArrayList();
                LocaleList localeList = LocaleList.getDefault();
                for (int i19 = 0; i19 < localeList.size(); i19++) {
                    arrayList3.add(localeList.get(i19).getLanguage());
                }
                ResolveInfo resolveActivity3 = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.gms.ads")), com.anythink.basead.exoplayer.b.aX);
                if (resolveActivity3 != null && (activityInfo = resolveActivity3.activityInfo) != null) {
                    try {
                        e6 = U2.c.a(context6).e(0, activityInfo.packageName);
                    } catch (PackageManager.NameNotFoundException unused8) {
                        i11 = 1;
                    }
                    if (e6 != null) {
                        int i20 = e6.versionCode;
                        String str13 = activityInfo.packageName;
                        i11 = 1;
                        try {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i20).length() + 1 + String.valueOf(str13).length());
                            sb2.append(i20);
                            sb2.append(com.anythink.core.common.d.j.f12535z);
                            sb2.append(str13);
                            sb = sb2.toString();
                            i12 = 1;
                        } catch (PackageManager.NameNotFoundException unused9) {
                            i12 = i11;
                            sb = null;
                            e9 = U2.c.a(context6).e(128, "com.android.vending");
                            if (e9 != null) {
                            }
                            str4 = null;
                            String str14 = Build.FINGERPRINT;
                            String language2 = Locale.getDefault().getLanguage();
                            c3151ea = AbstractC3368ia.Ue;
                            rVar = q2.r.f40116e;
                            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                            }
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                            ResolveInfo resolveActivity4 = packageManager.resolveActivity(intent, 0);
                            queryIntentActivities = packageManager.queryIntentActivities(intent, com.anythink.basead.exoplayer.b.aX);
                            if (queryIntentActivities != null) {
                            }
                            z11 = false;
                            t2.G g13 = p2.j.f39798C.f39803c;
                            long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                            C3151ea c3151ea9 = AbstractC3368ia.Lc;
                            q2.r rVar7 = q2.r.f40116e;
                            if (((Boolean) rVar7.f40119c.a(c3151ea9)).booleanValue()) {
                            }
                            C3151ea c3151ea10 = AbstractC3368ia.Pc;
                            SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga4 = rVar7.f40119c;
                            String j11 = !((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga4.a(c3151ea10)).booleanValue() ? ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga4.a(AbstractC3368ia.Rc)).booleanValue() ? (String) qr6.f27261e : u2.d.j(context6) : "";
                            if (resolveActivity2 == null) {
                            }
                            if (resolveActivity == null) {
                            }
                            String str15 = Build.MODEL;
                            return new Ts(r13, r14, country, r9, h9, k6, language, arrayList3, sb, str4, z11, availableBytes, r26, j11, Build.VERSION.SDK_INT, str5, str6, ((C3221fp) qr6.f27258b).a());
                        }
                        e9 = U2.c.a(context6).e(128, "com.android.vending");
                        if (e9 != null) {
                            int i21 = e9.versionCode;
                            String str16 = e9.packageName;
                            int i22 = i12;
                            try {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(i21).length() + i12 + String.valueOf(str16).length());
                                sb3.append(i21);
                                sb3.append(com.anythink.core.common.d.j.f12535z);
                                sb3.append(str16);
                                str4 = sb3.toString();
                                i12 = i22;
                            } catch (Exception unused10) {
                                i12 = i22;
                                str4 = null;
                                String str142 = Build.FINGERPRINT;
                                String language22 = Locale.getDefault().getLanguage();
                                c3151ea = AbstractC3368ia.Ue;
                                rVar = q2.r.f40116e;
                                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                                }
                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                                ResolveInfo resolveActivity42 = packageManager.resolveActivity(intent2, 0);
                                queryIntentActivities = packageManager.queryIntentActivities(intent2, com.anythink.basead.exoplayer.b.aX);
                                if (queryIntentActivities != null) {
                                }
                                z11 = false;
                                t2.G g132 = p2.j.f39798C.f39803c;
                                long availableBytes2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                                C3151ea c3151ea92 = AbstractC3368ia.Lc;
                                q2.r rVar72 = q2.r.f40116e;
                                if (((Boolean) rVar72.f40119c.a(c3151ea92)).booleanValue()) {
                                }
                                C3151ea c3151ea102 = AbstractC3368ia.Pc;
                                SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga42 = rVar72.f40119c;
                                String j112 = !((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga42.a(c3151ea102)).booleanValue() ? ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga42.a(AbstractC3368ia.Rc)).booleanValue() ? (String) qr6.f27261e : u2.d.j(context6) : "";
                                if (resolveActivity2 == null) {
                                }
                                if (resolveActivity == null) {
                                }
                                String str152 = Build.MODEL;
                                return new Ts(r13, r14, country, r9, h9, k6, language, arrayList3, sb, str4, z11, availableBytes2, r26, j112, Build.VERSION.SDK_INT, str5, str6, ((C3221fp) qr6.f27258b).a());
                            }
                            String str1422 = Build.FINGERPRINT;
                            String language222 = Locale.getDefault().getLanguage();
                            c3151ea = AbstractC3368ia.Ue;
                            rVar = q2.r.f40116e;
                            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                                S0.c I2 = t2.G.I(context6);
                                String str17 = (String) I2.f2886u;
                                str6 = (String) I2.f2887v;
                                str5 = str17;
                            } else {
                                if (((Boolean) rVar.f40119c.a(AbstractC3368ia.Te)).booleanValue()) {
                                    language222 = (String) t2.G.I(context6).f2886u;
                                }
                                str5 = language222;
                                str6 = null;
                            }
                            Intent intent22 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                            ResolveInfo resolveActivity422 = packageManager.resolveActivity(intent22, 0);
                            queryIntentActivities = packageManager.queryIntentActivities(intent22, com.anythink.basead.exoplayer.b.aX);
                            if (queryIntentActivities != null && resolveActivity422 != null) {
                                for (i13 = 0; i13 < queryIntentActivities.size(); i13 += i12) {
                                    if (resolveActivity422.activityInfo.name.equals(queryIntentActivities.get(i13).activityInfo.name)) {
                                        z11 = resolveActivity422.activityInfo.packageName.equals(XC.c(context6));
                                        t2.G g1322 = p2.j.f39798C.f39803c;
                                        long availableBytes22 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                                        C3151ea c3151ea922 = AbstractC3368ia.Lc;
                                        q2.r rVar722 = q2.r.f40116e;
                                        boolean z13 = (((Boolean) rVar722.f40119c.a(c3151ea922)).booleanValue() || !t2.G.d(context6)) ? 0 : i12;
                                        C3151ea c3151ea1022 = AbstractC3368ia.Pc;
                                        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga422 = rVar722.f40119c;
                                        String j1122 = !((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga422.a(c3151ea1022)).booleanValue() ? ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga422.a(AbstractC3368ia.Rc)).booleanValue() ? (String) qr6.f27261e : u2.d.j(context6) : "";
                                        boolean z14 = resolveActivity2 == null ? i12 : 0;
                                        boolean z15 = resolveActivity == null ? i12 : 0;
                                        String str1522 = Build.MODEL;
                                        return new Ts(z15, z14, country, r9, h9, k6, language, arrayList3, sb, str4, z11, availableBytes22, z13, j1122, Build.VERSION.SDK_INT, str5, str6, ((C3221fp) qr6.f27258b).a());
                                    }
                                }
                            }
                            z11 = false;
                            t2.G g13222 = p2.j.f39798C.f39803c;
                            long availableBytes222 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                            C3151ea c3151ea9222 = AbstractC3368ia.Lc;
                            q2.r rVar7222 = q2.r.f40116e;
                            if (((Boolean) rVar7222.f40119c.a(c3151ea9222)).booleanValue()) {
                            }
                            C3151ea c3151ea10222 = AbstractC3368ia.Pc;
                            SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga4222 = rVar7222.f40119c;
                            String j11222 = !((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga4222.a(c3151ea10222)).booleanValue() ? ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga4222.a(AbstractC3368ia.Rc)).booleanValue() ? (String) qr6.f27261e : u2.d.j(context6) : "";
                            if (resolveActivity2 == null) {
                            }
                            if (resolveActivity == null) {
                            }
                            String str15222 = Build.MODEL;
                            return new Ts(z15, z14, country, r9, h9, k6, language, arrayList3, sb, str4, z11, availableBytes222, z13, j11222, Build.VERSION.SDK_INT, str5, str6, ((C3221fp) qr6.f27258b).a());
                        }
                        str4 = null;
                        String str14222 = Build.FINGERPRINT;
                        String language2222 = Locale.getDefault().getLanguage();
                        c3151ea = AbstractC3368ia.Ue;
                        rVar = q2.r.f40116e;
                        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                        }
                        Intent intent222 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                        ResolveInfo resolveActivity4222 = packageManager.resolveActivity(intent222, 0);
                        queryIntentActivities = packageManager.queryIntentActivities(intent222, com.anythink.basead.exoplayer.b.aX);
                        if (queryIntentActivities != null) {
                            while (i13 < queryIntentActivities.size()) {
                            }
                        }
                        z11 = false;
                        t2.G g132222 = p2.j.f39798C.f39803c;
                        long availableBytes2222 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                        C3151ea c3151ea92222 = AbstractC3368ia.Lc;
                        q2.r rVar72222 = q2.r.f40116e;
                        if (((Boolean) rVar72222.f40119c.a(c3151ea92222)).booleanValue()) {
                        }
                        C3151ea c3151ea102222 = AbstractC3368ia.Pc;
                        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga42222 = rVar72222.f40119c;
                        String j112222 = !((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga42222.a(c3151ea102222)).booleanValue() ? ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga42222.a(AbstractC3368ia.Rc)).booleanValue() ? (String) qr6.f27261e : u2.d.j(context6) : "";
                        if (resolveActivity2 == null) {
                        }
                        if (resolveActivity == null) {
                        }
                        String str152222 = Build.MODEL;
                        return new Ts(z15, z14, country, r9, h9, k6, language, arrayList3, sb, str4, z11, availableBytes2222, z13, j112222, Build.VERSION.SDK_INT, str5, str6, ((C3221fp) qr6.f27258b).a());
                    }
                }
                i12 = 1;
                sb = null;
                e9 = U2.c.a(context6).e(128, "com.android.vending");
                if (e9 != null) {
                }
                str4 = null;
                String str142222 = Build.FINGERPRINT;
                String language22222 = Locale.getDefault().getLanguage();
                c3151ea = AbstractC3368ia.Ue;
                rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                }
                Intent intent2222 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                ResolveInfo resolveActivity42222 = packageManager.resolveActivity(intent2222, 0);
                queryIntentActivities = packageManager.queryIntentActivities(intent2222, com.anythink.basead.exoplayer.b.aX);
                if (queryIntentActivities != null) {
                }
                z11 = false;
                t2.G g1322222 = p2.j.f39798C.f39803c;
                long availableBytes22222 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                C3151ea c3151ea922222 = AbstractC3368ia.Lc;
                q2.r rVar722222 = q2.r.f40116e;
                if (((Boolean) rVar722222.f40119c.a(c3151ea922222)).booleanValue()) {
                }
                C3151ea c3151ea1022222 = AbstractC3368ia.Pc;
                SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga422222 = rVar722222.f40119c;
                String j1122222 = !((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga422222.a(c3151ea1022222)).booleanValue() ? ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga422222.a(AbstractC3368ia.Rc)).booleanValue() ? (String) qr6.f27261e : u2.d.j(context6) : "";
                if (resolveActivity2 == null) {
                }
                if (resolveActivity == null) {
                }
                String str1522222 = Build.MODEL;
                return new Ts(z15, z14, country, r9, h9, k6, language, arrayList3, sb, str4, z11, availableBytes22222, z13, j1122222, Build.VERSION.SDK_INT, str5, str6, ((C3221fp) qr6.f27258b).a());
        }
    }
}
