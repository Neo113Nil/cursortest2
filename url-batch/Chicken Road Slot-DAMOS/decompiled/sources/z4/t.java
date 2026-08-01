package z4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final t f10830d;

    /* renamed from: e, reason: collision with root package name */
    public static final t f10831e;

    /* renamed from: i, reason: collision with root package name */
    public static final t f10832i;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ t[] f10833r;

    static {
        t tVar = new t("AUTOMATIC", 0);
        f10830d = tVar;
        t tVar2 = new t("TRUNCATE", 1);
        f10831e = tVar2;
        t tVar3 = new t("WRITE_AHEAD_LOGGING", 2);
        f10832i = tVar3;
        f10833r = new t[]{tVar, tVar2, tVar3};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f10833r.clone();
    }
}
