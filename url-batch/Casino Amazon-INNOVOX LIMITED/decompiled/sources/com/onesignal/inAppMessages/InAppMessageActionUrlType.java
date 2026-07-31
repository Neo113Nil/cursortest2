package com.onesignal.inAppMessages;

import com.onesignal.core.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InAppMessageActionUrlType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/onesignal/inAppMessages/InAppMessageActionUrlType;", "", "text", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "IN_APP_WEBVIEW", "BROWSER", "REPLACE_CONTENT", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InAppMessageActionUrlType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InAppMessageActionUrlType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String text;
    public static final InAppMessageActionUrlType IN_APP_WEBVIEW = new InAppMessageActionUrlType("IN_APP_WEBVIEW", 0, "webview");
    public static final InAppMessageActionUrlType BROWSER = new InAppMessageActionUrlType("BROWSER", 1, "browser");
    public static final InAppMessageActionUrlType REPLACE_CONTENT = new InAppMessageActionUrlType("REPLACE_CONTENT", 2, "replacement");

    private static final /* synthetic */ InAppMessageActionUrlType[] $values() {
        return new InAppMessageActionUrlType[]{IN_APP_WEBVIEW, BROWSER, REPLACE_CONTENT};
    }

    public static EnumEntries<InAppMessageActionUrlType> getEntries() {
        return $ENTRIES;
    }

    public static InAppMessageActionUrlType valueOf(String str) {
        return (InAppMessageActionUrlType) Enum.valueOf(InAppMessageActionUrlType.class, str);
    }

    public static InAppMessageActionUrlType[] values() {
        return (InAppMessageActionUrlType[]) $VALUES.clone();
    }

    private InAppMessageActionUrlType(String str, int i, String str2) {
        this.text = str2;
    }

    static {
        InAppMessageActionUrlType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }

    /* compiled from: InAppMessageActionUrlType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/onesignal/inAppMessages/InAppMessageActionUrlType$Companion;", "", "()V", "fromString", "Lcom/onesignal/inAppMessages/InAppMessageActionUrlType;", "text", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InAppMessageActionUrlType fromString(String text) {
            for (InAppMessageActionUrlType inAppMessageActionUrlType : InAppMessageActionUrlType.values()) {
                if (StringsKt.equals(inAppMessageActionUrlType.text, text, true)) {
                    return inAppMessageActionUrlType;
                }
            }
            return null;
        }
    }
}
