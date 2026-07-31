package com.bytedance.sdk.openadsdk.zmn.fs;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.bjh.fs.btk;
import com.bytedance.sdk.openadsdk.core.fb.nps;
import com.bytedance.sdk.openadsdk.core.iv;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.olo;
import com.bytedance.sdk.openadsdk.utils.ev;
import com.bytedance.sdk.openadsdk.utils.kjb;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public class zg extends PAGNativeAd {
    protected int btk;
    private boolean bvs;
    protected zmn fb;
    protected final nqi fs;
    protected int hhw;
    protected String nps;
    private boolean zg;
    protected olo zmn;
    protected final Context zn;

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
    }

    public zg(@NonNull Context context, @NonNull nqi nqiVar, int i, boolean z) {
        this.fs = nqiVar;
        this.zn = context;
        this.btk = i;
        this.hhw = nqiVar.qvo();
        String zn = oub.zn(i);
        this.nps = zn;
        if (z) {
            this.fb = new zmn(context, nqiVar, zn);
            this.zmn = new olo(context, this, nqiVar, zmn(i), this.fb);
        }
    }

    private List<View> zmn(List<View> list, List<View> list2) {
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
        nqi nqiVar = this.fs;
        if (nqiVar != null) {
            return nqiVar.hr();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        nqi nqiVar = this.fs;
        if (nqiVar == null || nqiVar.hr() == null) {
            return null;
        }
        try {
            return this.fs.hr().get(str);
        } catch (Throwable th) {
            iqz.zn("TTNativeAdImpl", th.getMessage());
            return null;
        }
    }

    private String zmn(int i) {
        if (i == 1) {
            return "banner_ad";
        }
        if (i != 2) {
            return "embeded_ad";
        }
        return "interaction";
    }

    protected boolean nps() {
        nqi nqiVar = this.fs;
        return (nqiVar == null || nqiVar.va() == 5 || kgc.fb().zn(this.hhw) != 1) ? false : true;
    }

    protected void zmn(String str) {
        this.nps = str;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.zg) {
            return;
        }
        ev.zmn(this.fs, d);
        this.zg = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.bvs) {
            return;
        }
        ev.zmn(this.fs, d, str, str2);
        this.bvs = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(@NonNull ViewGroup viewGroup, @NonNull List<View> list, @Nullable List<View> list2, @Nullable View view, PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        if (viewGroup == null || list == null || list.size() <= 0) {
            return;
        }
        zmn(viewGroup, null, list, list2, view, new nps(pAGNativeAdInteractionListener));
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(@NonNull ViewGroup viewGroup, @NonNull List<View> list, @Nullable List<View> list2, @Nullable View view, PAGNativeAdInteractionCallback pAGNativeAdInteractionCallback) {
        registerViewForInteraction(viewGroup, list, list2, view, (PAGNativeAdInteractionListener) pAGNativeAdInteractionCallback);
    }

    public void zmn(@NonNull ViewGroup viewGroup, @NonNull List<View> list, @NonNull List<View> list2, @Nullable List<View> list3, @Nullable View view, final hhw hhwVar) {
        if (viewGroup == null || list2 == null || list2.size() <= 0) {
            return;
        }
        if (nps()) {
            list3 = zmn(list2, list3);
        }
        List<View> list4 = list3;
        if (view != null && hhwVar != null && hhwVar.fs()) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.zmn.fs.zg.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/zmn/fs/zg$1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view2);
                    safedk_zg$1_onClick_8a366e6b88ed9f19d39298e767bc1e43(view2);
                }

                public void safedk_zg$1_onClick_8a366e6b88ed9f19d39298e767bc1e43(View p0) {
                    final String zmn = kjb.zmn();
                    TTDelegateActivity.zmn(zg.this.fs, zmn, new nps.zmn() { // from class: com.bytedance.sdk.openadsdk.zmn.fs.zg.1.1
                        @Override // com.bytedance.sdk.openadsdk.core.fb.nps.zmn
                        public void zmn() {
                            hhwVar.zmn();
                            iv.fs().hhw(zmn);
                            PAGMediaView zmn2 = zg.this.zg().zmn();
                            if (zmn2 != null) {
                                zmn2.close();
                            }
                        }
                    });
                }
            });
        }
        this.zmn.zmn(viewGroup, list, list2, list4, hhwVar);
        nqi nqiVar = this.fs;
        com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(viewGroup, this.fs, (nqiVar == null || nqiVar.nkt() != 2) ? null : new btk.zmn(this.fs.skn()));
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public PAGNativeAdData getNativeAdData() {
        return new fb(zg());
    }

    public zmn zg() {
        return this.fb;
    }
}
