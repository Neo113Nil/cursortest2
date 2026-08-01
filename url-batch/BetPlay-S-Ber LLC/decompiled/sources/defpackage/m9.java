package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class m9 {
    public static final m9 h;
    public static final /* synthetic */ m9[] i;
    public static final /* synthetic */ ei j;
    public final String f;
    public final String g;

    static {
        m9 m9Var = new m9("HEALTH", 0, "💊", "Health");
        h = m9Var;
        m9[] m9VarArr = {m9Var, new m9("FITNESS", 1, "💪", "Fitness"), new m9("MIND", 2, "🧠", "Mind"), new m9("PRODUCTIVITY", 3, "⚡", "Productivity"), new m9("SLEEP", 4, "😴", "Sleep"), new m9("SOCIAL", 5, "👥", "Social")};
        i = m9VarArr;
        j = new ei(m9VarArr);
    }

    public m9(String str, int i2, String str2, String str3) {
        this.f = str2;
        this.g = str3;
    }

    public static m9 valueOf(String str) {
        return (m9) Enum.valueOf(m9.class, str);
    }

    public static m9[] values() {
        return (m9[]) i.clone();
    }
}
