package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExternalPurchaseNoticeAction.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/margelo/nitro/iap/ExternalPurchaseNoticeAction;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CONTINUE", "DISMISSED", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalPurchaseNoticeAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExternalPurchaseNoticeAction[] $VALUES;
    private final int value;
    public static final ExternalPurchaseNoticeAction CONTINUE = new ExternalPurchaseNoticeAction("CONTINUE", 0, 0);
    public static final ExternalPurchaseNoticeAction DISMISSED = new ExternalPurchaseNoticeAction("DISMISSED", 1, 1);

    private static final /* synthetic */ ExternalPurchaseNoticeAction[] $values() {
        return new ExternalPurchaseNoticeAction[]{CONTINUE, DISMISSED};
    }

    public static EnumEntries<ExternalPurchaseNoticeAction> getEntries() {
        return $ENTRIES;
    }

    private ExternalPurchaseNoticeAction(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ExternalPurchaseNoticeAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    public static ExternalPurchaseNoticeAction valueOf(String str) {
        return (ExternalPurchaseNoticeAction) Enum.valueOf(ExternalPurchaseNoticeAction.class, str);
    }

    public static ExternalPurchaseNoticeAction[] values() {
        return (ExternalPurchaseNoticeAction[]) $VALUES.clone();
    }
}
