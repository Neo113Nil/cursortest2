package cn.hutool.core.date;

import cn.hutool.core.lang.Range;
import java.util.Date;

/* loaded from: classes.dex */
public class DateRange extends Range<DateTime> {
    private static final long serialVersionUID = 1;

    public DateRange(Date date, Date date2, DateField dateField) {
        this(date, date2, dateField, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DateTime lambda$new$0(Date date, DateField dateField, int i8, DateTime dateTime, DateTime dateTime2, int i9) {
        DateTime offsetNew = z.date(date).offsetNew(dateField, (i9 + 1) * i8);
        if (offsetNew.isAfter(dateTime2)) {
            return null;
        }
        return offsetNew;
    }

    public DateRange(Date date, Date date2, DateField dateField, int i8) {
        this(date, date2, dateField, i8, true, true);
    }

    public DateRange(final Date date, Date date2, final DateField dateField, final int i8, boolean z7, boolean z8) {
        super(z.date(date), z.date(date2), new Range.a() { // from class: cn.hutool.core.date.e
            @Override // cn.hutool.core.lang.Range.a
            public final Object step(Object obj, Object obj2, int i9) {
                DateTime lambda$new$0;
                lambda$new$0 = DateRange.lambda$new$0(date, dateField, i8, (DateTime) obj, (DateTime) obj2, i9);
                return lambda$new$0;
            }
        }, z7, z8);
    }
}
