package com.squareup.protos.franklin;

import com.squareup.protos.cash.ui.ActionType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class PaymentPadThemeIdentifier implements WireEnum {
    public static final /* synthetic */ PaymentPadThemeIdentifier[] $VALUES;
    public static final PaymentPadThemeIdentifier$Companion$ADAPTER$1 ADAPTER;
    public static final ActionType.Companion Companion;
    public static final PaymentPadThemeIdentifier PINK;

    static {
        PaymentPadThemeIdentifier paymentPadThemeIdentifier = new PaymentPadThemeIdentifier("PINK", 0);
        PINK = paymentPadThemeIdentifier;
        $VALUES = new PaymentPadThemeIdentifier[]{paymentPadThemeIdentifier};
        Companion = new ActionType.Companion();
        ADAPTER = new PaymentPadThemeIdentifier$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PaymentPadThemeIdentifier.class), Syntax.PROTO_2, null);
    }

    public static final PaymentPadThemeIdentifier fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return PINK;
        }
        return null;
    }

    public static PaymentPadThemeIdentifier valueOf(String str) {
        return (PaymentPadThemeIdentifier) Enum.valueOf(PaymentPadThemeIdentifier.class, str);
    }

    public static PaymentPadThemeIdentifier[] values() {
        return (PaymentPadThemeIdentifier[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return 1;
    }
}
