package P0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f708a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f709b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f710c;
    public static final /* synthetic */ n[] d;

    static {
        n nVar = new n("Success", 0);
        f708a = nVar;
        n nVar2 = new n("Empty", 1);
        f709b = nVar2;
        n nVar3 = new n("Duplicate", 2);
        f710c = nVar3;
        d = new n[]{nVar, nVar2, nVar3};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) d.clone();
    }
}
