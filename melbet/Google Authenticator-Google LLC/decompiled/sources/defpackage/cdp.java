package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdp {
    public static final cdp a;
    public static final cdp b;
    private static final /* synthetic */ cdp[] c;

    static {
        cdp cdpVar = new cdp("UNKNOWN", 0);
        a = cdpVar;
        cdp cdpVar2 = new cdp("ANDROID_FIREBASE", 1);
        b = cdpVar2;
        c = new cdp[]{cdpVar, cdpVar2};
    }

    public static cdp[] values() {
        return (cdp[]) c.clone();
    }
}
