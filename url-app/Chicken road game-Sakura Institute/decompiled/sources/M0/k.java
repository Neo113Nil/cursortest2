package M0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final k f3555d;

    /* renamed from: e, reason: collision with root package name */
    public static final k f3556e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ k[] f3557i;

    static {
        k kVar = new k("Ltr", 0);
        f3555d = kVar;
        k kVar2 = new k("Rtl", 1);
        f3556e = kVar2;
        f3557i = new k[]{kVar, kVar2};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f3557i.clone();
    }
}
