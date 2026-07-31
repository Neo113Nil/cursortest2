package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.d5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1450d5 implements yo {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1585w2 f15822a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.ironsource.mediationsdk.e f15823b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f15824c;

    public C1450d5(@NotNull C1585w2 adTools, @NotNull com.ironsource.mediationsdk.e auctionHandler) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(auctionHandler, "auctionHandler");
        this.f15822a = adTools;
        this.f15823b = auctionHandler;
    }

    @Override // com.ironsource.yo
    public void a(@NotNull AbstractC1424a0 instance, @Nullable String str, @NotNull rk publisherDataHolder) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.f15823b.a(instance.h(), instance.q(), instance.l(), str);
        a(publisherDataHolder, instance.h(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C1450d5 this$0, ImpressionDataListener listener, ImpressionData impressionData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        IronLog.CALLBACK.verbose(C1525o1.a(this$0.f15822a, "onImpressionSuccess " + listener.getClass().getSimpleName() + ": " + impressionData, (String) null, 2, (Object) null));
        listener.onImpressionSuccess(impressionData);
    }

    private final void a(rk rkVar, C1513m5 c1513m5, String str) {
        if (c1513m5 == null) {
            IronLog.INTERNAL.error(C1525o1.a(this.f15822a, "reportImpressionDataToPublisher - no auctionResponseItem or listener", (String) null, 2, (Object) null));
            this.f15822a.e().h().g("reportImpressionDataToPublisher - no auctionResponseItem or listener");
            return;
        }
        final ImpressionData a4 = c1513m5.a(str);
        if (a4 != null) {
            for (final ImpressionDataListener impressionDataListener : new HashSet(rkVar.a())) {
                this.f15822a.e(new Runnable() { // from class: com.ironsource.Q
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1450d5.a(C1450d5.this, impressionDataListener, a4);
                    }
                });
            }
        }
    }

    @Override // com.ironsource.yo
    public void a(@NotNull List<? extends AbstractC1424a0> waterfallInstances, @NotNull AbstractC1424a0 winnerInstance) {
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        Intrinsics.checkNotNullParameter(winnerInstance, "winnerInstance");
        if (this.f15824c) {
            return;
        }
        this.f15824c = true;
        C1513m5 h4 = winnerInstance.h();
        this.f15823b.a(h4, winnerInstance.q(), winnerInstance.l());
        ArrayList<String> arrayList = new ArrayList<>();
        ConcurrentHashMap<String, C1513m5> concurrentHashMap = new ConcurrentHashMap<>();
        for (AbstractC1424a0 abstractC1424a0 : waterfallInstances) {
            arrayList.add(abstractC1424a0.o());
            concurrentHashMap.put(abstractC1424a0.o(), abstractC1424a0.h());
        }
        this.f15823b.a(arrayList, concurrentHashMap, winnerInstance.q(), winnerInstance.l(), h4);
    }
}
