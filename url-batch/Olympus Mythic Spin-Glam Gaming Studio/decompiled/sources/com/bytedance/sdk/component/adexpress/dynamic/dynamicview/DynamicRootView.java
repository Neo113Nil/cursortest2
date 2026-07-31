package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public class DynamicRootView extends FrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.fb {
    private String bgColor;
    private Map<Integer, String> bgMaterialCenterCalcColor;
    private btk dynamicBaseWidget;
    private int logoUnionHeight;
    private Context mContext;
    private com.bytedance.sdk.component.adexpress.dynamic.hhw.zmn mDynamicClickListener;
    boolean mIsMute;
    private com.bytedance.sdk.component.adexpress.fs.rc mRenderListener;
    private com.bytedance.sdk.component.adexpress.fs.mw mRenderRequest;
    private ViewGroup mTimeOut;
    private com.bytedance.sdk.component.adexpress.dynamic.fs muteListener;
    protected final com.bytedance.sdk.component.adexpress.fs.rt renderResult;
    private int scoreCountWithIcon;
    private List<com.bytedance.sdk.component.adexpress.dynamic.zn> timeOutListener;
    private int timedown;
    private com.bytedance.sdk.component.adexpress.dynamic.btk videoListener;
    public View videoView;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public DynamicRootView(Context context, boolean z, com.bytedance.sdk.component.adexpress.fs.mw mwVar, com.bytedance.sdk.component.adexpress.dynamic.hhw.zmn zmnVar) {
        super(context);
        this.mTimeOut = null;
        this.timedown = 0;
        this.timeOutListener = new ArrayList();
        this.logoUnionHeight = 0;
        this.scoreCountWithIcon = 0;
        this.mContext = context;
        com.bytedance.sdk.component.adexpress.fs.rt rtVar = new com.bytedance.sdk.component.adexpress.fs.rt();
        this.renderResult = rtVar;
        rtVar.zmn(2);
        this.mDynamicClickListener = zmnVar;
        zmnVar.zmn(this);
        this.mIsMute = z;
        this.mRenderRequest = mwVar;
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public void setBgColor(String str) {
        this.bgColor = str;
    }

    public void setRenderListener(com.bytedance.sdk.component.adexpress.fs.rc rcVar) {
        this.mRenderListener = rcVar;
        this.mDynamicClickListener.zmn(rcVar);
    }

    public void render(com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar, int i) {
        this.dynamicBaseWidget = renderDynamicView(zgVar, this, i);
        this.renderResult.zmn(true);
        this.renderResult.zmn(this.dynamicBaseWidget.btk);
        this.renderResult.fs(this.dynamicBaseWidget.hhw);
        this.renderResult.zmn(this.videoView);
        this.mRenderListener.zmn(this.renderResult);
    }

    public btk renderDynamicView(com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar, ViewGroup viewGroup, int i) {
        if (zgVar == null) {
            return null;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> rc = zgVar.rc();
        btk zmn = com.bytedance.sdk.component.adexpress.dynamic.zmn.fs.zmn(this.mContext, this, zgVar);
        if (zmn instanceof yj) {
            callBackRenderFail(i == 3 ? 128 : Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, "unknow widget");
            return null;
        }
        checkCanOpenLandingPage(zgVar);
        zmn.zn();
        if (viewGroup != null) {
            viewGroup.addView(zmn);
            setClipChildren(viewGroup, zgVar);
        }
        if (rc == null || rc.size() <= 0) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> it = rc.iterator();
        while (it.hasNext()) {
            renderDynamicView(it.next(), zmn, i);
        }
        return zmn;
    }

    private void checkCanOpenLandingPage(com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        com.bytedance.sdk.component.adexpress.dynamic.fb.hhw btk;
        com.bytedance.sdk.component.adexpress.dynamic.fb.btk iv = zgVar.iv();
        if (iv == null || (btk = iv.btk()) == null) {
            return;
        }
        this.renderResult.fs(btk.pl());
    }

    public Map<Integer, String> getBgMaterialCenterCalcColor() {
        return this.bgMaterialCenterCalcColor;
    }

    public void setBgMaterialCenterCalcColor(Map<Integer, String> map) {
        this.bgMaterialCenterCalcColor = map;
    }

    private void setClipChildren(ViewGroup viewGroup, com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = (ViewGroup) viewGroup.getParent()) == null || !zgVar.uqh()) {
            return;
        }
        viewGroup2.setClipChildren(false);
        viewGroup2.setClipToPadding(false);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    public void updateRenderInfoForVideo(double d, double d2, double d3, double d4, float f) {
        this.renderResult.zn(d);
        this.renderResult.fb(d2);
        this.renderResult.btk(d3);
        this.renderResult.hhw(d4);
        this.renderResult.zmn(f);
        this.renderResult.fs(f);
        this.renderResult.zn(f);
        this.renderResult.fb(f);
    }

    public void callBackRenderFail(int i, String str) {
        this.renderResult.zmn(false);
        this.renderResult.fs(i);
        this.renderResult.zmn(str);
        this.mRenderListener.zmn(this.renderResult);
    }

    public void setMuteListener(com.bytedance.sdk.component.adexpress.dynamic.fs fsVar) {
        this.muteListener = fsVar;
    }

    public com.bytedance.sdk.component.adexpress.fs.rc getRenderListener() {
        return this.mRenderListener;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.hhw.zmn getDynamicClickListener() {
        return this.mDynamicClickListener;
    }

    private boolean checkSizeValid() {
        btk btkVar = this.dynamicBaseWidget;
        return btkVar.btk > 0.0f && btkVar.hhw > 0.0f;
    }

    public void beginShowFromInvisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 0);
    }

    public void beginHideFromVisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 4);
    }

    public void beginShowFromInvisible(btk btkVar, int i) {
        if (btkVar == null) {
            return;
        }
        if (btkVar.getBeginInvisibleAndShow()) {
            btkVar.setVisibility(i);
            View view = btkVar.cn;
            if (view != null) {
                view.setVisibility(i);
            }
        }
        int childCount = btkVar.getChildCount();
        if (childCount <= 0) {
            return;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            if (btkVar.getChildAt(i2) instanceof btk) {
                beginShowFromInvisible((btk) btkVar.getChildAt(i2), i);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fb
    public void setTime(CharSequence charSequence, int i, int i2, boolean z) {
        for (int i3 = 0; i3 < this.timeOutListener.size(); i3++) {
            if (this.timeOutListener.get(i3) != null) {
                this.timeOutListener.get(i3).zmn(charSequence, i == 1, i2, z);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fb
    public void setSoundMute(boolean z) {
        com.bytedance.sdk.component.adexpress.dynamic.fs fsVar = this.muteListener;
        if (fsVar != null) {
            fsVar.setSoundMute(z);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fb
    public void setTimeUpdate(int i) {
        this.videoListener.setTimeUpdate(i);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fb
    public void onvideoComplate() {
        try {
            this.videoListener.zmn();
        } catch (Exception unused) {
        }
    }

    public ViewGroup getTimeOut() {
        return this.mTimeOut;
    }

    public void setTimeOut(ViewGroup viewGroup) {
        this.mTimeOut = viewGroup;
    }

    public int getTimedown() {
        return this.timedown;
    }

    public void setTimedown(int i) {
        this.timedown = i;
    }

    public List<com.bytedance.sdk.component.adexpress.dynamic.zn> getTimeOutListener() {
        return this.timeOutListener;
    }

    public void setTimeOutListener(com.bytedance.sdk.component.adexpress.dynamic.zn znVar) {
        this.timeOutListener.add(znVar);
    }

    public void setVideoListener(com.bytedance.sdk.component.adexpress.dynamic.btk btkVar) {
        this.videoListener = btkVar;
    }

    public int getScoreCountWithIcon() {
        return this.scoreCountWithIcon;
    }

    public void setScoreCountWithIcon(int i) {
        this.scoreCountWithIcon = i;
    }

    public int getLogoUnionHeight() {
        return this.logoUnionHeight;
    }

    public void setLogoUnionHeight(int i) {
        this.logoUnionHeight = i;
    }

    public com.bytedance.sdk.component.adexpress.fs.mw getRenderRequest() {
        return this.mRenderRequest;
    }
}
