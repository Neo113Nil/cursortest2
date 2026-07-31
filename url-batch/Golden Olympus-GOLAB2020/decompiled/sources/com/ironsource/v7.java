package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.q7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class v7<Smash extends q7<?>> extends lw<Smash> {

    /* renamed from: h, reason: collision with root package name */
    private boolean f20008h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(int i4, boolean z4, @NotNull List<? extends Smash> waterfall, boolean z5) {
        super(i4, z4, waterfall);
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        this.f20008h = z5;
    }

    @Override // com.ironsource.lw
    public void c(@NotNull Smash smash) {
        String str;
        Intrinsics.checkNotNullParameter(smash, "smash");
        if (!smash.w()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.c() + " (non-bidder) is ready to load");
            smash.a(true);
            c().add(smash);
            return;
        }
        this.f20008h = true;
        if (d() == 0) {
            str = "Advanced Loading: Starting to load bidder " + smash.c() + ". No other instances will be loaded at the same time.";
            smash.a(true);
            c().add(smash);
        } else {
            str = "Advanced Loading: Won't start loading bidder " + smash.c() + " as a non bidder is being loaded";
        }
        IronLog.INTERNAL.verbose(smash.g().name() + " - " + str);
        IronSourceUtils.sendAutomationLog(str);
    }

    @Override // com.ironsource.lw
    public boolean e() {
        return super.e() || this.f20008h;
    }

    public /* synthetic */ v7(int i4, boolean z4, List list, boolean z5, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, z4, list, (i5 & 8) != 0 ? false : z5);
    }
}
