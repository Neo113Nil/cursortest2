package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import com.startapp.sdk.common.utils.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class jc extends y1 {

    /* renamed from: v0, reason: collision with root package name */
    public static final Set f4016v0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("ispCarrId", "ispCarrIdName", "isma", "root", "appSessionDuration")));

    /* renamed from: n0, reason: collision with root package name */
    public final int f4017n0;
    public final int o0;

    /* renamed from: p0, reason: collision with root package name */
    public final boolean f4018p0;

    /* renamed from: q0, reason: collision with root package name */
    public final float f4019q0;

    /* renamed from: r0, reason: collision with root package name */
    public final MetaDataRequest$RequestReason f4020r0;

    /* renamed from: s0, reason: collision with root package name */
    public final String f4021s0;

    /* renamed from: t0, reason: collision with root package name */
    public final Pair f4022t0;

    /* renamed from: u0, reason: collision with root package name */
    public final long f4023u0;

    public jc(Context context, sf sfVar, MetaDataRequest$RequestReason metaDataRequest$RequestReason) {
        super(2);
        this.f4017n0 = sfVar.getInt("totalSessions", 0);
        this.o0 = (int) ((System.currentTimeMillis() - sfVar.getLong("firstSessionTime", System.currentTimeMillis())) / 86400000);
        this.f4019q0 = sfVar.getFloat("inAppPurchaseAmount", 0.0f);
        this.f4018p0 = sfVar.getBoolean("payingUser", false);
        this.f4021s0 = MetaData.E().Q();
        this.f4020r0 = metaDataRequest$RequestReason;
        this.f4022t0 = com.startapp.sdk.adsbase.g.a();
        this.f4023u0 = com.startapp.sdk.adsbase.g.f3330c;
        this.f4763Y = ((n0) com.startapp.sdk.components.a.a(context).f3475p.a()).a();
    }

    @Override // com.startapp.sdk.internal.y1
    public final Set a() {
        return f4016v0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.startapp.sdk.internal.y1
    public final void a(se seVar) {
        super.a(seVar);
        seVar.a(AbstractC0288g.f3840b, AbstractC0288g.a(), true, true);
        seVar.a("totalSessions", Integer.valueOf(this.f4017n0), true, true);
        seVar.a("daysSinceFirstSession", Integer.valueOf(this.o0), true, true);
        seVar.a("profileId", this.f4021s0, false, true);
        boolean z = this.f4018p0;
        if (z) {
            seVar.a("payingUser", Boolean.valueOf(z), true, true);
            seVar.a("paidAmount", Float.valueOf(this.f4019q0), true, true);
        }
        seVar.a("reason", this.f4020r0, true, true);
        seVar.a("testAdsEnabled", fh.f3800a.f3895t ? Boolean.TRUE : null, false, true);
        seVar.a("apkHash", null, false, true);
        seVar.a("ian", null, false, true);
        Pair pair = this.f4022t0;
        seVar.a((String) pair.first, pair.second, false, true);
        long j3 = this.f4023u0;
        if (j3 != 0) {
            seVar.a("firstInstalledAppTS", Long.valueOf(j3), false, true);
        }
    }
}
