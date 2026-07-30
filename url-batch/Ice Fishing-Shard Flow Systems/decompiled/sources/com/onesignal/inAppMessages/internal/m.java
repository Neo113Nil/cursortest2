package com.onesignal.inAppMessages.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m {
    private final a kind;
    private final b operatorType;
    private final String property;
    private final String triggerId;
    private final Object value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Y5.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final C0038a Companion;
        private final String value;
        public static final a TIME_SINCE_LAST_IN_APP = new a("TIME_SINCE_LAST_IN_APP", 0, "min_time_since");
        public static final a SESSION_TIME = new a("SESSION_TIME", 1, "session_time");
        public static final a CUSTOM = new a("CUSTOM", 2, s3.c.PAYLOAD_OS_ROOT_CUSTOM);
        public static final a UNKNOWN = new a("UNKNOWN", 3, "unknown");

        /* renamed from: com.onesignal.inAppMessages.internal.m$a$a, reason: collision with other inner class name */
        public static final class C0038a {
            public /* synthetic */ C0038a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a fromString(String str) {
                for (a aVar : a.values()) {
                    if (p.g(aVar.value, str)) {
                        return aVar;
                    }
                }
                return a.UNKNOWN;
            }

            private C0038a() {
            }
        }

        private static final /* synthetic */ a[] $values() {
            return new a[]{TIME_SINCE_LAST_IN_APP, SESSION_TIME, CUSTOM, UNKNOWN};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = d4.c.o($values);
            Companion = new C0038a(null);
        }

        private a(String str, int i2, String str2) {
            this.value = str2;
        }

        public static Y5.a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ Y5.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final a Companion;
        private final String text;
        public static final b GREATER_THAN = new b("GREATER_THAN", 0, "greater");
        public static final b LESS_THAN = new b("LESS_THAN", 1, "less");
        public static final b EQUAL_TO = new b("EQUAL_TO", 2, "equal");
        public static final b NOT_EQUAL_TO = new b("NOT_EQUAL_TO", 3, "not_equal");
        public static final b LESS_THAN_OR_EQUAL_TO = new b("LESS_THAN_OR_EQUAL_TO", 4, "less_or_equal");
        public static final b GREATER_THAN_OR_EQUAL_TO = new b("GREATER_THAN_OR_EQUAL_TO", 5, "greater_or_equal");
        public static final b EXISTS = new b("EXISTS", 6, "exists");
        public static final b NOT_EXISTS = new b("NOT_EXISTS", 7, "not_exists");
        public static final b CONTAINS = new b("CONTAINS", 8, "in");

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b fromString(String str) {
                for (b bVar : b.values()) {
                    if (p.g(bVar.text, str)) {
                        return bVar;
                    }
                }
                return b.EQUAL_TO;
            }

            private a() {
            }
        }

        private static final /* synthetic */ b[] $values() {
            return new b[]{GREATER_THAN, LESS_THAN, EQUAL_TO, NOT_EQUAL_TO, LESS_THAN_OR_EQUAL_TO, GREATER_THAN_OR_EQUAL_TO, EXISTS, NOT_EXISTS, CONTAINS};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = d4.c.o($values);
            Companion = new a(null);
        }

        private b(String str, int i2, String str2) {
            this.text = str2;
        }

        public static Y5.a getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final boolean checksEquality() {
            return this == EQUAL_TO || this == NOT_EQUAL_TO;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.text;
        }
    }

    public m(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        String string = json.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.triggerId = string;
        this.kind = a.Companion.fromString(json.getString("kind"));
        this.property = json.optString("property", null);
        this.operatorType = b.Companion.fromString(json.getString("operator"));
        this.value = json.opt("value");
    }

    public final a getKind() {
        return this.kind;
    }

    public final b getOperatorType() {
        return this.operatorType;
    }

    public final String getProperty() {
        return this.property;
    }

    public final String getTriggerId() {
        return this.triggerId;
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
        } catch (JSONException e7) {
            e7.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return "Trigger{triggerId='" + this.triggerId + "', kind=" + this.kind + ", property='" + this.property + "', operatorType=" + this.operatorType + ", value=" + this.value + '}';
    }
}
