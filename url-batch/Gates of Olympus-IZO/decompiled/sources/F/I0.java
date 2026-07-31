package F;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class I0 {

    /* renamed from: d, reason: collision with root package name */
    public static final I0 f972d;

    /* renamed from: e, reason: collision with root package name */
    public static final I0 f973e;

    /* renamed from: f, reason: collision with root package name */
    public static final I0 f974f;

    /* renamed from: g, reason: collision with root package name */
    public static final I0 f975g;

    /* renamed from: h, reason: collision with root package name */
    public static final I0 f976h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ I0[] f977i;

    static {
        I0 i02 = new I0("TopBar", 0);
        f972d = i02;
        I0 i03 = new I0("MainContent", 1);
        f973e = i03;
        I0 i04 = new I0("Snackbar", 2);
        f974f = i04;
        I0 i05 = new I0("Fab", 3);
        f975g = i05;
        I0 i06 = new I0("BottomBar", 4);
        f976h = i06;
        f977i = new I0[]{i02, i03, i04, i05, i06};
    }

    public static I0 valueOf(String str) {
        return (I0) Enum.valueOf(I0.class, str);
    }

    public static I0[] values() {
        return (I0[]) f977i.clone();
    }
}
