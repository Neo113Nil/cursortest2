package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class P {

    /* renamed from: d, reason: collision with root package name */
    public static final P f7567d;

    /* renamed from: e, reason: collision with root package name */
    public static final P f7568e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ P[] f7569f;

    static {
        P p3 = new P("Vertical", 0);
        f7567d = p3;
        P p4 = new P("Horizontal", 1);
        f7568e = p4;
        f7569f = new P[]{p3, p4};
    }

    public static P valueOf(String str) {
        return (P) Enum.valueOf(P.class, str);
    }

    public static P[] values() {
        return (P[]) f7569f.clone();
    }
}
