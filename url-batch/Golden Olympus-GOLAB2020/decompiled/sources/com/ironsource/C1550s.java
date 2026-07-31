package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.ze;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1550s implements ze, ze.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<IronSource.AD_UNIT, AtomicBoolean> f18929a = MapsKt.mapOf(TuplesKt.to(IronSource.AD_UNIT.REWARDED_VIDEO, new AtomicBoolean(false)), TuplesKt.to(IronSource.AD_UNIT.INTERSTITIAL, new AtomicBoolean(false)), TuplesKt.to(IronSource.AD_UNIT.BANNER, new AtomicBoolean(false)));

    @Override // com.ironsource.ze.a
    public void a(@NotNull IronSource.AD_UNIT adFormat, boolean z4) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        AtomicBoolean atomicBoolean = this.f18929a.get(adFormat);
        if (atomicBoolean != null) {
            atomicBoolean.set(z4);
        }
    }

    @Override // com.ironsource.ze
    public boolean a(@NotNull IronSource.AD_UNIT adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        AtomicBoolean atomicBoolean = this.f18929a.get(adFormat);
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        return false;
    }
}
