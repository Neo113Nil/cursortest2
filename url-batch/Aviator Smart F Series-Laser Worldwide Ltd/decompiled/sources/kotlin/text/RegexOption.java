package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class RegexOption implements f {
    private static final /* synthetic */ a6.a $ENTRIES;
    private static final /* synthetic */ RegexOption[] $VALUES;
    public static final RegexOption CANON_EQ;
    public static final RegexOption COMMENTS;
    public static final RegexOption DOT_MATCHES_ALL;
    public static final RegexOption IGNORE_CASE;
    public static final RegexOption LITERAL;
    public static final RegexOption MULTILINE;
    public static final RegexOption UNIX_LINES;
    private final int mask;
    private final int value;

    private static final /* synthetic */ RegexOption[] $values() {
        return new RegexOption[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    static {
        int i8 = 2;
        IGNORE_CASE = new RegexOption("IGNORE_CASE", 0, i8, 0, 2, null);
        int i9 = 0;
        int i10 = 2;
        kotlin.jvm.internal.o oVar = null;
        MULTILINE = new RegexOption("MULTILINE", 1, 8, i9, i10, oVar);
        int i11 = 0;
        int i12 = 2;
        kotlin.jvm.internal.o oVar2 = null;
        LITERAL = new RegexOption("LITERAL", i8, 16, i11, i12, oVar2);
        UNIX_LINES = new RegexOption("UNIX_LINES", 3, 1, i9, i10, oVar);
        COMMENTS = new RegexOption("COMMENTS", 4, 4, i11, i12, oVar2);
        DOT_MATCHES_ALL = new RegexOption("DOT_MATCHES_ALL", 5, 32, i9, i10, oVar);
        CANON_EQ = new RegexOption("CANON_EQ", 6, 128, i11, i12, oVar2);
        RegexOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.enumEntries($values);
    }

    private RegexOption(String str, int i8, int i9, int i10) {
        this.value = i9;
        this.mask = i10;
    }

    public static a6.a getEntries() {
        return $ENTRIES;
    }

    public static RegexOption valueOf(String str) {
        return (RegexOption) Enum.valueOf(RegexOption.class, str);
    }

    public static RegexOption[] values() {
        return (RegexOption[]) $VALUES.clone();
    }

    @Override // kotlin.text.f
    public int getMask() {
        return this.mask;
    }

    @Override // kotlin.text.f
    public int getValue() {
        return this.value;
    }

    /* synthetic */ RegexOption(String str, int i8, int i9, int i10, int i11, kotlin.jvm.internal.o oVar) {
        this(str, i8, i9, (i11 & 2) != 0 ? i9 : i10);
    }
}
