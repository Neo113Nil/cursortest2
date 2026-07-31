package ru.rustore.sdk.pay.internal;

import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Y;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import ru.rustore.sdk.pay.R;
import ru.rustore.sdk.pay.internal.rn;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.pay.model.Url;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.observable.ObservableSubscribeKt;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleMapKt;
import ru.rustore.sdk.reactive.single.SingleObserveOnKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;
import ru.rustore.sdk.reactive.subject.Subject;

@Metadata
/* loaded from: classes3.dex */
public final class rn extends Fragment {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f44936d = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final W1.h f44937a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public WebView f44938b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public Disposable f44939c;

    public /* synthetic */ class a extends kotlin.jvm.internal.p implements Function1<String, Unit> {
        public a(xn xnVar) {
            super(1, xnVar, xn.class, "setSession", "setSession(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            String sessionJsonString = (String) obj;
            Intrinsics.checkNotNullParameter(sessionJsonString, "p0");
            xn xnVar = (xn) this.receiver;
            xnVar.getClass();
            Intrinsics.checkNotNullParameter(sessionJsonString, "paymentInfo");
            tk tkVar = xnVar.f45242c;
            Url authUrl = xnVar.f45240a;
            tkVar.getClass();
            Intrinsics.checkNotNullParameter(sessionJsonString, "sessionJsonString");
            Intrinsics.checkNotNullParameter(authUrl, "authUrl");
            Single map = SingleMapKt.map(Single.Companion.from(new rk(tkVar, sessionJsonString, authUrl)), new sk(tkVar.f45046b));
            Dispatchers dispatchers = Dispatchers.INSTANCE;
            xnVar.f45248i.add(SingleSubscribeKt.subscribe(SingleObserveOnKt.observeOn(SingleSubscribeOnKt.subscribeOn(map, dispatchers.getIo()), dispatchers.getMain()), new vn(xnVar), new wn(xnVar)));
            return Unit.f41027a;
        }
    }

    public /* synthetic */ class b extends kotlin.jvm.internal.p implements Function1<String, Unit> {
        public b(xn xnVar) {
            super(1, xnVar, xn.class, "handleWebError", "handleWebError(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Object m243constructorimpl;
            String errorResponse = (String) obj;
            Intrinsics.checkNotNullParameter(errorResponse, "p0");
            xn xnVar = (xn) this.receiver;
            xnVar.getClass();
            Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
            xnVar.f45245f.getClass();
            Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
            try {
                Result.Companion companion = Result.Companion;
                JSONObject jSONObject = new JSONObject(errorResponse);
                String optString = jSONObject.optString("errorCode", "Internal error");
                String optString2 = jSONObject.optString(CrashHianalyticsData.MESSAGE, "Internal error");
                String optString3 = jSONObject.optString("errorId", "");
                Intrinsics.checkNotNullExpressionValue(optString3, "optString(ERROR_ID_KEY, \"\")");
                Intrinsics.checkNotNullExpressionValue(optString2, "optString(MESSAGE_KEY, INTERNAL_ERROR)");
                m243constructorimpl = Result.m243constructorimpl(new RuStorePaymentException.RuStorePaymentNetworkException(optString, optString3, optString2, null, 8, null));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.d(m243constructorimpl) != null) {
                m243constructorimpl = new RuStorePaymentException.RuStorePaymentNetworkException("Internal error", "", "Internal error", null, 8, null);
            }
            xnVar.a((Throwable) m243constructorimpl);
            return Unit.f41027a;
        }
    }

    public static final class c extends WebViewClient {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Url f44941b;

        public c(Url url) {
            this.f44941b = url;
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            int i4 = rn.f44936d;
            yj yjVar = yj.I3;
            if (yjVar == null) {
                throw new RuStorePaymentException.RuStorePayClientNotCreated("To get an instance of the RuStorePayClient, you must first initialize it", null, 2, null);
            }
            ao aoVar = (ao) yjVar.f45519i1.getValue();
            String value = this.f44941b.getValue();
            aoVar.getClass();
            if (ao.a(webResourceRequest, value)) {
                xn xnVar = (xn) rn.this.f44937a.getValue();
                StringBuilder sb = new StringBuilder("Error description: ");
                sb.append((Object) (webResourceError != null ? webResourceError.getDescription() : null));
                sb.append(". Error code: ");
                sb.append(webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null);
                String errorMessage = sb.toString();
                xnVar.getClass();
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                xnVar.a((Throwable) new RuStorePaymentException.RuStorePaymentCommonException(errorMessage, null, 2, null));
            }
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements Function1<un, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f44943b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Bundle bundle) {
            super(1);
            this.f44943b = bundle;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            un state = (un) obj;
            Intrinsics.checkNotNullParameter(state, "state");
            rn rnVar = rn.this;
            Url url = state.f45111a;
            Bundle bundle = this.f44943b;
            int i4 = rn.f44936d;
            rnVar.a(url, bundle);
            return Unit.f41027a;
        }
    }

    public static final class e extends kotlin.jvm.internal.s implements Function0<Fragment> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return rn.this;
        }
    }

    public static final class f extends kotlin.jvm.internal.s implements Function0<androidx.lifecycle.b0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f44945a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f44945a = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            androidx.lifecycle.b0 viewModelStore = ((androidx.lifecycle.c0) this.f44945a.invoke()).getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "ownerProducer().viewModelStore");
            return viewModelStore;
        }
    }

    public static final class g extends kotlin.jvm.internal.s implements Function0<Y.b> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object obj;
            Bundle requireArguments = rn.this.requireArguments();
            Intrinsics.checkNotNullExpressionValue(requireArguments, "requireArguments()");
            if (Build.VERSION.SDK_INT >= 33) {
                obj = requireArguments.getSerializable("authUrl", Url.class);
            } else {
                Object serializable = requireArguments.getSerializable("authUrl");
                if (!(serializable instanceof Url)) {
                    serializable = null;
                }
                obj = (Url) serializable;
            }
            if (obj != null) {
                return new yn((Url) obj);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public rn() {
        super(R.layout.sdk_pay_web_auth_fragment);
        this.f44937a = E.a(this, H.b(xn.class), new f(new e()), new g());
    }

    public final void a(Url url, Bundle bundle) {
        Bundle bundle2;
        WebView webView;
        WebView webView2 = this.f44938b;
        if (webView2 != null) {
            webView2.setBackgroundColor(requireContext().getColor(r5.a(this, R.attr.sdk_pay_surface_primary, R.color.sdk_pay_surface_primary_light)));
            webView2.addJavascriptInterface(new sn(new a((xn) this.f44937a.getValue()), new b((xn) this.f44937a.getValue())), com.ironsource.b9.f15266d);
            webView2.setWebViewClient(new c(url));
            webView2.getSettings().setJavaScriptEnabled(true);
            webView2.setOnTouchListener(new View.OnTouchListener() { // from class: D3.K
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return rn.a(view, motionEvent);
                }
            });
            webView2.loadUrl(url.getValue());
        }
        if (bundle == null || (bundle2 = bundle.getBundle("webViewState")) == null || (webView = this.f44938b) == null) {
            return;
        }
        webView.restoreState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Disposable disposable = this.f44939c;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        Bundle bundle = new Bundle();
        WebView webView = this.f44938b;
        if (webView != null) {
            webView.saveState(bundle);
        }
        outState.putBundle("webViewState", bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.f44938b = (WebView) view.findViewById(R.id.auth_web_view);
        this.f44939c = ObservableSubscribeKt.subscribe$default(Subject.DefaultImpls.observe$default(((xn) this.f44937a.getValue()).f45247h, null, 1, null), null, null, new d(bundle), 3, null);
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
