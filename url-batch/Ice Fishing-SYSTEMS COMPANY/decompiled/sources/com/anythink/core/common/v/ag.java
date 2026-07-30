package com.anythink.core.common.v;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.util.SparseBooleanArray;
import com.anythink.core.common.v.ad;
import java.util.List;

/* loaded from: classes.dex */
public class ag {

    /* renamed from: a, reason: collision with root package name */
    private static final int f16821a = 1;

    /* renamed from: b, reason: collision with root package name */
    private static final int f16822b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static final int f16823c = 3;

    /* renamed from: e, reason: collision with root package name */
    private static volatile ag f16824e;

    /* renamed from: d, reason: collision with root package name */
    private final SparseBooleanArray f16825d = new SparseBooleanArray(3);

    public static ag a() {
        if (f16824e == null) {
            synchronized (ag.class) {
                try {
                    if (f16824e == null) {
                        f16824e = new ag();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16824e;
    }

    public final synchronized boolean b(Context context) {
        if (this.f16825d.indexOfKey(2) >= 0) {
            return this.f16825d.get(2);
        }
        boolean z8 = false;
        try {
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null) {
                if (queryIntentServices.size() > 0) {
                    z8 = true;
                }
            }
        } catch (Exception unused) {
        }
        this.f16825d.put(2, z8);
        return z8;
    }

    public final synchronized boolean a(Context context) {
        if (this.f16825d.indexOfKey(1) >= 0) {
            return this.f16825d.get(1);
        }
        boolean z8 = false;
        try {
            ad adVar = new ad(context);
            ad.a a9 = adVar.a("com.huawei.hwid");
            String b9 = adVar.b("com.huawei.hwid");
            if (a9 == ad.a.ENABLED) {
                if ("B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05".equalsIgnoreCase(b9)) {
                    z8 = true;
                }
            }
        } catch (Exception unused) {
        }
        this.f16825d.put(1, z8);
        return z8;
    }

    public final synchronized boolean b() {
        boolean z8;
        if (this.f16825d.indexOfKey(3) >= 0) {
            return this.f16825d.get(3);
        }
        try {
            Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory");
            z8 = true;
        } catch (Exception unused) {
            z8 = false;
        }
        this.f16825d.put(3, z8);
        return z8;
    }
}
