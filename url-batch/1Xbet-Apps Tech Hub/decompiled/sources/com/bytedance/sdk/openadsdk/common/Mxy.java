package com.bytedance.sdk.openadsdk.common;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.widget.pvs.sUS;
import com.bytedance.sdk.openadsdk.utils.kj;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONObject;

/* compiled from: TTBottomNewStyleManager.java */
/* loaded from: classes2.dex */
public class Mxy {
    private final String Jd;
    private final Context NB;
    private final SSWebView icD;
    private final LinearLayout pvs;
    private ImageView sUS;
    private sUS.pvs so;
    private final cR vG;
    private ImageView yiw;

    public Mxy(Context context, LinearLayout linearLayout, SSWebView sSWebView, cR cRVar, String str) {
        this.NB = context;
        this.pvs = linearLayout;
        this.icD = sSWebView;
        this.vG = cRVar;
        this.Jd = str;
        vG();
    }

    private void vG() {
        this.sUS = (ImageView) this.pvs.findViewById(kj.elv);
        this.yiw = (ImageView) this.pvs.findViewById(kj.tCd);
        ImageView imageView = (ImageView) this.pvs.findViewById(kj.Wby);
        ImageView imageView2 = (ImageView) this.pvs.findViewById(kj.MY);
        this.sUS.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.Mxy.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Mxy.this.icD == null || !Mxy.this.icD.NB()) {
                    return;
                }
                if (Mxy.this.so != null) {
                    Mxy.this.so.pvs();
                }
                Mxy.this.pvs("backward");
                Mxy.this.icD.sUS();
            }
        });
        this.yiw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.Mxy.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Mxy.this.icD == null || !Mxy.this.icD.yiw()) {
                    return;
                }
                Mxy.this.pvs("forward");
                Mxy.this.icD.so();
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.Mxy.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Mxy.this.icD != null) {
                    Mxy.this.icD("refresh");
                    Mxy.this.icD.Jd();
                }
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.Mxy.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Mxy.this.icD != null) {
                    Mxy.this.icD("external_btn_click");
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = Mxy.this.icD.getUrl();
                    if (TextUtils.isEmpty(url)) {
                        return;
                    }
                    intent.setData(Uri.parse(url));
                    com.bytedance.sdk.component.utils.icD.pvs(Mxy.this.NB, intent, null);
                }
            }
        });
        this.pvs.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.Mxy.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        this.sUS.setClickable(false);
        this.yiw.setClickable(false);
        this.sUS.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
        this.yiw.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
    }

    public void pvs(WebView webView, sUS.pvs pvsVar) {
        this.so = pvsVar;
        try {
            if (this.sUS != null) {
                if (webView.canGoBack()) {
                    this.sUS.setClickable(true);
                    this.sUS.clearColorFilter();
                } else {
                    this.sUS.setClickable(false);
                    this.sUS.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
            if (this.yiw != null) {
                if (webView.canGoForward()) {
                    this.yiw.setClickable(true);
                    this.yiw.clearColorFilter();
                } else {
                    this.yiw.setClickable(false);
                    this.yiw.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void pvs() {
        if (this.pvs.getAlpha() == 0.0f) {
            ObjectAnimator.ofFloat(this.pvs, "alpha", 0.0f, 1.0f).setDuration(300L).start();
        }
    }

    public void icD() {
        if (this.pvs.getAlpha() == 1.0f) {
            ObjectAnimator.ofFloat(this.pvs, "alpha", 1.0f, 0.0f).setDuration(300L).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(String str) {
        WebBackForwardList copyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.icD.getWebView() != null && (copyBackForwardList = this.icD.getWebView().copyBackForwardList()) != null) {
                int currentIndex = copyBackForwardList.getCurrentIndex();
                String url = copyBackForwardList.getItemAtIndex(currentIndex).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.icD.getUrl();
                }
                String url2 = str.equals("backward") ? copyBackForwardList.getItemAtIndex(currentIndex - 1).getUrl() : "";
                int i = 1;
                if (str.equals("forward")) {
                    url2 = copyBackForwardList.getItemAtIndex(currentIndex + 1).getUrl();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt(ImagesContract.URL, url);
                jSONObject2.putOpt("next_url", url2);
                if (copyBackForwardList.getCurrentIndex() != 0) {
                    i = 0;
                }
                jSONObject2.putOpt("first_page", Integer.valueOf(i));
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.icD.vG.pvs(System.currentTimeMillis(), this.vG, this.Jd, str, jSONObject, (com.bytedance.sdk.openadsdk.icD.yiw) null, (com.bytedance.sdk.openadsdk.icD.icD.pvs) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(String str) {
        WebBackForwardList copyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.icD.getWebView() != null && (copyBackForwardList = this.icD.getWebView().copyBackForwardList()) != null) {
                String url = copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex()).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.icD.getUrl();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt(ImagesContract.URL, url);
                jSONObject2.putOpt("first_page", Integer.valueOf(copyBackForwardList.getCurrentIndex() == 0 ? 1 : 0));
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.icD.vG.pvs(System.currentTimeMillis(), this.vG, this.Jd, str, jSONObject, (com.bytedance.sdk.openadsdk.icD.yiw) null, (com.bytedance.sdk.openadsdk.icD.icD.pvs) null);
    }
}
