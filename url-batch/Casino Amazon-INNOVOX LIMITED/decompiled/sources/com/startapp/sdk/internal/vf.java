package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.UUID;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class vf {
    public static final vf d = new vf();

    /* renamed from: a, reason: collision with root package name */
    public String f470a = "";
    public long b = 0;
    public MetaDataRequest$RequestReason c = MetaDataRequest$RequestReason.LAUNCH;

    public final synchronized void a(Context context, MetaDataRequest$RequestReason metaDataRequest$RequestReason) {
        this.f470a = UUID.randomUUID().toString();
        this.b = System.currentTimeMillis();
        this.c = metaDataRequest$RequestReason;
        WeakHashMap weakHashMap = zh.f528a;
        t tVar = t.d;
        tVar.f428a.clear();
        tVar.b.clear();
        tVar.c.clear();
        MetaData.A().a(context, new AdPreferences(), metaDataRequest$RequestReason, false, null, true);
    }
}
