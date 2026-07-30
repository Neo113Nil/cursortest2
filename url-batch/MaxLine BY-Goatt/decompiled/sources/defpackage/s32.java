package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class s32 {
    public static final s32 m;
    public static final s32 n;
    public static final s32 o;
    public static final /* synthetic */ s32[] p;

    static {
        s32 s32Var = new s32("EXACT", 0);
        m = s32Var;
        s32 s32Var2 = new s32("INEXACT", 1);
        n = s32Var2;
        s32 s32Var3 = new s32("AUTOMATIC", 2);
        o = s32Var3;
        p = new s32[]{s32Var, s32Var2, s32Var3};
    }

    public static s32 valueOf(String str) {
        return (s32) Enum.valueOf(s32.class, str);
    }

    public static s32[] values() {
        return (s32[]) p.clone();
    }
}
