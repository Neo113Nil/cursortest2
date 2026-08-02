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
    public static final mg f7288d = new mg();

    /* renamed from: a, reason: collision with root package name */
    public String f7289a = "";

    /* renamed from: b, reason: collision with root package name */
    public long f7290b = 0;

    /* renamed from: c, reason: collision with root package name */
    public MetaDataRequest$RequestReason f7291c = MetaDataRequest$RequestReason.LAUNCH;

    public final synchronized void a(Context context, MetaDataRequest$RequestReason metaDataRequest$RequestReason) {
        this.f7289a = UUID.randomUUID().toString();
        this.f7290b = System.currentTimeMillis();
        this.f7291c = metaDataRequest$RequestReason;
        WeakHashMap weakHashMap = si.f7575a;
        t tVar = t.f7582d;
        tVar.f7583a.clear();
        tVar.f7584b.clear();
        tVar.f7585c.clear();
        MetaData.E().a(context, new AdPreferences(), metaDataRequest$RequestReason, false, null, true);
    }
}
