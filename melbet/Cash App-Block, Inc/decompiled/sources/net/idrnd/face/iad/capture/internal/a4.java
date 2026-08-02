package net.idrnd.face.iad.capture.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class a4 {
    public static final a4 a;
    public static final a4 b;
    public static final a4 c;
    public static final a4 d;
    public static final a4 e;
    public static final a4 f;
    public static final a4 g;
    public static final a4 h;
    public static final /* synthetic */ a4[] i;

    static {
        a4 a4Var = new a4("RootManagementAppsFound", 0);
        a = a4Var;
        a4 a4Var2 = new a4("PotentiallyDangerousAppsFound", 1);
        b = a4Var2;
        a4 a4Var3 = new a4("BinarySuFound", 2);
        c = a4Var3;
        a4 a4Var4 = new a4("ExecutableSuFound", 3);
        d = a4Var4;
        a4 a4Var5 = new a4("ExecutableSuFoundByNativeCall", 4);
        e = a4Var5;
        a4 a4Var6 = new a4("PathsThatShouldNotBeWritableFound", 5);
        f = a4Var6;
        a4 a4Var7 = new a4("TestKeysFound", 6);
        g = a4Var7;
        a4 a4Var8 = new a4("MagiskBinaryFound", 7);
        h = a4Var8;
        i = new a4[]{a4Var, a4Var2, a4Var3, a4Var4, a4Var5, a4Var6, a4Var7, a4Var8};
    }

    public static a4 valueOf(String str) {
        return (a4) Enum.valueOf(a4.class, str);
    }

    public static a4[] values() {
        return (a4[]) i.clone();
    }
}
