package cn.hutool.core.date;

import java.util.Calendar;

/* loaded from: classes.dex */
public class DateModifier {
    private static final int[] IGNORE_FIELDS = {11, 9, 8, 6, 4, 3};

    public enum ModifyType {
        TRUNCATE,
        ROUND,
        CEILING
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$cn$hutool$core$date$DateModifier$ModifyType;

        static {
            int[] iArr = new int[ModifyType.values().length];
            $SwitchMap$cn$hutool$core$date$DateModifier$ModifyType = iArr;
            try {
                iArr[ModifyType.TRUNCATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cn$hutool$core$date$DateModifier$ModifyType[ModifyType.CEILING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cn$hutool$core$date$DateModifier$ModifyType[ModifyType.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static Calendar modify(Calendar calendar, int i8, ModifyType modifyType) {
        return modify(calendar, i8, modifyType, false);
    }

    private static void modifyField(Calendar calendar, int i8, ModifyType modifyType) {
        if (10 == i8) {
            i8 = 11;
        }
        int i9 = a.$SwitchMap$cn$hutool$core$date$DateModifier$ModifyType[modifyType.ordinal()];
        if (i9 == 1) {
            calendar.set(i8, cn.hutool.core.date.a.getBeginValue(calendar, i8));
            return;
        }
        if (i9 == 2) {
            calendar.set(i8, cn.hutool.core.date.a.getEndValue(calendar, i8));
            return;
        }
        if (i9 != 3) {
            return;
        }
        int beginValue = cn.hutool.core.date.a.getBeginValue(calendar, i8);
        int endValue = cn.hutool.core.date.a.getEndValue(calendar, i8);
        if (calendar.get(i8) >= (7 == i8 ? (beginValue + 3) % 7 : 1 + ((endValue - beginValue) / 2))) {
            beginValue = endValue;
        }
        calendar.set(i8, beginValue);
    }

    public static Calendar modify(Calendar calendar, int i8, ModifyType modifyType, boolean z7) {
        if (9 == i8) {
            boolean isAM = cn.hutool.core.date.a.isAM(calendar);
            int i9 = a.$SwitchMap$cn$hutool$core$date$DateModifier$ModifyType[modifyType.ordinal()];
            if (i9 == 1) {
                calendar.set(11, isAM ? 0 : 12);
            } else if (i9 == 2) {
                calendar.set(11, isAM ? 11 : 23);
            } else if (i9 == 3) {
                int i10 = isAM ? 0 : 12;
                int i11 = isAM ? 11 : 23;
                if (calendar.get(11) >= ((i11 - i10) / 2) + 1) {
                    i10 = i11;
                }
                calendar.set(11, i10);
            }
            return modify(calendar, i8 + 1, modifyType);
        }
        int i12 = z7 ? 13 : 14;
        for (int i13 = i8 + 1; i13 <= i12; i13++) {
            if (!cn.hutool.core.util.g0.contains(IGNORE_FIELDS, i13)) {
                if (4 == i8 || 3 == i8) {
                    if (5 == i13) {
                    }
                    modifyField(calendar, i13, modifyType);
                } else {
                    if (7 == i13) {
                    }
                    modifyField(calendar, i13, modifyType);
                }
            }
        }
        if (z7) {
            calendar.set(14, 0);
        }
        return calendar;
    }
}
