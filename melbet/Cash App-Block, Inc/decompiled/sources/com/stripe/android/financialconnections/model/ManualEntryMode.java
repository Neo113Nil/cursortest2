package com.stripe.android.financialconnections.model;

import com.stripe.android.core.model.serializers.EnumIgnoreUnknownSerializer;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000b\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/financialconnections/model/ManualEntryMode;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "AUTOMATIC", "CUSTOM", "UNKNOWN", "Serializer", "Companion", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Serializable(with = Serializer.class)
/* loaded from: classes8.dex */
public final class ManualEntryMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ManualEntryMode[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String value;

    @SerialName("automatic")
    public static final ManualEntryMode AUTOMATIC = new ManualEntryMode("AUTOMATIC", 0, "automatic");

    @SerialName("custom")
    public static final ManualEntryMode CUSTOM = new ManualEntryMode("CUSTOM", 1, "custom");

    @SerialName("unknown")
    public static final ManualEntryMode UNKNOWN = new ManualEntryMode("UNKNOWN", 2, "unknown");

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/model/ManualEntryMode$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/ManualEntryMode;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer serializer() {
            return Serializer.INSTANCE;
        }
    }

    public final class Serializer extends EnumIgnoreUnknownSerializer {
        public static final Serializer INSTANCE = new Serializer((Enum[]) ManualEntryMode.getEntries().toArray(new ManualEntryMode[0]), ManualEntryMode.UNKNOWN);
    }

    private static final /* synthetic */ ManualEntryMode[] $values() {
        return new ManualEntryMode[]{AUTOMATIC, CUSTOM, UNKNOWN};
    }

    static {
        ManualEntryMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion();
    }

    private ManualEntryMode(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ManualEntryMode valueOf(String str) {
        return (ManualEntryMode) Enum.valueOf(ManualEntryMode.class, str);
    }

    public static ManualEntryMode[] values() {
        return (ManualEntryMode[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
