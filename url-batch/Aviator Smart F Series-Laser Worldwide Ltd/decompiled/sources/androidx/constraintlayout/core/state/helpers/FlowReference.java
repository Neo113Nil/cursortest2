package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.HashMap;

/* loaded from: classes.dex */
public class FlowReference extends HelperReference {
    protected float mFirstHorizontalBias;
    protected int mFirstHorizontalStyle;
    protected float mFirstVerticalBias;
    protected int mFirstVerticalStyle;
    protected Flow mFlow;
    protected int mHorizontalAlign;
    protected int mHorizontalGap;
    protected int mHorizontalStyle;
    protected float mLastHorizontalBias;
    protected int mLastHorizontalStyle;
    protected float mLastVerticalBias;
    protected int mLastVerticalStyle;
    protected HashMap<String, Float> mMapPostMargin;
    protected HashMap<String, Float> mMapPreMargin;
    protected HashMap<String, Float> mMapWeights;
    protected int mMaxElementsWrap;
    protected int mOrientation;
    protected int mPaddingBottom;
    protected int mPaddingLeft;
    protected int mPaddingRight;
    protected int mPaddingTop;
    protected int mVerticalAlign;
    protected int mVerticalGap;
    protected int mVerticalStyle;
    protected int mWrapMode;

    public FlowReference(State state, State.Helper helper) {
        super(state, helper);
        this.mWrapMode = 0;
        this.mVerticalStyle = -1;
        this.mFirstVerticalStyle = -1;
        this.mLastVerticalStyle = -1;
        this.mHorizontalStyle = -1;
        this.mFirstHorizontalStyle = -1;
        this.mLastHorizontalStyle = -1;
        this.mVerticalAlign = 2;
        this.mHorizontalAlign = 2;
        this.mVerticalGap = 0;
        this.mHorizontalGap = 0;
        this.mPaddingLeft = 0;
        this.mPaddingRight = 0;
        this.mPaddingTop = 0;
        this.mPaddingBottom = 0;
        this.mMaxElementsWrap = -1;
        this.mOrientation = 0;
        this.mFirstVerticalBias = 0.5f;
        this.mLastVerticalBias = 0.5f;
        this.mFirstHorizontalBias = 0.5f;
        this.mLastHorizontalBias = 0.5f;
        if (helper == State.Helper.VERTICAL_FLOW) {
            this.mOrientation = 1;
        }
    }

    public void addFlowElement(String str, float f8, float f9, float f10) {
        super.add(str);
        if (!Float.isNaN(f8)) {
            if (this.mMapWeights == null) {
                this.mMapWeights = new HashMap<>();
            }
            this.mMapWeights.put(str, Float.valueOf(f8));
        }
        if (!Float.isNaN(f9)) {
            if (this.mMapPreMargin == null) {
                this.mMapPreMargin = new HashMap<>();
            }
            this.mMapPreMargin.put(str, Float.valueOf(f9));
        }
        if (Float.isNaN(f10)) {
            return;
        }
        if (this.mMapPostMargin == null) {
            this.mMapPostMargin = new HashMap<>();
        }
        this.mMapPostMargin.put(str, Float.valueOf(f10));
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        getHelperWidget();
        setConstraintWidget(this.mFlow);
        this.mFlow.setOrientation(this.mOrientation);
        this.mFlow.setWrapMode(this.mWrapMode);
        int i8 = this.mMaxElementsWrap;
        if (i8 != -1) {
            this.mFlow.setMaxElementsWrap(i8);
        }
        int i9 = this.mPaddingLeft;
        if (i9 != 0) {
            this.mFlow.setPaddingLeft(i9);
        }
        int i10 = this.mPaddingTop;
        if (i10 != 0) {
            this.mFlow.setPaddingTop(i10);
        }
        int i11 = this.mPaddingRight;
        if (i11 != 0) {
            this.mFlow.setPaddingRight(i11);
        }
        int i12 = this.mPaddingBottom;
        if (i12 != 0) {
            this.mFlow.setPaddingBottom(i12);
        }
        int i13 = this.mHorizontalGap;
        if (i13 != 0) {
            this.mFlow.setHorizontalGap(i13);
        }
        int i14 = this.mVerticalGap;
        if (i14 != 0) {
            this.mFlow.setVerticalGap(i14);
        }
        float f8 = this.mHorizontalBias;
        if (f8 != 0.5f) {
            this.mFlow.setHorizontalBias(f8);
        }
        float f9 = this.mFirstHorizontalBias;
        if (f9 != 0.5f) {
            this.mFlow.setFirstHorizontalBias(f9);
        }
        float f10 = this.mLastHorizontalBias;
        if (f10 != 0.5f) {
            this.mFlow.setLastHorizontalBias(f10);
        }
        float f11 = this.mVerticalBias;
        if (f11 != 0.5f) {
            this.mFlow.setVerticalBias(f11);
        }
        float f12 = this.mFirstVerticalBias;
        if (f12 != 0.5f) {
            this.mFlow.setFirstVerticalBias(f12);
        }
        float f13 = this.mLastVerticalBias;
        if (f13 != 0.5f) {
            this.mFlow.setLastVerticalBias(f13);
        }
        int i15 = this.mHorizontalAlign;
        if (i15 != 2) {
            this.mFlow.setHorizontalAlign(i15);
        }
        int i16 = this.mVerticalAlign;
        if (i16 != 2) {
            this.mFlow.setVerticalAlign(i16);
        }
        int i17 = this.mVerticalStyle;
        if (i17 != -1) {
            this.mFlow.setVerticalStyle(i17);
        }
        int i18 = this.mFirstVerticalStyle;
        if (i18 != -1) {
            this.mFlow.setFirstVerticalStyle(i18);
        }
        int i19 = this.mLastVerticalStyle;
        if (i19 != -1) {
            this.mFlow.setLastVerticalStyle(i19);
        }
        int i20 = this.mHorizontalStyle;
        if (i20 != -1) {
            this.mFlow.setHorizontalStyle(i20);
        }
        int i21 = this.mFirstHorizontalStyle;
        if (i21 != -1) {
            this.mFlow.setFirstHorizontalStyle(i21);
        }
        int i22 = this.mLastHorizontalStyle;
        if (i22 != -1) {
            this.mFlow.setLastHorizontalStyle(i22);
        }
        applyBase();
    }

    public float getFirstHorizontalBias() {
        return this.mFirstHorizontalBias;
    }

    public int getFirstHorizontalStyle() {
        return this.mFirstHorizontalStyle;
    }

    public float getFirstVerticalBias() {
        return this.mFirstVerticalBias;
    }

    public int getFirstVerticalStyle() {
        return this.mFirstVerticalStyle;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public HelperWidget getHelperWidget() {
        if (this.mFlow == null) {
            this.mFlow = new Flow();
        }
        return this.mFlow;
    }

    public int getHorizontalAlign() {
        return this.mHorizontalAlign;
    }

    public float getHorizontalBias() {
        return this.mHorizontalBias;
    }

    public int getHorizontalGap() {
        return this.mHorizontalGap;
    }

    public int getHorizontalStyle() {
        return this.mHorizontalStyle;
    }

    public float getLastHorizontalBias() {
        return this.mLastHorizontalBias;
    }

    public int getLastHorizontalStyle() {
        return this.mLastHorizontalStyle;
    }

    public float getLastVerticalBias() {
        return this.mLastVerticalBias;
    }

    public int getLastVerticalStyle() {
        return this.mLastVerticalStyle;
    }

    public int getMaxElementsWrap() {
        return this.mMaxElementsWrap;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getPaddingBottom() {
        return this.mPaddingBottom;
    }

    public int getPaddingLeft() {
        return this.mPaddingLeft;
    }

    public int getPaddingRight() {
        return this.mPaddingRight;
    }

    public int getPaddingTop() {
        return this.mPaddingTop;
    }

    protected float getPostMargin(String str) {
        HashMap<String, Float> hashMap = this.mMapPreMargin;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return 0.0f;
        }
        return this.mMapPreMargin.get(str).floatValue();
    }

    protected float getPreMargin(String str) {
        HashMap<String, Float> hashMap = this.mMapPostMargin;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return 0.0f;
        }
        return this.mMapPostMargin.get(str).floatValue();
    }

    public int getVerticalAlign() {
        return this.mVerticalAlign;
    }

    public float getVerticalBias() {
        return this.mVerticalBias;
    }

    public int getVerticalGap() {
        return this.mVerticalGap;
    }

    public int getVerticalStyle() {
        return this.mVerticalStyle;
    }

    protected float getWeight(String str) {
        HashMap<String, Float> hashMap = this.mMapWeights;
        if (hashMap != null && hashMap.containsKey(str)) {
            return this.mMapWeights.get(str).floatValue();
        }
        return -1.0f;
    }

    public int getWrapMode() {
        return this.mWrapMode;
    }

    public void setFirstHorizontalBias(float f8) {
        this.mFirstHorizontalBias = f8;
    }

    public void setFirstHorizontalStyle(int i8) {
        this.mFirstHorizontalStyle = i8;
    }

    public void setFirstVerticalBias(float f8) {
        this.mFirstVerticalBias = f8;
    }

    public void setFirstVerticalStyle(int i8) {
        this.mFirstVerticalStyle = i8;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public void setHelperWidget(HelperWidget helperWidget) {
        if (helperWidget instanceof Flow) {
            this.mFlow = (Flow) helperWidget;
        } else {
            this.mFlow = null;
        }
    }

    public void setHorizontalAlign(int i8) {
        this.mHorizontalAlign = i8;
    }

    public void setHorizontalGap(int i8) {
        this.mHorizontalGap = i8;
    }

    public void setHorizontalStyle(int i8) {
        this.mHorizontalStyle = i8;
    }

    public void setLastHorizontalBias(float f8) {
        this.mLastHorizontalBias = f8;
    }

    public void setLastHorizontalStyle(int i8) {
        this.mLastHorizontalStyle = i8;
    }

    public void setLastVerticalBias(float f8) {
        this.mLastVerticalBias = f8;
    }

    public void setLastVerticalStyle(int i8) {
        this.mLastVerticalStyle = i8;
    }

    public void setMaxElementsWrap(int i8) {
        this.mMaxElementsWrap = i8;
    }

    public void setOrientation(int i8) {
        this.mOrientation = i8;
    }

    public void setPaddingBottom(int i8) {
        this.mPaddingBottom = i8;
    }

    public void setPaddingLeft(int i8) {
        this.mPaddingLeft = i8;
    }

    public void setPaddingRight(int i8) {
        this.mPaddingRight = i8;
    }

    public void setPaddingTop(int i8) {
        this.mPaddingTop = i8;
    }

    public void setVerticalAlign(int i8) {
        this.mVerticalAlign = i8;
    }

    public void setVerticalGap(int i8) {
        this.mVerticalGap = i8;
    }

    public void setVerticalStyle(int i8) {
        this.mVerticalStyle = i8;
    }

    public void setWrapMode(int i8) {
        this.mWrapMode = i8;
    }
}
