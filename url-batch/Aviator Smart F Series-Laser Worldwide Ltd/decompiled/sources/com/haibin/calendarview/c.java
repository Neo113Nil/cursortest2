package com.haibin.calendarview;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import com.haibin.calendarview.CalendarView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
final class c {
    static final int FIRST_DAY_OF_MONTH = 0;
    static final int LAST_MONTH_VIEW_SELECT_DAY = 1;
    static final int LAST_MONTH_VIEW_SELECT_DAY_IGNORE_CURRENT = 2;
    private static final int MAX_YEAR = 2099;
    static final int MIN_YEAR = 1900;
    static final int MODE_ALL_MONTH = 0;
    static final int MODE_FIT_MONTH = 2;
    static final int MODE_ONLY_CURRENT_MONTH = 1;
    static final int SELECT_MODE_DEFAULT = 0;
    static final int SELECT_MODE_MULTI = 3;
    static final int SELECT_MODE_RANGE = 2;
    static final int SELECT_MODE_SINGLE = 1;
    static final int WEEK_START_WITH_MON = 2;
    static final int WEEK_START_WITH_SAT = 7;
    static final int WEEK_START_WITH_SUN = 1;
    private boolean isFullScreenCalendar;
    boolean isShowYearSelectedLayout;
    CalendarView.h mCalendarInterceptListener;
    private int mCalendarItemHeight;
    CalendarView.i mCalendarLongClickListener;
    CalendarView.j mCalendarMultiSelectListener;
    private int mCalendarPadding;
    private int mCalendarPaddingLeft;
    private int mCalendarPaddingRight;
    CalendarView.k mCalendarRangeSelectListener;
    CalendarView.l mCalendarSelectListener;
    CalendarView.m mClickCalendarPaddingListener;
    private int mCurDayLunarTextColor;
    private int mCurDayTextColor;
    private int mCurMonthLunarTextColor;
    private Calendar mCurrentDate;
    private int mCurrentMonthTextColor;
    int mCurrentMonthViewItem;
    private int mDayTextSize;
    private int mDefaultCalendarSelectDay;
    Calendar mIndexCalendar;
    CalendarView.n mInnerListener;
    private int mLunarTextSize;
    private int mMaxMultiSelectSize;
    private int mMaxSelectRange;
    private int mMaxYear;
    private int mMaxYearDay;
    private int mMaxYearMonth;
    private int mMinSelectRange;
    private int mMinYear;
    private int mMinYearDay;
    private int mMinYearMonth;
    CalendarView.o mMonthChangeListener;
    private Class<?> mMonthViewClass;
    private String mMonthViewClassPath;
    private boolean mMonthViewScrollable;
    private int mMonthViewShowMode;
    private int mOtherMonthLunarTextColor;
    private int mOtherMonthTextColor;
    Map<String, Calendar> mSchemeDatesMap;
    private int mSchemeLunarTextColor;
    private String mSchemeText;
    private int mSchemeTextColor;
    private int mSchemeThemeColor;
    private int mSelectMode;
    Calendar mSelectedCalendar;
    Map<String, Calendar> mSelectedCalendars = new HashMap();
    Calendar mSelectedEndRangeCalendar;
    private int mSelectedLunarTextColor;
    Calendar mSelectedStartRangeCalendar;
    private int mSelectedTextColor;
    private int mSelectedThemeColor;
    CalendarView.p mViewChangeListener;
    private int mWeekBackground;
    private Class<?> mWeekBarClass;
    private String mWeekBarClassPath;
    private int mWeekBarHeight;
    CalendarView.q mWeekChangeListener;
    private int mWeekLineBackground;
    private int mWeekLineMargin;
    private int mWeekStart;
    private int mWeekTextColor;
    private int mWeekTextSize;
    private Class<?> mWeekViewClass;
    private String mWeekViewClassPath;
    private boolean mWeekViewScrollable;
    CalendarView.r mYearChangeListener;
    private int mYearViewBackground;
    CalendarView.s mYearViewChangeListener;
    private Class<?> mYearViewClass;
    private String mYearViewClassPath;
    private int mYearViewCurDayTextColor;
    private int mYearViewDayTextColor;
    private int mYearViewDayTextSize;
    private int mYearViewMonthHeight;
    private int mYearViewMonthPaddingBottom;
    private int mYearViewMonthPaddingLeft;
    private int mYearViewMonthPaddingRight;
    private int mYearViewMonthPaddingTop;
    private int mYearViewMonthTextColor;
    private int mYearViewMonthTextSize;
    private int mYearViewPadding;
    private int mYearViewPaddingLeft;
    private int mYearViewPaddingRight;
    private int mYearViewSchemeTextColor;
    private boolean mYearViewScrollable;
    private int mYearViewSelectTextColor;
    private int mYearViewWeekHeight;
    private int mYearViewWeekTextColor;
    private int mYearViewWeekTextSize;
    private boolean preventLongPressedSelected;

    c(Context context, @Nullable AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CalendarView);
        d.init(context);
        this.mCalendarPadding = (int) obtainStyledAttributes.getDimension(R$styleable.CalendarView_calendar_padding, 0.0f);
        this.mCalendarPaddingLeft = (int) obtainStyledAttributes.getDimension(R$styleable.CalendarView_calendar_padding_left, 0.0f);
        this.mCalendarPaddingRight = (int) obtainStyledAttributes.getDimension(R$styleable.CalendarView_calendar_padding_right, 0.0f);
        int i8 = this.mCalendarPadding;
        if (i8 != 0) {
            this.mCalendarPaddingLeft = i8;
            this.mCalendarPaddingRight = i8;
        }
        this.mSchemeTextColor = obtainStyledAttributes.getColor(R$styleable.CalendarView_scheme_text_color, -1);
        this.mSchemeLunarTextColor = obtainStyledAttributes.getColor(R$styleable.CalendarView_scheme_lunar_text_color, -1973791);
        this.mSchemeThemeColor = obtainStyledAttributes.getColor(R$styleable.CalendarView_scheme_theme_color, 1355796431);
        this.mMonthViewClassPath = obtainStyledAttributes.getString(R$styleable.CalendarView_month_view);
        this.mYearViewClassPath = obtainStyledAttributes.getString(R$styleable.CalendarView_year_view);
        this.mWeekViewClassPath = obtainStyledAttributes.getString(R$styleable.CalendarView_week_view);
        this.mWeekBarClassPath = obtainStyledAttributes.getString(R$styleable.CalendarView_week_bar_view);
        this.mWeekTextSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CalendarView_week_text_size, b.dipToPx(context, 12.0f));
        this.mWeekBarHeight = (int) obtainStyledAttributes.getDimension(R$styleable.CalendarView_week_bar_height, b.dipToPx(context, 40.0f));
        this.mWeekLineMargin = (int) obtainStyledAttributes.getDimension(R$styleable.CalendarView_week_line_margin, b.dipToPx(context, 0.0f));
        String string = obtainStyledAttributes.getString(R$styleable.CalendarView_scheme_text);
        this.mSchemeText = string;
        if (TextUtils.isEmpty(string)) {
            this.mSchemeText = "记";
        }
        this.mMonthViewScrollable = obtainStyledAttributes.getBoolean(R$styleable.CalendarView_month_view_scrollable, true);
        this.mWeekViewScrollable = obtainStyledAttributes.getBoolean(R$styleable.CalendarView_week_view_scrollable, true);
        this.mYearViewScrollable = obtainStyledAttributes.getBoolean(R$styleable.CalendarView_year_view_scrollable, true);
        this.mDefaultCalendarSelectDay = obtainStyledAttributes.getInt(R$styleable.CalendarView_month_view_auto_select_day, 0);
        this.mMonthViewShowMode = obtainStyledAttributes.getInt(R$styleable.CalendarView_month_view_show_mode, 0);
        this.mWeekStart = obtainStyledAttributes.getInt(R$styleable.CalendarView_week_start_with, 1);
        this.mSelectMode = obtainStyledAttributes.getInt(R$styleable.CalendarView_select_mode, 0);
        this.mMaxMultiSelectSize = obtainStyledAttributes.getInt(R$styleable.CalendarView_max_multi_select_size, Integer.MAX_VALUE);
        this.mMinSelectRange = obtainStyledAttributes.getInt(R$styleable.CalendarView_min_select_range, -1);
        int i9 = obtainStyledAttributes.getInt(R$styleable.CalendarView_max_select_range, -1);
        this.mMaxSelectRange = i9;
        setSelectRange(this.mMinSelectRange, i9);
        this.mWeekBackground = obtainStyledAttributes.getColor(R$styleable.CalendarView_week_background, -1);
        this.mWeekLineBackground = obtainStyledAttributes.getColor(R$styleable.CalendarView_week_line_background, 0);
        this.mYearViewBackground = obtainStyledAttributes.getColor(R$styleable.CalendarView_year_view_background, -1);
        this.mWeekTextColor = obtainStyledAttributes.getColor(R$styleable.CalendarView_week_text_color, -13421773);
        this.mCurDayTextColor = obtainStyledAttributes.getColor(R$styleable.CalendarView_current_day_text_color, SupportMenu.CATEGORY_MASK);
        this.mCurDayLunarTextColor = obtainStyledAttributes.getColor(R$styleable.CalendarView_current_day_lunar_text_color, SupportMenu.CATEGORY_MASK);
        this.mSelectedThemeColor = obtainStyledAttributes.getColor(R$styleable.CalendarView_selected_theme_color, 1355796431);
        this.mSelectedTextColor = obtainStyledAttributes.getColor(R$styleable.CalendarView_selected_text_color, -15658735);
        this.mSelectedLunarTextColor = obtainStyledAttributes.getColor(R$styleable.CalendarView_selected_lunar_text_color, -15658735);
        this.mCurrentMonthTextColor = obtainStyledAttributes.getColor(R$styleable.CalendarView_current_month_text_color, -15658735);
        this.mOtherMonthTextColor = obtainStyledAttributes.getColor(R$styleable.CalendarView_other_month_text_color, -1973791);
        this.mCurMonthLunarTextColor = obtainStyledAttributes.getColor(R$styleable.CalendarView_current_month_lunar_text_color, -1973791);
        this.mOtherMonthLunarTextColor = obtainStyledAttributes.getColor(R$styleable.CalendarView_other_month_lunar_text_color, -1973791);
        this.mMinYear = obtainStyledAttributes.getInt(R$styleable.CalendarView_min_year, 1971);
        this.mMaxYear = obtainStyledAttributes.getInt(R$styleable.CalendarView_max_year, 2055);
        this.mMinYearMonth = obtainStyledAttributes.getInt(R$styleable.CalendarView_min_year_month, 1);
        this.mMaxYearMonth = obtainStyledAttributes.getInt(R$styleable.CalendarView_max_year_month, 12);
        this.mMinYearDay = obtainStyledAttributes.getInt(R$styleable.CalendarView_min_year_day, 1);
        this.mMaxYearDay = obtainStyledAttributes.getInt(R$styleable.CalendarView_max_year_day, -1);
        this.mDayTextSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CalendarView_day_text_size, b.dipToPx(context, 16.0f));
        this.mLunarTextSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CalendarView_lunar_text_size, b.dipToPx(context, 10.0f));
        this.mCalendarItemHeight = (int) obtainStyledAttributes.getDimension(R$styleable.CalendarView_calendar_height, b.dipToPx(context, 56.0f));
        this.isFullScreenCalendar = obtainStyledAttributes.getBoolean(R$styleable.CalendarView_calendar_match_parent, false);
        this.mYearViewMonthTextSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CalendarView_year_view_month_text_size, b.dipToPx(context, 18.0f));
        this.mYearViewDayTextSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CalendarView_year_view_day_text_size, b.dipToPx(context, 7.0f));
        this.mYearViewMonthTextColor = obtainStyledAttributes.getColor(R$styleable.CalendarView_year_view_month_text_color, -15658735);
        this.mYearViewDayTextColor = obtainStyledAttributes.getColor(R$styleable.CalendarView_year_view_day_text_color, -15658735);
        this.mYearViewSchemeTextColor = obtainStyledAttributes.getColor(R$styleable.CalendarView_year_view_scheme_color, this.mSchemeThemeColor);
        this.mYearViewWeekTextColor = obtainStyledAttributes.getColor(R$styleable.CalendarView_year_view_week_text_color, -13421773);
        this.mYearViewCurDayTextColor = obtainStyledAttributes.getColor(R$styleable.CalendarView_year_view_current_day_text_color, this.mCurDayTextColor);
        this.mYearViewSelectTextColor = obtainStyledAttributes.getColor(R$styleable.CalendarView_year_view_select_text_color, -13421773);
        this.mYearViewWeekTextSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CalendarView_year_view_week_text_size, b.dipToPx(context, 8.0f));
        this.mYearViewMonthHeight = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CalendarView_year_view_month_height, b.dipToPx(context, 32.0f));
        this.mYearViewWeekHeight = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CalendarView_year_view_week_height, b.dipToPx(context, 0.0f));
        this.mYearViewPadding = (int) obtainStyledAttributes.getDimension(R$styleable.CalendarView_year_view_padding, b.dipToPx(context, 12.0f));
        this.mYearViewPaddingLeft = (int) obtainStyledAttributes.getDimension(R$styleable.CalendarView_year_view_padding_left, b.dipToPx(context, 12.0f));
        this.mYearViewPaddingRight = (int) obtainStyledAttributes.getDimension(R$styleable.CalendarView_year_view_padding_right, b.dipToPx(context, 12.0f));
        int i10 = this.mYearViewPadding;
        if (i10 != 0) {
            this.mYearViewPaddingLeft = i10;
            this.mYearViewPaddingRight = i10;
        }
        this.mYearViewMonthPaddingTop = (int) obtainStyledAttributes.getDimension(R$styleable.CalendarView_year_view_month_padding_top, b.dipToPx(context, 4.0f));
        this.mYearViewMonthPaddingBottom = (int) obtainStyledAttributes.getDimension(R$styleable.CalendarView_year_view_month_padding_bottom, b.dipToPx(context, 4.0f));
        this.mYearViewMonthPaddingLeft = (int) obtainStyledAttributes.getDimension(R$styleable.CalendarView_year_view_month_padding_left, b.dipToPx(context, 4.0f));
        this.mYearViewMonthPaddingRight = (int) obtainStyledAttributes.getDimension(R$styleable.CalendarView_year_view_month_padding_right, b.dipToPx(context, 4.0f));
        if (this.mMinYear <= 1900) {
            this.mMinYear = 1900;
        }
        if (this.mMaxYear >= MAX_YEAR) {
            this.mMaxYear = MAX_YEAR;
        }
        obtainStyledAttributes.recycle();
        init();
    }

    private void init() {
        Class<?> cls;
        Class<?> cls2;
        this.mCurrentDate = new Calendar();
        Date date = new Date();
        this.mCurrentDate.setYear(b.getDate(cn.hutool.core.date.d.NORM_YEAR_PATTERN, date));
        this.mCurrentDate.setMonth(b.getDate("MM", date));
        this.mCurrentDate.setDay(b.getDate("dd", date));
        this.mCurrentDate.setCurrentDay(true);
        d.setupLunarCalendar(this.mCurrentDate);
        setRange(this.mMinYear, this.mMinYearMonth, this.mMaxYear, this.mMaxYearMonth);
        try {
            if (TextUtils.isEmpty(this.mWeekBarClassPath)) {
                cls2 = WeekBar.class;
                this.mWeekBarClass = cls2;
            } else {
                cls2 = Class.forName(this.mWeekBarClassPath);
            }
            this.mWeekBarClass = cls2;
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        try {
            if (TextUtils.isEmpty(this.mYearViewClassPath)) {
                cls = DefaultYearView.class;
                this.mYearViewClass = cls;
            } else {
                cls = Class.forName(this.mYearViewClassPath);
            }
            this.mYearViewClass = cls;
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        try {
            this.mMonthViewClass = TextUtils.isEmpty(this.mMonthViewClassPath) ? DefaultMonthView.class : Class.forName(this.mMonthViewClassPath);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            this.mWeekViewClass = TextUtils.isEmpty(this.mWeekViewClassPath) ? DefaultWeekView.class : Class.forName(this.mWeekViewClassPath);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    private void setRange(int i8, int i9, int i10, int i11) {
        this.mMinYear = i8;
        this.mMinYearMonth = i9;
        this.mMaxYear = i10;
        this.mMaxYearMonth = i11;
        if (i10 < this.mCurrentDate.getYear()) {
            this.mMaxYear = this.mCurrentDate.getYear();
        }
        if (this.mMaxYearDay == -1) {
            this.mMaxYearDay = b.getMonthDaysCount(this.mMaxYear, this.mMaxYearMonth);
        }
        this.mCurrentMonthViewItem = (((this.mCurrentDate.getYear() - this.mMinYear) * 12) + this.mCurrentDate.getMonth()) - this.mMinYearMonth;
    }

    final void addSchemes(Map<String, Calendar> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        if (this.mSchemeDatesMap == null) {
            this.mSchemeDatesMap = new HashMap();
        }
        for (String str : map.keySet()) {
            this.mSchemeDatesMap.remove(str);
            Calendar calendar = map.get(str);
            if (calendar != null) {
                this.mSchemeDatesMap.put(str, calendar);
            }
        }
    }

    final void addSchemesFromMap(List<Calendar> list) {
        Map<String, Calendar> map = this.mSchemeDatesMap;
        if (map == null || map.size() == 0) {
            return;
        }
        for (Calendar calendar : list) {
            if (this.mSchemeDatesMap.containsKey(calendar.toString())) {
                Calendar calendar2 = this.mSchemeDatesMap.get(calendar.toString());
                if (calendar2 != null) {
                    calendar.setScheme(TextUtils.isEmpty(calendar2.getScheme()) ? getSchemeText() : calendar2.getScheme());
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

    final void clearSelectRange() {
        this.mSelectedStartRangeCalendar = null;
        this.mSelectedEndRangeCalendar = null;
    }

    void clearSelectedScheme() {
        this.mSelectedCalendar.clearScheme();
    }

    Calendar createCurrentDate() {
        Calendar calendar = new Calendar();
        calendar.setYear(this.mCurrentDate.getYear());
        calendar.setWeek(this.mCurrentDate.getWeek());
        calendar.setMonth(this.mCurrentDate.getMonth());
        calendar.setDay(this.mCurrentDate.getDay());
        calendar.setCurrentDay(true);
        d.setupLunarCalendar(calendar);
        return calendar;
    }

    int getCalendarItemHeight() {
        return this.mCalendarItemHeight;
    }

    int getCalendarPadding() {
        return this.mCalendarPadding;
    }

    int getCalendarPaddingLeft() {
        return this.mCalendarPaddingLeft;
    }

    int getCalendarPaddingRight() {
        return this.mCalendarPaddingRight;
    }

    int getCurDayLunarTextColor() {
        return this.mCurDayLunarTextColor;
    }

    int getCurDayTextColor() {
        return this.mCurDayTextColor;
    }

    Calendar getCurrentDay() {
        return this.mCurrentDate;
    }

    int getCurrentMonthLunarTextColor() {
        return this.mCurMonthLunarTextColor;
    }

    int getCurrentMonthTextColor() {
        return this.mCurrentMonthTextColor;
    }

    int getDayTextSize() {
        return this.mDayTextSize;
    }

    int getDefaultCalendarSelectDay() {
        return this.mDefaultCalendarSelectDay;
    }

    int getLunarTextSize() {
        return this.mLunarTextSize;
    }

    int getMaxMultiSelectSize() {
        return this.mMaxMultiSelectSize;
    }

    final Calendar getMaxRangeCalendar() {
        Calendar calendar = new Calendar();
        calendar.setYear(this.mMaxYear);
        calendar.setMonth(this.mMaxYearMonth);
        calendar.setDay(this.mMaxYearDay);
        calendar.setCurrentDay(calendar.equals(this.mCurrentDate));
        d.setupLunarCalendar(calendar);
        return calendar;
    }

    int getMaxSelectRange() {
        return this.mMaxSelectRange;
    }

    int getMaxYear() {
        return this.mMaxYear;
    }

    int getMaxYearDay() {
        return this.mMaxYearDay;
    }

    int getMaxYearMonth() {
        return this.mMaxYearMonth;
    }

    final Calendar getMinRangeCalendar() {
        Calendar calendar = new Calendar();
        calendar.setYear(this.mMinYear);
        calendar.setMonth(this.mMinYearMonth);
        calendar.setDay(this.mMinYearDay);
        calendar.setCurrentDay(calendar.equals(this.mCurrentDate));
        d.setupLunarCalendar(calendar);
        return calendar;
    }

    int getMinSelectRange() {
        return this.mMinSelectRange;
    }

    int getMinYear() {
        return this.mMinYear;
    }

    int getMinYearDay() {
        return this.mMinYearDay;
    }

    int getMinYearMonth() {
        return this.mMinYearMonth;
    }

    Class<?> getMonthViewClass() {
        return this.mMonthViewClass;
    }

    int getMonthViewShowMode() {
        return this.mMonthViewShowMode;
    }

    int getOtherMonthLunarTextColor() {
        return this.mOtherMonthLunarTextColor;
    }

    int getOtherMonthTextColor() {
        return this.mOtherMonthTextColor;
    }

    int getSchemeLunarTextColor() {
        return this.mSchemeLunarTextColor;
    }

    String getSchemeText() {
        return this.mSchemeText;
    }

    int getSchemeTextColor() {
        return this.mSchemeTextColor;
    }

    int getSchemeThemeColor() {
        return this.mSchemeThemeColor;
    }

    final List<Calendar> getSelectCalendarRange() {
        if (this.mSelectMode != 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.mSelectedStartRangeCalendar != null && this.mSelectedEndRangeCalendar != null) {
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.set(this.mSelectedStartRangeCalendar.getYear(), this.mSelectedStartRangeCalendar.getMonth() - 1, this.mSelectedStartRangeCalendar.getDay());
            calendar.set(this.mSelectedEndRangeCalendar.getYear(), this.mSelectedEndRangeCalendar.getMonth() - 1, this.mSelectedEndRangeCalendar.getDay());
            long timeInMillis = calendar.getTimeInMillis();
            for (long timeInMillis2 = calendar.getTimeInMillis(); timeInMillis2 <= timeInMillis; timeInMillis2 += 86400000) {
                calendar.setTimeInMillis(timeInMillis2);
                Calendar calendar2 = new Calendar();
                calendar2.setYear(calendar.get(1));
                calendar2.setMonth(calendar.get(2) + 1);
                calendar2.setDay(calendar.get(5));
                d.setupLunarCalendar(calendar2);
                updateCalendarScheme(calendar2);
                arrayList.add(calendar2);
            }
            addSchemesFromMap(arrayList);
        }
        return arrayList;
    }

    int getSelectMode() {
        return this.mSelectMode;
    }

    int getSelectedLunarTextColor() {
        return this.mSelectedLunarTextColor;
    }

    int getSelectedTextColor() {
        return this.mSelectedTextColor;
    }

    int getSelectedThemeColor() {
        return this.mSelectedThemeColor;
    }

    int getWeekBackground() {
        return this.mWeekBackground;
    }

    Class<?> getWeekBarClass() {
        return this.mWeekBarClass;
    }

    int getWeekBarHeight() {
        return this.mWeekBarHeight;
    }

    int getWeekLineBackground() {
        return this.mWeekLineBackground;
    }

    int getWeekLineMargin() {
        return this.mWeekLineMargin;
    }

    int getWeekStart() {
        return this.mWeekStart;
    }

    int getWeekTextColor() {
        return this.mWeekTextColor;
    }

    int getWeekTextSize() {
        return this.mWeekTextSize;
    }

    Class<?> getWeekViewClass() {
        return this.mWeekViewClass;
    }

    int getYearViewBackground() {
        return this.mYearViewBackground;
    }

    Class<?> getYearViewClass() {
        return this.mYearViewClass;
    }

    String getYearViewClassPath() {
        return this.mYearViewClassPath;
    }

    int getYearViewCurDayTextColor() {
        return this.mYearViewCurDayTextColor;
    }

    int getYearViewDayTextColor() {
        return this.mYearViewDayTextColor;
    }

    int getYearViewDayTextSize() {
        return this.mYearViewDayTextSize;
    }

    int getYearViewMonthHeight() {
        return this.mYearViewMonthHeight;
    }

    int getYearViewMonthPaddingBottom() {
        return this.mYearViewMonthPaddingBottom;
    }

    int getYearViewMonthPaddingLeft() {
        return this.mYearViewMonthPaddingLeft;
    }

    int getYearViewMonthPaddingRight() {
        return this.mYearViewMonthPaddingRight;
    }

    int getYearViewMonthPaddingTop() {
        return this.mYearViewMonthPaddingTop;
    }

    int getYearViewMonthTextColor() {
        return this.mYearViewMonthTextColor;
    }

    int getYearViewMonthTextSize() {
        return this.mYearViewMonthTextSize;
    }

    int getYearViewPadding() {
        return this.mYearViewPadding;
    }

    int getYearViewPaddingLeft() {
        return this.mYearViewPaddingLeft;
    }

    int getYearViewPaddingRight() {
        return this.mYearViewPaddingRight;
    }

    int getYearViewSchemeTextColor() {
        return this.mYearViewSchemeTextColor;
    }

    int getYearViewSelectTextColor() {
        return this.mYearViewSelectTextColor;
    }

    int getYearViewWeekHeight() {
        return this.mYearViewWeekHeight;
    }

    int getYearViewWeekTextColor() {
        return this.mYearViewWeekTextColor;
    }

    int getYearViewWeekTextSize() {
        return this.mYearViewWeekTextSize;
    }

    boolean isFullScreenCalendar() {
        return this.isFullScreenCalendar;
    }

    boolean isMonthViewScrollable() {
        return this.mMonthViewScrollable;
    }

    boolean isPreventLongPressedSelected() {
        return this.preventLongPressedSelected;
    }

    boolean isWeekViewScrollable() {
        return this.mWeekViewScrollable;
    }

    boolean isYearViewScrollable() {
        return this.mYearViewScrollable;
    }

    void setCalendarItemHeight(int i8) {
        this.mCalendarItemHeight = i8;
    }

    void setCalendarPadding(int i8) {
        this.mCalendarPadding = i8;
        this.mCalendarPaddingLeft = i8;
        this.mCalendarPaddingRight = i8;
    }

    void setCalendarPaddingLeft(int i8) {
        this.mCalendarPaddingLeft = i8;
    }

    void setCalendarPaddingRight(int i8) {
        this.mCalendarPaddingRight = i8;
    }

    void setDefaultCalendarSelectDay(int i8) {
        this.mDefaultCalendarSelectDay = i8;
    }

    void setMaxMultiSelectSize(int i8) {
        this.mMaxMultiSelectSize = i8;
    }

    void setMonthViewClass(Class<?> cls) {
        this.mMonthViewClass = cls;
    }

    void setMonthViewScrollable(boolean z7) {
        this.mMonthViewScrollable = z7;
    }

    void setMonthViewShowMode(int i8) {
        this.mMonthViewShowMode = i8;
    }

    void setPreventLongPressedSelected(boolean z7) {
        this.preventLongPressedSelected = z7;
    }

    void setSchemeColor(int i8, int i9, int i10) {
        this.mSchemeThemeColor = i8;
        this.mSchemeTextColor = i9;
        this.mSchemeLunarTextColor = i10;
    }

    void setSelectColor(int i8, int i9, int i10) {
        this.mSelectedThemeColor = i8;
        this.mSelectedTextColor = i9;
        this.mSelectedLunarTextColor = i10;
    }

    void setSelectMode(int i8) {
        this.mSelectMode = i8;
    }

    final void setSelectRange(int i8, int i9) {
        if (i8 > i9 && i9 > 0) {
            this.mMaxSelectRange = i8;
            this.mMinSelectRange = i8;
            return;
        }
        if (i8 <= 0) {
            this.mMinSelectRange = -1;
        } else {
            this.mMinSelectRange = i8;
        }
        if (i9 <= 0) {
            this.mMaxSelectRange = -1;
        } else {
            this.mMaxSelectRange = i9;
        }
    }

    void setTextColor(int i8, int i9, int i10, int i11, int i12) {
        this.mCurDayTextColor = i8;
        this.mOtherMonthTextColor = i10;
        this.mCurrentMonthTextColor = i9;
        this.mCurMonthLunarTextColor = i11;
        this.mOtherMonthLunarTextColor = i12;
    }

    void setThemeColor(int i8, int i9) {
        this.mSelectedThemeColor = i8;
        this.mSchemeThemeColor = i9;
    }

    void setWeekBarClass(Class<?> cls) {
        this.mWeekBarClass = cls;
    }

    void setWeekStart(int i8) {
        this.mWeekStart = i8;
    }

    void setWeekViewClass(Class<?> cls) {
        this.mWeekViewClass = cls;
    }

    void setWeekViewScrollable(boolean z7) {
        this.mWeekViewScrollable = z7;
    }

    void setYearViewScrollable(boolean z7) {
        this.mYearViewScrollable = z7;
    }

    void setYearViewTextColor(int i8, int i9, int i10) {
        this.mYearViewMonthTextColor = i8;
        this.mYearViewDayTextColor = i9;
        this.mYearViewSchemeTextColor = i10;
    }

    final void updateCalendarScheme(Calendar calendar) {
        Map<String, Calendar> map;
        if (calendar == null || (map = this.mSchemeDatesMap) == null || map.size() == 0) {
            return;
        }
        String calendar2 = calendar.toString();
        if (this.mSchemeDatesMap.containsKey(calendar2)) {
            calendar.mergeScheme(this.mSchemeDatesMap.get(calendar2), getSchemeText());
        }
    }

    void updateCurrentDay() {
        Date date = new Date();
        this.mCurrentDate.setYear(b.getDate(cn.hutool.core.date.d.NORM_YEAR_PATTERN, date));
        this.mCurrentDate.setMonth(b.getDate("MM", date));
        this.mCurrentDate.setDay(b.getDate("dd", date));
        d.setupLunarCalendar(this.mCurrentDate);
    }

    final void updateSelectCalendarScheme() {
        Map<String, Calendar> map = this.mSchemeDatesMap;
        if (map == null || map.size() <= 0) {
            clearSelectedScheme();
            return;
        }
        String calendar = this.mSelectedCalendar.toString();
        if (this.mSchemeDatesMap.containsKey(calendar)) {
            this.mSelectedCalendar.mergeScheme(this.mSchemeDatesMap.get(calendar), getSchemeText());
        }
    }

    void setRange(int i8, int i9, int i10, int i11, int i12, int i13) {
        this.mMinYear = i8;
        this.mMinYearMonth = i9;
        this.mMinYearDay = i10;
        this.mMaxYear = i11;
        this.mMaxYearMonth = i12;
        this.mMaxYearDay = i13;
        if (i13 == -1) {
            this.mMaxYearDay = b.getMonthDaysCount(i11, i12);
        }
        this.mCurrentMonthViewItem = (((this.mCurrentDate.getYear() - this.mMinYear) * 12) + this.mCurrentDate.getMonth()) - this.mMinYearMonth;
    }
}
