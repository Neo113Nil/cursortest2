package com.startapp.sdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.json.JsonParser;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ee extends a8 {

    /* renamed from: m, reason: collision with root package name */
    public MetaData f6857m;
    public final /* synthetic */ Context n;
    public final /* synthetic */ AdPreferences o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ fe f6858p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ee(fe feVar, Context context, ib ibVar, AdPreferences adPreferences, Context context2, AdPreferences adPreferences2) {
        super(context, ibVar, adPreferences, r4, null, 0);
        MetaDataRequest$RequestReason metaDataRequest$RequestReason = MetaDataRequest$RequestReason.PERIODIC;
        this.f6858p = feVar;
        this.n = context2;
        this.o = adPreferences2;
    }

    @Override // com.startapp.sdk.internal.a8
    public final Boolean a() {
        try {
            com.startapp.sdk.adsbase.g.e(this.n);
            jc jcVar = new jc(this.n, (sf) com.startapp.sdk.components.a.a(this.n).f6547G.a(), MetaDataRequest$RequestReason.PERIODIC);
            jcVar.a(this.n, this.o);
            String a3 = a(this.n, jcVar);
            if (!TextUtils.isEmpty(a3)) {
                MetaData metaData = (MetaData) JsonParser.fromJson(a3, MetaData.class);
                this.f6857m = metaData;
                return Boolean.valueOf(metaData != null);
            }
        } catch (Throwable th) {
            d9.a(th);
        }
        return Boolean.FALSE;
    }

    @Override // com.startapp.sdk.internal.a8
    /* renamed from: c */
    public final void b(Boolean bool) {
        ya yaVar;
        MetaData metaData;
        WeakHashMap weakHashMap = si.f7575a;
        try {
            if (bool.booleanValue() && (metaData = this.f6857m) != null) {
                MetaData.a(this.n, metaData, MetaDataRequest$RequestReason.PERIODIC, this.f6651l);
            }
            yaVar = this.f6858p.callback;
            yaVar.a();
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
