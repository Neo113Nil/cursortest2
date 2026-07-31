package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class bw {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f15652d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1585w2 f15653a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC1584w1 f15654b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final yo f15655c;

    @Metadata
    public static final class a {
        private a() {
        }

        @NotNull
        public final bw a(@NotNull C1585w2 adTools, @NotNull AbstractC1584w1 adUnitData) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
            return adUnitData.t() ? new C1536p5(adTools, adUnitData) : new go(adTools, adUnitData);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata
    public static final class b implements yo {
        b() {
        }
    }

    public bw(@NotNull C1585w2 adTools, @NotNull AbstractC1584w1 adUnitData) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f15653a = adTools;
        this.f15654b = adUnitData;
        this.f15655c = new b();
    }

    private final AbstractC1424a0 a(C1513m5 c1513m5, C1492j5 c1492j5, InterfaceC1445d0 interfaceC1445d0, C1473h0 c1473h0) {
        String c4;
        String str;
        AbstractC1584w1 abstractC1584w1 = this.f15654b;
        String c5 = c1513m5.c();
        Intrinsics.checkNotNullExpressionValue(c5, "item.instanceName");
        NetworkSettings a4 = abstractC1584w1.a(c5);
        if (a4 == null) {
            c4 = c1513m5.c();
            Intrinsics.checkNotNullExpressionValue(c4, "item.instanceName");
            str = "Could not find matching provider settings for auction response item";
        } else {
            if (c1473h0 != null) {
                com.ironsource.mediationsdk.c.b().b(a4, this.f15654b.b().a(), this.f15654b.b().b());
                int f4 = this.f15653a.f();
                AbstractC1584w1 abstractC1584w12 = this.f15654b;
                return interfaceC1445d0.a(new C1431b0(abstractC1584w12, a4, c1492j5, new C1441c3(a4, abstractC1584w12.b(a4), this.f15654b.b().a()), c1513m5, f4), c1473h0);
            }
            c4 = c1513m5.c();
            Intrinsics.checkNotNullExpressionValue(c4, "item.instanceName");
            str = "Could not find matching adInstancePayload for auction response item";
        }
        a(str, c4);
        return null;
    }

    public abstract void a(@NotNull InterfaceC1445d0 interfaceC1445d0, @NotNull cw cwVar);

    @NotNull
    public final dw a(@NotNull List<? extends C1513m5> waterfallItems, @NotNull Map<String, C1473h0> adInstancePayloads, @NotNull C1492j5 auctionData, @NotNull InterfaceC1445d0 adInstanceFactory) {
        Intrinsics.checkNotNullParameter(waterfallItems, "waterfallItems");
        Intrinsics.checkNotNullParameter(adInstancePayloads, "adInstancePayloads");
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        IronLog.INTERNAL.verbose(C1525o1.a(this.f15653a, "waterfall.size() = " + waterfallItems.size(), (String) null, 2, (Object) null));
        ArrayList arrayList = new ArrayList();
        int size = waterfallItems.size();
        for (int i4 = 0; i4 < size; i4++) {
            C1513m5 c1513m5 = waterfallItems.get(i4);
            AbstractC1424a0 a4 = a(c1513m5, auctionData, adInstanceFactory, adInstancePayloads.get(c1513m5.c()));
            if (a4 != null && a4.g() != null) {
                arrayList.add(a4);
            }
        }
        dw dwVar = new dw(arrayList);
        IronLog.INTERNAL.verbose(C1525o1.a(this.f15653a, "updateWaterfall() - next waterfall is " + dwVar + ".toWaterfallString()", (String) null, 2, (Object) null));
        return dwVar;
    }

    @NotNull
    public yo a() {
        return this.f15655c;
    }

    private final void a(String str, String str2) {
        String str3 = str + " - item = " + str2;
        IronLog.INTERNAL.error(C1525o1.a(this.f15653a, str3, (String) null, 2, (Object) null));
        this.f15653a.e().h().h(str3);
    }
}
