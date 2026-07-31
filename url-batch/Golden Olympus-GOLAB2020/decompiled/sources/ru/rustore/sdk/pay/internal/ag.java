package ru.rustore.sdk.pay.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import ru.rustore.sdk.pay.R;
import ru.rustore.sdk.pay.internal.a;
import ru.rustore.sdk.pay.internal.ag;
import ru.rustore.sdk.pay.internal.j7;
import ru.rustore.sdk.pay.internal.xa;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.pay.model.Url;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.observable.ObservableSubscribeKt;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleMapKt;
import ru.rustore.sdk.reactive.single.SingleObserveOnKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;
import ru.rustore.sdk.reactive.subject.Subject;

@Metadata
/* loaded from: classes3.dex */
public final class ag extends Fragment {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f43809e = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final W1.h f43810a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public Disposable f43811b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public WebView f43812c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public View f43813d;

    public /* synthetic */ class a extends kotlin.jvm.internal.p implements Function1<String, Unit> {
        public a(hg hgVar) {
            super(1, hgVar, hg.class, "handlePostMessage", "handlePostMessage(Ljava/lang/String;)V", 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0157  */
        @Override // kotlin.jvm.functions.Function1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invoke(Object obj) {
            Object m243constructorimpl;
            W1.q qVar;
            Object obj2;
            String message = (String) obj;
            Intrinsics.checkNotNullParameter(message, "p0");
            hg hgVar = (hg) this.receiver;
            hgVar.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            ru.rustore.sdk.pay.internal.a aVar = hgVar.f44260c.f45034a.f43892a.f43838a;
            if (aVar != null) {
                hgVar.f44264g.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                JSONObject jSONObject = new JSONObject(message);
                try {
                    Result.Companion companion = Result.Companion;
                    if (!Intrinsics.areEqual(jSONObject.get("type"), "billing")) {
                        obj2 = xa.f.f45217a;
                    } else if (Intrinsics.areEqual(jSONObject.get("action"), "mkPhoneFormShown")) {
                        obj2 = xa.a.f45212a;
                    } else if (Intrinsics.areEqual(jSONObject.get("action"), "mkPhoneValidationError")) {
                        obj2 = xa.c.f45214a;
                    } else if (Intrinsics.areEqual(jSONObject.get("action"), "mkPhoneFormSubmit")) {
                        String operatorName = jSONObject.getJSONObject("action_params").optString("operatorName", "Unknown operator");
                        Intrinsics.checkNotNullExpressionValue(operatorName, "operatorName");
                        obj2 = new xa.b(operatorName);
                    } else {
                        obj2 = Intrinsics.areEqual(jSONObject.get("action"), "mkOtpValidationError") ? xa.e.f45216a : Intrinsics.areEqual(jSONObject.get("action"), "mkResendOtpSms") ? xa.d.f45215a : xa.f.f45217a;
                    }
                    m243constructorimpl = Result.m243constructorimpl(obj2);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.d(m243constructorimpl) != null) {
                    m243constructorimpl = xa.f.f45217a;
                }
                xa xaVar = (xa) m243constructorimpl;
                if (aVar instanceof a.C0255a) {
                    f0 f0Var = hgVar.f44261d.f44056a.f44715b.f44719a;
                    if (f0Var != null) {
                        qVar = new W1.q(f0Var.f44048b, f0Var.f44047a, k.APPLICATION);
                        InvoiceId invoiceId = (InvoiceId) qVar.c();
                        PurchaseId purchaseId = (PurchaseId) qVar.d();
                        k analyticsProductType = (k) qVar.e();
                        if (!Intrinsics.areEqual(xaVar, xa.a.f45212a)) {
                            zf zfVar = hgVar.f44265h;
                            zfVar.getClass();
                            Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
                            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                            Map createMapBuilder = MapsKt.createMapBuilder();
                            createMapBuilder.putAll(zfVar.f45353a.a());
                            wc.a(createMapBuilder, "rustore_payment", analyticsProductType.f44406a, invoiceId, "invoiceId");
                            createMapBuilder.put("purchaseId", purchaseId.getValue());
                            createMapBuilder.put("method_type", "mobile");
                            zfVar.f45354b.a("PaySheetPhoneNumberOpened", MapsKt.build(createMapBuilder));
                        } else if (xaVar instanceof xa.b) {
                            zf zfVar2 = hgVar.f44265h;
                            String operatorName2 = ((xa.b) xaVar).f45213a;
                            zfVar2.getClass();
                            Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
                            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                            Intrinsics.checkNotNullParameter(operatorName2, "operatorName");
                            Map createMapBuilder2 = MapsKt.createMapBuilder();
                            createMapBuilder2.putAll(zfVar2.f45353a.a());
                            createMapBuilder2.put("operator", operatorName2);
                            wc.a(createMapBuilder2, "rustore_payment", analyticsProductType.f44406a, invoiceId, "invoiceId");
                            createMapBuilder2.put("purchaseId", purchaseId.getValue());
                            createMapBuilder2.put("method_type", "mobile");
                            zfVar2.f45354b.a("PaySheetPhoneNumberConfirmed", MapsKt.build(createMapBuilder2));
                        } else if (Intrinsics.areEqual(xaVar, xa.d.f45215a)) {
                            zf zfVar3 = hgVar.f44265h;
                            zfVar3.getClass();
                            Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
                            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                            Map createMapBuilder3 = MapsKt.createMapBuilder();
                            createMapBuilder3.putAll(zfVar3.f45353a.a());
                            wc.a(createMapBuilder3, "rustore_payment", analyticsProductType.f44406a, invoiceId, "invoiceId");
                            createMapBuilder3.put("purchaseId", purchaseId.getValue());
                            createMapBuilder3.put("method_type", "mobile");
                            zfVar3.f45354b.a("PaySheetPhoneNumberCodeAgain", MapsKt.build(createMapBuilder3));
                        } else if (Intrinsics.areEqual(xaVar, xa.c.f45214a)) {
                            zf zfVar4 = hgVar.f44265h;
                            zfVar4.getClass();
                            Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
                            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                            Map createMapBuilder4 = MapsKt.createMapBuilder();
                            createMapBuilder4.putAll(zfVar4.f45353a.a());
                            wc.a(createMapBuilder4, "rustore_payment", analyticsProductType.f44406a, invoiceId, "invoiceId");
                            createMapBuilder4.put("purchaseId", purchaseId.getValue());
                            createMapBuilder4.put("method_type", "mobile");
                            createMapBuilder4.put("error_message", "Invalid phone number");
                            zfVar4.f45354b.a("PaySheetPhoneNumberError", MapsKt.build(createMapBuilder4));
                        } else if (Intrinsics.areEqual(xaVar, xa.e.f45216a)) {
                            zf zfVar5 = hgVar.f44265h;
                            zfVar5.getClass();
                            Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
                            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                            Map createMapBuilder5 = MapsKt.createMapBuilder();
                            createMapBuilder5.putAll(zfVar5.f45353a.a());
                            wc.a(createMapBuilder5, "rustore_payment", analyticsProductType.f44406a, invoiceId, "invoiceId");
                            createMapBuilder5.put("purchaseId", purchaseId.getValue());
                            createMapBuilder5.put("method_type", "mobile");
                            createMapBuilder5.put("error_message", "Invalid confirmation code");
                            zfVar5.f45354b.a("PaySheetPhoneNumberError", MapsKt.build(createMapBuilder5));
                        } else {
                            Intrinsics.areEqual(xaVar, xa.f.f45217a);
                        }
                    }
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new W1.m();
                    }
                    qb qbVar = hgVar.f44262e.f45261a.f43860b.f44876a;
                    if (qbVar != null) {
                        qVar = new W1.q(qbVar.f44819d, qbVar.f44818c, j.a(qbVar.f44821f));
                        InvoiceId invoiceId2 = (InvoiceId) qVar.c();
                        PurchaseId purchaseId2 = (PurchaseId) qVar.d();
                        k analyticsProductType2 = (k) qVar.e();
                        if (!Intrinsics.areEqual(xaVar, xa.a.f45212a)) {
                        }
                    }
                }
            }
            return Unit.f41027a;
        }
    }

    public static final class b extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WebView f43814a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ag f43815b;

        public b(WebView webView, ag agVar) {
            this.f43814a = webView;
            this.f43815b = agVar;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            View view;
            super.onPageFinished(webView, str);
            WebView webView2 = this.f43815b.f43812c;
            if (webView2 == null || webView2.getVisibility() != 0 || (view = this.f43815b.f43813d) == null) {
                return;
            }
            view.setVisibility(8);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.f43814a.loadUrl("javascript: window.parent.addEventListener('message',function(e){Android.postMessage(e.data)});");
            View view = this.f43815b.f43813d;
            if (view == null) {
                return;
            }
            view.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            String string = this.f43815b.requireArguments().getString("paymentUrl");
            if (string != null) {
                yj yjVar = yj.I3;
                if (yjVar == null) {
                    throw new RuStorePaymentException.RuStorePayClientNotCreated("To get an instance of the RuStorePayClient, you must first initialize it", null, 2, null);
                }
                ((ao) yjVar.f45519i1.getValue()).getClass();
                if (ao.a(webResourceRequest, string)) {
                    hg hgVar = (hg) this.f43815b.f43810a.getValue();
                    StringBuilder sb = new StringBuilder("Error description: ");
                    sb.append((Object) (webResourceError != null ? webResourceError.getDescription() : null));
                    sb.append(". Error code: ");
                    sb.append(webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null);
                    hgVar.a(sb.toString());
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            PurchaseId purchaseId;
            String str;
            Uri url;
            String url2 = (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.toString();
            if (url2 != null) {
                hg hgVar = (hg) this.f43815b.f43810a.getValue();
                hgVar.getClass();
                Intrinsics.checkNotNullParameter(url2, "redirectUrl");
                ru.rustore.sdk.pay.internal.a aVar = hgVar.f44260c.f45034a.f43892a.f43838a;
                if (aVar == null) {
                    y7 y7Var = hgVar.f44267j;
                    RuStorePaymentException.RuStorePayInvalidActivePurchase throwable = new RuStorePaymentException.RuStorePayInvalidActivePurchase("No active purchase found when proceeding with redirect url.", null, 2, null);
                    y7Var.getClass();
                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                    u3.e.i(y7Var.f45263a, throwable, null, 2, null);
                    hgVar.b("No active purchase found when proceeding with redirect url.");
                } else {
                    boolean z4 = aVar instanceof a.C0255a;
                    if (z4) {
                        f0 f0Var = hgVar.f44261d.f44056a.f44715b.f44719a;
                        if (f0Var != null) {
                            purchaseId = f0Var.f44047a;
                            hgVar.f44258a.f45237a.getClass();
                            if (StringsKt.P(url2, new Url("https://api.rustore.ru/payment/redirect/success").getValue(), false, 2, null)) {
                                hgVar.f44259b.f44811a.getClass();
                                if (StringsKt.P(url2, new Url("https://api.rustore.ru/payment/redirect/fail").getValue(), false, 2, null)) {
                                    if (purchaseId != null) {
                                        hgVar.f44268k.setValue(j7.b.f44364a);
                                        bi biVar = hgVar.f44263f;
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
                                        hgVar.f44270m.add(SingleSubscribeKt.subscribe(SingleObserveOnKt.observeOn(SingleMapKt.map(SingleFlatMapKt.flatMap(SingleSubscribeOnKt.subscribeOn(from, dispatchers.getIo()), new ve(weVar.f45165a)), je.f44375a), dispatchers.getMain()), new dg(hgVar, purchaseId), new eg(hgVar)));
                                    } else {
                                        hgVar.b("Error occurred during payment by mobile phone account");
                                    }
                                } else if (StringsKt.P(url2, "https://money.mail.ru/oferta", false, 2, null)) {
                                    bg bgVar = hgVar.f44266i;
                                    bgVar.getClass();
                                    Intrinsics.checkNotNullParameter(url2, "url");
                                    bgVar.f43870a.a(url2);
                                } else if (Intrinsics.areEqual(url2, "https://www.rustore.ru/help/legal/concent-payment-refund")) {
                                    bg bgVar2 = hgVar.f44266i;
                                    bgVar2.getClass();
                                    Intrinsics.checkNotNullParameter(url2, "url");
                                    bgVar2.f43870a.a(url2);
                                }
                            } else if (purchaseId != null) {
                                bg bgVar3 = hgVar.f44266i;
                                bgVar3.getClass();
                                Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                                bgVar3.f43870a.b(purchaseId);
                            } else {
                                if (z4) {
                                    str = "Application purchase id was not found on success redirect";
                                } else {
                                    if (!(aVar instanceof a.b)) {
                                        throw new W1.m();
                                    }
                                    str = "Product purchase id was not found on success redirect";
                                }
                                y7 y7Var2 = hgVar.f44267j;
                                RuStorePaymentException.RuStorePaymentCommonException throwable2 = new RuStorePaymentException.RuStorePaymentCommonException(str, null, 2, null);
                                y7Var2.getClass();
                                Intrinsics.checkNotNullParameter(throwable2, "throwable");
                                u3.e.i(y7Var2.f45263a, throwable2, null, 2, null);
                                hgVar.b(str);
                            }
                        }
                        purchaseId = null;
                        hgVar.f44258a.f45237a.getClass();
                        if (StringsKt.P(url2, new Url("https://api.rustore.ru/payment/redirect/success").getValue(), false, 2, null)) {
                        }
                    } else {
                        if (!(aVar instanceof a.b)) {
                            throw new W1.m();
                        }
                        qb qbVar = hgVar.f44262e.f45261a.f43860b.f44876a;
                        if (qbVar != null) {
                            purchaseId = qbVar.f44818c;
                            hgVar.f44258a.f45237a.getClass();
                            if (StringsKt.P(url2, new Url("https://api.rustore.ru/payment/redirect/success").getValue(), false, 2, null)) {
                            }
                        }
                        purchaseId = null;
                        hgVar.f44258a.f45237a.getClass();
                        if (StringsKt.P(url2, new Url("https://api.rustore.ru/payment/redirect/success").getValue(), false, 2, null)) {
                        }
                    }
                }
            } else {
                ((hg) this.f43815b.f43810a.getValue()).a("Request url is null");
            }
            if ((url2 == null || !StringsKt.P(url2, "https://money.mail.ru/oferta", false, 2, null)) && !Intrinsics.areEqual(url2, "https://www.rustore.ru/help/legal/concent-payment-refund")) {
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            return true;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements Function1<j7, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f43817b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Bundle bundle) {
            super(1);
            this.f43817b = bundle;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            j7 state = (j7) obj;
            Intrinsics.checkNotNullParameter(state, "state");
            if (state instanceof j7.a) {
                View view = ag.this.f43813d;
                if (view != null) {
                    view.setVisibility(8);
                }
                WebView webView = ag.this.f43812c;
                if (webView != null) {
                    webView.setVisibility(0);
                }
                ag.this.a(this.f43817b);
            } else if (Intrinsics.areEqual(state, j7.b.f44364a)) {
                WebView webView2 = ag.this.f43812c;
                if (webView2 != null) {
                    webView2.setVisibility(8);
                }
                View view2 = ag.this.f43813d;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            }
            return Unit.f41027a;
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements Function0<Fragment> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ag.this;
        }
    }

    public static final class e extends kotlin.jvm.internal.s implements Function0<androidx.lifecycle.b0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f43819a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f43819a = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            androidx.lifecycle.b0 viewModelStore = ((androidx.lifecycle.c0) this.f43819a.invoke()).getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "ownerProducer().viewModelStore");
            return viewModelStore;
        }
    }

    public ag() {
        super(R.layout.sdk_pay_purchase_with_mobile_phone_fragment);
        this.f43810a = E.a(this, H.b(hg.class), new e(new d()), null);
    }

    public final void a(Bundle bundle) {
        Bundle bundle2;
        WebView webView;
        WebView webView2 = this.f43812c;
        if (webView2 != null) {
            webView2.setBackgroundColor(requireContext().getColor(r5.a(this, R.attr.sdk_pay_surface_primary, R.color.sdk_pay_surface_primary_light)));
            webView2.addJavascriptInterface(new ab(new a((hg) this.f43810a.getValue())), com.ironsource.b9.f15266d);
            webView2.setWebViewClient(new b(webView2, this));
            webView2.getSettings().setJavaScriptEnabled(true);
            webView2.setOnTouchListener(new View.OnTouchListener() { // from class: D3.a
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return ag.a(view, motionEvent);
                }
            });
            String string = requireArguments().getString("paymentUrl");
            if (string != null) {
                webView2.loadUrl(string);
            } else {
                ((hg) this.f43810a.getValue()).a("Url for payment with mobile phone is null");
            }
        }
        if (bundle == null || (bundle2 = bundle.getBundle("webViewState")) == null || (webView = this.f43812c) == null) {
            return;
        }
        webView.restoreState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Disposable disposable = this.f43811b;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        Bundle bundle = new Bundle();
        WebView webView = this.f43812c;
        if (webView != null) {
            webView.saveState(bundle);
        }
        outState.putBundle("webViewState", bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.f43812c = (WebView) view.findViewById(R.id.mobile_phone_payment_web_view);
        this.f43813d = view.findViewById(R.id.progress_indicator);
        this.f43811b = ObservableSubscribeKt.subscribe$default(Subject.DefaultImpls.observe$default(((hg) this.f43810a.getValue()).f44269l, null, 1, null), null, null, new c(bundle), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
    
        if (r4 != 2) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
            return false;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }
}
