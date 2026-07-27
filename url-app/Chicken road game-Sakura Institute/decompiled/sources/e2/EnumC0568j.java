package e2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0568j {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0568j f6191d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0568j f6192e;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0568j f6193i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC0568j f6194j;

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC0568j f6195k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ EnumC0568j[] f6196l;

    static {
        EnumC0568j enumC0568j = new EnumC0568j("Disconnected", 0);
        f6191d = enumC0568j;
        EnumC0568j enumC0568j2 = new EnumC0568j("GettingToken", 1);
        f6192e = enumC0568j2;
        EnumC0568j enumC0568j3 = new EnumC0568j("Connecting", 2);
        f6193i = enumC0568j3;
        EnumC0568j enumC0568j4 = new EnumC0568j("Authenticating", 3);
        f6194j = enumC0568j4;
        EnumC0568j enumC0568j5 = new EnumC0568j("Connected", 4);
        f6195k = enumC0568j5;
        f6196l = new EnumC0568j[]{enumC0568j, enumC0568j2, enumC0568j3, enumC0568j4, enumC0568j5};
    }

    public static EnumC0568j valueOf(String str) {
        return (EnumC0568j) Enum.valueOf(EnumC0568j.class, str);
    }

    public static EnumC0568j[] values() {
        return (EnumC0568j[]) f6196l.clone();
    }
}
