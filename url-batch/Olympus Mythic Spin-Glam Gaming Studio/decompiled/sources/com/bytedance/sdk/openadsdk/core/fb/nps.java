package com.bytedance.sdk.openadsdk.core.fb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.ev;
import com.bytedance.sdk.openadsdk.utils.jy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes15.dex */
public class nps extends PAGBannerAd {
    private boolean btk;
    private int bvs;
    private boolean fb;
    protected nqi fs;
    private btk hhw;
    private final AtomicBoolean iv = new AtomicBoolean(false);
    private boolean nps;
    private List<com.bytedance.sdk.openadsdk.core.fb.zmn> rc;
    private int zg;
    protected Context zmn;
    protected AdSlot zn;

    public interface zmn {
        void zmn();
    }

    public nps(Context context, nqi nqiVar, AdSlot adSlot) {
        this.zg = 0;
        this.bvs = 0;
        this.zmn = context;
        this.fs = nqiVar;
        this.zn = adSlot;
        this.zg = (int) adSlot.getExpressViewAcceptedWidth();
        this.bvs = (int) this.zn.getExpressViewAcceptedHeight();
        zmn(this.fs);
        fs(nqiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r2.btk().size() > 1) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zmn(nqi nqiVar) {
        com.bytedance.sdk.openadsdk.core.model.zmn fb;
        if (nqiVar == null || (fb = nqiVar.fb()) == null) {
            return;
        }
        boolean z = fb.bvs();
        this.nps = z;
    }

    public boolean zmn() {
        return this.nps;
    }

    private void fs(nqi nqiVar) {
        com.bytedance.sdk.openadsdk.core.model.zmn fb;
        if (nqiVar == null || (fb = nqiVar.fb()) == null) {
            return;
        }
        this.rc = new ArrayList();
        int size = fb.btk().size();
        if (this.nps) {
            this.hhw = new btk(fb.zg(), this.zmn, this.zg, this.bvs);
            for (int i = 0; i < size; i++) {
                this.zn.setExpressViewAccepted(((this.zg - jy.zn(this.zmn, fb.zg().btk())) - jy.zn(this.zmn, fb.zg().hhw())) - (jy.zn(this.zmn, fb.zg().nps()) * 2), this.bvs);
                nqi nqiVar2 = fb.btk().get(i);
                if (i != 0) {
                    zmn(i, nqiVar2);
                }
                com.bytedance.sdk.openadsdk.core.fb.zmn zmnVar = new com.bytedance.sdk.openadsdk.core.fb.zmn(this.zmn, nqiVar2, this.zn, this, true);
                zmnVar.zmn(i);
                this.rc.add(zmnVar);
            }
            this.hhw.zmn(this.rc);
            return;
        }
        this.rc.add(new com.bytedance.sdk.openadsdk.core.fb.zmn(this.zmn, nqiVar, this.zn, this, false));
    }

    private void zmn(int i, nqi nqiVar) {
        if (i != 0) {
            if (!TextUtils.isEmpty(nqiVar.obg())) {
                nqiVar.rt("0");
            }
            Map<String, Object> hr = nqiVar.hr();
            if (hr == null || !hr.containsKey("price")) {
                return;
            }
            hr.put("price", "0");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.fb) {
            return;
        }
        ev.zmn(this.fs, d);
        this.fb = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.btk) {
            return;
        }
        ev.zmn(this.fs, d, str, str2);
        this.btk = true;
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
            iqz.zn("PAGBannerAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionCallback(final PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        List<com.bytedance.sdk.openadsdk.core.fb.zmn> list = this.rc;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.rc.size(); i++) {
            this.rc.get(i).zmn(new PAGBannerAdInteractionCallback() { // from class: com.bytedance.sdk.openadsdk.core.fb.nps.1
                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdShowed() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2;
                    if (!nps.this.iv.compareAndSet(false, true) || (pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback) == null) {
                        return;
                    }
                    pAGBannerAdInteractionCallback2.onAdShowed();
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdClicked() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdClicked();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdDismissed() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdDismissed();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback
                public void onAdShowFailed(@NonNull PAGErrorModel pAGErrorModel) {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdShowFailed(pAGErrorModel);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionListener(final PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        List<com.bytedance.sdk.openadsdk.core.fb.zmn> list = this.rc;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.rc.size(); i++) {
            this.rc.get(i).zmn(new PAGBannerAdInteractionListener() { // from class: com.bytedance.sdk.openadsdk.core.fb.nps.2
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdShowed() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2;
                    if (!nps.this.iv.compareAndSet(false, true) || (pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener) == null) {
                        return;
                    }
                    pAGBannerAdInteractionListener2.onAdShowed();
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdClicked() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener;
                    if (pAGBannerAdInteractionListener2 != null) {
                        pAGBannerAdInteractionListener2.onAdClicked();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdDismissed() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener;
                    if (pAGBannerAdInteractionListener2 != null) {
                        pAGBannerAdInteractionListener2.onAdDismissed();
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public View getBannerView() {
        try {
            List<com.bytedance.sdk.openadsdk.core.fb.zmn> list = this.rc;
            if (list != null && !list.isEmpty()) {
                if (this.nps) {
                    return this.hhw.fs();
                }
                return this.rc.get(0).zmn();
            }
        } catch (Throwable unused) {
        }
        return new View(this.zmn);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public PAGBannerSize getBannerSize() {
        if (this.zn != null) {
            return new PAGBannerSize(this.zg, this.bvs);
        }
        return new PAGBannerSize(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void destroy() {
        try {
            List<com.bytedance.sdk.openadsdk.core.fb.zmn> list = this.rc;
            if (list == null || list.isEmpty()) {
                return;
            }
            if (this.nps) {
                this.hhw.zmn();
            } else {
                this.rc.get(0).nps();
            }
        } catch (Throwable unused) {
        }
    }
}
