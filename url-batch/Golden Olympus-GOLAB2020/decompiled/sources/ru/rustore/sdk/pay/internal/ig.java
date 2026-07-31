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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.R;
import ru.rustore.sdk.pay.internal.ai;
import ru.rustore.sdk.pay.internal.ig;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.observable.ObservableSubscribeKt;
import ru.rustore.sdk.reactive.subject.Subject;

@Metadata
/* loaded from: classes3.dex */
public final class ig extends Fragment {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f44332e = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final W1.h f44333a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public Disposable f44334b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public WebView f44335c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public View f44336d;

    public /* synthetic */ class a extends kotlin.jvm.internal.p implements Function1<String, Unit> {
        public a(kg kgVar) {
            super(1, kgVar, kg.class, "proceedPostMessage", "proceedPostMessage(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            String message = (String) obj;
            Intrinsics.checkNotNullParameter(message, "p0");
            kg kgVar = (kg) this.receiver;
            kgVar.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            yh yhVar = (yh) kgVar.f44480a.f45506f3.getValue();
            new wh(yhVar.f45271a, yhVar.f45272b, yhVar.f45273c, yhVar.f45274d, yhVar.f45275e, yhVar.f45276f, yhVar.f45277g, yhVar.f45278h, yhVar.f45279i, yhVar.f45280j, yhVar.f45281k).c(message);
            return Unit.f41027a;
        }
    }

    public static final class b extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WebView f44337a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ig f44338b;

        public b(WebView webView, ig igVar) {
            this.f44337a = webView;
            this.f44338b = igVar;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            View view;
            super.onPageFinished(webView, str);
            WebView webView2 = this.f44338b.f44335c;
            if (webView2 == null || webView2.getVisibility() != 0 || (view = this.f44338b.f44336d) == null) {
                return;
            }
            view.setVisibility(8);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.f44337a.loadUrl("javascript: window.parent.addEventListener('message',function(e){Android.postMessage(e.data)});");
            View view = this.f44338b.f44336d;
            if (view == null) {
                return;
            }
            view.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            String string = this.f44338b.requireArguments().getString("paymentUrl");
            if (string != null) {
                yj yjVar = yj.I3;
                if (yjVar == null) {
                    throw new RuStorePaymentException.RuStorePayClientNotCreated("To get an instance of the RuStorePayClient, you must first initialize it", null, 2, null);
                }
                ((ao) yjVar.f45519i1.getValue()).getClass();
                if (ao.a(webResourceRequest, string)) {
                    kg kgVar = (kg) this.f44338b.f44333a.getValue();
                    StringBuilder sb = new StringBuilder("Error description: ");
                    sb.append((Object) (webResourceError != null ? webResourceError.getDescription() : null));
                    sb.append(". Error code: ");
                    sb.append(webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null);
                    String errorMessage = sb.toString();
                    kgVar.getClass();
                    Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                    yh yhVar = (yh) kgVar.f44480a.f45506f3.getValue();
                    wh whVar = new wh(yhVar.f45271a, yhVar.f45272b, yhVar.f45273c, yhVar.f45274d, yhVar.f45275e, yhVar.f45276f, yhVar.f45277g, yhVar.f45278h, yhVar.f45279i, yhVar.f45280j, yhVar.f45281k);
                    Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                    whVar.a(errorMessage);
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
            if (url == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            kg kgVar = (kg) this.f44338b.f44333a.getValue();
            String redirectUrl = url.toString();
            Intrinsics.checkNotNullExpressionValue(redirectUrl, "url.toString()");
            kgVar.getClass();
            Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
            yh yhVar = (yh) kgVar.f44480a.f45506f3.getValue();
            new wh(yhVar.f45271a, yhVar.f45272b, yhVar.f45273c, yhVar.f45274d, yhVar.f45275e, yhVar.f45276f, yhVar.f45277g, yhVar.f45278h, yhVar.f45279i, yhVar.f45280j, yhVar.f45281k).b(redirectUrl);
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements Function1<ai, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f44340b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Bundle bundle) {
            super(1);
            this.f44340b = bundle;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ai state = (ai) obj;
            Intrinsics.checkNotNullParameter(state, "state");
            if (Intrinsics.areEqual(state, ai.a.f43821a)) {
                View view = ig.this.f44336d;
                if (view != null) {
                    view.setVisibility(8);
                }
                WebView webView = ig.this.f44335c;
                if (webView != null) {
                    webView.setVisibility(0);
                }
                ig.this.a(this.f44340b);
            } else if (Intrinsics.areEqual(state, ai.b.f43822a)) {
                WebView webView2 = ig.this.f44335c;
                if (webView2 != null) {
                    webView2.setVisibility(8);
                }
                View view2 = ig.this.f44336d;
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
            return ig.this;
        }
    }

    public static final class e extends kotlin.jvm.internal.s implements Function0<androidx.lifecycle.b0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f44342a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f44342a = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            androidx.lifecycle.b0 viewModelStore = ((androidx.lifecycle.c0) this.f44342a.invoke()).getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "ownerProducer().viewModelStore");
            return viewModelStore;
        }
    }

    public ig() {
        super(R.layout.sdk_pay_purchase_with_new_card_fragment);
        this.f44333a = E.a(this, H.b(kg.class), new e(new d()), null);
    }

    public final void a(Bundle bundle) {
        Bundle bundle2;
        WebView webView;
        WebView webView2 = this.f44335c;
        if (webView2 != null) {
            webView2.setBackgroundColor(requireContext().getColor(r5.a(this, R.attr.sdk_pay_surface_primary, R.color.sdk_pay_surface_primary_light)));
            webView2.addJavascriptInterface(new ab(new a((kg) this.f44333a.getValue())), com.ironsource.b9.f15266d);
            webView2.setWebViewClient(new b(webView2, this));
            webView2.getSettings().setJavaScriptEnabled(true);
            webView2.setOnTouchListener(new View.OnTouchListener() { // from class: D3.z
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return ig.a(view, motionEvent);
                }
            });
            String string = requireArguments().getString("paymentUrl");
            if (string == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            webView2.loadUrl(string);
        }
        if (bundle == null || (bundle2 = bundle.getBundle("webViewState")) == null || (webView = this.f44335c) == null) {
            return;
        }
        webView.restoreState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Disposable disposable = this.f44334b;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        Bundle bundle = new Bundle();
        WebView webView = this.f44335c;
        if (webView != null) {
            webView.saveState(bundle);
        }
        outState.putBundle("webViewState", bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.f44335c = (WebView) view.findViewById(R.id.payment_web_view);
        this.f44336d = view.findViewById(R.id.progress_indicator);
        this.f44334b = ObservableSubscribeKt.subscribe$default(Subject.DefaultImpls.observe$default(((kg) this.f44333a.getValue()).f44481b, null, 1, null), null, null, new c(bundle), 3, null);
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
