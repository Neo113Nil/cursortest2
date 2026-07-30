package androidx.fragment.app;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: d, reason: collision with root package name */
    public static final e0 f3723d;

    /* renamed from: e, reason: collision with root package name */
    public static final e0 f3724e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ e0[] f3725i;

    /* JADX INFO: Fake field, exist only in values array */
    e0 EF0;

    static {
        e0 e0Var = new e0("NONE", 0);
        e0 e0Var2 = new e0("ADDING", 1);
        f3723d = e0Var2;
        e0 e0Var3 = new e0("REMOVING", 2);
        f3724e = e0Var3;
        f3725i = new e0[]{e0Var, e0Var2, e0Var3};
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f3725i.clone();
    }
}
