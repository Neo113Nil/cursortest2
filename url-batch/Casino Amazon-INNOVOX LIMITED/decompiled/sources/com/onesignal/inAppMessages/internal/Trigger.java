package com.onesignal.inAppMessages.internal;

import com.onesignal.notifications.internal.common.NotificationFormatHelper;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Trigger.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0016\u001a\u00020\u0003J\b\u0010\u0017\u001a\u00020\u000eH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/onesignal/inAppMessages/internal/Trigger;", "", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "kind", "Lcom/onesignal/inAppMessages/internal/Trigger$OSTriggerKind;", "getKind", "()Lcom/onesignal/inAppMessages/internal/Trigger$OSTriggerKind;", "operatorType", "Lcom/onesignal/inAppMessages/internal/Trigger$OSTriggerOperator;", "getOperatorType", "()Lcom/onesignal/inAppMessages/internal/Trigger$OSTriggerOperator;", "property", "", "getProperty", "()Ljava/lang/String;", "triggerId", "getTriggerId", "value", "getValue", "()Ljava/lang/Object;", "toJSONObject", "toString", "OSTriggerKind", "OSTriggerOperator", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Trigger {
    private final OSTriggerKind kind;
    private final OSTriggerOperator operatorType;
    private final String property;
    private final String triggerId;
    private final Object value;

    public Trigger(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        String string = json.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.triggerId = string;
        this.kind = OSTriggerKind.INSTANCE.fromString(json.getString("kind"));
        this.property = json.optString("property", null);
        this.operatorType = OSTriggerOperator.INSTANCE.fromString(json.getString("operator"));
        this.value = json.opt("value");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Trigger.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/onesignal/inAppMessages/internal/Trigger$OSTriggerOperator;", "", "text", "", "(Ljava/lang/String;ILjava/lang/String;)V", "checksEquality", "", "toString", "GREATER_THAN", "LESS_THAN", "EQUAL_TO", "NOT_EQUAL_TO", "LESS_THAN_OR_EQUAL_TO", "GREATER_THAN_OR_EQUAL_TO", "EXISTS", "NOT_EXISTS", "CONTAINS", "Companion", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OSTriggerOperator {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OSTriggerOperator[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String text;
        public static final OSTriggerOperator GREATER_THAN = new OSTriggerOperator("GREATER_THAN", 0, "greater");
        public static final OSTriggerOperator LESS_THAN = new OSTriggerOperator("LESS_THAN", 1, "less");
        public static final OSTriggerOperator EQUAL_TO = new OSTriggerOperator("EQUAL_TO", 2, "equal");
        public static final OSTriggerOperator NOT_EQUAL_TO = new OSTriggerOperator("NOT_EQUAL_TO", 3, "not_equal");
        public static final OSTriggerOperator LESS_THAN_OR_EQUAL_TO = new OSTriggerOperator("LESS_THAN_OR_EQUAL_TO", 4, "less_or_equal");
        public static final OSTriggerOperator GREATER_THAN_OR_EQUAL_TO = new OSTriggerOperator("GREATER_THAN_OR_EQUAL_TO", 5, "greater_or_equal");
        public static final OSTriggerOperator EXISTS = new OSTriggerOperator("EXISTS", 6, "exists");
        public static final OSTriggerOperator NOT_EXISTS = new OSTriggerOperator("NOT_EXISTS", 7, "not_exists");
        public static final OSTriggerOperator CONTAINS = new OSTriggerOperator("CONTAINS", 8, "in");

        private static final /* synthetic */ OSTriggerOperator[] $values() {
            return new OSTriggerOperator[]{GREATER_THAN, LESS_THAN, EQUAL_TO, NOT_EQUAL_TO, LESS_THAN_OR_EQUAL_TO, GREATER_THAN_OR_EQUAL_TO, EXISTS, NOT_EXISTS, CONTAINS};
        }

        public static EnumEntries<OSTriggerOperator> getEntries() {
            return $ENTRIES;
        }

        public static OSTriggerOperator valueOf(String str) {
            return (OSTriggerOperator) Enum.valueOf(OSTriggerOperator.class, str);
        }

        public static OSTriggerOperator[] values() {
            return (OSTriggerOperator[]) $VALUES.clone();
        }

        private OSTriggerOperator(String str, int i, String str2) {
            this.text = str2;
        }

        static {
            OSTriggerOperator[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            INSTANCE = new Companion(null);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.text;
        }

        public final boolean checksEquality() {
            return this == EQUAL_TO || this == NOT_EQUAL_TO;
        }

        /* compiled from: Trigger.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/onesignal/inAppMessages/internal/Trigger$OSTriggerOperator$Companion;", "", "()V", "fromString", "Lcom/onesignal/inAppMessages/internal/Trigger$OSTriggerOperator;", "text", "", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final OSTriggerOperator fromString(String text) {
                for (OSTriggerOperator oSTriggerOperator : OSTriggerOperator.values()) {
                    if (StringsKt.equals(oSTriggerOperator.text, text, true)) {
                        return oSTriggerOperator;
                    }
                }
                return OSTriggerOperator.EQUAL_TO;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Trigger.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/onesignal/inAppMessages/internal/Trigger$OSTriggerKind;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "TIME_SINCE_LAST_IN_APP", "SESSION_TIME", "CUSTOM", "UNKNOWN", "Companion", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OSTriggerKind {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OSTriggerKind[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;
        public static final OSTriggerKind TIME_SINCE_LAST_IN_APP = new OSTriggerKind("TIME_SINCE_LAST_IN_APP", 0, "min_time_since");
        public static final OSTriggerKind SESSION_TIME = new OSTriggerKind("SESSION_TIME", 1, "session_time");
        public static final OSTriggerKind CUSTOM = new OSTriggerKind("CUSTOM", 2, NotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM);
        public static final OSTriggerKind UNKNOWN = new OSTriggerKind("UNKNOWN", 3, "unknown");

        private static final /* synthetic */ OSTriggerKind[] $values() {
            return new OSTriggerKind[]{TIME_SINCE_LAST_IN_APP, SESSION_TIME, CUSTOM, UNKNOWN};
        }

        public static EnumEntries<OSTriggerKind> getEntries() {
            return $ENTRIES;
        }

        public static OSTriggerKind valueOf(String str) {
            return (OSTriggerKind) Enum.valueOf(OSTriggerKind.class, str);
        }

        public static OSTriggerKind[] values() {
            return (OSTriggerKind[]) $VALUES.clone();
        }

        private OSTriggerKind(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            OSTriggerKind[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            INSTANCE = new Companion(null);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }

        /* compiled from: Trigger.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/onesignal/inAppMessages/internal/Trigger$OSTriggerKind$Companion;", "", "()V", "fromString", "Lcom/onesignal/inAppMessages/internal/Trigger$OSTriggerKind;", "value", "", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final OSTriggerKind fromString(String value) {
                for (OSTriggerKind oSTriggerKind : OSTriggerKind.values()) {
                    if (StringsKt.equals(oSTriggerKind.value, value, true)) {
                        return oSTriggerKind;
                    }
                }
                return OSTriggerKind.UNKNOWN;
            }
        }
    }

    public final String getTriggerId() {
        return this.triggerId;
    }

    public final OSTriggerKind getKind() {
        return this.kind;
    }

    public final String getProperty() {
        return this.property;
    }

    public final OSTriggerOperator getOperatorType() {
        return this.operatorType;
    }

    public final Object getValue() {
        return this.value;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.triggerId);
            jSONObject.put("kind", this.kind);
            jSONObject.put("property", this.property);
            jSONObject.put("operator", this.operatorType.toString());
            jSONObject.put("value", this.value);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return "Trigger{triggerId='" + this.triggerId + "', kind=" + this.kind + ", property='" + this.property + "', operatorType=" + this.operatorType + ", value=" + this.value + AbstractJsonLexerKt.END_OBJ;
    }
}
