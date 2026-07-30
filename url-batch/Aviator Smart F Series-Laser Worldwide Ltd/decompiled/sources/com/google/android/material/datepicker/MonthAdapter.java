package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pair;
import com.google.android.material.R;
import com.google.android.material.timepicker.TimeModel;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
class MonthAdapter extends BaseAdapter {
    private static final int NO_DAY_NUMBER = -1;
    final CalendarConstraints calendarConstraints;
    CalendarStyle calendarStyle;
    final DateSelector<?> dateSelector;

    @Nullable
    final DayViewDecorator dayViewDecorator;
    final Month month;
    private Collection<Long> previouslySelectedDates;
    static final int MAXIMUM_WEEKS = UtcDates.getUtcCalendar().getMaximum(4);
    private static final int MAXIMUM_GRID_CELLS = (UtcDates.getUtcCalendar().getMaximum(5) + UtcDates.getUtcCalendar().getMaximum(7)) - 1;

    MonthAdapter(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, @Nullable DayViewDecorator dayViewDecorator) {
        this.month = month;
        this.dateSelector = dateSelector;
        this.calendarConstraints = calendarConstraints;
        this.dayViewDecorator = dayViewDecorator;
        this.previouslySelectedDates = dateSelector.getSelectedDays();
    }

    private String getDayContentDescription(Context context, long j8) {
        return DateStrings.getDayContentDescription(context, j8, isToday(j8), isStartOfRange(j8), isEndOfRange(j8));
    }

    private void initializeStyles(Context context) {
        if (this.calendarStyle == null) {
            this.calendarStyle = new CalendarStyle(context);
        }
    }

    private boolean isSelected(long j8) {
        Iterator<Long> it = this.dateSelector.getSelectedDays().iterator();
        while (it.hasNext()) {
            if (UtcDates.canonicalYearMonthDay(j8) == UtcDates.canonicalYearMonthDay(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private boolean isToday(long j8) {
        return UtcDates.getTodayCalendar().getTimeInMillis() == j8;
    }

    private void updateSelectedState(@Nullable TextView textView, long j8, int i8) {
        CalendarItemStyle calendarItemStyle;
        boolean z7;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String dayContentDescription = getDayContentDescription(context, j8);
        textView.setContentDescription(dayContentDescription);
        boolean isValid = this.calendarConstraints.getDateValidator().isValid(j8);
        if (isValid) {
            textView.setEnabled(true);
            boolean isSelected = isSelected(j8);
            textView.setSelected(isSelected);
            calendarItemStyle = isSelected ? this.calendarStyle.selectedDay : isToday(j8) ? this.calendarStyle.todayDay : this.calendarStyle.day;
            z7 = isSelected;
        } else {
            textView.setEnabled(false);
            calendarItemStyle = this.calendarStyle.invalidDay;
            z7 = false;
        }
        DayViewDecorator dayViewDecorator = this.dayViewDecorator;
        if (dayViewDecorator == null || i8 == -1) {
            calendarItemStyle.styleItem(textView);
            return;
        }
        Month month = this.month;
        int i9 = month.year;
        int i10 = month.month;
        ColorStateList backgroundColor = dayViewDecorator.getBackgroundColor(context, i9, i10, i8, isValid, z7);
        boolean z8 = z7;
        calendarItemStyle.styleItem(textView, backgroundColor, this.dayViewDecorator.getTextColor(context, i9, i10, i8, isValid, z8));
        Drawable compoundDrawableLeft = this.dayViewDecorator.getCompoundDrawableLeft(context, i9, i10, i8, isValid, z8);
        Drawable compoundDrawableTop = this.dayViewDecorator.getCompoundDrawableTop(context, i9, i10, i8, isValid, z8);
        Drawable compoundDrawableRight = this.dayViewDecorator.getCompoundDrawableRight(context, i9, i10, i8, isValid, z8);
        boolean z9 = z7;
        textView.setCompoundDrawables(compoundDrawableLeft, compoundDrawableTop, compoundDrawableRight, this.dayViewDecorator.getCompoundDrawableBottom(context, i9, i10, i8, isValid, z9));
        textView.setContentDescription(this.dayViewDecorator.getContentDescription(context, i9, i10, i8, isValid, z9, dayContentDescription));
    }

    private void updateSelectedStateForDate(MaterialCalendarGridView materialCalendarGridView, long j8) {
        if (Month.create(j8).equals(this.month)) {
            int dayOfMonth = this.month.getDayOfMonth(j8);
            updateSelectedState((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().dayToPosition(dayOfMonth) - materialCalendarGridView.getFirstVisiblePosition()), j8, dayOfMonth);
        }
    }

    int dayToPosition(int i8) {
        return firstPositionInMonth() + (i8 - 1);
    }

    int firstPositionInMonth() {
        return this.month.daysFromStartOfWeekToFirstOfMonth(this.calendarConstraints.getFirstDayOfWeek());
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return MAXIMUM_GRID_CELLS;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i8) {
        return i8 / this.month.daysInWeek;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    @VisibleForTesting
    boolean isEndOfRange(long j8) {
        Iterator<Pair<Long, Long>> it = this.dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            Long l8 = it.next().second;
            if (l8 != null && l8.longValue() == j8) {
                return true;
            }
        }
        return false;
    }

    boolean isFirstInRow(int i8) {
        return i8 % this.month.daysInWeek == 0;
    }

    boolean isLastInRow(int i8) {
        return (i8 + 1) % this.month.daysInWeek == 0;
    }

    @VisibleForTesting
    boolean isStartOfRange(long j8) {
        Iterator<Pair<Long, Long>> it = this.dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            Long l8 = it.next().first;
            if (l8 != null && l8.longValue() == j8) {
                return true;
            }
        }
        return false;
    }

    int lastPositionInMonth() {
        return (firstPositionInMonth() + this.month.daysInMonth) - 1;
    }

    int positionToDay(int i8) {
        return (i8 - firstPositionInMonth()) + 1;
    }

    public void updateSelectedStates(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.previouslySelectedDates.iterator();
        while (it.hasNext()) {
            updateSelectedStateForDate(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.dateSelector;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.getSelectedDays().iterator();
            while (it2.hasNext()) {
                updateSelectedStateForDate(materialCalendarGridView, it2.next().longValue());
            }
            this.previouslySelectedDates = this.dateSelector.getSelectedDays();
        }
    }

    boolean withinMonth(int i8) {
        return i8 >= firstPositionInMonth() && i8 <= lastPositionInMonth();
    }

    @Override // android.widget.Adapter
    @Nullable
    public Long getItem(int i8) {
        if (i8 < firstPositionInMonth() || i8 > lastPositionInMonth()) {
            return null;
        }
        return Long.valueOf(this.month.getDay(positionToDay(i8)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    @Override // android.widget.Adapter
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextView getView(int i8, @Nullable View view, @NonNull ViewGroup viewGroup) {
        int i9;
        Long item;
        initializeStyles(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int firstPositionInMonth = i8 - firstPositionInMonth();
        if (firstPositionInMonth >= 0) {
            Month month = this.month;
            if (firstPositionInMonth < month.daysInMonth) {
                i9 = firstPositionInMonth + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, TimeModel.NUMBER_FORMAT, Integer.valueOf(i9)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                item = getItem(i8);
                if (item != null) {
                    return textView;
                }
                updateSelectedState(textView, item.longValue(), i9);
                return textView;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        i9 = -1;
        item = getItem(i8);
        if (item != null) {
        }
    }
}
