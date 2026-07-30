package com.haibin.calendarview;

import android.annotation.SuppressLint;
import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes4.dex */
public final class b {
    private static final long ONE_DAY = 86400000;

    public static int compareTo(int i8, int i9, int i10, int i11, int i12, int i13) {
        Calendar calendar = new Calendar();
        calendar.setYear(i8);
        calendar.setMonth(i9);
        calendar.setDay(i10);
        Calendar calendar2 = new Calendar();
        calendar2.setYear(i11);
        calendar2.setMonth(i12);
        calendar2.setDay(i13);
        return calendar.compareTo(calendar2);
    }

    public static int differ(Calendar calendar, Calendar calendar2) {
        if (calendar == null) {
            return Integer.MIN_VALUE;
        }
        if (calendar2 == null) {
            return Integer.MAX_VALUE;
        }
        java.util.Calendar calendar3 = java.util.Calendar.getInstance();
        calendar3.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay(), 12, 0, 0);
        long timeInMillis = calendar3.getTimeInMillis();
        calendar3.set(calendar2.getYear(), calendar2.getMonth() - 1, calendar2.getDay(), 12, 0, 0);
        return (int) ((timeInMillis - calendar3.getTimeInMillis()) / ONE_DAY);
    }

    static int dipToPx(Context context, float f8) {
        return (int) ((f8 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @SuppressLint({"SimpleDateFormat"})
    static int getDate(String str, Date date) {
        return Integer.parseInt(new SimpleDateFormat(str).format(date));
    }

    static Calendar getFirstCalendarFromMonthViewPager(int i8, c cVar) {
        Calendar calendar = new Calendar();
        calendar.setYear((((cVar.getMinYearMonth() + i8) - 1) / 12) + cVar.getMinYear());
        calendar.setMonth((((i8 + cVar.getMinYearMonth()) - 1) % 12) + 1);
        if (cVar.getDefaultCalendarSelectDay() != 0) {
            int monthDaysCount = getMonthDaysCount(calendar.getYear(), calendar.getMonth());
            Calendar calendar2 = cVar.mIndexCalendar;
            if (calendar2 == null || calendar2.getDay() == 0) {
                monthDaysCount = 1;
            } else if (monthDaysCount >= calendar2.getDay()) {
                monthDaysCount = calendar2.getDay();
            }
            calendar.setDay(monthDaysCount);
        } else {
            calendar.setDay(1);
        }
        if (!isCalendarInRange(calendar, cVar)) {
            calendar = isMinRangeEdge(calendar, cVar) ? cVar.getMinRangeCalendar() : cVar.getMaxRangeCalendar();
        }
        calendar.setCurrentMonth(calendar.getYear() == cVar.getCurrentDay().getYear() && calendar.getMonth() == cVar.getCurrentDay().getMonth());
        calendar.setCurrentDay(calendar.equals(cVar.getCurrentDay()));
        d.setupLunarCalendar(calendar);
        return calendar;
    }

    public static Calendar getFirstCalendarStartWithMinCalendar(int i8, int i9, int i10, int i11, int i12) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(i8, i9 - 1, i10, 12, 0);
        long timeInMillis = ((i11 - 1) * 7 * ONE_DAY) + calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis);
        calendar.setTimeInMillis(timeInMillis - (getWeekViewStartDiff(calendar.get(1), calendar.get(2) + 1, calendar.get(5), i12) * ONE_DAY));
        Calendar calendar2 = new Calendar();
        calendar2.setYear(calendar.get(1));
        calendar2.setMonth(calendar.get(2) + 1);
        calendar2.setDay(calendar.get(5));
        return calendar2;
    }

    public static int getMonthDaysCount(int i8, int i9) {
        int i10 = (i9 == 1 || i9 == 3 || i9 == 5 || i9 == 7 || i9 == 8 || i9 == 10 || i9 == 12) ? 31 : 0;
        if (i9 == 4 || i9 == 6 || i9 == 9 || i9 == 11) {
            i10 = 30;
        }
        return i9 == 2 ? isLeapYear(i8) ? 29 : 28 : i10;
    }

    static int getMonthEndDiff(int i8, int i9, int i10) {
        return getMonthEndDiff(i8, i9, getMonthDaysCount(i8, i9), i10);
    }

    public static int getMonthViewHeight(int i8, int i9, int i10, int i11) {
        java.util.Calendar.getInstance().set(i8, i9 - 1, 1, 12, 0, 0);
        int monthViewStartDiff = getMonthViewStartDiff(i8, i9, i11);
        int monthDaysCount = getMonthDaysCount(i8, i9);
        return (((monthViewStartDiff + monthDaysCount) + getMonthEndDiff(i8, i9, monthDaysCount, i11)) / 7) * i10;
    }

    public static int getMonthViewLineCount(int i8, int i9, int i10, int i11) {
        if (i11 == 0) {
            return 6;
        }
        return ((getMonthViewStartDiff(i8, i9, i10) + getMonthDaysCount(i8, i9)) + getMonthEndDiff(i8, i9, i10)) / 7;
    }

    static int getMonthViewStartDiff(Calendar calendar, int i8) {
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(calendar.getYear(), calendar.getMonth() - 1, 1, 12, 0, 0);
        int i9 = calendar2.get(7);
        if (i8 == 1) {
            return i9 - 1;
        }
        if (i8 == 2) {
            if (i9 == 1) {
                return 6;
            }
            return i9 - i8;
        }
        if (i9 == 7) {
            return 0;
        }
        return i9;
    }

    public static Calendar getNextCalendar(Calendar calendar) {
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay(), 12, 0, 0);
        calendar2.setTimeInMillis(calendar2.getTimeInMillis() + ONE_DAY);
        Calendar calendar3 = new Calendar();
        calendar3.setYear(calendar2.get(1));
        calendar3.setMonth(calendar2.get(2) + 1);
        calendar3.setDay(calendar2.get(5));
        return calendar3;
    }

    public static Calendar getPreCalendar(Calendar calendar) {
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay(), 12, 0, 0);
        calendar2.setTimeInMillis(calendar2.getTimeInMillis() - ONE_DAY);
        Calendar calendar3 = new Calendar();
        calendar3.setYear(calendar2.get(1));
        calendar3.setMonth(calendar2.get(2) + 1);
        calendar3.setDay(calendar2.get(5));
        return calendar3;
    }

    static Calendar getRangeEdgeCalendar(Calendar calendar, c cVar) {
        return (!isCalendarInRange(cVar.getCurrentDay(), cVar) || cVar.getDefaultCalendarSelectDay() == 2) ? isCalendarInRange(calendar, cVar) ? calendar : cVar.getMinRangeCalendar().isSameMonth(calendar) ? cVar.getMinRangeCalendar() : cVar.getMaxRangeCalendar() : cVar.createCurrentDate();
    }

    static List<Calendar> getWeekCalendars(Calendar calendar, c cVar) {
        long timeInMillis = calendar.getTimeInMillis();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay(), 12, 0);
        int i8 = calendar2.get(7);
        if (cVar.getWeekStart() == 1) {
            i8--;
        } else if (cVar.getWeekStart() == 2) {
            i8 = i8 == 1 ? 6 : i8 - cVar.getWeekStart();
        } else if (i8 == 7) {
            i8 = 0;
        }
        long j8 = timeInMillis - (i8 * ONE_DAY);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance();
        calendar3.setTimeInMillis(j8);
        Calendar calendar4 = new Calendar();
        calendar4.setYear(calendar3.get(1));
        calendar4.setMonth(calendar3.get(2) + 1);
        calendar4.setDay(calendar3.get(5));
        return initCalendarForWeekView(calendar4, cVar, cVar.getWeekStart());
    }

    public static int getWeekCountBetweenBothCalendar(int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(i8, i9 - 1, i10);
        long timeInMillis = calendar.getTimeInMillis();
        int weekViewStartDiff = getWeekViewStartDiff(i8, i9, i10, i14);
        calendar.set(i11, i12 - 1, i13);
        return ((weekViewStartDiff + getWeekViewEndDiff(i11, i12, i13, i14)) + (((int) ((calendar.getTimeInMillis() - timeInMillis) / ONE_DAY)) + 1)) / 7;
    }

    static int getWeekFormCalendar(Calendar calendar) {
        java.util.Calendar.getInstance().set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay());
        return r0.get(7) - 1;
    }

    public static int getWeekFromCalendarStartWithMinCalendar(Calendar calendar, int i8, int i9, int i10, int i11) {
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(i8, i9 - 1, i10);
        long timeInMillis = calendar2.getTimeInMillis();
        int weekViewStartDiff = getWeekViewStartDiff(i8, i9, i10, i11);
        calendar2.set(calendar.getYear(), calendar.getMonth() - 1, getWeekViewStartDiff(calendar.getYear(), calendar.getMonth(), calendar.getDay(), i11) == 0 ? calendar.getDay() + 1 : calendar.getDay());
        return ((weekViewStartDiff + ((int) ((calendar2.getTimeInMillis() - timeInMillis) / ONE_DAY))) / 7) + 1;
    }

    public static int getWeekFromDayInMonth(Calendar calendar, int i8) {
        java.util.Calendar.getInstance().set(calendar.getYear(), calendar.getMonth() - 1, 1, 12, 0, 0);
        return (((calendar.getDay() + getMonthViewStartDiff(calendar, i8)) - 1) / 7) + 1;
    }

    public static int getWeekViewEndDiff(int i8, int i9, int i10, int i11) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(i8, i9 - 1, i10, 12, 0);
        int i12 = calendar.get(7);
        if (i11 == 1) {
            return 7 - i12;
        }
        if (i11 == 2) {
            if (i12 == 1) {
                return 0;
            }
            return 8 - i12;
        }
        if (i12 == 7) {
            return 6;
        }
        return 6 - i12;
    }

    static int getWeekViewIndexFromCalendar(Calendar calendar, int i8) {
        return getWeekViewStartDiff(calendar.getYear(), calendar.getMonth(), calendar.getDay(), i8);
    }

    private static int getWeekViewStartDiff(int i8, int i9, int i10, int i11) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(i8, i9 - 1, i10, 12, 0);
        int i12 = calendar.get(7);
        if (i11 == 1) {
            return i12 - 1;
        }
        if (i11 == 2) {
            if (i12 == 1) {
                return 6;
            }
            return i12 - i11;
        }
        if (i12 == 7) {
            return 0;
        }
        return i12;
    }

    static List<Calendar> initCalendarForMonthView(int i8, int i9, Calendar calendar, int i10) {
        int monthDaysCount;
        int i11;
        int i12;
        int i13;
        int i14 = i9 - 1;
        java.util.Calendar.getInstance().set(i8, i14, 1);
        int monthViewStartDiff = getMonthViewStartDiff(i8, i9, i10);
        int monthDaysCount2 = getMonthDaysCount(i8, i9);
        ArrayList arrayList = new ArrayList();
        int i15 = 12;
        if (i9 == 1) {
            i11 = i8 - 1;
            int i16 = i9 + 1;
            monthDaysCount = monthViewStartDiff == 0 ? 0 : getMonthDaysCount(i11, 12);
            i12 = i16;
            i13 = i8;
        } else if (i9 == 12) {
            i13 = i8 + 1;
            monthDaysCount = monthViewStartDiff == 0 ? 0 : getMonthDaysCount(i8, i14);
            i12 = 1;
            i15 = i14;
            i11 = i8;
        } else {
            int i17 = i9 + 1;
            i15 = i14;
            monthDaysCount = monthViewStartDiff == 0 ? 0 : getMonthDaysCount(i8, i14);
            i11 = i8;
            i12 = i17;
            i13 = i11;
        }
        int i18 = 1;
        for (int i19 = 0; i19 < 42; i19++) {
            Calendar calendar2 = new Calendar();
            if (i19 < monthViewStartDiff) {
                calendar2.setYear(i11);
                calendar2.setMonth(i15);
                calendar2.setDay((monthDaysCount - monthViewStartDiff) + i19 + 1);
            } else if (i19 >= monthDaysCount2 + monthViewStartDiff) {
                calendar2.setYear(i13);
                calendar2.setMonth(i12);
                calendar2.setDay(i18);
                i18++;
            } else {
                calendar2.setYear(i8);
                calendar2.setMonth(i9);
                calendar2.setCurrentMonth(true);
                calendar2.setDay((i19 - monthViewStartDiff) + 1);
            }
            if (calendar2.equals(calendar)) {
                calendar2.setCurrentDay(true);
            }
            d.setupLunarCalendar(calendar2);
            arrayList.add(calendar2);
        }
        return arrayList;
    }

    static List<Calendar> initCalendarForWeekView(Calendar calendar, c cVar, int i8) {
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay(), 12, 0);
        long timeInMillis = calendar2.getTimeInMillis();
        ArrayList arrayList = new ArrayList();
        calendar2.setTimeInMillis(timeInMillis);
        Calendar calendar3 = new Calendar();
        calendar3.setYear(calendar.getYear());
        calendar3.setMonth(calendar.getMonth());
        calendar3.setDay(calendar.getDay());
        if (calendar3.equals(cVar.getCurrentDay())) {
            calendar3.setCurrentDay(true);
        }
        d.setupLunarCalendar(calendar3);
        calendar3.setCurrentMonth(true);
        arrayList.add(calendar3);
        for (int i9 = 1; i9 <= 6; i9++) {
            calendar2.setTimeInMillis((i9 * ONE_DAY) + timeInMillis);
            Calendar calendar4 = new Calendar();
            calendar4.setYear(calendar2.get(1));
            calendar4.setMonth(calendar2.get(2) + 1);
            calendar4.setDay(calendar2.get(5));
            if (calendar4.equals(cVar.getCurrentDay())) {
                calendar4.setCurrentDay(true);
            }
            d.setupLunarCalendar(calendar4);
            calendar4.setCurrentMonth(true);
            arrayList.add(calendar4);
        }
        return arrayList;
    }

    static boolean isCalendarInRange(Calendar calendar, int i8, int i9, int i10, int i11, int i12, int i13) {
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(i8, i9 - 1, i10);
        long timeInMillis = calendar2.getTimeInMillis();
        calendar2.set(i11, i12 - 1, i13);
        long timeInMillis2 = calendar2.getTimeInMillis();
        calendar2.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay());
        long timeInMillis3 = calendar2.getTimeInMillis();
        return timeInMillis3 >= timeInMillis && timeInMillis3 <= timeInMillis2;
    }

    public static boolean isLeapYear(int i8) {
        return (i8 % 4 == 0 && i8 % 100 != 0) || i8 % 400 == 0;
    }

    private static boolean isMinRangeEdge(Calendar calendar, c cVar) {
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(cVar.getMinYear(), cVar.getMinYearMonth() - 1, cVar.getMinYearDay(), 12, 0);
        long timeInMillis = calendar2.getTimeInMillis();
        calendar2.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay(), 12, 0);
        return calendar2.getTimeInMillis() < timeInMillis;
    }

    static boolean isMonthInRange(int i8, int i9, int i10, int i11, int i12, int i13) {
        return i8 >= i10 && i8 <= i12 && (i8 != i10 || i9 >= i11) && (i8 != i12 || i9 <= i13);
    }

    public static boolean isWeekend(Calendar calendar) {
        int weekFormCalendar = getWeekFormCalendar(calendar);
        return weekFormCalendar == 0 || weekFormCalendar == 6;
    }

    private static int getMonthEndDiff(int i8, int i9, int i10, int i11) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(i8, i9 - 1, i10);
        int i12 = calendar.get(7);
        if (i11 == 1) {
            return 7 - i12;
        }
        if (i11 == 2) {
            if (i12 == 1) {
                return 0;
            }
            return 8 - i12;
        }
        if (i12 == 7) {
            return 6;
        }
        return 6 - i12;
    }

    static int getMonthViewStartDiff(int i8, int i9, int i10) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(i8, i9 - 1, 1, 12, 0, 0);
        int i11 = calendar.get(7);
        if (i10 == 1) {
            return i11 - 1;
        }
        if (i10 == 2) {
            if (i11 == 1) {
                return 6;
            }
            return i11 - i10;
        }
        if (i11 == 7) {
            return 0;
        }
        return i11;
    }

    public static int getMonthViewHeight(int i8, int i9, int i10, int i11, int i12) {
        return i12 == 0 ? i10 * 6 : getMonthViewHeight(i8, i9, i10, i11);
    }

    static boolean isCalendarInRange(Calendar calendar, c cVar) {
        return isCalendarInRange(calendar, cVar.getMinYear(), cVar.getMinYearMonth(), cVar.getMinYearDay(), cVar.getMaxYear(), cVar.getMaxYearMonth(), cVar.getMaxYearDay());
    }
}
