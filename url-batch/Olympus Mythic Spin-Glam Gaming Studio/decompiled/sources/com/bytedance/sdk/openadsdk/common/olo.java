package com.bytedance.sdk.openadsdk.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.zn.iv;
import com.bytedance.sdk.openadsdk.zn.klz;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* loaded from: classes13.dex */
public class olo extends com.bytedance.sdk.openadsdk.core.hhw.zn implements iv.fs {
    private String btk;
    private Context fb;
    private nqi fs;
    private boolean hhw;
    private final com.bytedance.sdk.openadsdk.zn.iv nps;
    private View zmn;
    private zmn zn;

    public interface zmn {
        void fs(View view);

        void zmn(View view);

        void zmn(FilterWord filterWord);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public olo(@NonNull Context context, @NonNull nqi nqiVar) {
        this(context.getApplicationContext());
        this.fs = nqiVar;
        this.fb = context;
        fb();
        btk();
    }

    private void fb() {
        this.nps.zmn(this.fs.ze());
        this.nps.zmn(this);
    }

    public olo(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public olo(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public olo(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.hhw = false;
        this.nps = new com.bytedance.sdk.openadsdk.zn.iv();
        zmn(context, attributeSet);
    }

    private void zmn(Context context, AttributeSet attributeSet) {
        setClickable(true);
        setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.olo.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/olo$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_olo$1_onClick_f2b2223c1882b6eea7def99877e57467(view);
            }

            public void safedk_olo$1_onClick_f2b2223c1882b6eea7def99877e57467(View p0) {
                if (olo.this.nps != null) {
                    olo.this.nps.btk();
                } else {
                    olo.this.fs();
                }
            }
        });
        setBackgroundColor(Color.parseColor("#80000000"));
        this.zmn = new com.bytedance.sdk.openadsdk.zn.bvs(context, this.nps);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = jy.fs(getContext(), 20.0f);
        layoutParams.rightMargin = jy.fs(getContext(), 20.0f);
        this.zmn.setLayoutParams(layoutParams);
        this.zmn.setClickable(true);
        btk();
    }

    private void btk() {
        com.bytedance.sdk.openadsdk.zn.iv ivVar;
        nqi nqiVar = this.fs;
        if (nqiVar == null || (ivVar = this.nps) == null) {
            return;
        }
        ivVar.zmn(nqiVar.pa());
    }

    public void setDislikeSource(String str) {
        this.btk = str;
        this.nps.fs(str);
    }

    public void zmn() {
        if (this.zmn.getParent() == null) {
            addView(this.zmn);
        }
        setVisibility(0);
        this.hhw = true;
        zmn zmnVar = this.zn;
        if (zmnVar != null) {
            zmnVar.zmn(this);
        }
    }

    public void fs() {
        setVisibility(8);
        this.hhw = false;
        zmn zmnVar = this.zn;
        if (zmnVar != null) {
            zmnVar.fs(this);
        }
    }

    public void setCallback(zmn zmnVar) {
        this.zn = zmnVar;
    }

    @Override // com.bytedance.sdk.openadsdk.zn.iv.fs
    public void zmn(int i) {
        if (com.bytedance.sdk.openadsdk.zn.iv.fs == i) {
            FilterWord fs = this.nps.fs();
            if (fs == null || com.bytedance.sdk.openadsdk.zn.iv.zmn.equals(fs)) {
                return;
            }
            zmn zmnVar = this.zn;
            if (zmnVar != null) {
                try {
                    zmnVar.zmn(fs);
                } catch (Throwable unused) {
                }
            }
            fs();
            return;
        }
        if (com.bytedance.sdk.openadsdk.zn.iv.zn == i) {
            fs();
        } else if (com.bytedance.sdk.openadsdk.zn.iv.btk == i) {
            zn();
        }
    }

    public void zn() {
        Context context = this.fb;
        if (context instanceof Activity) {
            boolean isFinishing = ((Activity) context).isFinishing();
            com.bytedance.sdk.openadsdk.zn.klz klzVar = new com.bytedance.sdk.openadsdk.zn.klz(this.fb, this.nps);
            klzVar.zmn(hhw());
            klzVar.zmn(this.fs);
            if (isFinishing || klzVar.isShowing()) {
                return;
            }
            klzVar.show();
        }
    }

    private klz.zmn hhw() {
        return new klz.zmn() { // from class: com.bytedance.sdk.openadsdk.common.olo.2
            @Override // com.bytedance.sdk.openadsdk.zn.klz.zmn
            public void zmn() {
                olo.this.setVisibility(8);
            }

            @Override // com.bytedance.sdk.openadsdk.zn.klz.zmn
            public void fs() {
                olo.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.zn.klz.zmn
            public void zn() {
                olo.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.zn.klz.zmn
            public void zmn(int i, FilterWord filterWord, String str) {
                olo.this.nps.zn(str);
                olo.this.setVisibility(0);
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.sdk.openadsdk.zn.iv ivVar = this.nps;
        if (ivVar != null) {
            ivVar.zmn();
        }
    }
}
