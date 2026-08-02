package com.squareup.cash.ui.widget.amount;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.room.util.CursorUtil;
import com.squareup.cash.ui.widget.amount.AmountChangedSource;
import com.squareup.cash.ui.widget.amount.AmountEvent;
import com.squareup.cash.ui.widget.amount.Digit;
import com.squareup.cropview.Edge;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes7.dex */
public final class AmountDisplayState {
    public final ParcelableSnapshotMutableState config$delegate;
    public final ParcelableSnapshotMutableState model$delegate;
    public Function1 onEvent;

    public AmountDisplayState(AmountConfig amountConfig, String str) {
        amountConfig.getClass();
        str.getClass();
        this.config$delegate = Updater.mutableStateOf$default(amountConfig);
        this.model$delegate = Updater.mutableStateOf$default(new AmountModel(amountConfig, str));
    }

    public static /* synthetic */ void reset$default(AmountDisplayState amountDisplayState, String str, int i) {
        if ((i & 1) != 0) {
            str = "0";
        }
        amountDisplayState.reset(str, (i & 2) != 0 ? AmountChangedSource.Reset.INSTANCE : AmountChangedSource.ConfigReset.INSTANCE);
    }

    public final void add(char c) {
        AmountChangedSource.DigitInput digitInput = AmountChangedSource.DigitInput.INSTANCE;
        if ('0' <= c && c < ':') {
            if (isValidEntry(c - '0')) {
                validateAndSet(getModel().append(c), digitInput);
            }
        } else if (c == '.') {
            validateAndSet(getModel().append('.'), digitInput);
        } else {
            Path$$ExternalSyntheticBUOutline0.m$2(c, "Unexpected character char=");
        }
    }

    public final void applyConfig(AmountConfig amountConfig) {
        amountConfig.getClass();
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.config$delegate;
        if (Intrinsics.areEqual((AmountConfig) parcelableSnapshotMutableState.getValue(), amountConfig)) {
            return;
        }
        parcelableSnapshotMutableState.setValue(amountConfig);
        reset(getModel().toRawAmount(), AmountChangedSource.ConfigReset.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
    
        r0 = kotlin.collections.CollectionsKt.dropLast(r7.size() - r5, r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void delete() {
        List list;
        if (isValidEntry(0)) {
            AmountModel model = getModel();
            List list2 = model.numberDigits;
            AmountConfig amountConfig = model.config;
            int maxEmptyZerosCount = amountConfig.getMaxEmptyZerosCount();
            if (list2.size() != 1) {
                ArrayList arrayList = new ArrayList(list2);
                int size = arrayList.size() - 1;
                while (true) {
                    if (-1 >= size) {
                        break;
                    }
                    if ((arrayList.get(size) instanceof Digit.Number) && Edge.Companion.getHasDecimalPoint(list2)) {
                        if (Edge.Companion.getAfterDecimal(arrayList) - maxEmptyZerosCount <= 0) {
                            Digit.EmptyZero emptyZero = new Digit.EmptyZero(0);
                            arrayList.set(size, emptyZero);
                        } else {
                            list = CollectionsKt.dropLast(1, arrayList);
                        }
                    } else {
                        if ((arrayList.get(size) instanceof Digit.Number) || ((Digit) arrayList.get(size)).isDecimalPoint$amountview()) {
                            break;
                        }
                        arrayList.get(size);
                        size--;
                    }
                }
                list = arrayList;
            } else if (((Digit) list2.get(0)).isLastZero$amountview()) {
                list = CollectionsKt__CollectionsJVMKt.listOf(list2.get(0));
            } else {
                list = CollectionsKt__CollectionsJVMKt.listOf(new Digit.Number(0, true));
            }
            List expandAfterFraction = Edge.Companion.expandAfterFraction(amountConfig.getMaxEmptyZerosCount(), Edge.Companion.addCommas(list));
            Edge.Companion.access$setLeftOf(expandAfterFraction);
            AmountModel copy$default = AmountModel.copy$default(model, expandAfterFraction);
            CursorUtil validate = getModel().validate();
            AmountModelValidationResult$ExceedsMaxWholeDigitsCount amountModelValidationResult$ExceedsMaxWholeDigitsCount = AmountModelValidationResult$ExceedsMaxWholeDigitsCount.INSTANCE;
            boolean equals = validate.equals(amountModelValidationResult$ExceedsMaxWholeDigitsCount);
            AmountChangedSource.DigitInput digitInput = AmountChangedSource.DigitInput.INSTANCE;
            if (!equals || !copy$default.validate().equals(amountModelValidationResult$ExceedsMaxWholeDigitsCount)) {
                validateAndSet(copy$default, digitInput);
                return;
            }
            this.model$delegate.setValue(copy$default);
            Function1 function1 = this.onEvent;
            if (function1 != null) {
                function1.invoke(new AmountEvent.AmountChanged(getModel().toRawAmount(), digitInput));
            }
        }
    }

    public final AmountModel getModel() {
        return (AmountModel) this.model$delegate.getValue();
    }

    public final String getRawAmount() {
        return getModel().toRawAmount();
    }

    public final boolean isValidEntry(int i) {
        if (!getModel().toRawAmount().equals("0") || i != 0) {
            return true;
        }
        Function1 function1 = this.onEvent;
        if (function1 == null) {
            return false;
        }
        function1.invoke(new AmountEvent.InvalidChange(AmountModelValidationResult$EmptyDigits.INSTANCE));
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        if (((com.squareup.cash.ui.widget.amount.Digit.Number) r7).number == ((com.squareup.cash.ui.widget.amount.Digit.Number) r5).number) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        if (((com.squareup.cash.ui.widget.amount.Digit.Symbol) r7).character == ((com.squareup.cash.ui.widget.amount.Digit.Symbol) r5).character) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void reset(String str, AmountChangedSource amountChangedSource) {
        str.getClass();
        amountChangedSource.getClass();
        AmountModel amountModel = new AmountModel((AmountConfig) this.config$delegate.getValue(), str);
        List list = getModel().numberDigits;
        List list2 = amountModel.numberDigits;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            Digit digit = (Digit) obj;
            if (i < list.size()) {
                Digit digit2 = (Digit) list.get(i);
                digit2.getClass();
                digit.getClass();
                boolean z = true;
                if (!(digit2 instanceof Digit.Number) || !(digit instanceof Digit.Number)) {
                    if (!(digit2 instanceof Digit.Symbol) || !(digit instanceof Digit.Symbol)) {
                        if (!(digit2 instanceof Digit.EmptyZero) || !(digit instanceof Digit.EmptyZero)) {
                            if ((digit2 instanceof Digit.CurrencySymbol) && (digit instanceof Digit.CurrencySymbol)) {
                                z = Intrinsics.areEqual(((Digit.CurrencySymbol) digit2).symbol, ((Digit.CurrencySymbol) digit).symbol);
                            }
                            z = false;
                        }
                        if (z) {
                            digit = (Digit) list.get(i);
                        }
                    }
                }
            }
            arrayList.add(digit);
            i = i2;
        }
        validateAndSet(new AmountModel(arrayList, amountModel.config), amountChangedSource);
    }

    public final void validateAndSet(AmountModel amountModel, AmountChangedSource amountChangedSource) {
        AmountConfig amountConfig = amountModel.config;
        CursorUtil validate = amountModel.validate();
        if (validate.equals(AmountModelValidationResult$Success.INSTANCE)) {
            this.model$delegate.setValue(amountModel);
            Function1 function1 = this.onEvent;
            if (function1 != null) {
                function1.invoke(new AmountEvent.AmountChanged(getModel().toRawAmount(), amountChangedSource));
                return;
            }
            return;
        }
        if (!validate.equals(AmountModelValidationResult$ExceedsMaxWholeDigitsCount.INSTANCE)) {
            Function1 function12 = this.onEvent;
            if (function12 != null) {
                function12.invoke(new AmountEvent.InvalidChange(validate));
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(amountChangedSource, AmountChangedSource.ConfigReset.INSTANCE)) {
            validateAndSet(new AmountModel(amountConfig, amountConfig.getMaxAmountString()), AmountChangedSource.AmountOverflow.INSTANCE);
            return;
        }
        Function1 function13 = this.onEvent;
        if (function13 != null) {
            function13.invoke(new AmountEvent.InvalidChange(validate));
        }
    }
}
