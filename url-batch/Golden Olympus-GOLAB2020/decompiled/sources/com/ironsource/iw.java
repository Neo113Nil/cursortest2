package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class iw {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f16774c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1525o1 f16775a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final yo f16776b;

    @Metadata
    public static final class a {
        private a() {
        }

        @NotNull
        public final iw a(@NotNull C1585w2 adTools, @NotNull AbstractC1584w1 adUnitData, @NotNull yo outcomeReporter, @NotNull dw waterfallInstances, @NotNull AbstractC1466g0 adInstanceLoadStrategy) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
            Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
            Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            Intrinsics.checkNotNullParameter(adInstanceLoadStrategy, "adInstanceLoadStrategy");
            return adUnitData.q() ? new pt(adTools, outcomeReporter, waterfallInstances, adInstanceLoadStrategy) : new la(adTools, outcomeReporter, waterfallInstances);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public iw(@NotNull C1525o1 adTools, @NotNull yo outcomeReporter) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        this.f16775a = adTools;
        this.f16776b = outcomeReporter;
    }

    private final void b(AbstractC1424a0 abstractC1424a0, List<? extends AbstractC1424a0> list) {
        for (AbstractC1424a0 abstractC1424a02 : list) {
            if (abstractC1424a02 == abstractC1424a0) {
                abstractC1424a0.a(true);
                return;
            }
            abstractC1424a02.a(false);
            IronLog.INTERNAL.verbose(C1525o1.a(this.f16775a, abstractC1424a02.p() + " - not ready to show", (String) null, 2, (Object) null));
        }
    }

    public abstract void a();

    public abstract void a(@NotNull AbstractC1424a0 abstractC1424a0);

    public final void a(@NotNull AbstractC1424a0 instance, @Nullable String str, @NotNull rk publisherDataHolder) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.f16776b.a(instance, str, publisherDataHolder);
    }

    public abstract void b(@NotNull AbstractC1424a0 abstractC1424a0);

    public abstract void c(@NotNull AbstractC1424a0 abstractC1424a0);

    public final void a(@NotNull AbstractC1424a0 instanceToShow, @NotNull List<? extends AbstractC1424a0> orderedInstances) {
        Intrinsics.checkNotNullParameter(instanceToShow, "instanceToShow");
        Intrinsics.checkNotNullParameter(orderedInstances, "orderedInstances");
        b(instanceToShow, orderedInstances);
        c(instanceToShow);
    }
}
