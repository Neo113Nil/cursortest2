package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.icD.pvs;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.vG;

/* loaded from: classes2.dex */
public class PAGVideoMediaView extends PAGMediaView implements pvs.InterfaceC0074pvs {
    private cR Jd;
    private NativeVideoTsView icD;
    private final com.bytedance.sdk.openadsdk.apiImpl.feed.pvs vG;

    public PAGVideoMediaView(Context context, View view, com.bytedance.sdk.openadsdk.apiImpl.feed.pvs pvsVar) {
        super(context);
        pvs(view);
        this.vG = pvsVar;
    }

    private void pvs(View view) {
        if (view instanceof NativeVideoTsView) {
            NativeVideoTsView nativeVideoTsView = (NativeVideoTsView) view;
            this.icD = nativeVideoTsView;
            addView(nativeVideoTsView, -1, -1);
        }
    }

    private void pvs() {
        NativeVideoTsView nativeVideoTsView = this.icD;
        if (nativeVideoTsView != null) {
            nativeVideoTsView.IP();
        }
    }

    private boolean icD() {
        NativeVideoTsView nativeVideoTsView = this.icD;
        if (nativeVideoTsView != null) {
            return nativeVideoTsView.kj();
        }
        return false;
    }

    public void handleInterruptVideo() {
        if (icD()) {
            return;
        }
        pvs();
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void setVideoAdListener(final PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.apiImpl.feed.pvs pvsVar = this.vG;
        if (pvsVar == null) {
            return;
        }
        pvsVar.pvs(new PAGVideoAdListener() { // from class: com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView.1
            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPlay() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPaused() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdComplete() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoError() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }
        });
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        if (onClickListener instanceof pvs) {
            ((pvs) onClickListener).pvs((pvs.InterfaceC0074pvs) this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void close() {
        NativeVideoTsView nativeVideoTsView = this.icD;
        if (nativeVideoTsView != null) {
            nativeVideoTsView.bNS();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.icD.pvs.InterfaceC0074pvs
    public long getVideoProgress() {
        NativeVideoTsView nativeVideoTsView = this.icD;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return 0L;
        }
        return this.icD.getNativeVideoController().NB();
    }

    public void setMaterialMeta(cR cRVar) {
        this.Jd = cRVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        vG.pvs(this, this.Jd);
    }
}
