package net.idrnd.face.iad.capture.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class g4 {
    public static final g4 a;
    public static final g4 b;
    public static final g4 c;
    public static final g4 d;
    public static final g4 e;
    public static final /* synthetic */ g4[] f;

    static {
        g4 g4Var = new g4("HackEnvironmentVariablesOrPreloadsFound", 0);
        a = g4Var;
        g4 g4Var2 = new g4("ImageTimestampIsNotFromCurrentCaptureSession", 1);
        g4 g4Var3 = new g4("SandboxPathsFound", 2);
        b = g4Var3;
        g4 g4Var4 = new g4("SandboxSharedObjectsFound", 3);
        c = g4Var4;
        g4 g4Var5 = new g4("LibraryIntegrityBroken", 4);
        d = g4Var5;
        g4 g4Var6 = new g4("FridaFound", 5);
        e = g4Var6;
        f = new g4[]{g4Var, g4Var2, g4Var3, g4Var4, g4Var5, g4Var6};
    }

    public static g4 valueOf(String str) {
        return (g4) Enum.valueOf(g4.class, str);
    }

    public static g4[] values() {
        return (g4[]) f.clone();
    }
}
