package com.squareup.cash.support.backend.real;

import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.datetimeformatter.real.RealTodayDateTimeFormatter;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.protos.cash.disputron.core.TransactionType;
import com.squareup.protos.cash.grantly.api.Action;

/* loaded from: classes7.dex */
public final class RealDisputesTrackerMapper {
    public final RealTodayDateTimeFormatter dateTimeFormatter;
    public final MoneyFormatter moneyFormatter;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransactionType.values().length];
            try {
                Action.Type.Companion companion = TransactionType.Companion;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Action.Type.Companion companion2 = TransactionType.Companion;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Action.Type.Companion companion3 = TransactionType.Companion;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Action.Type.Companion companion4 = TransactionType.Companion;
                iArr[12] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Action.Type.Companion companion5 = TransactionType.Companion;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Action.Type.Companion companion6 = TransactionType.Companion;
                iArr[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Action.Type.Companion companion7 = TransactionType.Companion;
                iArr[5] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Action.Type.Companion companion8 = TransactionType.Companion;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Action.Type.Companion companion9 = TransactionType.Companion;
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                Action.Type.Companion companion10 = TransactionType.Companion;
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                Action.Type.Companion companion11 = TransactionType.Companion;
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                Action.Type.Companion companion12 = TransactionType.Companion;
                iArr[0] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                Action.Type.Companion companion13 = TransactionType.Companion;
                iArr[11] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                Action.Type.Companion companion14 = TransactionType.Companion;
                iArr[13] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                Action.Type.Companion companion15 = TransactionType.Companion;
                iArr[14] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealDisputesTrackerMapper(RealTodayDateTimeFormatter realTodayDateTimeFormatter, LocalizedMoneyFormatter.Factory factory) {
        this.dateTimeFormatter = realTodayDateTimeFormatter;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.STANDARD);
    }
}
