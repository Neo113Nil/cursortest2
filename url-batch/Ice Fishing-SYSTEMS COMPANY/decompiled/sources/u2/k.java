package u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: n, reason: collision with root package name */
    public static final k f41244n;

    /* renamed from: u, reason: collision with root package name */
    public static final k f41245u;

    /* renamed from: v, reason: collision with root package name */
    public static final k f41246v;

    /* renamed from: w, reason: collision with root package name */
    public static final k f41247w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ k[] f41248x;

    static {
        k kVar = new k("SUCCESS", 0);
        f41244n = kVar;
        k kVar2 = new k("PERMANENT_FAILURE", 1);
        f41245u = kVar2;
        k kVar3 = new k("RETRIABLE_FAILURE", 2);
        f41246v = kVar3;
        k kVar4 = new k("BUFFERED", 3);
        f41247w = kVar4;
        f41248x = new k[]{kVar, kVar2, kVar3, kVar4};
    }

    public static k[] values() {
        return (k[]) f41248x.clone();
    }
}
