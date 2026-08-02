package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
final class gur {
    public static final gur a;
    public static final gur b;
    public static final gur c;
    private static final /* synthetic */ gur[] d;

    static {
        gur gurVar = new gur("DISABLED", 0);
        a = gurVar;
        gur gurVar2 = new gur("THROW_ON_FAILURE", 1);
        b = gurVar2;
        gur gurVar3 = new gur("LOG_ON_FAILURE", 2);
        c = gurVar3;
        d = new gur[]{gurVar, gurVar2, gurVar3};
    }

    public static gur[] values() {
        return (gur[]) d.clone();
    }
}
