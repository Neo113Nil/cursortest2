package com.squareup.cash.util.money;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public abstract class Moneys {
    public static final Lazy currencyLocaleMap$delegate = LazyKt.lazy(new Moneys$$ExternalSyntheticLambda0(0));
    public static final LinkedHashSet SUPPORTED_CURRENCIES = SetsKt__SetsKt.linkedSetOf(CurrencyCode.USD, CurrencyCode.AUD, CurrencyCode.CAD, CurrencyCode.GBP, CurrencyCode.EUR, CurrencyCode.BTC);

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CurrencyCode.values().length];
            try {
                iArr[CurrencyCode.AUD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CurrencyCode.CAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CurrencyCode.USD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CurrencyCode.XUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CurrencyCode.BTC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CurrencyCode.EUR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CurrencyCode.GBP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RoundingMode.values().length];
            try {
                iArr2[RoundingMode.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final long amount(Money money) {
        Long l;
        if (money == null || (l = money.amount) == null) {
            return 0L;
        }
        return l.longValue();
    }

    public static final int compareTo(Money money, Money money2) {
        CurrencyCode currencyCode;
        CurrencyCode currencyCode2;
        if ((money != null ? money.currency_code : null) != null) {
            if ((money2 != null ? money2.currency_code : null) != null && (currencyCode = money.currency_code) != (currencyCode2 = money2.currency_code)) {
                if (money == null) {
                    currencyCode = null;
                }
                a$$ExternalSyntheticBUOutline0.m(currencyCode, ", ", money2 != null ? currencyCode2 : null, ")", "Can't mix currencies (");
                return 0;
            }
        }
        return Intrinsics.compare(amount(money), amount(money2));
    }

    public static final Money convertBitcoinEquivalentAmount(Money money, Money money2) {
        money.getClass();
        money2.getClass();
        if (money2.amount == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return null;
        }
        if (money2.currency_code == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return null;
        }
        CurrencyCode currencyCode = money.currency_code;
        currencyCode.getClass();
        int i = 4;
        if (WhenMappings.$EnumSwitchMapping$0[currencyCode.ordinal()] == 5) {
            Long l = money2.amount;
            l.getClass();
            long longValue = l.longValue();
            money.amount.getClass();
            return new Money(Long.valueOf(MathKt__MathJVMKt.roundToLong((r9.longValue() * longValue) / 1.0E8d)), money2.currency_code, i);
        }
        Long l2 = money.amount;
        l2.getClass();
        if (l2.longValue() == 0) {
            return new Money((Long) 0L, CurrencyCode.BTC, i);
        }
        Long l3 = money.amount;
        l3.getClass();
        double longValue2 = l3.longValue();
        money2.amount.getClass();
        return new Money(Long.valueOf(MathKt__MathJVMKt.roundToLong((1.0d / r9.longValue()) * 1.0E8d * longValue2)), CurrencyCode.BTC, i);
    }

    public static final double displayDivisor(CurrencyCode currencyCode) {
        return (currencyCode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[currencyCode.ordinal()]) == 5 ? 1.0E8d : 100.0d;
    }

    public static final float div(Money money, Money money2) {
        CurrencyCode currencyCode;
        money.getClass();
        money2.getClass();
        CurrencyCode currencyCode2 = money.currency_code;
        if (currencyCode2 == null || (currencyCode = money2.currency_code) == null || currencyCode2 == currencyCode) {
            return amount(money) / amount(money2);
        }
        a$$ExternalSyntheticBUOutline0.m(currencyCode2, ", ", currencyCode, ")", "Can't mix currencies (");
        return RecyclerView.DECELERATION_RATE;
    }

    public static final String formatMoney(Money money) {
        money.getClass();
        Long l = money.amount;
        return Recorder$$ExternalSyntheticOutline2.m("$", new DecimalFormat("#,##0").format(Integer.valueOf((int) ((l != null ? l.longValue() : 0L) / 100))));
    }

    public static final boolean isZero(Money money) {
        money.getClass();
        Long l = money.amount;
        return l != null && l.longValue() == 0;
    }

    public static final Money max(Money money, Money... moneyArr) {
        int length = moneyArr.length;
        int i = 0;
        while (true) {
            Object obj = null;
            if (i >= length) {
                Iterator it = CollectionsKt.plus((Collection) ArraysKt___ArraysKt.toList(moneyArr), (Object) money).iterator();
                if (it.hasNext()) {
                    obj = it.next();
                    if (it.hasNext()) {
                        Long l = ((Money) obj).amount;
                        l.getClass();
                        long longValue = l.longValue();
                        do {
                            Object next = it.next();
                            Long l2 = ((Money) next).amount;
                            l2.getClass();
                            long longValue2 = l2.longValue();
                            if (longValue < longValue2) {
                                obj = next;
                                longValue = longValue2;
                            }
                        } while (it.hasNext());
                    }
                }
                obj.getClass();
                return (Money) obj;
            }
            if (moneyArr[i].currency_code != money.currency_code) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                return null;
            }
            i++;
        }
    }

    public static final Money min(Money money, Money... moneyArr) {
        money.getClass();
        int length = moneyArr.length;
        int i = 0;
        while (true) {
            Object obj = null;
            if (i >= length) {
                Iterator it = CollectionsKt.plus((Collection) ArraysKt___ArraysKt.toList(moneyArr), (Object) money).iterator();
                if (it.hasNext()) {
                    obj = it.next();
                    if (it.hasNext()) {
                        Long l = ((Money) obj).amount;
                        l.getClass();
                        long longValue = l.longValue();
                        do {
                            Object next = it.next();
                            Long l2 = ((Money) next).amount;
                            l2.getClass();
                            long longValue2 = l2.longValue();
                            if (longValue > longValue2) {
                                obj = next;
                                longValue = longValue2;
                            }
                        } while (it.hasNext());
                    }
                }
                obj.getClass();
                return (Money) obj;
            }
            if (moneyArr[i].currency_code != money.currency_code) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                return null;
            }
            i++;
        }
    }

    public static final Money minus(Money money, Money money2) {
        CurrencyCode currencyCode;
        money.getClass();
        money2.getClass();
        CurrencyCode currencyCode2 = money.currency_code;
        if (currencyCode2 != null && (currencyCode = money2.currency_code) != null && currencyCode2 != currencyCode) {
            a$$ExternalSyntheticBUOutline0.m(currencyCode2, ", ", currencyCode, ")", "Can't mix currencies (");
            return null;
        }
        Long valueOf = Long.valueOf(amount(money) - amount(money2));
        CurrencyCode currencyCode3 = money.currency_code;
        if (currencyCode3 == null) {
            currencyCode3 = money2.currency_code;
        }
        return Money.copy$default(money, valueOf, currencyCode3, null, 4);
    }

    public static Money parseMoneyFromString$default(String str, CurrencyCode currencyCode) {
        String bigDecimal;
        Long longOrNull;
        RoundingMode roundingMode = RoundingMode.DOWN;
        str.getClass();
        currencyCode.getClass();
        roundingMode.getClass();
        List split$default = StringsKt.split$default(str, new char[]{'.'}, 6);
        String str2 = (String) CollectionsKt.firstOrNull(split$default);
        long longValue = ((str2 == null || (longOrNull = StringsKt.toLongOrNull(10, str2)) == null) ? 0L : longOrNull.longValue()) * ((long) displayDivisor(currencyCode));
        if (split$default.size() == 2) {
            int log10 = (int) Math.log10(displayDivisor(currencyCode));
            int i = WhenMappings.$EnumSwitchMapping$1[roundingMode.ordinal()];
            if (i == 1) {
                BigDecimal bigDecimal2 = new BigDecimal(StringsKt.padEnd((String) split$default.get(1), log10, '0'));
                int length = ((String) split$default.get(1)).length() - log10;
                if (length < 0) {
                    length = 0;
                }
                bigDecimal = bigDecimal2.movePointLeft(length).setScale(0, RoundingMode.UP).toString();
            } else {
                if (i != 2) {
                    throw new UnsupportedOperationException(roundingMode + " is unsupported.");
                }
                bigDecimal = StringsKt.padEnd(StringsKt___StringsKt.take(log10, (String) split$default.get(1)), log10, '0');
            }
            bigDecimal.getClass();
            Long longOrNull2 = StringsKt.toLongOrNull(10, bigDecimal);
            longValue += longOrNull2 != null ? longOrNull2.longValue() : 0L;
        }
        return new Money(Long.valueOf(longValue), currencyCode, 4);
    }

    public static final Money percent(Money money, float f) {
        money.getClass();
        return Money.copy$default(money, Long.valueOf((long) (f * amount(money))), null, null, 6);
    }

    public static final Money plus(Money money, Money money2) {
        CurrencyCode currencyCode;
        money.getClass();
        money2.getClass();
        CurrencyCode currencyCode2 = money.currency_code;
        if (currencyCode2 != null && (currencyCode = money2.currency_code) != null && currencyCode2 != currencyCode) {
            a$$ExternalSyntheticBUOutline0.m(currencyCode2, ", ", currencyCode, ")", "Can't mix currencies (");
            return null;
        }
        Long valueOf = Long.valueOf(amount(money2) + amount(money));
        CurrencyCode currencyCode3 = money.currency_code;
        if (currencyCode3 == null) {
            currencyCode3 = money2.currency_code;
        }
        return Money.copy$default(money, valueOf, currencyCode3, null, 4);
    }

    public static final Money roundedDown(Money money) {
        money.getClass();
        CurrencyCode currencyCode = money.currency_code;
        currencyCode.getClass();
        return Money.copy$default(money, Long.valueOf((long) (((long) (amount(money) / r0)) * displayDivisor(currencyCode))), null, null, 6);
    }

    public static final String symbol(CurrencyCode currencyCode) {
        Object failure;
        currencyCode.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[currencyCode.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return "$";
            case 5:
                return "₿";
            case 6:
                return "€";
            case 7:
                return "£";
            default:
                try {
                    Result.Companion companion = Result.Companion;
                    Currency currency = Currency.getInstance(currencyCode.name());
                    Locale locale = (Locale) ((Map) currencyLocaleMap$delegate.getValue()).get(currency);
                    failure = locale != null ? currency.getSymbol(locale) : null;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                if (failure != null) {
                    return (String) failure;
                }
                Path$$ExternalSyntheticBUOutline0.m$3(currencyCode, "Unsupported currency code ");
                return null;
        }
    }

    public static final Money times(Money money, long j) {
        money.getClass();
        return Money.copy$default(money, Long.valueOf(amount(money) * j), null, null, 6);
    }

    public static final int wholeDigits(Money money) {
        money.getClass();
        CurrencyCode currencyCode = money.currency_code;
        currencyCode.getClass();
        long abs = (long) (Math.abs(amount(money)) / displayDivisor(currencyCode));
        int i = 0;
        while (abs > 0) {
            abs /= 10;
            i++;
        }
        return i;
    }

    public static final Money zero(CurrencyCode currencyCode) {
        currencyCode.getClass();
        return new Money((Long) 0L, currencyCode, 4);
    }
}
