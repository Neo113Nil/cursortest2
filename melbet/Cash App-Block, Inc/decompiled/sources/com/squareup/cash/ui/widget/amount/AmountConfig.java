package com.squareup.cash.ui.widget.amount;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda0;
import com.squareup.protos.common.CurrencyCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NotImplementedError;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes7.dex */
public abstract class AmountConfig {
    public final Lazy prefixDigit$delegate = LazyKt.lazy(new PageTagSlotKt$$ExternalSyntheticLambda0(this, 7));
    public final HashMap suffixDigitCache = new HashMap(2);

    public final class MoneyConfig extends AmountConfig {
        public final BitcoinDisplayUnits bitcoinDisplayUnits;
        public final CurrencyCode currency;
        public final int maxDisplayWholeDigits;
        public final boolean symbolExperimentEnabled;

        /* loaded from: classes5.dex */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[BitcoinDisplayUnits.values().length];
                try {
                    iArr[BitcoinDisplayUnits.BITCOIN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BitcoinDisplayUnits.SATOSHIS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BitcoinDisplayUnits.BITCOIN_SYMBOL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[CurrencyCode.values().length];
                try {
                    iArr2[CurrencyCode.BTC.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public MoneyConfig(CurrencyCode currencyCode, BitcoinDisplayUnits bitcoinDisplayUnits, boolean z, int i, int i2) {
            bitcoinDisplayUnits = (i2 & 2) != 0 ? null : bitcoinDisplayUnits;
            z = (i2 & 4) != 0 ? false : z;
            if ((i2 & 8) != 0) {
                if (WhenMappings.$EnumSwitchMapping$1[currencyCode.ordinal()] == 1) {
                    bitcoinDisplayUnits.getClass();
                    int i3 = WhenMappings.$EnumSwitchMapping$0[bitcoinDisplayUnits.ordinal()];
                    if (i3 == 1) {
                        i = 3;
                    } else {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                throw new NotImplementedError(null, 1, null);
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            throw null;
                        }
                        i = 11;
                    }
                } else {
                    i = 5;
                }
            }
            currencyCode.getClass();
            this.currency = currencyCode;
            this.bitcoinDisplayUnits = bitcoinDisplayUnits;
            this.symbolExperimentEnabled = z;
            this.maxDisplayWholeDigits = i;
            if (WhenMappings.$EnumSwitchMapping$1[currencyCode.ordinal()] == 1) {
                if (bitcoinDisplayUnits != null) {
                    return;
                }
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                throw null;
            }
            if (bitcoinDisplayUnits == null) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("Bitcoin display units should not be set for non-Bitcoin currencies.");
            throw null;
        }

        @Override // com.squareup.cash.ui.widget.amount.AmountConfig
        public final com.squareup.kotterknife.Lazy contentLabelBuilder$amountview() {
            int[] iArr = WhenMappings.$EnumSwitchMapping$1;
            CurrencyCode currencyCode = this.currency;
            if (iArr[currencyCode.ordinal()] != 1) {
                return new com.squareup.kotterknife.Lazy(currencyCode.name(), new CardAppletTile$$ExternalSyntheticLambda0(4));
            }
            CardAppletTile$$ExternalSyntheticLambda0 cardAppletTile$$ExternalSyntheticLambda0 = new CardAppletTile$$ExternalSyntheticLambda0(2);
            BitcoinDisplayUnits bitcoinDisplayUnits = this.bitcoinDisplayUnits;
            bitcoinDisplayUnits.getClass();
            return new com.squareup.kotterknife.Lazy(bitcoinDisplayUnits.name(), cardAppletTile$$ExternalSyntheticLambda0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MoneyConfig)) {
                return false;
            }
            MoneyConfig moneyConfig = (MoneyConfig) obj;
            return this.currency == moneyConfig.currency && this.bitcoinDisplayUnits == moneyConfig.bitcoinDisplayUnits && this.symbolExperimentEnabled == moneyConfig.symbolExperimentEnabled && this.maxDisplayWholeDigits == moneyConfig.maxDisplayWholeDigits;
        }

        @Override // com.squareup.cash.ui.widget.amount.AmountConfig
        public final String getMaxAmountString() {
            int totalFractionalDigitCount = getTotalFractionalDigitCount();
            int i = this.maxDisplayWholeDigits;
            return totalFractionalDigitCount > 0 ? Recorder$$ExternalSyntheticOutline2.m(StringsKt__StringsJVMKt.repeat(i, "9"), ".", StringsKt__StringsJVMKt.repeat(getTotalFractionalDigitCount(), "9")) : StringsKt__StringsJVMKt.repeat(i, "9");
        }

        @Override // com.squareup.cash.ui.widget.amount.AmountConfig
        public final int getMaxDisplayWholeDigits() {
            return this.maxDisplayWholeDigits;
        }

        @Override // com.squareup.cash.ui.widget.amount.AmountConfig
        public final int getMaxEmptyZerosCount() {
            if (WhenMappings.$EnumSwitchMapping$1[this.currency.ordinal()] != 1) {
                return 2;
            }
            BitcoinDisplayUnits bitcoinDisplayUnits = this.bitcoinDisplayUnits;
            bitcoinDisplayUnits.getClass();
            int i = WhenMappings.$EnumSwitchMapping$0[bitcoinDisplayUnits.ordinal()];
            if (i == 1) {
                return 1;
            }
            if (i == 2) {
                return 0;
            }
            if (i == 3) {
                throw new NotImplementedError(null, 1, null);
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }

        @Override // com.squareup.cash.ui.widget.amount.AmountConfig
        public final String getPrefix() {
            int[] iArr = WhenMappings.$EnumSwitchMapping$1;
            CurrencyCode currencyCode = this.currency;
            if (iArr[currencyCode.ordinal()] != 1) {
                return Moneys.symbol(currencyCode);
            }
            BitcoinDisplayUnits bitcoinDisplayUnits = this.bitcoinDisplayUnits;
            bitcoinDisplayUnits.getClass();
            int i = WhenMappings.$EnumSwitchMapping$0[bitcoinDisplayUnits.ordinal()];
            boolean z = this.symbolExperimentEnabled;
            if (i == 1) {
                return z ? "" : Moneys.symbol(currencyCode);
            }
            if (i == 2) {
                return z ? "₿" : "";
            }
            if (i == 3) {
                throw new NotImplementedError(null, 1, null);
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }

        @Override // com.squareup.cash.ui.widget.amount.AmountConfig
        public final Function1 getSuffixBuilder() {
            return new AlertBannerKt$$ExternalSyntheticLambda3(this, 6);
        }

        @Override // com.squareup.cash.ui.widget.amount.AmountConfig
        public final int getTotalFractionalDigitCount() {
            if (WhenMappings.$EnumSwitchMapping$1[this.currency.ordinal()] != 1) {
                return 2;
            }
            BitcoinDisplayUnits bitcoinDisplayUnits = this.bitcoinDisplayUnits;
            bitcoinDisplayUnits.getClass();
            int i = WhenMappings.$EnumSwitchMapping$0[bitcoinDisplayUnits.ordinal()];
            if (i == 1) {
                return 8;
            }
            if (i == 2) {
                return 0;
            }
            if (i == 3) {
                throw new NotImplementedError(null, 1, null);
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }

        public final int hashCode() {
            int hashCode = this.currency.hashCode() * 31;
            BitcoinDisplayUnits bitcoinDisplayUnits = this.bitcoinDisplayUnits;
            return Integer.hashCode(this.maxDisplayWholeDigits) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (bitcoinDisplayUnits == null ? 0 : bitcoinDisplayUnits.hashCode())) * 31, 31, this.symbolExperimentEnabled);
        }

        public final String toString() {
            return "MoneyConfig(currency=" + this.currency + ", bitcoinDisplayUnits=" + this.bitcoinDisplayUnits + ", symbolExperimentEnabled=" + this.symbolExperimentEnabled + ", maxDisplayWholeDigits=" + this.maxDisplayWholeDigits + ")";
        }
    }

    public final class PercentConfig extends AmountConfig {
        public final long maxAmount;
        public final String maxAmountString;
        public final int maxDisplayWholeDigits;
        public final int maxEmptyZerosCount;
        public final String prefix;
        public final Function1 suffixBuilder;
        public final int totalFractionalDigitCount;

        public PercentConfig(int i) {
            int i2 = (i & 1) != 0 ? 5 : 3;
            int i3 = (i & 2) != 0 ? 2 : 0;
            int i4 = (i & 4) != 0 ? 2 : 0;
            CardAppletTile$$ExternalSyntheticLambda0 cardAppletTile$$ExternalSyntheticLambda0 = new CardAppletTile$$ExternalSyntheticLambda0(3);
            long j = (i & 32) != 0 ? 9999999L : 100L;
            String str = (i & 64) != 0 ? "99999.99" : "100";
            this.maxDisplayWholeDigits = i2;
            this.totalFractionalDigitCount = i3;
            this.maxEmptyZerosCount = i4;
            this.prefix = "";
            this.suffixBuilder = cardAppletTile$$ExternalSyntheticLambda0;
            this.maxAmount = j;
            this.maxAmountString = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PercentConfig)) {
                return false;
            }
            PercentConfig percentConfig = (PercentConfig) obj;
            return this.maxDisplayWholeDigits == percentConfig.maxDisplayWholeDigits && this.totalFractionalDigitCount == percentConfig.totalFractionalDigitCount && this.maxEmptyZerosCount == percentConfig.maxEmptyZerosCount && Intrinsics.areEqual(this.prefix, percentConfig.prefix) && Intrinsics.areEqual(this.suffixBuilder, percentConfig.suffixBuilder) && this.maxAmount == percentConfig.maxAmount && Intrinsics.areEqual(this.maxAmountString, percentConfig.maxAmountString);
        }

        @Override // com.squareup.cash.ui.widget.amount.AmountConfig
        public final String getMaxAmountString() {
            return this.maxAmountString;
        }

        @Override // com.squareup.cash.ui.widget.amount.AmountConfig
        public final int getMaxDisplayWholeDigits() {
            return this.maxDisplayWholeDigits;
        }

        @Override // com.squareup.cash.ui.widget.amount.AmountConfig
        public final int getMaxEmptyZerosCount() {
            return this.maxEmptyZerosCount;
        }

        @Override // com.squareup.cash.ui.widget.amount.AmountConfig
        public final String getPrefix() {
            return this.prefix;
        }

        @Override // com.squareup.cash.ui.widget.amount.AmountConfig
        public final Function1 getSuffixBuilder() {
            return this.suffixBuilder;
        }

        @Override // com.squareup.cash.ui.widget.amount.AmountConfig
        public final int getTotalFractionalDigitCount() {
            return this.totalFractionalDigitCount;
        }

        public final int hashCode() {
            return this.maxAmountString.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline1.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxEmptyZerosCount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.totalFractionalDigitCount, Integer.hashCode(this.maxDisplayWholeDigits) * 31, 31), 31), 31, this.prefix), 31, this.suffixBuilder), 31, this.maxAmount);
        }

        public final String toString() {
            StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this.maxDisplayWholeDigits, this.totalFractionalDigitCount, "PercentConfig(maxDisplayWholeDigits=", ", totalFractionalDigitCount=", ", maxEmptyZerosCount=");
            m107m.append(this.maxEmptyZerosCount);
            m107m.append(", prefix=");
            m107m.append(this.prefix);
            m107m.append(", suffixBuilder=");
            m107m.append(this.suffixBuilder);
            m107m.append(", maxAmount=");
            m107m.append(this.maxAmount);
            return Recorder$$ExternalSyntheticOutline2.m(m107m, ", maxAmountString=", this.maxAmountString, ")");
        }
    }

    public com.squareup.kotterknife.Lazy contentLabelBuilder$amountview() {
        return new com.squareup.kotterknife.Lazy(22);
    }

    public abstract String getMaxAmountString();

    public abstract int getMaxDisplayWholeDigits();

    public abstract int getMaxEmptyZerosCount();

    public abstract String getPrefix();

    public abstract Function1 getSuffixBuilder();

    public abstract int getTotalFractionalDigitCount();
}
