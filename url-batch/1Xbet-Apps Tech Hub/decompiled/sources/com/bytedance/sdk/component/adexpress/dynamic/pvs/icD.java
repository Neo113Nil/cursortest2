package com.bytedance.sdk.component.adexpress.dynamic.pvs;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.Jd;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseInternalScrollWidgetImp;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseScrollWidgetImp;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicButton;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicClose;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicDislike;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicDislikeFeedBack;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicImageView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicLeisureWidget;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicLogoAd;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicLogoUnion;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicLottie;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicMutedView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicPrivacyView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRoot;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicSkipCountDown;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicSkipCountDownBtn;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicSkipCountDownContainer;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicSplitLineView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicStarView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicTextView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicTimeOuter;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicTimeOuterContainerWidgetImp;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicTimeOuterRewardFullSkip;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicTimeOuterSkip;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicUnKnowView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicVerticalScrollWidgetImp;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicVideoView;
import com.bytedance.sdk.component.adexpress.dynamic.vG.so;
import com.bytedance.sdk.component.adexpress.icD.Ju;

/* compiled from: DynamicViewFactory.java */
/* loaded from: classes.dex */
public class icD {
    public static DynamicBaseWidget pvs(Context context, DynamicRootView dynamicRootView, so soVar) {
        Ju renderRequest;
        if (context == null || dynamicRootView == null || soVar == null || soVar.Wyp() == null) {
            return null;
        }
        switch (soVar.Wyp().pvs()) {
            case -1:
                return new DynamicUnKnowView(context, dynamicRootView, soVar);
            case 0:
                return new DynamicTextView(context, dynamicRootView, soVar);
            case 1:
                return new DynamicImageView(context, dynamicRootView, soVar);
            case 2:
                return new DynamicButton(context, dynamicRootView, soVar);
            case 3:
                return new DynamicDislike(context, dynamicRootView, soVar);
            case 4:
                return new DynamicLogoAd(context, dynamicRootView, soVar);
            case 5:
                return new DynamicLogoUnion(context, dynamicRootView, soVar);
            case 6:
            case 9:
            case 17:
                return new DynamicBaseWidgetImp(context, dynamicRootView, soVar);
            case 7:
                return new DynamicVideoView(context, dynamicRootView, soVar);
            case 8:
                return new DynamicRoot(context, dynamicRootView, soVar);
            case 10:
                return new DynamicMutedView(context, dynamicRootView, soVar);
            case 11:
                return new DynamicStarView(context, dynamicRootView, soVar);
            case 12:
                return new DynamicDislikeFeedBack(context, dynamicRootView, soVar);
            case 13:
                return new DynamicTimeOuter(context, dynamicRootView, soVar);
            case 14:
                return new DynamicTimeOuterContainerWidgetImp(context, dynamicRootView, soVar);
            case 15:
                if (Jd.icD()) {
                    return new DynamicTimeOuterRewardFullSkip(context, dynamicRootView, soVar);
                }
                return new DynamicTimeOuterSkip(context, dynamicRootView, soVar);
            case 16:
                return new DynamicImageView(context, dynamicRootView, soVar);
            case 18:
                return new DynamicSplitLineView(context, dynamicRootView, soVar);
            case 19:
                return new DynamicSkipCountDownContainer(context, dynamicRootView, soVar);
            case 20:
                return new DynamicSkipCountDown(context, dynamicRootView, soVar);
            case 21:
                return new DynamicSkipCountDownBtn(context, dynamicRootView, soVar);
            case 22:
                return new DynamicClose(context, dynamicRootView, soVar);
            case 23:
                return new DynamicPrivacyView(context, dynamicRootView, soVar);
            case 24:
                return new DynamicBaseScrollWidgetImp(context, dynamicRootView, soVar);
            case 25:
                return new DynamicLeisureWidget(context, dynamicRootView, soVar);
            case 26:
                if ("vertical".equals(soVar.Wyp().NB().FFl())) {
                    return new DynamicVerticalScrollWidgetImp(context, dynamicRootView, soVar);
                }
                return new DynamicBaseInternalScrollWidgetImp(context, dynamicRootView, soVar);
            case 27:
                return new DynamicTimeOuterSkip(context, dynamicRootView, soVar);
            case 28:
                if (!Jd.icD() || (renderRequest = dynamicRootView.getRenderRequest()) == null) {
                    return null;
                }
                return new DynamicLottie(context, dynamicRootView, soVar, renderRequest.ZhG());
            default:
                return null;
        }
    }
}
