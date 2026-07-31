package O0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final k f3741d;

    /* renamed from: e, reason: collision with root package name */
    public static final k f3742e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k[] f3743f;

    static {
        k kVar = new k("Ltr", 0);
        f3741d = kVar;
        k kVar2 = new k("Rtl", 1);
        f3742e = kVar2;
        f3743f = new k[]{kVar, kVar2};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f3743f.clone();
    }
}
