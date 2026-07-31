package x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final u f8295d;

    /* renamed from: e, reason: collision with root package name */
    public static final u f8296e;

    /* renamed from: f, reason: collision with root package name */
    public static final u f8297f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ u[] f8298g;

    static {
        u uVar = new u("Vertical", 0);
        f8295d = uVar;
        u uVar2 = new u("Horizontal", 1);
        f8296e = uVar2;
        u uVar3 = new u("Both", 2);
        f8297f = uVar3;
        f8298g = new u[]{uVar, uVar2, uVar3};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f8298g.clone();
    }
}
