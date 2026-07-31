package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final x f6547d;

    /* renamed from: e, reason: collision with root package name */
    public static final x f6548e;

    /* renamed from: f, reason: collision with root package name */
    public static final x f6549f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ x[] f6550g;

    static {
        x xVar = new x("PreEnter", 0);
        f6547d = xVar;
        x xVar2 = new x("Visible", 1);
        f6548e = xVar2;
        x xVar3 = new x("PostExit", 2);
        f6549f = xVar3;
        f6550g = new x[]{xVar, xVar2, xVar3};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f6550g.clone();
    }
}
