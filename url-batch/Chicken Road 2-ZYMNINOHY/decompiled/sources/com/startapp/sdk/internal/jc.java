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
    public static final Set f7143v0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("ispCarrId", "ispCarrIdName", "isma", "root", "appSessionDuration")));

    /* renamed from: n0, reason: collision with root package name */
    public final int f7144n0;

    /* renamed from: o0, reason: collision with root package name */
    public final int f7145o0;

    /* renamed from: p0, reason: collision with root package name */
    public final boolean f7146p0;

    /* renamed from: q0, reason: collision with root package name */
    public final float f7147q0;

    /* renamed from: r0, reason: collision with root package name */
    public final MetaDataRequest$RequestReason f7148r0;

    /* renamed from: s0, reason: collision with root package name */
    public final String f7149s0;

    /* renamed from: t0, reason: collision with root package name */
    public final Pair f7150t0;

    /* renamed from: u0, reason: collision with root package name */
    public final long f7151u0;

    public jc(Context context, sf sfVar, MetaDataRequest$RequestReason metaDataRequest$RequestReason) {
        super(2);
        this.f7144n0 = sfVar.getInt("totalSessions", 0);
        this.f7145o0 = (int) ((System.currentTimeMillis() - sfVar.getLong("firstSessionTime", System.currentTimeMillis())) / 86400000);
        this.f7147q0 = sfVar.getFloat("inAppPurchaseAmount", 0.0f);
        this.f7146p0 = sfVar.getBoolean("payingUser", false);
        this.f7149s0 = MetaData.E().Q();
        this.f7148r0 = metaDataRequest$RequestReason;
        this.f7150t0 = com.startapp.sdk.adsbase.g.a();
        this.f7151u0 = com.startapp.sdk.adsbase.g.f6420c;
        this.f7909Y = ((n0) com.startapp.sdk.components.a.a(context).f6573p.a()).a();
    }

    @Override // com.startapp.sdk.internal.y1
    public final Set a() {
        return f7143v0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.startapp.sdk.internal.y1
    public final void a(se seVar) {
        super.a(seVar);
        seVar.a(AbstractC0366g.f6958b, AbstractC0366g.a(), true, true);
        seVar.a("totalSessions", Integer.valueOf(this.f7144n0), true, true);
        seVar.a("daysSinceFirstSession", Integer.valueOf(this.f7145o0), true, true);
        seVar.a("profileId", this.f7149s0, false, true);
        boolean z = this.f7146p0;
        if (z) {
            seVar.a("payingUser", Boolean.valueOf(z), true, true);
            seVar.a("paidAmount", Float.valueOf(this.f7147q0), true, true);
        }
        seVar.a("reason", this.f7148r0, true, true);
        seVar.a("testAdsEnabled", fh.f6918a.f7017t ? Boolean.TRUE : null, false, true);
        seVar.a("apkHash", null, false, true);
        seVar.a("ian", null, false, true);
        Pair pair = this.f7150t0;
        seVar.a((String) pair.first, pair.second, false, true);
        long j4 = this.f7151u0;
        if (j4 != 0) {
            seVar.a("firstInstalledAppTS", Long.valueOf(j4), false, true);
        }
    }
}
