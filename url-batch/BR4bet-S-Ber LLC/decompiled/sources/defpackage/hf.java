package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class hf {
    public static final hf f;
    public static final /* synthetic */ hf[] g;

    static {
        hf hfVar = new hf("COROUTINE_SUSPENDED", 0);
        f = hfVar;
        g = new hf[]{hfVar, new hf("UNDECIDED", 1), new hf("RESUMED", 2)};
    }

    public static hf valueOf(String str) {
        return (hf) Enum.valueOf(hf.class, str);
    }

    public static hf[] values() {
        return (hf[]) g.clone();
    }
}
