package n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class X {

    /* renamed from: d, reason: collision with root package name */
    public static final X f6036d;

    /* renamed from: e, reason: collision with root package name */
    public static final X f6037e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ X[] f6038f;

    static {
        X x3 = new X("Default", 0);
        f6036d = x3;
        X x4 = new X("UserInput", 1);
        f6037e = x4;
        f6038f = new X[]{x3, x4, new X("PreventUserInput", 2)};
    }

    public static X valueOf(String str) {
        return (X) Enum.valueOf(X.class, str);
    }

    public static X[] values() {
        return (X[]) f6038f.clone();
    }
}
