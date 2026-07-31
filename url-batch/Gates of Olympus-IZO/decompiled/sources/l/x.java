package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final x f5514d;

    /* renamed from: e, reason: collision with root package name */
    public static final x f5515e;

    /* renamed from: f, reason: collision with root package name */
    public static final x f5516f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ x[] f5517g;

    static {
        x xVar = new x("PreEnter", 0);
        f5514d = xVar;
        x xVar2 = new x("Visible", 1);
        f5515e = xVar2;
        x xVar3 = new x("PostExit", 2);
        f5516f = xVar3;
        f5517g = new x[]{xVar, xVar2, xVar3};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f5517g.clone();
    }
}
