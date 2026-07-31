package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.cn.fs.hhw;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.zn.zmn;
import com.bytedance.sdk.openadsdk.utils.fb;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes11.dex */
public class PAGVideoMediaView extends PAGMediaView implements zmn.InterfaceC0185zmn {
    private nqi fb;
    private hhw fs;
    private final com.bytedance.sdk.openadsdk.zmn.fs.zmn zn;

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public PAGVideoMediaView(Context context, @Nullable View view, @Nullable com.bytedance.sdk.openadsdk.zmn.fs.zmn zmnVar) {
        super(context);
        zmn(view);
        this.zn = zmnVar;
    }

    private void zmn(View view) {
        if (view instanceof hhw) {
            hhw hhwVar = (hhw) view;
            this.fs = hhwVar;
            addView(hhwVar, -1, -1);
        }
    }

    private void zmn() {
        hhw hhwVar = this.fs;
        if (hhwVar != null) {
            hhwVar.cn();
        }
    }

    private boolean fs() {
        hhw hhwVar = this.fs;
        if (hhwVar != null) {
            return hhwVar.mw();
        }
        return false;
    }

    public void handleInterruptVideo() {
        if (fs()) {
            return;
        }
        zmn();
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void setVideoAdListener(final PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.zmn.fs.zmn zmnVar = this.zn;
        if (zmnVar == null) {
            return;
        }
        zmnVar.zmn(new PAGVideoAdListener() { // from class: com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView.1
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
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        if (onClickListener instanceof zmn) {
            ((zmn) onClickListener).zmn((zmn.InterfaceC0185zmn) this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void close() {
        hhw hhwVar = this.fs;
        if (hhwVar != null) {
            hhwVar.cyb();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zn.zmn.InterfaceC0185zmn
    public long getVideoProgress() {
        hhw hhwVar = this.fs;
        if (hhwVar == null || hhwVar.getNativeVideoController() == null) {
            return 0L;
        }
        return this.fs.getNativeVideoController().hhw();
    }

    public void setMaterialMeta(nqi nqiVar) {
        this.fb = nqiVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        fb.zmn(this, this.fb);
    }
}
