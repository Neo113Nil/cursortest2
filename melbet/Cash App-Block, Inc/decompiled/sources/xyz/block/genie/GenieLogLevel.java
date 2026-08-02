package xyz.block.genie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class GenieLogLevel {
    public static final /* synthetic */ GenieLogLevel[] $VALUES;
    public static final GenieLogLevel ERROR;
    public static final GenieLogLevel WARNING;

    /* JADX INFO: Fake field, exist only in values array */
    GenieLogLevel EF0;

    static {
        GenieLogLevel genieLogLevel = new GenieLogLevel("DEBUG", 0);
        GenieLogLevel genieLogLevel2 = new GenieLogLevel("INFO", 1);
        GenieLogLevel genieLogLevel3 = new GenieLogLevel("WARNING", 2);
        WARNING = genieLogLevel3;
        GenieLogLevel genieLogLevel4 = new GenieLogLevel("ERROR", 3);
        ERROR = genieLogLevel4;
        $VALUES = new GenieLogLevel[]{genieLogLevel, genieLogLevel2, genieLogLevel3, genieLogLevel4};
    }

    public static GenieLogLevel valueOf(String str) {
        return (GenieLogLevel) Enum.valueOf(GenieLogLevel.class, str);
    }

    public static GenieLogLevel[] values() {
        return (GenieLogLevel[]) $VALUES.clone();
    }
}
