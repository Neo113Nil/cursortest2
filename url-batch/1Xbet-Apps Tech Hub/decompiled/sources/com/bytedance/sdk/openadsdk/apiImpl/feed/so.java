package com.bytedance.sdk.openadsdk.apiImpl.feed;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.bNS;
import com.bytedance.sdk.openadsdk.core.bannerexpress.pvs;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.dyT;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.bytedance.sdk.openadsdk.utils.rCZ;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: TTNativeAdImpl.java */
/* loaded from: classes2.dex */
public class so extends PAGNativeAd {
    protected pvs Jd;
    private boolean Mxy;
    protected int NB;
    protected final cR icD;
    protected bNS pvs;
    protected int sUS;
    private boolean so;
    protected final Context vG;
    protected String yiw;

    private String pvs(int i) {
        return i != 1 ? i != 2 ? "embeded_ad" : "interaction" : "banner_ad";
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
    }

    public so(Context context, cR cRVar, int i, boolean z) {
        if (cRVar == null) {
            Ju.icD("materialMeta can't been null");
        }
        this.icD = cRVar;
        this.vG = context;
        this.NB = i;
        this.sUS = cRVar.yTz();
        this.yiw = jlb.vG(i);
        if (z) {
            this.Jd = new pvs(context, cRVar, this.yiw);
            this.pvs = new bNS(context, this, cRVar, pvs(i), this.Jd);
        }
    }

    private List<View> pvs(List<View> list, List<View> list2) {
        LinkedList linkedList = new LinkedList();
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                linkedList.add(list.get(i));
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                linkedList.add(list2.get(i2));
            }
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        cR cRVar = this.icD;
        if (cRVar != null) {
            return cRVar.Wby();
        }
        return null;
    }

    protected boolean yiw() {
        cR cRVar = this.icD;
        return (cRVar == null || cRVar.jhZ() == 5 || mnm.Jd().vG(this.sUS) != 1) ? false : true;
    }

    protected void pvs(String str) {
        this.yiw = str;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.so) {
            return;
        }
        dyT.pvs(this.icD, d);
        this.so = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.Mxy) {
            return;
        }
        dyT.pvs(this.icD, d, str, str2);
        this.Mxy = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        if (viewGroup == null) {
            Ju.icD("container can't been null");
            return;
        }
        if (list == null) {
            Ju.icD("clickView can't been null");
        } else if (list.size() <= 0) {
            Ju.icD("clickViews size must been more than 1");
        } else {
            pvs(viewGroup, null, list, list2, view, new yiw(pAGNativeAdInteractionListener));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, PAGNativeAdInteractionCallback pAGNativeAdInteractionCallback) {
        registerViewForInteraction(viewGroup, list, list2, view, (PAGNativeAdInteractionListener) pAGNativeAdInteractionCallback);
    }

    public void pvs(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, View view, final sUS sus) {
        if (viewGroup == null) {
            Ju.icD("container can't been null");
            return;
        }
        if (list2 == null) {
            Ju.icD("clickView can't been null");
            return;
        }
        if (list2.size() <= 0) {
            Ju.icD("clickViews size must been more than 1");
            return;
        }
        if (yiw()) {
            list3 = pvs(list2, list3);
        }
        List<View> list4 = list3;
        if (view != null && sus != null && sus.icD()) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.so.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    final String pvs = rCZ.pvs();
                    TTDelegateActivity.pvs(so.this.icD, pvs, new pvs.InterfaceC0073pvs() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.so.1.1
                        @Override // com.bytedance.sdk.openadsdk.core.bannerexpress.pvs.InterfaceC0073pvs
                        public void pvs() {
                            sus.pvs();
                            com.bytedance.sdk.openadsdk.core.so.icD().Jd(pvs);
                            PAGMediaView pvs2 = so.this.so().pvs();
                            if (pvs2 != null) {
                                pvs2.close();
                            }
                        }
                    });
                }
            });
        }
        this.pvs.pvs(viewGroup, list, list2, list4, view, sus);
        com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(viewGroup, this.icD, null);
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public PAGNativeAdData getNativeAdData() {
        return new Jd(so());
    }

    public pvs so() {
        return this.Jd;
    }
}
