package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Build;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyDataConfig;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class eh {

    /* renamed from: a, reason: collision with root package name */
    public final Context f230a;
    public final pa b;
    public final pa c;
    public final pa d;
    public final p5 e;
    public bh f;
    public final double g = ((Random) zh.d.a()).nextDouble();
    public volatile String h = "e106";

    public eh(Context context, pa paVar, pa paVar2, pa paVar3, p5 p5Var) {
        this.f230a = context;
        this.b = paVar;
        this.c = paVar2;
        this.d = paVar3;
        this.e = p5Var;
    }

    public final bh a(Class cls) {
        TelephonyManager telephonyManager = (TelephonyManager) this.f230a.getSystemService("phone");
        if (telephonyManager != null) {
            return Build.VERSION.SDK_INT < 31 ? new dh(this, telephonyManager, cls) : new ah(this, telephonyManager, cls);
        }
        return null;
    }

    public final void b() {
        bh a2;
        try {
            if (a() == null || (a2 = a(SignalStrength.class)) == null) {
                return;
            }
            a2.a();
        } catch (Throwable th) {
            if (a(8)) {
                n8.a(th);
            }
        }
    }

    public final TelephonyMetadata a() {
        if (((x5) this.d.a()).b()) {
            this.e.getClass();
            TelephonyMetadata V = MetaData.A().V();
            if (V != null && V.c()) {
                return V;
            }
        }
        return null;
    }

    public final boolean a(int i) {
        TelephonyMetadata a2 = a();
        return a2 != null && this.g < a2.b() && (a2.a() & i) == i;
    }

    public final void a(SignalStrength signalStrength) {
        if (signalStrength == null) {
            return;
        }
        try {
            this.h = String.valueOf(signalStrength.getLevel());
        } catch (NoSuchMethodException unused) {
            this.h = "e104";
        } catch (Throwable unused2) {
            this.h = "e105";
        }
    }

    public final Map a(o8 o8Var) {
        List a2;
        TelephonyMetadata a3 = a();
        if (a3 == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = null;
        for (Map.Entry entry : ((af) this.c.a()).getAll().entrySet()) {
            Object value = entry.getValue();
            if (value instanceof String) {
                String str = (String) entry.getKey();
                TelephonyDataConfig a4 = a3.a(str);
                if (a4.c() && (a2 = a4.a()) != null && a2.contains(o8Var.f361a)) {
                    String b = a4.b();
                    if (b != null) {
                        str = b;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(str, (String) value);
                }
            }
        }
        return hashMap == null ? Collections.EMPTY_MAP : hashMap;
    }
}
