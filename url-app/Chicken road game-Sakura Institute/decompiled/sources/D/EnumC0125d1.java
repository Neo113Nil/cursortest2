package D;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: D.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0125d1 {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0125d1 f1743d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0125d1 f1744e;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0125d1 f1745i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC0125d1 f1746j;

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC0125d1 f1747k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ EnumC0125d1[] f1748l;

    static {
        EnumC0125d1 enumC0125d1 = new EnumC0125d1("TopBar", 0);
        f1743d = enumC0125d1;
        EnumC0125d1 enumC0125d12 = new EnumC0125d1("MainContent", 1);
        f1744e = enumC0125d12;
        EnumC0125d1 enumC0125d13 = new EnumC0125d1("Snackbar", 2);
        f1745i = enumC0125d13;
        EnumC0125d1 enumC0125d14 = new EnumC0125d1("Fab", 3);
        f1746j = enumC0125d14;
        EnumC0125d1 enumC0125d15 = new EnumC0125d1("BottomBar", 4);
        f1747k = enumC0125d15;
        f1748l = new EnumC0125d1[]{enumC0125d1, enumC0125d12, enumC0125d13, enumC0125d14, enumC0125d15};
    }

    public static EnumC0125d1 valueOf(String str) {
        return (EnumC0125d1) Enum.valueOf(EnumC0125d1.class, str);
    }

    public static EnumC0125d1[] values() {
        return (EnumC0125d1[]) f1748l.clone();
    }
}
