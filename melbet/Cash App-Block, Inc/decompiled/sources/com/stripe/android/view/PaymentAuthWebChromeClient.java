package com.stripe.android.view;

import android.content.DialogInterface;
import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.appcompat.app.AlertDialog;
import com.squareup.cash.R;
import com.squareup.cash.blockers.views.PlaidLinkView;
import com.squareup.cash.profile.views.RingtoneView$playRingtone$1;
import com.squareup.cash.work.webview.views.WorkWebViewClient;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class PaymentAuthWebChromeClient extends WebChromeClient {
    public final /* synthetic */ int $r8$classId = 0;
    public final Object activity;
    public final Object logger;

    public PaymentAuthWebChromeClient(PaymentAuthWebViewActivity paymentAuthWebViewActivity, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1) {
        logger$Companion$NOOP_LOGGER$1.getClass();
        this.activity = paymentAuthWebViewActivity;
        this.logger = logger$Companion$NOOP_LOGGER$1;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message;
        switch (this.$r8$classId) {
            case 0:
                if (consoleMessage != null && (message = consoleMessage.message()) != null) {
                    ((Logger$Companion$NOOP_LOGGER$1) this.logger).debug(message);
                }
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        switch (this.$r8$classId) {
            case 1:
                if ((webView != null ? webView.getContext() : null) == null || message == null) {
                    return false;
                }
                WebView webView2 = new WebView(webView.getContext());
                webView2.setWebViewClient(new WorkWebViewClient(this, 1));
                Object obj = message.obj;
                obj.getClass();
                ((WebView.WebViewTransport) obj).setWebView(webView2);
                try {
                    message.sendToTarget();
                    return true;
                } catch (NullPointerException e) {
                    Timber.Forest.e("resultMsg target has not been set.", new Object[0], e);
                    return false;
                }
            default:
                return super.onCreateWindow(webView, z, z2, message);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
        switch (this.$r8$classId) {
            case 0:
                AlertDialog.Builder builder = new AlertDialog.Builder((PaymentAuthWebViewActivity) this.activity, R.style.StripeAlertDialogStyle);
                builder.P.mMessage = str2;
                final int i = 0;
                AlertDialog.Builder positiveButton = builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.PaymentAuthWebChromeClient$$ExternalSyntheticLambda0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        int i3 = i;
                        JsResult jsResult2 = jsResult;
                        switch (i3) {
                            case 0:
                                if (jsResult2 != null) {
                                    jsResult2.confirm();
                                    break;
                                }
                                break;
                            default:
                                if (jsResult2 != null) {
                                    jsResult2.cancel();
                                    break;
                                }
                                break;
                        }
                    }
                });
                final int i2 = 1;
                positiveButton.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.PaymentAuthWebChromeClient$$ExternalSyntheticLambda0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i22) {
                        int i3 = i2;
                        JsResult jsResult2 = jsResult;
                        switch (i3) {
                            case 0:
                                if (jsResult2 != null) {
                                    jsResult2.confirm();
                                    break;
                                }
                                break;
                            default:
                                if (jsResult2 != null) {
                                    jsResult2.cancel();
                                    break;
                                }
                                break;
                        }
                    }
                }).create().show();
                return true;
            default:
                return super.onJsConfirm(webView, str, str2, jsResult);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        switch (this.$r8$classId) {
            case 1:
                super.onProgressChanged(webView, i);
                JobKt.launch$default((CoroutineScope) this.logger, null, null, new RingtoneView$playRingtone$1(this, i, (Continuation) null, 7), 3);
                break;
            default:
                super.onProgressChanged(webView, i);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        switch (this.$r8$classId) {
            case 1:
                webView.getClass();
                str.getClass();
                super.onReceivedTitle(webView, str);
                JobKt.launch$default((CoroutineScope) this.logger, null, null, new PlaidLinkView.AnonymousClass2(this, str, (Continuation) null, 10), 3);
                break;
            default:
                super.onReceivedTitle(webView, str);
                break;
        }
    }

    public PaymentAuthWebChromeClient(CoroutineScope coroutineScope, BufferedChannel bufferedChannel) {
        this.activity = bufferedChannel;
        this.logger = coroutineScope;
    }
}
