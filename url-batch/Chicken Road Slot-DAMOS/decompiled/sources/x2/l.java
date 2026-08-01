package x2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final l f10330d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f10331e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ l[] f10332i;

    static {
        l lVar = new l("Ltr", 0);
        f10330d = lVar;
        l lVar2 = new l("Rtl", 1);
        f10331e = lVar2;
        f10332i = new l[]{lVar, lVar2};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f10332i.clone();
    }
}
