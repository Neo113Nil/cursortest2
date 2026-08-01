package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class kf {
    public static final kf f;
    public static final /* synthetic */ kf[] g;

    static {
        kf kfVar = new kf("DEFAULT", 0);
        f = kfVar;
        g = new kf[]{kfVar, new kf("LAZY", 1), new kf("ATOMIC", 2), new kf("UNDISPATCHED", 3)};
    }

    public static kf valueOf(String str) {
        return (kf) Enum.valueOf(kf.class, str);
    }

    public static kf[] values() {
        return (kf[]) g.clone();
    }
}
