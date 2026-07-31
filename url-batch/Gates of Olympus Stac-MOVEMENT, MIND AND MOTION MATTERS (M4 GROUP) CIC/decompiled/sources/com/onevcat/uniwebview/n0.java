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
import com.imaginationoverflow.unity.referrer.BuildConfig;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n0 extends WebChromeClient {
    public final Activity a;
    public final b0 b;
    public final ViewGroup c;
    public final ViewGroup d;
    public final boolean e;
    public boolean f;
    public View g;
    public final LinkedHashSet h;
    public b0 i;
    public boolean j;

    public n0(Activity activity, b0 webView, ViewGroup containerView, ViewGroup videoView, boolean z) {
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
        b0 b0Var = parent instanceof b0 ? (b0) parent : null;
        if (b0Var == null) {
            return;
        }
        o oVar = o.b;
        o oVar2 = o.b;
        oVar2.getClass();
        Intrinsics.checkNotNullParameter("onCloseWindow...", "message");
        n nVar = n.VERBOSE;
        oVar2.a(nVar, "onCloseWindow...");
        String message = "Get a parent view: " + b0Var;
        oVar2.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar2.a(nVar, message);
        b0Var.removeView(webView);
        b0 b0Var2 = b0Var.get_webChromeClient$uniwebview_release().i;
        if (b0Var2 != null) {
            b0Var.getMessageSender().a(b0Var.getName(), h5.MultipleWindowClosed, b0Var2.getName());
            b0Var.get_webChromeClient$uniwebview_release().i = null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        n nVar;
        StringBuilder sb;
        n nVar2;
        String str;
        String str2;
        if (!this.e) {
            return super.onConsoleMessage(consoleMessage);
        }
        if (consoleMessage == null) {
            return super.onConsoleMessage(null);
        }
        o oVar = o.b;
        String str3 = consoleMessage.message() + ", source: " + consoleMessage.sourceId() + " line: " + consoleMessage.lineNumber();
        ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
        int i = messageLevel == null ? -1 : k0.a[messageLevel.ordinal()];
        if (i == -1) {
            return super.onConsoleMessage(consoleMessage);
        }
        if (i != 1) {
            if (i == 2) {
                nVar2 = n.INFO;
                str = "log: " + str3;
                oVar.getClass();
                str2 = "🟢";
            } else if (i == 3) {
                nVar2 = n.WARNING;
                str = "warning: " + str3;
                oVar.getClass();
                str2 = "🟡";
            } else {
                if (i != 4) {
                    if (i == 5) {
                        nVar = n.VERBOSE;
                        sb = new StringBuilder("tip: ");
                    }
                    return true;
                }
                nVar2 = n.CRITICAL;
                str = "error: " + str3;
                oVar.getClass();
                str2 = "🔴";
            }
            o.a(nVar2, str2, str);
            return true;
        }
        nVar = n.DEBUG;
        sb = new StringBuilder("debug: ");
        String sb2 = sb.append(str3).toString();
        oVar.getClass();
        o.a(nVar, "🔵", sb2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        o oVar = o.b;
        o oVar2 = o.b;
        oVar2.getClass();
        Intrinsics.checkNotNullParameter("onCreateWindow...", "message");
        n nVar = n.VERBOSE;
        oVar2.a(nVar, "onCreateWindow...");
        WebView.HitTestResult hitTestResult = webView != null ? webView.getHitTestResult() : null;
        String extra = hitTestResult != null ? hitTestResult.getExtra() : null;
        String message2 = "Checking hitting result, url: " + extra;
        oVar2.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        oVar2.a(nVar, message2);
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
        b0 b0Var = new b0(activity, viewGroup, viewGroup2, uuid, new m0(), new l0());
        b0Var.getSettings().setUserAgentString(this.b.getSettings().getUserAgentString());
        b0Var.getSettings().setSupportMultipleWindows(true);
        b0Var.get_webChromeClient$uniwebview_release().j = this.j;
        b0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (webView != null) {
            webView.addView(b0Var);
        }
        Object obj = message != null ? message.obj : null;
        if (obj instanceof WebView.WebViewTransport) {
            ((WebView.WebViewTransport) obj).setWebView(b0Var);
        }
        if (message != null) {
            message.sendToTarget();
        }
        this.i = b0Var;
        this.b.getMessageSender().a(this.b.getName(), h5.MultipleWindowOpened, b0Var.getName());
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
        new AlertDialog.Builder(this.a).setTitle(str).setMessage(str2).setCancelable(false).setIcon(android.R.drawable.ic_dialog_alert).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.n0$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                n0.a(jsResult, dialogInterface, i);
            }
        }).create().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
        new AlertDialog.Builder(this.a).setTitle(str).setMessage(str2).setIcon(android.R.drawable.ic_dialog_info).setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.n0$$ExternalSyntheticLambda5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                n0.b(jsResult, dialogInterface, i);
            }
        }).setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.n0$$ExternalSyntheticLambda6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                n0.c(jsResult, dialogInterface, i);
            }
        }).create().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
        final EditText editText = new EditText(this.a);
        editText.setSingleLine();
        if (str3 == null) {
            str3 = BuildConfig.FLAVOR;
        }
        editText.setText(str3);
        AlertDialog.Builder cancelable = new AlertDialog.Builder(this.a).setTitle(str).setMessage(str2).setIcon(android.R.drawable.ic_dialog_info).setCancelable(false);
        Intrinsics.checkNotNullExpressionValue(cancelable, "Builder(activity)\n      …    .setCancelable(false)");
        a.a(cancelable, editText).setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.n0$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                n0.a(editText, jsPromptResult, dialogInterface, i);
            }
        }).setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.n0$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                n0.a(jsPromptResult, dialogInterface, i);
            }
        }).create().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        o oVar = o.b;
        String message = "UniWebViewChromeClient onPermissionRequest. URL: " + (permissionRequest != null ? permissionRequest.getOrigin() : null);
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        n nVar = n.INFO;
        oVar.a(nVar, message);
        if (permissionRequest == null) {
            return;
        }
        g0 g0Var = new g0(this.b.getName(), permissionRequest);
        UniWebViewInterface.Companion.getClass();
        j0 a = y4.a(g0Var);
        String message2 = "Getting result from 'RequestMediaCapturePermission' channel method: " + a;
        Intrinsics.checkNotNullParameter(message2, "message");
        oVar.a(nVar, message2);
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
        oVar.a(nVar, message3);
        try {
            String host = permissionRequest.getOrigin().getHost();
            if (host == null || !this.h.contains(host)) {
                String message4 = "Permission domain '" + host + "' is not contained in allow list. Deny this request.";
                Intrinsics.checkNotNullParameter(message4, "message");
                n nVar2 = n.CRITICAL;
                oVar.a(nVar2, message4);
                Intrinsics.checkNotNullParameter("If you want to allow permission access from this domain, add it through `UniWebView.AddPermissionTrustDomain` first.", "message");
                oVar.a(nVar2, "If you want to allow permission access from this domain, add it through `UniWebView.AddPermissionTrustDomain` first.");
                permissionRequest.deny();
            } else {
                String message5 = "Permission domain '" + host + "' is contained in allow list. Granting...";
                Intrinsics.checkNotNullParameter(message5, "message");
                oVar.a(nVar, message5);
                permissionRequest.grant(permissionRequest.getResources());
            }
        } catch (Exception e) {
            o oVar2 = o.b;
            String message6 = "onPermissionRequest failed due to exception: " + e.getMessage();
            oVar2.getClass();
            Intrinsics.checkNotNullParameter(message6, "message");
            oVar2.a(n.CRITICAL, message6);
            permissionRequest.deny();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        this.b.getMessageSender().a(this.b.getName(), h5.PageProgressChanged, String.valueOf(i / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (view instanceof FrameLayout) {
            this.f = true;
            this.g = view;
            this.c.setVisibility(4);
            this.d.setVisibility(0);
            this.d.addView(this.g, new ViewGroup.LayoutParams(-1, -1));
            if (this.b.getSettings().getJavaScriptEnabled() && (((FrameLayout) view).getFocusedChild() instanceof SurfaceView)) {
                this.b.loadUrl("javascript:\n                    var _ytrp_html5_video_last;\n                    var _ytrp_html5_video = document.getElementsByTagName('video')[0];\n                    if (_ytrp_html5_video != undefined && _ytrp_html5_video != _ytrp_html5_video_last) {\n                      _ytrp_html5_video_last = _ytrp_html5_video;\n                      function _ytrp_html5_video_ended() {\n                        window.location.href = 'uniwebviewinternal://__uniwebview_internal_video_end';\n                      }\n                      window.location.href = 'uniwebviewinternal://__uniwebview_internal_video_end';\n                    }");
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        x0 handler = new x0(valueCallback, fileChooserParams);
        Activity context = this.a;
        Intrinsics.checkNotNullParameter(context, "context");
        d0.a.getClass();
        Intrinsics.checkNotNullParameter(handler, "handler");
        String handlerId = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(handlerId, "randomUUID().toString()");
        c0.b.put(handlerId, handler);
        handler.g = handlerId;
        handler.h = context;
        a5 a5Var = UniWebViewProxyActivity.Companion;
        if (handlerId == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handlerId");
            handlerId = null;
        }
        a5Var.getClass();
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
        o oVar = o.b;
        o oVar2 = o.b;
        String message = "Prepare capture permission prompt. URL: " + permissionRequest.getOrigin() + "; resources: " + permissionRequest.getResources();
        oVar2.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar2.a(n.INFO, message);
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
        new AlertDialog.Builder(this.a).setTitle(this.a.getResources().getString(R.string.MEDIA_CAPTURE_PERMISSION_REQUEST_TITLE)).setMessage(string).setCancelable(false).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.n0$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                n0.a(permissionRequest, resources2, dialogInterface, i3);
            }
        }).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.n0$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                n0.a(permissionRequest, dialogInterface, i3);
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
