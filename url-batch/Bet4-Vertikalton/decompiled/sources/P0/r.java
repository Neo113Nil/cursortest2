package P0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f717a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f718b;

    /* renamed from: c, reason: collision with root package name */
    public static final r f719c;
    public static final /* synthetic */ r[] d;

    static {
        r rVar = new r("SEA", 0);
        f717a = rVar;
        r rVar2 = new r("MOUNTAINS", 1);
        f718b = rVar2;
        r rVar3 = new r("BUSINESS", 2);
        f719c = rVar3;
        d = new r[]{rVar, rVar2, rVar3};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) d.clone();
    }
}
