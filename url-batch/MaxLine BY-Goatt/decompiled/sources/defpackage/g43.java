package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class g43 {
    public static final g43 m;
    public static final /* synthetic */ g43[] n;

    static {
        g43 g43Var = new g43("Lsq2", 0);
        m = g43Var;
        n = new g43[]{g43Var, new g43("Impulse", 1)};
    }

    public static g43 valueOf(String str) {
        return (g43) Enum.valueOf(g43.class, str);
    }

    public static g43[] values() {
        return (g43[]) n.clone();
    }
}
