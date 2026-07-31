package com.startapp.sdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.json.JsonParser;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class qd extends l7 {
    public MetaData m;
    public final /* synthetic */ Context n;
    public final /* synthetic */ AdPreferences o;
    public final /* synthetic */ rd p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qd(rd rdVar, Context context, pa paVar, AdPreferences adPreferences, Context context2, AdPreferences adPreferences2) {
        super(context, paVar, adPreferences, r4, null, 0);
        MetaDataRequest$RequestReason metaDataRequest$RequestReason = MetaDataRequest$RequestReason.PERIODIC;
        this.p = rdVar;
        this.n = context2;
        this.o = adPreferences2;
    }

    @Override // com.startapp.sdk.internal.l7
    public final Boolean a() {
        try {
            com.startapp.sdk.adsbase.g.e(this.n);
            rb rbVar = new rb(this.n, (af) com.startapp.sdk.components.a.a(this.n).G.a(), MetaDataRequest$RequestReason.PERIODIC);
            rbVar.a(this.n, this.o);
            String a2 = a(this.n, rbVar);
            if (!TextUtils.isEmpty(a2)) {
                MetaData metaData = (MetaData) JsonParser.fromJson(a2, MetaData.class);
                this.m = metaData;
                return Boolean.valueOf(metaData != null);
            }
        } catch (Throwable th) {
            n8.a(th);
        }
        return Boolean.FALSE;
    }

    @Override // com.startapp.sdk.internal.l7
    /* renamed from: c */
    public final void b(Boolean bool) {
        fa faVar;
        MetaData metaData;
        WeakHashMap weakHashMap = zh.f528a;
        try {
            if (bool.booleanValue() && (metaData = this.m) != null) {
                MetaData.a(this.n, metaData, MetaDataRequest$RequestReason.PERIODIC, this.l);
            }
            faVar = this.p.callback;
            faVar.a();
        } catch (Throwable th) {
            n8.a(th);
        }
    }
}
