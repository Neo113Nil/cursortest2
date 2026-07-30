package j5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: f, reason: collision with root package name */
    public static final j f5060f;

    /* renamed from: g, reason: collision with root package name */
    public static final j f5061g;

    /* renamed from: h, reason: collision with root package name */
    public static final j f5062h;

    /* renamed from: i, reason: collision with root package name */
    public static final j f5063i;

    /* renamed from: j, reason: collision with root package name */
    public static final j f5064j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ j[] f5065k;

    static {
        j jVar = new j("Disconnected", 0);
        f5060f = jVar;
        j jVar2 = new j("GettingToken", 1);
        f5061g = jVar2;
        j jVar3 = new j("Connecting", 2);
        f5062h = jVar3;
        j jVar4 = new j("Authenticating", 3);
        f5063i = jVar4;
        j jVar5 = new j("Connected", 4);
        f5064j = jVar5;
        f5065k = new j[]{jVar, jVar2, jVar3, jVar4, jVar5};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f5065k.clone();
    }
}
