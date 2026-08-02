package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.UUID;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class mg {

    /* renamed from: d, reason: collision with root package name */
    public static final mg f4159d = new mg();

    /* renamed from: a, reason: collision with root package name */
    public String f4160a = "";

    /* renamed from: b, reason: collision with root package name */
    public long f4161b = 0;

    /* renamed from: c, reason: collision with root package name */
    public MetaDataRequest$RequestReason f4162c = MetaDataRequest$RequestReason.LAUNCH;

    public final synchronized void a(Context context, MetaDataRequest$RequestReason metaDataRequest$RequestReason) {
        this.f4160a = UUID.randomUUID().toString();
        this.f4161b = System.currentTimeMillis();
        this.f4162c = metaDataRequest$RequestReason;
        WeakHashMap weakHashMap = si.f4438a;
        t tVar = t.f4445d;
        tVar.f4446a.clear();
        tVar.f4447b.clear();
        tVar.f4448c.clear();
        MetaData.E().a(context, new AdPreferences(), metaDataRequest$RequestReason, false, null, true);
    }
}
