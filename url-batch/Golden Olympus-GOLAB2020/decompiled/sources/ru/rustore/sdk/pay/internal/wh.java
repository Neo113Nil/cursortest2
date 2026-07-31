package ru.rustore.sdk.pay.internal;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.rustore.sdk.pay.internal.a;
import ru.rustore.sdk.pay.internal.ai;
import ru.rustore.sdk.pay.internal.d;
import ru.rustore.sdk.pay.internal.hf;
import ru.rustore.sdk.pay.internal.za;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.OrderId;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.Quantity;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.pay.model.Url;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleMapKt;
import ru.rustore.sdk.reactive.single.SingleObserveOnKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;
import ru.rustore.sdk.reactive.subject.MutableStateSubject;
import ru.rustore.sdk.reactive.subject.SubjectExtensionsKt;

/* loaded from: classes3.dex */
public final class wh {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final xl f45176a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final q5 f45177b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final e f45178c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final t5 f45179d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final f6 f45180e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final y5 f45181f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final bi f45182g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public final zh f45183h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public final xh f45184i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    public final bb f45185j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    public final y7 f45186k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    public final ArrayList f45187l;

    /* renamed from: m, reason: collision with root package name */
    public int f45188m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableStateSubject<ai> f45189n;

    public wh(@NotNull xl successUrlRepository, @NotNull q5 failureUrlRepository, @NotNull e activePurchaseStateRepository, @NotNull t5 getActivePurchaseUseCase, @NotNull f6 getPurchaseApplicationUseCase, @NotNull y5 getProductPurchaseUseCase, @NotNull bi rejectPurchaseUseCase, @NotNull zh router, @NotNull xh analytics, @NotNull bb postMessageFactory, @NotNull y7 logger) {
        Intrinsics.checkNotNullParameter(successUrlRepository, "successUrlRepository");
        Intrinsics.checkNotNullParameter(failureUrlRepository, "failureUrlRepository");
        Intrinsics.checkNotNullParameter(activePurchaseStateRepository, "activePurchaseStateRepository");
        Intrinsics.checkNotNullParameter(getActivePurchaseUseCase, "getActivePurchaseUseCase");
        Intrinsics.checkNotNullParameter(getPurchaseApplicationUseCase, "getPurchaseApplicationUseCase");
        Intrinsics.checkNotNullParameter(getProductPurchaseUseCase, "getProductPurchaseUseCase");
        Intrinsics.checkNotNullParameter(rejectPurchaseUseCase, "rejectPurchaseUseCase");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(postMessageFactory, "postMessageFactory");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f45176a = successUrlRepository;
        this.f45177b = failureUrlRepository;
        this.f45178c = activePurchaseStateRepository;
        this.f45179d = getActivePurchaseUseCase;
        this.f45180e = getPurchaseApplicationUseCase;
        this.f45181f = getProductPurchaseUseCase;
        this.f45182g = rejectPurchaseUseCase;
        this.f45183h = router;
        this.f45184i = analytics;
        this.f45185j = postMessageFactory;
        this.f45186k = logger;
        this.f45187l = new ArrayList();
        MutableStateSubject<ai> mutableStateSubject = new MutableStateSubject<>(ai.a.f43821a);
        this.f45189n = mutableStateSubject;
        SubjectExtensionsKt.asSubject(mutableStateSubject);
    }

    public static hf.a.b a(f0 f0Var, String str) {
        return new hf.a.b(f0Var != null ? f0Var.f44047a : null, f0Var != null ? f0Var.f44048b : null, f0Var != null ? f0Var.f44050d : null, new RuStorePaymentException.RuStorePaymentCommonException(str, null, 2, null));
    }

    public final void b(@NotNull String redirectUrl) {
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        a aVar = this.f45179d.f45034a.f43892a.f43838a;
        if (aVar instanceof a.C0255a) {
            a(redirectUrl, aVar, this.f45180e.f44056a.f44715b.f44719a, (qb) null);
            return;
        }
        if (aVar instanceof a.b) {
            a(redirectUrl, aVar, (f0) null, this.f45181f.f45261a.f43860b.f44876a);
            return;
        }
        if (aVar != null) {
            throw new W1.m();
        }
        y7 y7Var = this.f45186k;
        RuStorePaymentException.RuStorePayInvalidActivePurchase throwable = new RuStorePaymentException.RuStorePayInvalidActivePurchase("No active purchase found", null, 2, null);
        y7Var.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        u3.e.i(y7Var.f45263a, throwable, null, 2, null);
        RuStorePaymentException.RuStorePayInvalidActivePurchase throwable2 = new RuStorePaymentException.RuStorePayInvalidActivePurchase("No active purchase found when proceeding with redirect url.", null, 2, null);
        y7 y7Var2 = this.f45186k;
        y7Var2.getClass();
        Intrinsics.checkNotNullParameter(throwable2, "throwable");
        u3.e.i(y7Var2.f45263a, throwable2, null, 2, null);
        a(throwable2.getMessage());
    }

    public final void c(@NotNull String data) {
        Object m243constructorimpl;
        Object a4;
        Intrinsics.checkNotNullParameter(data, "message");
        this.f45185j.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        JSONObject jSONObject = new JSONObject(data);
        try {
            Result.Companion companion = Result.Companion;
            if (!Intrinsics.areEqual(jSONObject.get("type"), "billing")) {
                a4 = za.i.f45333a;
            } else if (Intrinsics.areEqual(jSONObject.get("action"), "3dsPage")) {
                a4 = za.b.f45325a;
            } else if (Intrinsics.areEqual(jSONObject.get("action"), "3dsFinish")) {
                a4 = za.a.f45324a;
            } else if (Intrinsics.areEqual(jSONObject.get("action"), "session_fail")) {
                a4 = za.g.f45331a;
            } else if (Intrinsics.areEqual(jSONObject.get("action"), "payError")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("action_params");
                String optString = jSONObject2.optString("code", "error code is not present");
                Intrinsics.checkNotNullExpressionValue(optString, "actionParams.optString(E…DEFAULT_ERROR_CODE_PARAM)");
                String optString2 = jSONObject2.optString("descr", "error description is not present");
                Intrinsics.checkNotNullExpressionValue(optString2, "actionParams.optString(E…_ERROR_DESCRIPTION_PARAM)");
                a4 = new za.d(optString, optString2);
            } else {
                a4 = Intrinsics.areEqual(jSONObject.get("action"), "fireEvent") ? bb.a(jSONObject) : Intrinsics.areEqual(jSONObject.get("action"), "paySendForm") ? za.h.f45332a : Intrinsics.areEqual(jSONObject.get("action"), "payRetry") ? za.e.f45329a : Intrinsics.areEqual(jSONObject.get("action"), "addCard") ? new za.f(jSONObject.getBoolean("action_params")) : za.i.f45333a;
            }
            m243constructorimpl = Result.m243constructorimpl(a4);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.d(m243constructorimpl) != null) {
            m243constructorimpl = za.i.f45333a;
        }
        za zaVar = (za) m243constructorimpl;
        a aVar = this.f45179d.f45034a.f43892a.f43838a;
        if (aVar instanceof a.C0255a) {
            f0 f0Var = this.f45180e.f44056a.f44715b.f44719a;
            if (f0Var == null) {
                return;
            }
            a(zaVar, k.APPLICATION, f0Var.f44048b, f0Var.f44047a);
            return;
        }
        if (aVar instanceof a.b) {
            qb qbVar = this.f45181f.f45261a.f43860b.f44876a;
            if ((aVar instanceof a.C0255a) || qbVar == null) {
                return;
            }
            a(zaVar, j.a(qbVar.f44821f), qbVar.f44819d, qbVar.f44818c);
            return;
        }
        if (aVar != null) {
            throw new W1.m();
        }
        y7 y7Var = this.f45186k;
        RuStorePaymentException.RuStorePayInvalidActivePurchase throwable = new RuStorePaymentException.RuStorePayInvalidActivePurchase("No active purchase found", null, 2, null);
        y7Var.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        u3.e.i(y7Var.f45263a, throwable, null, 2, null);
    }

    public final void a(String str, a aVar, f0 f0Var, qb qbVar) {
        PurchaseId purchaseId;
        String str2;
        hf result;
        boolean z4 = aVar instanceof a.C0255a;
        if (z4) {
            if (f0Var != null) {
                purchaseId = f0Var.f44047a;
            }
            purchaseId = null;
        } else {
            if (!(aVar instanceof a.b)) {
                throw new W1.m();
            }
            if (qbVar != null) {
                purchaseId = qbVar.f44818c;
            }
            purchaseId = null;
        }
        this.f45176a.f45237a.getClass();
        if (StringsKt.P(str, new Url("https://api.rustore.ru/payment/redirect/success").getValue(), false, 2, null)) {
            if (purchaseId != null) {
                zh zhVar = this.f45183h;
                zhVar.getClass();
                Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                zhVar.f45365a.b(purchaseId);
                return;
            }
            if (z4) {
                str2 = "Application purchase details not found on success redirect";
            } else {
                if (!(aVar instanceof a.b)) {
                    throw new W1.m();
                }
                str2 = "Product purchase details not found on success redirect";
            }
            y7 y7Var = this.f45186k;
            RuStorePaymentException.RuStorePaymentCommonException throwable = new RuStorePaymentException.RuStorePaymentCommonException(str2, null, 2, null);
            y7Var.getClass();
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            u3.e.i(y7Var.f45263a, throwable, null, 2, null);
            if (z4) {
                result = a(f0Var, str2);
            } else {
                if (!(aVar instanceof a.b)) {
                    throw new W1.m();
                }
                result = a(qbVar, str2);
            }
            zh zhVar2 = this.f45183h;
            zhVar2.getClass();
            Intrinsics.checkNotNullParameter(result, "result");
            zhVar2.f45365a.a(result, false);
            return;
        }
        this.f45177b.f44811a.getClass();
        if (StringsKt.P(str, new Url("https://api.rustore.ru/payment/redirect/fail").getValue(), false, 2, null)) {
            if (purchaseId == null) {
                if (z4) {
                    hf.a.b result2 = a(f0Var, "Error occurred during payment by card");
                    zh zhVar3 = this.f45183h;
                    zhVar3.getClass();
                    Intrinsics.checkNotNullParameter(result2, "result");
                    zhVar3.f45365a.a((hf) result2, false);
                    return;
                }
                if (aVar instanceof a.b) {
                    hf.b.C0259b result3 = a(qbVar, "Error occurred during payment by card");
                    zh zhVar4 = this.f45183h;
                    zhVar4.getClass();
                    Intrinsics.checkNotNullParameter(result3, "result");
                    zhVar4.f45365a.a((hf) result3, false);
                    return;
                }
                return;
            }
            this.f45189n.setValue(ai.b.f43822a);
            bi biVar = this.f45182g;
            biVar.getClass();
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            gf gfVar = biVar.f43873a;
            gfVar.getClass();
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            ke keVar = gfVar.f44176a;
            keVar.getClass();
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            we weVar = keVar.f44476a;
            weVar.getClass();
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Single from = Single.Companion.from(new se(purchaseId));
            Dispatchers dispatchers = Dispatchers.INSTANCE;
            this.f45187l.add(SingleSubscribeKt.subscribe(SingleObserveOnKt.observeOn(SingleMapKt.map(SingleFlatMapKt.flatMap(SingleSubscribeOnKt.subscribeOn(from, dispatchers.getIo()), new ve(weVar.f45165a)), je.f44375a), dispatchers.getMain()), new sh(this, purchaseId), new th(this)));
        }
    }

    public static hf.b.C0259b a(qb qbVar, String str) {
        ze zeVar;
        PurchaseId purchaseId = qbVar != null ? qbVar.f44818c : null;
        InvoiceId invoiceId = qbVar != null ? qbVar.f44819d : null;
        OrderId orderId = qbVar != null ? qbVar.f44816a : null;
        Quantity quantity = (qbVar == null || (zeVar = qbVar.f44822g) == null) ? null : zeVar.getQuantity();
        return new hf.b.C0259b(orderId, purchaseId, qbVar != null ? qbVar.f44817b : null, invoiceId, quantity, qbVar != null ? qbVar.f44820e : null, qbVar != null ? Boolean.valueOf(qbVar.f44823h) : null, qbVar != null ? qbVar.f44821f : null, new RuStorePaymentException.RuStorePaymentCommonException(str, null, 2, null));
    }

    public final void a(za zaVar, k type, InvoiceId invoiceId, PurchaseId purchaseId) {
        String str;
        hf a4;
        if (zaVar instanceof za.b) {
            xh xhVar = this.f45184i;
            xhVar.getClass();
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            Map createMapBuilder = MapsKt.createMapBuilder();
            createMapBuilder.putAll(xhVar.f45230a.a());
            wc.a(createMapBuilder, "rustore_payment", type.f44406a, invoiceId, "invoiceId");
            xhVar.f45231b.a("PaymentSdkSheetDsPage", MapsKt.build(createMapBuilder));
            return;
        }
        if (zaVar instanceof za.a) {
            xh xhVar2 = this.f45184i;
            xhVar2.getClass();
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            Map createMapBuilder2 = MapsKt.createMapBuilder();
            createMapBuilder2.putAll(xhVar2.f45230a.a());
            wc.a(createMapBuilder2, "rustore_payment", type.f44406a, invoiceId, "invoiceId");
            xhVar2.f45231b.a("PaymentSdkSheetDsFinish", MapsKt.build(createMapBuilder2));
            return;
        }
        if (zaVar instanceof za.g) {
            xh xhVar3 = this.f45184i;
            xhVar3.getClass();
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            Map createMapBuilder3 = MapsKt.createMapBuilder();
            createMapBuilder3.putAll(xhVar3.f45230a.a());
            wc.a(createMapBuilder3, "rustore_payment", type.f44406a, invoiceId, "invoiceId");
            xhVar3.f45231b.a("PaymentSdkSheetSessionFail", MapsKt.build(createMapBuilder3));
            return;
        }
        if (zaVar instanceof za.d) {
            xh xhVar4 = this.f45184i;
            za.d dVar = (za.d) zaVar;
            String errorCode = dVar.f45327a;
            String errorDescription = dVar.f45328b;
            xhVar4.getClass();
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
            Map createMapBuilder4 = MapsKt.createMapBuilder();
            createMapBuilder4.putAll(xhVar4.f45230a.a());
            wc.a(createMapBuilder4, "rustore_payment", type.f44406a, invoiceId, "invoiceId");
            createMapBuilder4.put("purchaseId", purchaseId.getValue());
            createMapBuilder4.put("error_code", errorCode);
            createMapBuilder4.put("error_description", errorDescription);
            xhVar4.f45231b.a("PaymentSdkSheetError", MapsKt.build(createMapBuilder4));
            String str2 = dVar.f45328b;
            a aVar = this.f45179d.f45034a.f43892a.f43838a;
            if (aVar instanceof a.C0255a) {
                hf.a.b a5 = a(this.f45180e.f44056a.f44715b.f44719a, "Error application payment. Description: " + str2);
                e eVar = this.f45178c;
                d.a state = new d.a(a5);
                eVar.getClass();
                Intrinsics.checkNotNullParameter(state, "state");
                eVar.f43981a = state;
                return;
            }
            if (!(aVar instanceof a.b)) {
                if (aVar != null) {
                    throw new W1.m();
                }
                y7 y7Var = this.f45186k;
                RuStorePaymentException.RuStorePayInvalidActivePurchase throwable = new RuStorePaymentException.RuStorePayInvalidActivePurchase("No active purchase found", null, 2, null);
                y7Var.getClass();
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                u3.e.i(y7Var.f45263a, throwable, null, 2, null);
                throw new IllegalStateException("No active purchase");
            }
            qb qbVar = this.f45181f.f45261a.f43860b.f44876a;
            if (aVar instanceof a.C0255a) {
                a4 = a((f0) null, "Error application payment. Description: " + str2);
            } else {
                a4 = a(qbVar, "Error product payment. Description: " + str2);
            }
            e eVar2 = this.f45178c;
            d.a state2 = new d.a(a4);
            eVar2.getClass();
            Intrinsics.checkNotNullParameter(state2, "state");
            eVar2.f43981a = state2;
            return;
        }
        if (zaVar instanceof za.j) {
            xh xhVar5 = this.f45184i;
            String source = ((za.j) zaVar).f45334a.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(source, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            xhVar5.getClass();
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            Intrinsics.checkNotNullParameter(source, "source");
            Map createMapBuilder5 = MapsKt.createMapBuilder();
            createMapBuilder5.putAll(xhVar5.f45230a.a());
            createMapBuilder5.put("source_error", source);
            wc.a(createMapBuilder5, "rustore_payment", type.f44406a, invoiceId, "invoiceId");
            xhVar5.f45231b.a("PaymentSdkSheetPayClientError", MapsKt.build(createMapBuilder5));
            return;
        }
        if (zaVar instanceof za.h) {
            xh xhVar6 = this.f45184i;
            xhVar6.getClass();
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            Map createMapBuilder6 = MapsKt.createMapBuilder();
            createMapBuilder6.putAll(xhVar6.f45230a.a());
            wc.a(createMapBuilder6, "rustore_payment", type.f44406a, invoiceId, "invoiceId");
            xhVar6.f45231b.a("PaymentSdkSheetPaySendForm", MapsKt.build(createMapBuilder6));
            return;
        }
        if (zaVar instanceof za.e) {
            xh xhVar7 = this.f45184i;
            xhVar7.getClass();
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            Map createMapBuilder7 = MapsKt.createMapBuilder();
            createMapBuilder7.putAll(xhVar7.f45230a.a());
            wc.a(createMapBuilder7, "rustore_payment", type.f44406a, invoiceId, "invoiceId");
            xhVar7.f45231b.a("PaymentSdkSheetPayRetry", MapsKt.build(createMapBuilder7));
            return;
        }
        if (zaVar instanceof za.f) {
            xh xhVar8 = this.f45184i;
            boolean z4 = ((za.f) zaVar).f45330a;
            xhVar8.getClass();
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            if (z4) {
                str = "1";
            } else if (!z4) {
                str = "0";
            } else {
                throw new W1.m();
            }
            Map createMapBuilder8 = MapsKt.createMapBuilder();
            createMapBuilder8.putAll(xhVar8.f45230a.a());
            wc.a(createMapBuilder8, "rustore_payment", type.f44406a, invoiceId, "invoiceId");
            createMapBuilder8.put("purchaseId", purchaseId.getValue());
            createMapBuilder8.put("method_type", "new_card");
            createMapBuilder8.put("isSaveCardSelected", str);
            xhVar8.f45231b.a("PaySheetSaveCardSelected", MapsKt.build(createMapBuilder8));
            return;
        }
        if (zaVar instanceof za.c) {
            xh xhVar9 = this.f45184i;
            xhVar9.getClass();
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Map createMapBuilder9 = MapsKt.createMapBuilder();
            createMapBuilder9.putAll(xhVar9.f45230a.a());
            wc.a(createMapBuilder9, "rustore_payment", type.f44406a, invoiceId, "invoiceId");
            createMapBuilder9.put("purchaseId", purchaseId.getValue());
            createMapBuilder9.put("method_type", "new_card");
            xhVar9.f45231b.a("PaySheetPaymentPay", MapsKt.build(createMapBuilder9));
        }
    }

    public final void a(String str) {
        a aVar = this.f45179d.f45034a.f43892a.f43838a;
        if (aVar instanceof a.C0255a) {
            hf.a.b result = a(this.f45180e.f44056a.f44715b.f44719a, str);
            zh zhVar = this.f45183h;
            zhVar.getClass();
            Intrinsics.checkNotNullParameter(result, "result");
            zhVar.f45365a.a((hf) result, false);
            return;
        }
        if (!(aVar instanceof a.b)) {
            if (aVar == null) {
                y7 y7Var = this.f45186k;
                RuStorePaymentException.RuStorePayInvalidActivePurchase throwable = new RuStorePaymentException.RuStorePayInvalidActivePurchase("No active purchase found", null, 2, null);
                y7Var.getClass();
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                u3.e.i(y7Var.f45263a, throwable, null, 2, null);
                hf.b.C0259b result2 = a((qb) null, str);
                zh zhVar2 = this.f45183h;
                zhVar2.getClass();
                Intrinsics.checkNotNullParameter(result2, "result");
                zhVar2.f45365a.a((hf) result2, false);
                return;
            }
            throw new W1.m();
        }
        qb qbVar = this.f45181f.f45261a.f43860b.f44876a;
        if (aVar instanceof a.C0255a) {
            hf.a.b result3 = a((f0) null, str);
            zh zhVar3 = this.f45183h;
            zhVar3.getClass();
            Intrinsics.checkNotNullParameter(result3, "result");
            zhVar3.f45365a.a((hf) result3, false);
            return;
        }
        hf.b.C0259b result4 = a(qbVar, str);
        zh zhVar4 = this.f45183h;
        zhVar4.getClass();
        Intrinsics.checkNotNullParameter(result4, "result");
        zhVar4.f45365a.a((hf) result4, false);
    }
}
