package androidx.webkit.internal;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import androidx.webkit.WebViewCompat;

@RequiresApi
/* loaded from: classes5.dex */
public class ApiHelperForM {

    /* renamed from: androidx.webkit.internal.ApiHelperForM$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass1 extends WebMessagePort.WebMessageCallback {
        final /* synthetic */ WebMessagePortCompat.WebMessageCallbackCompat val$callback;

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.val$callback.onMessage(new WebMessagePortImpl(webMessagePort), WebMessagePortImpl.frameworkMessageToCompat(webMessage));
        }
    }

    /* renamed from: androidx.webkit.internal.ApiHelperForM$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass2 extends WebMessagePort.WebMessageCallback {
        final /* synthetic */ WebMessagePortCompat.WebMessageCallbackCompat val$callback;

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.val$callback.onMessage(new WebMessagePortImpl(webMessagePort), WebMessagePortImpl.frameworkMessageToCompat(webMessage));
        }
    }

    public static WebMessageCompat createWebMessageCompat(WebMessage webMessage) {
        return new WebMessageCompat(webMessage.getData(), WebMessagePortImpl.portsToCompat(webMessage.getPorts()));
    }

    public static int getErrorCode(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    public static CharSequence getDescription(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    /* renamed from: androidx.webkit.internal.ApiHelperForM$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass3 extends WebView.VisualStateCallback {
        final /* synthetic */ WebViewCompat.VisualStateCallback val$callback;

        @Override // android.webkit.WebView.VisualStateCallback
        public void onComplete(long j) {
            this.val$callback.onComplete(j);
        }
    }
}
