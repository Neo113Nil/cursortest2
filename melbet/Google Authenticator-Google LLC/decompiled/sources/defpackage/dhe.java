package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dhe {
    public static final dhe a;
    public static final dhe b;
    public static final dhe c;
    private static final /* synthetic */ dhe[] d;

    static {
        dhe dheVar = new dhe("LOG_ERROR", 0);
        a = dheVar;
        dhe dheVar2 = new dhe("REPORT_STRICT_MODE_VIOLATION", 1);
        b = dheVar2;
        dhe dheVar3 = new dhe("CRASH_APP", 2);
        c = dheVar3;
        d = new dhe[]{dheVar, dheVar2, dheVar3};
    }

    public static dhe[] values() {
        return (dhe[]) d.clone();
    }
}
