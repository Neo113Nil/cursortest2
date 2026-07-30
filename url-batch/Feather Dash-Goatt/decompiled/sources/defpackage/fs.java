package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class fs {
    public static final fs d;
    public static final fs e;
    public static final fs g;
    public static final /* synthetic */ fs[] h;

    static {
        fs fsVar = new fs("Vertical", 0);
        d = fsVar;
        fs fsVar2 = new fs("Horizontal", 1);
        e = fsVar2;
        fs fsVar3 = new fs("Both", 2);
        g = fsVar3;
        h = new fs[]{fsVar, fsVar2, fsVar3};
    }

    public static fs valueOf(String str) {
        return (fs) Enum.valueOf(fs.class, str);
    }

    public static fs[] values() {
        return (fs[]) h.clone();
    }
}
