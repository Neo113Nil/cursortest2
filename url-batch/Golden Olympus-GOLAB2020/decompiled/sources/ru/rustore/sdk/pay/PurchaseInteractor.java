package ru.rustore.sdk.pay;

import W1.m;
import com.ironsource.b9;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.core.tasks.Task;
import ru.rustore.sdk.pay.callback.PurchaseEventListener;
import ru.rustore.sdk.pay.internal.a7;
import ru.rustore.sdk.pay.internal.ak;
import ru.rustore.sdk.pay.internal.am;
import ru.rustore.sdk.pay.internal.b7;
import ru.rustore.sdk.pay.internal.bk;
import ru.rustore.sdk.pay.internal.cm;
import ru.rustore.sdk.pay.internal.dh;
import ru.rustore.sdk.pay.internal.dm;
import ru.rustore.sdk.pay.internal.ef;
import ru.rustore.sdk.pay.internal.em;
import ru.rustore.sdk.pay.internal.f;
import ru.rustore.sdk.pay.internal.ff;
import ru.rustore.sdk.pay.internal.g;
import ru.rustore.sdk.pay.internal.g6;
import ru.rustore.sdk.pay.internal.gf;
import ru.rustore.sdk.pay.internal.gm;
import ru.rustore.sdk.pay.internal.he;
import ru.rustore.sdk.pay.internal.hm;
import ru.rustore.sdk.pay.internal.ie;
import ru.rustore.sdk.pay.internal.jk;
import ru.rustore.sdk.pay.internal.jm;
import ru.rustore.sdk.pay.internal.ke;
import ru.rustore.sdk.pay.internal.km;
import ru.rustore.sdk.pay.internal.kn;
import ru.rustore.sdk.pay.internal.lm;
import ru.rustore.sdk.pay.internal.pm;
import ru.rustore.sdk.pay.internal.qe;
import ru.rustore.sdk.pay.internal.re;
import ru.rustore.sdk.pay.internal.sc;
import ru.rustore.sdk.pay.internal.t2;
import ru.rustore.sdk.pay.internal.tc;
import ru.rustore.sdk.pay.internal.te;
import ru.rustore.sdk.pay.internal.u2;
import ru.rustore.sdk.pay.internal.ue;
import ru.rustore.sdk.pay.internal.vc;
import ru.rustore.sdk.pay.internal.we;
import ru.rustore.sdk.pay.internal.wi;
import ru.rustore.sdk.pay.internal.y2;
import ru.rustore.sdk.pay.internal.z2;
import ru.rustore.sdk.pay.internal.zl;
import ru.rustore.sdk.pay.model.DeveloperPayload;
import ru.rustore.sdk.pay.model.PreferredPurchaseType;
import ru.rustore.sdk.pay.model.ProductPurchaseParams;
import ru.rustore.sdk.pay.model.ProductPurchaseResult;
import ru.rustore.sdk.pay.model.ProductType;
import ru.rustore.sdk.pay.model.Purchase;
import ru.rustore.sdk.pay.model.PurchaseAvailabilityResult;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.PurchaseStatus;
import ru.rustore.sdk.pay.model.SdkTheme;
import ru.rustore.sdk.pay.model.Url;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleMapKt;
import ru.rustore.sdk.reactive.single.SingleOnErrorReturnKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;

@Metadata
/* loaded from: classes3.dex */
public final class PurchaseInteractor {

    @NotNull
    private final sc controller;

    public PurchaseInteractor(@NotNull sc controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.controller = controller;
    }

    public static /* synthetic */ Task confirmTwoStepPurchase$default(PurchaseInteractor purchaseInteractor, PurchaseId purchaseId, DeveloperPayload developerPayload, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            developerPayload = null;
        }
        return purchaseInteractor.confirmTwoStepPurchase(purchaseId, developerPayload);
    }

    public static /* synthetic */ Task getPurchases$default(PurchaseInteractor purchaseInteractor, ProductType productType, PurchaseStatus purchaseStatus, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            productType = null;
        }
        if ((i4 & 2) != 0) {
            purchaseStatus = null;
        }
        return purchaseInteractor.getPurchases(productType, purchaseStatus);
    }

    public static /* synthetic */ Task purchase$default(PurchaseInteractor purchaseInteractor, ProductPurchaseParams productPurchaseParams, PreferredPurchaseType preferredPurchaseType, SdkTheme sdkTheme, PurchaseEventListener purchaseEventListener, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            preferredPurchaseType = PreferredPurchaseType.ONE_STEP;
        }
        if ((i4 & 4) != 0) {
            sdkTheme = SdkTheme.LIGHT;
        }
        if ((i4 & 8) != 0) {
            purchaseEventListener = null;
        }
        return purchaseInteractor.purchase(productPurchaseParams, preferredPurchaseType, sdkTheme, purchaseEventListener);
    }

    public static /* synthetic */ Task purchaseTwoStep$default(PurchaseInteractor purchaseInteractor, ProductPurchaseParams productPurchaseParams, SdkTheme sdkTheme, PurchaseEventListener purchaseEventListener, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            sdkTheme = SdkTheme.LIGHT;
        }
        if ((i4 & 4) != 0) {
            purchaseEventListener = null;
        }
        return purchaseInteractor.purchaseTwoStep(productPurchaseParams, sdkTheme, purchaseEventListener);
    }

    @NotNull
    public final Task<Unit> cancelTwoStepPurchase(@NotNull PurchaseId purchaseId) {
        String str;
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        sc scVar = this.controller;
        scVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        vc vcVar = scVar.f44994l;
        vcVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Map createMapBuilder = MapsKt.createMapBuilder();
        Map createMapBuilder2 = MapsKt.createMapBuilder();
        createMapBuilder2.putAll(MapsKt.mapOf(TuplesKt.to("sdkName", BuildConfig.SDK_NAME), TuplesKt.to("sdkType", vcVar.f45128a.f44957a.a().f44347a), TuplesKt.to("sdkVersion", BuildConfig.SDK_VERSION)));
        wi a4 = vcVar.f45129b.a();
        Intrinsics.checkNotNullParameter(a4, "<this>");
        boolean z4 = a4.f45190a;
        if (z4) {
            str = "1";
        } else {
            if (z4) {
                throw new m();
            }
            str = "0";
        }
        createMapBuilder2.put("sandbox", str);
        createMapBuilder2.put("without_rustore", String.valueOf(!(vcVar.f45131d.f44400a.f43878d.f44190a.get() instanceof ak.b)));
        String packageName = vcVar.f45132e.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        createMapBuilder2.put(b9.h.f15462V, packageName);
        createMapBuilder.putAll(MapsKt.build(createMapBuilder2));
        createMapBuilder.put("purchaseId", purchaseId.getValue());
        vcVar.f45130c.a("paySheet.purchaseProduct.cancelled", MapsKt.build(createMapBuilder));
        u2 u2Var = scVar.f44987e;
        u2Var.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        pm pmVar = u2Var.f45069a;
        pmVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        cm cmVar = pmVar.f44798a;
        cmVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        jm jmVar = cmVar.f43937a;
        jmVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        return dh.a(SingleMapKt.map(SingleMapKt.map(SingleMapKt.map(SingleFlatMapKt.flatMap(SingleSubscribeOnKt.subscribeOn(Single.Companion.from(new gm(purchaseId)), Dispatchers.INSTANCE.getIo()), new dm(jmVar.f44398a)), new zl(cmVar)), km.f44494a), new t2(purchaseId, u2Var)));
    }

    @NotNull
    public final Task<Unit> confirmTwoStepPurchase(@NotNull PurchaseId purchaseId, @Nullable DeveloperPayload developerPayload) {
        String str;
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        sc scVar = this.controller;
        scVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        vc vcVar = scVar.f44994l;
        vcVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Map createMapBuilder = MapsKt.createMapBuilder();
        Map createMapBuilder2 = MapsKt.createMapBuilder();
        createMapBuilder2.putAll(MapsKt.mapOf(TuplesKt.to("sdkName", BuildConfig.SDK_NAME), TuplesKt.to("sdkType", vcVar.f45128a.f44957a.a().f44347a), TuplesKt.to("sdkVersion", BuildConfig.SDK_VERSION)));
        wi a4 = vcVar.f45129b.a();
        Intrinsics.checkNotNullParameter(a4, "<this>");
        boolean z4 = a4.f45190a;
        if (z4) {
            str = "1";
        } else {
            if (z4) {
                throw new m();
            }
            str = "0";
        }
        createMapBuilder2.put("sandbox", str);
        createMapBuilder2.put("without_rustore", String.valueOf(!(vcVar.f45131d.f44400a.f43878d.f44190a.get() instanceof ak.b)));
        String packageName = vcVar.f45132e.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        createMapBuilder2.put(b9.h.f15462V, packageName);
        createMapBuilder.putAll(MapsKt.build(createMapBuilder2));
        createMapBuilder.put("purchaseId", purchaseId.getValue());
        vcVar.f45130c.a("paySheet.purchaseProduct.confirmed", MapsKt.build(createMapBuilder));
        z2 z2Var = scVar.f44986d;
        z2Var.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        pm pmVar = z2Var.f45309a;
        pmVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        cm cmVar = pmVar.f44798a;
        cmVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        jm jmVar = cmVar.f43937a;
        jmVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        return dh.a(SingleMapKt.map(SingleMapKt.map(SingleMapKt.map(SingleFlatMapKt.flatMap(SingleSubscribeOnKt.subscribeOn(Single.Companion.from(new hm(purchaseId, developerPayload)), Dispatchers.INSTANCE.getIo()), new em(jmVar.f44398a)), new am(cmVar)), lm.f44607a), new y2(purchaseId, z2Var)));
    }

    @NotNull
    public final Task<Purchase> getPurchase(@NotNull PurchaseId purchaseId) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        sc scVar = this.controller;
        scVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        g6 g6Var = scVar.f44983a;
        g6Var.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        gf gfVar = g6Var.f44161a;
        gfVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        ke keVar = gfVar.f44176a;
        keVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        we weVar = keVar.f44476a;
        weVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        return dh.a(SingleMapKt.map(SingleMapKt.map(SingleFlatMapKt.flatMap(SingleSubscribeOnKt.subscribeOn(Single.Companion.from(new qe(purchaseId)), Dispatchers.INSTANCE.getIo()), new te(weVar.f45165a)), new he(keVar)), new ef(gfVar.f44177b)));
    }

    @NotNull
    public final Task<PurchaseAvailabilityResult> getPurchaseAvailability() {
        bk bkVar = this.controller.f44985c.f43901a;
        bkVar.getClass();
        return dh.a(SingleOnErrorReturnKt.onErrorReturn(SingleMapKt.map(bkVar.a(new jk(bkVar)), a7.f43797a), b7.f43858a));
    }

    @NotNull
    public final Task<List<Purchase>> getPurchases(@Nullable ProductType productType, @Nullable PurchaseStatus purchaseStatus) {
        gf gfVar = this.controller.f44984b.f44219a;
        ke keVar = gfVar.f44176a;
        we weVar = keVar.f44476a;
        weVar.getClass();
        return dh.a(SingleMapKt.map(SingleMapKt.map(SingleFlatMapKt.flatMap(SingleSubscribeOnKt.subscribeOn(Single.Companion.from(new re(productType, purchaseStatus)), Dispatchers.INSTANCE.getIo()), new ue(weVar.f45165a)), new ie(keVar)), new ff(gfVar)));
    }

    @NotNull
    public final Task<ProductPurchaseResult> purchase(@NotNull ProductPurchaseParams params, @NotNull PreferredPurchaseType preferredPurchaseType, @NotNull SdkTheme sdkTheme, @Nullable PurchaseEventListener purchaseEventListener) {
        g gVar;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(preferredPurchaseType, "preferredPurchaseType");
        Intrinsics.checkNotNullParameter(sdkTheme, "sdkTheme");
        sc scVar = this.controller;
        scVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(preferredPurchaseType, "preferredPurchaseType");
        Intrinsics.checkNotNullParameter(sdkTheme, "sdkTheme");
        Url url = scVar.f44997o.a();
        scVar.f44998p.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        if (!kn.f44495a.d(StringsKt.T0(url.getValue(), "://", ""))) {
            return Task.Companion.create(tc.f45041a);
        }
        int i4 = sc.a.f45000a[preferredPurchaseType.ordinal()];
        if (i4 == 1) {
            gVar = g.a.C0257a.f44138a;
        } else {
            if (i4 != 2) {
                throw new m();
            }
            gVar = g.a.b.f44139a;
        }
        return scVar.a(params, gVar, sdkTheme, purchaseEventListener);
    }

    @NotNull
    public final Task<ProductPurchaseResult> purchaseTwoStep(@NotNull ProductPurchaseParams params, @NotNull SdkTheme sdkTheme, @Nullable PurchaseEventListener purchaseEventListener) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(sdkTheme, "sdkTheme");
        sc scVar = this.controller;
        scVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(sdkTheme, "sdkTheme");
        Url url = scVar.f44997o.a();
        scVar.f44998p.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        return !kn.f44495a.d(StringsKt.T0(url.getValue(), "://", "")) ? Task.Companion.create(tc.f45041a) : scVar.a(params, f.f44046a, sdkTheme, purchaseEventListener);
    }
}
