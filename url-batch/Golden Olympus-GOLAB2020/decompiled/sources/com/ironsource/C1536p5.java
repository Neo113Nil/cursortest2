package com.ironsource;

import android.text.TextUtils;
import com.ironsource.C1536p5;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.p5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1536p5 extends bw {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C1585w2 f18589e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final AbstractC1584w1 f18590f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C1543q5 f18591g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final yo f18592h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final go f18593i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    private InterfaceC1549r5 f18594j;

    @Metadata
    /* renamed from: com.ironsource.p5$a */
    public static final class a implements InterfaceC1549r5 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1445d0 f18596b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ cw f18597c;

        a(InterfaceC1445d0 interfaceC1445d0, cw cwVar) {
            this.f18596b = interfaceC1445d0;
            this.f18597c = cwVar;
        }

        @Override // com.ironsource.InterfaceC1549r5
        public void a(int i4, @NotNull String errorReason) {
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            this.f18597c.a(i4, errorReason);
        }

        @Override // com.ironsource.InterfaceC1549r5
        public void a(final int i4, @NotNull final String errorMessage, final int i5, @NotNull final String auctionFallback, final long j4) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
            C1585w2 c1585w2 = C1536p5.this.f18589e;
            final C1536p5 c1536p5 = C1536p5.this;
            final InterfaceC1445d0 interfaceC1445d0 = this.f18596b;
            final cw cwVar = this.f18597c;
            c1585w2.a(new Runnable() { // from class: com.ironsource.K2
                @Override // java.lang.Runnable
                public final void run() {
                    C1536p5.a.a(C1536p5.this, interfaceC1445d0, cwVar, i4, errorMessage, i5, auctionFallback, j4);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C1536p5 this$0, InterfaceC1445d0 adInstanceFactory, cw waterfallFetcherListener, int i4, String errorMessage, int i5, String auctionFallback, long j4) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(adInstanceFactory, "$adInstanceFactory");
            Intrinsics.checkNotNullParameter(waterfallFetcherListener, "$waterfallFetcherListener");
            Intrinsics.checkNotNullParameter(errorMessage, "$errorMessage");
            Intrinsics.checkNotNullParameter(auctionFallback, "$auctionFallback");
            this$0.f18594j = null;
            this$0.a(adInstanceFactory, waterfallFetcherListener, i4, errorMessage, i5, auctionFallback, j4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C1536p5 this$0, InterfaceC1445d0 adInstanceFactory, cw waterfallFetcherListener, List newWaterfall, Map adInstancePayloads, String auctionId, C1513m5 c1513m5, JSONObject jSONObject, JSONObject jSONObject2, int i4, long j4, int i5, String str) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(adInstanceFactory, "$adInstanceFactory");
            Intrinsics.checkNotNullParameter(waterfallFetcherListener, "$waterfallFetcherListener");
            Intrinsics.checkNotNullParameter(newWaterfall, "$newWaterfall");
            Intrinsics.checkNotNullParameter(adInstancePayloads, "$adInstancePayloads");
            Intrinsics.checkNotNullParameter(auctionId, "$auctionId");
            this$0.f18594j = null;
            this$0.a(adInstanceFactory, waterfallFetcherListener, newWaterfall, adInstancePayloads, auctionId, c1513m5, jSONObject, jSONObject2, i4, j4, i5, str);
        }

        @Override // com.ironsource.InterfaceC1549r5
        public void a(@NotNull final List<C1513m5> newWaterfall, @NotNull final Map<String, C1473h0> adInstancePayloads, @NotNull final String auctionId, @Nullable final C1513m5 c1513m5, @Nullable final JSONObject jSONObject, @Nullable final JSONObject jSONObject2, final int i4, final long j4, final int i5, @Nullable final String str) {
            Intrinsics.checkNotNullParameter(newWaterfall, "newWaterfall");
            Intrinsics.checkNotNullParameter(adInstancePayloads, "adInstancePayloads");
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            C1585w2 c1585w2 = C1536p5.this.f18589e;
            final C1536p5 c1536p5 = C1536p5.this;
            final InterfaceC1445d0 interfaceC1445d0 = this.f18596b;
            final cw cwVar = this.f18597c;
            c1585w2.a(new Runnable() { // from class: com.ironsource.J2
                @Override // java.lang.Runnable
                public final void run() {
                    C1536p5.a.a(C1536p5.this, interfaceC1445d0, cwVar, newWaterfall, adInstancePayloads, auctionId, c1513m5, jSONObject, jSONObject2, i4, j4, i5, str);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536p5(@NotNull C1585w2 adTools, @NotNull AbstractC1584w1 adUnitData) {
        super(adTools, adUnitData);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f18589e = adTools;
        this.f18590f = adUnitData;
        C1543q5 c1543q5 = new C1543q5(adTools, adUnitData);
        this.f18591g = c1543q5;
        this.f18592h = c1543q5.b();
        this.f18593i = new go(adTools, adUnitData);
    }

    @Override // com.ironsource.bw
    @NotNull
    public yo a() {
        return this.f18592h;
    }

    @Override // com.ironsource.bw
    public void a(@NotNull InterfaceC1445d0 adInstanceFactory, @NotNull cw waterfallFetcherListener) {
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        Intrinsics.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        a aVar = new a(adInstanceFactory, waterfallFetcherListener);
        this.f18591g.a(aVar);
        this.f18594j = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(InterfaceC1445d0 interfaceC1445d0, cw cwVar, int i4, String str, int i5, String str2, long j4) {
        IronLog.INTERNAL.verbose(C1525o1.a(this.f18589e, "Auction failed | moving to fallback waterfall (error " + i4 + " - " + str + ')', (String) null, 2, (Object) null));
        this.f18589e.e().b().a(j4, i4, str);
        this.f18593i.a(cwVar, i5, str2, interfaceC1445d0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(InterfaceC1445d0 interfaceC1445d0, cw cwVar, List<C1513m5> list, Map<String, C1473h0> map, String str, C1513m5 c1513m5, JSONObject jSONObject, JSONObject jSONObject2, int i4, long j4, int i5, String str2) {
        IronLog.INTERNAL.verbose(C1525o1.a(this.f18589e, (String) null, (String) null, 3, (Object) null));
        C1492j5 c1492j5 = new C1492j5(str, jSONObject, c1513m5, i4, "");
        if (!TextUtils.isEmpty(str2)) {
            this.f18589e.e().h().a(i5, str2);
        }
        a(jSONObject2);
        dw a4 = a(list, map, c1492j5, interfaceC1445d0);
        this.f18589e.e().a(new C1575u4(c1492j5));
        this.f18589e.e().b().a(j4, this.f18590f.v());
        this.f18589e.e().b().c(a4.d());
        a(a4, cwVar);
    }

    private final void a(dw dwVar, cw cwVar) {
        this.f18589e.h().a(dwVar);
        cwVar.a(dwVar);
    }

    private final void a(JSONObject jSONObject) {
        IronLog ironLog;
        C1585w2 c1585w2;
        String v4;
        int i4;
        try {
            if (jSONObject == null) {
                this.f18590f.b(false);
                ironLog = IronLog.INTERNAL;
                c1585w2 = this.f18589e;
                v4 = "loading configuration from auction response is null, using the following: " + this.f18590f.v();
            } else {
                try {
                    if (jSONObject.has(com.ironsource.mediationsdk.d.f17335x) && (i4 = jSONObject.getInt(com.ironsource.mediationsdk.d.f17335x)) > 0) {
                        this.f18590f.a(i4);
                    }
                    if (jSONObject.has(com.ironsource.mediationsdk.d.f17336y)) {
                        this.f18590f.a(jSONObject.getBoolean(com.ironsource.mediationsdk.d.f17336y));
                    }
                    this.f18590f.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.f17337z, false));
                    ironLog = IronLog.INTERNAL;
                    c1585w2 = this.f18589e;
                    v4 = this.f18590f.v();
                } catch (JSONException e4) {
                    o9.d().a(e4);
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.error("failed to update loading configuration for" + this.f18590f.b().a() + " Error: " + e4.getMessage());
                    ironLog2.verbose(C1525o1.a(this.f18589e, this.f18590f.v(), (String) null, 2, (Object) null));
                    return;
                }
            }
            ironLog.verbose(C1525o1.a(c1585w2, v4, (String) null, 2, (Object) null));
        } catch (Throwable th) {
            IronLog.INTERNAL.verbose(C1525o1.a(this.f18589e, this.f18590f.v(), (String) null, 2, (Object) null));
            throw th;
        }
    }
}
