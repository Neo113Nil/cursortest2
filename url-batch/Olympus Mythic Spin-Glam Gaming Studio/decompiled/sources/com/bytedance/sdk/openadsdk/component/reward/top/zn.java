package com.bytedance.sdk.openadsdk.component.reward.top;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes10.dex */
public class zn extends View implements zmn<zn> {
    private zmn<zn> zmn;

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public zn(Context context) {
        this(context, null);
    }

    public zn(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public zn(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View getITopLayout() {
        Object obj = this.zmn;
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    public zn zmn(@NonNull nqi nqiVar) {
        if (this.zmn != null) {
            return this;
        }
        TopLayoutDislike2 load = new TopLayoutDislike2(getContext()).load(nqiVar);
        this.zmn = load;
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            zmn(load, (ViewGroup) parent);
        }
        return this;
    }

    private void zmn(View view, ViewGroup viewGroup) {
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
        if (view != null) {
            view.setId(olo.xt);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void setShowSkip(boolean z) {
        zmn<zn> zmnVar = this.zmn;
        if (zmnVar != null) {
            zmnVar.setShowSkip(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void setSkipEnable(boolean z) {
        zmn<zn> zmnVar = this.zmn;
        if (zmnVar != null) {
            zmnVar.setSkipEnable(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void setSkipInvisiable() {
        zmn<zn> zmnVar = this.zmn;
        if (zmnVar != null) {
            zmnVar.setSkipInvisiable();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void setSkipText(CharSequence charSequence) {
        zmn<zn> zmnVar = this.zmn;
        if (zmnVar != null) {
            zmnVar.setSkipText(charSequence);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void setCountDownFor1InN(CharSequence charSequence, int i) {
        zmn<zn> zmnVar = this.zmn;
        if (zmnVar != null) {
            zmnVar.setCountDownFor1InN(charSequence, i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void showCountDownText() {
        zmn<zn> zmnVar = this.zmn;
        if (zmnVar != null) {
            zmnVar.showCountDownText();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void showSkipButton() {
        zmn<zn> zmnVar = this.zmn;
        if (zmnVar != null) {
            zmnVar.showSkipButton();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void setShowSound(boolean z) {
        zmn<zn> zmnVar = this.zmn;
        if (zmnVar != null) {
            zmnVar.setShowSound(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void setSoundMute(boolean z) {
        zmn<zn> zmnVar = this.zmn;
        if (zmnVar != null) {
            zmnVar.setSoundMute(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void setTime(CharSequence charSequence, CharSequence charSequence2) {
        zmn<zn> zmnVar = this.zmn;
        if (zmnVar != null) {
            zmnVar.setTime(charSequence, charSequence2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void setShowDislike(boolean z) {
        zmn<zn> zmnVar = this.zmn;
        if (zmnVar != null) {
            zmnVar.setShowDislike(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void setShowPlayableNextAd(boolean z, nqi nqiVar) {
        zmn<zn> zmnVar = this.zmn;
        if (zmnVar != null) {
            zmnVar.setShowPlayableNextAd(z, nqiVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void setShowEndCardNextAd(boolean z, nqi nqiVar) {
        zmn<zn> zmnVar = this.zmn;
        if (zmnVar != null) {
            zmnVar.setShowEndCardNextAd(z, nqiVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void setListener(fs fsVar) {
        zmn<zn> zmnVar = this.zmn;
        if (zmnVar != null) {
            zmnVar.setListener(fsVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void clickSkip() {
        zmn<zn> zmnVar = this.zmn;
        if (zmnVar != null) {
            zmnVar.clickSkip();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void clickSound(String str) {
        zmn<zn> zmnVar = this.zmn;
        if (zmnVar != null) {
            zmnVar.clickSound(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void showCloseButton() {
        zmn<zn> zmnVar = this.zmn;
        if (zmnVar != null) {
            zmnVar.showCloseButton();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public View getCloseButton() {
        zmn<zn> zmnVar = this.zmn;
        if (zmnVar != null) {
            return zmnVar.getCloseButton();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public View getCloseBackupButton() {
        zmn<zn> zmnVar = this.zmn;
        if (zmnVar != null) {
            return zmnVar.getCloseBackupButton();
        }
        return null;
    }
}
