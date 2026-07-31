package com.bytedance.sdk.openadsdk.rt;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.bvs.nps;
import com.bytedance.sdk.component.utils.zak;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.common.bvs;
import com.bytedance.sdk.openadsdk.common.doe;
import com.bytedance.sdk.openadsdk.core.hhw.hhw;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.zmn.nps;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public class fs {
    private final Context btk;
    private boolean bvs;
    private RelativeLayout fb;
    private zmn fs;
    private nps hhw;
    private int iv;
    private nps klz = null;
    private com.bytedance.sdk.openadsdk.rt.zmn mw;
    private ImageView nps;
    private hhw rc;
    private doe zg;
    private final nqi zmn;
    private View zn;

    public interface zmn {
        void zmn(nps npsVar);
    }

    public fs(Context context, nqi nqiVar, int i) {
        this.bvs = false;
        this.btk = context;
        this.zmn = nqiVar;
        this.bvs = i == 1;
        this.iv = i;
        bvs();
    }

    public void zmn(zmn zmnVar) {
        this.fs = zmnVar;
        nps npsVar = this.hhw;
        if (npsVar != null && npsVar.isAttachedToWindow()) {
            zmnVar.zmn(this.hhw);
            return;
        }
        nps npsVar2 = this.hhw;
        if (npsVar2 != null) {
            npsVar2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.rt.fs.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    if (fs.this.fs != null) {
                        fs.this.fs.zmn(fs.this.hhw);
                    }
                    fs.this.hhw.removeOnAttachStateChangeListener(this);
                }
            });
        }
    }

    private com.bytedance.sdk.openadsdk.core.hhw.zn zmn(Context context, boolean z) {
        nps zmn2;
        nqi nqiVar;
        com.bytedance.sdk.openadsdk.core.model.fs ew;
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar = new com.bytedance.sdk.openadsdk.core.hhw.zn(context);
        znVar.setBackgroundColor(-1);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        znVar.addView(relativeLayout, new FrameLayout.LayoutParams(-1, -2));
        bvs bvsVar = new bvs(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        bvsVar.setId(olo.obg);
        relativeLayout.addView(bvsVar, layoutParams);
        MutableContextWrapper mutableContextWrapper = new MutableContextWrapper(this.btk.getApplicationContext());
        if (z) {
            zmn2 = new nps(mutableContextWrapper, nps.zn.PRIVACY);
        } else {
            zmn2 = zmn(mutableContextWrapper);
        }
        zmn2.setId(olo.gn);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.topMargin = jy.fs(mutableContextWrapper, 44.0f);
        znVar.addView(zmn2, layoutParams2);
        if (!z && (nqiVar = this.zmn) != null && (ew = nqiVar.ew()) != null) {
            String fb = ew.fb();
            if (!TextUtils.isEmpty(fb)) {
                com.bytedance.sdk.openadsdk.rt.zmn zmnVar = new com.bytedance.sdk.openadsdk.rt.zmn(mutableContextWrapper);
                this.mw = zmnVar;
                zmnVar.setId(olo.tdm);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
                this.mw.setPadding(jy.fs(this.btk, 16.0f), jy.fs(this.btk, 16.0f), jy.fs(this.btk, 16.0f), jy.fs(this.btk, 16.0f));
                this.mw.setPrivacyText(fb);
                layoutParams3.gravity = 80;
                znVar.addView(this.mw, layoutParams3);
            }
        }
        return znVar;
    }

    public void zmn(nps npsVar) {
        this.klz = npsVar;
    }

    private nps zmn(Context context) {
        nps npsVar = this.klz;
        if (npsVar != null) {
            this.klz = null;
            return npsVar;
        }
        return new nps(context, nps.zn.LANDING_PAGE);
    }

    private void bvs() {
        com.bytedance.sdk.openadsdk.core.hhw.zn zmn2 = zmn(this.btk, this.bvs);
        this.zn = zmn2;
        this.hhw = (nps) zmn2.findViewById(olo.gn);
        this.fb = (RelativeLayout) this.zn.findViewById(olo.obg);
        doe doeVar = new doe(this.btk, this.fb, this.zmn, this.hhw, "iab_".concat(String.valueOf(zmn(this.iv))), this.bvs);
        this.zg = doeVar;
        this.nps = doeVar.btk();
        this.rc = this.zg.fb();
        com.bytedance.sdk.openadsdk.rt.zmn zmnVar = this.mw;
        if (zmnVar != null) {
            zmnVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.rt.fs.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/rt/fs$2;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_fs$2_onClick_1924ddc7f890b7b214f17bdce415cec5(view);
                }

                public void safedk_fs$2_onClick_1924ddc7f890b7b214f17bdce415cec5(View p0) {
                    fs.this.zg.fb("onSelectPrivacy");
                    IABLandingPageActivity.zmn(fs.this.btk, fs.this.zmn, fs.this.zmn.btk());
                }
            });
        }
    }

    private String zmn(int i) {
        if (i < 0 || i > 2) {
            return POBCommonConstants.NULL_VALUE;
        }
        if (i == 0) {
            return "landing_page";
        }
        if (i == 1) {
            return "private_browser";
        }
        if (i != 2) {
            return POBCommonConstants.NULL_VALUE;
        }
        return "history_landing_page";
    }

    public RelativeLayout zmn() {
        return this.fb;
    }

    public void fs() {
        doe doeVar = this.zg;
        if (doeVar != null) {
            doeVar.fs();
        }
    }

    public void zn() {
        doe doeVar = this.zg;
        if (doeVar != null) {
            doeVar.zn();
        }
    }

    public hhw fb() {
        return this.rc;
    }

    public ImageView btk() {
        return this.nps;
    }

    public View hhw() {
        if (this.zn == null) {
            bvs();
        }
        return this.zn;
    }

    public void zmn(WebView webView, nps.zmn zmnVar) {
        doe doeVar = this.zg;
        if (doeVar == null || webView == null) {
            return;
        }
        doeVar.zmn(webView, zmnVar);
    }

    public void zmn(String str) {
        this.zg.zmn(str);
    }

    public void fs(String str) {
        this.zg.fs(str);
    }

    public void nps() {
        com.bytedance.sdk.component.bvs.nps npsVar = this.hhw;
        if (npsVar != null) {
            npsVar.klz();
        }
    }

    public void zg() {
        com.bytedance.sdk.component.bvs.nps npsVar = this.hhw;
        if (npsVar != null) {
            zak.zmn(npsVar);
            this.hhw = null;
        }
        this.zg = null;
    }

    public void zmn(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        boolean z = bundle.getBoolean("titleBarVisible", true);
        Log.d("TTAD.LPNewStyleM", "restoreTitleBarState - visible: ".concat(String.valueOf(z)));
        if (z) {
            fs();
        } else {
            zn();
        }
        if (this.zg != null) {
            String string = bundle.getString("mainTitle");
            String string2 = bundle.getString("subTitle");
            if (!TextUtils.isEmpty(string)) {
                zmn(string);
            }
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            fs(string2);
        }
    }
}
