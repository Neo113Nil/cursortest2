package com.ironsource;

import com.ironsource.C1542q4;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.q5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1543q5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1585w2 f18766a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC1584w1 f18767b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.ironsource.mediationsdk.e f18768c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C1450d5 f18769d;

    @Metadata
    /* renamed from: com.ironsource.q5$a */
    public static final class a implements C1542q4.d {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1549r5 f18771b;

        a(InterfaceC1549r5 interfaceC1549r5) {
            this.f18771b = interfaceC1549r5;
        }

        @Override // com.ironsource.C1542q4.d
        public void a(@NotNull C1542q4 auction) {
            Intrinsics.checkNotNullParameter(auction, "auction");
            C1543q5.this.b(auction, this.f18771b);
        }

        @Override // com.ironsource.C1542q4.d
        public void a(@NotNull C1542q4 auction, @NotNull String error) {
            Intrinsics.checkNotNullParameter(auction, "auction");
            Intrinsics.checkNotNullParameter(error, "error");
            C1543q5.this.b(auction, this.f18771b);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.q5$b */
    public static final class b implements InterfaceC1555s4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1549r5 f18772a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1542q4 f18773b;

        b(InterfaceC1549r5 interfaceC1549r5, C1542q4 c1542q4) {
            this.f18772a = interfaceC1549r5;
            this.f18773b = c1542q4;
        }

        @Override // com.ironsource.InterfaceC1555s4
        public void a(int i4, @NotNull String errorMessage, int i5, @NotNull String auctionFallback, long j4) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
            this.f18772a.a(i4, errorMessage, i5, auctionFallback, j4);
        }

        @Override // com.ironsource.InterfaceC1555s4
        public void a(@NotNull List<C1513m5> newWaterfall, @NotNull String auctionId, @Nullable C1513m5 c1513m5, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, int i4, long j4, int i5, @Nullable String str) {
            Intrinsics.checkNotNullParameter(newWaterfall, "newWaterfall");
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            this.f18772a.a(newWaterfall, this.f18773b.c(), auctionId, c1513m5, jSONObject, jSONObject2, i4, j4, i5, str);
        }
    }

    public C1543q5(@NotNull C1585w2 adTools, @NotNull AbstractC1584w1 adUnitData) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f18766a = adTools;
        this.f18767b = adUnitData;
        C1529o5 e4 = adUnitData.e();
        String sessionId = IronSourceUtils.getSessionId();
        Intrinsics.checkNotNullExpressionValue(sessionId, "getSessionId()");
        com.ironsource.mediationsdk.e eVar = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(e4, sessionId));
        this.f18768c = eVar;
        this.f18769d = new C1450d5(adTools, eVar);
    }

    private final com.ironsource.mediationsdk.i a(C1542q4 c1542q4, int i4) {
        com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(this.f18767b.b().a());
        iVar.b(IronSourceUtils.isEncryptedResponse());
        iVar.a(c1542q4.d().a());
        iVar.a(c1542q4.d().b());
        iVar.a(this.f18766a.h());
        iVar.a(i4);
        iVar.a(this.f18766a.l());
        fu f4 = this.f18767b.b().f();
        iVar.e(f4 != null ? f4.b() : false);
        InterfaceC1471g5 i5 = this.f18766a.i();
        if (i5 != null) {
            i5.a(iVar);
        }
        return iVar;
    }

    @NotNull
    public final C1450d5 b() {
        return this.f18769d;
    }

    private final String a() {
        return C1525o1.a(this.f18766a, (String) null, (String) null, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(C1542q4 c1542q4, InterfaceC1549r5 interfaceC1549r5) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("auction waterfallString = " + ((Object) c1542q4.d().c())));
        if (!c1542q4.g()) {
            ironLog.verbose(a("auction failed - no candidates"));
            this.f18766a.e().b().a(1005, "No candidates available for auctioning");
            interfaceC1549r5.a(C1426a2.e(this.f18767b.b().a()), "no available ad to load");
        } else {
            this.f18766a.e().b().b(c1542q4.d().c().toString());
            this.f18768c.a(ContextProvider.getInstance().getApplicationContext(), a(c1542q4, this.f18766a.f()), new b(interfaceC1549r5, c1542q4));
        }
    }

    private final String a(String str) {
        return C1525o1.a(this.f18766a, str, (String) null, 2, (Object) null);
    }

    private final void a(C1542q4 c1542q4, InterfaceC1549r5 interfaceC1549r5) {
        if (c1542q4.f()) {
            c1542q4.a(new a(interfaceC1549r5));
        } else {
            b(c1542q4, interfaceC1549r5);
        }
    }

    public void a(@NotNull InterfaceC1549r5 completionListener) {
        Intrinsics.checkNotNullParameter(completionListener, "completionListener");
        IronLog.INTERNAL.verbose(a());
        this.f18766a.e().b().a();
        a(new C1542q4(this.f18766a, this.f18767b), completionListener);
    }
}
