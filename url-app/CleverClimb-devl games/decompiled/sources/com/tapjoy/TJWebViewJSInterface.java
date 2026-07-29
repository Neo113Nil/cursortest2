package com.tapjoy;

import android.annotation.TargetApi;
import android.os.AsyncTask;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyErrorMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TJWebViewJSInterface {

    /* renamed from: a, reason: collision with root package name */
    WebView f7735a;

    /* renamed from: b, reason: collision with root package name */
    TJWebViewJSInterfaceListener f7736b;

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentLinkedQueue f7737c = new ConcurrentLinkedQueue();

    /* renamed from: d, reason: collision with root package name */
    private boolean f7738d;

    public TJWebViewJSInterface(WebView webView, TJWebViewJSInterfaceListener tJWebViewJSInterfaceListener) {
        this.f7735a = webView;
        this.f7736b = tJWebViewJSInterfaceListener;
    }

    @JavascriptInterface
    public void dispatchMethod(String str) {
        TapjoyLog.d("TJWebViewJSInterface", "dispatchMethod params: " + str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getJSONObject("data").getString(TJAdUnitConstants.String.METHOD);
            TapjoyLog.d("TJWebViewJSInterface", "method: " + string);
            if (this.f7736b != null) {
                this.f7736b.onDispatchMethod(string, jSONObject);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void callback(ArrayList arrayList, String str, String str2) {
        try {
            callbackToJavaScript(new JSONArray((Collection) arrayList), str, str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void callback(Map map, String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject(map));
            callbackToJavaScript(jSONArray, str, str2);
        } catch (Exception e) {
            TapjoyLog.e("TJWebViewJSInterface", "Exception in callback to JS: " + e.toString());
            e.printStackTrace();
        }
    }

    public void callbackToJavaScript(Object obj, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TJAdUnitConstants.String.ARGUMENTS, obj);
            if (str != null && str.length() > 0) {
                jSONObject.put(TJAdUnitConstants.String.METHOD, str);
            }
            JSONObject jSONObject2 = new JSONObject();
            if (str2 != null && str2.length() > 0) {
                jSONObject2.put(TJAdUnitConstants.String.CALLBACK_ID, str2);
            }
            jSONObject2.put("data", jSONObject);
            String str3 = "javascript:if(window.AndroidWebViewJavascriptBridge) AndroidWebViewJavascriptBridge._handleMessageFromAndroid('" + jSONObject2 + "');";
            if (!this.f7738d) {
                this.f7737c.add(str3);
            } else {
                new a(this.f7735a).execute(str3);
            }
        } catch (Exception e) {
            TapjoyLog.e("TJWebViewJSInterface", "Exception in callback to JS: " + e.toString());
            e.printStackTrace();
        }
    }

    public void flushMessageQueue() {
        if (this.f7738d) {
            return;
        }
        while (true) {
            String str = (String) this.f7737c.poll();
            if (str != null) {
                new a(this.f7735a).execute(str);
            } else {
                this.f7738d = true;
                return;
            }
        }
    }

    @TargetApi(19)
    class a extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        WebView f7739a;

        @Override // android.os.AsyncTask
        protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            return ((String[]) objArr)[0];
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(Object obj) {
            String str = (String) obj;
            if (this.f7739a != null) {
                if (str.startsWith("javascript:") && Build.VERSION.SDK_INT >= 19) {
                    try {
                        this.f7739a.evaluateJavascript(str.replaceFirst("javascript:", ""), null);
                        return;
                    } catch (Exception e) {
                        TapjoyLog.e("TJWebViewJSInterface", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTERNAL_ERROR, "Exception in evaluateJavascript. Device not supported. " + e.toString()));
                        return;
                    }
                }
                try {
                    this.f7739a.loadUrl(str);
                } catch (Exception e2) {
                    TapjoyLog.e("TJWebViewJSInterface", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTERNAL_ERROR, "Exception in loadUrl. Device not supported. " + e2.toString()));
                }
            }
        }

        public a(WebView webView) {
            this.f7739a = webView;
        }
    }
}
