package com.squareup.cash.work.viewmodels;

/* loaded from: classes7.dex */
public final class TimecardDetailViewModel {
    public final Details details;
    public final HeroHeader heroHeader;
    public final SummaryTable summaryTable;

    public final class Details {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Details);
        }

        public final int hashCode() {
            return -1415269864;
        }

        public final String toString() {
            return "Details(job=Barista, shiftTime=Dec 3 at 9:00 AM  ·  Dec 3 at 5:15 PM, breaks=None, cashTips=$0.00, shiftNote=None)";
        }
    }

    public final class HeroHeader {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HeroHeader);
        }

        public final int hashCode() {
            return 672154034;
        }

        public final String toString() {
            return "HeroHeader(totalHours=8 hours, subtitle=Worked on Dec 3, 2025)";
        }
    }

    public final class SummaryTable {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SummaryTable);
        }

        public final int hashCode() {
            return 1339050744;
        }

        public final String toString() {
            return "SummaryTable(scheduledShiftDate=12/3/25, scheduledShiftTime=9:30 AM – 5:00 PM, regularHours=7 hours 30 min, overtimeHours=0 min, unpaidBreaks=30 min, paidBreaks=0 min)";
        }
    }

    public TimecardDetailViewModel(HeroHeader heroHeader, SummaryTable summaryTable, Details details) {
        this.heroHeader = heroHeader;
        this.summaryTable = summaryTable;
        this.details = details;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimecardDetailViewModel)) {
            return false;
        }
        TimecardDetailViewModel timecardDetailViewModel = (TimecardDetailViewModel) obj;
        return this.heroHeader.equals(timecardDetailViewModel.heroHeader) && this.summaryTable.equals(timecardDetailViewModel.summaryTable) && this.details.equals(timecardDetailViewModel.details);
    }

    public final int hashCode() {
        return -1159437486;
    }

    public final String toString() {
        return "TimecardDetailViewModel(heroHeader=" + this.heroHeader + ", summaryTable=" + this.summaryTable + ", details=" + this.details + ")";
    }
}
