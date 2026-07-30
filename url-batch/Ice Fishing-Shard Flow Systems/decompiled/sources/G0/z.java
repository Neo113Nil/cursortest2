package G0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: d, reason: collision with root package name */
    public static final z f838d;

    /* renamed from: e, reason: collision with root package name */
    public static final z f839e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ z[] f840i;

    static {
        z zVar = new z("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        f838d = zVar;
        z zVar2 = new z("DROP_WORK_REQUEST", 1);
        f839e = zVar2;
        f840i = new z[]{zVar, zVar2};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f840i.clone();
    }
}
