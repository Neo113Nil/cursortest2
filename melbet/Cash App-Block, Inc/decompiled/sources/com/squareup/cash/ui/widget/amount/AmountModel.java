package com.squareup.cash.ui.widget.amount;

import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil__DBUtilKt;
import com.squareup.cash.ui.widget.amount.Digit;
import com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda0;
import com.squareup.cropview.Edge;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AmountModel {
    public final AmountConfig config;
    public final Lazy digits$delegate;
    public final List numberDigits;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AmountModel(AmountConfig amountConfig, String str) {
        this(Edge.Companion.expandAfterFraction(r0, Edge.Companion.addCommas(r1)), amountConfig);
        str.getClass();
        amountConfig.getClass();
        int maxEmptyZerosCount = amountConfig.getMaxEmptyZerosCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ('0' <= charAt && charAt < ':') {
                arrayList.add(new Digit.Number(charAt - '0', false));
            } else if (charAt == '.') {
                arrayList.add(new Digit.Symbol('.'));
            } else if (charAt == ',') {
                arrayList.add(new Digit.Symbol(','));
            }
        }
        int size = arrayList.size();
        ArrayList arrayList2 = arrayList;
        if (size == 1) {
            Digit digit = (Digit) arrayList.get(0);
            digit.getClass();
            arrayList2 = arrayList;
            if (digit instanceof Digit.Number) {
                arrayList2 = arrayList;
                if (((Digit.Number) digit).number == 0) {
                    arrayList2 = CollectionsKt__CollectionsJVMKt.listOf(new Digit.Number(0, true));
                }
            }
        }
    }

    public static AmountModel copy$default(AmountModel amountModel, List list) {
        AmountConfig amountConfig = amountModel.config;
        list.getClass();
        amountConfig.getClass();
        return new AmountModel(list, amountConfig);
    }

    public final AmountModel append(char c) {
        Digit digit$amountview = Edge.Companion.toDigit$amountview(c);
        AmountConfig amountConfig = this.config;
        int totalFractionalDigitCount = amountConfig.getTotalFractionalDigitCount();
        boolean isDecimalPoint$amountview = digit$amountview.isDecimalPoint$amountview();
        List list = this.numberDigits;
        List list2 = list;
        if (!isDecimalPoint$amountview || totalFractionalDigitCount != 0) {
            int i = 0;
            if ((digit$amountview instanceof Digit.Number) && list.size() == 1) {
                Digit digit = (Digit) list.get(0);
                digit.getClass();
                if ((digit instanceof Digit.Number) && ((Digit.Number) digit).number == 0) {
                    if (((Digit.Number) digit$amountview).number == 0) {
                        list2 = CollectionsKt__CollectionsJVMKt.listOf(digit$amountview);
                    } else {
                        list2 = CollectionsKt__CollectionsJVMKt.listOf(digit$amountview);
                    }
                }
            }
            ArrayList mutableList = CollectionsKt.toMutableList((Collection) list);
            int size = mutableList.size();
            while (true) {
                if (i >= size) {
                    mutableList.add(digit$amountview);
                    list2 = mutableList;
                    break;
                }
                if (mutableList.get(i) instanceof Digit.EmptyZero) {
                    mutableList.set(i, digit$amountview);
                    list2 = mutableList;
                    break;
                }
                i++;
            }
        }
        List expandAfterFraction = Edge.Companion.expandAfterFraction(amountConfig.getMaxEmptyZerosCount(), Edge.Companion.addCommas(list2));
        Edge.Companion.access$setLeftOf(expandAfterFraction);
        return copy$default(this, expandAfterFraction);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AmountModel)) {
            return false;
        }
        AmountModel amountModel = (AmountModel) obj;
        return Intrinsics.areEqual(this.numberDigits, amountModel.numberDigits) && Intrinsics.areEqual(this.config, amountModel.config);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.config.hashCode() + (this.numberDigits.hashCode() * 31)) * 31);
    }

    public final String toRawAmount() {
        List list = (List) this.digits$delegate.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Digit digit = (Digit) obj;
            if (!digit.isComma$amountview() && !(digit instanceof Digit.CurrencySymbol) && !(digit instanceof Digit.EmptyZero)) {
                arrayList.add(obj);
            }
        }
        return DBUtil__DBUtilKt.toDisplayString(arrayList, new com.squareup.kotterknife.Lazy(22));
    }

    public final String toString() {
        return "AmountModel(numberDigits=" + this.numberDigits + ", config=" + this.config + ", isFirstDigitChange=false)";
    }

    public final CursorUtil validate() {
        int i;
        List<Digit> list = this.numberDigits;
        if (list.isEmpty()) {
            return AmountModelValidationResult$EmptyDigits.INSTANCE;
        }
        if (Edge.Companion.getBeforeDecimal(list) == 0) {
            return AmountModelValidationResult$NoWholeNumbers.INSTANCE;
        }
        int i2 = 0;
        if (Edge.Companion.getBeforeDecimal(list) > 1 && Intrinsics.areEqual(((Digit) list.get(0)).toString(), "0")) {
            return AmountModelValidationResult$DigitsBeginningWithZero.INSTANCE;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            i = 0;
        } else {
            Iterator it = list2.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((Digit) it.next()).isDecimalPoint$amountview() && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                    throw null;
                }
            }
        }
        if (i >= 2) {
            return AmountModelValidationResult$MultipleDecimals.INSTANCE;
        }
        boolean z = false;
        for (Digit digit : list) {
            if (digit.isDecimalPoint$amountview()) {
                z = true;
            } else if ((digit instanceof Digit.Number) && z) {
                i2++;
            }
        }
        AmountConfig amountConfig = this.config;
        return i2 > amountConfig.getTotalFractionalDigitCount() ? AmountModelValidationResult$ExceedsFractionalDigitCount.INSTANCE : Edge.Companion.getBeforeDecimal(list) > amountConfig.getMaxDisplayWholeDigits() ? AmountModelValidationResult$ExceedsMaxWholeDigitsCount.INSTANCE : AmountModelValidationResult$Success.INSTANCE;
    }

    public AmountModel(List list, AmountConfig amountConfig) {
        list.getClass();
        amountConfig.getClass();
        this.numberDigits = list;
        this.config = amountConfig;
        this.digits$delegate = LazyKt.lazy(new PageTagSlotKt$$ExternalSyntheticLambda0(this, 8));
    }
}
