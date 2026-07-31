package com.startapp.sdk.internal;

import android.os.Parcelable;
import android.telephony.TelephonyManager;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import org.json.JSONObject;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class bh {

    /* renamed from: a, reason: collision with root package name */
    public final TelephonyManager f187a;
    public final Class b;
    public final /* synthetic */ eh c;

    public bh(eh ehVar, TelephonyManager telephonyManager, Class cls) {
        this.c = ehVar;
        this.f187a = telephonyManager;
        this.b = cls;
    }

    public abstract void a();

    public final void a(Class cls, Parcelable parcelable) {
        eh ehVar = this.c;
        try {
            TelephonyMetadata a2 = ehVar.a();
            if (a2 != null && parcelable != null) {
                long currentTimeMillis = System.currentTimeMillis();
                String simpleName = cls.getSimpleName();
                if (a2.a(simpleName).c()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("timestamp", currentTimeMillis);
                    jSONObject.put(WebViewManager.EVENT_TYPE_KEY, simpleName);
                    jSONObject.put("data", parcelable.toString());
                    String b = zh.b(jSONObject.toString());
                    ze edit = ((af) ehVar.c.a()).edit();
                    edit.a(simpleName, b);
                    edit.f526a.putString(simpleName, b);
                    edit.apply();
                }
            }
        } catch (Throwable th) {
            if (ehVar.a(2)) {
                n8.a(th);
            }
        }
        if (cls.equals(this.b)) {
            try {
                b();
            } catch (Throwable th2) {
                if (this.c.a(16)) {
                    n8.a(th2);
                }
            }
        }
    }

    public abstract void b();
}
