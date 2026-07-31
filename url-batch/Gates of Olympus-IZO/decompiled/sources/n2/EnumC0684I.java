package n2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n2.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0684I {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0684I f6298d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0684I f6299e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0684I f6300f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0684I[] f6301g;

    static {
        EnumC0684I enumC0684I = new EnumC0684I("START", 0);
        f6298d = enumC0684I;
        EnumC0684I enumC0684I2 = new EnumC0684I("STOP", 1);
        f6299e = enumC0684I2;
        EnumC0684I enumC0684I3 = new EnumC0684I("STOP_AND_RESET_REPLAY_CACHE", 2);
        f6300f = enumC0684I3;
        EnumC0684I[] enumC0684IArr = {enumC0684I, enumC0684I2, enumC0684I3};
        f6301g = enumC0684IArr;
        M1.B.x(enumC0684IArr);
    }

    public static EnumC0684I valueOf(String str) {
        return (EnumC0684I) Enum.valueOf(EnumC0684I.class, str);
    }

    public static EnumC0684I[] values() {
        return (EnumC0684I[]) f6301g.clone();
    }
}
