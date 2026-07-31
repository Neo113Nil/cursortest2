package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.q7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ka<Smash extends q7<?>> extends lw<Smash> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(int i4, boolean z4, @NotNull List<? extends Smash> waterfall) {
        super(i4, z4, waterfall);
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
    }

    @Override // com.ironsource.lw
    public void c(@NotNull Smash smash) {
        Intrinsics.checkNotNullParameter(smash, "smash");
        IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is ready to load");
        smash.a(true);
        c().add(smash);
    }
}
