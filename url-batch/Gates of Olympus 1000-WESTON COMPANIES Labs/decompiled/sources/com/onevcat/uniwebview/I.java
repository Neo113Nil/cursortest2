package com.onevcat.uniwebview;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Message;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.core.os.EnvironmentCompat;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class I extends WebChromeClient {
    public final Activity a;
    public final C0093w b;
    public final ViewGroup c;
    public final ViewGroup d;
    public final boolean e;
    public boolean f;
    public FrameLayout g;
    public final LinkedHashSet h;
    public C0093w i;
    public boolean j;

    public I(Activity activity, C0093w webView, ViewGroup containerView, ViewGroup videoView, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        this.a = activity;
        this.b = webView;
        this.c = containerView;
        this.d = videoView;
        this.e = z;
        this.h = new LinkedHashSet();
    }

    public static final void a(JsResult jsResult, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (jsResult != null) {
            jsResult.confirm();
        }
    }

    public static final void b(JsResult jsResult, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (jsResult != null) {
            jsResult.confirm();
        }
    }

    public static final void c(JsResult jsResult, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (jsResult != null) {
            jsResult.cancel();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        super.onCloseWindow(webView);
        ViewParent parent = webView != null ? webView.getParent() : null;
        C0093w c0093w = parent instanceof C0093w ? (C0093w) parent : null;
        if (c0093w == null) {
            return;
        }
        C0060l c0060l = C0060l.b;
        c0060l.getClass();
        Intrinsics.checkNotNullParameter("onCloseWindow...", "message");
        EnumC0057k enumC0057k = EnumC0057k.VERBOSE;
        c0060l.a(enumC0057k, "onCloseWindow...");
        String message = "Get a parent view: " + c0093w;
        Intrinsics.checkNotNullParameter(message, "message");
        c0060l.a(enumC0057k, message);
        c0093w.removeView(webView);
        C0093w c0093w2 = c0093w.get_webChromeClient$uniwebview_release().i;
        if (c0093w2 != null) {
            c0093w.getMessageSender().a(c0093w.getName(), d2.MultipleWindowClosed, c0093w2.getName());
            c0093w.get_webChromeClient$uniwebview_release().i = null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        EnumC0057k enumC0057k;
        StringBuilder sb;
        EnumC0057k enumC0057k2;
        String str;
        String str2;
        if (!this.e) {
            return super.onConsoleMessage(consoleMessage);
        }
        if (consoleMessage == null) {
            return super.onConsoleMessage(null);
        }
        C0060l c0060l = C0060l.b;
        String str3 = consoleMessage.message() + ", source: " + consoleMessage.sourceId() + " line: " + consoleMessage.lineNumber();
        ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
        int i = messageLevel == null ? -1 : F.a[messageLevel.ordinal()];
        if (i == -1) {
            return super.onConsoleMessage(consoleMessage);
        }
        if (i != 1) {
            if (i == 2) {
                enumC0057k2 = EnumC0057k.INFO;
                str = "log: " + str3;
                c0060l.getClass();
                str2 = "🟢";
            } else if (i == 3) {
                enumC0057k2 = EnumC0057k.WARNING;
                str = "warning: " + str3;
                c0060l.getClass();
                str2 = "🟡";
            } else {
                if (i != 4) {
                    if (i == 5) {
                        enumC0057k = EnumC0057k.VERBOSE;
                        sb = new StringBuilder("tip: ");
                    }
                    return true;
                }
                enumC0057k2 = EnumC0057k.CRITICAL;
                str = "error: " + str3;
                c0060l.getClass();
                str2 = "🔴";
            }
            C0060l.a(enumC0057k2, str2, str);
            return true;
        }
        enumC0057k = EnumC0057k.DEBUG;
        sb = new StringBuilder("debug: ");
        String sb2 = sb.append(str3).toString();
        c0060l.getClass();
        C0060l.a(enumC0057k, "🔵", sb2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        C0060l c0060l = C0060l.b;
        c0060l.getClass();
        Intrinsics.checkNotNullParameter("onCreateWindow...", "message");
        EnumC0057k enumC0057k = EnumC0057k.VERBOSE;
        c0060l.a(enumC0057k, "onCreateWindow...");
        WebView.HitTestResult hitTestResult = webView != null ? webView.getHitTestResult() : null;
        String extra = hitTestResult != null ? hitTestResult.getExtra() : null;
        String message2 = "Checking hitting result, url: " + extra;
        Intrinsics.checkNotNullParameter(message2, "message");
        c0060l.a(enumC0057k, message2);
        if (this.b.get_webClient$uniwebview_release().h.a(extra, false)) {
            return false;
        }
        if (!this.b.getSettings().supportMultipleWindows() || (!z2 && !this.j)) {
            return super.onCreateWindow(webView, z, z2, message);
        }
        Activity activity = this.a;
        ViewGroup viewGroup = this.c;
        ViewGroup viewGroup2 = this.d;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        C0093w c0093w = new C0093w(activity, viewGroup, viewGroup2, uuid, new H(), new G());
        c0093w.getSettings().setUserAgentString(this.b.getSettings().getUserAgentString());
        c0093w.getSettings().setSupportMultipleWindows(true);
        c0093w.get_webChromeClient$uniwebview_release().j = this.j;
        c0093w.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (webView != null) {
            webView.addView(c0093w);
        }
        Object obj = message != null ? message.obj : null;
        if (obj instanceof WebView.WebViewTransport) {
            ((WebView.WebViewTransport) obj).setWebView(c0093w);
        }
        if (message != null) {
            message.sendToTarget();
        }
        this.i = c0093w;
        this.b.getMessageSender().a(this.b.getName(), d2.MultipleWindowOpened, c0093w.getName());
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (callback != null) {
            callback.invoke(str, true, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        if (this.f) {
            this.d.setVisibility(4);
            this.d.removeView(this.g);
            this.c.setVisibility(0);
            this.f = false;
            this.g = null;
            this.b.clearFocus();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
        new AlertDialog.Builder(this.a).setTitle(str).setMessage(str2).setCancelable(false).setIcon(android.R.drawable.ic_dialog_alert).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.I$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                I.a(jsResult, dialogInterface, i);
            }
        }).create().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
        new AlertDialog.Builder(this.a).setTitle(str).setMessage(str2).setIcon(android.R.drawable.ic_dialog_info).setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.I$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                I.b(jsResult, dialogInterface, i);
            }
        }).setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.I$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                I.c(jsResult, dialogInterface, i);
            }
        }).create().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
        final EditText editText = new EditText(this.a);
        editText.setSingleLine();
        if (str3 == null) {
            str3 = "";
        }
        editText.setText(str3);
        AlertDialog.Builder cancelable = new AlertDialog.Builder(this.a).setTitle(str).setMessage(str2).setIcon(android.R.drawable.ic_dialog_info).setCancelable(false);
        Intrinsics.checkNotNullExpressionValue(cancelable, "Builder(activity)\n      …    .setCancelable(false)");
        AbstractC0027a.a(cancelable, editText).setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.I$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                I.a(editText, jsPromptResult, dialogInterface, i);
            }
        }).setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.I$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                I.a(jsPromptResult, dialogInterface, i);
            }
        }).create().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        C0060l c0060l = C0060l.b;
        String message = "UniWebViewChromeClient onPermissionRequest. URL: " + (permissionRequest != null ? permissionRequest.getOrigin() : null);
        c0060l.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        EnumC0057k enumC0057k = EnumC0057k.INFO;
        c0060l.a(enumC0057k, message);
        if (permissionRequest == null) {
            return;
        }
        B b = new B(this.b.getName(), permissionRequest);
        UniWebViewInterface.Companion.getClass();
        E a = U1.a(b);
        String message2 = "Getting result from 'RequestMediaCapturePermission' channel method: " + a;
        Intrinsics.checkNotNullParameter(message2, "message");
        c0060l.a(enumC0057k, message2);
        if (a != null) {
            String string = a.b.getString("result");
            Intrinsics.checkNotNullExpressionValue(string, "json.getString(RESULT_KEY)");
            if (Intrinsics.areEqual(string, "grant")) {
                permissionRequest.grant(permissionRequest.getResources());
                return;
            } else if (Intrinsics.areEqual(string, "deny")) {
                permissionRequest.deny();
                return;
            } else {
                a(permissionRequest);
                return;
            }
        }
        if (this.h.isEmpty()) {
            a(permissionRequest);
            return;
        }
        String message3 = "No RequestMediaCapturePermission channel method but valid permissionTrustDomains. Compatible onPermissionRequest. URL: " + permissionRequest.getOrigin();
        Intrinsics.checkNotNullParameter(message3, "message");
        c0060l.a(enumC0057k, message3);
        try {
            String host = permissionRequest.getOrigin().getHost();
            if (host != null && this.h.contains(host)) {
                String message4 = "Permission domain '" + host + "' is contained in allow list. Granting...";
                Intrinsics.checkNotNullParameter(message4, "message");
                c0060l.a(enumC0057k, message4);
                permissionRequest.grant(permissionRequest.getResources());
                return;
            }
            String message5 = "Permission domain '" + host + "' is not contained in allow list. Deny this request.";
            Intrinsics.checkNotNullParameter(message5, "message");
            EnumC0057k enumC0057k2 = EnumC0057k.CRITICAL;
            c0060l.a(enumC0057k2, message5);
            Intrinsics.checkNotNullParameter("If you want to allow permission access from this domain, add it through `UniWebView.AddPermissionTrustDomain` first.", "message");
            c0060l.a(enumC0057k2, "If you want to allow permission access from this domain, add it through `UniWebView.AddPermissionTrustDomain` first.");
            permissionRequest.deny();
        } catch (Exception e) {
            C0060l c0060l2 = C0060l.b;
            String message6 = "onPermissionRequest failed due to exception: " + e.getMessage();
            c0060l2.getClass();
            Intrinsics.checkNotNullParameter(message6, "message");
            c0060l2.a(EnumC0057k.CRITICAL, message6);
            permissionRequest.deny();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        this.b.getMessageSender().a(this.b.getName(), d2.PageProgressChanged, String.valueOf(i / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (view instanceof FrameLayout) {
            this.f = true;
            FrameLayout frameLayout = (FrameLayout) view;
            this.g = frameLayout;
            this.c.setVisibility(4);
            this.d.setVisibility(0);
            this.d.addView(this.g, new ViewGroup.LayoutParams(-1, -1));
            if (this.b.getSettings().getJavaScriptEnabled() && (frameLayout.getFocusedChild() instanceof SurfaceView)) {
                this.b.loadUrl("javascript:\n                    var _ytrp_html5_video_last;\n                    var _ytrp_html5_video = document.getElementsByTagName('video')[0];\n                    if (_ytrp_html5_video != undefined && _ytrp_html5_video != _ytrp_html5_video_last) {\n                      _ytrp_html5_video_last = _ytrp_html5_video;\n                      function _ytrp_html5_video_ended() {\n                        window.location.href = 'uniwebviewinternal://__uniwebview_internal_video_end';\n                      }\n                      window.location.href = 'uniwebviewinternal://__uniwebview_internal_video_end';\n                    }");
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        T handler = new T(valueCallback, fileChooserParams);
        Activity context = this.a;
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC0101y.a.getClass();
        Intrinsics.checkNotNullParameter(handler, "handler");
        String handlerId = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(handlerId, "randomUUID().toString()");
        C0098x.b.put(handlerId, handler);
        handler.g = handlerId;
        handler.h = context;
        W1 w1 = UniWebViewProxyActivity.Companion;
        if (handlerId == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handlerId");
            handlerId = null;
        }
        w1.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handlerId, "handlerId");
        Intent intent = new Intent(context, (Class<?>) UniWebViewProxyActivity.class);
        intent.putExtra(UniWebViewProxyActivity.HANDLER_ID, handlerId);
        context.startActivity(intent);
        return true;
    }

    public static final void a(EditText input, JsPromptResult jsPromptResult, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(input, "$input");
        String obj = input.getText().toString();
        dialogInterface.dismiss();
        if (jsPromptResult != null) {
            jsPromptResult.confirm(obj);
        }
    }

    public static final void a(JsPromptResult jsPromptResult, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (jsPromptResult != null) {
            jsPromptResult.cancel();
        }
    }

    public final void a(final PermissionRequest permissionRequest) {
        String str;
        Resources resources;
        int i;
        C0060l c0060l = C0060l.b;
        C0060l c0060l2 = C0060l.b;
        String message = "Prepare capture permission prompt. URL: " + permissionRequest.getOrigin() + "; resources: " + permissionRequest.getResources();
        c0060l2.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0060l2.a(EnumC0057k.INFO, message);
        final String[] resources2 = permissionRequest.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "resources");
        ArrayList arrayList = new ArrayList(resources2.length);
        int length = resources2.length;
        int i2 = 0;
        while (true) {
            str = EnvironmentCompat.MEDIA_UNKNOWN;
            if (i2 >= length) {
                break;
            }
            String str2 = resources2[i2];
            if (str2 != null) {
                int hashCode = str2.hashCode();
                if (hashCode != -1660821873) {
                    if (hashCode != 968612586) {
                        if (hashCode != 1069496794) {
                            if (hashCode == 1233677653 && str2.equals("android.webkit.resource.MIDI_SYSEX")) {
                                str = "MIDI sysex";
                            }
                        } else if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                            str = "protected media ID";
                        }
                    } else if (str2.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                        resources = this.a.getResources();
                        i = R.string.MICROPHONE;
                        str = resources.getString(i);
                    }
                } else if (str2.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    resources = this.a.getResources();
                    i = R.string.CAMERA;
                    str = resources.getString(i);
                }
            }
            arrayList.add(str);
            i2++;
        }
        String joinToString$default = CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
        String host = permissionRequest.getOrigin().getHost();
        if (host != null) {
            str = host;
        }
        String string = this.a.getResources().getString(R.string.MEDIA_CAPTURE_PERMISSION_REQUEST, str, joinToString$default);
        Intrinsics.checkNotNullExpressionValue(string, "activity.resources.getSt…QUEST, host, permissions)");
        new AlertDialog.Builder(this.a).setTitle(this.a.getResources().getString(R.string.MEDIA_CAPTURE_PERMISSION_REQUEST_TITLE)).setMessage(string).setCancelable(false).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.I$$ExternalSyntheticLambda5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                I.a(permissionRequest, resources2, dialogInterface, i3);
            }
        }).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.I$$ExternalSyntheticLambda6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                I.a(permissionRequest, dialogInterface, i3);
            }
        }).create().show();
    }

    public static final void a(PermissionRequest request, String[] strArr, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(request, "$request");
        dialogInterface.dismiss();
        request.grant(strArr);
    }

    public static final void a(PermissionRequest request, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(request, "$request");
        dialogInterface.dismiss();
        request.deny();
    }
}
