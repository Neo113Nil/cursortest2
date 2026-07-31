package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import com.startapp.sdk.common.utils.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class rb extends u1 {
    public static final Set v0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("ispCarrId", "ispCarrIdName", "isma", "root", "appSessionDuration")));
    public final int n0;
    public final int o0;
    public final boolean p0;
    public final float q0;
    public final MetaDataRequest$RequestReason r0;
    public final String s0;
    public final Pair t0;
    public final long u0;

    public rb(Context context, af afVar, MetaDataRequest$RequestReason metaDataRequest$RequestReason) {
        super(2);
        this.n0 = afVar.getInt("totalSessions", 0);
        this.o0 = (int) ((System.currentTimeMillis() - afVar.getLong("firstSessionTime", System.currentTimeMillis())) / 86400000);
        this.q0 = afVar.getFloat("inAppPurchaseAmount", 0.0f);
        this.p0 = afVar.getBoolean("payingUser", false);
        this.s0 = MetaData.A().L();
        this.r0 = metaDataRequest$RequestReason;
        this.t0 = com.startapp.sdk.adsbase.g.a();
        this.u0 = com.startapp.sdk.adsbase.g.c;
        this.Y = ((k0) com.startapp.sdk.components.a.a(context).o.a()).a();
    }

    @Override // com.startapp.sdk.internal.u1
    public final Set a() {
        return v0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.startapp.sdk.internal.u1
    public final void a(be beVar) {
        super.a(beVar);
        beVar.a(g.b, g.a(), true, true);
        beVar.a("totalSessions", Integer.valueOf(this.n0), true, true);
        beVar.a("daysSinceFirstSession", Integer.valueOf(this.o0), true, true);
        beVar.a("profileId", this.s0, false, true);
        boolean z = this.p0;
        if (z) {
            beVar.a("payingUser", Boolean.valueOf(z), true, true);
            beVar.a("paidAmount", Float.valueOf(this.q0), true, true);
        }
        beVar.a("reason", this.r0, true, true);
        beVar.a("testAdsEnabled", pg.f382a.t ? Boolean.TRUE : null, false, true);
        beVar.a("apkHash", null, false, true);
        beVar.a("ian", null, false, true);
        Pair pair = this.t0;
        beVar.a((String) pair.first, pair.second, false, true);
        long j = this.u0;
        if (j != 0) {
            beVar.a("firstInstalledAppTS", Long.valueOf(j), false, true);
        }
    }
}
