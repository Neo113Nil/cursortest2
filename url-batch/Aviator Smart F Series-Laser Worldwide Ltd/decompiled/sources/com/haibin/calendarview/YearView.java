package com.haibin.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class YearView extends View {
    protected Paint mCurDayLunarTextPaint;
    protected Paint mCurDayTextPaint;
    protected Paint mCurMonthLunarTextPaint;
    protected Paint mCurMonthTextPaint;
    c mDelegate;
    protected int mItemHeight;
    protected int mItemWidth;
    List<Calendar> mItems;
    protected int mLineCount;
    protected int mMonth;
    protected float mMonthTextBaseLine;
    protected Paint mMonthTextPaint;
    protected int mNextDiff;
    protected Paint mOtherMonthLunarTextPaint;
    protected Paint mOtherMonthTextPaint;
    protected Paint mSchemeLunarTextPaint;
    protected Paint mSchemePaint;
    protected Paint mSchemeTextPaint;
    protected Paint mSelectTextPaint;
    protected Paint mSelectedLunarTextPaint;
    protected Paint mSelectedPaint;
    protected float mTextBaseLine;
    protected int mWeekStart;
    protected float mWeekTextBaseLine;
    protected Paint mWeekTextPaint;
    protected int mYear;

    public YearView(Context context) {
        this(context, null);
    }

    private void addSchemesFromMap() {
        Map<String, Calendar> map = this.mDelegate.mSchemeDatesMap;
        if (map == null || map.size() == 0) {
            return;
        }
        for (Calendar calendar : this.mItems) {
            if (this.mDelegate.mSchemeDatesMap.containsKey(calendar.toString())) {
                Calendar calendar2 = this.mDelegate.mSchemeDatesMap.get(calendar.toString());
                if (calendar2 != null) {
                    calendar.setScheme(TextUtils.isEmpty(calendar2.getScheme()) ? this.mDelegate.getSchemeText() : calendar2.getScheme());
                    calendar.setSchemeColor(calendar2.getSchemeColor());
                    calendar.setSchemes(calendar2.getSchemes());
                }
            } else {
                calendar.setScheme("");
                calendar.setSchemeColor(0);
                calendar.setSchemes(null);
            }
        }
    }

    private void draw(Canvas canvas, Calendar calendar, int i8, int i9, int i10) {
        int yearViewMonthPaddingLeft = (i9 * this.mItemWidth) + this.mDelegate.getYearViewMonthPaddingLeft();
        int monthViewTop = (i8 * this.mItemHeight) + getMonthViewTop();
        boolean equals = calendar.equals(this.mDelegate.mSelectedCalendar);
        boolean hasScheme = calendar.hasScheme();
        if (hasScheme) {
            if ((equals && onDrawSelected(canvas, calendar, yearViewMonthPaddingLeft, monthViewTop, true)) || !equals) {
                this.mSchemePaint.setColor(calendar.getSchemeColor() != 0 ? calendar.getSchemeColor() : this.mDelegate.getSchemeThemeColor());
                onDrawScheme(canvas, calendar, yearViewMonthPaddingLeft, monthViewTop);
            }
        } else if (equals) {
            onDrawSelected(canvas, calendar, yearViewMonthPaddingLeft, monthViewTop, false);
        }
        onDrawText(canvas, calendar, yearViewMonthPaddingLeft, monthViewTop, hasScheme, equals);
    }

    private int getMonthViewTop() {
        return this.mDelegate.getYearViewMonthPaddingTop() + this.mDelegate.getYearViewMonthHeight() + this.mDelegate.getYearViewMonthPaddingBottom() + this.mDelegate.getYearViewWeekHeight();
    }

    private void initPaint() {
        this.mCurMonthTextPaint.setAntiAlias(true);
        Paint paint = this.mCurMonthTextPaint;
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        this.mCurMonthTextPaint.setColor(-15658735);
        this.mCurMonthTextPaint.setFakeBoldText(true);
        this.mOtherMonthTextPaint.setAntiAlias(true);
        this.mOtherMonthTextPaint.setTextAlign(align);
        this.mOtherMonthTextPaint.setColor(-1973791);
        this.mOtherMonthTextPaint.setFakeBoldText(true);
        this.mCurMonthLunarTextPaint.setAntiAlias(true);
        this.mCurMonthLunarTextPaint.setTextAlign(align);
        this.mSelectedLunarTextPaint.setAntiAlias(true);
        this.mSelectedLunarTextPaint.setTextAlign(align);
        this.mOtherMonthLunarTextPaint.setAntiAlias(true);
        this.mOtherMonthLunarTextPaint.setTextAlign(align);
        this.mMonthTextPaint.setAntiAlias(true);
        this.mMonthTextPaint.setFakeBoldText(true);
        this.mWeekTextPaint.setAntiAlias(true);
        this.mWeekTextPaint.setFakeBoldText(true);
        this.mWeekTextPaint.setTextAlign(align);
        this.mSchemeLunarTextPaint.setAntiAlias(true);
        this.mSchemeLunarTextPaint.setTextAlign(align);
        this.mSchemeTextPaint.setAntiAlias(true);
        Paint paint2 = this.mSchemeTextPaint;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.mSchemeTextPaint.setTextAlign(align);
        this.mSchemeTextPaint.setColor(-1223853);
        this.mSchemeTextPaint.setFakeBoldText(true);
        this.mSelectTextPaint.setAntiAlias(true);
        this.mSelectTextPaint.setStyle(style);
        this.mSelectTextPaint.setTextAlign(align);
        this.mSelectTextPaint.setColor(-1223853);
        this.mSelectTextPaint.setFakeBoldText(true);
        this.mSchemePaint.setAntiAlias(true);
        this.mSchemePaint.setStyle(style);
        this.mSchemePaint.setStrokeWidth(2.0f);
        this.mSchemePaint.setColor(-1052689);
        this.mCurDayTextPaint.setAntiAlias(true);
        this.mCurDayTextPaint.setTextAlign(align);
        this.mCurDayTextPaint.setColor(SupportMenu.CATEGORY_MASK);
        this.mCurDayTextPaint.setFakeBoldText(true);
        this.mCurDayLunarTextPaint.setAntiAlias(true);
        this.mCurDayLunarTextPaint.setTextAlign(align);
        this.mCurDayLunarTextPaint.setColor(SupportMenu.CATEGORY_MASK);
        this.mCurDayLunarTextPaint.setFakeBoldText(true);
        this.mSelectedPaint.setAntiAlias(true);
        this.mSelectedPaint.setStyle(style);
        this.mSelectedPaint.setStrokeWidth(2.0f);
    }

    private void onDrawMonth(Canvas canvas) {
        onDrawMonth(canvas, this.mYear, this.mMonth, this.mDelegate.getYearViewMonthPaddingLeft(), this.mDelegate.getYearViewMonthPaddingTop(), getWidth() - (this.mDelegate.getYearViewMonthPaddingRight() * 2), this.mDelegate.getYearViewMonthHeight() + this.mDelegate.getYearViewMonthPaddingTop());
    }

    private void onDrawMonthView(Canvas canvas) {
        int i8 = 0;
        int i9 = 0;
        while (i9 < this.mLineCount) {
            int i10 = i8;
            for (int i11 = 0; i11 < 7; i11++) {
                Calendar calendar = this.mItems.get(i10);
                if (i10 > this.mItems.size() - this.mNextDiff) {
                    return;
                }
                if (calendar.isCurrentMonth()) {
                    draw(canvas, calendar, i9, i11, i10);
                }
                i10++;
            }
            i9++;
            i8 = i10;
        }
    }

    private void onDrawWeek(Canvas canvas) {
        if (this.mDelegate.getYearViewWeekHeight() <= 0) {
            return;
        }
        int weekStart = this.mDelegate.getWeekStart();
        if (weekStart > 0) {
            weekStart--;
        }
        int width = ((getWidth() - this.mDelegate.getYearViewMonthPaddingLeft()) - this.mDelegate.getYearViewMonthPaddingRight()) / 7;
        for (int i8 = 0; i8 < 7; i8++) {
            onDrawWeek(canvas, weekStart, this.mDelegate.getYearViewMonthPaddingLeft() + (i8 * width), this.mDelegate.getYearViewMonthHeight() + this.mDelegate.getYearViewMonthPaddingTop() + this.mDelegate.getYearViewMonthPaddingBottom(), width, this.mDelegate.getYearViewWeekHeight());
            weekStart++;
            if (weekStart >= 7) {
                weekStart = 0;
            }
        }
    }

    final void init(int i8, int i9) {
        this.mYear = i8;
        this.mMonth = i9;
        this.mNextDiff = b.getMonthEndDiff(i8, i9, this.mDelegate.getWeekStart());
        b.getMonthViewStartDiff(this.mYear, this.mMonth, this.mDelegate.getWeekStart());
        this.mItems = b.initCalendarForMonthView(this.mYear, this.mMonth, this.mDelegate.getCurrentDay(), this.mDelegate.getWeekStart());
        this.mLineCount = 6;
        addSchemesFromMap();
    }

    final void measureSize(int i8, int i9) {
        Rect rect = new Rect();
        this.mCurMonthTextPaint.getTextBounds("1", 0, 1, rect);
        int height = (rect.height() * 12) + getMonthViewTop();
        if (i9 < height) {
            i9 = height;
        }
        getLayoutParams().width = i8;
        getLayoutParams().height = i9;
        this.mItemHeight = (i9 - getMonthViewTop()) / 6;
        Paint.FontMetrics fontMetrics = this.mCurMonthTextPaint.getFontMetrics();
        this.mTextBaseLine = ((this.mItemHeight / 2) - fontMetrics.descent) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f);
        Paint.FontMetrics fontMetrics2 = this.mMonthTextPaint.getFontMetrics();
        this.mMonthTextBaseLine = ((this.mDelegate.getYearViewMonthHeight() / 2) - fontMetrics2.descent) + ((fontMetrics2.bottom - fontMetrics2.top) / 2.0f);
        Paint.FontMetrics fontMetrics3 = this.mWeekTextPaint.getFontMetrics();
        this.mWeekTextBaseLine = ((this.mDelegate.getYearViewWeekHeight() / 2) - fontMetrics3.descent) + ((fontMetrics3.bottom - fontMetrics3.top) / 2.0f);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        this.mItemWidth = ((getWidth() - this.mDelegate.getYearViewMonthPaddingLeft()) - this.mDelegate.getYearViewMonthPaddingRight()) / 7;
        onPreviewHook();
        onDrawMonth(canvas);
        onDrawWeek(canvas);
        onDrawMonthView(canvas);
    }

    protected abstract void onDrawMonth(Canvas canvas, int i8, int i9, int i10, int i11, int i12, int i13);

    protected abstract void onDrawScheme(Canvas canvas, Calendar calendar, int i8, int i9);

    protected abstract boolean onDrawSelected(Canvas canvas, Calendar calendar, int i8, int i9, boolean z7);

    protected abstract void onDrawText(Canvas canvas, Calendar calendar, int i8, int i9, boolean z7, boolean z8);

    protected abstract void onDrawWeek(Canvas canvas, int i8, int i9, int i10, int i11, int i12);

    protected void onPreviewHook() {
    }

    final void setup(c cVar) {
        this.mDelegate = cVar;
        updateStyle();
    }

    final void updateStyle() {
        if (this.mDelegate == null) {
            return;
        }
        this.mCurMonthTextPaint.setTextSize(r0.getYearViewDayTextSize());
        this.mSchemeTextPaint.setTextSize(this.mDelegate.getYearViewDayTextSize());
        this.mOtherMonthTextPaint.setTextSize(this.mDelegate.getYearViewDayTextSize());
        this.mCurDayTextPaint.setTextSize(this.mDelegate.getYearViewDayTextSize());
        this.mSelectTextPaint.setTextSize(this.mDelegate.getYearViewDayTextSize());
        this.mSchemeTextPaint.setColor(this.mDelegate.getYearViewSchemeTextColor());
        this.mCurMonthTextPaint.setColor(this.mDelegate.getYearViewDayTextColor());
        this.mOtherMonthTextPaint.setColor(this.mDelegate.getYearViewDayTextColor());
        this.mCurDayTextPaint.setColor(this.mDelegate.getYearViewCurDayTextColor());
        this.mSelectTextPaint.setColor(this.mDelegate.getYearViewSelectTextColor());
        this.mMonthTextPaint.setTextSize(this.mDelegate.getYearViewMonthTextSize());
        this.mMonthTextPaint.setColor(this.mDelegate.getYearViewMonthTextColor());
        this.mWeekTextPaint.setColor(this.mDelegate.getYearViewWeekTextColor());
        this.mWeekTextPaint.setTextSize(this.mDelegate.getYearViewWeekTextSize());
    }

    public YearView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCurMonthTextPaint = new Paint();
        this.mOtherMonthTextPaint = new Paint();
        this.mCurMonthLunarTextPaint = new Paint();
        this.mSelectedLunarTextPaint = new Paint();
        this.mOtherMonthLunarTextPaint = new Paint();
        this.mSchemeLunarTextPaint = new Paint();
        this.mSchemePaint = new Paint();
        this.mSelectedPaint = new Paint();
        this.mSchemeTextPaint = new Paint();
        this.mSelectTextPaint = new Paint();
        this.mCurDayTextPaint = new Paint();
        this.mCurDayLunarTextPaint = new Paint();
        this.mMonthTextPaint = new Paint();
        this.mWeekTextPaint = new Paint();
        initPaint();
    }
}
