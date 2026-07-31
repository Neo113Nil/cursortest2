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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.R;
import ru.rustore.sdk.pay.internal.a;
import ru.rustore.sdk.pay.internal.hf;
import ru.rustore.sdk.pay.internal.lg;
import ru.rustore.sdk.pay.internal.ze;
import ru.rustore.sdk.pay.internal.zi;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.pay.model.Url;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.observable.ObservableSubscribeKt;
import ru.rustore.sdk.reactive.subject.Subject;

@Metadata
/* loaded from: classes3.dex */
public final class lg extends Fragment {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f44566l = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final W1.h f44567a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public Disposable f44568b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public ImageView f44569c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public TextView f44570d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public TextView f44571e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public View f44572f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public WebView f44573g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public LinearLayout f44574h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public TextView f44575i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public ImageView f44576j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public String f44577k;

    public /* synthetic */ class a extends kotlin.jvm.internal.p implements Function1<String, Unit> {
        public a(rg rgVar) {
            super(1, rgVar, rg.class, "proceedPostMessage", "proceedPostMessage(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            String message = (String) obj;
            Intrinsics.checkNotNullParameter(message, "p0");
            rg rgVar = (rg) this.receiver;
            rgVar.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            yh yhVar = (yh) rgVar.f44920a.f45506f3.getValue();
            new wh(yhVar.f45271a, yhVar.f45272b, yhVar.f45273c, yhVar.f45274d, yhVar.f45275e, yhVar.f45276f, yhVar.f45277g, yhVar.f45278h, yhVar.f45279i, yhVar.f45280j, yhVar.f45281k).c(message);
            return Unit.f41027a;
        }
    }

    public static final class b extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WebView f44578a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lg f44579b;

        public b(WebView webView, lg lgVar) {
            this.f44578a = webView;
            this.f44579b = lgVar;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            View view;
            super.onPageFinished(webView, str);
            WebView webView2 = this.f44579b.f44573g;
            if (webView2 == null || webView2.getVisibility() != 0 || (view = this.f44579b.f44572f) == null) {
                return;
            }
            view.setVisibility(8);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.f44578a.loadUrl("javascript: window.parent.addEventListener('message',function(e){Android.postMessage(e.data)});");
            View view = this.f44579b.f44572f;
            if (view == null) {
                return;
            }
            view.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            String str = this.f44579b.f44577k;
            if (str != null) {
                yj yjVar = yj.I3;
                if (yjVar == null) {
                    throw new RuStorePaymentException.RuStorePayClientNotCreated("To get an instance of the RuStorePayClient, you must first initialize it", null, 2, null);
                }
                ((ao) yjVar.f45519i1.getValue()).getClass();
                if (ao.a(webResourceRequest, str)) {
                    rg rgVar = (rg) this.f44579b.f44567a.getValue();
                    StringBuilder sb = new StringBuilder("Error description: ");
                    sb.append((Object) (webResourceError != null ? webResourceError.getDescription() : null));
                    sb.append(". Error code: ");
                    sb.append(webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null);
                    String errorMessage = sb.toString();
                    rgVar.getClass();
                    Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                    yh yhVar = (yh) rgVar.f44920a.f45506f3.getValue();
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
            rg rgVar = (rg) this.f44579b.f44567a.getValue();
            String redirectUrl = url.toString();
            Intrinsics.checkNotNullExpressionValue(redirectUrl, "url.toString()");
            rgVar.getClass();
            Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
            yh yhVar = (yh) rgVar.f44920a.f45506f3.getValue();
            new wh(yhVar.f45271a, yhVar.f45272b, yhVar.f45273c, yhVar.f45274d, yhVar.f45275e, yhVar.f45276f, yhVar.f45277g, yhVar.f45278h, yhVar.f45279i, yhVar.f45280j, yhVar.f45281k).b(redirectUrl);
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements Function1<zi, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f44581b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Bundle bundle) {
            super(1);
            this.f44581b = bundle;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ImageView imageView;
            String string;
            zi state = (zi) obj;
            Intrinsics.checkNotNullParameter(state, "state");
            if (state instanceof zi.a) {
                lg lgVar = lg.this;
                zi.a aVar = (zi.a) state;
                Bundle bundle = this.f44581b;
                int i4 = lg.f44566l;
                e0 e0Var = aVar.f45367b.f44051e;
                ImageView imageView2 = lgVar.f44569c;
                if (imageView2 != null) {
                    q6.a(imageView2, e0Var.f43982a.getValue(), Integer.valueOf(R.drawable.sdk_pay_ic_product_image_placeholder), lgVar.getResources().getDimension(R.dimen.sdk_pay_bottom_sheet_image_product_radius));
                }
                TextView textView = lgVar.f44570d;
                if (textView != null) {
                    textView.setText(e0Var.f43983b.getValue());
                }
                TextView textView2 = lgVar.f44571e;
                if (textView2 != null) {
                    textView2.setText(lgVar.getString(R.string.sdk_pay_application_purchase_subtitle));
                }
                lgVar.a(aVar.f45366a, bundle);
            } else if (state instanceof zi.c) {
                lg lgVar2 = lg.this;
                zi.c cVar = (zi.c) state;
                Bundle bundle2 = this.f44581b;
                int i5 = lg.f44566l;
                ze zeVar = cVar.f45370b.f44822g;
                dn dnVar = cVar.f45371c;
                ImageView imageView3 = lgVar2.f44569c;
                if (imageView3 != null) {
                    q6.a(imageView3, zeVar.getIcon().getValue(), Integer.valueOf(R.drawable.sdk_pay_ic_product_image_placeholder), lgVar2.getResources().getDimension(R.dimen.sdk_pay_bottom_sheet_image_product_radius));
                }
                TextView textView3 = lgVar2.f44570d;
                if (textView3 != null) {
                    textView3.setText(zeVar.getTitle().getValue());
                }
                TextView textView4 = lgVar2.f44571e;
                if (textView4 != null) {
                    if (zeVar instanceof ze.a) {
                        string = lgVar2.getString(R.string.sdk_pay_product_purchase_subtitle);
                    } else {
                        if (!(zeVar instanceof ze.b)) {
                            throw new W1.m();
                        }
                        string = lgVar2.getString(R.string.sdk_pay_subscription_purchase_subtitle);
                    }
                    textView4.setText(string);
                }
                if (dnVar != null) {
                    TextView textView5 = lgVar2.f44575i;
                    if (textView5 != null) {
                        textView5.setText(dnVar.f43979a);
                    }
                    Url url = dnVar.f43980b;
                    if (url != null && (imageView = lgVar2.f44576j) != null) {
                        q6.a(imageView, url.getValue(), Integer.valueOf(R.drawable.sdk_pay_no_user_avatar), 4);
                    }
                    LinearLayout linearLayout = lgVar2.f44574h;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                    }
                } else {
                    LinearLayout linearLayout2 = lgVar2.f44574h;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(8);
                    }
                }
                lgVar2.a(cVar.f45369a, bundle2);
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
            return lg.this;
        }
    }

    public static final class e extends kotlin.jvm.internal.s implements Function0<androidx.lifecycle.b0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f44583a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f44583a = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            androidx.lifecycle.b0 viewModelStore = ((androidx.lifecycle.c0) this.f44583a.invoke()).getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "ownerProducer().viewModelStore");
            return viewModelStore;
        }
    }

    public lg() {
        super(R.layout.sdk_pay_purchase_with_saved_card_fragment);
        this.f44567a = E.a(this, H.b(rg.class), new e(new d()), null);
    }

    public final void a(Url url, Bundle bundle) {
        if (url == null) {
            View view = this.f44572f;
            if (view != null) {
                view.setVisibility(0);
            }
            WebView webView = this.f44573g;
            if (webView == null) {
                return;
            }
            webView.setVisibility(8);
            return;
        }
        this.f44577k = url.getValue();
        View view2 = this.f44572f;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        a(bundle);
        WebView webView2 = this.f44573g;
        if (webView2 != null) {
            webView2.setVisibility(0);
        }
        WebView webView3 = this.f44573g;
        if (webView3 != null) {
            webView3.loadUrl(url.getValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Disposable disposable = this.f44568b;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        Bundle bundle = new Bundle();
        WebView webView = this.f44573g;
        if (webView != null) {
            webView.saveState(bundle);
        }
        outState.putBundle("webViewState", bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.f44569c = (ImageView) view.findViewById(R.id.product_image);
        this.f44570d = (TextView) view.findViewById(R.id.product_title);
        this.f44571e = (TextView) view.findViewById(R.id.product_subtitle);
        this.f44573g = (WebView) view.findViewById(R.id.payment_web_view);
        this.f44572f = view.findViewById(R.id.progress_content);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.user_info);
        this.f44574h = linearLayout;
        this.f44575i = linearLayout != null ? (TextView) linearLayout.findViewById(R.id.user_name) : null;
        LinearLayout linearLayout2 = this.f44574h;
        this.f44576j = linearLayout2 != null ? (ImageView) linearLayout2.findViewById(R.id.user_avatar) : null;
        this.f44568b = ObservableSubscribeKt.subscribe$default(Subject.DefaultImpls.observe$default(((rg) this.f44567a.getValue()).f44923d, null, 1, null), null, null, new c(bundle), 3, null);
        String value = requireArguments().getString("cardBindingKey");
        rg rgVar = (rg) this.f44567a.getValue();
        rgVar.getClass();
        if (value == null || StringsKt.z(value)) {
            rgVar.a((RuStorePaymentException) new RuStorePaymentException.InvalidCardBindingIdException());
            return;
        }
        Intrinsics.checkNotNullParameter(value, "value");
        ru.rustore.sdk.pay.internal.a aVar = ((t5) rgVar.f44920a.f45435P1.getValue()).f45034a.f43892a.f43838a;
        if (aVar instanceof a.C0255a) {
            f0 f0Var = ((f6) rgVar.f44920a.f45439Q1.getValue()).f44056a.f44715b.f44719a;
            if (f0Var == null) {
                return;
            }
            rgVar.a(f0Var.f44047a, value, new hf.a.c(f0Var), f0Var.f44048b);
            return;
        }
        if (!(aVar instanceof a.b)) {
            if (aVar == null) {
                rgVar.a((RuStorePaymentException) new RuStorePaymentException.RuStorePayInvalidActivePurchase(null, null, 3, null));
            }
        } else {
            qb qbVar = ((y5) rgVar.f44920a.f45520i2.getValue()).f45261a.f43860b.f44876a;
            if (qbVar == null) {
                return;
            }
            rgVar.a(qbVar.f44818c, value, new hf.b.c(qbVar), qbVar.f44819d);
        }
    }

    public final void a(Bundle bundle) {
        Bundle bundle2;
        WebView webView;
        WebView webView2 = this.f44573g;
        if (webView2 != null) {
            webView2.addJavascriptInterface(new ab(new a((rg) this.f44567a.getValue())), com.ironsource.b9.f15266d);
            webView2.setWebViewClient(new b(webView2, this));
            webView2.getSettings().setJavaScriptEnabled(true);
            webView2.setOnTouchListener(new View.OnTouchListener() { // from class: D3.E
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return lg.a(view, motionEvent);
                }
            });
        }
        if (bundle == null || (bundle2 = bundle.getBundle("webViewState")) == null || (webView = this.f44573g) == null) {
            return;
        }
        webView.restoreState(bundle2);
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
