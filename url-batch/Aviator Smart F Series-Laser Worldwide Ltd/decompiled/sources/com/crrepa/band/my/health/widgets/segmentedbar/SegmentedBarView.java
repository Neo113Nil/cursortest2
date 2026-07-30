package com.crrepa.band.my.health.widgets.segmentedbar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Html;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$styleable;
import com.moyoung.dafit.module.common.utils.n;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class SegmentedBarView extends View {
    private static final int ALIGN_BOTH = 1;
    private static final int ALIGN_CENTER = 0;
    private static final int CUSTOM = 2;
    private static final int SIGN = 0;
    private static final int SLIDER = 1;
    private int arrowHeight;
    private int arrowWidth;
    private int barHeight;
    private int barRoundingRadius;
    private int currentBarColor;
    private int descriptionAlign;
    private int descriptionBoxHeight;
    private int descriptionBoxTopHeight;
    private int descriptionHighlightTextColor;
    private int descriptionTextColor;
    private Paint descriptionTextPaint;
    private int descriptionTextSize;
    private int descriptionTopAlign;
    private Paint emptyPaint;
    private int emptySegmentColor;
    private String emptySegmentText;
    private Paint fillPaint;
    private DecimalFormat formatter;
    private Paint grapPaint;
    private boolean isDrawSegmentBg;
    private boolean isShowThumb;
    private Bitmap mBitmap;
    private Point point1;
    private Point point2;
    private Point point3;
    private Rect rectBounds;
    private RectF roundRectangleBounds;
    private n3.a segmentBarValueFormatter;
    private int[] segmentBgColors;
    private Rect segmentRect;
    private List<Float> segmentRights;
    private int segmentTextColor;
    private Paint segmentTextPaint;
    private int segmentTextSize;
    private List<com.crrepa.band.my.health.widgets.segmentedbar.a> segments;
    private boolean showDescriptionText;
    private boolean showDescriptionTopText;
    private boolean showSegmentText;
    private boolean showValueText;
    private boolean show_sign_boder;
    private int sideRule;
    private int sideStyle;
    private int sideTextStyle;
    private Paint signborderPaint;
    private int sliderImage;
    private int sliderType;
    private int textDecimal;
    private int thembH;
    private int thembW;
    private Path trianglePath;
    private Path triangleboderPath;
    private String unit;
    private Float value;
    private Integer valueSegment;
    private String valueSegmentText;
    private int valueSignBorderSize;
    private Rect valueSignBounds;
    private float valueSignCenter;
    private int valueSignColor;
    private int valueSignHeight;
    private int valueSignRound;
    private int valueSignWidth;
    private String valueText;
    private int valueTextColor;
    private StaticLayout valueTextLayout;
    private TextPaint valueTextPaint;
    private int valueTextSize;
    private int value_sign_border_color;

    public class b {
        public b barHeight(int i8) {
            SegmentedBarView.this.barHeight = i8;
            return this;
        }

        public SegmentedBarView build() {
            return SegmentedBarView.this;
        }

        public b descriptionBoxHeight(int i8) {
            SegmentedBarView.this.descriptionBoxHeight = i8;
            return this;
        }

        public b descriptionTextColor(int i8) {
            SegmentedBarView.this.descriptionTextColor = i8;
            return this;
        }

        public b descriptionTextSize(int i8) {
            SegmentedBarView.this.descriptionTextSize = i8;
            return this;
        }

        public b emptySegmentColor(int i8) {
            SegmentedBarView.this.emptySegmentColor = i8;
            return this;
        }

        public b segmentTextColor(int i8) {
            SegmentedBarView.this.segmentTextColor = i8;
            return this;
        }

        public b segmentTextSize(int i8) {
            SegmentedBarView.this.segmentTextSize = i8;
            return this;
        }

        public b segments(List<com.crrepa.band.my.health.widgets.segmentedbar.a> list) {
            SegmentedBarView.this.segments = list;
            return this;
        }

        public b showDescriptionText(boolean z7) {
            SegmentedBarView.this.showDescriptionText = z7;
            return this;
        }

        public b showSegmentText(boolean z7) {
            SegmentedBarView.this.showSegmentText = z7;
            return this;
        }

        public b sideRule(int i8) {
            SegmentedBarView.this.sideRule = i8;
            return this;
        }

        public b sideStyle(int i8) {
            SegmentedBarView.this.sideStyle = i8;
            return this;
        }

        public b sideTextStyle(int i8) {
            SegmentedBarView.this.sideTextStyle = i8;
            return this;
        }

        public b unit(String str) {
            SegmentedBarView.this.unit = str;
            SegmentedBarView.this.createValueTextLayout();
            return this;
        }

        public b value(Float f8) {
            SegmentedBarView.this.value = f8;
            SegmentedBarView.this.createValueTextLayout();
            return this;
        }

        public b valueSegment(Integer num) {
            SegmentedBarView.this.valueSegment = num;
            SegmentedBarView.this.createValueTextLayout();
            return this;
        }

        public b valueSegmentText(String str) {
            SegmentedBarView.this.valueSegmentText = str;
            SegmentedBarView.this.createValueTextLayout();
            return this;
        }

        public b valueSignColor(int i8) {
            SegmentedBarView.this.valueSignColor = i8;
            return this;
        }

        public b valueSignSize(int i8, int i9) {
            SegmentedBarView.this.valueSignWidth = i8;
            SegmentedBarView.this.valueSignHeight = i9;
            return this;
        }

        public b valueTextColor(int i8) {
            SegmentedBarView.this.valueTextColor = i8;
            return this;
        }

        public b valueTextSize(int i8) {
            SegmentedBarView.this.valueTextSize = i8;
            return this;
        }

        private b() {
        }
    }

    public SegmentedBarView(Context context) {
        super(context);
        this.segmentBgColors = new int[]{SupportMenu.CATEGORY_MASK, -16776961};
        this.valueSignCenter = -1.0f;
        this.barRoundingRadius = 0;
        this.sideStyle = 1;
        this.sideTextStyle = 0;
        this.segmentTextColor = -1;
        this.valueTextColor = -1;
        this.descriptionTextColor = -12303292;
        this.isDrawSegmentBg = false;
        this.segmentRights = new ArrayList();
        this.showValueText = false;
        init(context, null);
    }

    public static b builder(Context context) {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createValueTextLayout() {
        String str;
        if (valueIsEmpty()) {
            this.valueTextLayout = null;
            return;
        }
        Float f8 = this.value;
        String format = f8 != null ? this.formatter.format(f8) : this.valueSegmentText;
        if (this.value != null && (str = this.unit) != null && !str.isEmpty()) {
            format = format + String.format(" <small>%s</small>", this.unit);
        }
        if (!TextUtils.isEmpty(this.valueText)) {
            format = this.valueText;
        }
        this.valueTextLayout = new StaticLayout(Html.fromHtml(format), this.valueTextPaint, this.valueSignWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    private int descriptionBoxTopHeight() {
        if (valueIsEmpty()) {
            return 0;
        }
        return this.descriptionBoxTopHeight;
    }

    private void drawBgSegment(Canvas canvas) {
        float contentWidth = getContentWidth();
        this.rectBounds.set(getPaddingLeft() + getXLeft(), valueSignSpaceHeight() + getPaddingTop() + descriptionBoxTopHeight() + getXtop(), ((int) contentWidth) + getPaddingRight(), this.barHeight + valueSignSpaceHeight() + descriptionBoxTopHeight() + getPaddingTop());
        Rect rect = this.rectBounds;
        float f8 = rect.left;
        float f9 = rect.top;
        float f10 = rect.right;
        float f11 = rect.bottom;
        int[] iArr = this.segmentBgColors;
        this.emptyPaint.setShader(new LinearGradient(f8, f9, f10, f11, iArr[0], iArr[1], Shader.TileMode.MIRROR));
        if (this.barRoundingRadius > contentWidth / 2.0f) {
            this.sideStyle = 0;
        }
        this.segmentRect.set(this.rectBounds);
        int i8 = this.sideStyle;
        if (i8 == 0) {
            canvas.drawRect(this.rectBounds, this.emptyPaint);
        } else if (i8 == 1) {
            RectF rectF = this.roundRectangleBounds;
            Rect rect2 = this.rectBounds;
            rectF.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            RectF rectF2 = this.roundRectangleBounds;
            int i9 = this.barRoundingRadius;
            canvas.drawRoundRect(rectF2, i9, i9, this.emptyPaint);
        } else if (i8 == 2) {
            this.rectBounds.set(this.barRoundingRadius + getPaddingLeft(), valueSignSpaceHeight() + descriptionBoxTopHeight() + getPaddingTop(), (getWidth() - getPaddingRight()) - this.barRoundingRadius, this.barHeight + valueSignSpaceHeight() + descriptionBoxTopHeight() + getPaddingTop());
            canvas.drawRect(this.rectBounds, this.emptyPaint);
            Point point = this.point1;
            Rect rect3 = this.rectBounds;
            int i10 = rect3.left;
            int i11 = this.barRoundingRadius;
            point.set(i10 - i11, rect3.top + i11);
            Point point2 = this.point2;
            Rect rect4 = this.rectBounds;
            point2.set(rect4.left, rect4.top);
            Point point3 = this.point3;
            Rect rect5 = this.rectBounds;
            point3.set(rect5.left, rect5.bottom);
            drawTriangle(canvas, this.point1, this.point2, this.point3, this.emptyPaint);
            Point point4 = this.point1;
            Rect rect6 = this.rectBounds;
            int i12 = rect6.right;
            int i13 = this.barRoundingRadius;
            point4.set(i12 + i13, rect6.top + i13);
            Point point5 = this.point2;
            Rect rect7 = this.rectBounds;
            point5.set(rect7.right, rect7.top);
            Point point6 = this.point3;
            Rect rect8 = this.rectBounds;
            point6.set(rect8.right, rect8.bottom);
            drawTriangle(canvas, this.point1, this.point2, this.point3, this.emptyPaint);
        }
        if (this.showSegmentText) {
            String str = this.emptySegmentText;
            this.segmentTextPaint.setTextSize(this.segmentTextSize);
            Paint paint = this.segmentTextPaint;
            Rect rect9 = this.segmentRect;
            drawTextCentredInRectWithSides(canvas, paint, str, rect9.left, rect9.top, rect9.right, rect9.bottom);
        }
    }

    private void drawEmptySegment(Canvas canvas) {
        float contentWidth = getContentWidth();
        this.rectBounds.set(getPaddingLeft(), valueSignSpaceHeight() + getPaddingTop() + descriptionBoxTopHeight() + getXtop(), ((int) contentWidth) + getPaddingLeft(), this.barHeight + valueSignSpaceHeight() + getPaddingTop() + descriptionBoxTopHeight() + getXtop());
        this.emptyPaint.setColor(this.emptySegmentColor);
        if (this.barRoundingRadius > contentWidth / 2.0f) {
            this.sideStyle = 0;
        }
        this.segmentRect.set(this.rectBounds);
        int i8 = this.sideStyle;
        if (i8 == 0) {
            canvas.drawRect(this.rectBounds, this.emptyPaint);
        } else if (i8 == 1) {
            RectF rectF = this.roundRectangleBounds;
            Rect rect = this.rectBounds;
            rectF.set(rect.left, rect.top, rect.right, rect.bottom);
            RectF rectF2 = this.roundRectangleBounds;
            int i9 = this.barRoundingRadius;
            canvas.drawRoundRect(rectF2, i9, i9, this.emptyPaint);
        } else if (i8 == 2) {
            this.rectBounds.set(this.barRoundingRadius + getPaddingLeft(), valueSignSpaceHeight() + descriptionBoxTopHeight() + getPaddingTop() + getXtop(), (getWidth() - getPaddingRight()) - this.barRoundingRadius, this.barHeight + valueSignSpaceHeight() + descriptionBoxTopHeight() + getPaddingTop() + getXtop());
            canvas.drawRect(this.rectBounds, this.emptyPaint);
            Point point = this.point1;
            Rect rect2 = this.rectBounds;
            int i10 = rect2.left;
            int i11 = this.barRoundingRadius;
            point.set(i10 - i11, rect2.top + i11);
            Point point2 = this.point2;
            Rect rect3 = this.rectBounds;
            point2.set(rect3.left, rect3.top);
            Point point3 = this.point3;
            Rect rect4 = this.rectBounds;
            point3.set(rect4.left, rect4.bottom);
            drawTriangle(canvas, this.point1, this.point2, this.point3, this.emptyPaint);
            Point point4 = this.point1;
            Rect rect5 = this.rectBounds;
            int i12 = rect5.right;
            int i13 = this.barRoundingRadius;
            point4.set(i12 + i13, rect5.top + i13);
            Point point5 = this.point2;
            Rect rect6 = this.rectBounds;
            point5.set(rect6.right, rect6.top);
            Point point6 = this.point3;
            Rect rect7 = this.rectBounds;
            point6.set(rect7.right, rect7.bottom);
            drawTriangle(canvas, this.point1, this.point2, this.point3, this.emptyPaint);
        }
        if (this.showSegmentText) {
            String str = this.emptySegmentText;
            this.segmentTextPaint.setTextSize(this.segmentTextSize);
            Paint paint = this.segmentTextPaint;
            Rect rect8 = this.segmentRect;
            drawTextCentredInRectWithSides(canvas, paint, str, rect8.left, rect8.top, rect8.right, rect8.bottom);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x04c8, code lost:
    
        if (r1 != (-1)) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x046c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void drawSegment(Canvas canvas, com.crrepa.band.my.health.widgets.segmentedbar.a aVar, int i8, int i9, float f8, float f9) {
        float contentWidth;
        float f10;
        float f11;
        boolean z7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z8 = i8 == 0;
        boolean z9 = i8 == i9 + (-1);
        boolean z10 = z8 && z9;
        if (this.sideRule == 0) {
            contentWidth = (getContentWidth() * (aVar.getMaxValue() - aVar.getMinValue())) / f8;
            f10 = (getContentWidth() / f8) * (aVar.getMinValue() - f9);
            f11 = (getContentWidth() / f8) * (aVar.getMaxValue() - f9);
            if (!z8 && this.isDrawSegmentBg) {
                RectF rectF = new RectF();
                this.grapPaint.setColor(-1);
                rectF.set(f10, valueSignSpaceHeight() + getPaddingTop() + descriptionBoxTopHeight() + getXtop(), f10, this.barHeight + valueSignSpaceHeight() + descriptionBoxTopHeight() + getPaddingTop() + getXtop());
                canvas.drawRect(rectF, this.grapPaint);
            }
        } else {
            contentWidth = getContentWidth() / i9;
            f10 = i8 * contentWidth;
            f11 = f10 + contentWidth;
            if (!z8 && this.isDrawSegmentBg) {
                RectF rectF2 = new RectF();
                this.grapPaint.setColor(-1);
                rectF2.set(f10, valueSignSpaceHeight() + getPaddingTop() + descriptionBoxTopHeight() + getXtop(), f10, this.barHeight + valueSignSpaceHeight() + descriptionBoxTopHeight() + getPaddingTop() + getXtop());
                canvas.drawRect(rectF2, this.grapPaint);
            }
        }
        this.segmentRights.add(Float.valueOf(f11));
        int i15 = (int) f10;
        int i16 = (int) f11;
        this.rectBounds.set(getPaddingLeft() + i15 + getXLeft(), valueSignSpaceHeight() + descriptionBoxTopHeight() + getPaddingTop() + getXtop(), getPaddingRight() + i16 + getXLeft(), this.barHeight + valueSignSpaceHeight() + descriptionBoxTopHeight() + getPaddingTop() + getXtop());
        Integer num = this.valueSegment;
        if (num == null || num.intValue() != i8) {
            Float f12 = this.value;
            if (f12 == null || ((f12.floatValue() < aVar.getMinValue() || this.value.floatValue() >= aVar.getMaxValue()) && !(z9 && aVar.getMaxValue() == this.value.floatValue()))) {
                z7 = false;
                this.fillPaint.setColor(aVar.getColor());
                this.segmentRect.set(this.rectBounds);
                if (!z8 || z9) {
                    i10 = this.barRoundingRadius;
                    if (i10 > contentWidth / 2.0f) {
                        this.sideStyle = 0;
                    }
                    i11 = this.sideStyle;
                    if (i11 != 0) {
                        canvas.drawRect(this.rectBounds, this.fillPaint);
                    } else if (i11 == 1) {
                        RectF rectF3 = this.roundRectangleBounds;
                        Rect rect = this.rectBounds;
                        rectF3.set(rect.left, rect.top, rect.right, rect.bottom);
                        RectF rectF4 = this.roundRectangleBounds;
                        int i17 = this.barRoundingRadius;
                        canvas.drawRoundRect(rectF4, i17, i17, this.fillPaint);
                        if (!z10) {
                            if (z8) {
                                this.rectBounds.set(i15 + this.barRoundingRadius + getPaddingLeft() + getXLeft(), valueSignSpaceHeight() + descriptionBoxTopHeight() + getPaddingTop() + getXtop(), i16 + getPaddingRight() + getXLeft(), this.barHeight + valueSignSpaceHeight() + descriptionBoxTopHeight() + getPaddingTop() + getXtop());
                                canvas.drawRect(this.rectBounds, this.fillPaint);
                            } else {
                                this.rectBounds.set(i15 + getPaddingLeft() + getXLeft(), valueSignSpaceHeight() + descriptionBoxTopHeight() + getPaddingTop() + getXtop(), (i16 - this.barRoundingRadius) + getPaddingRight() + getXLeft(), this.barHeight + valueSignSpaceHeight() + descriptionBoxTopHeight() + getPaddingTop() + getXtop());
                                canvas.drawRect(this.rectBounds, this.fillPaint);
                            }
                        }
                    } else if (i11 == 2) {
                        if (z10) {
                            this.rectBounds.set(i15 + i10 + getPaddingLeft() + getXLeft(), valueSignSpaceHeight() + descriptionBoxTopHeight() + getPaddingTop() + getXtop(), (i16 - this.barRoundingRadius) + getPaddingLeft() + getXLeft(), this.barHeight + valueSignSpaceHeight() + getPaddingTop() + descriptionBoxTopHeight() + getXtop());
                            canvas.drawRect(this.rectBounds, this.fillPaint);
                            Point point = this.point1;
                            Rect rect2 = this.rectBounds;
                            int i18 = rect2.left;
                            int i19 = this.barRoundingRadius;
                            point.set(i18 - i19, rect2.top + i19);
                            Point point2 = this.point2;
                            Rect rect3 = this.rectBounds;
                            point2.set(rect3.left, rect3.top);
                            Point point3 = this.point3;
                            Rect rect4 = this.rectBounds;
                            point3.set(rect4.left, rect4.bottom);
                            drawTriangle(canvas, this.point1, this.point2, this.point3, this.fillPaint);
                            Point point4 = this.point1;
                            Rect rect5 = this.rectBounds;
                            int i20 = rect5.right;
                            int i21 = this.barRoundingRadius;
                            point4.set(i20 + i21, rect5.top + i21);
                            Point point5 = this.point2;
                            Rect rect6 = this.rectBounds;
                            point5.set(rect6.right, rect6.top);
                            Point point6 = this.point3;
                            Rect rect7 = this.rectBounds;
                            point6.set(rect7.right, rect7.bottom);
                            drawTriangle(canvas, this.point1, this.point2, this.point3, this.fillPaint);
                        } else if (z8) {
                            this.rectBounds.set(i15 + i10 + getPaddingLeft() + getXLeft(), valueSignSpaceHeight() + descriptionBoxTopHeight() + getPaddingTop() + getXtop(), i16 + getPaddingLeft() + getXLeft(), this.barHeight + valueSignSpaceHeight() + descriptionBoxTopHeight() + getPaddingTop() + getXtop());
                            canvas.drawRect(this.rectBounds, this.fillPaint);
                            Point point7 = this.point1;
                            Rect rect8 = this.rectBounds;
                            int i22 = rect8.left;
                            int i23 = this.barRoundingRadius;
                            point7.set(i22 - i23, rect8.top + i23);
                            Point point8 = this.point2;
                            Rect rect9 = this.rectBounds;
                            point8.set(rect9.left, rect9.top);
                            Point point9 = this.point3;
                            Rect rect10 = this.rectBounds;
                            point9.set(rect10.left, rect10.bottom);
                            drawTriangle(canvas, this.point1, this.point2, this.point3, this.fillPaint);
                        } else {
                            this.rectBounds.set(i15 + getPaddingLeft() + getXLeft(), valueSignSpaceHeight() + descriptionBoxTopHeight() + getPaddingTop() + getXtop(), (i16 - this.barRoundingRadius) + getPaddingLeft() + getXLeft(), this.barHeight + valueSignSpaceHeight() + descriptionBoxTopHeight() + getPaddingTop() + getXtop());
                            canvas.drawRect(this.rectBounds, this.fillPaint);
                            Point point10 = this.point1;
                            Rect rect11 = this.rectBounds;
                            int i24 = rect11.right;
                            int i25 = this.barRoundingRadius;
                            point10.set(i24 + i25, rect11.top + i25);
                            Point point11 = this.point2;
                            Rect rect12 = this.rectBounds;
                            point11.set(rect12.right, rect12.top);
                            Point point12 = this.point3;
                            Rect rect13 = this.rectBounds;
                            point12.set(rect13.right, rect13.bottom);
                            drawTriangle(canvas, this.point1, this.point2, this.point3, this.fillPaint);
                        }
                    }
                } else {
                    canvas.drawRect(this.rectBounds, this.fillPaint);
                }
                if (this.showSegmentText) {
                    String customText = aVar.getCustomText() != null ? aVar.getCustomText() : !z8 ? n.formatWeight(aVar.getMinValue(), this.textDecimal) : null;
                    if (!TextUtils.isEmpty(customText)) {
                        this.segmentTextPaint.setTextSize(this.segmentTextSize);
                        this.segmentTextPaint.setColor(this.segmentTextColor);
                        drawTextCentredInRect(canvas, this.segmentTextPaint, customText, this.segmentRect, z9);
                    }
                }
                if (this.showDescriptionText) {
                    this.descriptionTextPaint.setTextSize(this.descriptionTextSize);
                    Paint paint = this.descriptionTextPaint;
                    if (z7) {
                        i14 = this.descriptionHighlightTextColor;
                    }
                    i14 = this.descriptionTextColor;
                    paint.setColor(i14);
                    int i26 = this.descriptionAlign;
                    if (i26 == 0) {
                        i12 = -1;
                        Paint paint2 = this.descriptionTextPaint;
                        String descriptionText = aVar.getDescriptionText();
                        Rect rect14 = this.segmentRect;
                        drawTextCentredInRectWithSides(canvas, paint2, descriptionText, rect14.left, rect14.bottom, rect14.right, r1 + this.descriptionBoxHeight);
                    } else if (i26 == 1) {
                        Paint paint3 = this.descriptionTextPaint;
                        String descriptionText2 = aVar.getDescriptionText();
                        Rect rect15 = this.segmentRect;
                        i12 = -1;
                        drawTextLeftRightInRectBothSides(canvas, paint3, descriptionText2, rect15.left, rect15.bottom, rect15.right, r1 + this.descriptionBoxHeight, z8, z9, i8);
                    }
                    if (this.showDescriptionTopText) {
                        this.descriptionTextPaint.setTextSize(this.descriptionTextSize);
                        Paint paint4 = this.descriptionTextPaint;
                        if (!z7 || (i13 = this.descriptionHighlightTextColor) == i12) {
                            i13 = this.descriptionTextColor;
                        }
                        paint4.setColor(i13);
                        int i27 = this.descriptionTopAlign;
                        if (i27 == 0) {
                            Paint paint5 = this.descriptionTextPaint;
                            String topDescriptionText = aVar.getTopDescriptionText();
                            Rect rect16 = this.segmentRect;
                            float f13 = rect16.left;
                            float descriptionBoxTopHeight = rect16.top - descriptionBoxTopHeight();
                            Rect rect17 = this.segmentRect;
                            drawTextCentredInRectWithSides(canvas, paint5, topDescriptionText, f13, descriptionBoxTopHeight, rect17.right, rect17.top);
                            return;
                        }
                        if (i27 != 1) {
                            return;
                        }
                        Paint paint6 = this.descriptionTextPaint;
                        String topDescriptionText2 = aVar.getTopDescriptionText();
                        Rect rect18 = this.segmentRect;
                        float f14 = rect18.left;
                        float descriptionBoxTopHeight2 = rect18.top - descriptionBoxTopHeight();
                        Rect rect19 = this.segmentRect;
                        drawTextLeftRightInRectBothSides(canvas, paint6, topDescriptionText2, f14, descriptionBoxTopHeight2, rect19.right, rect19.top, z8, z9, i8);
                        return;
                    }
                    return;
                }
                i12 = -1;
                if (this.showDescriptionTopText) {
                }
            } else {
                this.valueSignCenter = (int) (f10 + getPaddingLeft() + getXLeft() + (((this.value.floatValue() - aVar.getMinValue()) / (aVar.getMaxValue() - aVar.getMinValue())) * contentWidth));
                int color = aVar.getColor();
                this.currentBarColor = color;
                this.valueSignColor = color;
            }
        } else {
            this.valueSignCenter = f10 + getPaddingLeft() + (contentWidth / 2.0f) + getXLeft();
            int color2 = aVar.getColor();
            this.currentBarColor = color2;
            this.valueSignColor = color2;
        }
        z7 = true;
        this.fillPaint.setColor(aVar.getColor());
        this.segmentRect.set(this.rectBounds);
        if (z8) {
        }
        i10 = this.barRoundingRadius;
        if (i10 > contentWidth / 2.0f) {
        }
        i11 = this.sideStyle;
        if (i11 != 0) {
        }
        if (this.showSegmentText) {
        }
        if (this.showDescriptionText) {
        }
        i12 = -1;
        if (this.showDescriptionTopText) {
        }
    }

    private void drawSliderImg(Canvas canvas, Bitmap bitmap, int i8, int i9, float f8, float f9, Paint paint) {
        canvas.drawBitmap(bitmap, f8 - (i8 / 2), f9 - (i9 / 2), paint);
    }

    private void drawTextCentredInRect(Canvas canvas, Paint paint, String str, Rect rect, boolean z7) {
        int i8 = rect.top;
        int i9 = rect.bottom;
        int i10 = rect.left;
        paint.setTextAlign(Paint.Align.CENTER);
        float descent = ((paint.descent() - paint.ascent()) / 2.0f) - paint.descent();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        canvas.drawText(str, i10, ((i8 + i9) / 2) + descent, paint);
    }

    private void drawTextCentredInRectWithSides(Canvas canvas, Paint paint, String str, float f8, float f9, float f10, float f11) {
        paint.setTextAlign(Paint.Align.CENTER);
        float descent = ((paint.descent() - paint.ascent()) / 2.0f) - paint.descent();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        canvas.drawText(str, (f8 + f10) / 2.0f, ((f9 + f11) / 2.0f) + descent, paint);
    }

    private void drawTextLeftRightInRectBothSides(Canvas canvas, Paint paint, String str, float f8, float f9, float f10, float f11, boolean z7, boolean z8, int i8) {
        paint.setTextAlign(Paint.Align.CENTER);
        float descent = ((paint.descent() - paint.ascent()) / 2.0f) - paint.descent();
        float measureText = paint.measureText(str);
        if (z7) {
            canvas.drawText(str, f8 + (measureText / 2.0f), ((f9 + f11) / 2.0f) + descent, paint);
            return;
        }
        if (z8) {
            if (this.segments.size() > 2 || !str.contains("&")) {
                canvas.drawText(str, f10 - (measureText / 2.0f), ((f9 + f11) / 2.0f) + descent, paint);
                return;
            }
            String[] split = TextUtils.split(str, "&");
            float f12 = ((f9 + f11) / 2.0f) + descent;
            canvas.drawText(split[0], f8, f12, paint);
            canvas.drawText(split[1], f10 - (measureText / 2.0f), f12, paint);
            return;
        }
        if (z7 || z8) {
            canvas.drawText(str, f10 - (measureText / 2.0f), ((f9 + f11) / 2.0f) + descent, paint);
            return;
        }
        if (str.contains("&")) {
            String[] split2 = TextUtils.split(str, "&");
            if (i8 % 2 != 1) {
                canvas.drawText(split2[1], f10, ((f9 + f11) / 2.0f) + descent, paint);
                return;
            }
            float f13 = ((f9 + f11) / 2.0f) + descent;
            canvas.drawText(split2[0], f8, f13, paint);
            canvas.drawText(split2[1], f10, f13, paint);
        }
    }

    private void drawTriangle(Canvas canvas, Point point, Point point2, Point point3, Paint paint) {
        this.trianglePath.reset();
        this.trianglePath.moveTo(point.x, point.y);
        this.trianglePath.lineTo(point2.x, point2.y);
        this.trianglePath.lineTo(point3.x, point3.y);
        this.trianglePath.lineTo(point.x, point.y);
        this.trianglePath.close();
        canvas.drawPath(this.trianglePath, paint);
    }

    private void drawTriangleBoder(Canvas canvas, Point point, Point point2, Point point3, Paint paint) {
        this.triangleboderPath.reset();
        this.triangleboderPath.moveTo(point.x, point.y);
        this.triangleboderPath.lineTo(point2.x, point2.y);
        paint.setColor(this.fillPaint.getColor());
        paint.setStrokeWidth(this.valueSignBorderSize + 1.0f);
        canvas.drawPath(this.triangleboderPath, paint);
        this.triangleboderPath.reset();
        paint.setStrokeWidth(this.valueSignBorderSize);
        float f8 = this.valueSignBorderSize / 6;
        this.triangleboderPath.moveTo(point.x - f8, point.y - f8);
        this.triangleboderPath.lineTo(point3.x, point3.y);
        this.triangleboderPath.lineTo(point2.x + f8, point2.y - f8);
        paint.setColor(this.value_sign_border_color);
        canvas.drawPath(this.triangleboderPath, paint);
    }

    private void drawValueSign(Canvas canvas, int i8, int i9) {
        boolean z7 = i9 == -1;
        if (z7) {
            i9 = (getContentWidth() / 2) + getPaddingLeft();
        }
        if (this.showValueText) {
            this.valueSignBounds.set(i9 - (this.valueSignWidth / 2), getPaddingTop(), (this.valueSignWidth / 2) + i9, (this.valueSignHeight - this.arrowHeight) + getPaddingTop());
            if (this.valueSignBounds.left < getPaddingLeft()) {
                int paddingLeft = (-this.valueSignBounds.left) + getPaddingLeft();
                RectF rectF = this.roundRectangleBounds;
                Rect rect = this.valueSignBounds;
                rectF.set(rect.left + paddingLeft, rect.top, rect.right + paddingLeft, rect.bottom);
            } else if (this.valueSignBounds.right > getMeasuredWidth() - getPaddingRight()) {
                int measuredWidth = (this.valueSignBounds.right - getMeasuredWidth()) + getPaddingRight();
                RectF rectF2 = this.roundRectangleBounds;
                Rect rect2 = this.valueSignBounds;
                rectF2.set(rect2.left - measuredWidth, rect2.top, rect2.right - measuredWidth, rect2.bottom);
            } else {
                RectF rectF3 = this.roundRectangleBounds;
                Rect rect3 = this.valueSignBounds;
                rectF3.set(rect3.left, rect3.top, rect3.right, rect3.bottom);
            }
            RectF rectF4 = this.roundRectangleBounds;
            int i10 = this.valueSignRound;
            canvas.drawRoundRect(rectF4, i10, i10, this.fillPaint);
            if (this.show_sign_boder) {
                RectF rectF5 = this.roundRectangleBounds;
                int i11 = this.valueSignRound;
                canvas.drawRoundRect(rectF5, i11, i11, this.signborderPaint);
            }
        } else {
            this.fillPaint.setColor(this.valueSignColor);
        }
        if (!z7) {
            this.point1.set(i9 - (this.arrowWidth / 2), (i8 - this.arrowHeight) + getPaddingTop());
            this.point2.set((this.arrowWidth / 2) + i9, (i8 - this.arrowHeight) + getPaddingTop());
            this.point3.set(i9, i8 + getPaddingTop());
            drawTriangle(canvas, this.point1, this.point2, this.point3, this.fillPaint);
            if (this.show_sign_boder) {
                drawTriangleBoder(canvas, this.point1, this.point2, this.point3, this.signborderPaint);
            }
        }
        if (!this.showValueText || this.valueTextLayout == null) {
            return;
        }
        RectF rectF6 = this.roundRectangleBounds;
        canvas.translate(rectF6.left, (rectF6.top + (rectF6.height() / 2.0f)) - (this.valueTextLayout.getHeight() / 2));
        this.valueTextLayout.draw(canvas);
    }

    private int getContentHeight() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private int getContentWidth() {
        return ((getWidth() - getPaddingLeft()) - getPaddingRight()) - (getXLeft() * 2);
    }

    private int getXLeft() {
        int i8 = this.sliderType;
        if ((i8 == 1 || i8 == 2) && this.isShowThumb && this.valueSegment == null) {
            return this.thembW / 2;
        }
        return 0;
    }

    private int getXtop() {
        int i8 = this.thembH;
        int i9 = this.barHeight;
        int i10 = i8 - i9 > 0 ? (i8 - i9) / 2 : 0;
        int i11 = this.sliderType;
        if ((i11 == 1 || i11 == 2) && this.isShowThumb) {
            return i10;
        }
        return 0;
    }

    private void init(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.SegmentedBarView, 0, 0);
        try {
            Resources resources = getResources();
            this.sliderImage = obtainStyledAttributes.getResourceId(26, -1);
            this.sliderType = obtainStyledAttributes.getInt(27, 0);
            this.descriptionAlign = obtainStyledAttributes.getInt(3, 0);
            this.descriptionTopAlign = obtainStyledAttributes.getInt(4, 0);
            this.segmentTextSize = obtainStyledAttributes.getDimensionPixelSize(19, resources.getDimensionPixelSize(R.dimen.sbv_segment_text_size));
            this.valueTextSize = obtainStyledAttributes.getDimensionPixelSize(37, resources.getDimensionPixelSize(R.dimen.sbv_value_text_size));
            this.descriptionTextSize = obtainStyledAttributes.getDimensionPixelSize(9, resources.getDimensionPixelSize(R.dimen.sbv_description_text_size));
            this.barHeight = obtainStyledAttributes.getDimensionPixelSize(2, resources.getDimensionPixelSize(R.dimen.sbv_bar_height));
            this.valueSignHeight = obtainStyledAttributes.getDimensionPixelSize(34, resources.getDimensionPixelSize(R.dimen.sbv_value_sign_height));
            this.valueSignWidth = obtainStyledAttributes.getDimensionPixelSize(36, resources.getDimensionPixelSize(R.dimen.sbv_value_sign_width));
            this.arrowHeight = obtainStyledAttributes.getDimensionPixelSize(0, resources.getDimensionPixelSize(R.dimen.sbv_arrow_height));
            this.arrowWidth = obtainStyledAttributes.getDimensionPixelSize(1, resources.getDimensionPixelSize(R.dimen.sbv_arrow_width));
            this.valueSignRound = obtainStyledAttributes.getDimensionPixelSize(35, resources.getDimensionPixelSize(R.dimen.sbv_value_sign_round));
            this.descriptionBoxHeight = obtainStyledAttributes.getDimensionPixelSize(5, resources.getDimensionPixelSize(R.dimen.sbv_description_box_height));
            this.descriptionBoxTopHeight = obtainStyledAttributes.getDimensionPixelSize(6, resources.getDimensionPixelSize(R.dimen.sbv_description_box_height));
            this.valueSignBorderSize = obtainStyledAttributes.getDimensionPixelSize(33, resources.getDimensionPixelSize(R.dimen.sbv_value_sign_border_size));
            this.barRoundingRadius = obtainStyledAttributes.getDimensionPixelSize(12, resources.getDimensionPixelSize(R.dimen.sbv_value_sign_border_size));
            this.thembH = obtainStyledAttributes.getDimensionPixelSize(28, (int) (this.barHeight * 1.3f));
            this.thembW = obtainStyledAttributes.getDimensionPixelSize(29, (int) (this.barHeight * 1.3f));
            this.showSegmentText = obtainStyledAttributes.getBoolean(22, true);
            this.textDecimal = obtainStyledAttributes.getInt(18, 0);
            this.showDescriptionText = obtainStyledAttributes.getBoolean(20, false);
            this.showDescriptionTopText = obtainStyledAttributes.getBoolean(21, false);
            String string = obtainStyledAttributes.getString(30);
            this.valueSegmentText = string;
            if (string == null) {
                this.valueSegmentText = "Empty";
            }
            String string2 = obtainStyledAttributes.getString(11);
            this.emptySegmentText = string2;
            if (string2 == null) {
                this.emptySegmentText = "Current Value";
            }
            this.isDrawSegmentBg = obtainStyledAttributes.getBoolean(13, false);
            this.show_sign_boder = obtainStyledAttributes.getBoolean(23, false);
            int color = obtainStyledAttributes.getColor(17, context.getResources().getColor(R.color.sbv_segment_bg_startcolor));
            this.value_sign_border_color = obtainStyledAttributes.getColor(32, context.getResources().getColor(R.color.sbv_value_sign_boder_color));
            this.descriptionTextColor = obtainStyledAttributes.getColor(8, this.descriptionTextColor);
            this.descriptionHighlightTextColor = obtainStyledAttributes.getColor(7, -1);
            this.segmentBgColors[0] = color;
            this.segmentBgColors[1] = obtainStyledAttributes.getColor(14, context.getResources().getColor(R.color.sbv_segment_bg_endcolor));
            this.valueSignColor = obtainStyledAttributes.getColor(31, context.getResources().getColor(R.color.sbv_value_sign_background));
            this.emptySegmentColor = obtainStyledAttributes.getColor(10, context.getResources().getColor(R.color.sbv_empty_segment_background));
            this.sideStyle = obtainStyledAttributes.getInt(24, 1);
            this.sideTextStyle = obtainStyledAttributes.getInt(25, 0);
            this.sideRule = obtainStyledAttributes.getInt(16, 1);
            obtainStyledAttributes.recycle();
            if (this.sliderImage != -1 || this.sliderType == 2) {
                this.isShowThumb = true;
            }
            if (this.isShowThumb && this.sliderType == 1) {
                Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), this.sliderImage);
                this.mBitmap = decodeResource;
                this.thembH = decodeResource.getWidth();
                this.thembW = this.mBitmap.getHeight();
            }
            this.formatter = n.getDecimalFormat("##.####");
            TextPaint textPaint = new TextPaint(1);
            this.segmentTextPaint = textPaint;
            textPaint.setColor(-1);
            Paint paint = this.segmentTextPaint;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            TextPaint textPaint2 = new TextPaint(1);
            this.valueTextPaint = textPaint2;
            textPaint2.setColor(-1);
            this.valueTextPaint.setStyle(style);
            this.valueTextPaint.setTextSize(this.valueTextSize);
            this.valueTextPaint.setColor(this.valueTextColor);
            TextPaint textPaint3 = new TextPaint(1);
            this.descriptionTextPaint = textPaint3;
            textPaint3.setColor(-12303292);
            this.descriptionTextPaint.setStyle(style);
            Paint paint2 = new Paint(1);
            this.fillPaint = paint2;
            paint2.setStyle(style);
            this.fillPaint.setAntiAlias(true);
            Paint paint3 = new Paint(1);
            this.signborderPaint = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            this.signborderPaint.setStrokeWidth(this.valueSignBorderSize);
            this.signborderPaint.setColor(this.value_sign_border_color);
            this.signborderPaint.setAntiAlias(true);
            Paint paint4 = new Paint(1);
            this.emptyPaint = paint4;
            paint4.setStyle(style);
            Paint paint5 = new Paint(1);
            this.grapPaint = paint5;
            paint5.setStyle(style);
            this.rectBounds = new Rect();
            this.roundRectangleBounds = new RectF();
            this.valueSignBounds = new Rect();
            this.segmentRect = new Rect();
            Path path = new Path();
            this.trianglePath = path;
            path.setFillType(Path.FillType.EVEN_ODD);
            this.triangleboderPath = new Path();
            this.point1 = new Point();
            this.point2 = new Point();
            this.point3 = new Point();
            int i8 = this.sliderType;
            if (i8 == 1 || i8 == 2) {
                this.arrowHeight = 0;
                this.valueSignHeight = 0;
            }
            if (this.showDescriptionTopText) {
                return;
            }
            this.descriptionBoxTopHeight = 0;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private boolean valueIsEmpty() {
        return this.value == null && this.valueSegment == null;
    }

    private int valueSignSpaceHeight() {
        if (valueIsEmpty()) {
            return 0;
        }
        return this.valueSignHeight;
    }

    protected void drawCustomThumb(Canvas canvas, int i8, int i9, float f8, float f9, int i10, Paint paint) {
        setLayerType(1, null);
        paint.setColor(i10);
        int max = Math.max(i9, i8) / 2;
        paint.setMaskFilter(new BlurMaskFilter(5.0f, BlurMaskFilter.Blur.SOLID));
        canvas.drawCircle(f8, f9, max, paint);
        paint.setMaskFilter(null);
    }

    public int getCurrentBarColor() {
        return this.currentBarColor;
    }

    public Integer getValueSegment() {
        return this.valueSegment;
    }

    public String getValueSegmentText() {
        return this.valueSegmentText;
    }

    public boolean isShowValueText() {
        return this.showValueText;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.valueSignCenter = -1.0f;
        if (this.isDrawSegmentBg) {
            drawBgSegment(canvas);
        }
        List<com.crrepa.band.my.health.widgets.segmentedbar.a> list = this.segments;
        int size = list == null ? 0 : list.size();
        if (size > 0) {
            List<com.crrepa.band.my.health.widgets.segmentedbar.a> list2 = this.segments;
            float maxValue = list2.get(list2.size() - 1).getMaxValue();
            float minValue = this.segments.get(0).getMinValue();
            float f8 = maxValue - minValue;
            for (int i8 = 0; i8 < size; i8++) {
                drawSegment(canvas, this.segments.get(i8), i8, size, f8, minValue);
            }
        } else {
            drawEmptySegment(canvas);
        }
        if (valueIsEmpty()) {
            return;
        }
        int i9 = this.sliderType;
        if (i9 == 0) {
            drawValueSign(canvas, valueSignSpaceHeight(), (int) this.valueSignCenter);
            return;
        }
        if (i9 != 1) {
            if (i9 != 2) {
                return;
            }
            drawCustomThumb(canvas, this.thembW, this.thembH, this.valueSignCenter, (this.rectBounds.top - getXtop()) + (this.thembH / 2), this.currentBarColor, this.fillPaint);
        } else {
            if (!this.isShowThumb) {
                throw new RuntimeException("plase add sbv_sliderImg!!!!!");
            }
            drawSliderImg(canvas, this.mBitmap, this.thembW, this.thembH, this.valueSignCenter, (this.rectBounds.top - getXtop()) + (this.thembH / 2), this.fillPaint);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i10 = this.barHeight;
        int i11 = this.sliderType;
        if (i11 == 2 || i11 == 1) {
            i10 = Math.max(i10, this.thembH);
        }
        int paddingBottom = i10 + getPaddingBottom() + getPaddingTop();
        if (!valueIsEmpty()) {
            paddingBottom += this.valueSignHeight + this.arrowHeight;
        }
        if (this.showDescriptionText) {
            paddingBottom += this.descriptionBoxHeight;
        }
        if (this.showDescriptionTopText) {
            paddingBottom += this.descriptionBoxTopHeight;
        }
        setMeasuredDimension(View.resolveSizeAndState(paddingLeft, i8, 0), View.resolveSizeAndState(paddingBottom, i9, 0));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setBarHeight(int i8) {
        this.barHeight = i8;
        invalidate();
        requestLayout();
    }

    public void setDescriptionBoxHeight(int i8) {
        this.descriptionBoxHeight = i8;
        invalidate();
        requestLayout();
    }

    public void setDescriptionTextColor(int i8) {
        this.descriptionTextColor = i8;
        invalidate();
        requestLayout();
    }

    public void setDescriptionTextSize(int i8) {
        this.descriptionTextSize = i8;
        invalidate();
        requestLayout();
    }

    public void setDrawSegmentBg(boolean z7) {
        this.isDrawSegmentBg = z7;
        invalidate();
        requestLayout();
    }

    public void setEmptySegmentColor(int i8) {
        this.emptySegmentColor = i8;
        invalidate();
        requestLayout();
    }

    public void setGradientBgSegmentColor(int i8, int i9) {
        int[] iArr = this.segmentBgColors;
        iArr[0] = i8;
        iArr[1] = i9;
        invalidate();
        requestLayout();
    }

    public void setSegmentBarValueFormatter(n3.a aVar) {
    }

    public void setSegmentSideRule(int i8) {
        this.sideRule = i8;
        invalidate();
        requestLayout();
    }

    public void setSegmentTextColor(int i8) {
        this.segmentTextColor = i8;
        invalidate();
        requestLayout();
    }

    public void setSegmentTextSize(int i8) {
        this.segmentTextSize = i8;
        invalidate();
        requestLayout();
    }

    public void setSegments(List<com.crrepa.band.my.health.widgets.segmentedbar.a> list) {
        this.segments = list;
        invalidate();
        requestLayout();
    }

    public void setShowDescriptionText(boolean z7) {
        this.showDescriptionText = z7;
        invalidate();
        requestLayout();
    }

    public void setShowSegmentText(boolean z7) {
        this.showSegmentText = z7;
        invalidate();
        requestLayout();
    }

    public void setShowValueText(boolean z7) {
        this.showValueText = z7;
    }

    public void setSideStyle(int i8) {
        this.sideStyle = i8;
        invalidate();
        requestLayout();
    }

    public void setSideTextStyle(int i8) {
        this.sideTextStyle = i8;
        invalidate();
        requestLayout();
    }

    public void setUnit(String str) {
        this.unit = str;
        createValueTextLayout();
        invalidate();
        requestLayout();
    }

    public void setValue(Float f8) {
        this.value = f8;
        createValueTextLayout();
        invalidate();
        requestLayout();
    }

    public void setValueSegment(Integer num) {
        this.sideRule = 1;
        this.valueSegment = num;
        invalidate();
        requestLayout();
    }

    public void setValueSegmentText(String str) {
        this.valueSegmentText = str;
        createValueTextLayout();
        invalidate();
        requestLayout();
    }

    public void setValueSignColor(int i8) {
        this.valueSignColor = i8;
        invalidate();
        requestLayout();
    }

    public void setValueSignSize(int i8, int i9) {
        this.valueSignWidth = i8;
        this.valueSignHeight = i9;
        if (!valueIsEmpty()) {
            createValueTextLayout();
        }
        invalidate();
        requestLayout();
    }

    public void setValueTextColor(int i8) {
        this.valueTextColor = i8;
        this.valueTextPaint.setColor(i8);
        invalidate();
        requestLayout();
    }

    public void setValueTextSize(int i8) {
        this.valueTextSize = i8;
        this.valueTextPaint.setTextSize(i8);
        invalidate();
        requestLayout();
    }

    public void setValueWithUnit(Float f8, String str) {
        this.value = f8;
        this.unit = str;
        if (!valueIsEmpty()) {
            createValueTextLayout();
        }
        invalidate();
        requestLayout();
    }

    public SegmentedBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.segmentBgColors = new int[]{SupportMenu.CATEGORY_MASK, -16776961};
        this.valueSignCenter = -1.0f;
        this.barRoundingRadius = 0;
        this.sideStyle = 1;
        this.sideTextStyle = 0;
        this.segmentTextColor = -1;
        this.valueTextColor = -1;
        this.descriptionTextColor = -12303292;
        this.isDrawSegmentBg = false;
        this.segmentRights = new ArrayList();
        this.showValueText = false;
        init(context, attributeSet);
    }

    public void setValue(float f8, String str) {
        this.valueText = str;
        this.value = Float.valueOf(f8);
        createValueTextLayout();
        invalidate();
        requestLayout();
    }
}
