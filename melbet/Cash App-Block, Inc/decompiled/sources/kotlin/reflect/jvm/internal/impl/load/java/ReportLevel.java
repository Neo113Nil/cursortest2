package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes9.dex */
public enum ReportLevel {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");

    public static final Companion Companion = new Object(null) { // from class: kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.Companion
    };
    public final String description;

    ReportLevel(String str) {
        this.description = str;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean isIgnore() {
        return this == IGNORE;
    }

    public final boolean isWarning() {
        return this == WARN;
    }
}
