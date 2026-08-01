package v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final u f9886d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u[] f9887e;

    static {
        u uVar = new u("Default", 0);
        f9886d = uVar;
        f9887e = new u[]{uVar, new u("UserInput", 1), new u("PreventUserInput", 2)};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f9887e.clone();
    }
}
