package D;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class J1 {

    /* renamed from: d, reason: collision with root package name */
    public static final J1 f1352d;

    /* renamed from: e, reason: collision with root package name */
    public static final J1 f1353e;

    /* renamed from: i, reason: collision with root package name */
    public static final J1 f1354i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ J1[] f1355j;

    static {
        J1 j12 = new J1("Tabs", 0);
        f1352d = j12;
        J1 j13 = new J1("Divider", 1);
        f1353e = j13;
        J1 j14 = new J1("Indicator", 2);
        f1354i = j14;
        f1355j = new J1[]{j12, j13, j14};
    }

    public static J1 valueOf(String str) {
        return (J1) Enum.valueOf(J1.class, str);
    }

    public static J1[] values() {
        return (J1[]) f1355j.clone();
    }
}
