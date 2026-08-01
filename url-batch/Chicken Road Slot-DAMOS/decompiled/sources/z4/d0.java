package z4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: d, reason: collision with root package name */
    public static final d0 f10732d;

    /* renamed from: e, reason: collision with root package name */
    public static final d0 f10733e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ d0[] f10734i;

    static {
        d0 d0Var = new d0("DEFERRED", 0);
        f10732d = d0Var;
        d0 d0Var2 = new d0("IMMEDIATE", 1);
        f10733e = d0Var2;
        f10734i = new d0[]{d0Var, d0Var2, new d0("EXCLUSIVE", 2)};
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) f10734i.clone();
    }
}
