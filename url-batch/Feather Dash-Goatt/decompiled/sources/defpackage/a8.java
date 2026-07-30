package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class a8 {
    public static final a8 d;
    public static final a8 e;
    public static final a8 g;
    public static final a8 h;
    public static final a8 i;
    public static final a8 j;
    public static final a8 k;
    public static final /* synthetic */ a8[] l;

    static {
        a8 a8Var = new a8("Paragraph", 0);
        d = a8Var;
        a8 a8Var2 = new a8("Span", 1);
        e = a8Var2;
        a8 a8Var3 = new a8("VerbatimTts", 2);
        g = a8Var3;
        a8 a8Var4 = new a8("Url", 3);
        h = a8Var4;
        a8 a8Var5 = new a8("Link", 4);
        i = a8Var5;
        a8 a8Var6 = new a8("Clickable", 5);
        j = a8Var6;
        a8 a8Var7 = new a8("String", 6);
        k = a8Var7;
        l = new a8[]{a8Var, a8Var2, a8Var3, a8Var4, a8Var5, a8Var6, a8Var7};
    }

    public static a8 valueOf(String str) {
        return (a8) Enum.valueOf(a8.class, str);
    }

    public static a8[] values() {
        return (a8[]) l.clone();
    }
}
