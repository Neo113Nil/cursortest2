package com.luckyarcade.spinthrow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Difficulty {
    private static final /* synthetic */ Q0.a $ENTRIES;
    private static final /* synthetic */ Difficulty[] $VALUES;
    public static final Difficulty EASY = new Difficulty("EASY", 0);
    public static final Difficulty MEDIUM = new Difficulty("MEDIUM", 1);
    public static final Difficulty HARD = new Difficulty("HARD", 2);

    private static final /* synthetic */ Difficulty[] $values() {
        return new Difficulty[]{EASY, MEDIUM, HARD};
    }

    static {
        Difficulty[] $values = $values();
        $VALUES = $values;
        X0.f.e($values, "entries");
        $ENTRIES = new Q0.b($values);
    }

    private Difficulty(String str, int i) {
    }

    public static Q0.a getEntries() {
        return $ENTRIES;
    }

    public static Difficulty valueOf(String str) {
        return (Difficulty) Enum.valueOf(Difficulty.class, str);
    }

    public static Difficulty[] values() {
        return (Difficulty[]) $VALUES.clone();
    }
}
