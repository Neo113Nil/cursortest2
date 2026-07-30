package com.github.mikephil.charting.components;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import com.github.mikephil.charting.utils.i;
import com.github.mikephil.charting.utils.j;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class Legend extends b {
    private List<Boolean> mCalculatedLabelBreakPoints;
    private List<com.github.mikephil.charting.utils.b> mCalculatedLabelSizes;
    private List<com.github.mikephil.charting.utils.b> mCalculatedLineSizes;
    private LegendDirection mDirection;
    private boolean mDrawInside;
    private e[] mEntries;
    private e[] mExtraEntries;
    private DashPathEffect mFormLineDashEffect;
    private float mFormLineWidth;
    private float mFormSize;
    private float mFormToTextSpace;
    private LegendHorizontalAlignment mHorizontalAlignment;
    private boolean mIsLegendCustom;
    private float mMaxSizePercent;
    public float mNeededHeight;
    public float mNeededWidth;
    private LegendOrientation mOrientation;
    private LegendForm mShape;
    private float mStackSpace;
    public float mTextHeightMax;
    public float mTextWidthMax;
    private LegendVerticalAlignment mVerticalAlignment;
    private boolean mWordWrapEnabled;
    private float mXEntrySpace;
    private float mYEntrySpace;

    public enum LegendDirection {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT
    }

    public enum LegendForm {
        NONE,
        EMPTY,
        DEFAULT,
        SQUARE,
        CIRCLE,
        LINE
    }

    public enum LegendHorizontalAlignment {
        LEFT,
        CENTER,
        RIGHT
    }

    public enum LegendOrientation {
        HORIZONTAL,
        VERTICAL
    }

    public enum LegendVerticalAlignment {
        TOP,
        CENTER,
        BOTTOM
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation;

        static {
            int[] iArr = new int[LegendOrientation.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation = iArr;
            try {
                iArr[LegendOrientation.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[LegendOrientation.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public Legend() {
        this.mEntries = new e[0];
        this.mIsLegendCustom = false;
        this.mHorizontalAlignment = LegendHorizontalAlignment.LEFT;
        this.mVerticalAlignment = LegendVerticalAlignment.BOTTOM;
        this.mOrientation = LegendOrientation.HORIZONTAL;
        this.mDrawInside = false;
        this.mDirection = LegendDirection.LEFT_TO_RIGHT;
        this.mShape = LegendForm.SQUARE;
        this.mFormSize = 8.0f;
        this.mFormLineWidth = 3.0f;
        this.mFormLineDashEffect = null;
        this.mXEntrySpace = 6.0f;
        this.mYEntrySpace = 0.0f;
        this.mFormToTextSpace = 5.0f;
        this.mStackSpace = 3.0f;
        this.mMaxSizePercent = 0.95f;
        this.mNeededWidth = 0.0f;
        this.mNeededHeight = 0.0f;
        this.mTextHeightMax = 0.0f;
        this.mTextWidthMax = 0.0f;
        this.mWordWrapEnabled = false;
        this.mCalculatedLabelSizes = new ArrayList(16);
        this.mCalculatedLabelBreakPoints = new ArrayList(16);
        this.mCalculatedLineSizes = new ArrayList(16);
        this.mTextSize = i.convertDpToPixel(10.0f);
        this.mXOffset = i.convertDpToPixel(5.0f);
        this.mYOffset = i.convertDpToPixel(3.0f);
    }

    public void calculateDimensions(Paint paint, j jVar) {
        float f8;
        float f9;
        float f10;
        float convertDpToPixel = i.convertDpToPixel(this.mFormSize);
        float convertDpToPixel2 = i.convertDpToPixel(this.mStackSpace);
        float convertDpToPixel3 = i.convertDpToPixel(this.mFormToTextSpace);
        float convertDpToPixel4 = i.convertDpToPixel(this.mXEntrySpace);
        float convertDpToPixel5 = i.convertDpToPixel(this.mYEntrySpace);
        boolean z7 = this.mWordWrapEnabled;
        e[] eVarArr = this.mEntries;
        int length = eVarArr.length;
        this.mTextWidthMax = getMaximumEntryWidth(paint);
        this.mTextHeightMax = getMaximumEntryHeight(paint);
        int i8 = a.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[this.mOrientation.ordinal()];
        if (i8 == 1) {
            float lineHeight = i.getLineHeight(paint);
            float f11 = 0.0f;
            float f12 = 0.0f;
            float f13 = 0.0f;
            boolean z8 = false;
            for (int i9 = 0; i9 < length; i9++) {
                e eVar = eVarArr[i9];
                boolean z9 = eVar.form != LegendForm.NONE;
                float convertDpToPixel6 = Float.isNaN(eVar.formSize) ? convertDpToPixel : i.convertDpToPixel(eVar.formSize);
                String str = eVar.label;
                if (!z8) {
                    f13 = 0.0f;
                }
                if (z9) {
                    if (z8) {
                        f13 += convertDpToPixel2;
                    }
                    f13 += convertDpToPixel6;
                }
                if (str != null) {
                    if (z9 && !z8) {
                        f13 += convertDpToPixel3;
                    } else if (z8) {
                        f11 = Math.max(f11, f13);
                        f12 += lineHeight + convertDpToPixel5;
                        f13 = 0.0f;
                        z8 = false;
                    }
                    f13 += i.calcTextWidth(paint, str);
                    if (i9 < length - 1) {
                        f12 += lineHeight + convertDpToPixel5;
                    }
                } else {
                    f13 += convertDpToPixel6;
                    if (i9 < length - 1) {
                        f13 += convertDpToPixel2;
                    }
                    z8 = true;
                }
                f11 = Math.max(f11, f13);
            }
            this.mNeededWidth = f11;
            this.mNeededHeight = f12;
        } else if (i8 == 2) {
            float lineHeight2 = i.getLineHeight(paint);
            float lineSpacing = i.getLineSpacing(paint) + convertDpToPixel5;
            float contentWidth = jVar.contentWidth() * this.mMaxSizePercent;
            this.mCalculatedLabelBreakPoints.clear();
            this.mCalculatedLabelSizes.clear();
            this.mCalculatedLineSizes.clear();
            int i10 = 0;
            float f14 = 0.0f;
            int i11 = -1;
            float f15 = 0.0f;
            float f16 = 0.0f;
            while (i10 < length) {
                e eVar2 = eVarArr[i10];
                float f17 = convertDpToPixel;
                float f18 = convertDpToPixel4;
                boolean z10 = eVar2.form != LegendForm.NONE;
                float convertDpToPixel7 = Float.isNaN(eVar2.formSize) ? f17 : i.convertDpToPixel(eVar2.formSize);
                String str2 = eVar2.label;
                e[] eVarArr2 = eVarArr;
                float f19 = lineSpacing;
                this.mCalculatedLabelBreakPoints.add(Boolean.FALSE);
                float f20 = i11 == -1 ? 0.0f : f15 + convertDpToPixel2;
                if (str2 != null) {
                    f8 = convertDpToPixel2;
                    this.mCalculatedLabelSizes.add(i.calcTextSize(paint, str2));
                    f9 = f20 + (z10 ? convertDpToPixel3 + convertDpToPixel7 : 0.0f) + this.mCalculatedLabelSizes.get(i10).width;
                } else {
                    f8 = convertDpToPixel2;
                    float f21 = convertDpToPixel7;
                    this.mCalculatedLabelSizes.add(com.github.mikephil.charting.utils.b.getInstance(0.0f, 0.0f));
                    f9 = f20 + (z10 ? f21 : 0.0f);
                    if (i11 == -1) {
                        i11 = i10;
                    }
                }
                if (str2 != null || i10 == length - 1) {
                    float f22 = f16;
                    float f23 = f22 == 0.0f ? 0.0f : f18;
                    if (!z7 || f22 == 0.0f || contentWidth - f22 >= f23 + f9) {
                        f10 = f22 + f23 + f9;
                    } else {
                        this.mCalculatedLineSizes.add(com.github.mikephil.charting.utils.b.getInstance(f22, lineHeight2));
                        f14 = Math.max(f14, f22);
                        this.mCalculatedLabelBreakPoints.set(i11 > -1 ? i11 : i10, Boolean.TRUE);
                        f10 = f9;
                    }
                    if (i10 == length - 1) {
                        this.mCalculatedLineSizes.add(com.github.mikephil.charting.utils.b.getInstance(f10, lineHeight2));
                        f14 = Math.max(f14, f10);
                    }
                    f16 = f10;
                }
                if (str2 != null) {
                    i11 = -1;
                }
                i10++;
                convertDpToPixel2 = f8;
                convertDpToPixel = f17;
                convertDpToPixel4 = f18;
                lineSpacing = f19;
                f15 = f9;
                eVarArr = eVarArr2;
            }
            float f24 = lineSpacing;
            this.mNeededWidth = f14;
            this.mNeededHeight = (lineHeight2 * this.mCalculatedLineSizes.size()) + (f24 * (this.mCalculatedLineSizes.size() == 0 ? 0 : this.mCalculatedLineSizes.size() - 1));
        }
        this.mNeededHeight += this.mYOffset;
        this.mNeededWidth += this.mXOffset;
    }

    public List<Boolean> getCalculatedLabelBreakPoints() {
        return this.mCalculatedLabelBreakPoints;
    }

    public List<com.github.mikephil.charting.utils.b> getCalculatedLabelSizes() {
        return this.mCalculatedLabelSizes;
    }

    public List<com.github.mikephil.charting.utils.b> getCalculatedLineSizes() {
        return this.mCalculatedLineSizes;
    }

    public LegendDirection getDirection() {
        return this.mDirection;
    }

    public e[] getEntries() {
        return this.mEntries;
    }

    public e[] getExtraEntries() {
        return this.mExtraEntries;
    }

    public LegendForm getForm() {
        return this.mShape;
    }

    public DashPathEffect getFormLineDashEffect() {
        return this.mFormLineDashEffect;
    }

    public float getFormLineWidth() {
        return this.mFormLineWidth;
    }

    public float getFormSize() {
        return this.mFormSize;
    }

    public float getFormToTextSpace() {
        return this.mFormToTextSpace;
    }

    public LegendHorizontalAlignment getHorizontalAlignment() {
        return this.mHorizontalAlignment;
    }

    public float getMaxSizePercent() {
        return this.mMaxSizePercent;
    }

    public float getMaximumEntryHeight(Paint paint) {
        float f8 = 0.0f;
        for (e eVar : this.mEntries) {
            String str = eVar.label;
            if (str != null) {
                float calcTextHeight = i.calcTextHeight(paint, str);
                if (calcTextHeight > f8) {
                    f8 = calcTextHeight;
                }
            }
        }
        return f8;
    }

    public float getMaximumEntryWidth(Paint paint) {
        float convertDpToPixel = i.convertDpToPixel(this.mFormToTextSpace);
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (e eVar : this.mEntries) {
            float convertDpToPixel2 = i.convertDpToPixel(Float.isNaN(eVar.formSize) ? this.mFormSize : eVar.formSize);
            if (convertDpToPixel2 > f9) {
                f9 = convertDpToPixel2;
            }
            String str = eVar.label;
            if (str != null) {
                float calcTextWidth = i.calcTextWidth(paint, str);
                if (calcTextWidth > f8) {
                    f8 = calcTextWidth;
                }
            }
        }
        return f8 + f9 + convertDpToPixel;
    }

    public LegendOrientation getOrientation() {
        return this.mOrientation;
    }

    public float getStackSpace() {
        return this.mStackSpace;
    }

    public LegendVerticalAlignment getVerticalAlignment() {
        return this.mVerticalAlignment;
    }

    public float getXEntrySpace() {
        return this.mXEntrySpace;
    }

    public float getYEntrySpace() {
        return this.mYEntrySpace;
    }

    public boolean isDrawInsideEnabled() {
        return this.mDrawInside;
    }

    public boolean isLegendCustom() {
        return this.mIsLegendCustom;
    }

    public boolean isWordWrapEnabled() {
        return this.mWordWrapEnabled;
    }

    public void resetCustom() {
        this.mIsLegendCustom = false;
    }

    public void setCustom(e[] eVarArr) {
        this.mEntries = eVarArr;
        this.mIsLegendCustom = true;
    }

    public void setDirection(LegendDirection legendDirection) {
        this.mDirection = legendDirection;
    }

    public void setDrawInside(boolean z7) {
        this.mDrawInside = z7;
    }

    public void setEntries(List<e> list) {
        this.mEntries = (e[]) list.toArray(new e[list.size()]);
    }

    public void setExtra(e[] eVarArr) {
        if (eVarArr == null) {
            eVarArr = new e[0];
        }
        this.mExtraEntries = eVarArr;
    }

    public void setForm(LegendForm legendForm) {
        this.mShape = legendForm;
    }

    public void setFormLineDashEffect(DashPathEffect dashPathEffect) {
        this.mFormLineDashEffect = dashPathEffect;
    }

    public void setFormLineWidth(float f8) {
        this.mFormLineWidth = f8;
    }

    public void setFormSize(float f8) {
        this.mFormSize = f8;
    }

    public void setFormToTextSpace(float f8) {
        this.mFormToTextSpace = f8;
    }

    public void setHorizontalAlignment(LegendHorizontalAlignment legendHorizontalAlignment) {
        this.mHorizontalAlignment = legendHorizontalAlignment;
    }

    public void setMaxSizePercent(float f8) {
        this.mMaxSizePercent = f8;
    }

    public void setOrientation(LegendOrientation legendOrientation) {
        this.mOrientation = legendOrientation;
    }

    public void setStackSpace(float f8) {
        this.mStackSpace = f8;
    }

    public void setVerticalAlignment(LegendVerticalAlignment legendVerticalAlignment) {
        this.mVerticalAlignment = legendVerticalAlignment;
    }

    public void setWordWrapEnabled(boolean z7) {
        this.mWordWrapEnabled = z7;
    }

    public void setXEntrySpace(float f8) {
        this.mXEntrySpace = f8;
    }

    public void setYEntrySpace(float f8) {
        this.mYEntrySpace = f8;
    }

    public void setCustom(List<e> list) {
        this.mEntries = (e[]) list.toArray(new e[list.size()]);
        this.mIsLegendCustom = true;
    }

    public void setExtra(List<e> list) {
        this.mExtraEntries = (e[]) list.toArray(new e[list.size()]);
    }

    public void setExtra(int[] iArr, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < Math.min(iArr.length, strArr.length); i8++) {
            e eVar = new e();
            int i9 = iArr[i8];
            eVar.formColor = i9;
            eVar.label = strArr[i8];
            if (i9 == 1122868 || i9 == 0) {
                eVar.form = LegendForm.NONE;
            } else if (i9 == 1122867) {
                eVar.form = LegendForm.EMPTY;
            }
            arrayList.add(eVar);
        }
        this.mExtraEntries = (e[]) arrayList.toArray(new e[arrayList.size()]);
    }

    public Legend(e[] eVarArr) {
        this();
        if (eVarArr == null) {
            throw new IllegalArgumentException("entries array is NULL");
        }
        this.mEntries = eVarArr;
    }
}
