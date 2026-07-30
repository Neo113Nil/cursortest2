package com.onevcat.uniwebview;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
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
import com.onevcat.uniwebview.internal.obfuscated.A;
import com.onevcat.uniwebview.internal.obfuscated.AbstractC0025a;
import com.onevcat.uniwebview.internal.obfuscated.AbstractC0082m0;
import com.onevcat.uniwebview.internal.obfuscated.B;
import com.onevcat.uniwebview.internal.obfuscated.C;
import com.onevcat.uniwebview.internal.obfuscated.C0;
import com.onevcat.uniwebview.internal.obfuscated.C0066i0;
import com.onevcat.uniwebview.internal.obfuscated.C0078l0;
import com.onevcat.uniwebview.internal.obfuscated.C0086n0;
import com.onevcat.uniwebview.internal.obfuscated.C0090o0;
import com.onevcat.uniwebview.internal.obfuscated.H3;
import com.onevcat.uniwebview.internal.obfuscated.P;
import com.onevcat.uniwebview.internal.obfuscated.Q;
import com.onevcat.uniwebview.internal.obfuscated.p3;
import com.onevcat.uniwebview.internal.obfuscated.t3;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes.dex */
public final class b extends WebChromeClient {
    public final Activity a;
    public final a b;
    public final C0 c;
    public final FrameLayout d;
    public final boolean e;
    public boolean f;
    public FrameLayout g;
    public final LinkedHashSet h;
    public boolean i;

    public b(Activity activity, a webView, C0 containerView, FrameLayout videoView, boolean z) {
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

    public final void a(final PermissionRequest permissionRequest) {
        String str;
        B b = B.b;
        String message = "Prepare capture permission prompt. URL: " + permissionRequest.getOrigin() + "; resources: " + permissionRequest.getResources();
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        final String[] resources = permissionRequest.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        ArrayList arrayList = new ArrayList(resources.length);
        int length = resources.length;
        int i = 0;
        while (true) {
            str = EnvironmentCompat.MEDIA_UNKNOWN;
            if (i >= length) {
                break;
            }
            String str2 = resources[i];
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
                        str = this.a.getResources().getString(R.string.MICROPHONE);
                    }
                } else if (str2.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    str = this.a.getResources().getString(R.string.CAMERA);
                }
            }
            arrayList.add(str);
            i++;
        }
        String joinToString$default = CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
        String host = permissionRequest.getOrigin().getHost();
        if (host != null) {
            str = host;
        }
        String string = this.a.getResources().getString(R.string.MEDIA_CAPTURE_PERMISSION_REQUEST, str, joinToString$default);
        Intrinsics.checkNotNullExpressionValue(string, "activity.resources.getSt…QUEST, host, permissions)");
        new AlertDialog.Builder(this.a).setTitle(this.a.getResources().getString(R.string.MEDIA_CAPTURE_PERMISSION_REQUEST_TITLE)).setMessage(string).setCancelable(false).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.b$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                b.a(permissionRequest, resources, dialogInterface, i2);
            }
        }).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.b$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                b.a(permissionRequest, dialogInterface, i2);
            }
        }).create().show();
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        super.onCloseWindow(webView);
        ViewParent parent = webView != null ? webView.getParent() : null;
        a aVar = parent instanceof a ? (a) parent : null;
        if (aVar == null) {
            return;
        }
        B b = B.b;
        b.getClass();
        Intrinsics.checkNotNullParameter("onCloseWindow...", "message");
        A a = A.VERBOSE;
        b.a(a, "onCloseWindow...");
        String message = "Get a parent view: " + aVar;
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(a, message);
        aVar.removeView(webView);
        a aVar2 = webView instanceof a ? (a) webView : null;
        a e = aVar.e();
        if (e != null) {
            aVar = e;
        }
        if (aVar2 != null) {
            aVar.c(aVar2.getName());
            aVar.getRootMessageSender$uniwebview_release().a(aVar.getMessageTargetName$uniwebview_release(), H3.MultipleWindowClosed, aVar2.getName());
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (!this.e) {
            return super.onConsoleMessage(consoleMessage);
        }
        if (consoleMessage == null) {
            return super.onConsoleMessage(null);
        }
        B b = B.b;
        String str = consoleMessage.message() + ", source: " + consoleMessage.sourceId() + " line: " + consoleMessage.lineNumber();
        ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
        int i = messageLevel == null ? -1 : AbstractC0082m0.a[messageLevel.ordinal()];
        if (i == -1) {
            return super.onConsoleMessage(consoleMessage);
        }
        if (i == 1) {
            b.getClass();
            B.a(A.DEBUG, "🔵", "debug: " + str);
        } else if (i == 2) {
            b.getClass();
            B.a(A.INFO, "🟢", "log: " + str);
        } else if (i == 3) {
            b.getClass();
            B.a(A.WARNING, "🟡", "warning: " + str);
        } else if (i == 4) {
            b.getClass();
            B.a(A.CRITICAL, "🔴", "error: " + str);
        } else if (i == 5) {
            b.getClass();
            B.a(A.VERBOSE, "🔵", "tip: " + str);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, android.view.View, android.webkit.WebView, com.onevcat.uniwebview.a] */
    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        B b = B.b;
        b.getClass();
        Intrinsics.checkNotNullParameter("onCreateWindow...", "message");
        A a = A.VERBOSE;
        b.a(a, "onCreateWindow...");
        WebView.HitTestResult hitTestResult = webView != 0 ? webView.getHitTestResult() : null;
        String extra = hitTestResult != null ? hitTestResult.getExtra() : null;
        String message2 = "Checking hitting result, url: " + extra;
        Intrinsics.checkNotNullParameter(message2, "message");
        b.a(a, message2);
        if (this.b.get_webClient$uniwebview_release().h.a(extra, false)) {
            return false;
        }
        if (!this.b.getSettings().supportMultipleWindows() || (!z2 && !this.i)) {
            return super.onCreateWindow(webView, z, z2, message);
        }
        a e = this.b.e();
        a aVar = e;
        if (e == null) {
            aVar = this.b;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C0086n0 c0086n0 = new C0086n0(new C0090o0(objectRef));
        Activity activity = this.a;
        C0 c0 = this.c;
        FrameLayout frameLayout = this.d;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        ?? aVar2 = new a(activity, c0, frameLayout, uuid, C.a, c0086n0);
        objectRef.element = aVar2;
        aVar2.getSettings().setUserAgentString(this.b.getSettings().getUserAgentString());
        aVar2.getSettings().setSupportMultipleWindows(true);
        aVar2.get_webChromeClient$uniwebview_release().i = this.i;
        aVar2.setMessageTargetName$uniwebview_release(aVar.getMessageTargetName$uniwebview_release());
        aVar2.setRootMessageSender$uniwebview_release(aVar.getRootMessageSender$uniwebview_release());
        aVar2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (webView != 0) {
            webView.addView(aVar2);
        }
        Object obj = message != null ? message.obj : null;
        if (obj instanceof WebView.WebViewTransport) {
            ((WebView.WebViewTransport) obj).setWebView(aVar2);
        }
        if (message != null) {
            message.sendToTarget();
        }
        aVar.a((a) aVar2);
        aVar.getRootMessageSender$uniwebview_release().a(aVar.getMessageTargetName$uniwebview_release(), H3.MultipleWindowOpened, aVar2.getName());
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
        new AlertDialog.Builder(this.a).setTitle(str).setMessage(str2).setCancelable(false).setIcon(android.R.drawable.ic_dialog_alert).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.b$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                b.a(jsResult, dialogInterface, i);
            }
        }).create().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
        new AlertDialog.Builder(this.a).setTitle(str).setMessage(str2).setIcon(android.R.drawable.ic_dialog_info).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.b$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                b.b(jsResult, dialogInterface, i);
            }
        }).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.b$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                b.c(jsResult, dialogInterface, i);
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
        AbstractC0025a.a(cancelable, editText).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.b$$ExternalSyntheticLambda5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                b.a(editText, jsPromptResult, dialogInterface, i);
            }
        }).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.b$$ExternalSyntheticLambda6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                b.a(jsPromptResult, dialogInterface, i);
            }
        }).create().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        B b = B.b;
        String message = "UniWebViewChromeClient onPermissionRequest. URL: " + (permissionRequest != null ? permissionRequest.getOrigin() : null);
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        A a = A.INFO;
        b.a(a, message);
        if (permissionRequest == null) {
            return;
        }
        C0066i0 c0066i0 = new C0066i0(this.b.getName(), permissionRequest);
        UniWebViewInterface.Companion.getClass();
        C0078l0 a2 = p3.a(c0066i0);
        String message2 = "Getting result from 'RequestMediaCapturePermission' channel method: " + a2;
        Intrinsics.checkNotNullParameter(message2, "message");
        b.a(a, message2);
        if (a2 != null) {
            String string = a2.b.getString("result");
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
        b.a(a, message3);
        try {
            String host = permissionRequest.getOrigin().getHost();
            if (host != null && this.h.contains(host)) {
                String message4 = "Permission domain '" + host + "' is contained in allow list. Granting...";
                Intrinsics.checkNotNullParameter(message4, "message");
                b.a(a, message4);
                permissionRequest.grant(permissionRequest.getResources());
                return;
            }
            String message5 = "Permission domain '" + host + "' is not contained in allow list. Deny this request.";
            Intrinsics.checkNotNullParameter(message5, "message");
            A a3 = A.CRITICAL;
            b.a(a3, message5);
            Intrinsics.checkNotNullParameter("If you want to allow permission access from this domain, add it through `UniWebView.AddPermissionTrustDomain` first.", "message");
            b.a(a3, "If you want to allow permission access from this domain, add it through `UniWebView.AddPermissionTrustDomain` first.");
            permissionRequest.deny();
        } catch (Exception e) {
            B b2 = B.b;
            String message6 = "onPermissionRequest failed due to exception: " + e.getMessage();
            b2.getClass();
            Intrinsics.checkNotNullParameter(message6, "message");
            b2.a(A.CRITICAL, message6);
            permissionRequest.deny();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        float f = i / 100.0f;
        a aVar = this.b;
        H3 method = H3.PageProgressChanged;
        String parameters = String.valueOf(f);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        aVar.j.a(method, parameters);
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
        e handler = new e(valueCallback, fileChooserParams);
        Activity context = this.a;
        Intrinsics.checkNotNullParameter(context, "context");
        Q.a.getClass();
        Intrinsics.checkNotNullParameter(handler, "handler");
        String handlerId = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(handlerId, "randomUUID().toString()");
        P.b.put(handlerId, handler);
        handler.g = handlerId;
        handler.h = context;
        t3 t3Var = UniWebViewProxyActivity.Companion;
        if (handlerId == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handlerId");
            handlerId = null;
        }
        t3Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handlerId, "handlerId");
        Intent intent = new Intent(context, (Class<?>) UniWebViewProxyActivity.class);
        intent.putExtra(UniWebViewProxyActivity.HANDLER_ID, handlerId);
        context.startActivity(intent);
        return true;
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

    public static final void a(JsResult jsResult, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (jsResult != null) {
            jsResult.confirm();
        }
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
}
