package com.squareup.cash.wallet.presenters;

import com.squareup.cash.wallet.data.CashAppTag;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.protos.cash.whimsicard.syncentity.Timeline;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class PaymentDevicePresentationMapperKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    static {
        int[] iArr = new int[CashAppTag.PhysicalTagOrderState.values().length];
        try {
            CashAppTag.PhysicalTagOrderState physicalTagOrderState = CashAppTag.PhysicalTagOrderState.PREPARING;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            CashAppTag.PhysicalTagOrderState physicalTagOrderState2 = CashAppTag.PhysicalTagOrderState.PREPARING;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            CashAppTag.PhysicalTagOrderState physicalTagOrderState3 = CashAppTag.PhysicalTagOrderState.PREPARING;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            CashAppTag.PhysicalTagOrderState physicalTagOrderState4 = CashAppTag.PhysicalTagOrderState.PREPARING;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[Timeline.TimelineIcon.values().length];
        try {
            TextSize.Companion companion = Timeline.TimelineIcon.Companion;
            iArr2[1] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            TextSize.Companion companion2 = Timeline.TimelineIcon.Companion;
            iArr2[2] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            TextSize.Companion companion3 = Timeline.TimelineIcon.Companion;
            iArr2[3] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            TextSize.Companion companion4 = Timeline.TimelineIcon.Companion;
            iArr2[4] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            TextSize.Companion companion5 = Timeline.TimelineIcon.Companion;
            iArr2[0] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[Timeline.Step.StepStyle.values().length];
        try {
            TaxEnvironment.Companion companion6 = Timeline.Step.StepStyle.Companion;
            iArr3[1] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            TaxEnvironment.Companion companion7 = Timeline.Step.StepStyle.Companion;
            iArr3[2] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            TaxEnvironment.Companion companion8 = Timeline.Step.StepStyle.Companion;
            iArr3[3] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            TaxEnvironment.Companion companion9 = Timeline.Step.StepStyle.Companion;
            iArr3[0] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        $EnumSwitchMapping$2 = iArr3;
    }
}
