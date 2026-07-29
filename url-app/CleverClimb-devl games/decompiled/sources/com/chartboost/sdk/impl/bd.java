package com.chartboost.sdk.impl;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Libraries.e;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bd extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    private View f3776a;

    /* renamed from: b, reason: collision with root package name */
    private ViewGroup f3777b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3778c = false;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f3779d;
    private WebChromeClient.CustomViewCallback e;
    private a f;
    private final bf g;
    private final Handler h;

    public interface a {
        void a(boolean z);
    }

    public bd(View view, ViewGroup viewGroup, View view2, be beVar, bf bfVar, Handler handler) {
        this.f3776a = view;
        this.f3777b = viewGroup;
        this.g = bfVar;
        this.h = handler;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        Log.d(bd.class.getSimpleName(), "Chartboost Webview:" + consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            jsPromptResult.confirm(a(jSONObject.getJSONObject("eventArgs"), jSONObject.getString("eventType")));
            return true;
        } catch (JSONException unused) {
            CBLogging.b("CBWebChromeClient", "Exception caught parsing the function name from js to native");
            return true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public String a(JSONObject jSONObject, String str) {
        char c2;
        com.chartboost.sdk.Model.a aVar;
        int i = 8;
        switch (str.hashCode()) {
            case -2012425132:
                if (str.equals("getDefaultPosition")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case -1757019252:
                if (str.equals("getCurrentPosition")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case -1554056650:
                if (str.equals("currentVideoDuration")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -1263203643:
                if (str.equals("openUrl")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case -1086137328:
                if (str.equals("videoCompleted")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -715147645:
                if (str.equals("getScreenSize")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case -640720077:
                if (str.equals("videoPlaying")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 3529469:
                if (str.equals("show")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 94750088:
                if (str.equals("click")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 94756344:
                if (str.equals("close")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 95458899:
                if (str.equals("debug")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 96784904:
                if (str.equals("error")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 133423073:
                if (str.equals("setOrientationProperties")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case 160987616:
                if (str.equals("getParameters")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 937504109:
                if (str.equals("getOrientationProperties")) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case 939594121:
                if (str.equals("videoPaused")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 1000390722:
                if (str.equals("videoReplay")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1082777163:
                if (str.equals("totalVideoDuration")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 1124446108:
                if (str.equals("warning")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 1270488759:
                if (str.equals("tracking")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case 1880941391:
                if (str.equals("getMaxSize")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                Log.d("CBWebChromeClient", "JavaScript to native " + str + " callback triggered.");
                if (this.g.e == null || (aVar = this.g.e.p) == null) {
                    return "{}";
                }
                JSONObject a2 = com.chartboost.sdk.Libraries.e.a(new e.a[0]);
                for (Map.Entry<String, String> entry : aVar.f3613d.entrySet()) {
                    com.chartboost.sdk.Libraries.e.a(a2, entry.getKey(), entry.getValue());
                }
                for (Map.Entry<String, com.chartboost.sdk.Model.b> entry2 : aVar.f3612c.entrySet()) {
                    com.chartboost.sdk.Model.b value = entry2.getValue();
                    com.chartboost.sdk.Libraries.e.a(a2, entry2.getKey(), value.f3614a + "/" + value.f3615b);
                }
                return a2.toString();
            case 1:
                i = 0;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                i = 9;
                break;
            case 4:
                i = 11;
                break;
            case 5:
                i = 10;
                break;
            case 6:
                i = 12;
                break;
            case 7:
                i = 2;
                break;
            case '\b':
                i = 7;
                break;
            case '\t':
                i = 6;
                break;
            case '\n':
                Log.d(be.class.getName(), "Javascript Error occured");
                i = 4;
                break;
            case 11:
                Log.d(be.class.getName(), "Javascript warning occurred");
                i = 13;
                break;
            case '\f':
                i = 3;
                break;
            case '\r':
                break;
            case 14:
                i = 5;
                break;
            case 15:
                Log.d("CBWebChromeClient", "JavaScript to native " + str + " callback triggered.");
                return this.g.s();
            case 16:
                Log.d("CBWebChromeClient", "JavaScript to native " + str + " callback triggered.");
                return this.g.t();
            case 17:
                Log.d("CBWebChromeClient", "JavaScript to native " + str + " callback triggered.");
                return this.g.v();
            case 18:
                Log.d("CBWebChromeClient", "JavaScript to native " + str + " callback triggered.");
                return this.g.u();
            case 19:
                Log.d("CBWebChromeClient", "JavaScript to native " + str + " callback triggered.");
                return this.g.p();
            case 20:
                Log.d("CBWebChromeClient", "JavaScript to native " + str + " callback triggered.");
                i = 14;
                break;
            default:
                Log.e("CBWebChromeClient", "JavaScript to native " + str + " callback not recognized.");
                return "Function name not recognized.";
        }
        Log.d("CBWebChromeClient", "JavaScript to native " + str + " callback triggered.");
        this.h.post(new bg(this, this.g, i, str, jSONObject));
        return "Native function successfully called.";
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (view instanceof FrameLayout) {
            this.f3778c = true;
            this.f3779d = (FrameLayout) view;
            this.e = customViewCallback;
            this.f3776a.setVisibility(4);
            this.f3777b.addView(this.f3779d, new ViewGroup.LayoutParams(-1, -1));
            this.f3777b.setVisibility(0);
            if (this.f != null) {
                this.f.a(true);
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, customViewCallback);
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        if (this.f3778c) {
            this.f3777b.setVisibility(4);
            this.f3777b.removeView(this.f3779d);
            this.f3776a.setVisibility(0);
            if (this.e != null && !this.e.getClass().getName().contains(".chromium.")) {
                this.e.onCustomViewHidden();
            }
            this.f3778c = false;
            this.f3779d = null;
            this.e = null;
            if (this.f != null) {
                this.f.a(false);
            }
        }
    }
}
