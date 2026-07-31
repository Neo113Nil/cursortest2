package com.bytedance.sdk.openadsdk.core.widget.zmn;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.fb.mw;

/* loaded from: classes14.dex */
public class btk extends WebChromeClient {
    private static final String zmn = WebChromeClient.class.getSimpleName();
    private com.bytedance.sdk.openadsdk.common.btk fb;
    private final fkt fs;
    private mw zn;

    public btk(fkt fktVar) {
        this.fs = fktVar;
    }

    public btk(fkt fktVar, mw mwVar, com.bytedance.sdk.openadsdk.common.btk btkVar) {
        this(fktVar, mwVar);
        this.fb = btkVar;
    }

    public btk(fkt fktVar, mw mwVar) {
        this.fs = fktVar;
        this.zn = mwVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i, String str2) {
        if (!TextUtils.isEmpty(str)) {
            zmn(str);
        }
        super.onConsoleMessage(str, i, str2);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage != null && !TextUtils.isEmpty(consoleMessage.message())) {
            boolean zmn2 = zmn(consoleMessage.message());
            iqz.zmn(zmn, "onConsoleMessage: " + consoleMessage.message());
            if (zmn2) {
                return true;
            }
        }
        return super.onConsoleMessage(consoleMessage);
    }

    private boolean zmn(@NonNull final String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (str.regionMatches(true, 0, "bytedance:", 0, 10)) {
                cn.zn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.widget.zmn.btk.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.utils.iqz.zmn(Uri.parse(str), btk.this.fs);
                    }
                });
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        mw mwVar = this.zn;
        if (mwVar != null) {
            mwVar.zmn(webView, i);
        }
        com.bytedance.sdk.openadsdk.common.btk btkVar = this.fb;
        if (btkVar != null) {
            btkVar.zmn(webView, i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }

    @Override // android.webkit.WebChromeClient
    @Nullable
    public Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
    }
}
