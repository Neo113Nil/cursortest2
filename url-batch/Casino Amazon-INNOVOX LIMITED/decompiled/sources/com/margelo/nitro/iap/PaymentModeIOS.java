package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PaymentModeIOS.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/margelo/nitro/iap/PaymentModeIOS;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EMPTY", "FREE_TRIAL", "PAY_AS_YOU_GO", "PAY_UP_FRONT", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentModeIOS {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PaymentModeIOS[] $VALUES;
    public static final PaymentModeIOS EMPTY = new PaymentModeIOS("EMPTY", 0, 0);
    public static final PaymentModeIOS FREE_TRIAL = new PaymentModeIOS("FREE_TRIAL", 1, 1);
    public static final PaymentModeIOS PAY_AS_YOU_GO = new PaymentModeIOS("PAY_AS_YOU_GO", 2, 2);
    public static final PaymentModeIOS PAY_UP_FRONT = new PaymentModeIOS("PAY_UP_FRONT", 3, 3);
    private final int value;

    private static final /* synthetic */ PaymentModeIOS[] $values() {
        return new PaymentModeIOS[]{EMPTY, FREE_TRIAL, PAY_AS_YOU_GO, PAY_UP_FRONT};
    }

    public static EnumEntries<PaymentModeIOS> getEntries() {
        return $ENTRIES;
    }

    private PaymentModeIOS(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        PaymentModeIOS[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    public static PaymentModeIOS valueOf(String str) {
        return (PaymentModeIOS) Enum.valueOf(PaymentModeIOS.class, str);
    }

    public static PaymentModeIOS[] values() {
        return (PaymentModeIOS[]) $VALUES.clone();
    }
}
