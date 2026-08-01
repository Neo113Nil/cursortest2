package com.bytedance.sdk.openadsdk.component.reward.top;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.kj;

/* loaded from: classes2.dex */
public class TopProxyLayout extends View implements pvs<TopProxyLayout> {
    private pvs<TopProxyLayout> pvs;

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public TopProxyLayout(Context context) {
        this(context, null);
    }

    public TopProxyLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopProxyLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View getITopLayout() {
        Object obj = this.pvs;
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    public TopProxyLayout pvs(cR cRVar) {
        if (this.pvs != null) {
            return this;
        }
        TopLayoutDislike2 pvs = new TopLayoutDislike2(getContext()).pvs(cRVar);
        this.pvs = pvs;
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            pvs(pvs, (ViewGroup) parent);
        }
        return this;
    }

    private void pvs(View view, ViewGroup viewGroup) {
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
        if (view != null) {
            view.setId(kj.pQ);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void setShowSkip(boolean z) {
        pvs<TopProxyLayout> pvsVar = this.pvs;
        if (pvsVar != null) {
            pvsVar.setShowSkip(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void setSkipEnable(boolean z) {
        pvs<TopProxyLayout> pvsVar = this.pvs;
        if (pvsVar != null) {
            pvsVar.setSkipEnable(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void vG() {
        pvs<TopProxyLayout> pvsVar = this.pvs;
        if (pvsVar != null) {
            pvsVar.vG();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void setSkipText(CharSequence charSequence) {
        pvs<TopProxyLayout> pvsVar = this.pvs;
        if (pvsVar != null) {
            pvsVar.setSkipText(charSequence);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void Jd() {
        pvs<TopProxyLayout> pvsVar = this.pvs;
        if (pvsVar != null) {
            pvsVar.Jd();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void NB() {
        pvs<TopProxyLayout> pvsVar = this.pvs;
        if (pvsVar != null) {
            pvsVar.NB();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void setShowSound(boolean z) {
        pvs<TopProxyLayout> pvsVar = this.pvs;
        if (pvsVar != null) {
            pvsVar.setShowSound(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void setSoundMute(boolean z) {
        pvs<TopProxyLayout> pvsVar = this.pvs;
        if (pvsVar != null) {
            pvsVar.setSoundMute(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void pvs(CharSequence charSequence, CharSequence charSequence2) {
        pvs<TopProxyLayout> pvsVar = this.pvs;
        if (pvsVar != null) {
            pvsVar.pvs(charSequence, charSequence2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void setShowDislike(boolean z) {
        pvs<TopProxyLayout> pvsVar = this.pvs;
        if (pvsVar != null) {
            pvsVar.setShowDislike(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void setListener(icD icd) {
        pvs<TopProxyLayout> pvsVar = this.pvs;
        if (pvsVar != null) {
            pvsVar.setListener(icd);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void pvs() {
        pvs<TopProxyLayout> pvsVar = this.pvs;
        if (pvsVar != null) {
            pvsVar.pvs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void icD() {
        pvs<TopProxyLayout> pvsVar = this.pvs;
        if (pvsVar != null) {
            pvsVar.icD();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void sUS() {
        pvs<TopProxyLayout> pvsVar = this.pvs;
        if (pvsVar != null) {
            pvsVar.sUS();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public View getCloseButton() {
        pvs<TopProxyLayout> pvsVar = this.pvs;
        if (pvsVar != null) {
            return pvsVar.getCloseButton();
        }
        return null;
    }
}
