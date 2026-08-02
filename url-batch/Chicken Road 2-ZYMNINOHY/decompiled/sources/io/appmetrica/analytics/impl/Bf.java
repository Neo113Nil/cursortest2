package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.ResultReceiver;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class Bf implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final ContentValues f10112a;

    /* renamed from: b, reason: collision with root package name */
    public final ResultReceiver f10113b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f10111c = UUID.randomUUID().toString();
    public static final Parcelable.Creator<Bf> CREATOR = new Af();

    public Bf(Context context, ResultReceiver resultReceiver) {
        ContentValues contentValues = new ContentValues();
        this.f10112a = contentValues;
        contentValues.put("PROCESS_CFG_PROCESS_ID", Integer.valueOf(Process.myPid()));
        contentValues.put("PROCESS_CFG_PROCESS_SESSION_ID", f10111c);
        contentValues.put("PROCESS_CFG_SDK_API_LEVEL", Integer.valueOf(AppMetrica.getLibraryApiLevel()));
        contentValues.put("PROCESS_CFG_PACKAGE_NAME", context.getPackageName());
        this.f10113b = resultReceiver;
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            HashMap b4 = Fm.b(map);
            synchronized (this) {
                this.f10112a.put("PROCESS_CFG_CLIDS", AbstractC0637gb.b(b4));
            }
        }
    }

    public final void b(AppMetricaConfig appMetricaConfig) {
        List<String> list = appMetricaConfig.customHosts;
        if (list != null) {
            synchronized (this) {
                this.f10112a.put("PROCESS_CFG_CUSTOM_HOSTS", AbstractC0779lo.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
            }
        }
    }

    public final void c(AppMetricaConfig appMetricaConfig) {
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        if (str != null) {
            synchronized (this) {
                this.f10112a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
            }
            i();
        }
    }

    public final void d(AppMetricaConfig appMetricaConfig) {
        if (appMetricaConfig != null) {
            synchronized (this) {
                b(appMetricaConfig);
                a(appMetricaConfig);
                c(appMetricaConfig);
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f10112a.getAsString("PROCESS_CFG_PACKAGE_NAME");
    }

    public final Integer f() {
        return this.f10112a.getAsInteger("PROCESS_CFG_PROCESS_ID");
    }

    public final String g() {
        return this.f10112a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
    }

    public final boolean h() {
        return this.f10112a.containsKey("PROCESS_CFG_CUSTOM_HOSTS");
    }

    public final synchronized void i() {
        this.f10112a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", "api");
    }

    public final String toString() {
        return "ProcessConfiguration{mParamsMapping=" + this.f10112a + ", mDataResultReceiver=" + this.f10113b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT", this.f10112a);
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER", this.f10113b);
        parcel.writeBundle(bundle);
    }

    public final HashMap a() {
        return AbstractC0637gb.c(this.f10112a.getAsString("PROCESS_CFG_CLIDS"));
    }

    public final String c() {
        return this.f10112a.getAsString("PROCESS_CFG_DISTRIBUTION_REFERRER");
    }

    public final String d() {
        return this.f10112a.getAsString("PROCESS_CFG_INSTALL_REFERRER_SOURCE");
    }

    public Bf(Bf bf) {
        synchronized (bf) {
            this.f10112a = new ContentValues(bf.f10112a);
            this.f10113b = bf.f10113b;
        }
    }

    public final ArrayList b() {
        String asString = this.f10112a.getAsString("PROCESS_CFG_CUSTOM_HOSTS");
        if (TextUtils.isEmpty(asString)) {
            return null;
        }
        return AbstractC0637gb.b(asString);
    }

    public Bf(ContentValues contentValues, ResultReceiver resultReceiver) {
        this.f10112a = contentValues == null ? new ContentValues() : contentValues;
        this.f10113b = resultReceiver;
    }
}
