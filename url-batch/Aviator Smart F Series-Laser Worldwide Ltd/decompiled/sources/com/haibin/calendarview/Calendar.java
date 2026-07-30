package com.haibin.calendarview;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class Calendar implements Serializable, Comparable<Calendar> {
    private static final long serialVersionUID = 141315161718191143L;
    private int day;
    private String gregorianFestival;
    private boolean isCurrentDay;
    private boolean isCurrentMonth;
    private boolean isLeapYear;
    private boolean isWeekend;
    private int leapMonth;
    private String lunar;
    private Calendar lunarCalendar;
    private int month;
    private String scheme;
    private int schemeColor;
    private List<Scheme> schemes;
    private String solarTerm;
    private String traditionFestival;
    private int week;
    private int year;

    public static final class Scheme implements Serializable {
        private Object obj;
        private String other;
        private String scheme;
        private int shcemeColor;
        private int type;

        public Scheme() {
        }

        public Object getObj() {
            return this.obj;
        }

        public String getOther() {
            return this.other;
        }

        public String getScheme() {
            return this.scheme;
        }

        public int getShcemeColor() {
            return this.shcemeColor;
        }

        public int getType() {
            return this.type;
        }

        public void setObj(Object obj) {
            this.obj = obj;
        }

        public void setOther(String str) {
            this.other = str;
        }

        public void setScheme(String str) {
            this.scheme = str;
        }

        public void setShcemeColor(int i8) {
            this.shcemeColor = i8;
        }

        public void setType(int i8) {
            this.type = i8;
        }

        public Scheme(int i8, int i9, String str, String str2) {
            this.type = i8;
            this.shcemeColor = i9;
            this.scheme = str;
            this.other = str2;
        }

        public Scheme(int i8, int i9, String str) {
            this.type = i8;
            this.shcemeColor = i9;
            this.scheme = str;
        }

        public Scheme(int i8, String str) {
            this.shcemeColor = i8;
            this.scheme = str;
        }

        public Scheme(int i8, String str, String str2) {
            this.shcemeColor = i8;
            this.scheme = str;
            this.other = str2;
        }
    }

    public void addScheme(Scheme scheme) {
        if (this.schemes == null) {
            this.schemes = new ArrayList();
        }
        this.schemes.add(scheme);
    }

    final void clearScheme() {
        setScheme("");
        setSchemeColor(0);
        setSchemes(null);
    }

    public final int differ(Calendar calendar) {
        return b.differ(this, calendar);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Calendar)) {
            Calendar calendar = (Calendar) obj;
            if (calendar.getYear() == this.year && calendar.getMonth() == this.month && calendar.getDay() == this.day) {
                return true;
            }
        }
        return super.equals(obj);
    }

    public int getDay() {
        return this.day;
    }

    public String getGregorianFestival() {
        return this.gregorianFestival;
    }

    public int getLeapMonth() {
        return this.leapMonth;
    }

    public String getLunar() {
        return this.lunar;
    }

    public Calendar getLunarCalendar() {
        return this.lunarCalendar;
    }

    public int getMonth() {
        return this.month;
    }

    public String getScheme() {
        return this.scheme;
    }

    public int getSchemeColor() {
        return this.schemeColor;
    }

    public List<Scheme> getSchemes() {
        return this.schemes;
    }

    public String getSolarTerm() {
        return this.solarTerm;
    }

    public long getTimeInMillis() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(1, this.year);
        calendar.set(2, this.month - 1);
        calendar.set(5, this.day);
        return calendar.getTimeInMillis();
    }

    public String getTraditionFestival() {
        return this.traditionFestival;
    }

    public int getWeek() {
        return this.week;
    }

    public int getYear() {
        return this.year;
    }

    public boolean hasScheme() {
        List<Scheme> list = this.schemes;
        return ((list == null || list.size() == 0) && TextUtils.isEmpty(this.scheme)) ? false : true;
    }

    public boolean isAvailable() {
        int i8 = this.year;
        boolean z7 = i8 > 0;
        int i9 = this.month;
        boolean z8 = z7 & (i9 > 0);
        int i10 = this.day;
        return z8 & (i10 > 0) & (i10 <= 31) & (i9 <= 12) & (i8 >= 1900) & (i8 <= 2099);
    }

    public boolean isCurrentDay() {
        return this.isCurrentDay;
    }

    public boolean isCurrentMonth() {
        return this.isCurrentMonth;
    }

    public boolean isLeapYear() {
        return this.isLeapYear;
    }

    public boolean isSameMonth(Calendar calendar) {
        return this.year == calendar.getYear() && this.month == calendar.getMonth();
    }

    public boolean isWeekend() {
        return this.isWeekend;
    }

    final void mergeScheme(Calendar calendar, String str) {
        if (calendar == null) {
            return;
        }
        if (!TextUtils.isEmpty(calendar.getScheme())) {
            str = calendar.getScheme();
        }
        setScheme(str);
        setSchemeColor(calendar.getSchemeColor());
        setSchemes(calendar.getSchemes());
    }

    public void setCurrentDay(boolean z7) {
        this.isCurrentDay = z7;
    }

    public void setCurrentMonth(boolean z7) {
        this.isCurrentMonth = z7;
    }

    public void setDay(int i8) {
        this.day = i8;
    }

    public void setGregorianFestival(String str) {
        this.gregorianFestival = str;
    }

    public void setLeapMonth(int i8) {
        this.leapMonth = i8;
    }

    public void setLeapYear(boolean z7) {
        this.isLeapYear = z7;
    }

    public void setLunar(String str) {
        this.lunar = str;
    }

    public void setLunarCalendar(Calendar calendar) {
        this.lunarCalendar = calendar;
    }

    public void setMonth(int i8) {
        this.month = i8;
    }

    public void setScheme(String str) {
        this.scheme = str;
    }

    public void setSchemeColor(int i8) {
        this.schemeColor = i8;
    }

    public void setSchemes(List<Scheme> list) {
        this.schemes = list;
    }

    public void setSolarTerm(String str) {
        this.solarTerm = str;
    }

    public void setTraditionFestival(String str) {
        this.traditionFestival = str;
    }

    public void setWeek(int i8) {
        this.week = i8;
    }

    public void setWeekend(boolean z7) {
        this.isWeekend = z7;
    }

    public void setYear(int i8) {
        this.year = i8;
    }

    public String toString() {
        Object valueOf;
        Object valueOf2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.year);
        sb.append("");
        int i8 = this.month;
        if (i8 < 10) {
            valueOf = "0" + this.month;
        } else {
            valueOf = Integer.valueOf(i8);
        }
        sb.append(valueOf);
        sb.append("");
        int i9 = this.day;
        if (i9 < 10) {
            valueOf2 = "0" + this.day;
        } else {
            valueOf2 = Integer.valueOf(i9);
        }
        sb.append(valueOf2);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(Calendar calendar) {
        if (calendar == null) {
            return 1;
        }
        return toString().compareTo(calendar.toString());
    }

    public void addScheme(int i8, String str) {
        if (this.schemes == null) {
            this.schemes = new ArrayList();
        }
        this.schemes.add(new Scheme(i8, str));
    }

    public void addScheme(int i8, int i9, String str) {
        if (this.schemes == null) {
            this.schemes = new ArrayList();
        }
        this.schemes.add(new Scheme(i8, i9, str));
    }

    public void addScheme(int i8, int i9, String str, String str2) {
        if (this.schemes == null) {
            this.schemes = new ArrayList();
        }
        this.schemes.add(new Scheme(i8, i9, str, str2));
    }

    public void addScheme(int i8, String str, String str2) {
        if (this.schemes == null) {
            this.schemes = new ArrayList();
        }
        this.schemes.add(new Scheme(i8, str, str2));
    }
}
