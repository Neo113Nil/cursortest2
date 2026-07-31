package u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final q f7347d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ q[] f7348e;

    static {
        q qVar = new q("Inherit", 0);
        f7347d = qVar;
        f7348e = new q[]{qVar, new q("SecureOn", 1), new q("SecureOff", 2)};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f7348e.clone();
    }
}
